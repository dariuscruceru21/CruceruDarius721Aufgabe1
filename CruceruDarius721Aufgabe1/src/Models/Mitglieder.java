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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMitgliedsName() {
        return MitgliedsName;
    }

    public void setMitgliedsName(String mitgliedsName) {
        MitgliedsName = mitgliedsName;
    }

    public Haus getHaus() {
        return haus;
    }

    public void setHaus(Haus haus) {
        this.haus = haus;
    }

    public String getEreignis() {
        return ereignis;
    }

    public void setEreignis(String ereignis) {
        this.ereignis = ereignis;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
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
