package Interfaces;

interface SoftwareDeveloper {

    void developSoftware();
}

interface AIEngineer {

    void buildAIModel();
}

class AISoftwareEngineer implements SoftwareDeveloper, AIEngineer {

    public void developSoftware() {
        System.out.println("AI Software Engineer is developing software");
    }

    public void buildAIModel() {
        System.out.println("AI Software Engineer is building an AI model");
    }
}

public class Multiple_Inheritance_RealLifeexample {

    public static void main(String[] args) {

        AISoftwareEngineer a = new AISoftwareEngineer();

        a.developSoftware();
        a.buildAIModel();
    }
}