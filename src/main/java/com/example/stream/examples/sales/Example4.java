package com.example.stream.examples.sales;

import com.example.domain.Customer;
import com.example.domain.Sale;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static com.example.utils.DataUtils.getSales;

/**
 * Returns a string of all employees names sorted alphabetically
 * Devuelve un String que tenga todos los nombres de los empleados ordenados alfabéticamente
 *
 * Nota: el resultado debe ser una variable String
 */
public class Example4 {

    public static void main(String[] args) {
        List<Sale> sales = getSales();

        List<Customer> customers ;

       //1
        customers= sales.stream()
                .map(Sale::getCustomer)
                .filter(customer -> customer.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Customer::getName))
                .distinct()
                .toList();
        List<String> names = customers.stream().map(Customer::getName).toList();

        //2 Correct elements
        String elements = sales.stream()
                .map(sale -> sale.getCustomer().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println(elements);

    }
}
