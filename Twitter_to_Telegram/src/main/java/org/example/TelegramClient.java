package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class TelegramClient {
    private final String botToken;
    private final String chatId;
    private final OkHttpClient httpClient = new OkHttpClient();

    public TelegramClient(String botToken, String chatId) {
        this.botToken = botToken;
        this.chatId = chatId;
    }

    public void sendMessage(String message) {
        String url = "https://api.telegram.org/bot" + botToken + "/sendMessage?chat_id=" + chatId + "&text=" + message;

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            ResponseBody body = response.body();
            if (body != null) {
                System.out.println(body.string());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
