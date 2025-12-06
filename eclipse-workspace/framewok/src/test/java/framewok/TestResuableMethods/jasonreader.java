package framewok.TestResuableMethods;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import com.fasterxml.jackson.core.type.*;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class jasonreader {
	
	public static List<HashMap<String, String>> hashmapcreater() throws IOException {
		// convert jason to String
		
	  String jasoncontent=FileUtils.readFileToString(new File(System.getProperty("user.dir")+"//src//test//java//framework//testdata//purchaseorder.json"),StandardCharsets.UTF_8);
	
	  //String to hashmap
	  
	  ObjectMapper mapper= new ObjectMapper();
	  List<HashMap<String,String>>data =mapper.readValue(jasoncontent, new TypeReference<List<HashMap<String,String>>>(){});
	   return data;
	}  

}
