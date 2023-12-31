/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.boutiqueapp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;


public class Facturation extends javax.swing.JFrame {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/java";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Novel222@@@";

    // Database connection
    private Connection connection;
    
    public String product_name;
    public String category;
    public float price;
    public String date;
    public float quantity;
    public boolean headerAdded = false;
    private float total_price = 0;
    private Home homeFrame;
    /**
     * Constructor new form Facturation
     */
     public Facturation(Home homeFrame) { // Accept the reference as a parameter
        initComponents();
        this.homeFrame = homeFrame; // Assign the parameter to the instance variable

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                // Set the visibility of the Home frame to true when Facturation frame is closed
                homeFrame.setVisible(true);
            }
        });

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            System.out.println("Connected to the database");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Facturation_table = new javax.swing.JTable();
        add_btn = new javax.swing.JButton();
        generate_btn = new javax.swing.JButton();
        print_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Facture_text_area = new javax.swing.JTextArea();
        home_button_icon = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        products_display_table = new javax.swing.JTable();
        search_feild = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Facturation_table.setAutoCreateRowSorter(true);
        Facturation_table.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Facturation_table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Facturation_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Product name", "Category", "Price", "quantity", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Facturation_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Facturation_table.setRowHeight(30);
        Facturation_table.setSelectionForeground(new java.awt.Color(242, 242, 242));
        Facturation_table.setShowGrid(true);
        Facturation_table.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Facturation_tableInputMethodTextChanged(evt);
            }
        });
        jScrollPane2.setViewportView(Facturation_table);

        add_btn.setBackground(new java.awt.Color(51, 255, 51));
        add_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add_btn.setText("Add Product");
        add_btn.setAutoscrolls(true);
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        generate_btn.setBackground(new java.awt.Color(51, 255, 51));
        generate_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        generate_btn.setText("Generate Bell");
        generate_btn.setAutoscrolls(true);
        generate_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_btnActionPerformed(evt);
            }
        });

        print_button.setBackground(new java.awt.Color(0, 153, 255));
        print_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        print_button.setText("Print");
        print_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_buttonActionPerformed(evt);
            }
        });

        Facture_text_area.setColumns(20);
        Facture_text_area.setFont(new java.awt.Font("SimSun", 3, 14)); // NOI18N
        Facture_text_area.setRows(5);
        jScrollPane1.setViewportView(Facture_text_area);

        home_button_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\boutiqueApp\\src\\main\\java\\com\\mycompany\\boutiqueapp\\images\\accueil.png")); // NOI18N
        home_button_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_button_iconActionPerformed(evt);
            }
        });

        products_display_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Article", "Price", "Description", "Mark", "Category_id", "Category name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(products_display_table);

        search_feild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_feildActionPerformed(evt);
            }
        });

        search_button.setBackground(new java.awt.Color(51, 153, 255));
        search_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search_button.setForeground(new java.awt.Color(255, 255, 255));
        search_button.setText("Search");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search_feild, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(home_button_icon)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add_btn)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(543, Short.MAX_VALUE)
                .addComponent(print_button)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(generate_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(home_button_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(add_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_feild, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_button))
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generate_btn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(print_button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
            DefaultTableModel model = (DefaultTableModel) Facturation_table.getModel();

                int rowCount = model.getRowCount();
                int columnCount = model.getColumnCount();
                
                if (Facturation_table.getRowCount() > 0) {
                    if (!headerAdded) {
                         // Add the header to the text area
                            String header = String.format("%-20s %-15s %-10s %-10s %-15s%n",
                                "Product name", "Category", "Price", "Quantity", "Date");
                            String dashedLine = "----------------------------------------------------------- \n ";

                            Facture_text_area.setText(header + dashedLine);
                        // Set the flag to true, indicating that the header has been added
                        headerAdded = true;
                    }
                        // Get the value from the first row, first column
                    Object value = Facturation_table.getValueAt(0, 0);

                    // Check if value is not null before using it
                    if (value != null) {
                        this.product_name = value.toString();
                    } else {
                        this.product_name = ""; // or handle the null case as appropriate
                    }

                    this.category = Facturation_table.getValueAt(0, 1) != null ? Facturation_table.getValueAt(0, 1).toString() : "";

                    Object value1 = Facturation_table.getValueAt(0, 2);
                    var price_unitaire = value1 != null ? Float.parseFloat(value1.toString()) : 0.0f; // or handle the null case as appropriate

                    Object value2 = Facturation_table.getValueAt(0, 3);
                    this.quantity = value2 != null ? Float.parseFloat(value2.toString()) : 0.0f; // or handle the null case as appropriate
                    this.price= price_unitaire*  this.quantity;
                    this.total_price+=this.price;
                    this.date = Facturation_table.getValueAt(0, 4) != null ? Facturation_table.getValueAt(0, 4).toString() : "";
//                    ajouter a base de donnees 
                    try {
                        Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

                        // SQL statement to insert data into the 'factures' table
                        String insertQuery = "INSERT INTO factures (product_name, category, price, quantity, date) VALUES (?, ?, ?, ?, ?)";

                        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                            preparedStatement.setString(1, this.product_name);
                            preparedStatement.setString(2, this.category);
                            preparedStatement.setFloat(3, this.price);
                            preparedStatement.setFloat(4, this.quantity);
                            preparedStatement.setString(5, this.date);

                            int rowsAffected = preparedStatement.executeUpdate();
                            System.out.println(rowsAffected + " row(s) inserted into the database.");
                        }
                    } catch (SQLException e) {
                        System.err.println("Error inserting data into the database: " + e.getMessage());
                    }
//                        ecrire dans Text area 
                    String newText = String.format("%-20s %-15s %-10.2f %-10.2f %-15s%n",
                    product_name, category, price, quantity, date);

                    // Append the new text to the existing text in facture_text_zoon
                    Facture_text_area.setText(Facture_text_area.getText() + newText + "\n");

                 }

                // Iterate through each cell and set its value to null or an empty string
                for (int row = 0; row < rowCount-1; row++) {
                        for (int col = 0; col < columnCount; col++) {
                        model.setValueAt(null, row, col); // or use an empty string: model.setValueAt("", row, col);
                    }
                }
    }//GEN-LAST:event_add_btnActionPerformed

    private void generate_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_btnActionPerformed

        Facture_text_area.append(String.format("%nTotal Price: %.2f%n", total_price));

    }//GEN-LAST:event_generate_btnActionPerformed

    private void Facturation_tableInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Facturation_tableInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Facturation_tableInputMethodTextChanged

    private void print_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_buttonActionPerformed
        PrinterJob printerJob = PrinterJob.getPrinterJob();

        if (printerJob.printDialog()) {
            printerJob.setPrintable(new Printable() {
                @Override
                public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                    if (pageIndex > 0) {
                        return Printable.NO_SUCH_PAGE;
                    }

                    // Set the font and size for printing
                    Font font = new Font("SimSun", Font.PLAIN, 12);
                    graphics.setFont(font);

                    // Break the text into lines
                    String[] lines = Facture_text_area.getText().split("\n");

                    // Set the starting position for printing
                    int y = 20;

                    // Print each line
                    for (String line : lines) {
                        graphics.drawString(line, 20, y);
                        y += 20; // Adjust the vertical position
                    }
                    
                    y += 20;

                    // Print the watermark
                    Font watermarkFont = new Font("Arial", Font.ITALIC, 12);
                    graphics.setFont(watermarkFont);
                    graphics.setColor(Color.GRAY);
                    graphics.drawString("CYCLE D'INGENIEURS GI -ZAID BAARAB- -ZAKARIA KERROUMI ", 20, y);
                    y += 30;
                    ImageIcon logoIcon = new ImageIcon("C:\\Users\\HP\\Desktop\\logofste.png");
                    Image logoImage = logoIcon.getImage();
                    int x = (int) ((pageFormat.getImageableWidth() - logoImage.getWidth(null)) / 2);

                    // Draw the logo as a watermark
                    graphics.drawImage(logoImage, x, y, (ImageObserver) null);

                    return Printable.PAGE_EXISTS;
                    }
            });

            try {
                printerJob.print();
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_print_buttonActionPerformed

    private void home_button_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_button_iconActionPerformed
         homeFrame.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_home_button_iconActionPerformed

    private void search_feildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_feildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_feildActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        String searchTerm = search_feild.getText().trim();

        if (!searchTerm.isEmpty()) {
            DefaultTableModel displayModel = (DefaultTableModel) products_display_table.getModel();
            displayModel.setRowCount(0); // Clear the existing rows

            try (Connection connect = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
                // SQL statement to select products with matching product name
                String selectQuery = "SELECT * FROM products WHERE product_name LIKE ?";

                try (PreparedStatement preparedStatement = connect.prepareStatement(selectQuery)) {
                    preparedStatement.setString(1, "%" + searchTerm + "%"); // Use "%" for partial matching

                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        while (resultSet.next()) {
                            int productId = resultSet.getInt("product_id");
                            String productName = resultSet.getString("product_name");
                            float productPrice = resultSet.getFloat("price");
                            String Description = resultSet.getString("description");
                            String Mark = resultSet.getString("mark");
                            int categoryId = resultSet.getInt("category_id");
                            String categoryName = resultSet.getString("category_name");

                            // Add a new row to the display table
                            displayModel.addRow(new Object[]{productId, productName, productPrice, Description, Mark, categoryId, categoryName});
                        }
                    }
                }
            } catch (SQLException e) {
                System.err.println("Error querying data from the database: " + e.getMessage());
            }
        } else {
            // If the search term is empty, display all products
            displayProducts();
        }
    }//GEN-LAST:event_search_buttonActionPerformed

        private void displayProducts() {
        DefaultTableModel model = (DefaultTableModel) products_display_table.getModel();
        model.setRowCount(0); // Clear the existing rows

        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String query = "SELECT * FROM products";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {
                    int productId = resultSet.getInt("product_id");
                    String productName = resultSet.getString("product_name");
                    float productPrice = resultSet.getFloat("price");
                    String description = resultSet.getString("description");
                    String mark = resultSet.getString("mark");
                    int categoryId = resultSet.getInt("category_id");
                    String categoryName = resultSet.getString("category_name");

                    // Add a new row to the table
                    model.addRow(new Object[]{productId, productName, productPrice, description, mark, categoryId, categoryName});
                }
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving data from the database: " + e.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(Facturation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturation(new Home()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Facturation_table;
    private javax.swing.JTextArea Facture_text_area;
    private javax.swing.JButton add_btn;
    private javax.swing.JButton generate_btn;
    private javax.swing.JButton home_button_icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton print_button;
    private javax.swing.JTable products_display_table;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField search_feild;
    // End of variables declaration//GEN-END:variables
}