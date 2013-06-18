/*
 * ExperimentalForceSetNode.java
 *
 * Created on March 10, 2009, 10:56 AM
 *
 *
 *
 * Copyright (c)  2009, Stanford University and Ayman Habib. All rights reserved.
 * Use of the OpenSim software in source form is permitted provided that the following
 * conditions are met:
 * 	1. The software is used only for non-commercial research and education. It may not
 *     be used in relation to any commercial activity.
 * 	2. The software is not distributed or redistributed.  Software distribution is allowed
 *     only through https://simtk.org/home/opensim.
 * 	3. Use of the OpenSim software or derivatives must be acknowledged in all publications,
 *      presentations, or documents describing work in which OpenSim or derivatives are used.
 * 	4. Credits to developers may not be removed from executables
 *     created from modifications of the source.
 * 	5. Modifications of source code must retain the above copyright notice, this list of
 *     conditions and the following disclaimer.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 *  EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 *  SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 *  TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 *  HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 *  OR BUSINESS INTERRUPTION) OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 *  WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.opensim.view.experimentaldata;

import java.awt.Color;
import java.awt.Image;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import org.openide.nodes.Node;
import org.openide.nodes.PropertySupport;
import org.openide.nodes.Sheet;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;
import org.opensim.view.ExplorerTopComponent;
import org.opensim.view.OpenSimvtkGlyphCloud;
import org.opensim.view.nodes.*;
import org.opensim.view.pub.ViewDB;

/**
 *
 * @author ayman
 */
public class ExperimentalForceSetNode extends OpenSimNode {
    private static ResourceBundle bundle = NbBundle.getBundle(ExperimentalForceSetNode.class);
    private static String nodeName;
    AnnotatedMotion dMotion;
    private OpenSimvtkGlyphCloud forcesDisplayer;
    /** Creates a new instance of ExperimentalForceNode */
    public ExperimentalForceSetNode(AnnotatedMotion dMotion) {
        nodeName=bundle.getString("ForceSet_NODE_NAME");
        setName(nodeName);
        setDisplayName(nodeName);
        setShortDescription(bundle.getString("HINT_ExperimentalForceSetNode"));
        this.dMotion=dMotion;
        //forcesDisplayer = dMotion.getMotionDisplayer().getGroundForcesRep();
        createChildren();
    }
    
    public String getHtmlDisplayName() {
        
        return nodeName;
    }
   /**
    * Icon for the node, same as OpenSimNode
    **/
   public Image getIcon(int i) {
      URL imageURL=null;
      try {
         imageURL = Class.forName("org.opensim.view.nodes.OpenSimNode").getResource("/org/opensim/view/nodes/icons/motionsNode.png");
      } catch (ClassNotFoundException ex) {
         ex.printStackTrace();
      }
      if (imageURL != null) {
         return new ImageIcon(imageURL, "").getImage();
      } else {
         return null;
      }
   }
   
   public Image getOpenedIcon(int i) {
      URL imageURL=null;
      try {
         imageURL = Class.forName("org.opensim.view.nodes.OpenSimNode").getResource("/org/opensim/view/nodes/icons/motionsNode.png");
      } catch (ClassNotFoundException ex) {
         ex.printStackTrace();
      }
      if (imageURL != null) {
         return new ImageIcon(imageURL, "").getImage();
      } else {
         return null;
      }
   }

    private void createChildren() {
        Vector<ExperimentalDataObject> allMotionObjects = dMotion.getClassified();
        // Create an ExperimentalForceNode for each 
        if (allMotionObjects==null) return;
        for(ExperimentalDataObject dObject:allMotionObjects){
            if (dObject.getObjectType()==ExperimentalDataItemType.PointForceData ||
                dObject.getObjectType()==ExperimentalDataItemType.BodyForceData
                    ){
                getChildren().add(new Node[]{new ExperimentalForceNode(dObject, dMotion)});
            }
        }
    }
   @Override
    public Sheet createSheet() {
         Sheet defaultSheet = super.createSheet();
        try {
            Sheet.Set set = defaultSheet.get(Sheet.PROPERTIES);
            PropertySupport.Reflection nextNodeProp = new PropertySupport.Reflection(this, Color.class, "getColor", "setColorUI");
            nextNodeProp.setName("force color");
            set.put(nextNodeProp);

            PropertySupport.Reflection nextNodeProp2= new PropertySupport.Reflection(this, double.class, "getForceScaleFactor", "setForceScaleFactorUI");
            nextNodeProp2.setName("force size");
            set.put(nextNodeProp2);

            return defaultSheet;
        } catch (NoSuchMethodException ex) {
            Exceptions.printStackTrace(ex);
        }
        return defaultSheet;
    }
    void setColorUI(final Color color, boolean allowUndo) {
        final Color oldColor = getColor();
        if (allowUndo){
            AbstractUndoableEdit auEdit = new AbstractUndoableEdit(){
                @Override
               public void undo() throws CannotUndoException {
                   super.undo();
                   setColorUI(oldColor, false);
               }
                @Override
               public void redo() throws CannotRedoException {
                   super.redo();
                   setColorUI(color, true);
               }
            };
            ExplorerTopComponent.addUndoableEdit(auEdit);
        }
        forcesDisplayer.setColor(color);
        ViewDB.repaintAll();
        refreshNode();
    }
    public void setColorUI(final Color color) {
        setColorUI(color, true);
    }
    
    public Color getColor()
    {
        if (forcesDisplayer==null)
            forcesDisplayer = dMotion.getMotionDisplayer().getGroundForcesRep();
        return forcesDisplayer.getColor();
    }
   
    public void setForceScaleFactorUI(double newFactor) {
        setForceScaleFactorUI(newFactor, true);
    }
    
    void setForceScaleFactorUI(final double newFactor, boolean allowUndo)
    {
        final double oldForceScaleFactor = getForceScaleFactor();
        if (allowUndo){
            AbstractUndoableEdit auEdit = new AbstractUndoableEdit(){
               @Override
               public void undo() throws CannotUndoException {
                   super.undo();
                   setForceScaleFactorUI(oldForceScaleFactor, false);
               }
               @Override
               public void redo() throws CannotRedoException {
                   super.redo();
                   setForceScaleFactorUI(newFactor, true);
               }
            };
            ExplorerTopComponent.addUndoableEdit(auEdit);
        }       
        forcesDisplayer.setScaleFactor(newFactor);
        ViewDB.repaintAll();
        refreshNode();
    }

    public double getForceScaleFactor()
    {
        if (forcesDisplayer==null)
            forcesDisplayer = dMotion.getMotionDisplayer().getGroundForcesRep();
        return forcesDisplayer.getScaleFactor();
    }

}
