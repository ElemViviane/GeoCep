import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Informe o CEP para busca: ");
        String cep = sc.nextLine();
        try {
            Endereco endereco = consultaCep.buscaEndereco(cep);
            System.out.println(endereco);
            GeradorDeArquivos geradorDeArquivos = new GeradorDeArquivos();
            geradorDeArquivos.salvaJson(endereco);
        } catch(RuntimeException | IOException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\nPrograma executado com sucesso.");
        }
    }
}
