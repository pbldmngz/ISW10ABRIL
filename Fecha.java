package UnidadII.IS10ABRIL;

public class Fecha {
    int x, z, año, mes, dia;
    
    
    
    public Fecha(int año, int mes, int dia){
        this.año=año;
        this.mes=mes;
        this.dia=dia;
    }
    
    public void setFecha(int año, int mes, int dia){
        this.año=año;
        this.mes=mes;
        this.dia=dia;
        
        biciesto();
        normalizar();
    }

    public void biciesto(){
        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))){
            x=29;
        }
        else {x=28;}
    }
    
    private int[] meses = new int[]{31,x,31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public void adelantar(int año, int mes, int dia){
        this.año+=año;
        this.mes+=mes;
        this.dia+=dia;
        
        normalizar();
        } 
    
    public void normalizar(){
        
        while (mes>12){
            mes-=12;
            año+=1;
            }
        while (dia>meses[mes-1]){
            dia= dia-meses[mes-1];
            mes+=1;
            }
        }
    
    public void reset(){
        this.año=1;
        this.mes=1;
        this.dia=1;
        }
    
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAño(){
        return año;
    }
    
    public void setDia(int dia){
        this.dia=dia;
    }
    public void setMes(int mes){
        this.mes=mes;
    }
    public void setAño(int año){
        this.año=año;
    }
    
    public String imprimir(){
        return "Fecha: " + dia + "/" + mes + "/" + año;
        }
    
    public String toString(){
        if (mes>12||dia>meses[mes-1]){normalizar();}
        return getDia() + "/" + getMes() + "/" + getAño();
        }

}
