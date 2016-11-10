package pers.shaofeng.example.demo_20;

public class TheChicken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <=100; i++) {
			for (int j = 0; j <=100; j++) {
				for (int k = 0; (k <=100)&&(k%3==0); k+=3) {
					if ((5*i+3*j+k/3==100)&&(i+j+k==100)) {
						System.out.println("公鸡:"+i+"\t"+"母鸡:"+j+"\t"+"小鸡:"+k);
						
					}
					
				}
				
			}
			
		}
	}

}
