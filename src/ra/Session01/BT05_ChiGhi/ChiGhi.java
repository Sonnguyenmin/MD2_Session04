package ra.Session01.BT05_ChiGhi;

public class ChiGhi {
    private String name ="Join";
    private String classs = "C02";

    public ChiGhi() {
    }

    public ChiGhi(String name, String classs) {
        this.name = name;
        this.classs = classs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }


    @Override
    public String toString() {
        return "ChiGhi{" +
                "name='" + this.name + '\'' +
                ", classs='" + this.classs + '\'' +
                '}';
    }
}


