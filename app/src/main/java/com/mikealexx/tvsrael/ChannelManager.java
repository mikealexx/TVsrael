package com.mikealexx.tvsrael;

import com.google.gson.Gson;
import java.util.List;
import java.util.Vector;

public class ChannelManager {
    private Vector<Channel> channels;

    public ChannelManager(String json) {
        channels = new Vector<>();
        parseJson(json);
    }

    private void parseJson(String json) {
        Gson gson = new Gson();
        ChannelsResponse channelsResponse = gson.fromJson(json, ChannelsResponse.class);
        if(channelsResponse == null) {
            throw new IllegalArgumentException("Invalid JSON");
        }
        List<Channel> channelList = channelsResponse.getChannels();
        channels.addAll(channelList);
    }

    public String getChannelUrlByName(String identifier) {
        for (Channel channel : channels) {
            if (channel.getName().equalsIgnoreCase(identifier)) {
                return channel.getUrl();
            }
        }
        return null; // or handle not found case appropriately
    }

    public String getChannelOriginByName(String identifier) {
        for (Channel channel : channels) {
            if (channel.getName().equalsIgnoreCase(identifier)) {
                return channel.getOrigin();
            }
        }
        return null; // or handle not found case appropriately
    }

    public String getChannelRefererByName(String identifier) {
        for (Channel channel : channels) {
            if (channel.getName().equalsIgnoreCase(identifier)) {
                return channel.getReferer();
            }
        }
        return null; // or handle not found case appropriately
    }
}