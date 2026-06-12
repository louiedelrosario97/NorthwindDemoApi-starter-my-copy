package com.pluralsight.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.EnableMBeanExport;

@Entity                  // '@Entity' tells JPA this class maps to a database
@Table(name ="products") // '@Table'  tells JPA the specific table we are mapping to
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product
{
    @Id // '@Id' assigns the primary key column ('productId')
    @Column(name="ProductID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    @Column(name = "ProductName")
    private String productName;

    @Column(name = "SupplierID")
    private Integer supplierId;

    @Column(name = "CategoryID")
    private Integer categoryId;

    @Column(name = "QuantityPerUnit")
    private Integer quantityPerUnit;

    @Column(name = "UnitPrice")
    private Double unitPrice;

    @Column(name = "UnitsInStock")
    private Integer unitsInStock;

    @Column(name = "UnitsOnOrder")
    private Integer unitsOnOrder;

    @Column(name = "ReorderLevel")
    private Integer reorderLevel;

    @Column(name = "Discontinued")
    private Integer discontinued;

}


//{
//    private int productId;
//    private String productName;
//    private int categoryId;
//    private double unitPrice;
//
//    public Product(int productId, String productName, int categoryId, double unitPrice)
//    {
//        this.productId = productId;
//        this.productName = productName;
//        this.categoryId = categoryId;
//        this.unitPrice = unitPrice;
//    }
//
//    public Product()
//    {
//    }
//
//    public int getProductId()
//    {
//        return productId;
//    }
//
//    public void setProductId(int productId)
//    {
//        this.productId = productId;
//    }
//
//    public String getProductName()
//    {
//        return productName;
//    }
//
//    public void setProductName(String productName)
//    {
//        this.productName = productName;
//    }
//
//    public int getCategoryId()
//    {
//        return categoryId;
//    }
//
//    public void setCategoryId(int categoryId)
//    {
//        this.categoryId = categoryId;
//    }
//
//    public double getUnitPrice()
//    {
//        return unitPrice;
//    }
//
//    public void setUnitPrice(double unitPrice)
//    {
//        this.unitPrice = unitPrice;
//    }
//}
