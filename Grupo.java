/*
    Contructor de grupos/materias, solamente tiene que pedirla y se dará //Considera una parte de los comentarios como andamios que sirvieron para la realización de este proyecto
 */
package UnidadII.IS10ABRIL;
import java.util.Scanner;
//import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.Arrays;

public class Grupo {
    
    public static String CDG; //Clave del Grupo //Se deberá pedir al usuario, de momento
    public static String CDM; //Clave de la materia //Se debará pedir al usuario
    public static String NM; //Nombre de la materia //Se deberá pedir al usuario, dejémosla en 4 materias con un nombre ya definido, de ser posible elegir cuáles cursar
    public static String NDM; //Nombre del maestro //Generador random de nombres
    public static int LF; //Límite de faltas
    //public static Estudiante[] LE = new Estudiante[50]; //Lista de estudiantes
    //public static int[][] CAL;
    public static LinkedList <Estudiante> est1 = new LinkedList <Estudiante> ();
    //public static ArrayList <EstudianteGenuino> est2 = new ArrayList <EstudianteGenuino> ();
    //public static ArrayList<String> est = new ArrayList<String>();
    
    public Grupo(String c)
    {
        //CDG = a;//Random como la matrícula, se le añaden unas letras al principio para que se vea bien
        //CDM = b;//Random como la matrícula, se le añaden unas letras al principio para que se vea bien
        NM = c;//Se generan cuatro materias con sus respectivos nombres automáticamente
        //NDM = d;
        //LF = e;//Random de cantidad de faltas disponible
    }
    
    public void aGrupo(String c)//Eventualmente necesitaré la informacion de los grupos//
    {
        CDG = genClaves();//Random como la matrícula, se le añaden unas letras al principio para que se vea bien
        CDM = genClaves();//Random como la matrícula, se le añaden unas letras al principio para que se vea bien
        NM = c;//El usuario debe de elegir entre varias opciones (4 concretamente)
        NDM = nameGen();
        LF = limFaltas();//Random de cantidad de faltas disponible
    }
    
    public void creadorAlumnosDefault()//Fuente del único error: al crearse los alumnos funciona como es debido pero al agregarlos al arreglo estos se van reemplazondo por el último agregado así que todos acaban siendo el mismo
    {
        
        
        int canAlumnos=(int)(Math.random() * 25) + 10 ;//Cantiad de alumnos de la clase antes de inscribir

        for(int i=0;i<canAlumnos;i++)//Necesito hacer esto de forma externa para crear alumnos por defecto y luego crear los inscritos pero se ocupan ambas cantidades para hacer el setListado
                {
                Estudiante estudiante = new Estudiante();
                String a =estudiante.alumnoName();
                String b =estudiante.alumnoApellido();
                String c =estudiante.fechaNacimiento();
                String d =estudiante.genEscuela();
                String e =estudiante.genCarrera(d);
                //EstudianteGenuino estudiante2= new EstudianteGenuino(a,b,c,d,e);
                      //if (i>0){System.out.println("Primer registro!" + est1.get(i-1));}//Todo bien hasta que llegan por segunda vez al est.add
                      est1.add(new EstudianteGenuino(a,b,c,d,e));
                      //est1.add(new EstudianteGenuino(a,b,c,d,e));
                      //LE[i]=new EstudianteGenuino(a,b,c,d,e);
                      //System.out.println("Hola!" + est1.get(i));//Si se están creando los alumnos que deben, no hay problema salvo que hay solo 4 repetidos varias veces
                }
        //Sería demasiado fácil mostrar la lista ficticia de alumnos con el est1.get(i)) dentro del bucle pero no se guardaría en memoria, y ese es el propósito
        //Entre más profundizo más raro se vuelve, ya son las 3:40AM pero me niego a dejarme vencer por mi propio programa
        //hice un array aparte del List para comprobar que si se metieras objeto diferentes pero por lo que veo en cada hueco del arreglo hay cuatro objetos, volvi a crear cancer
        //por lo que al buscar en otras posiciones cada nombre se multiplica por ese numero pero siguen siendo solo 4 distintas
        //Parece ser que se van reemplazando los anteriores por el último, debo encontrar la razón 1PM
        //11PM Después de mejorar la interfaz y otras modificaciones meores aún necesito arreglar este problema de reemplazo;
        //Sigue intentandolo, ahora son las 3AM y sigo sin saber como arreglar el reemplazo de la lista;
        //Leí por internet que quizás es por declararla estática pero 1 no me dio cambios y 2 me da errores
    }
    
    public void creadorAlumnos()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de estudiantes que solicita inscribir");
        int cant = input.nextInt();//Alumnos a inscribir
        int cial = est1.size();//Cantidad inicial de alumnos
        String nom, ape, esc, car;
        int fe1, fe2, fe3;
        String alpha;

        for(int i=0;i<est1.size();i++)
        {
            System.out.println(est1.get(i).toString());
        }
        for(int i=0;i<cant;i++)
                 {
                     String nombre;
                     String apellido;
                     System.out.println("Inscripción n° " + (i+1));
                      
                      System.out.print("Nombres del alumno: ");
                      nom=input.next();
                      nombre = nom;
                      //System.out.print("Segundo nombre del alumno: ");
                      nom=input.next();
                      nombre = nombre + " " + nom;
                      System.out.print("Apellidos del alumno: ");
                      ape=input.next();
                      apellido=ape;
                      //System.out.print("Apellido materno del alumno: ");
                      ape=input.next();
                      apellido = apellido + " " + ape;
                      System.out.println("Fecha de nacimiento del alumno, escriba dia, mes y año separado por un - ENTER -");
                      fe1=input.nextInt();
                      fe2=input.nextInt();
                      fe3=input.nextInt();
                      System.out.println("Escuela a la que asistirá alumno, puede ser Ingenieria o Licenciatura:");
                      esc=input.next();
                      if(esc.contentEquals("Ingenieria")){System.out.println("Carrera a la que asistirá al alumno, puede elegir entre Software, Diseño Grafico Digital, Energias Renovables, Mecatronica o Industrial:");}
                      if(esc.contentEquals("Licenciatura")){System.out.println("Carrera a la que asistirá al alumno, puede elegir entre Diseño Grafico, Negocios Internacionales, Mercadotecnia, Derecho, Administracion de Empresas:");}
                      esc=input.nextLine();//Es algo tonto pero cuando pones un next() antes de un nextLine() se salta el nextLine() así que pongo este inofensivo por aquí ;)
                      car=input.nextLine();
                      
                      alpha= fe1 + "/" + fe2 + "/" + fe3;
                      
                      est1.add(new EstudianteGenuino(nombre,apellido,alpha,esc,car));
                      
                      System.out.println("Inscrito al alumno con los siguientes datos:");
                      System.out.println(est1.get(i+cial).toString());
                      System.out.println(" ");
                 }
        //setListado(est1.size()+est2.size());//Importante la ubicación de esta cosita
    }
    
    public String nameGen() //Generador de nombres aleatorios para profesores
    {
        String[] names={"Pablo","Ghala","Mariana","Marco","Ivan","Frank","Juan","Lucía","Christopher","Isaac","Ismael","Paco","Patricio","Pascual","Selena","Bartolomeo","Jorge VI","Felipe","Rodrigo","Armando"};
        String[] names2={"Rossi", "Esposito", "Russo", "Romano", "Bianchi", "Ferrari", "Marino", "Greco", "Giordano", "De Luca", "Bruno", "Rizzo", "Gallo", "Ricci", "Caruso", "Costa", "Mancini", "Ferrara", "Leone", "Colombo"};
        String[] names3={"Santoro", "Conti", "Coppola", "Amato", "Bianco", "Vitale", "Lombardi", "Fiore", "Conte", "Messina", "Parisi", "De Rosa", "D’angelo", "Rinaldi", "De Santis", "Lombardo", "Martini", "Longo", "Serra", "Gentile"};
        String aleatorio;
        aleatorio=names[(int)(Math.random()*19)] + " " + names2[(int)(Math.random()*19)]+ " " + names3[(int)(Math.random()*19)];
            return aleatorio;
    }
    
    public int limFaltas() //Generador de límite de faltas de la materia
    {
        int faltas = (int)(Math.random()*25);
        return faltas;
    }
    
    public String genClaves()//Generados para claves de grupo y materia
    {
        String[] letras={"a","b","c","d","e","f","g","h","i","j","k","l","n","m","o","p","q","r","s","t","u","v","w","x","y","z"};
        String aleatorio = letras[(int)(Math.random()*19)] +""+ letras[(int)(Math.random()*19)];
        int var = (int)(Math.random()*10000);
        return aleatorio + "" + var;
    }
    
    public void getListado()//Genera un listado de los estudiantes
    {
        int len;
        System.out.println("N°    Nombre                Apellidos                 MAT.   Carrera");
        for(int i=0; i<est1.size(); i++)
        {
            if(i<9&&i>=0){System.out.print((i+1)+".    ");}
            if(i<99&&i>=9){System.out.print((i+1)+".   ");}
            if(i<999&&i>=99){System.out.print((i+1)+".  ");}
            
            System.out.print(est1.get(i).getNombre());
            for(int j=0; j<22-est1.get(i).getNombre().length(); j++)
            {
                System.out.print(" ");
            }
            System.out.print(est1.get(i).getApellido());
            for(int j=0; j<26-est1.get(i).getApellido().length(); j++)
            {
                System.out.print(" ");
            }
            System.out.print(est1.get(i).getMatricula());
            len = est1.get(i).getMatricula().length();
            for(int j=0; j<7-len; j++)
            {
                System.out.print(" ");
            }
            System.out.print(est1.get(i).getCarrera()+"\n");
        }
        //System.out.println("Al menos lo intentax2"); //Esto significa que el error es de más arriba, significa que "est" no tiene tamaño
    }
    
    /*public void listaCalificaciones()
    {
        boolean alpha;
        Calificaciones cal = new Calificaciones();
        //Bots de alumnos
        for (int i=0; i<est1.size();i++)
        {
            alpha = est1.get(i).LICoING();
            if(alpha=true)//El alumno estudia Ingeniería
            {
                Calificaciones.setArrayING(est1.get(i).getNombre() + " " + est1.get(i).getApellido(), est1.get(i).getMatricula(), est1.size());
            }
            else//El alumno estudia licenciatura
            {
                Calificaciones.setArrayLIC(est1.get(i).getNombre() + " " + est1.get(i).getApellido(), est1.get(i).getMatricula(), est1.size());
            }
        }
        //Alumnos reales
        for (int i=0; i<est2.size();i++)
        {
            alpha = est2.get(i).LICoING();
            if(alpha=true)//El alumno estudia Ingeniería
            {
                Calificaciones.setArrayING(est2.get(i).getNombre() + " " + est2.get(i).getApellido(), est2.get(i).getMatricula(), est2.size());
            }
            else//El alumno estudia licenciatura
            {
                Calificaciones.setArrayLIC(est2.get(i).getNombre() + " " + est2.get(i).getApellido(), est2.get(i).getMatricula(), est2.size());
            }
        }
    }*/
    
    public int cantidadING()//Cantidad de ingenieros
    {
        int x=0;
        int y=0;
        for(int i=0; i<est1.size();i++)
        {
            if(est1.get(i).LICoING()==true)
            {
                x+=1;
            }
        }
        
        return x;
    }
    
    public void mostrarCal()
    {
        Calificaciones.setArray(cantidadING());//Es posible que se esté generando una versión aparte de las variables y por ello no se da bien la longitud del arreglo?
        Calificaciones.outputArray(cantidadING());
    }
    
    public String toString()
    {
        return "Este es el toString sin editar de la clase Grupo, no hay razón para mostrarlo";
    }
}

//Encuentra alguna forma de hacer arreglos dinamicos sin usar ArrayList... te encanta complicarte la existencia ¿Cierto?
//Esto es para mañana... buena suerte con ello.
//No irse por las ramas es un buen consejo.
//20:00 Yo te lo dije ;)
//Son las 8:28 AM y aún no he terminado 8(
//Sol las 10:54... aún no termino pero está a media hora
//Ya casi parece que funciona solo que el usuario se repite en el listado