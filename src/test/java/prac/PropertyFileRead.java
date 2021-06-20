package prac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileRead {


public static Properties get_properties() throws IOException {


    Properties prop = new Properties();


    FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\Resources\\OR.properties");
    prop.load(fis);
    return prop;

}
}
