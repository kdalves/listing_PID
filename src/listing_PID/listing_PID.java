package listing_PID;
import java.io.IOException;

public class listing_PID {
	public static void main(String[] args) throws IOException
	   {
	      Process p = new ProcessBuilder("notepad.exe").start();
	      System.out.println(p.pid());
	   }
}
