public class Main {
    public static void main(String[] args){
        Human alex = Human.builder().age(2).name("Alex").build();
        System.out.println(alex);
        Human.HumanBuilder humanBuilder = alex.toBuilder();
        Human kirill = humanBuilder.name("Kirill").build();
        System.out.println(kirill);
        System.out.println(alex == kirill);
        Human.HumanBuilder humanBuilder1 = kirill.toBuilder();
        System.out.println(humanBuilder == humanBuilder1);

        HumanLombok alex2 = HumanLombok.builder().age(2).name("Alex2").build();
        System.out.println(alex2);


        Developer developer = new Developer(4,"", "");
        System.out.println(developer);
        Developer developer1 = developer.toBuilder().age(5).language("C++").salary("3000").build();
        System.out.println(developer1);

    }
}
