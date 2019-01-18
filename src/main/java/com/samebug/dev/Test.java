package com.samebug.dev;

import com.rollbar.notifier.Rollbar;
import com.rollbar.notifier.config.Config;
import com.rollbar.notifier.config.ConfigBuilder;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Throwable {
        Rollbar rollbar;
        Config config = ConfigBuilder.withAccessToken(System.getenv("RB"))
            .environment("agent-test")
            .appPackages(Arrays.asList("com.samebug.dev"))
            .build();

        rollbar = Rollbar.init(config);
        try {
            "".charAt(-1);
        } catch (Throwable e) {
            rollbar.error(e);
        }
        rollbar.close(true);
    }
}
