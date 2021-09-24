package Aula16;

public class PacienteException extends RuntimeException{


    public PacienteException(String message) {
        super(message);
    }

    @Override
    public String toString() {
      return getMessage();
    }
}
