package dhbw.datamodel;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class OrderModel {
    private final SimpleIntegerProperty orderID;
    private final SimpleDoubleProperty price;
    private final SimpleStringProperty date;
    private final SimpleStringProperty table;


    public OrderModel(int orderID, double price, String date, String table) {
        this.orderID = new SimpleIntegerProperty(orderID);
        this.price = new SimpleDoubleProperty(price);
        this.date = new SimpleStringProperty(date);
        this.table = new SimpleStringProperty(table);
    }

    public int getOrderID() {
        return orderID.get();
    }

    public SimpleIntegerProperty orderIDProperty() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID.set(orderID);
    }

    public double getPrice() {
        return price.get();
    }

    public SimpleDoubleProperty priceProperty() {
        return price;
    }

    public void setPrice(double price) {
        this.price.set(price);
    }

    public String getDate() {
        return date.get();
    }

    public SimpleStringProperty dateProperty() {
        return date;
    }

    public void setDate(String date) {
        this.date.set(date);
    }

    public String getTable() {
        return table.get();
    }

    public SimpleStringProperty tableProperty() {
        return table;
    }

    public void setTable(String table) {
        this.table.set(table);
    }
}
