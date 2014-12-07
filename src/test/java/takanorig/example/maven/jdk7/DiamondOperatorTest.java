package takanorig.example.maven.jdk7;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;

public class DiamondOperatorTest
{
    private DiamondOperator example_ = new DiamondOperator();

    @Test
    public void createList()
    {
        List<String> list = this.example_.createList();

        assertThat(list.toString(), is("[test1, test2, test3]"));
    }

    @Test
    public void createMap()
    {
        Map<String, String> map = this.example_.createMap();

        assertThat(map.toString(), is("{key1=value1, key2=value2, key3=value3}"));
    }

}
