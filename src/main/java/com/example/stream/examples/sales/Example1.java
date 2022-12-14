package com.example.stream.examples.sales;

import com.example.domain.Sale;

import java.util.Comparator;
import java.util.*;

import static com.example.utils.DataUtils.getSales;
import static java.util.Comparator.comparing;

/**
 * Encuentra todas las sales del año 2021 y ordénalas por valor (más pequeño a más alto)
 */
public class Example1 {

    public static void main(String[] args) {


        List<Sale> sales = getSales();

        List<Sale> titles;
        titles = sales.stream()
                .filter(x -> x.getYear() == 2021)
                .sorted(Comparator.comparingInt(Sale::getValue))
                .toList();

        titles.forEach(System.out::println);

    }
}
