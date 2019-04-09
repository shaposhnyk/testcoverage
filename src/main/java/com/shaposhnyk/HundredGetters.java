package com.shaposhnyk;

import java.time.LocalDateTime;

/**
 * It is good to have an immutable class and a builder
 * Just it is useless to test it's getters and setters if there is no logic in it
 */
public class HundredGetters {

    private final Long id;

    private final String entity;

    private final LocalDateTime created;

    HundredGetters(Long id, String entity, LocalDateTime created) {
        this.id = id;
        this.entity = entity;
        this.created = created;
    }

    public static HundredGetters of(Long id, String entity) {
        return new HundredGetters(id, entity, LocalDateTime.now());
    }
    public static HundredGettersBuilder builder() {
        return new HundredGettersBuilder();
    }

    public Long getId() {
        return id;
    }

    public String getEntity() {
        return entity;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public static class HundredGettersBuilder {
        private Long id;

        private String entity;

        private LocalDateTime created  = LocalDateTime.now();

        HundredGettersBuilder() {

        }

        public HundredGettersBuilder withCreated(LocalDateTime created) {
            this.created = created;
            return this;
        }

        public HundredGettersBuilder withEntity(String entity) {
            this.entity = entity;
            return this;
        }

        public HundredGettersBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public HundredGetters build() {
            return new HundredGetters(id, entity, created);
        }
    }
}
