package FreeMarkerTester;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

public class FreeMarkerTemplate {
	
	
	
      public static void main(String[] args) {
    	  
    	 Configuration cfg = new Configuration();
    	  
         try {
        	 //Instantiate template
        	  Template template = cfg.getTemplate("src/FreeMarkerTester/FirstPage.ftl");
            //Instantiate Configuration class  
           
            cfg.setDirectoryForTemplateLoading(new File("/Users/davidzhang/Documents/workspace"
            		+ "/WebAssignment1.4"));
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            
//          Create Data Model
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("WebTitle", "My Webpages");
            map.put("message", "This is an introduction on my web pages. "
            		+ "Basically, there are five separate web pages with HTML5 and I am going "
            		+ "to apply javascript and css for each of them. This is my first web page "
            		+ "design and hope you will like it.");
            
//            List<ValueExampleObject> systems = new ArrayList<ValueExampleObject>();
//            systems.add(new ValueExampleObject("Android", "Google"));
//            systems.add(new ValueExampleObject("iOS States", "Apple"));
//            systems.add(new ValueExampleObject("Ubuntu", "Canonical"));
//            systems.add(new ValueExampleObject("Windows7", "Microsoft"));
//            input.put("systems", systems);
            
            List<URL> references = new ArrayList<URL>();
            references.add(new URL("./FirstPage.html", "Introduction"));
            references.add(new URL("./SecondPage.html", "LogIn"));
            references.add(new URL("./ThirdPage.html", "SingUp"));
            references.add(new URL("./FourthPage.html", "Search"));
            references.add(new URL("./FifthPage.html", "Survey"));
            map.put("references", references);
           
          
            //Console output
            Writer console = new OutputStreamWriter(System.out);
            template.process(map, console);
            console.flush();
            // File output
            Writer file = new FileWriter (new File("/Users/davidzhang/Desktop/Web2560/FirstPage.html"));
            template.process(map, file);
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
      }
} 
