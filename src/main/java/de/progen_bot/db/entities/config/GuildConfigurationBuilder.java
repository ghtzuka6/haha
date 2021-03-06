package de.progen_bot.db.entities.config;

public class GuildConfigurationBuilder {

    private String prefix;
    private String logChannelID;
    private String tempChannelCategoryID;
    private String setAutorole;

    public GuildConfigurationBuilder setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    public GuildConfigurationBuilder setLogChannelID(String logChannelID) {
        this.logChannelID = logChannelID;
        return this;
    }

    public GuildConfigurationBuilder setTempChannelCategoryID(String tempChannelCategoryID) {
        this.tempChannelCategoryID = tempChannelCategoryID;
        return this;
    }

    public GuildConfigurationBuilder setAutorole(String setAutorole){
        this.setAutorole = setAutorole;

        return this;
    }

    public GuildConfiguration build() {
        return new GuildConfiguration(this.prefix, this.logChannelID, this.tempChannelCategoryID, this.setAutorole);
    }
}
