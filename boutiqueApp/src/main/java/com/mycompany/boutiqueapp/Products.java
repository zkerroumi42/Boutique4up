/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.boutiqueapp;

import static com.mysql.cj.conf.PropertyKey.PASSWORD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author HP
 */
public class Products extends javax.swing.JFrame {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/java";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Novel222@@@";
    // Database connection
    private Connection connection;
    ArrayList<String> categories = new ArrayList<>();
    private DefaultComboBoxModel<String> listModel = new DefaultComboBoxModel<>();
    private String product_name;
    private String category;
    private float product_price;
    private String mark;
    private String description;
    private String  category_name;
    private int category_id;
    private Home homeFrame;

    

    public Products(Home homeFrame) {
        
        initComponents();
        this.homeFrame = homeFrame; // Assign the parameter to the instance variable

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                // Set the visibility of the Home frame to true when Facturation frame is closed
                homeFrame.setVisible(true);
            }
        });
        
        loadCategories();
        displayProducts();
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Products_table = new javax.swing.JTable();
        products_category = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        add_button = new javax.swing.JButton();
        home_button_icon = new javax.swing.JButton();
        search_feild = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        products_display_table = new javax.swing.JTable();
        delete_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("your products");

        Products_table.setAutoCreateRowSorter(true);
        Products_table.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Products_table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Products_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Product name", "Price", "mark", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Products_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Products_table.setRowHeight(30);
        Products_table.setSelectionForeground(new java.awt.Color(242, 242, 242));
        Products_table.setShowGrid(true);
        Products_table.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                Products_tableInputMethodTextChanged(evt);
            }
        });
        jScrollPane2.setViewportView(Products_table);

        products_category.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        products_category.setModel(listModel);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Category");

        add_button.setBackground(new java.awt.Color(51, 204, 0));
        add_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_button.setForeground(new java.awt.Color(255, 255, 255));
        add_button.setText("Add");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        home_button_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\boutiqueApp\\src\\main\\java\\com\\mycompany\\boutiqueapp\\images\\accueil.png")); // NOI18N
        home_button_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_button_iconActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(267, 267, 267)
                                .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(186, 186, 186)
                                .addComponent(home_button_icon)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(products_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(home_button_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 49, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(products_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(add_button)
                .addGap(5, 5, 5))
        );

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

        jScrollPane1.setViewportView(jScrollPane3);

        delete_button.setBackground(new java.awt.Color(255, 0, 0));
        delete_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete_button.setForeground(new java.awt.Color(255, 255, 255));
        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(search_feild, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(delete_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_feild, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_button)
                    .addComponent(delete_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Products_tableInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_Products_tableInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Products_tableInputMethodTextChanged

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

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        DefaultTableModel model = (DefaultTableModel) Products_table.getModel();

        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();

        if (Products_table.getRowCount() > 0) {

                // Get the value from the first row, first column
            Object value = Products_table.getValueAt(0, 0);

            // Check if value is not null before using it
            if (value != null) {
                this.product_name = value.toString();
            } else {
                this.product_name = ""; // or handle the null case as appropriate
            }


            Object value1 = Products_table.getValueAt(0, 1);
            this.product_price = value1 != null ? Float.parseFloat(value1.toString()) : 0.0f; // or handle the null case as appropriate

             this.mark = Products_table.getValueAt(0, 2) != null ? Products_table.getValueAt(0, 2).toString() : "";

            this.description = Products_table.getValueAt(0, 3) != null ? Products_table.getValueAt(0, 3).toString() : "";
            this.category_name = (String) products_category.getSelectedItem();
            this.category_id = getCategoryId(this.category_name);
// ajouter a base de donnees 
            try {
                Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

                // SQL statement to insert data into the 'factures' table
                String insertQuery = "INSERT INTO products (product_name, description, price, mark , category_name , category_id) VALUES (?, ?, ?, ?, ?, ?)";

                try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                    preparedStatement.setString(1, this.product_name);
                    preparedStatement.setString(2, this.description);
                    preparedStatement.setFloat(3, this.product_price);
                    preparedStatement.setString(4, this.mark);
                    preparedStatement.setString(5, this.category_name);
                    preparedStatement.setInt(6, this.category_id);

                    int rowsAffected = preparedStatement.executeUpdate();
                    System.out.println(rowsAffected + " row(s) inserted into the database.");
                }
                 displayProducts();
            } catch (SQLException e) {
                System.err.println("Error inserting data into the database: " + e.getMessage());
            }


         }

        // Iterate through each cell and set its value to null or an empty string
        for (int row = 0; row < rowCount-1; row++) {
                for (int col = 0; col < columnCount; col++) {
                model.setValueAt(null, row, col); //
            }
        }
    }//GEN-LAST:event_add_buttonActionPerformed

    private void home_button_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_button_iconActionPerformed
        homeFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_home_button_iconActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
           int selectedRow = products_display_table.getSelectedRow();

    if (selectedRow != -1) {
        int productId = (int) products_display_table.getValueAt(selectedRow, 0);

        try (Connection connect = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            // SQL statement to delete the product by ID
            String deleteQuery = "DELETE FROM products WHERE product_id = ?";

            try (PreparedStatement preparedStatement = connect.prepareStatement(deleteQuery)) {
                preparedStatement.setInt(1, productId);

                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected + " row(s) deleted from the database.");

                // Refresh the products_display_table
                displayProducts();
            }
        } catch (SQLException e) {
            System.err.println("Error deleting data from the database: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a product to delete.");
    }
    }//GEN-LAST:event_delete_buttonActionPerformed
   
   private int getCategoryId(String category_nm) {
    try {
        Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

        // SQL statement to select category_id based on category_name
        String selectQuery = "SELECT category_id FROM categories WHERE category_name = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
            preparedStatement.setString(1, category_nm);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int categoryId = resultSet.getInt("category_id");
                    System.out.println("Category ID: " + categoryId);
                    return categoryId;
                } else {
                    System.out.println("Category not found.");
                    return -1; // or any other appropriate value to indicate category not found
                }
            }
        }
    } catch (SQLException e) {
        System.err.println("Error querying data from the database: " + e.getMessage());
        return -1; // or any other appropriate value to indicate an error
    }
}
 
    
    private void loadCategories() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String query = "SELECT category_name FROM categories";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                while (resultSet.next()) {
                    String categoryName = resultSet.getString("category_name");
                    categories.add(categoryName);
                    listModel.addElement(categoryName);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving data from the database: " + e.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products(new Home()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Products_table;
    private javax.swing.JButton add_button;
    private javax.swing.JButton delete_button;
    private javax.swing.JButton home_button_icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> products_category;
    private javax.swing.JTable products_display_table;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField search_feild;
    // End of variables declaration//GEN-END:variables
}
