package takanorig.example.maven.jdk7;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TryWithResource
{
    public List<String> readFile(Path filePath, String encoding)
    {
        Charset charset = Charset.forName(encoding);
        List<String> lineList = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(filePath, charset))
        {
            String line = null;
            while ((line = reader.readLine()) != null)
            {
                lineList.add(line);
            }
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }

        return lineList;
    }
}
