import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		//fluxo de entrada com arquivo
		
		InputStream fis = new FileInputStream("ReceitasDeBolo.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();//para ler a primeira linha do txt
		
		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close(); //sempre fechar quando aberto leitura de arquivo

	}
}
