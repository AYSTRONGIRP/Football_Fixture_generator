/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author UMANG
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager; 
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class reg extends javax.swing.JFrame {

    /**
     * Creates new form reg
     */
    public reg() {
        initComponents();
        table_update();
       // RoundRobinFixtureGenerator();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        teamName = new javax.swing.JTextField();
        captianName = new javax.swing.JTextField();
        mobileNo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        fixtureArea = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Team Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        jPanel1.setToolTipText("sajasl");

        jLabel2.setText("Team Name");

        jLabel3.setText("Captian Name");

        jLabel4.setText("Team Mobile No.");

        teamName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamNameActionPerformed(evt);
            }
        });

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(39, 39, 39)
                .addComponent(jButton2)
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(captianName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teamName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobileNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(teamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(captianName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Football Management Database");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Team Name", "Captian Name", "Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        fixtureArea.setColumns(20);
        fixtureArea.setRows(5);
        jScrollPane2.setViewportView(fixtureArea);

        jButton3.setText("Generate FIxture");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        Connection con1 ;
        PreparedStatement insert;
        
        private void table_update()
        {
            int c ;
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/football", "root" , "");
            insert = con1.prepareStatement("select * from teams");
            
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rss =rs.getMetaData() ;
            
            c = rss.getColumnCount();
            
            DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
            Df.setRowCount(0);
            
            while(rs.next()){
                Vector vs = new Vector();
                
                for(int a = 1 ; a<=c ; a++)
                {
                        vs.add(rs.getString("id"));
                        vs.add(rs.getString("TeamName"));
                        vs.add(rs.getString("CaptianName"));
                        vs.add(rs.getString("Mobile"));
                }
                
            Df.addRow(vs);
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        
         
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = teamName.getText();
        String mobile = mobileNo.getText();
        String course = captianName.getText();
        
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/football", "root" , "");
            insert = con1.prepareStatement("insert into teams(TeamName,Mobile,CaptianName)value(?,?,?)");
            insert.setString(1,name);
            insert.setString(2,mobile);
            insert.setString(3,course);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Team added");
            table_update();
            teamName.setText("");
            mobileNo.setText("");
            captianName.setText("");
            
            teamName.requestFocus();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
        try {
             
             int id =Integer.parseInt(Df.getValueAt(selectedIndex,0).toString());
             
             int dialogresult = JOptionPane.showConfirmDialog(null,"Do you want to delete the record", "warning", JOptionPane.YES_NO_OPTION);
                     
             if(dialogresult == JOptionPane.YES_OPTION)
             {
                 Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/football", "root" , "");
            insert = con1.prepareStatement("delete from teams where id = ?");
            
            insert.setInt(1,id);
            insert.executeUpdate();  
            
            JOptionPane.showMessageDialog(this,"course deleted");
            table_update();
            teamName.setText("");
            mobileNo.setText("");
            captianName.setText("");
            
            teamName.requestFocus();
             }
            
                     
                          
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void teamNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teamNameActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
    }//GEN-LAST:event_jTable1MouseClicked
public class CircularLinkedList {
    LinkedList<Integer> list;
    
    public CircularLinkedList() {
        this.list = new LinkedList<Integer>();
    }
    
    // method to insert a node at the end of the linked list
    public void insert(int data) {
        this.list.add(data);
    }
    
    // method to rotate the linked list to the left
    public void rotateLeft() {
        int first = this.list.removeFirst();
        this.list.addLast(first);
    }
    
    // method to print the linked list
    public void print() {
        System.out.println(this.list);
    }
     public int get(int index) {
        if (list.isEmpty()) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        int adjustedIndex = index % list.size();
        if (adjustedIndex < 0) {
            adjustedIndex += list.size();
        }

        return list.get(adjustedIndex);
    }
}
    private String generateFixtureList(String[] teams) {
        int numTeams = teams.length;

        // check for odd number of teams
        boolean odd = false;
        if (numTeams % 2 != 0) {
            odd = true ;
        }

        // create array for fixture list
        String[][] fixtureList = new String[numTeams-1][numTeams/2];

        // initialize fixture list
        //for (int i = 0; i < numTeams/2; i++) {
            //fixtureList[0][i] = teams[i] + " vs " + teams[numTeams-i-1];
        //}
        
        CircularLinkedList list = new CircularLinkedList();
        for(int i = 1 ; i < numTeams ; i++)
        {
            list.insert(i);
            //list.print();
        }
        
        for (int i = 0; i < numTeams-1; i++) { //no. of rounds
            int team1 = 0 ;
            int team2 = list.get(0);
            int match_no = 1;
            fixtureList[i][0] = teams[team1] + " vs " + teams[team2];
            for (int j = 1; j < numTeams-2; j++) {// matches in each round
                 
                team1 = list.get(j);
                System.out.println("u"+ team1 +" "  +j) ;
                 j++;
                 team2 = list.get(j);
                 System.out.println(team2);
                 System.out.println("mtno" + match_no);
                 fixtureList[i][match_no] = teams[team1] + " vs " + teams[team2];
                 match_no++;
                //System.out.println(team1 + ' ' +team2);
                
            }
            System.out.println();
            list.rotateLeft();
        }

        // format fixture list as string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numTeams-1; i++) {
            sb.append("Round ").append(i+1).append("\n");
            System.out.println("i" + " "+ i);
            for (int j = 0; j < numTeams/2; j++) {
                System.out.println("j" + "i "+  j +" " + i);
                System.out.println(fixtureList[i][j]);
                sb.append(fixtureList[i][j]).append("\n");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            //int numTeams = Integer.parseInt(teamsField.getText());
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/football", "root" , "");
        
             String sql = "SELECT COUNT(*) FROM teams";

            // Execute the SQL query and retrieve the result set
            
        
            Statement stmt = con1.createStatement();
        
             
        
            ResultSet rs = stmt.executeQuery(sql);
        

            // Retrieve the count of rows from the result set
            int numTeams = 0;
        try {
            if (rs.next()) {
                numTeams = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        // create array of teams
        String[] teams = new String[numTeams];
        
        String s = numTeams +" ";
        teamName.setText(s);
        
        sql = "SELECT TeamName FROM teams";

            // Execute the SQL query and retrieve the result set
            Statement stmt1 = con1.createStatement();
            ResultSet rs1 = stmt1.executeQuery(sql);
            
        ArrayList<String> columnValues = new ArrayList<>();
            while (rs1.next()) {
                columnValues.add(rs1.getString("TeamName"));
            }
            int counter=0;
        for (String value : columnValues) {
            
                teams[counter]=value;
                System.out.println(value);
                counter++;
            }
        // generate fixture list
        String fixtureList = generateFixtureList(teams);

        // display fixture list
        fixtureArea.setText(fixtureList);
        } catch (SQLException ex) {
            Logger.getLogger(reg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    
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
            java.util.logging.Logger.getLogger(reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new reg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField captianName;
    private javax.swing.JTextArea fixtureArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mobileNo;
    private javax.swing.JTextField teamName;
    // End of variables declaration//GEN-END:variables
}
