package jenkins.demo.modul.hello;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Hello Word for Jenkins demo
 *
 * @author GergelyBalogh
 * @since 0.1.0
 */
public class Hello {

    @Test
    @DisplayName("Hello, i'm Jenkins demo smoke test")
    public void helloJenkinsSmoke() {
        System.out.println("Hello, i'm Jenkins demo smoke test");
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("Hello, i'm Jenkins demo another test")
    public void helloJenkinsAnother() {
        System.out.println("Hello i'm Jenkins demo another test");
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("Hello, i'm Jenkins demo failure test")
    public void helloJenkinsFailed() {
        System.out.println("Hello i'm Jenkins demo failed test");
        Assertions.assertTrue(false);
    }

}
