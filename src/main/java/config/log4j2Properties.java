package config;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class log4j2Properties {
    public static Logger logger = LogManager.getLogger(log4j2Properties.class);
    public static void main(String[] args){
        System.out.println(System.getProperty("java.class.path"));
        System.setProperty("log4j.debug", "");
        BasicConfigurator.configure();
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
    }
}
