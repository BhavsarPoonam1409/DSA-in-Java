package Interfaces;

interface FroentendDeveloper{
    void HTML_CSS_JS();
}

interface BackendDeveloper{
    void Django_SpringBoot();
}

class FullStackDeveloper implements FroentendDeveloper,BackendDeveloper{
    public void HTML_CSS_JS(){
        System.out.println("froentend developer using this technology --- HTML CSS JS");
    }

    public void Django_SpringBoot(){
        System.out.println("Backend developer using this technology --- Django SpringBoot");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        FullStackDeveloper f = new FullStackDeveloper();
        f.HTML_CSS_JS();
        f.Django_SpringBoot();
    }
}
