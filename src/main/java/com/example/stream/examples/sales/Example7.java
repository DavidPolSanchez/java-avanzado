package com.example.stream.examples.sales;

import com.example.domain.Customer;
import com.example.domain.Sale;
import com.example.utils.DataUtils;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;

/**
 * Cuál es el valor más alto de todas las sales
 */
public class Example7 {

    public static void main(String[] args) {

        List<Sale> sales = DataUtils.getSales();

        Optional<Integer> Customers ;
        Customers= sales.stream()
            .map(Sale::getValue)
            .max(Comparator.naturalOrder());

        System.out.println(Customers);

    }
}
