package org.example;

import twitter4j.Status;
import java.util.List;

public class TwitterToTelegramApp {
    public static void main(String[] args) {
        // Twitter API keys
        String apiKey = "8i7LnwVtEHf0CwM86i9cphgN2";
        String apiSecretKey = "V52ptJjRiI1OCEjHfsq2KbtoqSCb1qV8s8XRr4isH37uZoWrjo";
        String accessToken = "1843960314288836609-qJ49yyIr5Lv8tRHOM7FWsHWvlO7QsT";
        String accessTokenSecret = "WRlPbWJPWtLt8p9NPlu0iTOYRHV3tZRo7JNJX6zae6Frm";

        // Telegram bot token and chat/chnnel ID
        String botToken = "7469398058:AAF4AG_xPlOTGOXXSHZ7ioLXQOQwM_yHRkY";
        String chatId = "1002318989791";

        TwitterClient twitterClient = new TwitterClient(apiKey, apiSecretKey, accessToken, accessTokenSecret);
        TelegramClient telegramClient = new TelegramClient(botToken, chatId);

        try {
            // Fetch latest tweets from the specific account
            List<Status> tweets = twitterClient.getLatestTweets("TestAccoun72090", 5);

            // Send each tweet to Telegram
            for (Status tweet : tweets) {
                String tweetMessage = "New tweet from " + tweet.getUser().getName() + ": " + tweet.getText();
                telegramClient.sendMessage(tweetMessage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
