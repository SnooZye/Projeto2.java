package com.company;

public class CalculoAreaGeometrica {
    public static void main(String[] args) {

        double ladoQuadrado = 2;
        double pi = 3.14;
        double raio = ladoQuadrado/2;



        double areaCirculo = pi * (ladoQuadrado * ladoQuadrado);
        double areaQuadrado = ladoQuadrado * ladoQuadrado;
        double areaTriangulo = (ladoQuadrado * ladoQuadrado)/2;
        double areaTrapezio = ((ladoQuadrado + raio) * ladoQuadrado)/2;


        System.out.println(areaCirculo);
        System.out.println(areaQuadrado);
        System.out.println(areaTriangulo);
        System.out.println(areaTrapezio);


    }



}
