import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileIn {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fos = new FileOutputStream("java.txt");
			String s = "am sundari";
			byte b[] = s.getBytes();
			fos.write(b);
			fos.flush();
			fos.close();
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				FileInputStream fis = new FileInputStream("java.txt");
				int i;
				while((i=fis.read())!=-1)
				{
					System.out.print((char)i);
				}
				fis.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
