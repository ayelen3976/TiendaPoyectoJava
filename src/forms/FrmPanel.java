
package forms;
import develop.Tienda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class FrmPanel extends javax.swing.JInternalFrame {

  Tienda store2 = new Tienda();
  
    public FrmPanel() {
        initComponents();
        this.btnconfirm.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableGet = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtCode = new javax.swing.JTextField();
        txtCategory = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtSpinner = new javax.swing.JSpinner();
        txtDate = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnconfirm = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);

        jPanel3.setBackground(new java.awt.Color(85, 65, 16));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableGet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableGet);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 430, 330));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setText("Sweet Home Store");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, -1));

        jPanel1.setBackground(new java.awt.Color(145, 41, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 104, 107, -1));
        jPanel1.add(txtCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 190, 107, -1));
        jPanel1.add(txtCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 270, 99, -1));
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 104, 101, -1));
        jPanel1.add(txtSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 190, -1, -1));
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 270, 95, -1));

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 413, -1, -1));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 413, -1, -1));

        jLabel2.setText("You can add , edit and delete products");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 24, -1, -1));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 86, -1, -1));

        jLabel4.setText("Precio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 86, -1, -1));

        jLabel5.setText("Codigo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 168, -1, -1));

        jLabel6.setText("Stock");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 168, -1, -1));

        jLabel7.setText("Categoria");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 248, -1, -1));

        jLabel8.setText("Fecha Alta");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 248, -1, -1));

        btnconfirm.setText("Confirmar");
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });
        jPanel1.add(btnconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });
        jPanel3.add(btnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        this.TableGet.setModel(store2.Title());
        this.TableGet.setModel(store2.ProductsData());
        System.out.println("Loading data....");
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String name, date, category;
        Double price;
        int code, stock;
        name = txtName.getText();
        code = Integer.parseInt(txtCode.getText());
        price = Double.parseDouble(txtPrice.getText());
        stock = Integer.parseInt(txtSpinner.getValue().toString());
        date = txtDate.getText();
        category = txtCategory.getText();
        Tienda store = new Tienda(name, code, price, stock, date, category);

        store.AltaProducto();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int IdDelete = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Id to Delete"));
        System.out.println("Idxd = " + IdDelete);
        store2.Deleteproduct(IdDelete);
    }//GEN-LAST:event_btnDeleteActionPerformed

    int IdEdit;
    boolean IdSearch;
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
      

        IdEdit = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Id to Edit"));

        IdSearch = store2.BuscarId(IdEdit);

        System.out.println("Idxd = " + IdEdit);

        if (IdSearch == true) {
            this.txtName.setText(store2.getName());
            this.txtCode.setText(String.valueOf(store2.getCode()));
            this.txtPrice.setText(String.valueOf(store2.getPrice()));
//    this.txtSpinner(String.valueOf(store2.getStock()));
            this.txtDate.setText(store2.getDate());
            this.txtCategory.setText(store2.getCategory());
            
            
            
                 this.btnEdit.setVisible(false);
        this.btnconfirm.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "verifique que el producto exista");
        }

     

   
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
        String name, date, category;
        Double price;
        int code, stock;
//        ---------obtenemos los datos ------------------
        name = txtName.getText();
        code = Integer.parseInt(txtCode.getText());
        price = Double.parseDouble(txtPrice.getText());
//        stock = Integer.parseInt(txtSpinner.getValue().toString());
        date = txtDate.getText();
        category = txtCategory.getText();
// ---------seteamo los datos por lo nuevo ------------------
        store2.setName(name);
        store2.setCode(code);
        store2.setPrice(price);
//       store2.setStock(stock);
        store2.setDate(date);
        store2.setCategory(category);

        store2.EditProduct(IdEdit);
        
//       ---------vaciamos los campos para volver a empezar ------------------ 
this.txtName.setText("");
this.txtCode.setText("");
this.txtPrice.setText("");
//this.txtStock.setText("");
this.txtDate.setText("");
this.txtCategory.setText("");


        this.btnEdit.setVisible(true);
        this.btnconfirm.setVisible(false);
    }//GEN-LAST:event_btnconfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableGet;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnconfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JSpinner txtSpinner;
    // End of variables declaration//GEN-END:variables
}
