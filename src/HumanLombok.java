import lombok.Builder;

@Builder(toBuilder = true)
public class HumanLombok {
    private String name;
    private int age;

    @Override
    public String toString(){
        return this.name + " " + this.age;
    }
}
