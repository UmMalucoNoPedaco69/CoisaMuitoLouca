import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FirstHashTable<String, Integer> tabelaHash1 = new FirstHashTable<>(10);
        SecondHashTable<String,Integer> tabelaHash2 = new SecondHashTable<>(10);

        String arquivoCSV = "C:\\Users\\gabri\\Downloads\\Tabela hash\\Tabela hash\\src\\female_names.txt";
        int peso = 2;

        tabelaHash1.put("profe", 1, peso);
        tabelaHash1.put("java", 2, peso);
        tabelaHash1.put("dev", 3, peso);
        tabelaHash1.put("marina", 4, peso);
        tabelaHash1.put("ferias", 5, peso);

        tabelaHash2.put("profe", 1, peso);
        tabelaHash2.put("java", 2, peso);
        tabelaHash2.put("dev", 3, peso);
        tabelaHash2.put("marina", 4, peso);
        tabelaHash2.put("ferias", 5, peso);
        //--------------------------------------------------------------------------------------------------
//        //Função Hash 1
//
//       //long inicio_incer = System.nanoTime();
//        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
//            String linha;
//            int contador1 = 1;
//            while ((linha = br.readLine()) != null) {
//
//                tabelaHash1.put(linha, contador1, peso);
//
//                contador1++;
//            }
//        } catch (IOException e) {
//            System.out.println("Erro ao ler o arquivo TXT: " + e.getMessage());
//        }
//        long fim_incer = System.nanoTime();
//
//        //--------------------------------------------------------------------------------------------------
//        //Função Hash 2
//
//        long inicio_incer2 = System.nanoTime();
//        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
//            String linha;
//            int contador = 1;
//            while ((linha = br.readLine()) != null) {
//
//                tabelaHash2.put(linha, contador, peso);
//
//                contador++;
//            }
//        } catch (IOException e) {
//            System.out.println("Erro ao ler o arquivo TXT: " + e.getMessage());
//        }
//        long fim_incer2 = System.nanoTime();
//
//
//        //---------------------------------------------------------------------------------------------------
//
//
//        long inicio_busca = System.nanoTime();
//
//        int nome = tabelaHash1.get("Ana", peso);
//
//        long fim_busca = System.nanoTime();
//
//
//
//        //---------------------------------------------------------------------------------------------------
//
//
//        long inicio_busca1 = System.nanoTime();
//
//        int nome2 = tabelaHash2.get("Ana", peso);
//
//        long fim_busca1 = System.nanoTime();

//        System.out.println("Quantidade de nomes: "+tabelaHash1.getQuantidade_nomes());
//        System.out.println("Numero de colisões: "+ tabelaHash1.getColisoes());
//        System.out.println("Tempo de inserção: "+ (fim_incer - inicio_incer)+" ns" );
//        System.out.println("Tempo de busca no nome '"+nome+"':  "+ (fim_busca - inicio_busca) + "ns");
//        System.out.println();
//        System.out.println();
//        System.out.println("Quantidade de nomes: "+tabelaHash2.getQuantidade_nomes());
//        System.out.println("Numero de colisões: "+ tabelaHash2.getColisoes());
//        System.out.println("Tempo de inserção: "+ (fim_incer2 - inicio_incer2)+" ns" );
//        System.out.println("Tempo de busca no nome '"+nome2+"':  "+ (fim_busca1 - inicio_busca1) + "ns");
//        System.out.println();
//        tabelaHash1.printDistribution();

    }
}
