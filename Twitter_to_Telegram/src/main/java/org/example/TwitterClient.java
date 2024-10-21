package org.example;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

public class TwitterClient {
    private Twitter twitter;

    public TwitterClient(String apiKey, String apiSecretKey, String accessToken, String accessTokenSecret) {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(apiKey)
                .setOAuthConsumerSecret(apiSecretKey)
                .setOAuthAccessToken(accessToken)
                .setOAuthAccessTokenSecret(accessTokenSecret);

        TwitterFactory tf = new TwitterFactory(cb.build());
        this.twitter = tf.getInstance();
    }

    public List<Status> getLatestTweets(String accountHandle, int count) throws TwitterException {
        return twitter.getUserTimeline(accountHandle, new Paging(1, count));
    }
}
