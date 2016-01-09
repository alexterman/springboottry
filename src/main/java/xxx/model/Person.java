package xxx.model;

/**
 * Created by alex on 1/8/16.
 */
public class Person {

    public long id;
    public String fName;
    public String lName;

    public Person(long id, String f, String l){
        this.id = id;
        this.fName = f;
        this.lName = l;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", fName='").append(fName).append('\'');
        sb.append(", lName='").append(lName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
