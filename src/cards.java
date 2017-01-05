public class cards {
    private int id;
    private String element_name;
    private String imgName;
    private String card_type;
    private String tittle;
    private String hardness;
    private String gravity;
    private String cleavage;
    private String crustal_abundance;
    private String ecovalue;



    public cards(int id, String element_name, String imgName, String card_type, String tittle,  String hardness, String gravity, String cleavage, String crustal_abundance, String ecovalue) {
        this.id = id;
        this.element_name = element_name;
        this.imgName = imgName;
        this.card_type = card_type;
        this.tittle = tittle;
        this.hardness = hardness;
        this.gravity = gravity;
        this.cleavage = cleavage;
        this.crustal_abundance = crustal_abundance;
        this.ecovalue = ecovalue;

    }

    public int getID() {
        return id;
    }

    public String getFileName() {
        return element_name;
    }

    public String getImageName() {
        return imgName;
    }

    public String getCard_type() {
        return card_type;
    }

    public String gettittle() {
        return tittle;
    }

    public String getHardness() {
        return hardness;
    }

    public String getSpecifc_gravity() {
        return gravity;
    }

    public String getCleavage() {
        return cleavage;
    }

    public String getCrustal_abundance() {
        return crustal_abundance;
    }

    public String getEconomic_value() {
        return ecovalue;
    }

    public String toString() {
        return getCard_type() + " = " + gettittle();
    }
}