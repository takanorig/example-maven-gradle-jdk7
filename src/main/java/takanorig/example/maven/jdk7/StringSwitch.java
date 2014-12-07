package takanorig.example.maven.jdk7;

public class StringSwitch
{
    public String match(String key)
    {
        String value;

        switch (key)
        {
        case "bob":
            value = "Bob";
            break;
        case "smith":
            value = "Smith";
            break;
        case "john":
            value = "john";
            break;

        default:
            value = "N/A";
            break;
        }

        return value;
    }
}
