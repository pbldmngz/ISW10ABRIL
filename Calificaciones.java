package UnidadII.IS10ABRIL;

import java.util.Random;
import java.util.Scanner;


public class Calificaciones {
    public static int[][] calI; //Calificaciones ingeniería
    public static int[][] calL; //Calificaciones licenciatura
    public static String[][] nomMatI;
    public static String[][] nomMatL;//Nombres y matrículas
    public Scanner input=new Scanner(System.in);
    //Si es de ingeniería son 5 columnas de calificaciones, la quinta reservada al promedio //indicar desde fuera que tan largo debe de ser el arreglo, debe recibir la logitud de Grupo.est
    public static void setArray(int canING)//Coloca cada valor en su sitio, las calificaciones son sorteadas de forma aleatoria como enteros de 50  a 100
    {//La variable canING puede ser otorgada por el método de la clase Grupo "cantidadING" //Debería, insisto
        
        int mz = Grupo.est1.size()-canING;//Cantidad de Licenciados
        
        nomMatI = new String[canING][2];
        calI = new int[canING][5];//Cantidad de Ingenieros
        
        nomMatL = new String[mz][2];
        calL = new int[mz][4];
        
        Random rand = new Random();
        int  n;
        //Calificaciones de los estudiantes
        for (int row=0; row<Grupo.est1.size(); row++)
        {
            if(Grupo.est1.get(row).LICoING()==true)//Calificaciones de ingenieria
            {
            nomMatI[row][0]=Grupo.est1.get(row).getNombre() + " " + Grupo.est1.get(row).getApellido();
            nomMatI[row][1]=Grupo.est1.get(row).getMatricula();
                for (int col=0; col<calI[row].length; col++)
                {
                    if(col<calI[row].length-1)
                    {
                        n = rand.nextInt(50) + 50;
                        calI[row][col]=n;
                    }
                    else
                    {
                        calI[row][col]=promedioI(row);
                    }
                }  
            }
            else                                   //Calificaciones de licenciatura
            {
            nomMatL[row][0]=Grupo.est1.get(row).getNombre() + " " + Grupo.est1.get(row).getApellido();;
            nomMatL[row][1]=Grupo.est1.get(row).getMatricula();
                    for (int col=0; col<calL[row].length; col++)
                    {
                        if(col<calL[row].length-1)
                        {
                            n = rand.nextInt(50) + 50;
                            calL[row][col]=n;
                        }
                        else
                        {
                            calL[row][col]=promedioL(row);
                        }
                    }
            }
        }
    }
    //La variable canING debe de ser mandada por el método cantidadING de la clase Grupo
    public static void outputArray(int canING)//Creador de tablas mostrando los arreglos ordenados en SetArray
    { 
        int mz = Grupo.est1.size()-canING;//Cantidad de Licenciados
        
        System.out.println("C A L I F I C A C I O N E S");
        System.out.println(" - - - LICENCIATURA - - -");
        System.out.println("Nombres&Apellido                       MAT.   AA  BB  CC  PROM ");
        for (int row=0; row<mz; row++)
        {

            for (int col=0; col<6; col++)
                if(col<=1)
                {
                    if(col==0)
                    {
                        System.out.printf("%s ", nomMatL[row][col]);
                        for(int i=0; i<(38-nomMatL[row][col].length());i++)
                        {
                        System.out.print(" ");
                        }
                    }
                    else
                    {
                        System.out.printf("%s ", nomMatL[row][col]);
                        for(int i=0; i<(6-nomMatL[row][col].length());i++)
                        {
                        System.out.print(" ");
                        }
                    }
                }
                else
                {
                    if(col<=6)
                    {
                        System.out.printf("%s ", calL[row][col-2]+" ");  
                    }
                    
                    else
                    {
                        System.out.print(calL[row][4]); 
                    }
                    
                }
                System.out.print("\n");
        }
        System.out.println(" - - - INGENIERÍA - - -");
        System.out.println("Nombres&Apellido                       MAT.   AA  BB  CC  PI  PROM ");
        for (int row=0; row<canING; row++)
        {

            for (int col=0; col<7; col++)
                if(col<=1)
                {
                    
                    if(col==0)
                    {
                        System.out.printf("%s ", nomMatI[row][col]);
                        for(int i=0; i<(38-nomMatI[row][col].length());i++)
                        {
                        System.out.print(" ");
                        }
                    }
                    else
                    {
                        System.out.printf("%s ", nomMatI[row][col]);
                        for(int i=0; i<(6-nomMatI[row][col].length());i++)
                        {
                        System.out.print(" ");
                        }
                    }
                }
                else
                {
                    if(col<=7)
                    {
                        System.out.printf("%s ", calI[row][col-2]+" ");  
                    }
                    
                    else
                    {
                        System.out.print(calI[row][5]); 
                    }
                    
                }
                System.out.println(" ");
        }
    }
    
    public static void probarArreglo(String[][] array)//Únicamente usar para comprobar el funcionamiento de los arreglos
        {
        for (int row=0; row<array.length; row++)
            {
            for (int col=0; col<array[row].length; col++)
            {
                System.out.printf("%d ", array[row][col]);
                System.out.println(" ");
            }
        }
    }
    
    public static int promedioL(int j)//Hacer promedios por filas
    {
        int a=0;
        double b;
        for(int i=0; i<3; i++)
        {
            a+=calL[j][i];
        }
        b=a/3;
        return (int)b;
    }
    
    public static int promedioI(int j)//Hacer promedios por filas
    {
        int a=0;
        double b;
        for(int i=0; i<4; i++)
        {
            a+=calI[j][i];
        }
        b=a/4;
        return (int)b;
    }

}
