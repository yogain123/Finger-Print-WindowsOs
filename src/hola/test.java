package hola;

import java.io.IOException;

//import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()

public class test {
	
	
	
	public String getImage(String image1, String image2)throws IOException
	{
		holahola h = new holahola();
		//System.out.println();
		return h.getImage(image1,image2);
	}

}