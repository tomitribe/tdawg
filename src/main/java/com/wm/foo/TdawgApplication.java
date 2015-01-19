package com.wm.foo;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class TdawgApplication extends Application {
    // no implementation here to let the container scans for resources
}
