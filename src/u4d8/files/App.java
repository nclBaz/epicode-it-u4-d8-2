package u4d8.files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class App {
	private static File file = new File("info.txt");

	public static void main(String[] args) {
		try {
			saveOnDisk("NUOVA RIGA");
			System.out.println("FILE SALVATO!");

			System.out.println("ECCO IL CONTENUTO DEL FILE:");
			System.out.println(readFromDisk());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void saveOnDisk(String testo) throws IOException {
		FileUtils.writeStringToFile(file, testo + System.lineSeparator(), "UTF-8", true);

		// System.lineSeparator() si occupa di usare l' "a capo" corretto a seconda del
		// sistema operativo
		// che stiamo utilizzando
		// L'ultimo parametro booleano sta ad indicare se vogliamo fare un append
		// (true),
		// oppure sovrascrivere (false, default)

		// UTF-8 è il set di caratteri occidentali
	}

	public static String readFromDisk() throws IOException {
		if (file.exists()) {
			String content = FileUtils.readFileToString(file, "UTF-8");
			return content;

		} else {
			System.out.println("File non trovato!");
			return "";
		}
	}

}
