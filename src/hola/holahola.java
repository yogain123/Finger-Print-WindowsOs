package hola;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
class holahola
{
	public String getImage(String image1,String image2)throws IOException
	{
		
		image1 = image1+".wsq";
		image2 = image2+".wsq";
		int c =0;
		
		
		//----------------------------------------------------
		/*File f = new File("C:\\nbis_v5_0_0\\Rel_5.0.0\\mindtct\\bin\\sample_image.wsq");
		if(f.exists() && !f.isDirectory()) { 
		    // do something
		}*/
		File ff = new File("C:\\nbis_v5_0_0\\Rel_5.0.0\\mindtct\\bin\\");
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(ff.list()));
		
		for(String z : names)
		{
			if(z.equalsIgnoreCase(image1) || z.equalsIgnoreCase(image2))
				c++;
		}
			if(c==2)
			{
				File fff1 = new File("C://nbis_v5_0_0//Rel_5.0.0//mindtct//bin",image1);
				File fff2 = new File("C://nbis_v5_0_0//Rel_5.0.0//mindtct//bin","hola_image1.wsq");
				fff1.renameTo(fff2);
				
				File fff3 = new File("C://nbis_v5_0_0//Rel_5.0.0//mindtct//bin",image2);
				File fff4 = new File("C://nbis_v5_0_0//Rel_5.0.0//mindtct//bin","hola_image2.wsq");
				fff3.renameTo(fff4);
				
				ProcessBuilder builder = new ProcessBuilder(
			            "cmd.exe", "/c", "cd \"C:\\nbis_v5_0_0\\Rel_5.0.0\\mindtct\\bin\" && mindtct hola_image1.wsq output1");
			        builder.redirectErrorStream(true);
			        Process p = builder.start();
			        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
			        String line;
			        while (true) {
			            line = r.readLine();
			            if (line == null) { break; }
			            System.out.println(line);
			        }
			        
			        ProcessBuilder builder2 = new ProcessBuilder(
				            "cmd.exe", "/c", "cd \"C:\\nbis_v5_0_0\\Rel_5.0.0\\mindtct\\bin\" &&  mindtct hola_image2.wsq output2");
				        builder2.redirectErrorStream(true);
				        Process p2 = builder2.start();
				        BufferedReader r2 = new BufferedReader(new InputStreamReader(p2.getInputStream()));
				        String line2;
				        while (true) {
				            line2 = r2.readLine();
				            if (line == null) { break; }
				            System.out.println(line2);
				        }
				      
			//-----------------------------------------------------------------
			File f = null;
		      boolean bool = false;
		      
		      try{
		        
		         f = new File("c:/nbis_v5_0_0/Rel_5.0.0/bozorth3/bin/output2.xyt");
		         
		         bool = f.createNewFile();
		        
		         System.out.println("File created: "+bool);
		       
		            
		      }catch(Exception e){
		         e.printStackTrace();
		      }	         
		      
		      //-----------------------------------------------------------
		      f = null;
		      bool = false;
		      
		      try{
		        
		         f = new File("c:/nbis_v5_0_0/Rel_5.0.0/bozorth3/bin/output1.xyt");
		         
		         bool = f.createNewFile();
		        
		         System.out.println("File created: "+bool);
		            
		      }catch(Exception e){
		         e.printStackTrace();
		      }	         
		      
		      //-------------------------------------------------------------
		      
		      File srcFolder = new File("c:\\nbis_v5_0_0\\Rel_5.0.0\\mindtct\\bin\\output1.xyt");
		      File destFolder = new File("c:\\nbis_v5_0_0\\Rel_5.0.0\\bozorth3\\bin\\output1.xyt");
		    	
		    	if(!srcFolder.exists())
		    	{

		           System.out.println("Directory does not exist.");
		           //just exit
		           System.exit(0);

		        }
		    	else
		    	{

		           try
		           {
		        	copyFolder(srcFolder,destFolder);
		           }
		           catch(IOException e)
		           {
		        	e.printStackTrace();
		        	//error, just exit
		                System.exit(0);
		           }
		        
		    	System.out.println("Done");
		    	}
		    
	    	//-------------------------------------------------------------------
		    	 File srcFolder1 = new File("c:\\nbis_v5_0_0\\Rel_5.0.0\\mindtct\\bin\\output2.xyt");
			    	File destFolder1 = new File("c:\\nbis_v5_0_0\\Rel_5.0.0\\bozorth3\\bin\\output2.xyt");
		    	
			    	if(!srcFolder1.exists()){

				           System.out.println("Directory does not exist.");
				           //just exit
				           System.exit(0);

				        }else{

				           try{
				        	copyFolder(srcFolder1,destFolder1);
				           }catch(IOException e){
				        	e.printStackTrace();
				        	//error, just exit
				                System.exit(0);
				           }
				        
				    	System.out.println("Done");
				    }
		    	
	    	
			//-------------------------------------------------------------------	        
				    System.out.print("Minuatea rate is ");   
				      ProcessBuilder builder3 = new ProcessBuilder(
					            "cmd.exe", "/c", "cd \"C:\\nbis_v5_0_0\\Rel_5.0.0\\bozorth3\\bin\" && bozorth3 output1.xyt output2.xyt");
					        builder3.redirectErrorStream(true);
					        Process p3 = builder3.start();
					        BufferedReader r3 = new BufferedReader(new InputStreamReader(p3.getInputStream()));
					        String line3;
					        while (true) {
					        	
					            line3 = r3.readLine();
					            
					            fff2.renameTo(fff1);
					            fff4.renameTo(fff3);
					            
					            //--------------------------------------
					            ProcessBuilder del = new ProcessBuilder(
					   				 "cmd.exe", "/c", "cd \"C:\\nbis_v5_0_0\\Rel_5.0.0\\mindtct\\bin\" && del output1.* output2.*");
					            	 Process deleteProcess =del.start();
					   		//------------------------------------
					            
					            
					            
					            return line3;
					          
					        }
					
		    	
		    
		}
			else if((c==1 && image1.equalsIgnoreCase(image2)))
				return "Both the finger print are exactly same";
			else
				return "one or both image not present in database";
		
	 	
}

public static void copyFolder(File src, File dest)
    	throws IOException
    	{
    	
    	if(src.isDirectory()){
    		
    		if(!dest.exists()){
    		   dest.mkdir();
    		   System.out.println("Directory copied from " 
                              + src + "  to " + dest);
    		}
    		
    		
    		String files[] = src.list();
    		
    		for (String file : files) {
    		 
    		   File srcFile = new File(src, file);
    		   File destFile = new File(dest, file);
    		   
    		   copyFolder(srcFile,destFile);
    		}
    	   
    	}else{
    		
    		InputStream in = new FileInputStream(src);
    	        OutputStream out = new FileOutputStream(dest); 
    	                     
    	        byte[] buffer = new byte[1024];
    	    
    	        int length;
    	        //copy the file content in bytes 
    	        while ((length = in.read(buffer)) > 0){
    	    	   out.write(buffer, 0, length);
    	        }
 
    	        in.close();
    	        out.close();
    	        System.out.println("File copied from " + src + " to " + dest);
    	}

}
}