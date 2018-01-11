/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import dao.ClienteDao;
import dao.LocacaoDao;
import entidades.Cliente;
import entidades.Locacao;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aNDERSON
 */
public class listaLocacao extends javax.swing.JDialog {

    /**
     * Creates new form listaClientes
     */
    public listaLocacao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableLocacao = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                AoAbrirTela(evt);
            }
        });

        tableLocacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Carro", "Cliente", "Data Retorno"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableLocacao);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Buscar");

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_refresh_small.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cross.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnNovo)
                    .addComponent(btnAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        if (tableLocacao.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Nenhum Registro Selecionado na Tabela");
            return;
        }
        Locacao c = new Locacao();
        c.setID((String) tableLocacao.getValueAt(tableLocacao.getSelectedRow(), 0));
        c.setCodigoCarro((String) tableLocacao.getValueAt(tableLocacao.getSelectedRow(), 1));
        c.setCodigoCliente((String) tableLocacao.getValueAt(tableLocacao.getSelectedRow(), 2));
        c.setDataRetorno((String) tableLocacao.getValueAt(tableLocacao.getSelectedRow(), 3));

        cadastroLocacao cad = new cadastroLocacao(null, rootPaneCheckingEnabled, c);
        cad.setVisible(true);
        try {
            preencheTabela();
        } catch (IOException ex) {
            Logger.getLogger(listaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        cadastroLocacao cad = new cadastroLocacao(null, rootPaneCheckingEnabled);
        cad.setVisible(true);
        try {
            preencheTabela();
        } catch (IOException ex) {
            Logger.getLogger(listaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNovoActionPerformed

    private void AoAbrirTela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_AoAbrirTela
        try {
            // TODO add your handling code here:
            preencheTabela();
        } catch (IOException ex) {
            Logger.getLogger(listaLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AoAbrirTela

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        if (tableLocacao.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Nenhum Registro Selecionado na Tabela");
            return;
        }
        DefaultTableModel modelo = (DefaultTableModel) tableLocacao.getModel();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Deseja Excluir o Registro Selecionado?", "Atenção!", dialogButton);
        if (dialogResult == 0) {
            //sim                       
            String data = (String) tableLocacao.getValueAt(tableLocacao.getSelectedRow(), 0);
            int id = Integer.parseInt(data);
            LocacaoDao dao = new LocacaoDao();
            try {
                if (dao.Deletar(id)) {
                    JOptionPane.showMessageDialog(null, "Registro removido com Sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException ex) {
                Logger.getLogger(listaLocacao.class.getName()).log(Level.SEVERE, null, ex);
            }
            modelo.removeRow(tableLocacao.getSelectedRow());
        } else {

        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void preencheTabela() throws IOException {
        DefaultTableModel modelo = (DefaultTableModel) tableLocacao.getModel();
        modelo.setNumRows(0);
        LocacaoDao dao = new LocacaoDao();
        for (Locacao c : dao.ListarTodos()) {
            modelo.addRow(new String[]{
                "" + c.getID(),
                c.getCodigoCarro(), c.getCodigoCliente(), c.getDataRetorno()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tableLocacao;
    // End of variables declaration//GEN-END:variables
}
