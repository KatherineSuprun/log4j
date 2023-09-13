package businessLogic;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.log4j.Logger;

public class FileReader implements Reader {
    final static Logger logger = Logger.getLogger(FileReader.class);

    @Override
    public String read() {
        String message = "Hello?";
        try {
            URI url = ClassLoader.getSystemResource("message txt").toURI();
            logger.info("File URL have been gotten");

            byte[] fileBytes = Files.readAllBytes(Paths.get(url));
            logger.debug("Byte array from file have been gotten");

            message = new String(fileBytes);
            logger.fatal("Message from file have been gotten");
        } catch (URISyntaxException | NullPointerException | IOException exception) {
            logger.error(exception);
        }
        return message;
    }
}