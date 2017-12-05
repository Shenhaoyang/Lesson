package Shiyan4_1;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//定义并初始化数组
		Scanner scanner = new Scanner(System.in 

				);
				        int max_val = scanner.nextInt();
				        for (int i = 0; i < max_val - 1; ++i) {
				            for (int j = 0; j < max_val - i; ++j) {
				                System.out.print(' ');
				            }
				            for (int j = 0; j < i; ++j) {
				                System.out.print((char) ('A' + j));
				            }
				            for (int j = i; j >= 0; --j) {
				                System.out.print((char) ('A' + j));
				            }
				            System.out.println();
				        }
				        for (int i = max_val - 1; i >= 0; --i) {
				            for (int j = 0; j < max_val - i; ++j) {
				                System.out.print(' ');
				            }
				            for (int j = 0; j < i; ++j) {
				                System.out.print((char) ('A' + j));
				            }
				            for (int j = i; j >= 0; --j) {
				                System.out.print((char) ('A' + j));
				            }
				            System.out.println();
				        }
				    }
	}



