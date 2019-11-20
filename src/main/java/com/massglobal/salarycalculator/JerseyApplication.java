package com.massglobal.salarycalculator;

import com.massglobal.salarycalculator.api.ApiFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class JerseyApplication extends ResourceConfig {

    public JerseyApplication() {
        register(ApiFeature.class);
    }
}
