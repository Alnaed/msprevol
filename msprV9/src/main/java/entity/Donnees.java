package entity;

import com.opencsv.bean.CsvBindByPosition;

public class Donnees (String id, String name,String value,String batch) {

    @CsvBindByPosition(position = 0)
    private String id;

    @CsvBindByPosition(position = 1)
    private String name;

    @CsvBindByPosition(position = 2)
    private String value;

    private String batch;

    //  getters, setters, toString
}

/*
public class Donnees {
    private String id;
    private String name;
    private String value;
    private String jeu;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getJeu() {
        return jeu;
    }

    public void setJeu(String jeu) {
        this.jeu = jeu;
    }

    public Donnees(String id, String name, String value, String jeu) {
        super();
        this.id = id;
        this.name = name;
        this.value = value;
        this.jeu = jeu;
    }
}
*/
