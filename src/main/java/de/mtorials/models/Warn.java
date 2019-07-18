package de.mtorials.models;

import net.dv8tion.jda.core.entities.Member;
import net.dv8tion.jda.core.entities.User;

public class Warn {

    private String reason;
    private User user;

    public Warn(Member member, String reason) {

        this.reason = reason;
        this.user = user;
    }

    public String getReason() {
        return reason;
    }

    public User getUser() {
        return user;
    }
}
