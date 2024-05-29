import java.util.Locale;
import java.util.Scanner;

public class SistemaBancario {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobreNome = scanner.next();

        System.out.println("Digite sua Agência: ");
        String agencia = scanner.next();
        
        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite seu saldo");
        double saldo =scanner.nextDouble();

        System.out.println("Olá " +nome+" "+sobreNome+"! Obrigado por criar uma conta em nosso banco. Sua Agência é: " +agencia+". Conta: " +conta+ ". E seu saldo de: " +saldo+ " Já está disponivel para saque!");

    }
    
}
