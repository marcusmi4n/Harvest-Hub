
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author grimian
 */
public class profile extends javax.swing.JFrame {

	/**
	 * Creates new form profile
	 */
	public profile() {
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

                jScrollPane1 = new javax.swing.JScrollPane();
                disp_tb = new javax.swing.JTable();
                jButton2 = new javax.swing.JButton();
                jButton8 = new javax.swing.JButton();
                jButton1 = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                usr_pf = new javax.swing.JTextField();
                em_pf = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("PROFILE");
                setPreferredSize(new java.awt.Dimension(406, 720));
                setResizable(false);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jScrollPane1.setBackground(new java.awt.Color(0, 0, 0, 80));
                jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

                disp_tb.setBackground(new java.awt.Color(0, 0, 0, 80));
                disp_tb.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
                disp_tb.setForeground(new java.awt.Color(255, 255, 255));
                disp_tb.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Username", "Email"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.String.class, java.lang.String.class
                        };
                        boolean[] canEdit = new boolean [] {
                                false, false
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jScrollPane1.setViewportView(disp_tb);

                getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 370, 260));

                jButton2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
                jButton2.setText("REGISTER");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });
                getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 130, 80));

                jButton8.setFont(new java.awt.Font("URW Gothic", 0, 14)); // NOI18N
                jButton8.setText("HOME");
                jButton8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton8ActionPerformed(evt);
                        }
                });
                getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

                jButton1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
                jButton1.setText("SIGN OUT");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });
                getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 620, 140, 80));

                jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("Username :");
                getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 40));

                usr_pf.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
                getContentPane().add(usr_pf, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 240, 40));

                em_pf.setFont(new java.awt.Font("Ubuntu", 0, 17)); // NOI18N
                getContentPane().add(em_pf, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 310, 40));

                jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("Email :");
                getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 60, 40));

                jLabel2.setFont(new java.awt.Font("URW Gothic", 0, 24)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("<html>\n<p align=\"center\">USER PROFILE</p>\n");
                getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 180, 110));

                jLabel1.setIcon(new javax.swing.ImageIcon("/home/grimian/Downloads/Harvest Hub/Logintake 2.jpg")); // NOI18N
                jLabel1.setText("jLabel1");
                getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 730));

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
		setVisible(false);
		LoginPage lgn = new LoginPage();
		lgn.setVisible(true);
        }//GEN-LAST:event_jButton1ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                // TODO add your handling code here:
		if(em_pf.getText().equals("")||usr_pf.getText().equals("")){
			JOptionPane.showMessageDialog(this,"Insert All Information to register!!");
			
		}else{
			String data[] = {usr_pf.getText(),em_pf.getText()};

			DefaultTableModel tblModel = (DefaultTableModel)disp_tb.getModel();
			tblModel.addRow(data);

			JOptionPane.showMessageDialog(this,"Registered Successfully!");
			em_pf.setText("");
			usr_pf.setText("");
			
			
		}
        }//GEN-LAST:event_jButton2ActionPerformed

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
			java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new profile().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTable disp_tb;
        private javax.swing.JTextField em_pf;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton8;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextField usr_pf;
        // End of variables declaration//GEN-END:variables
}