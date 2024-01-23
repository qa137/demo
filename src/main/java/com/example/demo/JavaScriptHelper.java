package com.example.demo;
import jakarta.annotation.PostConstruct;
import org.graalvm.polyglot.Context;
import org.springframework.stereotype.Component;

@Component
public class JavaScriptHelper {

    @PostConstruct
    public void executeJsString() {
        String jsStr = "var a = 1; \n return a;";
        try(Context context = Context.newBuilder().allowAllAccess(true).build()) {
            context.eval("js", jsStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

}
