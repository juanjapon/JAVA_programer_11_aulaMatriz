public interface IEvaluadorRespuestas {
    boolean evaluarRespuesta(String respuestaEstudiante,String respuestaCorrecta);

    default void mostrarResultado(String message){
        System.out.println(message);
    }
}
