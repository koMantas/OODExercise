package lt.vu.mif.ood;

public class LithuanianLanguage  extends BaseLanguage {


    public String formatGreetingMessage(String name) {
        name = changeNameEndingsForGreeting(name);
        return "Sveiki, " + name + "!";
    }

    private String changeNameEndingsForGreeting(String name) {
        if (name.endsWith("as")) {
            name = name.replaceAll("as$", "ai");
        } else if (name.endsWith("us")) {
            name = name.replaceAll("us$", "au");
        } else if (name.endsWith("�")) {
            name = name.replaceAll("�$", "e");
        }
        return name;
    }

    @Override
    protected String getNameRequestMessage() {
        return "Pra�ome �vesti savo vard�: ";
    }
}