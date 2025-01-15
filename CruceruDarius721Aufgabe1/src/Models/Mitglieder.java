package Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Mitglieder {
    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("Mitgliedsname")
    private String MitgliedsName;
    @JsonProperty("Haus")
    private Haus haus;
    @JsonProperty("Ereignis")
    private String ereignis;
    @JsonProperty("Datum")
    private String datum;

    public Mitglieder(Integer id, String mitgliedsName, Haus haus, String ereignis, String datum) {
        this.id = id;
        MitgliedsName = mitgliedsName;
        this.haus = haus;
        this.ereignis = ereignis;
        this.datum = datum;
    }

    public Mitglieder() {}



    public String getMitgliedsName() {
        return MitgliedsName;
    }



    public Haus getHaus() {
        return haus;
    }



    public String getEreignis() {
        return ereignis;
    }



    public String getDatum() {
        return datum;
    }



    @Override
    public String toString() {
        return "Mitglieder{" +
                "id=" + id +
                ", MitgliedsName='" + MitgliedsName + '\'' +
                ", haus=" + haus +
                ", ereignis='" + ereignis + '\'' +
                ", datum='" + datum + '\'' +
                '}';
    }
}
