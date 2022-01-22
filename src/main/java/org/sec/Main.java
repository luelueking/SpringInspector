package org.sec;

import org.sec.app.Application;
import org.sec.log.SLF4J;
import org.sec.log.SLF4JProcessor;
import org.slf4j.Logger;

@SLF4J
public class Main {
    @SuppressWarnings("all")
    private static Logger logger;

    public static void main(String[] args) {
        SLF4JProcessor.process();
        Application.run(args);
    }
}
