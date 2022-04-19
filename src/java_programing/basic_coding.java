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
		
		writer.write("금액을 입력하시오: "+"\n");
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
		
		writer.write("5만원권: "+oman+"\n"+"만원권: "+man+"\n"+"5천원: "+ocheon+"\n"+"천원: "+cheon+"\n"+"5백원: "+obaek+"\n"+"백원: "+baek+"\n"
		+"5십원: "+oship+"\n");
		
		
		
		writer.flush();
		writer.close();

	}

}
