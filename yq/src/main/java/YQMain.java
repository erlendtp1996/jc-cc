package main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.io.InputStream;

import org.yaml.snakeyaml.Yaml;

public class YQMain {

    // java main/java/YQMain main/resources/test.yaml 

    /**
     * Commands needed to support
     * 
     * '.[quotes]' quotes.yaml
     * '.["quotes"]' quotes.yaml
     * '.quotes?' quotes.yaml
     * '.["quotes"]?' quotes.yaml
     * 
     * 
     * 
     */

    public static void main(String[] args) throws IOException {

        // read file from filename string;
        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);

        String file = "";
        String line;
        while ((line = br.readLine()) != null) {
            file += line + "\n";
        }

        Yaml yaml = new Yaml();
        Map<String, Object> obj = (Map) yaml.load(file);
        System.out.println(obj);  

    }

}