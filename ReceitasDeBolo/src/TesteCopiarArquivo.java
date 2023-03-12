import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		
		//Para entrada e saída de rede
		Socket s = new Socket();

		//fluxo de entrada com arquivo - Teclado // Arquivo // Rede
		InputStream fis = System.in;//new FileInputStream("ReceitasDeBolo.txt"); // s.getInputStream();
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
				
		//fluxo de saída para arquivo - Teclado // Arquivo // Rede
		OutputStream fos = System.out; //new FileOutputStream("ReceitasDeBolo2.txt"); //s.getOutputStream();
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();//para ler a primeira linha do txt
		
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		
		br.close(); //sempre fechar quando aberto leitura de arquivo
		bw.close(); //fechando bufferedWriter
	}
}
