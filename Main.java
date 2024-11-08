class Komputer {
    String processor = "Intel i7";
    int memory = 16; 

    public String getSpecs() {
        return "Processor: " + processor + ", Memory: " + memory + "GB";
    }
}

class LabKomputer extends Komputer {
    int jumlahKomputer = 20;

    public String getInfoLab() {
        return super.getSpecs() + ", Jumlah Komputer: " + jumlahKomputer;
    }
}

public class Main {
    public static void main(String[] args) {
        LabKomputer lab = new LabKomputer();
        
        System.out.println(lab.getInfoLab());
    }
}
