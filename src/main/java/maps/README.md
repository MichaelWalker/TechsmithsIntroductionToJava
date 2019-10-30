# Maps

A `Map` contains a list of keys and values. You can imagine it a little like a 
dictionary. There are a list of 'keys' (like words in a dictionary) and each key has 
a corresponding 'value' (like a definition in a dictionary).

Just like in a dictionary, (where you can look up a word to find it's definition), in
a map you can also up a key to find it's value.

Maps do have some differences to dictionaries though;

- A dictionary only maps from words -> definitions, but a Java map can map from any
type of object to any other type.
- In a dictionary the same 'word' can have multiple definitions. This isn't allowed 
in a Java Map though - the same 'key' can only appear once - it must be 'unique'.

## Examples

### Creating some maps
```java
// A 'HashMap' is just a particular type of Map in Java. Its nice
// and simple to create them, so that's what we will be using here!

// Create a new of strings -> string (just like a dictionary)
Map<String, String> dictionary = new HashMap<>();

// But I can make a map of whatever I want. This is a map of Dogs -> Owners
Map<Dog, Owner> dogsAndTheirOwners = new HashMap<>();

// Here's another one - this time a list of String -> Item
Map<String, Dog> namesToDogs = new HashMap<>();
```

### Looking up a key
We can use the `get` method to retrieve a value corresponding to a key.
```java
// namesToDogs is a map of String -> Dog, so the keys need to be of type 'String' 
// and the value we get back will be of type 'Dog'.
Dog molly = namesToDogs.get("Molly");

// for our dictionary example, both the key and the value have type 'String',
// so to look up the meaning of the word 'spoonerism', we'd have;
String definition = dictionary.get("spoonerism")
```

### Adding things to a map.
We can an entry to the map using the `push` method.
```java
to add a new entry to the list, we need to provide both it's key and its value.
namesToDogs.put("spoonerism", "a transposition of usually initial sounds of two or more words (as in tons of soil for sons of toil)");
```

### Checking if the map contains a key.
We often want to check if our key exists in our map. We can do this using the `contains` method.
```java
// 'spoonerism' is an unusual word - let's check if its in our dictionary!
boolean hasSpoonerism = dictionary.contains('spoonerism');
```

### Other things!
```java
// Get a Set containing each of the 'entries' in the map.
Set<Map.Entry<String, String>> dictionaryEntries = dictionary.entrySet();
```

```java
// Get a Set containing all of the 'keys' in the map.
Set<String> words = dictionaryEntries.keys;
```

```java
// If we aren't sure if the map contains a key, we can use 'getOrDefault'.
// If the key exists, then it returns the corresponding value, otherwise it returns 
// the given default value.

String definition = dictionary.getOrDefault("aardvark", "Sorry - I don't know that word.");
// returns the definition of aardvark if 'aardvark' is in dictionary, else "Sorry - I don't know that word." 
```


