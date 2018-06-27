package com.shaposhnyk;


import java.util.function.Function;

/**
 * Here we have 50% class coverage and 43% method coverage.
 * However it covers all edge cases
 */
public class Fifty {

    private final String entity;

    Fifty(String entity) {
        this.entity = entity;
    }

    public String getEntity() {
        return entity; // this is not covered
    }

    public String compute(String source) {
        if (source == null || source.length() <= 3) {
            return "";
        } else if (source.substring(0, 3).contains("/")) {
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
        return this::compute; // it is useful to have to function converter // this neither
    }

    /**
     * Factory method
     *
     * @return new instance of Fifty class. Nulls are propagated
     */
    public static Fifty of(Object someAnotherSource) {
        if (someAnotherSource == null) {
            throw new MyException("entity cannot be null");
        }
        return new Fifty(someAnotherSource == null ? null : someAnotherSource.toString());
    }

    // quite useless but quite often some wrappers are required, to pass something to another library
    private static class MyException extends IllegalArgumentException {
        public MyException(String message) {
            super(message);
        }
    }
}
