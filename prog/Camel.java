// Класс Camel наследуется от класса Animal
public class Camel extends Animal {
    public Camel(String name, String skills) {
        super(name, skills);
    }

    @Override
    public void displayCommands() {
        System.out.println("Список команд для верблюда:");
        System.out.println(getSkills());
    }

    @Override
    public void teachNewCommand(String command) {
        String updatedSkills = getSkills() + "," + command;
        setSkills(updatedSkills);
    }
}
