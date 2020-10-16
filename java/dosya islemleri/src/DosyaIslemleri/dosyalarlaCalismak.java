package DosyaIslemleri;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class dosyalarlaCalismak {

	public static void main(String[] args) {
		createFile();
		getFileInfo();
		readFile();
		writeFile();
	}
	
	public static void createFile() {
		
		File file = new File("/Users/beyzanurkaya/Downloads/beyza.txt");
		
		try {
			if(file.createNewFile()) {
				System.out.println("Dosya olusturuldu.");
			}else {
				System.out.println("Dosya zaten mevcut.");
			};
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getFileInfo() {
		
		File file = new File("/Users/beyzanurkaya/Downloads/beyza.txt");
		
		if(file.exists()) {
			System.out.println("Dosya adi: " + file.getName());
			System.out.println("Dosya yolu: " + file.getAbsolutePath());
		}
	}
	
	public static void readFile() {
		
		File file = new File("/Users/beyzanurkaya/Downloads/beyza.txt");
		
		try {
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeFile() {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/beyzanurkaya/Downloads/beyza.txt"));
			writer.write("Beyza");
			
			System.out.println("Dosyaya yazildi.");
			writer.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}













