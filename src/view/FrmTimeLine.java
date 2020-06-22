/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import dao.DaoTarefa;
import java.util.List;
import model.ModelTarefa;
import util.Conexao;

/**
 *
 * @author PICHAU
 */
public class FrmTimeLine extends javax.swing.JFrame {

    /**
     * Creates new form FrmTimeLine
     */
    public FrmTimeLine() {
        initComponents();
        Conexao c = new Conexao();
        c.connect();
       
        
        
    }
 public void setUser(String user,boolean visitante ){
        
        jLabelUser.setText(user);
        if(visitante == true){
            jLabelVisitante.setText("Visitante");         
        }else{
            jLabelVisitante.setText("");  
        }
    }
 
 public void setTarefas(int idUser){
     DaoTarefa daoTarefa = new DaoTarefa();
     List<ModelTarefa> modelTarefa = daoTarefa.buscarTarefas(idUser);
     
     
     
//     jListTarefas.setListData();
     
     
 }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabelVisitante = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTarefas = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuário :");

        jLabelUser.setText("User");

        jLabelVisitante.setText("Visitante / Usuario");

        jListTarefas.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jListTarefas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Hoje", " ", "-------------------------------------------13:00:00-------------------------------------------", "Trabalho - projeto pessoal Site de compras -", " ", " ", "-------------------------------------------15:00:00-------------------------------------------", "Desenvolvimeto Atividade George Desenvolvimeto Atividade George - topicos integradores", "Realizar as atividades do prof George na disciplina aplicada - topicos integradores", " ", " ", "-------------------------------------------16:00:00-------------------------------------------", "Desenvolvimeto Atividade Pedro Desenvolvimeto Atividade Pedro - Redes", "Realizar as atividades do prof Pedro na disciplina aplicada - Redes", " ", "-------------------------------------------13:00:00-------------------------------------------", "Trabalho - projeto pessoal Site de compras -", " ", " ", "-------------------------------------------15:00:00-------------------------------------------", "Desenvolvimeto Atividade George Desenvolvimeto Atividade George - topicos integradores", "Realizar as atividades do prof George na disciplina aplicada - topicos integradores", " ", " ", "-------------------------------------------16:00:00-------------------------------------------", "Desenvolvimeto Atividade Pedro Desenvolvimeto Atividade Pedro - Redes", "Realizar as atividades do prof Pedro na disciplina aplicada - Redes", " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListTarefas);

        jMenu1.setText("Tarefas");

        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Consultar");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Perfil");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Configurações");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelVisitante))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelUser)
                    .addComponent(jLabelVisitante))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(963, 561));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed
   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 

 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTimeLine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelVisitante;
    private javax.swing.JList<String> jListTarefas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
