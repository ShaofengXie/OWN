package pers.shaofeng.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferDemo {

	public static void main(String[] args) throws IOException {

		File src =new File(
				"F:"+File.separator+"fileDemo"+File.separator+"Test"+File.separator+"test.txt");
		File dest =new File(
				"F:"+File.separator+"fileDemo"+File.separator+"Test"+File.separator+"testcopy.txt");
		Reader in= new FileReader(src);
		BufferedReader bReader=new BufferedReader(in);
		
		Writer writer= new FileWriter(dest);
		BufferedWriter bWriter=new BufferedWriter(writer);
		String tmp=bReader.readLine();
		while (tmp!=null) {
			bWriter.write(tmp);
			bWriter.newLine();
			tmp=bReader.readLine();
			
		}
		in.close();
		writer.close();
		bReader.close();
		bWriter.close();
		System.out.println("文件完成复制");
	}
	

}
