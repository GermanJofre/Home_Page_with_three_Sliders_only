package lippia.web.hooks;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hooks {
    protected void initializeDriver( Map <String, String> extraCapabilities ) {
        try {
            WebDriverManager.initialize( extraCapabilities );
            DriverManager.getDriverInstance().register( new DriverValidatorListener() );
            afterDriverInitialization();
        } catch ( Exception e ) {
            throw new HookException( e );
        }

    }
}
