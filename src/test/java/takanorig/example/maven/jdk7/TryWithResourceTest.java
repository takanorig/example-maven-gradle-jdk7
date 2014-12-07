package takanorig.example.maven.jdk7;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Test;

public class TryWithResourceTest
{
    private TryWithResource example_ = new TryWithResource();

    @Test
    public void test() throws Exception
    {
        URI fileUri = getClass().getResource("/sample.txt").toURI();
        Path filePath = Paths.get(fileUri);
        List<String> lineList = this.example_.readFile(filePath, "UTF-8");

        assertThat(lineList.size(), is(5));
        assertThat(lineList.get(0), is("サンプルファイル"));
    }
}
