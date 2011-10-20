/*
 * ShowXMLRepJDialog.java
 *
 * Created on March 29, 2011, 9:17 PM
 */

package org.opensim.helputils;

import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.text.html.HTMLEditorKit;
import org.opensim.modeling.ArrayStr;
import org.opensim.modeling.OpenSimObject;
import org.opensim.modeling.Property;
import org.opensim.modeling.PropertySet;

/**
 *
 * @author  Ayman
 */
public class ShowXMLRepJDialog extends javax.swing.JDialog {
    
    DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
    /** Creates new form ShowXMLRepJDialog */
    public ShowXMLRepJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        populateCbModel();
        initComponents();
        jEditorPane1.setEditorKit(new HTMLEditorKit());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jComboBox1.setModel(cbModel);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Class Name");

        jEditorPane1.setEditable(false);
        jScrollPane1.setViewportView(jEditorPane1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jComboBox1, 0, 182, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(17, 17, 17)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
// TODO add your handling code here:
        String selectedClass = (String) jComboBox1.getSelectedItem();
        OpenSimObject obj = OpenSimObject.newInstanceOfType(selectedClass);
        String contents="";
        PropertySet pSet = obj.getPropertySet();
        contents = contents.concat("<FONT COLOR=RED>&lt;"+obj.getType()+"&gt</FONT><br>");
        for(int i=0; i< pSet.getSize(); i++){
            try {
                Property p = pSet.get(i);
                String cmt = p.getComment();
                if (cmt.length()>0) contents = contents.concat("\t<FONT COLOR=Green>&lt;!--"+cmt+"--&gt</FONT><br>");
                contents = contents.concat("\t<FONT COLOR=RED>&lt;"+p.getName()+"&gt;</FONT>"+
                        removeEnclosingParethesisIfNeeded(p.toString())+
                        "<FONT COLOR=RED>&lt;/"+p.getName()+"&gt</FONT><br>");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
           
        }
        contents = contents.concat("<FONT COLOR=RED>&lt;/"+obj.getType()+"&gt</FONT><br>");
        jEditorPane1.selectAll();
        jEditorPane1.cut();
        jEditorPane1.setText(contents);
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowXMLRepJDialog(new javax.swing.JFrame(), true).setVisible(true);
            }
        });
    }

    private void populateCbModel() {
        ArrayStr typeNames = new ArrayStr();
        OpenSimObject.getRegisteredTypenames(typeNames);
        for(int i=0; i< typeNames.getSize(); i++)
            cbModel.addElement(typeNames.getitem(i));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
   
    private String removeEnclosingParethesisIfNeeded(String string) {
        if (string.startsWith("(")){
            return string.substring(1, string.length()-1);
        }
        return string;
    }
}
