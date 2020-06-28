import lombok.*;

@Value
@Builder(toBuilder = true)
public class Developer {
    int age;
    @NonNull String language;

    String salary;

    String getSalary(){
        return "user logic";
    }
}
