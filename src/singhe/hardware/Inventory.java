
package singhe.hardware;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Inventory extends javax.swing.JFrame {

    public Inventory() {
        initComponents();
         try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/singhe_hardware_db","root","Samitha@15");
            Statement st=con.createStatement();
            String query="select curdate() as date;";
            ResultSet rs=st.executeQuery(query);
            rs.next();
            date.setText(rs.getString("date"));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPannel = new javax.swing.JPanel();
        paymentBtn = new javax.swing.JButton();
        cusBtn = new javax.swing.JButton();
        supBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        inventoryBtn = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        mainPannel2 = new javax.swing.JPanel();
        viewbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        submitbtn = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        productName = new javax.swing.JTextField();
        productNameLabel = new javax.swing.JLabel();
        supId = new javax.swing.JTextField();
        supIdLabel = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        genarateBill = new javax.swing.JButton();
        amount = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1450, 750));
        setResizable(false);

        btnPannel.setBackground(new java.awt.Color(255, 255, 255));
        btnPannel.setPreferredSize(new java.awt.Dimension(366, 703));

        paymentBtn.setBackground(new java.awt.Color(155, 55, 0));
        paymentBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paymentBtn.setForeground(new java.awt.Color(255, 255, 255));
        paymentBtn.setText("Payment");
        paymentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentBtnMouseClicked(evt);
            }
        });
        paymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBtnActionPerformed(evt);
            }
        });

        cusBtn.setBackground(new java.awt.Color(155, 55, 0));
        cusBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cusBtn.setForeground(new java.awt.Color(255, 255, 255));
        cusBtn.setText("Customer Details");
        cusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusBtnActionPerformed(evt);
            }
        });

        supBtn.setBackground(new java.awt.Color(155, 55, 0));
        supBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        supBtn.setForeground(new java.awt.Color(255, 255, 255));
        supBtn.setText("Supplier Details");
        supBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supBtnActionPerformed(evt);
            }
        });

        homeBtn.setBackground(new java.awt.Color(155, 55, 0));
        homeBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setText("Home");
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
        });

        inventoryBtn.setBackground(new java.awt.Color(155, 55, 0));
        inventoryBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inventoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        inventoryBtn.setText("Inventory");
        inventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryBtnActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(150, 55, 0));
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(155, 55, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reports");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnPannelLayout = new javax.swing.GroupLayout(btnPannel);
        btnPannel.setLayout(btnPannelLayout);
        btnPannelLayout.setHorizontalGroup(
            btnPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPannelLayout.createSequentialGroup()
                .addGroup(btnPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnPannelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(btnPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(btnPannelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        btnPannelLayout.setVerticalGroup(
            btnPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPannelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(cusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(supBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(inventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPannel2.setBackground(new java.awt.Color(255, 255, 255));
        mainPannel2.setPreferredSize(new java.awt.Dimension(944, 589));
        mainPannel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewbtn.setBackground(new java.awt.Color(155, 55, 0));
        viewbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewbtn.setForeground(new java.awt.Color(255, 255, 255));
        viewbtn.setText("View Product Details");
        viewbtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        mainPannel2.add(viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, 300, 34));

        clearbtn.setBackground(new java.awt.Color(155, 55, 0));
        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        mainPannel2.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 172, 35));

        submitbtn.setBackground(new java.awt.Color(155, 55, 0));
        submitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitbtn.setForeground(new java.awt.Color(255, 255, 255));
        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });
        mainPannel2.add(submitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 172, 35));

        dateLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dateLabel.setText("Date                    :");
        dateLabel.setPreferredSize(new java.awt.Dimension(186, 22));
        mainPannel2.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        priceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        priceLabel.setText("Price                    :");
        mainPannel2.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 180, -1));

        price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        price.setPreferredSize(new java.awt.Dimension(59, 29));
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceKeyReleased(evt);
            }
        });
        mainPannel2.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 242, 27));

        productName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productName.setPreferredSize(new java.awt.Dimension(59, 22));
        mainPannel2.add(productName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 242, 30));

        productNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        productNameLabel.setText("Product Name        :");
        mainPannel2.add(productNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 186, -1));

        supId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        supId.setPreferredSize(new java.awt.Dimension(59, 22));
        supId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supIdActionPerformed(evt);
            }
        });
        mainPannel2.add(supId, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 211, 242, 30));

        supIdLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        supIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        supIdLabel.setText("Supplier Id             :");
        mainPannel2.add(supIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 212, 186, -1));

        header.setFont(new java.awt.Font("Tempus Sans ITC", 0, 48)); // NOI18N
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Add Product");
        mainPannel2.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 323, -1));

        logo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kukka_8-removebg-preview.png"))); // NOI18N
        mainPannel2.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 249, 98));

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mainPannel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 230, 30));

        quantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quantity.setPreferredSize(new java.awt.Dimension(59, 29));
        quantity.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                quantityPropertyChange(evt);
            }
        });
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityKeyReleased(evt);
            }
        });
        mainPannel2.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 242, 30));

        quantityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        quantityLabel.setText("Quantity               :");
        mainPannel2.add(quantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 210, 20));

        genarateBill.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        genarateBill.setText("Genarate Bill");
        genarateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genarateBillActionPerformed(evt);
            }
        });
        mainPannel2.add(genarateBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, 180, 40));

        amount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mainPannel2.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 250, 30));

        totalLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalLabel.setText("Total Amount        :");
        totalLabel.setPreferredSize(new java.awt.Dimension(186, 22));
        mainPannel2.add(totalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnPannel, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPannel2, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPannel, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
            .addComponent(mainPannel2, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.setVisible(false);
        LogIn login = new LogIn();
        login.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void inventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryBtnActionPerformed
        Stock stock = new Stock();
        this.dispose();
        stock.setVisible(true);
    }//GEN-LAST:event_inventoryBtnActionPerformed

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        this.setVisible(false);
        Dashboard dasboard = new Dashboard();
        dasboard.setVisible(true);
    }//GEN-LAST:event_homeBtnMouseClicked

    private void paymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentBtnActionPerformed

    private void paymentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentBtnMouseClicked
        this.setVisible(false);
        Payment payment=new Payment();
        payment.setVisible(true);
    }//GEN-LAST:event_paymentBtnMouseClicked

    private void supBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supBtnActionPerformed
       this.dispose();
       SupplierDetails supDetails = new SupplierDetails();
       supDetails.setVisible(true);
    }//GEN-LAST:event_supBtnActionPerformed

    private void cusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusBtnActionPerformed
        this.dispose();
        CustomerDetails cusDetails = new CustomerDetails();
        cusDetails.setVisible(true);
    }//GEN-LAST:event_cusBtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        Stock stock = new Stock();
        this.dispose();
        stock.setVisible(true);
    }//GEN-LAST:event_viewbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        productName.setText("");
        supId.setText("");
        date.setText("");
        amount.setText("");
        quantity.setText("");
        price.setText("");
    }//GEN-LAST:event_clearbtnActionPerformed

    private void supIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supIdActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to add a product?");
        if(input == JOptionPane.YES_OPTION){
            int sid=Integer.valueOf(supId.getText());
            String pname=productName.getText();
            int pr=Integer.valueOf(price.getText());
            int q=Integer.valueOf(quantity.getText());
            int t=Integer.valueOf(amount.getText().substring(4));
            try {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/singhe_hardware_db","root","Samitha@15");
                Statement st=con.createStatement();
                String query="insert into product(supplier_id,product_name,date,price,quantity) values("+sid+",'"+pname+"',curdate(),"+pr+","+q+");";
                int rs=st.executeUpdate(query);
                query="insert into productbill(supplier_id,product_name,date,price,quantity,total) values("+sid+",'"+pname+"',now(),"+pr+","+q+","+t+");";
                rs=st.executeUpdate(query);
                JOptionPane.showMessageDialog(this,"Product Added");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,"Can't Add Product \n Please Try Again!\n(chek your supplier id)");
                System.out.println(e.getMessage());
                supId.setText("");
                productName.setText("");
                price.setText("");
            }
        }
    }//GEN-LAST:event_submitbtnActionPerformed

    private void quantityPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_quantityPropertyChange
        
    }//GEN-LAST:event_quantityPropertyChange

    private void genarateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genarateBillActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to make a payment?");
        if(input == JOptionPane.YES_OPTION){
            ProductBill pb=new ProductBill();
            pb.setVisible(true);
        }
    }//GEN-LAST:event_genarateBillActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(new LogIn().role.equals("Owner")){
            Reports r=new Reports();
            this.dispose();
            r.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyReleased
        try{
            int t=Integer.valueOf(price.getText())*Integer.valueOf(quantity.getText());
            amount.setText("Rs. "+String.valueOf(t));
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_priceKeyReleased

    private void quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyReleased
        try{
            int t=Integer.valueOf(price.getText())*Integer.valueOf(quantity.getText());
            amount.setText("Rs. "+String.valueOf(t));
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_quantityKeyReleased

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount;
    private javax.swing.JPanel btnPannel;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton cusBtn;
    private javax.swing.JLabel date;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton genarateBill;
    private javax.swing.JLabel header;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton inventoryBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel logo2;
    private javax.swing.JButton logout;
    private javax.swing.JPanel mainPannel2;
    private javax.swing.JButton paymentBtn;
    private javax.swing.JTextField price;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField productName;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JButton submitbtn;
    private javax.swing.JButton supBtn;
    private javax.swing.JTextField supId;
    private javax.swing.JLabel supIdLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
