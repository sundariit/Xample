
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class DataInOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader ins = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ins);
		try
		{
			System.out.println("whats ur name");
			String str = br.readLine();
			System.out.println("your name is "+str);
			br.close();
			ins.close();
		}
		catch(Exception e)
		{
			System.out.println("exception "+e);			
		}
	}

}