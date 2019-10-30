package maps;

import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class TestExercises {

    @Test
    public void check_example_createDictionary() {
        Map<String, String> dictionary = Exercises.example_createDictionary();

        assertThat(dictionary).containsOnlyKeys("aardvark");
    }
}
