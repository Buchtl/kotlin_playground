# kotlin_playground
Just for exploration

(-_-)zzz


## Something completely different, and its not Python!
### Java Optional
```java
import java.util.Optional;

class Scratch {
  public static void main(String[] args) {
    String nullString = null;
    Optional.ofNullable(nullString).ifPresent(o -> System.out.println(o));
  
    String orElse = Optional.ofNullable(nullString).orElse("nullString is null");
    System.out.println("OrElse: " + orElse);

    Optional<String> oString = Optional.empty();
    oString.ifPresentOrElse(s -> System.out.println(s), () -> System.out.println("oString is empty"));
  }
}
```
