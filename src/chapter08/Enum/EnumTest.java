/**
* Exemplo do uso avançado de enums no java
* Autor: Phil Mat
*/

import java.util.EnumSet;

public class EnumTest
{
    public static void main(String[] args)
    {
        int i = 1;
        for (ElderScrolls tes : ElderScrolls.values())
        {
            String title = tes.getTitle();
            String year = tes.getYear();
            System.out.printf("The Elder Scrolls %d: %s - %s\n", i++, title, year);
        }
    }
}
