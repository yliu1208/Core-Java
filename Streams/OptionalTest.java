import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) throws IOException {
        var contents = Files.readString(
            Path.of("alice.txt")
            ); 
        List<String> wordList = List.of(contents.split("\\PL+")); 
        
        Optional<String> optionalValue = wordList.stream()
            .filter(s -> s.contains("fred"))
            .findFirst(); 

        System.out.println(optionalValue.orElse("No word") + " contains fred"); 
        
        Optional<String> optionalString = Optional.empty(); 
        String result = optionalString.orElse("N/A"); 
        System.out.println("Result: " + result); 
        result = optionalString.orElseGet(() -> Locale.getDefault().getDisplayName()); 
        System.out.println("Result: " + result); 
        try {
            result = optionalString.orElseThrow(IllegalStateException::new); 
            System.out.println("Result: " + result); 
        } catch (Throwable t) {
            t.printStackTrace();
        }

        optionalValue = wordList.stream()
            .filter(s -> s.contains("red"))
            .findFirst(); 
        optionalValue.ifPresent(s -> System.out.println(s + " contains red")); 
    }
}
