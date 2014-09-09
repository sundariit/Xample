import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
public class FileInOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis = new FileInputStream("Sundari.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			int i;
			while((i=bis.read())!=-1)
			{
				System.out.print((char)i);
			}
			bis.close();
		}
		catch(IOException ie)
		{
			System.out.println("exception thrown:"+ie);	
		}
		finally
		{
			try
			{
				FileOutputStream fos = new FileOutputStream("Sundari.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				String s = "am an employee of Vaavel";
				byte b[] = s.getBytes();
				bos.write(b);
				bos.flush();
				bos.close();
			}
			catch(IOException ie)
			{
				ie.printStackTrace();
			}
		}
	}

}
