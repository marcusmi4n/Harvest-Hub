
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author grimian
 */
public class chat extends javax.swing.JFrame {

	/**
	 * Creates new form chat
	 */
	public chat() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jButton8 = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                disp = new javax.swing.JTextArea();
                jButton1 = new javax.swing.JButton();
                msg = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("CHAT");
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jButton8.setFont(new java.awt.Font("URW Gothic", 0, 14)); // NOI18N
                jButton8.setText("HOME");
                jButton8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton8ActionPerformed(evt);
                        }
                });
                getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

                jLabel2.setFont(new java.awt.Font("URW Gothic", 0, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("<html>\n<p align=\"center\">Welcome to our chat page, feel free to leave as a feedback</p>\n</html>");
                getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 110));

                jPanel1.setBackground(new java.awt.Color(0, 0, 0, 80));
                jPanel1.setForeground(new java.awt.Color(255, 255, 255));

                disp.setBackground(new java.awt.Color(224, 254, 223));
                disp.setColumns(20);
                disp.setFont(new java.awt.Font("URW Gothic", 0, 17)); // NOI18N
                disp.setRows(5);
                jScrollPane1.setViewportView(disp);

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                                .addContainerGap())
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                                .addContainerGap())
                );

                getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 390, 510));

                jButton1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
                jButton1.setText("SEND");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });
                getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 650, 90, 60));

                msg.setFont(new java.awt.Font("URW Gothic", 0, 14)); // NOI18N
                getContentPane().add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 290, 60));

                jLabel1.setIcon(new javax.swing.ImageIcon("/home/grimian/Downloads/Harvest Hub/hhh.jpg")); // NOI18N
                jLabel1.setText("jLabel1");
                getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 406, 720));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
                // TODO add your handling code here:
                setVisible(false);
                Home hm = new Home();
                hm.setVisible(true);
        }//GEN-LAST:event_jButton8ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
                
		 
		String mss = msg.getText();
		
		if(msg.getText().equals("")){
			JOptionPane.showMessageDialog(this,"Insert a message");
		}else{
			
		         disp.setText(mss);
			  msg.setText("");
		}
        }//GEN-LAST:event_jButton1ActionPerformed

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
			java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new chat().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTextArea disp;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton8;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextField msg;
        // End of variables declaration//GEN-END:variables
}
