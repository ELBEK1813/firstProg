package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.generics.BotOptions;
import org.telegram.telegrambots.meta.generics.LongPollingBot;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


public class Main {
    public static void main(String[] args) {

        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(new MyBot("6577001498:AAErnovJ9zj47azyHaWOELB-EMs2qUVfGHs"));
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }}


//        for (int i = 0; i < 1000; i++) {
//            System.out.println("Uzur orto hapa boma prosto kayfiyatni kotarish uchun");
//        }
//
//    }
//}