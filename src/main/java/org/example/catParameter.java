package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Comparator;

public class catParameter{
    String type;
    boolean deleted;
    String id;
    String user;
    String text;
    int upvotes;
    String source;
    String updatedAt;
    String createdAt;


    public catParameter(
            @JsonProperty("type") String type,
            @JsonProperty("deleted") boolean deleted,
            @JsonProperty("_id") String id,
            @JsonProperty("user") String user,
            @JsonProperty("text") String text,
            @JsonProperty("__v") int upvotes,
            @JsonProperty("source") String source,
            @JsonProperty("updatedAt") String updatedAt,
            @JsonProperty("createdAt") String createdAt
    ) {
        this.type = type;
        this.deleted = deleted;
        this.id = id;
        this.user = user;
        this.text = text;
        this.upvotes = upvotes;
        this.source = source;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    public int getUpVotes() {
        return upvotes;
    }
    @Override
    public String toString() {
        return type + " " + deleted + " " + id + " " + user + " " + text + " " + upvotes +
                " " + source + " " + updatedAt + " " + createdAt;
    }

    public static final Comparator<catParameter> COMPARE_BY_UPVOTES = new Comparator<catParameter>() {
        @Override
        public int compare(catParameter lhs, catParameter rhs) {
            return lhs.getUpVotes() - rhs.getUpVotes();
        }
    };
}
