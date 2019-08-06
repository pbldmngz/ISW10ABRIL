/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnidadII.IS10ABRIL;

public class Estudiante {
       
    public static String esc;
    public static String mat;
    public static String fecha;
    public static String nom;
    public static String ape;
    public static String car;
    
    
    public Estudiante()
    {
        fecha = "Fecha";
        nom = "Nombre";
        ape = "Apellido";
        esc = "Escuela";
        car = "Carrera";
        mat = alumnoMat();
    }
    
    public String alumnoName()//Se obtiene de forma aleatoria el nombre de un alumno basándose en una lista de 20 nombres
    {

        String[] names={"Pablo","Ghala","Mariana","Marco","Ivan","Frank","Juan","Lucía","Christopher","Isaac","Ismael","Paco","Patricio","Pascual","Selena","Bartolomeo","Pichardios","Felipe","Rodrigo","Armando"};
        String[] names2={"Antonio","Aurelio","Jose","Luis","Ivan","Francisco","Luan","Gilberto","Christopher","Isaac","Ismael","Alberto","Xavier","Gerardo","Santiago","René","Maria","Felipe","Rodrigo","Armando"};
        String aleatorio;
            aleatorio=names[(int)(Math.random()*20)] + " " + names2[(int)(Math.random()*20)];
            return aleatorio;

    }
    
    public String alumnoApellido()//Se obtiene de forma aleatoria el apellido de un alumno basándose en una lista de 20
    {

        String[] names={"Rossi", "Esposito", "Russo", "Romano", "Bianchi", "Ferrari", "Marino", "Greco", "Giordano", "De Luca", "Bruno", "Rizzo", "Gallo", "Ricci", "Caruso", "Costa", "Mancini", "Ferrara", "Leone", "Colombo"};
        String[] names2={"Santoro", "Conti", "Coppola", "Amato", "Bianco", "Vitale", "Lombardi", "Fiore", "Conte", "Messina", "Parisi", "De Rosa", "D’angelo", "Rinaldi", "De Santis", "Lombardo", "Martini", "Longo", "Serra", "Gentile"};
        String aleatorio;
            aleatorio=names[(int)(Math.random()*20)] + " " + names2[(int)(Math.random()*20)];
            return aleatorio;

    }
    
    public String alumnoMat()//Crear de forma aleatoria la matrícula de un alumno
    {
        String aleatorio=String.valueOf((int)(Math.random()*10000));
        return aleatorio;
    }
    
    public String fechaNacimiento()
    {
        int dia=(int)(Math.random()*31);
        int mes=(int)(Math.random()*12)+1;
        int año=(int)(Math.random() * 20) + 1989;
        
        Fecha fechaestructurada = new Fecha(1, 1, 1);
        fechaestructurada.setDia(dia);
        fechaestructurada.setMes(mes);
        fechaestructurada.setAño(año);
        fechaestructurada.normalizar();
        return fechaestructurada.toString();
    }
    
    public String genCarrera(String i)//Se obtiene de forma externa si el estudiante es de ingeniería o licenciatura. El valor de i será utilizado también para saber si se debe crear una columna extra de calificaciones para proyecto integrador
    {
        if (i.equals("Ingenieria"))
        {
            String[] names={"Software", "Diseño Grafico Digital", "Energias Renovables", "Mecatronica", "Industrial"};
            String aleatorio;
                aleatorio=names[(int)(Math.random()*5)];
                return aleatorio;
        }
        else
        {
            String[] names={"Diseño Grafico", "Negocios Internacionales", "Mercadotecnia", "Derecho", "Administracion de Empresas"};
            String aleatorio;
                aleatorio=names[(int)(Math.random()*5)];
                return aleatorio;
        }
        
            
    }
    
    public String genEscuela()//Se obtiene de forma aleatoria la escuela en la que están los estudiantes
    {

        String[] names={"Ingenieria", "Licenciatura"};
        String aleatorio;
            aleatorio=names[(int)(Math.random()*2)];
            return aleatorio;

    }
    
    //SETS
    public void setNombre(String n)
    {
        nom=n;
    }
    
    public void setApellido(String a)
    {
        ape = a;
    }
    
    public void setMatricula(String m)
    {
        mat = m;
    }
    
    public void setFecha(int f1, int f2, int f3)
    {
        Fecha fechaestructurada = new Fecha(1,1,1);
        fechaestructurada.setDia(f1);
        fechaestructurada.setMes(f2);
        fechaestructurada.setAño(f3);
        fechaestructurada.normalizar();
        fecha = fechaestructurada.toString();
    }
    
    public void setFecha2(String alpha)
    {
        fecha = alpha;
    }
    
    public void setEscuela(String e)
    {
        esc = e;
    }
    
    public void setCarrera(String c)
    {
        car = c;
    }

    //GETS
    public String getNombre()
    {
        return nom;
    }
    
    public String getApellido()
    {
        return ape;
    }
    
    public String getMatricula()
    {
        return mat;
    }
    
    public String getFecha()
    {
        return fecha;
    }
    
    public String getEscuela()
    {
        if (getCarrera().contentEquals("Software")||getCarrera().contentEquals("Diseño Grafico Digital")||getCarrera().contentEquals("Energias Renovables")||getCarrera().contentEquals("Mecatronica")||getCarrera().contentEquals("Industrial")){return "Ingenieria";}
        if (getCarrera().contentEquals("Diseño Grafico")||getCarrera().contentEquals("Negocios Internacionales")||getCarrera().contentEquals("Mercadotecnia")||getCarrera().contentEquals("Administracion de Empresas")||getCarrera().contentEquals("Derecho")){return "Licenciatura";}
        else{return "(((---)))RRRFFFZZZZ...";}
        
    }
    
    public String getCarrera()
    {
        return car;
    }
    
    
    public String toString()
    {
        return "Alumno: " + getNombre() + " " + getApellido() + ", Escuela de " + getEscuela() + ", " + getCarrera() + ", Matrícula: " + getMatricula() + ", Fecha de nacimiento: " + getFecha();
    }
    
    public boolean LICoING()//Envía TRUE si el estudiante es ingeniero, servirá para los listados de calificaciones
    {
        if(esc.contentEquals("Ingenieria"))
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
    
}    
    
    
    class EstudianteGenuino extends Estudiante {
        public EstudianteGenuino(String a,String b,String c,String d,String e )
        {
            super();
            fecha = c;
            nom = a;
            ape = b;
            esc = d;
            car = e;
            mat = alumnoMat();
        }
    }
    /*
    class EstudiantePredefinido extends EstudiantePrototipo{
        public EstudiantePredefinido()
        {
            super();
            mat = alumnoMat();
            fecha = fechaNacimiento();
            nom = alumnoName();
            ape = alumnoApellido();
            esc = genEscuela();
            car = genCarrera(esc);

        }
        
        public void EstudianteBOT()
        {
            mat = alumnoMat();
            fecha = fechaNacimiento();
            nom = alumnoName();
            ape = alumnoApellido();
            esc = genEscuela();
            car = genCarrera(esc);
        }
    }*/

