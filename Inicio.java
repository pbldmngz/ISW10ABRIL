package UnidadII.IS10ABRIL;
import java.util.Scanner;

//Único problema de este programa es que no logro que se arregle el error de logica de la clase Grupo entre las lineas 39-69;
//Escribo esto a las 02:31 del Sábado 8 de Abril de 2018;

public class Inicio {
    public Inicio()
    {
        
    }
    
    public void Ejecutar ()
    {
        Scanner input = new Scanner(System.in);
        String beta="N";
        String gamma;
        int gamma2=43;
        String key;
        int alpha=0;
        Grupo materias[]= new Grupo[4];
        do{
            for(int i=0;i<4;i++)
            {
                switch(i)
                {
                    case 0:
                        materias[0]=new Grupo("Algebra");
                        materias[0].aGrupo(Grupo.NM);
                        materias[0].creadorAlumnosDefault();
                        break;
                    case 1:
                        materias[1]=new Grupo("Estatica");
                        materias[1].aGrupo(Grupo.NM);
                        materias[1].creadorAlumnosDefault();
                        //System.out.println("Caso 2" + i);
                        break;
                    case 2:
                        materias[2]=new Grupo("Programacion");
                        materias[2].aGrupo(Grupo.NM);
                        materias[2].creadorAlumnosDefault();
                        //System.out.println("Caso 3" +i);
                        break;
                    case 3:
                        materias[3]=new Grupo("Comunicacion");
                        materias[3].aGrupo(Grupo.NM);
                        materias[3].creadorAlumnosDefault();
                        //System.out.println("Caso 4" + i);
                        break;
                }
            }
            do{
            System.out.println("\n\nBienvenido al programa de consulta de Guadalajara University, a continuación se presentarán las opciones disponibles:");
                System.out.println("REGISTRO: Registro de nuevos estudiantes");
                System.out.println("LISTAS: Comprobar el listado de estudiantes");
                System.out.println("BOLETAS: Comprobar las calificaciones de los estudiantes");
                System.out.println("SALIR: Salir del programa\n");
                gamma=input.next();
                System.out.println("\n\n-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --\n\n");
                if(gamma.equalsIgnoreCase("REGISTRO")){gamma2=0;}
                if(gamma.equalsIgnoreCase("LISTAS")){gamma2=1;}
                if(gamma.equalsIgnoreCase("BOLETAS")){gamma2=2;}
                if(gamma.equalsIgnoreCase("SALIR"))
                {
                    beta="S";
                    System.out.println("Usted ha salido");
                    break;
                }
                if(gamma2!=1||gamma2!=2||gamma2!=0||beta.contentEquals("S"))
                {
                    System.out.print("Tramitando su solicitud: ");
                    if(gamma2==0)
                    {
                        System.out.println("CARGANDO REGISTRO...");
                    }
                    if(gamma2==1)
                    {
                        System.out.println("CARGANDO LISTAS...");
                    }
                    if(gamma2==2)
                    {
                        System.out.println("CARGANDO BOLETAS...");
                    }
                    System.out.println("\n\n-- --    -- --    -- --    -- --    -- --    -- --   \n\n");
                }
                
                switch(gamma2)
                {
                    case 0:
                        System.out.println("Hay cuatro materias: Algebra, Estatica, Programacion y Comunicacion. Escribe a cual quieres realizar la inscripción y luego teclea - ENTER -");
                        key = input.next();
                        if(key.equalsIgnoreCase("Algebra")){alpha=0;}
                        if(key.equalsIgnoreCase("Estatica")){alpha=1;}
                        if(key.equalsIgnoreCase("Programacion")){alpha=2;}
                        if(key.equalsIgnoreCase("Comunicacion")){alpha=3;}
                        System.out.println("\n\n-- --    -- --    -- --    -- --    -- --    -- --   \n\n");

                        switch(alpha)
                            {
                                case 0:
                                    materias[0].creadorAlumnos();
                                    break;
                                case 1:
                                    materias[1].creadorAlumnos();
                                    break;
                                case 2:
                                    materias[2].creadorAlumnos();
                                    break;
                                case 3:
                                    materias[3].creadorAlumnos();
                                    break;
                            }
                        System.out.println("\n - - - LLEGASTE AL LIMITE DE LA PÁGINA - - - ");
                        break;
                    case 1:
                        System.out.println("Hay cuatro materias: Algebra, Estatica, Programacion y Comunicacion. Escribe de cual quieres ver el listado de alumnos y luego teclea - ENTER -");
                        key = input.next();
                        if(key.equalsIgnoreCase("Algebra")){alpha=0;}
                        if(key.equalsIgnoreCase("Estatica")){alpha=1;}
                        if(key.equalsIgnoreCase("Programacion")){alpha=2;}
                        if(key.equalsIgnoreCase("Comunicacion")){alpha=3;}
                        System.out.println("\n\n-- --    -- --    -- --    -- --    -- --    -- --   \n\n");
                        
                        switch(alpha)
                            {
                                case 0:
                                    materias[0].getListado();
                                    break;
                                case 1:
                                    materias[1].getListado();
                                    break;
                                case 2:
                                    materias[2].getListado();
                                    break;
                                case 3:
                                    materias[3].getListado();
                                    break;
                            }
                        System.out.println("\n - - - LLEGASTE AL LIMITE DE LA PÁGINA - - - ");
                        break;
                    case 2:
                        System.out.println("Hay cuatro materias: Algebra, Estatica, Programacion y Comunicacion. Escribe de cual quieres ver el listado de alumnos y luego teclea - ENTER -");
                        key = input.next();
                        if(key.equalsIgnoreCase("Algebra")){alpha=0;}
                        if(key.equalsIgnoreCase("Estatica")){alpha=1;}
                        if(key.equalsIgnoreCase("Programacion")){alpha=2;}
                        if(key.equalsIgnoreCase("Comunicacion")){alpha=3;}
                        System.out.println("\n\n-- --    -- --    -- --    -- --    -- --    -- --   \n\n");
                        
                        switch(alpha)
                            {
                                case 0:
                                    materias[0].mostrarCal();
                                    break;
                                case 1:
                                    materias[1].mostrarCal();
                                    break;
                                case 2:
                                    materias[2].mostrarCal();
                                    break;
                                case 3:
                                    materias[3].mostrarCal();
                                    break;
                            }
                        System.out.println("\n - - - LLEGASTE AL LIMITE DE LA PÁGINA - - - ");
                        break;
                    case 3:
                        System.out.println("Usted ha salido del programa de consulta de la Universidad de Guadalajara");
                        System.out.println("\n\n-- -- --    -- -- --    -- -- --    -- -- --    -- -- --    -- -- --   \n\n");
                        break;
                }
            }while(gamma2!=2||gamma2!=1||gamma2!=0);
                
            System.out.println("Escribe S para salir, C para ver los créditos o cualquier otra tecla para continuar");
            beta = input.next();
            System.out.println("\n\n-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --\n\n");
            String creditos[] = {"P","M","A","A","B","R","L","C","O","O"," "," ","D","C","O","A","M","M","I","P","N","O","G","S","U"," ","E"," ","Z"};
            if(beta.contentEquals("C"))
            {
                for(int i=0; i<100; i++)
                {
                    if(i%2==0)
                    {
                        for(int j=10; j>0; j--)
                        {
                            System.out.print("  ");
                        }
                    }
                    if(i<creditos.length)
                    {
                        System.out.println(creditos[i]);
                    }

                }
            }
            System.out.println("\n\n-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --    -- -- --    -- --    -- --    --     --\n\n");
            System.out.println("PROYECTO: Se requiere realizar una aplicación para la Universidad que gestione las calificaciones de los alumnos en cada grupo (HARDCORE VERSION.V2)");
            System.out.println("\n\n-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --   -- -- --    -- --    -- --    --     --\n\n");
        }while(beta.compareToIgnoreCase("S")!=0);
        System.out.println("Has salido del programa");
    }
}
