package com.example.stream.examples.sales;

import com.example.domain.Sale;

import java.util.List;

import static com.example.utils.DataUtils.getSales;

/**
 * Encuentra todos los clientes de Cambridge y ordénalos por nombre
 */
public class Example3 {

    public static void main(String[] args) {

        List<Sale> sales = getSales();

    }
}
