package com.springhow.examples.springbootfailureanalyzers;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

public class MyCustomApplicationFailureAnalyzer extends AbstractFailureAnalyzer<MyCustomApplicationException> {
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, MyCustomApplicationException cause) {
        return new FailureAnalysis("Yeah, He likes to break Things...!",
                        "Ummm... Don't use 'MyCustomApplicationException'.. Duh..!?\uD83E\uDD26",
                        cause);
    }
}
