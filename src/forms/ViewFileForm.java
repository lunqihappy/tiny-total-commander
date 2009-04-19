/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ViewFileForm.java
 *
 * Created on Apr 8, 2009, 11:20:22 PM
 */

package forms;

import core.*;
import java.io.IOException;
import utils.MsgboxHelper;

/**
 *
 * @author Hung Cuong <nhc.hcmuns at gmail.com>
 */
public class ViewFileForm extends javax.swing.JFrame {
    
    /** Creates new form ViewFileForm */
    public ViewFileForm(String path){
        initComponents();
        setLocationRelativeTo(this);            // center the form
        
        try {
            setTitle(getTitle() + " - [" + path + "]");    // set title
            txtContent.setText(XItem.getFileContent(path));    // show content
            txtContent.setCaretPosition(0);                // set caret to beginning
        } catch (IOException ex) {
            MsgboxHelper.showError(ex.getMessage());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtContent = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View File");

        txtContent.setColumns(20);
        txtContent.setEditable(false);
        txtContent.setRows(5);
        jScrollPane1.setViewportView(txtContent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtContent;
    // End of variables declaration//GEN-END:variables

}