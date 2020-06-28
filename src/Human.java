public class Human {
    private int age;
    private String name;
    private static HumanBuilder humanBuilder;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public synchronized static HumanBuilder builder() {
        if (humanBuilder == null) {
            humanBuilder = new HumanBuilder();
        }
        return humanBuilder;
    }

    static class HumanBuilder {
        private int age;
        private String name;

        public HumanBuilder name(String name) {
            this.name = name;
            return this;
        }

        public HumanBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Human build() {
            Human human = new Human();
            human.age = this.age;
            human.name = this.name;
            return human;
        }
    }

    public HumanBuilder toBuilder() {
        return builder().age(this.getAge()).name(this.getName());
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
