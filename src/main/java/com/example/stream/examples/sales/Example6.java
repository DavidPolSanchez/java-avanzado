package com.example.stream.examples.sales;

import com.example.domain.Customer;
import com.example.domain.Sale;

import java.util.Comparator;
import java.util.List;

import static com.example.utils.DataUtils.getSales;

/**
 * Imprimir todos los valores de las ventas asociadas a cada Customer
 * que viva en la ciudad Cambridge
 */
public class Example6 {

    public static void main(String[] args) {

        List<Sale> sales = getSales();
        List<Sale> salesfiltered;
        salesfiltered= sales.stream()
                .filter(sale -> sale.getCustomer().getCity().equals("Cambridge"))
                .toList();

        System.out.println(salesfiltered);
    }
}
