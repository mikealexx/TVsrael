package com.mikealexx.tvsrael;

public class Channel {
    private String name;
    private String alias;
    private String url;
    private String origin;
    private String referer;

    public Channel(String name, String alias, String url, String origin, String referer) {
        this.name = name;
        this.alias = alias;
        this.url = url;
        this.origin = origin;
        this.referer = referer;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public String getUrl() {
        return url;
    }

    public String getOrigin() {
        return origin;
    }

    public String getReferer() {
        return referer;
    }
}
