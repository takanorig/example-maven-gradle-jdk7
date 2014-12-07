package takanorig.example.maven.jdk7;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class StringSwitchTest
{
    private StringSwitch example_ = new StringSwitch();

    @Test
    public void match()
    {
        {
            String value = this.example_.match("bob");
            assertThat(value, is("Bob"));
        }
        {
            String value = this.example_.match("dummy");
            assertThat(value, is("N/A"));
        }
    }

}
