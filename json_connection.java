package json;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;

public class json_connection {
    
    public static void main(String[] args) {
    	
    	
    	
       /* JSONParser parser = new JSONParser();

        try {         
            URL oracle = new URL("https://newsapi.org/v2/top-headlines?apiKey=cd1db87dec794c2288c915ba6abeee94&country=in"); // URL to Parse
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            
            String inputLine;
            while ((inputLine = in.readLine()) != null) {               
                JSONArray a = (JSONArray) parser.parse(inputLine);
                
                // Loop through each item
                for (Object o : a) {
                    JSONObject data = (JSONObject) o;

                    

                    String title = (String) data.get("title");
                    /*System.out.println("Title : " + title);

                    System.out.println("\n");*/
                    
                    
                    
                    
               /* }
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }   
    }*/   
}
}