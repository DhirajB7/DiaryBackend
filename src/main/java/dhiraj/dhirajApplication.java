package dhiraj;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class dhirajApplication extends Application<dhirajConfiguration> {

    public static void main(final String[] args) throws Exception {
        new dhirajApplication().run(args);
    }

    @Override
    public String getName() {
        return "dhiraj";
    }

    @Override
    public void initialize(final Bootstrap<dhirajConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final dhirajConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
