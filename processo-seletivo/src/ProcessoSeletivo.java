import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

//        System.out.println("Processo seletivo");
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite o salario pretendido: ");
//        double salarioPretendido = scanner.nextDouble();
//
//        analisarCandidato(salarioPretendido);

        selecaoCandidatos();
        String [] candidatos = {"Felipe","João","Jefferson","Sandrele","Beatriz"};
        for (String candidato:candidatos){
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            }else {
                System.out.println("Contato realizado com sucesso!");
            }
        }while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu){
            System.out.println("Conseguimos contato com candidato " + candidato+" na " +tentativasRealizadas+ " tentativa");
        }else {
            System.out.println("Não conseguimos contato com " +candidato+", numero maximo de tentativas "+tentativasRealizadas);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe","João","Jefferson","Sandrele","Beatriz"};
        for (String candidato:candidatos) {
            System.out.println("O candidato selecionado foi : " + candidato);
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe","João","Jefferson","Sandrele","Beatriz","Jonnas","Melquiades","Dulce",
                                "Clara","Clarissa"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + ", solicitou um salario de R$ " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println(candidato + " está contratado!");
                candidatosSelecionados++;
            }else{
                System.out.println(candidato + ", obrigado por se candidatar!");
            }
            candidatoAtual++;
        }

    }

     static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            System.out.println("LIGANDO PARA O CANDIDATO...");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGANDO PARA O CANDIDATO COM CONTRA PROPOSTA...");
        }else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS...");
        }
    }
}
