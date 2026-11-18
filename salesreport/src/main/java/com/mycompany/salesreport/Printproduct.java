/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author shephi
 */
public class Printproduct {

    private product product;
    public Printproduct(product product) {{
        this.product = product;
    }

    public void PrintTotalProductSales() {

        System.out.println("Total Products Sold: "
                + product.GetTotalProductsSold());
    }

    // Display average sales
    public void PrintAverageProductSales() {

        System.out.println("Average Product Sales: "
                + product.GetAverageProductSold());
    }

    // Display most popular product
    public void PrintMostPopularProduct() {

        System.out.println("Most Popular Product: "
                + product.GetMostPopularProduct());
    }
}