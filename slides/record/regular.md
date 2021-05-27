## Regular Java counterpart

```java
public record Person(String username, Integer age) { }
```

```java
public class RegularPerson {

    private final String username;

    private final Integer age;

    public RegularPerson(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof RegularPerson)) {
            return false;
        } else {
            RegularPerson other = (RegularPerson) obj;
            return Objects.equals(username, other.username)
                   && Objects.equals(age, other.age);
        }
    }

    @Override
    public String toString() {
        return "RegularPerson[username=" + username + ", age=" + age + "]";
    }
}
```
