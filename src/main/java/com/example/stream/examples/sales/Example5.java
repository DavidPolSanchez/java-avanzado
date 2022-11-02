package com.example.stream.examples.sales;

import com.example.domain.Sale;

import java.util.List;

import static com.example.utils.DataUtils.getSales;

/**
 * Hay algún customer cuya ciudad sea Milan
 */
public class Example5 {

    public static void main(String[] args) {

        List<Sale> sales = getSales();

    }
}
