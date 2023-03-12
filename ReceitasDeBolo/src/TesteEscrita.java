
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		//fluxo de Saída para arquivo
		
		OutputStream fos = new FileOutputStream("ReceitasDeBolo2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("teste");
		bw.newLine();
		bw.write("heushesuhesuehs");
		
		
		bw.close(); //sempre fechar quando aberto leitura de arquivo

	}
}
