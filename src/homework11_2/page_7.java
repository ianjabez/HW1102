package homework11_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class page_7 
{
	public static void main(String[] args) throws IOException{
		System.out.println("請輸入整數");
		BufferedReader br = new BufferedReader(new
		InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		if(num == 1) {
		System.out.println("輸入的是 1");
		System.out.println("選擇的是 1");
		}
		System.out.println("結束處理");
		}
}
