package me.th3pf.plugins.duties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class FileExtractor
{
	public static void ExtractFile(String resourceFile, String destination) throws IOException
	{
		InputStream inputStream = ClassLoader.class.getResourceAsStream(resourceFile);
		FileOutputStream outputStream;
		
		outputStream = new FileOutputStream(destination);
		
		byte[] buffer = new byte[1024];
		int len;
			while ((len = inputStream.read(buffer)) != -1) {
			    outputStream.write(buffer, 0, len);
			}
			outputStream.flush();
			outputStream.close();

	}
}
