import java.io.*;

public class Pr4{
	public static void main(String[] args) {
		Console c = System.console();
		String pw;
		System.out.println("password: ");
		pw = c.readLine();
		System.out.println("got "+pw);
	}
}