package develop;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import database.Database;
import java.sql.Connection;
public class Tienda {
    private String name;
    private  int code;
    private double price;
    private int stock;
    private String date;
    private String category;
    private int id;
    
    PreparedStatement Ps;
    Connection conn;
    ResultSet Respuesta;
    
    private String Alta="INSERT INTO `productos`(nombre, codigo, precio,stock,fecha_alta, categoria) VALUES (?, ?, ?, ?, ?, ?);";

    public Tienda(String name, int code, double price, int stock, String date, String category) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.stock = stock;
        this.date = date;
        this.category = category;
         obtenerConexion(); // llamamos para conectar y que se haga el alta del producto
    }
// este constructor vacio de tienda es para conectarse con el get y el resto de los metodos
    public Tienda() {
       Database conexion = new  Database();
        conn = conexion.obtenerConexion();
    }

//  este contructor de conexion es para solo ejecutar el update(AltaPorducto)
     private void obtenerConexion() {
     Database conexion = new  Database();
        conn = conexion.obtenerConexion();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAlta() {
        return Alta;
    }

    public void setAlta(String Alta) {
        this.Alta = Alta;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
//------------------------------SHOW TABLE------------------------------------
    DefaultTableModel table;
    String[] TitCol = {"id", "Name", "Code", "Price", "Stock", "Category"};
    String[][] Filas = {};

    public DefaultTableModel Title() {
        table = new DefaultTableModel(Filas, TitCol);
        return table;

    }

    public DefaultTableModel ProductsData() {
        String SQLShow = "select idproductos, nombre, codigo, precio, stock, categoria from productos;";

        try {
//             mostramos y ejecutamos el rayo de mysql
            Ps = conn.prepareStatement(SQLShow);
            Respuesta = Ps.executeQuery();

//             retornamos cada data ne la tabla
            while (Respuesta.next() == true) {
                this.setId(Respuesta.getInt(1));
                this.setName(Respuesta.getString(2));
                this.setCode(Respuesta.getInt(3));
                this.setPrice(Respuesta.getDouble(4));
                this.setStock(Respuesta.getInt(5));
                this.setCategory(Respuesta.getString(6));
//               creamos la tabla con los datos que queremos llamar
                Object[] vecFilas = {this.getId(), this.getName(), this.getCode(), this.getPrice(), this.getStock(), this.getCategory()};
                table.addRow(vecFilas);
            }

        } catch (SQLException e) {
            System.out.println("ERROR DB Show " + e);
            JOptionPane.showMessageDialog(null, "ERROR EN LA BASE DE DATOS SHOW ");
        }
        return table;
    }

//------------------------------ADD PRODUCT------------------------------------ 
    public void AltaProducto() {
        try {
            Ps = conn.prepareStatement(Alta);
            Ps.setString(1, this.getName());
            Ps.setInt(2, this.getCode());
            Ps.setDouble(3, this.getPrice());
            Ps.setInt(4, this.getStock());
            Ps.setString(5, this.getDate());
            Ps.setString(6, this.getCategory());

            int AltaRegister = Ps.executeUpdate(); //rayo de db que envia accion 
            if (AltaRegister > 0) {
                JOptionPane.showMessageDialog(null, "Producto guardado");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUDO GUARDAR");
            }

        } catch (SQLException e) {
            System.out.println("ERROR DB " + e);
            JOptionPane.showMessageDialog(null, "ERROR EN LA BASE DE DATOS ");
        }
    }
   //------------------------------SEARCH BY ID PRODUCT------------------------------------   
    public boolean BuscarId(int IdEdit){
         boolean exist;
        String sqlMostrarId = "select  nombre from productos where idproductos = '" + IdEdit + "'; ";
        
        try{
              Ps = conn.prepareStatement(sqlMostrarId);
            Respuesta = Ps.executeQuery();
            if (Respuesta.next()) {

              
                this.setName(Respuesta.getString(1));
               
                exist = true;

            } else {
                exist = false;

            } 
        }catch(SQLException e){
             System.out.println("ERROR DB " + e);
            JOptionPane.showMessageDialog(null, "ERROR EN LA BASE DE DATOS ");
            exist = false;
        }
        return exist;
    }
    
    
    
    
    
    
//------------------------------EDIT PRODUCT------------------------------------   
    
    
    public void EditProduct(int IdEdit){
        String sqlEditById = "update productos set nombre = '" + this.getName() + "', codigo= '" + this.getCode() + "', precio = '" + this.getPrice()+ "', stock = '" + this.getStock() + "', fecha_alta = '" + this.getDate() + "', categoria= '" + this.getCategory() + "' where idproductos = '" + IdEdit + "';";

        try{
               Ps = conn.prepareStatement(sqlEditById);
        int EditProduct = Ps.executeUpdate(); 
         if (EditProduct > 0) {
                JOptionPane.showMessageDialog(null, "Registro Modificado :p");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUDO EDITAAR");
            }
        }catch(SQLException e){
             System.out.println("ERROR DB " + e);
            JOptionPane.showMessageDialog(null, "ERROR EN LA BASE DE DATOS ");
        }
    }
    
    
    
 //------------------------------DELETE BY ID PRODUCT------------------------------------ 
    
    
    public void Deleteproduct(int IdDelete){
         String sqlDeleteById = "delete from productos where idproductos = '" + IdDelete + "'; ";
         try{
             Ps = conn.prepareStatement(sqlDeleteById );
            int delete = Ps.executeUpdate();

            if (delete > 0) {
                JOptionPane.showMessageDialog(null, "Product deleted :p");
            } else {
                JOptionPane.showMessageDialog(null, "sorry I can`t delete it");
            } 
         }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "ERROR IN DELETE");
         }
        
    }
}
   

 
