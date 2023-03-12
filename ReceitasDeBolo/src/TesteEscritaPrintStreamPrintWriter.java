
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

		//fluxo de Saída para arquivo
		
		//OutputStream fos = new FileOutputStream("ReceitasDeBolo2.txt");
		//Writer osw = new OutputStreamWriter(fos);
		//BufferedWriter bw = new BufferedWriter(osw);
		
		//FileWriter fw = new FileWriter("ReceitasDeBolo2.txt");
//		BufferedWriter bw = new BufferedWriter(new FileWriter("ReceitaDeBolo2.txt"));
		
//		PrintStream ps = new PrintStream("ReceitasDeBolo.txt");
		
		//inicio do tempo de execucao que passou desde 01/01/1970
		long ini = System.currentTimeMillis();
		
		PrintWriter ps = new PrintWriter("ReceitasDeBolo2.txt");
		
		ps.println("teste2");
		ps.println();
		ps.println("alowww");
		
		
		ps.close(); //sempre fechar quando aberto leitura de arquivo

		//fim do tempo de execucao que passou desde 01/01/1970
		long fim = System.currentTimeMillis();
		
		System.out.println("Passaram " + (fim - ini) + " milissegundos");
	}
}
