import agent_java_core.VisualKnightCapabilities;
import agent_java_core.VisualKnightOptions;
import agent_java_core.VisualKnightCore;
import org.junit.Test;

import java.net.MalformedURLException;

public class Example {

    @Test
    public void asd() throws MalformedURLException {
        VisualKnightCapabilities visualKnightCapabilities = VisualKnightCapabilities.builder().browserName("Chrome").os("Windows").build();
        VisualKnightOptions visualKnightOptions = VisualKnightOptions.builder()
                .apiEndpoint("http://localhost:3333/graphql")
                .apiKey("asdasd")
                .project("test")
                .visualKnightCapabilities(visualKnightCapabilities)
                .build();

        VisualKnightCore core = new VisualKnightCore(visualKnightOptions);

//        core.invokeTestSession("test", capabilities);

        System.out.println("END");
    }

    @Test
    public void uploadScreenshot() throws MalformedURLException {
        VisualKnightCapabilities visualKnightCapabilities = VisualKnightCapabilities.builder().browserName("Chrome").os("Windows").build();
        VisualKnightOptions visualKnightOptions = VisualKnightOptions.builder()
                .apiEndpoint("http://localhost:3333/graphql")
                .apiKey("asdasd")
                .project("test")
                .visualKnightCapabilities(visualKnightCapabilities)
                .build();

        VisualKnightCore core = new VisualKnightCore(visualKnightOptions);

//        core.uploadScreenshot("ck8spt0hc00001cn12rjlu2vl", "aasd");

        System.out.println("END");
    }
}
