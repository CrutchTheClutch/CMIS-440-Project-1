/**
 * Copyright (c) 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package javaeetutorial.hello1;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Hello {

    private String name;
    private String color;

    public Hello() {
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String user_name) {
        if (user_name.equalsIgnoreCase("Pikachu")) {
            this.name = "That's my name too!";
        } else {
            this.name = "Hello, " + user_name;
        }
    }

    public void setColor(String fav_color) {
        if (fav_color.equalsIgnoreCase("Yellow")) {
            this.color = "That's my favorite color too!";
        } else {
            this.color = fav_color + " is a cool color";
        }
    }
}

