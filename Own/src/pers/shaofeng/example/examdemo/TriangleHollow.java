package pers.shaofeng.example.examdemo;

public class TriangleHollow {
	public static void main(String[] args){
		int line=5;
		for(int i=1;i<=line;i++){
			for(int j=1;j<=line-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++){
				if(i==1||i==line){
					System.out.print("*");
				} 
				else if(k==1||k==i*2-1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
