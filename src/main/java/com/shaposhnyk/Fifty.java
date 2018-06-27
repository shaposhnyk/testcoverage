package com.shaposhnyk;


import java.util.function.Function;

public class Fifty {

    private final String entity;

    Fifty(String entity) {
        this.entity = entity;
    }

    public String getEntity() {
        return entity;
    } // this is not covered

    public String compute(String source) {
        if (source == null || source.length() <= 3) {
            return "";
        } else if (source.substring(0,3).contains("/")) {
            return "aaa";
        } else if (!source.substring(3).contains("/")) {
            return "bbb";
        }

        // this will be badly scored by sonar, because we have 4 returns and not 3
        return source.substring(3, source.lastIndexOf("/"));
    }

    @Override
    public String toString() {
        return String.format("MyClass[%s]", entity); // this is not covered
    }

    /**
     * Convenience converter
     *
     * @return compute as function (or guava function)
     */
    public Function<String, String> asFunction() {
        return this::compute; // it is usefull to have to function converter // this neither
    }

    /**
     * Factory method
     *
     * @return new instance of Fifty class. Nulls are propagated
     */
    public static Fifty of(Object someAnotherSource) {
        return new Fifty(someAnotherSource == null ? null : someAnotherSource.toString());
    }
}
