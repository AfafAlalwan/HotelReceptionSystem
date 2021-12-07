
public class Window extends javax.swing.JFrame {

    public Window() {
        initComponents();
        Hotel = new Hotel();
        Jpanel2.setVisible(false);
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Jcmb_type = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Jcmb_bed = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Jcmb_view = new javax.swing.JComboBox<>();
        Jbtn_book = new javax.swing.JButton();
        Jlbl_confirm = new javax.swing.JLabel();
        Jpanel2 = new javax.swing.JPanel();
        Jcmb_ava = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Jtext_Name = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        Jbtn_confirm = new javax.swing.JButton();
        Jrbt_checkin = new javax.swing.JRadioButton();
        Jrbt_chechOut = new javax.swing.JRadioButton();
        Jlbl_error = new javax.swing.JLabel();

        buttonGroup1.add(Jbtn_book);
        buttonGroup1.add(Jbtn_confirm);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book a Room");

        jLabel2.setText("Reserve a ");

        Jcmb_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Room", "Suite" }));
        Jcmb_type.setSelectedItem(null);
        Jcmb_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jcmb_typeActionPerformed(evt);
            }
        });

        jLabel3.setText("Type of");

        Jcmb_bed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jcmb_bedActionPerformed(evt);
            }
        });

        jLabel4.setText("View");

        Jcmb_view.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "with view", "without view" }));
        Jcmb_view.setSelectedIndex(-1);
        Jcmb_view.setSelectedItem(null);
        Jcmb_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jcmb_viewActionPerformed(evt);
            }
        });

        Jbtn_book.setText("Find a Room");
        Jbtn_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_bookActionPerformed(evt);
            }
        });

        Jlbl_confirm.setForeground(new java.awt.Color(0, 204, 51));

        Jcmb_ava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jcmb_avaActionPerformed(evt);
            }
        });

        jLabel5.setText("Select an Available Room");

        jLabel6.setText("Full Name:");

        jLabel7.setText("Phone Number:");

        jLabel8.setText("Check In/Out");

        Jtext_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtext_NameActionPerformed(evt);
            }
        });

        Jbtn_confirm.setText("Confirm Reservation");
        Jbtn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_confirmActionPerformed(evt);
            }
        });

        buttonGroup1.add(Jrbt_checkin);
        Jrbt_checkin.setText("Check-In");
        Jrbt_checkin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jrbt_checkinActionPerformed(evt);
            }
        });

        buttonGroup1.add(Jrbt_chechOut);
        Jrbt_chechOut.setText("Check_Out");

        javax.swing.GroupLayout Jpanel2Layout = new javax.swing.GroupLayout(Jpanel2);
        Jpanel2.setLayout(Jpanel2Layout);
        Jpanel2Layout.setHorizontalGroup(
            Jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jpanel2Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(Jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(46, 46, 46)
                .addGroup(Jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jrbt_checkin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jtext_Name)
                            .addComponent(Jcmb_ava, 0, 205, Short.MAX_VALUE)))
                    .addComponent(Jrbt_chechOut, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
            .addGroup(Jpanel2Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(Jbtn_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Jpanel2Layout.setVerticalGroup(
            Jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(Jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jcmb_ava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(Jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Jtext_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(Jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Jpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Jpanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8))
                    .addGroup(Jpanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Jrbt_checkin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jrbt_chechOut)))
                .addGap(36, 36, 36)
                .addComponent(Jbtn_confirm)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Jlbl_error.setForeground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Jbtn_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(105, 105, 105)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jcmb_bed, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jcmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jcmb_view, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Jpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(240, 240, 240))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Jlbl_error))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(Jlbl_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Jcmb_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Jcmb_bed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Jcmb_view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Jbtn_book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Jlbl_error)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Jlbl_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Jcmb_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jcmb_typeActionPerformed
        
        try {
            
        if(Jcmb_type.getSelectedItem().equals("Room")){
            
            Jcmb_bed.removeAllItems();
            Jcmb_bed.setSelectedItem(null);
            Jcmb_bed.addItem("Single Room");
            Jcmb_bed.addItem("Double Room");
            Jcmb_bed.addItem("King Room");
            Jcmb_bed.addItem("Queen Room");

        }else if(Jcmb_type.getSelectedItem().equals("Suite")){

           
            Jcmb_bed.removeAllItems();
            Jcmb_bed.setSelectedItem(null);
            Jcmb_bed.addItem("Master Suite");
            Jcmb_bed.addItem("Mini Suite");

        }
        } catch (Exception e) {
           //do nothing
        }
    }//GEN-LAST:event_Jcmb_typeActionPerformed

    private void Jcmb_bedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jcmb_bedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jcmb_bedActionPerformed

    private void Jcmb_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jcmb_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jcmb_viewActionPerformed

    private void Jbtn_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_bookActionPerformed
       
        try{
            
          if(Jcmb_type.getSelectedIndex() != -1 ||
            Jcmb_bed.getSelectedIndex() != -1 ||
            Jcmb_view.getSelectedIndex() != -1){
            
           Hotel.setIndecies(Jcmb_type.getSelectedIndex(), Jcmb_bed.getSelectedIndex(), Jcmb_view.getSelectedIndex());
           Jpanel2.setVisible(true);
           String[] options = Hotel.getAvailableRoom();
           Jcmb_ava.removeAllItems();
           Jcmb_ava.addItem(options[0]);
           Jcmb_ava.addItem(options[1]);     
           
        }else
            Jlbl_error.setText("Please Select all options");  
       
        }catch(Exception e){
            System.out.println("Meow2");
        }
        

    }//GEN-LAST:event_Jbtn_bookActionPerformed

    private void Jcmb_avaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jcmb_avaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jcmb_avaActionPerformed

    private void Jbtn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_confirmActionPerformed

        try{
            
            Node Room = Hotel.system.searchGetNode(Hotel.wantedRoom,(String)Jcmb_ava.getSelectedItem());

            if(Jrbt_checkin.isSelected()){
                Room.getQueue().enqueue(Jtext_Name.getText());
                Room.getQueue().outputList();
                clear();
                //room was reserved
                Jlbl_confirm.setText("Reserved successfully!");
     
            }else if(Jrbt_chechOut.isSelected()){
                 Room.getQueue().dequeue();
                 Room.getQueue().outputList();
                 clear();
                 //checked out
                 Jlbl_confirm.setText("Checked out!");
            }
        }catch(Exception noIdeaWhy){
            System.out.println(noIdeaWhy);
        }

    }//GEN-LAST:event_Jbtn_confirmActionPerformed

    private void Jrbt_checkinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jrbt_checkinActionPerformed

        
    }//GEN-LAST:event_Jrbt_checkinActionPerformed

    private void Jtext_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtext_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtext_NameActionPerformed

 
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    
    public void clear(){
        Jpanel2.setVisible(false);
        Jcmb_type.setSelectedItem(null);
        Jcmb_bed.setSelectedItem(null);
        Jcmb_view.setSelectedItem(null);
        
    }
    Hotel Hotel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_book;
    private javax.swing.JButton Jbtn_confirm;
    private javax.swing.JComboBox<String> Jcmb_ava;
    private javax.swing.JComboBox<String> Jcmb_bed;
    private javax.swing.JComboBox<String> Jcmb_type;
    private javax.swing.JComboBox<String> Jcmb_view;
    private javax.swing.JLabel Jlbl_confirm;
    private javax.swing.JLabel Jlbl_error;
    private javax.swing.JPanel Jpanel2;
    private javax.swing.JRadioButton Jrbt_chechOut;
    private javax.swing.JRadioButton Jrbt_checkin;
    private javax.swing.JTextField Jtext_Name;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
