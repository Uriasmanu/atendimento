import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int idade;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Por gentileza, antes de entrar na fila, digite a sua idade: ");
        idade = leitor.nextInt();

        if(idade >= 60){
            if (idade >= 80){
                System.out.println("O(A) senho(a) irá para a fila de prioridade especial");
            }
            else{
                 System.out.println("O(A) senho(a) irá para a fila de prioridade");
            }
        }
        else{
             System.out.println("O(A) senho(a) irá para a fila normal");
        }
    }
}
