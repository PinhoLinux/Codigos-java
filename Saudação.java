import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo ao usuário para inserir seu nome
        System.out.print("Por favor, insira seu nome: ");
        String nome = scanner.nextLine();
        
        // Imprimindo a saudação
        System.out.println("Olá, " + nome + "!");
        
        // Fechando o scanner
        scanner.close();
    }
}
