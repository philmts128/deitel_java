/**
* Exemplo do uso avançado de enums no java
* Autor: Phil Mat
*/


public enum ElderScrolls
{
    ARE("Arena", "1994"),
    DAG("Daggerfall", "1996"),
    MRW("Morrowin", "2002"),
    OBL("Oblivion", "2006"),
    SKY("Skyrim", "2011");

    private String title;
    private String year;

    ElderScrolls(String title, String year)
    {
        this.title = title;
        this.year = year;
    }

    public String getTitle() { return this.title; }
    public String getYear() { return this.year; }
}
