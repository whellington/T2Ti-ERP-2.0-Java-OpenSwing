/*
* The MIT License
* 
* Copyright: Copyright (C) 2014 T2Ti.COM
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in
* all copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
* THE SOFTWARE.
* 
* The author may be contacted at: t2ti.com@gmail.com
*
* @author Claudio de Barros (T2Ti.com)
* @version 2.0
*/
package com.t2tierp.comissao.cliente;

import org.openswing.swing.client.GridControl;
import org.openswing.swing.mdi.client.InternalFrame;

public class ComissaoObjetivoGrid extends InternalFrame {

    public ComissaoObjetivoGrid(ComissaoObjetivoGridController controller) {
        initComponents();
        gridControl1.setController(controller);
        gridControl1.setGridDataLocator(controller);
    }

    public GridControl getGrid1() {
        return gridControl1;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        insertButton1 = new org.openswing.swing.client.InsertButton();
        deleteButton1 = new org.openswing.swing.client.DeleteButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        navigatorBar1 = new org.openswing.swing.client.NavigatorBar();
        gridControl1 = new org.openswing.swing.client.GridControl();
        textColumn2 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn3 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn4 = new org.openswing.swing.table.columns.client.TextColumn();
        textColumn5 = new org.openswing.swing.table.columns.client.TextColumn();
        comboColumn7 = new org.openswing.swing.table.columns.client.ComboColumn();
        decimalColumn9 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn10 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn11 = new org.openswing.swing.table.columns.client.DecimalColumn();

        setTitle("T2Ti ERP - Comissao");
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Comissao Objetivo"));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel1.add(insertButton1);
        jPanel1.add(deleteButton1);
        jPanel1.add(reloadButton1);
        jPanel1.add(navigatorBar1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        gridControl1.setDeleteButton(deleteButton1);
        gridControl1.setFunctionId("comissaoObjetivo");
        gridControl1.setInsertButton(insertButton1);
        gridControl1.setNavBar(navigatorBar1);
        gridControl1.setReloadButton(reloadButton1);
        gridControl1.setValueObjectClassName("com.t2tierp.comissao.java.ComissaoObjetivoVO");
        gridControl1.getColumnContainer().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        textColumn2.setColumnName("produto.nome");
        textColumn2.setHeaderColumnName("Produto");
        textColumn2.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        textColumn2.setPreferredWidth(200);
        gridControl1.getColumnContainer().add(textColumn2);

        textColumn3.setColumnName("comissaoPerfil.nome");
        textColumn3.setHeaderColumnName("Perfil");
        textColumn3.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        textColumn3.setPreferredWidth(150);
        gridControl1.getColumnContainer().add(textColumn3);

        textColumn4.setColumnName("codigo");
        textColumn4.setHeaderColumnName("Codigo");
        textColumn4.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        gridControl1.getColumnContainer().add(textColumn4);

        textColumn5.setColumnName("nome");
        textColumn5.setHeaderColumnName("Nome");
        textColumn5.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        gridControl1.getColumnContainer().add(textColumn5);

        comboColumn7.setColumnName("formaPagamento");
        comboColumn7.setDomainId("comissaoFormaPagamento");
        comboColumn7.setHeaderColumnName("Forma Pagamento");
        comboColumn7.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        comboColumn7.setPreferredWidth(120);
        gridControl1.getColumnContainer().add(comboColumn7);

        decimalColumn9.setColumnName("valorPagamento");
        decimalColumn9.setHeaderColumnName("Valor Pagamento");
        decimalColumn9.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn9.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn9);

        decimalColumn10.setColumnName("valorMeta");
        decimalColumn10.setHeaderColumnName("Valor Meta");
        decimalColumn10.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn10.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn10);

        decimalColumn11.setColumnName("quantidade");
        decimalColumn11.setHeaderColumnName("Quantidade");
        decimalColumn11.setHeaderFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        decimalColumn11.setDecimals(2);
        gridControl1.getColumnContainer().add(decimalColumn11);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(gridControl1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.table.columns.client.ComboColumn comboColumn7;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn10;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn11;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn9;
    private org.openswing.swing.client.DeleteButton deleteButton1;
    private org.openswing.swing.client.GridControl gridControl1;
    private org.openswing.swing.client.InsertButton insertButton1;
    private javax.swing.JPanel jPanel1;
    private org.openswing.swing.client.NavigatorBar navigatorBar1;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.table.columns.client.TextColumn textColumn2;
    private org.openswing.swing.table.columns.client.TextColumn textColumn3;
    private org.openswing.swing.table.columns.client.TextColumn textColumn4;
    private org.openswing.swing.table.columns.client.TextColumn textColumn5;
    // End of variables declaration//GEN-END:variables
}