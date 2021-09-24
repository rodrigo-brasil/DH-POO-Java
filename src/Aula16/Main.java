package Aula16;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
	    Paciente paciente=new Paciente("Juan","Perez","12345",new Date(121, Calendar.SEPTEMBER,15));
	    paciente.darAlta(new Date(121, Calendar.SEPTEMBER,14));
        }catch (PacienteException e){
            System.out.println(e.toString());
        }

    }
}
