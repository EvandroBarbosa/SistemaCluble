/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import Entidade.EAssociado;
import Entidade.ETipoAssociado;
import Negocio.NAssociado;
import Negocio.NTipoAssociado;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Evandro
 */
public class Associado_cadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form Associado_cadastro
     */
    JDesktopPane principal;
    public Associado_cadastro(JDesktopPane principal) {
        initComponents();
        
        carregarCombo();   
        this.principal = principal;
        
    }

   public Associado_cadastro(JDesktopPane principal, String codigo) {
        this(principal);
        
        try {
            EAssociado socio = new NAssociado().consultar(Integer.parseInt(codigo));
            
            preecherTela(socio);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdentificador = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbTipoAssociado = new javax.swing.JComboBox();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnFerchar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro de Associados");

        jLabel1.setText("Identeificador");

        txtIdentificador.setEditable(false);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jLabel3.setText("Endereço");

        jLabel4.setText("Tipo Associado");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnFerchar.setText("Fechar");
        btnFerchar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFercharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(txtEndereco)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbTipoAssociado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFerchar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTipoAssociado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluir)
                        .addComponent(btnLimpar)
                        .addComponent(btnFerchar))
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnExcluir, btnFerchar, btnLimpar, btnSalvar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // Aqui configura o botão Incluir novos dados 
        try {
            
            EAssociado socio = new EAssociado();
            
            if (!txtIdentificador.getText().isEmpty()) {
                socio.setCodigo(Integer.parseInt(txtIdentificador.getText()));
            }
            
            socio.setNome(txtNome.getText());
            socio.setEndereco(txtEndereco.getText());
           
           
           socio.setTipoAssociado((ETipoAssociado) cmbTipoAssociado.getSelectedItem());
           
           new NAssociado().salvar(socio);
           
           JOptionPane.showMessageDialog(null, "Operação Reaizada com Sucesso");
           
           limparTela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // Aqui configura o botão limpar os campos da tela
        try {
            
            limparTela();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            
            String codigo = JOptionPane.showInputDialog("Digite o codigo do associado");
           
            int intCodigo = Integer.parseInt(codigo);
            
            
            EAssociado socio = new NAssociado().consultar(intCodigo);
            
            preecherTela(socio);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Informe um codigo valido");
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnFercharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFercharActionPerformed
        // TODO add your handling code here:
        try {
            
            dispose();
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnFercharActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            
            int codigo = Integer.parseInt(txtIdentificador.getText());
            
            new NAssociado().excluir(codigo);
            
            JOptionPane.showMessageDialog(null, "Exclusão efetuada com Sucesso!");
            
            limparTela();
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // configuração do botão pesquisa que chama tabela associado pesquisa
        try {
            Associado_Pesquisa janela = new Associado_Pesquisa(principal);
            
            principal.add(janela);
            janela.setVisible(true);
            
            dispose();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFerchar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmbTipoAssociado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void carregarCombo() {
        try {
            
            ETipoAssociado item0 = new ETipoAssociado(0,"Selecione uma Opção");
            cmbTipoAssociado.addItem(item0);
            
             
            
            for(ETipoAssociado item: new NTipoAssociado().list()){
                cmbTipoAssociado.addItem(item);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    private void limparTela() {
        try {
            txtIdentificador.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            
            btnExcluir.setEnabled(false);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    private void preecherTela(EAssociado socio) throws Exception {
        if(socio.getCodigo() == 0){
            throw new Exception("Associado não encontrado");
        }
        txtIdentificador.setText(socio.getCodigo()+"");
        txtNome.setText(socio.getNome());
        txtEndereco.setText(socio.getEndereco());
        
        for (int i = 0; i < cmbTipoAssociado.getModel().getSize(); i++) {
            
            ETipoAssociado item = (ETipoAssociado) cmbTipoAssociado.getModel()
                .getElementAt(i);
            
            if (socio.getTipoAssociado().getCodigo() == item.getCodigo()) {
                cmbTipoAssociado.setSelectedIndex(i);
            }
        }
        btnExcluir.setEnabled(true);
    }
}
