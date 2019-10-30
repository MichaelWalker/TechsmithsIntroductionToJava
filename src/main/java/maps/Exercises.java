package maps;

import models.Dog;
import models.Owner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercises {

    // Example
    // Fill in the method so that it returns the value for the given key.
    public static String a_example(Map<String, String> dictionary, String word) {
        return null;
    }

    // Fill in the method so that it returns the owner of the given dog.
    public static Dog b_getOwnerOfDog(Map<Dog, Owner> dogsToOwner, Dog dog) {
        return null;
    }

    // Fill in the method so that it checks if the given key is in dictionary
    public static Boolean c_doesDictionaryContainWord(Map<String, String> dictionary, String word) {
        return null;
    }

    // Fill in the method so that it returns either the definition of the word,
    // or if the map doesn't contain the key then it should return "oops - the dictionary is missing that word!"
    public static String d_getDefinitionOrDefaultValue(Map<String, String> dictionary, String word) {
        return null;
    }

    // Fill in the method so that adds a new item to the dictionary, and then returns the dictionary
    public static Map<Dog, Owner> e_addNewEntryToMap(Map<Dog, Owner> dogOwnerMap, Dog newDog, Owner newOwner) {
        return null;
    }

    // Fill in the method so that it returns the set of all the entries in the list.
    public static Set<Map.Entry<Dog, Owner>> f_getTheEntrySet(Map<Dog, Owner> dogOwnerMap) {
        return null;
    }

    // Fill in the method so that it returns the set of all the keys from the list.
    public static Set<Dog> g_getTheKeys(Map<Dog, Owner> dogOwnerMap) {
        return null;
    }

    // Fill in the method so that it returns the all of the dogs that this owner has
    // ie, try to go from a key to a list of values (this is much harder than key -> value! :) )
    public static List<Dog> h_getTheDogsForAnOwner(Map<Dog, Owner> dogOwnerMap, Owner owner) {
        return null;
    }

    // A bit like the last one - see if you can return a new map, which is the map of owners, to dogs that they own
    // ie { "Scott":"Mike", "Brian":"Mike" "Molly":"Adam" } becomes { "Mike":["Scott", "Brian"], "Adam","Molly" }
    public static Map<Owner, List<Dog>> i_getTheMapOfOwnersToDogs(Map<Dog, Owner> dogOwnerMap) {
        return null;
    }

    // Fill in the method so that it returns a map of each word that appears in the input, to how often it appears.
    // ie if the input is ["happy" "sad" "happy"], then return { "happy": 2, "sad": 1 };
    public static Map<String, Integer> j_countOccurrencesOfWords(List<String> inputWords) {
        return new HashMap<>();
    }

    // Fill in the method so that it returns the most common starting letter for the input words.
    // ie if the input is ["hi", "there", "Henry"], then return "h", as 2 of the words start with the letter h.
    public static String k_findTheMostCommonFirstLetter(List<String> inputWords) {
        return null;
    }

    // I have 2 maps. One which contains a map of dog owners, to the name of the park they go walking in.
    // The other map contains a map of dogs to their owners.
    // Fill in the method so that it returns a new map of dogs, to the name of the park they go walking in.
    public static Map<Dog, String> l_dogParkMap(Map<Dog, Owner> dogOwnerMap, Map<Owner, String> ownerPark) {
        return null;
    }
}
