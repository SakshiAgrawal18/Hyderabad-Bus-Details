package HYD_bus_details;
import HYD_bus_details.UserIP;
import HYD_bus_details.InitComp;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Connection extends javax.swing.JFrame {
  // static UserIP sc=new UserIP();
    
    private static Connection cn=null;
private static Statement stmt=null;

//UserIP2 s2 = new UserIP2();
//private static Statement stmt2=null;
    /*
     * Creates new form login
     */
     private static final String un="sakshi";
      private static final String passw="sakshi";
       private static final String url="jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull";
    public Connection() {
        initComponents();
        this.setLocationRelativeTo(null);
       jLabel2.setBackground(new Color(255,255,255,120));
       number.setBackground(new Color(153,153,153,80));
       name.setBackground(new Color(153,153,153,80));
        //jPanel3.setOpacity(0.85f);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        number = new javax.swing.JButton();
        name = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jFrame1.setAlwaysOnTop(true);
        jFrame1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAKSHI\\Desktop\\ITW\\f1.jpg")); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(700, 1000));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 482));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Forte", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("WELCOME TO GoBus@HYD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 70);

        jPanel2.setLayout(null);

        number.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        number.setText("Search By Bus Number");
        number.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        number.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberMouseClicked(evt);
            }
        });
        jPanel2.add(number);
        number.setBounds(210, 200, 180, 40);

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        name.setText("Search By Station Name");
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel2.add(name);
        name.setBounds(210, 130, 180, 40);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(130, 80, 330, 210);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAKSHI\\Desktop\\ITW\\f2.jpeg")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 630, 370);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 70, 650, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-Connection:event_numberMouseClicked
        // TODO add your handling code here:
      // new InitComp().setVisible(true);
       new InitComp().main();
        this.setVisible(false);
    }//GEN-LAST:event_numberMouseClicked

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-Connection:event_nameActionPerformed
        // TODO add your handling code here:
        //new hii().setVisible(true);
       // new UserIP().setVisible(true);
        new UserIP().main();
        this.setVisible(false);
    }//GEN-LAST:event_nameActionPerformed

    
    public static void main(String args[]) {
       
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
              cn=DriverManager.getConnection(url,un,passw);
              stmt=cn.createStatement();System.out.println("connect");
           }
           catch(Exception e){
               e.printStackTrace();
           }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connection().setVisible(true);
                //sc.setVisible(false);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton name;
    private javax.swing.JButton number;
    // End of variables declaration//GEN-END:variables
}
