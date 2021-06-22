package develop;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import database.Database;
import java.sql.Connection;

public class Mostrar {

    private String name;
    private int code;
    private double price;
    private int stock;
    private String date;
    private String category;

    PreparedStatement Ps;
    Connection conn;
    ResultSet Answer;

    String SQLconsult1 = "select nombre, codigo, precio, stock, fecha_alta, categoria from productos where nombre='taza';";
    String SQLconsult2 = "select nombre, codigo, precio, stock, fecha_alta, categoria from productos where nombre like 't%';";
    String SQLconsult3 = "select nombre, precio from Productos where precio>=22;";
    String SQLconsult4 = "select precio from productos where nombre ='taza';";
    String SQLconsult5 = "select distinct categoria from productos;";
    String SQLconsult6 = "select categoria, count(*) from productos group by categoria;";

    public Mostrar(String name, int code, double price, int stock, String date, String category) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.stock = stock;
        this.date = date;
        this.category = category;
    }

    public Mostrar() {

        Database conexion = new Database();
        conn = conexion.obtenerConexion();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    DefaultTableModel objtabla;

    String[][] Filas = {};

    public DefaultTableModel TitulosOptions1() {
        String[] TitCol = {"Name", "Code", "Price", "Stock", "Date", "Category"};
        objtabla = new DefaultTableModel(Filas, TitCol);
        return objtabla;
    }

    public DefaultTableModel TitulosOptions2() {
        String[] TitCol = {"Name", "Price"};
        objtabla = new DefaultTableModel(Filas, TitCol);
        return objtabla;
    }

    public DefaultTableModel TitulosOptions3() {
        String[] TitCol = {"Price"};
        objtabla = new DefaultTableModel(Filas, TitCol);
        return objtabla;
    }

    public DefaultTableModel TitulosOptions4() {
        String[] TitCol = {"Categories"};
        objtabla = new DefaultTableModel(Filas, TitCol);
        return objtabla;
    }

    public DefaultTableModel TitulosOptions5() {
        String[] TitCol = {"Categories", "count"};
        objtabla = new DefaultTableModel(Filas, TitCol);
        return objtabla;
    }

    public DefaultTableModel DataOptions1(String option) {

        try {
            if (option == "option1") {

                Ps = conn.prepareStatement(SQLconsult1);

            } else if (option == "option2") {

                Ps = conn.prepareStatement(SQLconsult2);
            }

           Answer= Ps.executeQuery(); //devuelve un objeto perteneciente a una clase
            while (Answer.next() == true) {
                this.setName(Answer.getString(1));
                this.setCode(Answer.getInt(2));
                this.setPrice(Answer.getDouble(3));
                this.setStock(Answer.getInt(4));
                this.setDate(Answer.getString(5));
                this.setCategory(Answer.getString(6));
                Object[] vecFilas = {this.getName(), this.getCode(), this.getPrice(), this.getStock(), this.getDate(), this.getCategory()};
                objtabla.addRow(vecFilas);

            }

        } catch (SQLException e) {
            System.out.println("e" + e);
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return objtabla;
    }

    public DefaultTableModel DataOptions2(String option) {

        try {
            if (option == "option3") {

                Ps = conn.prepareStatement(SQLconsult3);

            }

           Answer= Ps.executeQuery(); //devuelve un objeto perteneciente a una clase
            while (Answer.next() == true) {
                this.setName(Answer.getString(1));

                this.setPrice(Answer.getDouble(2));

                Object[] vecFilas = {this.getName(), this.getPrice()};
                objtabla.addRow(vecFilas);

            }

        } catch (SQLException e) {
            System.out.println("e" + e);
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return objtabla;
    }

    public DefaultTableModel DataOptions3(String option) {

        try {
            if (option == "option4") {

                Ps = conn.prepareStatement(SQLconsult4);
                Answer = Ps.executeQuery(); //devuelve un objeto perteneciente a una clase
                while (Answer.next() == true) {

                    this.setPrice(Answer.getDouble(1));

                    Object[] vecFilas = {this.getPrice()};
                    objtabla.addRow(vecFilas);
                }

            }

        } catch (SQLException e) {
            System.out.println("e" + e);
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return objtabla;
    }

    public DefaultTableModel DataOptions4(String option) {

        try {
            if (option == "option5") {

                Ps = conn.prepareStatement(SQLconsult5);
                Answer = Ps.executeQuery(); //devuelve un objeto perteneciente a una clase
                while (Answer.next() == true) {

                    this.setCategory(Answer.getString(1));

                    Object[] vecFilas = {this.getCategory()};
                    objtabla.addRow(vecFilas);
                }

            }

        } catch (SQLException e) {
            System.out.println("e" + e);
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return objtabla;
    }

    public DefaultTableModel DataOptions5(String option) {

        try {
            if (option == "option6") {

                Ps = conn.prepareStatement(SQLconsult6);
               Answer = Ps.executeQuery(); //devuelve un objeto perteneciente a una clase
                while (Answer.next() == true) {

                    this.setCategory(Answer.getString(1));
                    this.setName(Answer.getString(2));

                    Object[] vecFilas = {this.getCategory(), this.getName()};
                    objtabla.addRow(vecFilas);
                }

            }

        } catch (SQLException e) {
            System.out.println("e" + e);
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return objtabla;
    }
}
