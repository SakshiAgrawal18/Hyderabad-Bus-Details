package HYD_bus_details;
import java.awt.Color;
import javax.swing.JFrame;
//import Algo.java;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.lang.Object;
import java.sql.Timestamp;
import java.text.Collator;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.beans.binding.Bindings.select;
import static javafx.beans.binding.Bindings.select;
//import java.alarmLog;

public class UserIP extends javax.swing.JFrame {

/*int timeOut = 1000 * 60 * 30; // 30 minutes
String lastActivity = new Date().getTime();
int checkTimeout;
checkTimeOut = function(){
    if(new Date().getTime() > lastActivity + timeOut){
        // redirect to timeout page
    }else{
        window.setTimeout(checkTimeOut, 1000); // check once per UserIP
    }
}*/
 // static

    /**
     *
     * @param s
     */
//public static void function(String s); 
private static Connection cn=null;
private static Statement stmt=null;
private static Statement stmt1=null;
private static Statement stmt2=null;
private static Statement stmt3=null;
private static Statement stmt4=null;
private static Statement stmt5=null;
private static ResultSet rs=null;
private static ResultSet rs1=null;
private static ResultSet rs2=null;
private static ResultSet rs3=null;
private static ResultSet rs4=null;
private static ResultSet rsf=null;
//private static Algo th = new Algo();
public static Algo th;

java.sql.Time wt1= java.sql.Time.valueOf("23:59:59");
                java.sql.Time wt2= java.sql.Time.valueOf("23:59:59");
                java.sql.Time wt3= java.sql.Time.valueOf("23:59:59");
                
//private static Statement stmt2=null;
    /*
     * Creates new form login
     */
     private static final String un="sakshi";
      private static final String passw="sakshi";
       private static final String url="jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull";

          
    public UserIP() {
        initComponents();
        this.setLocationRelativeTo(null);
        jLabel2.setBackground(new Color(255,255,255,100));
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        h1 = new javax.swing.JSpinner();
        proceed = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        m1 = new javax.swing.JSpinner();
        dl = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        pl = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("WELCOME TO GoBus@HYD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel2.setLayout(null);

        reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset);
        reset.setBounds(170, 260, 80, 40);

        jLabel6.setText("[24 hour format]");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(350, 230, 100, 20);

        h1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jPanel2.add(h1);
        h1.setBounds(340, 200, 50, 30);

        proceed.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        proceed.setText("PROCEED");
        proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedActionPerformed(evt);
            }
        });
        jPanel2.add(proceed);
        proceed.setBounds(380, 260, 90, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("ENTER TIME:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(180, 200, 120, 30);

        m1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPanel2.add(m1);
        m1.setBounds(409, 200, 50, 30);

        dl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<select>", "Afzalgunj Bus Stop", "Gowliguda", "CBS Bus Stop", "PutliBowli", "Koti Bus Stop", "RamKoti", "BadiChowdi", "Madapati Hanumantha school", "YMCA(Koti)Bus Stop", "Narayanguda", "Chikkadpally", "RTC Cross Road", "Golconda X Roads", "Sapthagiri", "Raja Delux", "Musheerabad Bus Stop", "Jali Garden", "Gandhi Hospital", "Padmarao Nagar", "Bhoiguda", "Secunderabad Junctio", "Sangeeth", "Shenoy Nursing Home", "East Marredpally", "Adda Gutta", "Tukaram Gate", "LB Nagar Bus Stop", "Kothapet Bus Stop", "Chaitanyapuri", "Disukhnagar Bus Ststion", "Mosarambagh" }));
        jPanel2.add(dl);
        dl.setBounds(340, 140, 140, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("DROP-LOCATION:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(170, 140, 110, 30);

        pl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<select>", "Afzalgunj Bus Stop", "Gowliguda", "CBS Bus Stop", "PutliBowli", "Koti Bus Stop", "RamKoti", "BadiChowdi", "Madapati Hanumantha school", "YMCA(Koti)Bus Stop", "Narayanguda", "Chikkadpally", "RTC Cross Road", "Golconda X Roads", "Sapthagiri", "Raja Delux", "Musheerabad Bus Stop", "Jali Garden", "Gandhi Hospital", "Padmarao Nagar", "Bhoiguda", "Secunderabad Junctio", "Sangeeth", "Shenoy Nursing Home", "East Marredpally", "Adda Gutta", "Tukaram Gate", "LB Nagar Bus Stop", "Kothapet Bus Stop", "Chaitanyapuri", "Disukhnagar Bus Ststion", "Mosarambagh" }));
        jPanel2.add(pl);
        pl.setBounds(340, 90, 140, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("PICK-UP LOCATION:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(170, 90, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(100, 60, 440, 270);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAKSHI\\Desktop\\ITW\\it1.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private  int function(String p, String d,int h, int m, String sb) throws SQLException{
                rs3=stmt3.executeQuery("SELECT * FROM bus_root.search WHERE STATION='"+p+"'");
                
                 
                String b1=null,b2=null,b3=null;
                  //Algo th=new Algo(p,d);
                  int flag=0;
                 //th.wt1.setText("dfghj");
                
                while(rs3.next())
                        {
                            //System.out.println("found");
                            String num=rs3.getString("BUS_NO");
                            //System.out.println(num);
                            rs4= stmt4.executeQuery("SELECT * FROM bus_root.search WHERE BUS_NO='"+num+"'");
                            int flag1=0;
                            while(rs4.next())
                            {   if(rs4.getString("STATION").equals(p))
                                 {
                                     flag1=1;
                                 }
                            if(flag1==1)
                            {
                                if(rs4.getString("STATION").equals(d))
                                {
                                    flag=1;
                                    rsf=stmt5.executeQuery("SELECT * FROM bus_root.search WHERE BUS_NO='"+num+"' and STATION='"+p+"'");
                                    //System.out.println("found final");
                                   if (flag==1)
                                    {
                                        while(rsf.next())
                                        {
                                            java.sql.Time temp= rsf.getTime("time");
                                            //System.out.println(temp);
                                            java.sql.Time f= rsf.getTime("frequency");
                                            String f1=f.toString();
                                            String splitTime[]=f1.split(":");
                                            long ff= Long.parseLong(splitTime[1]);
                                            java.sql.Time time= java.sql.Time.valueOf(h+":"+m+":00");
                                            //System.out.println(time);
                                            //System.out.println(temp);
                                            while(temp.before(time))
                                            {
                                                LocalTime lt=temp.toLocalTime();
                                                lt=lt.plusMinutes(ff);
                                                long ms= temp.getTime()+ff;
                                                String op = lt.toString();
                                                //System.out.println(op);
                                                SimpleDateFormat tp= new SimpleDateFormat("HH:MM:SS");
                                                String time2= tp.format(new Date(ms));
                                                String split[]=op.split(":");
                                                String hr=split[0];
                                                String mi=split[1];
                                                java.sql.Time tim= java.sql.Time.valueOf(hr+":"+mi+":00");
                                                //System.out.println(tim);
                                                temp=tim;
                                            }
                                            if(temp.before(wt1))
                                            {
                                                wt3=wt2;
                                                wt2=wt1;
                                                wt1=temp;
                                                b3=b2;
                                                b2=b1;
                                                b1=rsf.getString("BUS_NO");
                                            }
                                            else if(temp.before(wt2))
                                            {
                                                wt3=wt2;
                                                //wt2=wt1;
                                                wt2=temp;
                                                b3=b2;
                                               // b2=b1;
                                                b2=rsf.getString("BUS_NO");
                                            }
                                            else if(temp.before(wt3))
                                            {
                                               // wt3=wt2;
                                               // wt2=wt1;
                                                wt3=temp;
                                               // b3=b2;
                                                //b2=b1;
                                                b3=rsf.getString("BUS_NO");
                                            }
                                            //System.out.println(wt1);
                                            //System.out.println(wt2);
                                            //System.out.println(wt3);
                                        }
                                        //System.out.println(b1);
                                        //System.out.println(b2);
                                   }
                                    //break;
                                }
                                }
                            }
                            
                            }
               // //System.out.println("hmmmmmm");
                           if(sb!=null)
                           {if(b1!=null){
                th.bn1.setText(sb+b1.toString());
                th.wt1.setText(wt1.toString());
                if(b2!=null){
                th.bn2.setText(sb+b2.toString());
                 th.wt2.setText(wt2.toString());}
                if(b3!=null){
                th.bn3.setText(sb+b3.toString());
                th.wt3.setText(wt3.toString());}
               
                th.setVisible(true); this.setVisible(false);}}
                           else
                           {if(b1!=null){
                th.bn1.setText(b1.toString());
                th.wt1.setText(wt1.toString());
                if(b2!=null){
                th.bn2.setText(b2.toString());
                 th.wt2.setText(wt2.toString());}
                if(b3!=null){
                th.bn3.setText(b3.toString());
                th.wt3.setText(wt3.toString());}
               
                th.setVisible(true); this.setVisible(false);}}

                       //    //System.out.println("you are hereeeee");
               /* else{
                    JOptionPane.showMessageDialog(null,"OOPS!! ERROR 404 BUS NOT FOUND :(");
                }*/
                           // return flag;
    if(th.wt1.getText().equalsIgnoreCase("23:59:59"))
    {
        return(0);
    }
    return(1);
 }
    private void proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedActionPerformed
        // TODO add your handling code here:
        String p=pl.getSelectedItem().toString();
       String d= dl.getSelectedItem().toString();
       int h= (int)h1.getValue();
       int m= (int)m1.getValue();
      
      th=new Algo(p,d);
       th.wt1.setText("23:59:59");
      th.wt2.setText("23:59:59");
      th.wt3.setText("23:59:59");
      
      
       int flag=0;

        if(h<6 || h>23)
        {
            JOptionPane.showMessageDialog(null,"sorry! services close at this hour!");
        }
        else if(p.equalsIgnoreCase("<select>") ||d.equalsIgnoreCase("<select>"))
        {
            JOptionPane.showMessageDialog(null,"select any valid location");

        }
        else if(p.equals(d))
        {
            JOptionPane.showMessageDialog(null,"select different locations");
        }
        /*else if(d.equals("Afzalgunj Bus Stop") && p.equals("LB Nagar Bus Stop"))
        {
            th.bn1.setText("1L - 1P");
                th.wt1.setText("08:40 - 10:15");
                th.bn2.setText("1L - 1/92R");
                th.wt2.setText("09:00 - 11:05");
                
                th.setVisible(true); this.setVisible(false);

        }*/
        else
        {
            try {//System.out.println("hii");
            
           
              int i=function(p,d,h,m,null)
             //if(i==1)
            // //System.out.println("you are hereeeee2"+th.wt1.getText());
                //if(th.wt1.getText().equalsIgnoreCase("23:59:59"))
                if(i==0)
                { ////System.out.println("UserIP case");
                   // //System.out.println("found");
                           // String num=rs1.getString("BUS_NO");
                            rs1= stmt1.executeQuery("SELECT * FROM bus_root.search WHERE STATION='"+p+"'");
                            while(rs1.next())
                            {   //System.out.println("first loop");
                                String num=rs1.getString("BUS_NO");
                            rs2= stmt2.executeQuery("SELECT * FROM bus_root.search WHERE BUS_NO='"+num+"'");
                            int flag1=0;
                            while(rs2.next())
                            {// //System.out.println("UserIP loop");
                                if(rs2.getString("STATION").equalsIgnoreCase(p))
                                {
                                    flag1=1;
                                }
                                if(flag1==1)
                                {
                                   // rs2.next(); 
                                   // //System.out.println(rs2.getString("STATION"));
                                    int j =function(rs2.getString("STATION"),d,h,m,num);
                                }
                                
                                
                            }
                            
                            }
                            //flag1=0;
                }
               // Algo th=new Algo(p,d);
               //Algo th=new Algo();
               if(th.wt1.getText().equalsIgnoreCase("23:59:59"))
               {
                   JOptionPane.showMessageDialog(null,"sorry no buses found in this route");
               }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(UserIP.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
    }//GEN-LAST:event_proceedActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        pl.setSelectedItem("<select>");
        dl.setSelectedItem("<select>");
        h1.setValue(0);
        m1.setValue(0);

        
    }//GEN-LAST:event_resetActionPerformed
    
 /*  public void run1()
   {
       Calendar cal=new GregorianCalendar();
               int minute=cal.get(Calendar.MINUTE);
         int min;
            while(true){
                     Calendar cal1=new GregorianCalendar();
                min=cal1.get(Calendar.MINUTE); //System.out.println(min); 
      if(min>minute)
      {
          //System.out.println("session out");
          JOptionPane.showMessageDialog(null, "Session expired");
          new UserIP().setVisible(false);
          new first().setVisible(true);
          
          
      break;
      }
                }
   }*/
    public static void main() {
        Calendar cal=new GregorianCalendar();
      // SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
      //new UserIP().setVisible(true);
      ////System.out.println("hutt"); 
       int minute=cal.get(Calendar.MINUTE);
       //System.out.println(minute);
        try {
              cn=DriverManager.getConnection(url,un,passw);
              stmt=cn.createStatement();////System.out.println("connect");
              stmt1=cn.createStatement();////System.out.println("connect");
              stmt2=cn.createStatement();
              stmt3=cn.createStatement();
              stmt4=cn.createStatement();
              stmt5=cn.createStatement();
              
////System.out.println("connect");
           }
           catch(Exception e){
               e.printStackTrace();
           }
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserIP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new UserIP().setVisible(true); //System.out.println("hutt"); }/*Calendar cal1=new GregorianCalendar();
                int min=cal1.get(Calendar.MINUTE);
               // delay(500);
            while(!proceed.isSelected() && cal1.get(Calendar.MINUTE)<=minute){
                     
               min=cal1.get(Calendar.MINUTE); //System.out.println(min); 
                if(proceed.isSelected())
                {
                    
                    break;
                }
            }
      if(min>minute)
      {
          //System.out.println("session out");
          JOptionPane.showMessageDialog(null, "Session expired");
          

          new UserIP().setVisible(false);
          //new first().setVisible(true);
          
          
      //break;
      }*/
                
            
            
            
        }
                
                
        );
        

      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> dl;
    public javax.swing.JSpinner h1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JSpinner m1;
    public javax.swing.JComboBox<String> pl;
    static javax.swing.JButton proceed;
    public javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables

   }
