package com.example.stream.examples.sales;

import com.example.domain.Customer;
import com.example.domain.Product;
import com.example.domain.Sale;

import java.util.Comparator;
import java.util.List;

import static com.example.utils.DataUtils.getSales;

/**
 * A partir de las sales encuentra todas las ciudades únicas en las que habitan
 * los customers
 */
public class Example2 {

    public static void main(String[] args) {
        List<Sale> sales = getSales();
        List<String> cities;

        List<Customer> Customers = sales.stream()
                .map(Sale::getCustomer)
                .toList();

        cities = Customers.stream().map(Customer::getCity).distinct().toList();
        System.out.println(cities);

    }
}
