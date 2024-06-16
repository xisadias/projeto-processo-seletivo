import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ControleCandidatos {

    public static void main(String[] args) {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Mirela"};
        for(String candidato : candidatos){
            entrandoContato(candidato);
        }
    }
    static void entrandoContato(String candidato){
        int tentativasRealizadas =1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
            tentativasRealizadas++;

            else
            System.out.println("Contato " + candidato +  " realizado com sucesso");
        }
        while(continuarTentando && tentativasRealizadas <3);

        if(atendeu)
            System.out.println("Conseguimos contato com " + candidato+ " na " +tentativasRealizadas+
             " tentativas. ");

        else
            System.out.println("Não conseguimos contato com " + candidato+ ". Numero maximo de tentativas " 
            + tentativasRealizadas+ " realizadas." );

    }

    static boolean atender(){
        return new Random().nextInt(3) ==1;
    }


    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Mirela"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " +indice + " é " +candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Mirela", "Jonas"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados <5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " +candidato + "solicitou este valor de salário: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;

            
        }
    }
    static double valorPretendido(){
            return  ThreadLocalRandom.current().nextDouble(1800, 2200);
        }

    
    
}
