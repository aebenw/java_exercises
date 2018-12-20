package AbstractClassP2;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}

//very similar to inheretence
//a mix between inhertence and abstract
//methods that are not abstract do not need to be implemented
//everything that is abstract needs to be implemeneted like inheretence
