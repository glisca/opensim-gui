/*
 *
 * ExperimentalDataTopNode
 * Author(s): Ayman Habib
 * Copyright (c)  2005-2006, Stanford University, Ayman Habib
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

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import org.openide.nodes.Node;
import org.openide.util.NbBundle;
import org.opensim.modeling.Model;
import org.opensim.view.motions.MotionEvent;
import org.opensim.view.motions.MotionsDB;
import org.opensim.view.nodes.*;

/**
 *
 * @author Ayman Habib
 *
 * Top level external(=experimental) data node in Navigator view. 
 * This node implements Observer so that it can make the motion underneath it uncurrent
 */
public class ExperimentalDataTopNode extends ConcreteModelNode implements Observer {
   
   private static ResourceBundle bundle = NbBundle.getBundle(ExperimentalDataTopNode.class);
   
   /** Creates a new instance of MotionsNode */
   public ExperimentalDataTopNode(Model m) {
       super(m);
       String nodeName=bundle.getString("EXPERIMENTALDATA_NODE_ID");
       setDisplayName(nodeName);
       setName(nodeName); // To be used by findNode();
       MotionsDB.getInstance().addObserver(this);
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

    public static ResourceBundle getBundle() {
        return bundle;
    }

    public static void setBundle(ResourceBundle aBundle) {
        bundle = aBundle;
    }

   public void update(Observable o, Object arg) {
      if (o instanceof MotionsDB && arg instanceof MotionEvent) {
         // No matter what set the names of the naodes so that the explorer view is updated 
         // with what's current in bold'
         Node[] nodes = this.getChildren().getNodes();
         for(int i=0; i< nodes.length; i++){
            nodes[i].setName(nodes[i].getName());
         }
      }
   }

    public void destroy() throws IOException {
        MotionsDB.getInstance().deleteObserver(this);
        super.destroy();
    }

}
