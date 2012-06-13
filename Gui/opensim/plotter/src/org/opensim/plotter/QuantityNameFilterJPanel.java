/*
 * Copyright (c)  2005-2008, Stanford University
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
/*
 * PlotterQuantityNameFilterJPanel.java Filtering dialog for Quantity name  invoked by Plotter
 *
 * Created on April 30, 2007, 1:14 PM
 */

package org.opensim.plotter;

import java.util.ArrayList;
import java.util.Vector;
import java.util.regex.PatternSyntaxException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumn;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.opensim.modeling.ForceSet;
import org.opensim.modeling.ArrayObjPtr;
import org.opensim.modeling.Model;
import org.opensim.modeling.ObjectGroup;
import org.opensim.view.pub.OpenSimDB;
import org.opensim.view.pub.ViewDB;

/**
 *
 * @author  Ayman
 *
 * Important: This class and PlotterQuantityNameFilterJPanel are almost identical
 * and will be merged.
 */

public class QuantityNameFilterJPanel extends javax.swing.JPanel 
                                            implements TableModelListener,
                                                       DocumentListener
{
   
   private QuantityNameFilterTableModel tableModel;
   public enum FilterBy {RegularExpression, ModelGroup};
   private static FilterBy currentFilter = FilterBy.RegularExpression;
   private String   pattern="";
   private Model currentModel=null;
   ArrayList<String> metaCharacters=new ArrayList<String>();
   private boolean sumOnly=false;
   
   public QuantityNameFilterJPanel(String[] availableNames, String preSelected) {
       this(availableNames);
       String[] preSelectedList = preSelected.split(",|\\+");
       Vector<String> selectedVec = new Vector<String>();
       for(int i=0; i<preSelectedList.length; i++){
           String trimmed=preSelectedList[i].trim();
           selectedVec.add(trimmed);
       }
       tableModel.markSelectedNames(selectedVec);
        if (currentFilter.equals(FilterBy.RegularExpression)){
           jPatternRadioButton.setSelected(true);
        }
        else{
            // Fill data to back up dropdowns then preselect
            jModelGroupRadioButtonActionPerformed(null);
            jModelGroupRadioButton.setSelected(true);
        }
       updateSelected();
       //System.out.println("Filter status="+currentFilter.toString());
   }
   /**
    * Creates new form PlotterQuantityNameFilterJPanel
    */
   public QuantityNameFilterJPanel(String[] availableNames) {
      initComponents();
      metaCharacters.add("*");
      metaCharacters.add("+");
      metaCharacters.add("?");
      FilterTextField.getDocument().addDocumentListener(this);
      FilterTextField.setText(getPattern());
      tableModel = new QuantityNameFilterTableModel(availableNames, new String[]{"Muscle Name", "Selected"});
      jTable1.setModel(tableModel);
      jTable1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      tableModel.addTableModelListener(this);
      //Don't track selection jTable1.getSelectionModel().addListSelectionListener(this);
      if (currentFilter.equals(FilterBy.RegularExpression)){
        jPatternRadioButtonActionPerformed(null);
      }
      else{
         // Fill data to back up dropdowns then preselect
         jModelGroupRadioButtonActionPerformed(null);
         jModelGroupRadioButton.setSelected(true);
      }
      updateSelected();
   }
   
   /** This method is called from within the constructor to
    * initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
   // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
   private void initComponents() {
      buttonGroup1 = new javax.swing.ButtonGroup();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTable1 = new javax.swing.JTable();

      jPanel1 = new javax.swing.JPanel();
      jNumSelectedLabel = new javax.swing.JLabel();
      jSumCheckBox = new javax.swing.JCheckBox();
      jPanel2 = new javax.swing.JPanel();
      FilterTextField = new javax.swing.JFormattedTextField();
      jMuscleGroupComboBox = new javax.swing.JComboBox();
      jModelComboBox = new javax.swing.JComboBox();
      jPatternRadioButton = new javax.swing.JRadioButton();
      jModelGroupRadioButton = new javax.swing.JRadioButton();
      jLabel1 = new javax.swing.JLabel();
      jShowAllButton = new javax.swing.JButton();
      jLabel3 = new javax.swing.JLabel();
      jSelectAllCheckBox = new javax.swing.JCheckBox();
      jDeselectAllCheckBox = new javax.swing.JCheckBox();

      jTable1.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
         },
         new String [] {
            "Title 1", "Title 2", "Title 3", "Title 4"
         }
      ));
      jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
      jScrollPane1.setViewportView(jTable1);

      jNumSelectedLabel.setText("0 items selected");

      jSumCheckBox.setText("sum only");
      jSumCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
      jSumCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
      jSumCheckBox.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jSumCheckBoxActionPerformed(evt);
         }
      });

      org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .add(jSumCheckBox)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 51, Short.MAX_VALUE)
            .add(jNumSelectedLabel)
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(jPanel1Layout.createSequentialGroup()
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
               .add(jNumSelectedLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
               .add(jSumCheckBox))
            .addContainerGap())
      );

      FilterTextField.setToolTipText("use '.*' for wildcard, add patterns with '|' and press Apply");

      jMuscleGroupComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Muscle Group" }));
      jMuscleGroupComboBox.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMuscleGroupComboBoxActionPerformed(evt);
         }
      });

      jModelComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Model" }));
      jModelComboBox.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jModelComboBoxActionPerformed(evt);
         }
      });

      buttonGroup1.add(jPatternRadioButton);
      jPatternRadioButton.setSelected(true);
      jPatternRadioButton.setText("pattern");
      jPatternRadioButton.setToolTipText("Select by typing regular expression in box");
      jPatternRadioButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
      jPatternRadioButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
      jPatternRadioButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jPatternRadioButtonActionPerformed(evt);
         }
      });

      buttonGroup1.add(jModelGroupRadioButton);
      jModelGroupRadioButton.setText("model");
      jModelGroupRadioButton.setToolTipText("use names from a model");
      jModelGroupRadioButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
      jModelGroupRadioButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
      jModelGroupRadioButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jModelGroupRadioButtonActionPerformed(evt);
         }
      });

      jLabel1.setText("Filter By");

      jShowAllButton.setText("Show All");
      jShowAllButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jShowAllButtonActionPerformed(evt);
         }
      });

      jLabel3.setText("group");

      org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .add(jLabel1)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
               .add(jPatternRadioButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
               .add(jModelGroupRadioButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
               .add(jModelComboBox, 0, 187, Short.MAX_VALUE)
               .add(jPanel2Layout.createSequentialGroup()
                  .add(FilterTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 108, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                  .add(jShowAllButton))
               .add(jPanel2Layout.createSequentialGroup()
                  .add(jLabel3)
                  .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                  .add(jMuscleGroupComboBox, 0, 155, Short.MAX_VALUE)))
            .addContainerGap())
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
               .add(jLabel1)
               .add(jPatternRadioButton)
               .add(FilterTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
               .add(jShowAllButton))
            .add(7, 7, 7)
            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
               .add(jModelGroupRadioButton)
               .add(jModelComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
               .add(jLabel3)
               .add(jMuscleGroupComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
      );

      jSelectAllCheckBox.setText("select all shown");
      jSelectAllCheckBox.setToolTipText("select all shown quantities");
      jSelectAllCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
      jSelectAllCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
      jSelectAllCheckBox.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jSelectAllCheckBoxActionPerformed(evt);
         }
      });

      jDeselectAllCheckBox.setText("deselect all shown");
      jDeselectAllCheckBox.setToolTipText("deselect all shown quantities");
      jDeselectAllCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
      jDeselectAllCheckBox.setMargin(new java.awt.Insets(0, 0, 0, 0));
      jDeselectAllCheckBox.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jDeselectAllCheckBoxActionPerformed(evt);
         }
      });

      org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
               .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                  .addContainerGap()
                  .add(jScrollPane1, 0, 0, Short.MAX_VALUE))
               .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                  .addContainerGap()
                  .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                     .add(jSelectAllCheckBox)
                     .add(jDeselectAllCheckBox))
                  .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                  .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                  .addContainerGap()
                  .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 318, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
         .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 236, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
               .add(layout.createSequentialGroup()
                  .add(jSelectAllCheckBox)
                  .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 8, Short.MAX_VALUE)
                  .add(jDeselectAllCheckBox))
               .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
      );
   }// </editor-fold>//GEN-END:initComponents

   private void jSumCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSumCheckBoxActionPerformed
// TODO add your handling code here:
       setSumOnly(((JCheckBox)evt.getSource()).isSelected());
       tableModel.fireTableDataChanged();
   }//GEN-LAST:event_jSumCheckBoxActionPerformed

    private void jMuscleGroupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMuscleGroupComboBoxActionPerformed
// TODO add your handling code here:
        JComboBox cb = (JComboBox)evt.getSource();
        String groupName = (String) cb.getSelectedItem();
        restrictToGroup(groupName);
    }//GEN-LAST:event_jMuscleGroupComboBoxActionPerformed

   private void restrictToGroup(final String groupName) {
       // get members and use them to filter
      ForceSet acts=currentModel.getForceSet();
      ObjectGroup gp=acts.getGroup(groupName);
      ArrayObjPtr members=gp.getMembers();
      // Form a vector of muscle names
      String tempPattern="";
      for(int i=0;i<members.getSize();i++){
          tempPattern +=members.getitem(i).getName();
          if (i<members.getSize()-1)
             tempPattern += "|"; 
      }
      // Filter visible items by musclesInGroup
      tableModel.restrictNamesBy(tempPattern);
   }

    private void jModelComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModelComboBoxActionPerformed
// TODO add your handling code here:
        JComboBox cb = (JComboBox)evt.getSource();
        currentModel = (Model) cb.getSelectedItem();
        // Find model's muscle groups and fill in drop down'
        Vector<String> groups=ViewDB.getInstance().getModelGuiElements(currentModel).getActuatorGroupNames();
        jMuscleGroupComboBox.setModel(new DefaultComboBoxModel(groups));
        if (groups.size()>0){
           jMuscleGroupComboBox.setSelectedIndex(0);
           restrictToGroup(groups.get(0));
       }

    }//GEN-LAST:event_jModelComboBoxActionPerformed

    private void jDeselectAllCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeselectAllCheckBoxActionPerformed
// TODO add your handling code here:
         tableModel.selectShown(false);
         updateSelected();
        ((JCheckBox)evt.getSource()).setSelected(false);

    }//GEN-LAST:event_jDeselectAllCheckBoxActionPerformed

    private void jSelectAllCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelectAllCheckBoxActionPerformed
        tableModel.selectShown(true);
        updateSelected();
        ((JCheckBox)evt.getSource()).setSelected(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jSelectAllCheckBoxActionPerformed

    private void jShowAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowAllButtonActionPerformed
        pattern = ".*";
        tableModel.restrictNamesBy(getPattern());
// TODO add your handling code here:
    }//GEN-LAST:event_jShowAllButtonActionPerformed

    private void jModelGroupRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModelGroupRadioButtonActionPerformed
        currentFilter=FilterBy.ModelGroup;
        // Populate combobox for models with available models
        Object[] models=OpenSimDB.getInstance().getAllModels();
        if (models.length==0){
            DialogDisplayer.getDefault().notify(new NotifyDescriptor.Message("No models to select from."));
            jPatternRadioButton.setSelected(true);
            jPatternRadioButtonActionPerformed(evt);
            return;
        }
        jModelComboBox.setModel(new DefaultComboBoxModel(models));
        currentModel = OpenSimDB.getInstance().getCurrentModel();
        jModelComboBox.setSelectedItem(currentModel);
        Vector<String> groups=ViewDB.getInstance().getModelGuiElements(currentModel).getActuatorGroupNames();
        jMuscleGroupComboBox.setModel(new DefaultComboBoxModel(groups));
        setFilter(currentFilter);
        if (groups.size()>0)
            restrictToGroup(groups.get(0));
        
// TODO add your handling code here:
    }//GEN-LAST:event_jModelGroupRadioButtonActionPerformed

    private void jPatternRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatternRadioButtonActionPerformed
// TODO add your handling code here:
        currentFilter=FilterBy.RegularExpression;
        setFilter(currentFilter);
    }//GEN-LAST:event_jPatternRadioButtonActionPerformed

   public void applyPattern(String regex)
{
      pattern = regex;
      FilterTextField.setText(getPattern());
      if (jPatternRadioButton.isSelected()){
         regex=convertToJavaRegex(FilterTextField);
         FilterTextField.setText(regex);
         pattern = regex;
         try{
            tableModel.applyFilter(regex);
            tableModel.fireTableDataChanged();
         } catch(PatternSyntaxException ex){
            // Should complain here'
            //jLabel4.setText(regex+".*"+"will complain");
         }
      } else {
         // update names form model, muscle goup selection
         String muscleGroup = (String)jMuscleGroupComboBox.getSelectedItem();
         Model model = (Model)jModelComboBox.getSelectedItem();
         Vector<String> names = ViewDB.getInstance().getModelGuiElements(model).getActuatorNamesForGroup(muscleGroup);
         tableModel.markSelectedNames(names);
      }
      updateSelected();
   }
    private void updateSelected() {
        int n = tableModel.getNumSelected();
        jNumSelectedLabel.setText(String.valueOf(n)+" items selected");
        int nShownSelected = tableModel.getNumShownAndSelected();
        if (nShownSelected==0){
            // enable select all, disable deselect all
            jSelectAllCheckBox.setEnabled(true);
            jDeselectAllCheckBox.setEnabled(false);
        }
        else if (nShownSelected==tableModel.getRowCount()){
            jSelectAllCheckBox.setEnabled(false);
            jDeselectAllCheckBox.setEnabled(true);
        }
        else {
            jSelectAllCheckBox.setEnabled(true);
            jDeselectAllCheckBox.setEnabled(true);
        }
        
    }
    
    public void tableChanged(TableModelEvent e) {
        int type=e.getType();
        updateSelected();
    }
   
   
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JFormattedTextField FilterTextField;
   private javax.swing.ButtonGroup buttonGroup1;
   private javax.swing.JCheckBox jDeselectAllCheckBox;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JComboBox jModelComboBox;
   private javax.swing.JRadioButton jModelGroupRadioButton;
   private javax.swing.JComboBox jMuscleGroupComboBox;
   private javax.swing.JLabel jNumSelectedLabel;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JRadioButton jPatternRadioButton;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JCheckBox jSelectAllCheckBox;
   private javax.swing.JButton jShowAllButton;
   private javax.swing.JCheckBox jSumCheckBox;
   private javax.swing.JTable jTable1;
   // End of variables declaration//GEN-END:variables

     /**
     * Convert string to canonical regular expression syntax
     * in particular convert * -> .*, ?->.?
     *
     */
    private String convertToJavaRegex(JTextField field)
    {
      String regex = FilterTextField.getText();
      // Replace * with .* ?with .? as it's more common
      // There appears to be a bug where the replacement cant be done inplace
      int idx = regex.indexOf("*", 0);
      //System.out.println("Regex=["+regex+"]");
      String test="";
      while(getPattern().matches(".*[^\\.]\\*")){
         test=regex.replaceAll("\\*", "\\.\\*");
         regex=test;
      }
      idx = regex.indexOf("?", 0);
      if (idx !=-1 && regex.indexOf(".?", 0)==-1){
         test=regex.replaceAll("\\?", "\\.\\?");
         regex=test;
      }
      return regex;
    }

     String getSelectedAsString() {
         if (sumOnly){
             String names =  tableModel.getSelectedAsString();
             String rep=names.replaceAll(", ", "+");
             return rep;             
         }
         else
            return tableModel.getSelectedAsString();
    }

    private void setFilter(PlotterQuantityNameFilterJPanel.FilterBy currentFilter) {
        // Disable model, group selection when doing regular expression and vice versa
        boolean usePattern= (currentFilter == PlotterQuantityNameFilterJPanel.FilterBy.RegularExpression);
        jModelComboBox.setEnabled(!usePattern);
        jMuscleGroupComboBox.setEnabled(!usePattern);
        FilterTextField.setEnabled(usePattern);
    }

    public String getPattern() {
        return pattern;
        /**/

    }
    // DocumentListener implementation for changes in the pattern text field
    // to avoid working with individual key strokes that may correspond
    // to Ctrl characters, delete, paste text, ..
    public void insertUpdate(DocumentEvent e) {
        handlePatternChange();
    }
    
    public void removeUpdate(DocumentEvent e) {
        handlePatternChange();
    }

    public void changedUpdate(DocumentEvent e) {
        handlePatternChange();
    }
    /**
     * Handle changes to the text in the FilterTextField
     * a leading and a trailing .* are pre/appended for matching any substring
     */
    private void handlePatternChange()
    {
       String rawPattern = FilterTextField.getText();
       // Remove leading and trailing special characters that may interfere
       if (rawPattern.length()>0){
          // remove leading and trailing special characters
          int index=0;
          String newPattern=rawPattern;
          while(index < rawPattern.length()){
            String letter=rawPattern.substring(index, index+1);
            if (metaCharacters.contains(letter))
               newPattern=rawPattern.substring(index);
            else
               break;
            index++;
          }
          rawPattern=newPattern;
          // start from the end and repeat
          index = rawPattern.length()-1;
           while(index >= 0){
            String letter=rawPattern.substring(index, index+1);
            if (metaCharacters.contains(letter))
               newPattern=rawPattern.substring(0, index);
            else
               break;
            index--;
          }
          rawPattern=newPattern;
      }
       
       tableModel.restrictNamesBy(".*"+rawPattern+".*");
    }    
    
    private void setFilter(QuantityNameFilterJPanel.FilterBy currentFilter) {
        // Disable model, group selection when doing regular expression and vice versa
        boolean usePattern= (currentFilter == QuantityNameFilterJPanel.FilterBy.RegularExpression);
        jModelComboBox.setEnabled(!usePattern);
        jMuscleGroupComboBox.setEnabled(!usePattern);
        FilterTextField.setEnabled(usePattern);
    }

    public boolean isSumOnly() {
        return sumOnly;
    }

    public void setSumOnly(boolean sumOnly) {
        this.sumOnly = sumOnly;
    }
    
    public void addSelectionChangeListener(TableModelListener l)
    {
        tableModel.addTableModelListener(l);
    }
    public void removeSelectionChangeListener(TableModelListener l)
    {
        tableModel.removeTableModelListener(l);
    }
}
