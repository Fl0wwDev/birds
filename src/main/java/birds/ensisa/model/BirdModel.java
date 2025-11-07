package birds.ensisa.model;

/**
 * Placeholder POJO for the package `ensisa.birds.model`.
 * This file exists to create the package and provide a minimal class to use.
 */
public class BirdModel {
    private String commonName;
    private String scientificName;

    public BirdModel() {
    }

    public BirdModel(String commonName, String scientificName) {
        this.commonName = commonName;
        this.scientificName = scientificName;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    @Override
    public String toString() {
        return "BirdModel{" +
                "commonName='" + commonName + '\'' +
                ", scientificName='" + scientificName + '\'' +
                '}';
    }
}
