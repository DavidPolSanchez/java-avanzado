package com.example.stream.examples.sales;

import com.example.domain.Customer;
import com.example.domain.Sale;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import static com.example.utils.DataUtils.getSales;

/**
 * Encuentra todos los clientes de Cambridge y ordénalos por nombre
 */
public class Example3 {

    public static void main(String[] args) {

        List<Sale> sales = getSales();

        List<Customer> customers = sales.stream()
                .map(Sale::getCustomer)
                .filter(customer -> customer.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Customer::getName))
                .toList();


        System.out.println(customers);
    }
}
