## 1.1 From Iterating to Stream Operations

```Java
/**
1. Files class
public final class Files extends Object
The class consists exclusively of static methods that operate on files, directories, or other types of files.

public static String readString(Path path)
                        throws IOException
public static String readString(Path path, Charset cs)
                        throws IOException
2. Paths class
public final class Paths extends Object

API Note:
It is recommended to obtain a Path via the Path.of methods instead of via the get methods defined in this class as this class may be deprecated in a future release.
 */

var contents = Files.readString(Paths.get("alice.txt"));
List<String> words = List.of(contents.split("\\PL+"));

int count = 0;
for (String w : words) {
    if (w.length() > 12)
        count++;
}
```
