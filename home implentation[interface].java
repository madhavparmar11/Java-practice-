// Interface home
interface Home {
    void work();
    void eating();
    void extraWorks();
}

// Class Sons implementing Home
class Sons implements Home {
    // Constructor
    Sons() {
        System.out.println("Ghar me 2 bacche hain");
    }

    @Override
    public void work() {
        System.out.println("Jo kuch nahi karte hain");
    }

    @Override
    public void eating() {
        System.out.println("Bacche sirf khate hain");
    }

    @Override
    public void extraWorks() {
        System.out.println("Kuch aur kaam to unse bhul hi jao");
    }
}

// Class Mom implementing Home
class Mom implements Home {
    // Constructor
    Mom() {
        System.out.println("Mom ghar ki queen hain");
    }

    @Override
    public void work() {
        System.out.println("Mom apne bachon ki pitai karti hain");
    }

    @Override
    public void eating() {
        System.out.println("Mom khana banati hain");
    }

    @Override
    public void extraWorks() {
        System.out.println("Mom kitchen ka kaam karti hain");
    }
}

// Class GrandfatherAndMother implementing Home
class GrandfatherAndMother implements Home {
    // Constructor
    GrandfatherAndMother() {
        System.out.println("Grandfather and Mother ghar ke sabse bade log hain");
    }

    @Override
    public void work() {
        System.out.println("Grandfather and Mother sabka dhyan rakhte hain");
    }

    @Override
    public void eating() {
        System.out.println("Grandfather and Mother khana khate hain");
    }

    @Override
    public void extraWorks() {
        System.out.println("Grandfather and Mother khet ka kaam karte hain");
    }
}

// Main Class
public class Family {
    public static void main(String[] args) {
        Home h1 = new Sons();
        h1.work();
        h1.eating();
        h1.extraWorks();

        Home h2 = new Mom();
        h2.work();
        h2.eating();
        h2.extraWorks();

        Home h3 = new GrandfatherAndMother();
        h3.work();
        h3.eating();
        h3.extraWorks();
    }
}
