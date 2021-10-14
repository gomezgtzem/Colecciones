package com.generation;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        String universidades[] = new String[5];
//        universidades[0] = "ITVH";
//        universidades[1] = "ULA";
//        universidades[2] = "LONDON UNIVERSITY";
//        universidades[3] = "HOGHWARTS";
//        universidades[4] = "HARVARD";
//        for (String universidad : universidades) {
//            System.out.println(universidad);
//        }
        Set<String> frutas = new HashSet(4);
//        Caracteristicas principales de los set
//        No puede contener elementos duplicados
//        El orden de los elementos puede variar
        frutas.add("fresa");
        frutas.add("melon");
        frutas.add("sandia");
        frutas.add("manzana verde");
        frutas.add("uvas");
        frutas.add("frambuesas");
        frutas.add("durazno");
        for(String fruta : frutas) {
            System.out.println(fruta);
        }
        System.out.println("-----------------------------------");
        Set<String> frutas2 = new TreeSet<>();
        frutas2.add("fresa");
        frutas2.add("melon");
        frutas2.add("sandia");
        frutas2.add("manzana verde");
        frutas2.add("uvas");
        frutas2.add("frambuesas");
        frutas2.add("durazno");
        for(String fruta : frutas2) {
            System.out.println(fruta);
        }
        System.out.println("-----------------------------------");

        Set<String> frutas3 = new LinkedHashSet<>(5);
        frutas3.add("fresa");
        frutas3.add("melon");
        frutas3.add("sandia");
        frutas3.add("manzana verde");
        frutas3.add("uvas");
        frutas3.add("frambuesas");
        frutas3.add("durazno");
        for(String fruta : frutas3) {
            System.out.println(fruta);
        }
        System.out.println("-----------------------------------");
        List<String> frutas4 = new ArrayList<>();
//        List si admite elementos duplicados
        frutas4.add("fresa");
        frutas4.add("melon");
        frutas4.add("sandia");
        frutas4.add("manzana verde");
        frutas4.add("uvas");
        frutas4.add("frambuesas");
        frutas4.add("durazno");
        frutas4.add("fresa");
        for(String fruta : frutas4) {
            System.out.println(fruta);
        }
        System.out.println("-----------------------------------");

        System.out.println(frutas4.get(3));
        int indice = frutas4.indexOf("melon");
        System.out.println(frutas4.get(indice));
        System.out.println("-----------------------------------");
        List<String> frutas5 = new LinkedList<>();
        frutas5.add("fresa");
        frutas5.add("melon");
        frutas5.add("sandia");
        frutas5.add("manzana verde");
        frutas5.add("uvas");
        frutas5.add("frambuesas");
        frutas5.add("durazno");
        for(String fruta : frutas4) {
            System.out.println(fruta);
        }
        System.out.println("-----------------------------------");
//        A este tipo de colecciones se les llama diccionarios
        Map<Integer,String> universidades = new HashMap<Integer,String>();
        universidades.put(1, "IPN");
        universidades.put(2, "UNAM");
        universidades.put(3, "UAM");
        universidades.put(4, "UAEDM");
        universidades.put(5, "TEC");
        universidades.put(6, "UNICEL");
//        System.out.println(universidades.get(3));
        for(Map.Entry<Integer,String> universidad: universidades.entrySet()){
            System.out.println("Clave= "+universidad.getKey()+", Valor= "+universidad.getValue());
        }

//        System.out.println("-----------------------------------");
//        System.out.println("Emmanuel");
//        final Set hashSet = new HashSet(1_000_000);
//        final Long startHashSetTime = System.currentTimeMillis();
//        for (int i = 0; i < 1_000_000; i++) {
//            hashSet.add(i);
//        }
//        final Long endHashSetTime = System.currentTimeMillis();
//        System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));
//
//        final Set treeSet = new TreeSet();
//        final Long startTreeSetTime = System.currentTimeMillis();
//        for (int i = 0; i < 1_000_000; i++) {
//            treeSet.add(i);
//        }
//        final Long endTreeSetTime = System.currentTimeMillis();
//        System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));
//
//        final Set linkedHashSet = new LinkedHashSet(1_000_000);
//        final Long startLinkedHashSetTime = System.currentTimeMillis();
//        for (int i = 0; i < 1_000_000; i++) {
//            linkedHashSet.add(i);
//        }
//        final Long endLinkedHashSetTime = System.currentTimeMillis();
//        System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
    }
}
