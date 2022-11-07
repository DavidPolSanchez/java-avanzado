package com.example.stream.examples.sales;

import com.example.domain.Customer;
import com.example.domain.Sale;

import java.util.Comparator;
import java.util.List;

import static com.example.utils.DataUtils.getSales;

/**
 * Hay algún customer cuya ciudad sea Milan
 */
public class Example5 {

    public static void main(String[] args) {

        List<Sale> sales = getSales();
        boolean milanocustomer;
        List<Customer> milano;
        Boolean milanoexist;
        milanoexist = sales.stream()
                .map(Sale::getCustomer)
                .filter(customer -> customer.getCity().equals("Milan"))
                .distinct()
                .toList().isEmpty();


        System.out.println(milanoexist);

    }
}
