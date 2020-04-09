import agent_java_core.VisualKnightCapabilities;
import agent_java_core.VisualKnightOptions;
import agent_java_core.VisualKnightCore;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Base64;

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
    public void uploadScreenshot() throws IOException {
        VisualKnightCapabilities visualKnightCapabilities = VisualKnightCapabilities.builder().browserName("Chrome").os("Windows").build();
        VisualKnightOptions visualKnightOptions = VisualKnightOptions.builder()
                .apiEndpoint("http://localhost:3333/graphql")
                .apiKey("asdasd")
                .project("test")
                .visualKnightCapabilities(visualKnightCapabilities)
                .build();

        VisualKnightCore core = new VisualKnightCore(visualKnightOptions);

        byte[] fileContent = FileUtils.readFileToByteArray(new File(getClass().getResource("large.png").getFile()));
//        core.uploadScreenshot("ck8t908ie000111pjg8z2x58o", Base64.getEncoder().encodeToString(fileContent));

        System.out.println("END");
    }
}
