package java_programing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class basic_coding {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		writer.write("�ݾ��� �Է��Ͻÿ�: "+"\n");
		writer.flush();
		
		int money=Integer.parseInt(reader.readLine());
		
		int oman = money/50000;
		int temp=money%50000;
		int man=temp/10000;
		int temp2=temp%10000;
		int ocheon=temp2/5000;
		int temp3=temp2%5000;
		int cheon=temp3/1000;
		int temp4=temp3%1000;
		int obaek=temp4/500;
		int temp5=temp4%500;
		int baek=temp5/100;
		int temp6=temp5%100;
		int oship=temp6/50;
		
		writer.write("5������: "+oman+"\n"+"������: "+man+"\n"+"5õ��: "+ocheon+"\n"+"õ��: "+cheon+"\n"+"5���: "+obaek+"\n"+"���: "+baek+"\n"
		+"5�ʿ�: "+oship+"\n");
		
		
		
		writer.flush();
		writer.close();

	}

}
