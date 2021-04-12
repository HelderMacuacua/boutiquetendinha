/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;
import java.util.Date;
import Controller.ControllerCliente;
import Controller.ControllerVenda;
import Model.ModelCliente;
import Model.ModelVenda;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import static sun.net.www.http.HttpClient.New;

/**
 *
 * @author LVIS MACUA
 */
public class ViewListaVendas extends javax.swing.JFrame {
     private ViewTelaPrincipal viewAnterior;
    /** Creates new form ViewUsuario */
    private ViewListaVendas() {
        initComponents();
        setLocation(365,180);
        preencherTabelaVendas();
        
       
        
    }   
    
    
    
    public ViewListaVendas(ViewTelaPrincipal viewAnterior){
        this();
        this.viewAnterior=viewAnterior;
        
    } 
    List<ModelVenda> listaModelVenda;
    ControllerVenda controllerVenda=new ControllerVenda();
    ModelVenda modeloVenda=new ModelVenda();

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtfVenda = new javax.swing.JTable();
        jbExcluir = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbImprimir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jtfPesquisa = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/barralistadeVendas.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sidebarCliente.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(164, 164, 164));

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/jbsair_2.png"))); // NOI18N
        jbSair.setToolTipText("Sair");
        jbSair.setBorder(null);
        jbSair.setBorderPainted(false);
        jbSair.setContentAreaFilled(false);
        jbSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/jbsair22.png"))); // NOI18N
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtfVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Código | Nome Cliente", "Código  Desc Produto", "Quantidade", "Valor Unitario", "Valor Total", "Desconto", "Data", "Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtfVenda.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtfVenda);
        if (jtfVenda.getColumnModel().getColumnCount() > 0) {
            jtfVenda.getColumnModel().getColumn(0).setMinWidth(50);
            jtfVenda.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtfVenda.getColumnModel().getColumn(0).setMaxWidth(50);
            jtfVenda.getColumnModel().getColumn(1).setMinWidth(180);
            jtfVenda.getColumnModel().getColumn(1).setPreferredWidth(180);
            jtfVenda.getColumnModel().getColumn(1).setMaxWidth(180);
        }

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/jbdelete.png"))); // NOI18N
        jbExcluir.setBorder(null);
        jbExcluir.setBorderPainted(false);
        jbExcluir.setContentAreaFilled(false);
        jbExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbExcluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/jbdeletar22.png"))); // NOI18N
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/jbEditar_1.png"))); // NOI18N
        jbEditar.setBorder(null);
        jbEditar.setBorderPainted(false);
        jbEditar.setContentAreaFilled(false);
        jbEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/jbeditar22.png"))); // NOI18N
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/relpdf.png"))); // NOI18N
        jbImprimir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jbImprimir.setBorderPainted(false);
        jbImprimir.setContentAreaFilled(false);
        jbImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbImprimir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/relpdf2.png"))); // NOI18N
        jbImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImprimirActionPerformed(evt);
            }
        });

        jLabel12.setText("Pesquisar:");

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pesq.png"))); // NOI18N
        jbPesquisar.setToolTipText("pesquisar");
        jbPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPesquisar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pesq2.png"))); // NOI18N
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1066, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbImprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        viewAnterior.setEnabled(true);
        
    }//GEN-LAST:event_formWindowClosed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
       
      
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:
    
      
       

//String resposta = (String)JOptionPane.showInputDialog(null,"Edição de título:", "Editar Título",JOptionPane.PLAIN_MESSAGE, null,null,"Título");
        
        
        
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImprimirActionPerformed
        // TODO add your handling code here:
       
         Document documento=new Document(PageSize.A4);   
         listaModelVenda=controllerVenda.listarTodasVendasController();
         try {
         PdfWriter.getInstance(documento,new FileOutputStream("Listavendas.pdf"));
        
        documento.open(); 
        documento.add(new Paragraph(""));
        
        Image imagem=Image.getInstance("b.png");
        documento.add(imagem);
        documento.add(new Paragraph(new Date().toString()));
       Image imagemLista=Image.getInstance("lista.png");
       documento.add(imagemLista);
       documento.add(new Paragraph("                                "));
       
       
       
       // tabela 
            int w[] = { 50, 50 };
             PdfPTable tabela=new PdfPTable(9);

             
             PdfPCell coluna1=new PdfPCell(new Paragraph("Cod Venda",FontFactory.getFont(FontFactory.TIMES,10,BaseColor.WHITE)));
             coluna1.setBackgroundColor(new BaseColor(27, 150, 120));
             
             
             PdfPCell coluna2=new PdfPCell(new Paragraph("Cod Cliente",FontFactory.getFont(FontFactory.TIMES,10,BaseColor.WHITE)));
             coluna2.setBackgroundColor(new BaseColor(27, 150, 120));
             PdfPCell coluna3=new PdfPCell(new Paragraph("cod produto",FontFactory.getFont(FontFactory.TIMES,10,BaseColor.WHITE)));
             coluna3.setBackgroundColor(new BaseColor(27, 150, 120));
             PdfPCell coluna4=new PdfPCell(new Paragraph("Quantidade",FontFactory.getFont(FontFactory.TIMES,10,BaseColor.WHITE)));
             coluna4.setBackgroundColor(new BaseColor(27, 150, 120));
             PdfPCell coluna5=new PdfPCell(new Paragraph("Valor",FontFactory.getFont(FontFactory.TIMES,10,BaseColor.WHITE)));
             coluna5.setBackgroundColor(new BaseColor(27, 150, 120));
             PdfPCell coluna6=new PdfPCell(new Paragraph("Valor Total",FontFactory.getFont(FontFactory.TIMES,10,BaseColor.WHITE)));
             coluna6.setBackgroundColor(new BaseColor(27, 150, 120));
             PdfPCell coluna7=new PdfPCell(new Paragraph("Desconto",FontFactory.getFont(FontFactory.TIMES,10,BaseColor.WHITE)));
             coluna7.setBackgroundColor(new BaseColor(27, 150, 120));
             PdfPCell coluna8=new PdfPCell(new Paragraph("Data",FontFactory.getFont(FontFactory.TIMES,10,BaseColor.WHITE)));
             coluna8.setBackgroundColor(new BaseColor(27, 150, 120));
             coluna8.setBackgroundColor(new BaseColor(27, 150, 120));
             PdfPCell coluna9=new PdfPCell(new Paragraph("Hora",FontFactory.getFont(FontFactory.TIMES,10,BaseColor.WHITE)));
             coluna9.setBackgroundColor(new BaseColor(27, 150, 120));
             
             
             

             
             tabela.addCell(coluna1);
             tabela.addCell(coluna2);
             tabela.addCell(coluna3);
             tabela.addCell(coluna4);
             tabela.addCell(coluna5);
             tabela.addCell(coluna6);
             tabela.addCell(coluna7);
             tabela.addCell(coluna8);
             tabela.addCell(coluna9);
             
             
             for (ModelVenda modelVenda : listaModelVenda) {
             coluna1=new PdfPCell(new Paragraph(modelVenda.getIdVenda()+""));
             coluna2=new PdfPCell(new Paragraph(modelVenda.getCliente()+""));
             coluna3=new PdfPCell(new Paragraph(modelVenda.getProdutos()+""));
             coluna4=new PdfPCell(new Paragraph(modelVenda.getQuantidade()+""));
             coluna5=new PdfPCell(new Paragraph(modelVenda.getValorLiquido()+""));
             coluna6=new PdfPCell(new Paragraph(modelVenda.getValorBruto()+""));
            coluna7=new PdfPCell(new Paragraph(modelVenda.getDesconto()+""));
             coluna8=new PdfPCell(new Paragraph(modelVenda.getDataVendaConvertida()+""));
             coluna9=new PdfPCell(new Paragraph(modelVenda.getHoraVendaConvertida()+""));

            
             
             tabela.addCell(coluna1);
             tabela.addCell(coluna2);
             tabela.addCell(coluna3);
             tabela.addCell(coluna4);
             tabela.addCell(coluna5);
             tabela.addCell(coluna6);
            tabela.addCell(coluna7);
            tabela.addCell(coluna8);
            tabela.addCell(coluna9);

             }
          documento.add(tabela);
          documento.close();
          Desktop.getDesktop().open(new File("Listavendas.pdf"));
          
             
        } catch (Exception e) { 
            e.printStackTrace();
        }
        
        
        
       // documento.add(new Paragraph("Image"));
        
      
        documento.close();
        
       
        
       
        
    }//GEN-LAST:event_jbImprimirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewListaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewListaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewListaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewListaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewListaVendas().setVisible(true);
            }
        });
    } 
    
   private void preencherTabelaVendas(){
     listaModelVenda=controllerVenda.listarTodasVendasController();
     DefaultTableModel modelo=(DefaultTableModel) this.jtfVenda.getModel();
     modelo.setRowCount(0);
       for (int i = 0; i < listaModelVenda.size(); i++) {
          modelo.addRow(new Object[]{
              listaModelVenda.get(i).getIdVenda(),
              listaModelVenda.get(i).getCliente(),
              listaModelVenda.get(i).getProdutos(),
              listaModelVenda.get(i).getQuantidade(),
              listaModelVenda.get(i).getValorLiquido(),
              listaModelVenda.get(i).getValorBruto(),
              listaModelVenda.get(i).getDesconto(),
              listaModelVenda.get(i).getDataVendaConvertida(),
              listaModelVenda.get(i).getHoraVendaConvertida()
          });
       }
   }
    
            
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbImprimir;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSair;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JTable jtfVenda;
    // End of variables declaration//GEN-END:variables

}
