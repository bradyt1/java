// file: Asc.java
// javac Asc.java
// java Asc
class asc {
	public static void main (String a[]){
		//variables 
		int i;// integer 1
		char c;// character c
		//for loop
		for (i = 0; i < 256; i++){
			c = (char)i;
			System.out.print(i+"="+c+" ");
			if(i % 10 == 0){System.out.println();}
			//SystSystem.out.print(" ");
		}
	}
}
