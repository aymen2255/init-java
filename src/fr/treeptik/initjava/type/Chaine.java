package fr.treeptik.initjava.type;

public class Chaine {

	public static void main(String[] args) {
		String s1 ="hello";
		String s2 ="world";
		String s3 = s1+s2;
		
		System.out.println(s3);
		StringBuilder builder= new StringBuilder();
		builder.append(s1).append(" ").append(s2);
		System.out.println(builder);

	}

}
