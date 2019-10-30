package maps;

import models.Dog;
import models.Owner;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class TestExercises {
    private static final Dog CLIFF = new Dog("Cliff");
    private static final Dog GIA = new Dog("Gia");
    private static final Dog MOLLY = new Dog("Molly");
    private static final Dog MAISIE = new Dog("Maisie");
    private static final Dog POPPY = new Dog("POPPY");

    private static final Owner BEN = new Owner("Ben");
    private static final Owner ADAM = new Owner("Adam");
    private static final Owner ALEX = new Owner("Alex");
    private static final Owner MIKE = new Owner("Mike");

    private static final Map<String, String> DICTIONARY = Map.of(
            "aardvark", "A nocturnal badger-sized burrowing mammal.",
            "agile", "Able to move quickly and easily",
            "java", "a general-purpose computer programming language."
    );
    private static final Map<Dog, Owner> DOG_OWNER_MAP = Map.of(
            CLIFF, BEN,
            GIA, ALEX,
            MOLLY, ADAM,
            MAISIE, MIKE,
            POPPY, MIKE
    );

    @Test
    public void check_a_example() {
        String aardvarkDefinition = Exercises.a_example(DICTIONARY, "aardvark");
        String agileDefinition = Exercises.a_example(DICTIONARY, "agile");

        assertThat(aardvarkDefinition).isEqualTo("A nocturnal badger-sized burrowing mammal.");
        assertThat(agileDefinition).isEqualTo("Able to move quickly and easily");
    }

    @Test
    public void check_b_getOwnerOfDog() {
        Owner ownerOfMolly = Exercises.b_getOwnerOfDog(DOG_OWNER_MAP, MOLLY);
        Owner ownerOfCliff = Exercises.b_getOwnerOfDog(DOG_OWNER_MAP, CLIFF);

        assertThat(ownerOfMolly).isEqualTo(ADAM);
        assertThat(ownerOfCliff).isEqualTo(BEN);
    }

    @Test
    public void check_c_doesDictionaryContainWord() {
        Boolean dictionaryContainsAardvark = Exercises.c_doesDictionaryContainWord(DICTIONARY, "aardvark");
        Boolean dictionaryContainsDog = Exercises.c_doesDictionaryContainWord(DICTIONARY, "dog");

        assertThat(dictionaryContainsAardvark).isTrue();
        assertThat(dictionaryContainsDog).isFalse();
    }

    @Test
    public void check_d_getDefinitionOrDefaultValue() {
        String definitionOfAardvark = Exercises.d_getDefinitionOrDefaultValue(DICTIONARY, "aardvark");
        String definitionOfDog = Exercises.d_getDefinitionOrDefaultValue(DICTIONARY, "dog");

        assertThat(definitionOfAardvark).isEqualTo("A nocturnal badger-sized burrowing mammal.");
        assertThat(definitionOfDog).isEqualTo("oops - the dictionary is missing that word!");
    }

    @Test
    public void check_e_addNewEntryToMap() {
        Map<Dog, Owner> emptyMap = new HashMap<>();

        Map<Dog, Owner> filledMap = Exercises.e_addNewEntryToMap(emptyMap, MOLLY, ADAM);

        assertThat(filledMap.get(MOLLY)).isEqualTo(ADAM);
    }

    @Test
    public void check_f_getTheEntrySet() {
        // TODO - should probably actually make this instead of just cheating!
        Set<Map.Entry<Dog, Owner>> expected = DOG_OWNER_MAP.entrySet();

        Set<Map.Entry<Dog, Owner>> entrySet = Exercises.f_getTheEntrySet(DOG_OWNER_MAP);

        assertThat(entrySet).containsExactlyElementsOf(expected);
    }

    @Test
    public void check_g_getTheKeys() {
        // TODO - should probably actually make this instead of just cheating!
        Set<Dog> expected = DOG_OWNER_MAP.keySet();

        Set<Dog> entrySet = Exercises.g_getTheKeys(DOG_OWNER_MAP);

        assertThat(entrySet).containsExactlyElementsOf(expected);
    }

//    @Test
//    public void check_h_getTheDogsForAnOwner() {
//        Map<Owner, List<Dog>> ownersAndTheirDogs = Exercises.h_getTheDogsForAnOwner(DOG_OWNER_MAP, );
//    }
}
