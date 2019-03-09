package com.example.practia1;

public class Main {

    public static void main(String[] args){
        System.out.println("****************************");
        System.out.println("Listado de estudiantes");

        int Luis = 17;
        int Brian = 22;
        int Maria = 21;
        int Marcos = 33;
        int Gabriela = 19;
        int Hector = 20;
        int Katherine = 23;
        int Fabio = 30;

    String[] arrayEstudiantes = {"Luis", "Brian", "Maria", "Marcos", "Gabriela",
            "Hector", "Katherine", "Fabio"};

    {
        System.out.println("****************************");
        System.out.println("1 - " + arrayEstudiantes[0]);
        System.out.println("2 - " + arrayEstudiantes[1]);
        System.out.println("3 - " + arrayEstudiantes[2]);
        System.out.println("4 - " + arrayEstudiantes[3]);
        System.out.println("5 - " + arrayEstudiantes[4]);
        System.out.println("6 - " + arrayEstudiantes[5]);
        System.out.println("7 - " + arrayEstudiantes[6]);
        System.out.println("8 - " + arrayEstudiantes[7]);
        System.out.println("===============================================");

    }

        if(Luis<18){
            System.out.println("La edad Minima es de: "  + arrayEstudiantes[0] + ", con "  + Luis +
                    " anios");
            System.out.println("===============================================");
        }

        if(Marcos>30){
            System.out.println("La edad Maxima es de: "  + arrayEstudiantes[3] + ", con "  + Marcos
                    + " anios");
            System.out.println("===============================================");
        }

        if(Katherine<=23){
            System.out.println("La edad Promedio es la de: "  + arrayEstudiantes[6] + ", de "  + Katherine
                    + " anios");
            System.out.println("===============================================");
        }


        int Estudiantes = 8;
        int total = 0;

        while (Estudiantes < 9) {
            total += Estudiantes;
            Estudiantes++;
        }

        System.out.println("El total de estudiantes es: " + total);
    }



    }


