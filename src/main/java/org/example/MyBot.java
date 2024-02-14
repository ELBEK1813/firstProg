package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.groupadministration.GetChatMember;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.chatmember.ChatMember;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyBot extends TelegramLongPollingBot {
    public MyBot(String botToken) {
        super(botToken);
    }

    @Override
    public void onUpdateReceived(Update update) {
        Long chatId = update.getMessage().getChatId();
        String text = update.getMessage().getText();
        if (update.hasMessage() && update.getMessage().hasText()) {


            if (text.equals("/start")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardButton uz = new KeyboardButton();
                uz.setText("Telefon raqam yuborish");
                uz.setRequestContact(true);

                row2.add(uz);
                rowList.add(row2);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Assalomu alaykum "+update.getMessage().getFrom().getFirstName()+" \n"+
                        "Ro'yhatdan utish uchun telefon raqamingizni  kriting");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }
            else if (update.getMessage().getText().equals("\uD83C\uDDFA\uD83C\uDDFFUzbek tili")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();

                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardRow row4 = new KeyboardRow();
                KeyboardRow row5 = new KeyboardRow();
                KeyboardRow row6 = new KeyboardRow();
                KeyboardRow row7 = new KeyboardRow();
                KeyboardRow row8 = new KeyboardRow();
                KeyboardRow row9 = new KeyboardRow();
                KeyboardRow row10 = new KeyboardRow();
                KeyboardButton button1 = new KeyboardButton();
                button1.setText(" \uD83C\uDFDE Dizayn darslari ");
                KeyboardButton button2 = new KeyboardButton();
                button2.setText(" \uD83D\uDC68\uD83C\uDFFB\u200D\uD83D\uDCBBDasturlash darslari ");
                KeyboardButton button3 = new KeyboardButton();
                button3.setText("\uD83D\uDCF1 SMM");
                KeyboardButton button4 = new KeyboardButton();
                button4.setText(" \uD83C\uDFC4\u200D♂\uFE0F Frilanserlik darslari");
                KeyboardButton button5 = new KeyboardButton();
                button5.setText("\uD83E\uDDEE Buxgalteriya kurslari");
                KeyboardButton button6 = new KeyboardButton();
                button6.setText(" \uD83D\uDCDD Kopirayting");
                KeyboardButton button7 = new KeyboardButton();
                button7.setText(" \uD83C\uDDFA\uD83C\uDDF8 Ingliz tili darslari");
                KeyboardButton button8 = new KeyboardButton();
                button8.setText("\uD83D\uDCD7 Office darslari");
                KeyboardButton uzsdfg = new KeyboardButton();
                uzsdfg.setText(" \uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66 Biz haqimizda");
                KeyboardButton button10 = new KeyboardButton();
                button10.setText(" \uD83D\uDCE9 Biz bilan bog'lanish");
                KeyboardButton button9 = new KeyboardButton();
                button9.setText("\uD83D\uDCCA Statistika");
                KeyboardButton button11 = new KeyboardButton();
                button11.setText("\uD83D\uDD19 Orqaga");


                row1.add(button1);
                row1.add(button2);
                row2.add(button3);
                row2.add(button4);
                row3.add(button5);
                row3.add(button6);
                row4.add(button7);
                row5.add(button8);
                row5.add(uzsdfg);
                row6.add(button9);
                row6.add(button10);
                row7.add(button11);




                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);
                rowList.add(row4);
                rowList.add(row5);
                rowList.add(row6);
                rowList.add(row7);
                rowList.add(row8);
                rowList.add(row9);
                rowList.add(row10);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Qaysi yo'nalishda ta'lim olmoqchisiz ");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("\uD83C\uDDF7\uD83C\uDDFARus tili")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardRow row4 = new KeyboardRow();
                KeyboardRow row5 = new KeyboardRow();
                KeyboardRow row6 = new KeyboardRow();
                KeyboardRow row7 = new KeyboardRow();
                KeyboardRow row8 = new KeyboardRow();
                KeyboardRow row9 = new KeyboardRow();
                KeyboardRow row10 = new KeyboardRow();
                KeyboardButton button1 = new KeyboardButton();
                button1.setText(" \uD83C\uDFDEУроки дизайна ");
                KeyboardButton button2 = new KeyboardButton();
                button2.setText(" \uD83D\uDC68\uD83C\uDFFB\u200D\uD83D\uDCBBУроки программирования ");
                KeyboardButton button3 = new KeyboardButton();
                button3.setText("\uD83D\uDCF1 СММ ");
                KeyboardButton button4 = new KeyboardButton();
                button4.setText(" \uD83C\uDFC4\u200D♂\uFE0F Уроки фриланса");
                KeyboardButton button5 = new KeyboardButton();
                button5.setText("\uD83E\uDDEE Курсы бухгалтерского учета");
                KeyboardButton button6 = new KeyboardButton();
                button6.setText(" \uD83D\uDCDD Копировать");
                KeyboardButton button7 = new KeyboardButton();
                button7.setText(" \uD83C\uDDFA\uD83C\uDDF8 уроки английского");
                KeyboardButton button8 = new KeyboardButton();
                button8.setText("\uD83D\uDCD7 Офисные занятия");
                KeyboardButton uzsdfg = new KeyboardButton();
                uzsdfg.setText(" \uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66 о нас");
                KeyboardButton button10 = new KeyboardButton();
                button10.setText(" \uD83D\uDCE9 связаться с нами");
                KeyboardButton button9 = new KeyboardButton();
                button9.setText("\uD83D\uDCCA Статистика");
                KeyboardButton button11 = new KeyboardButton();
                button11.setText("\uD83D\uDD19 Назад");

                row1.add(button1);
                row1.add(button2);
                row2.add(button3);
                row2.add(button4);
                row3.add(button5);
                row3.add(button6);
                row4.add(button7);
                row5.add(button8);
                row5.add(uzsdfg);
                row6.add(button9);
                row6.add(button10);
                row7.add(button11);


                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);
                rowList.add(row4);
                rowList.add(row5);
                rowList.add(row6);
                rowList.add(row7);
                rowList.add(row8);
                rowList.add(row9);
                rowList.add(row10);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();

                message.setText("Qaysinida oqisiz");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("\uD83C\uDFDE Dizayn darslari")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardRow row4 = new KeyboardRow();
                KeyboardRow row5 = new KeyboardRow();
                KeyboardRow row6 = new KeyboardRow();
                KeyboardRow row7 = new KeyboardRow();
                KeyboardRow row8 = new KeyboardRow();
                KeyboardRow row9 = new KeyboardRow();
                KeyboardButton elbek1 = new KeyboardButton();
                elbek1.setText("\uD83C\uDDFA\uD83C\uDDFF3D grafika");
                KeyboardButton elbek2 = new KeyboardButton();
                elbek2.setText("\uD83C\uDDFA\uD83C\uDDFFVideo Montaj");
                KeyboardButton elbek3 = new KeyboardButton();
                elbek3.setText("\uD83C\uDDFA\uD83C\uDDFFGrafik Montaj");
                KeyboardButton elbek4 = new KeyboardButton();
                elbek4.setText("UI/UX Dizayn \uD83C\uDDFA\uD83C\uDDFF");
                KeyboardButton elbek5 = new KeyboardButton();
                elbek5.setText("Графический Дизайн \uD83C\uDDF7\uD83C\uDDFA");
                KeyboardButton elbek6 = new KeyboardButton();
                elbek6.setText("3d Graphics \uD83C\uDDFA\uD83C\uDDF8");
                KeyboardButton elbek7 = new KeyboardButton();
                elbek7.setText("Graphic Design \uD83C\uDDFA\uD83C\uDDF8");
                KeyboardButton elbek8 = new KeyboardButton();
                elbek8.setText("UI/UX Desing \uD83C\uDDFA\uD83C\uDDF8");
                KeyboardButton elbek9 = new KeyboardButton();
                elbek9.setText("\uD83D\uDD19 Orqaga");
                KeyboardButton elbek10 = new KeyboardButton();
                elbek10.setText("\uD83D\uDD1D Asosiy Menyu");


                row1.add(elbek1);
                row2.add(elbek2);
                row3.add(elbek3);
                row4.add(elbek4);
                row5.add(elbek5);
                row6.add(elbek6);
                row7.add(elbek7);
                row8.add(elbek8);
                row9.add(elbek9);
                row9.add(elbek10);


                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);
                rowList.add(row4);
                rowList.add(row5);
                rowList.add(row6);
                rowList.add(row7);
                rowList.add(row8);
                rowList.add(row9);

                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Mavzulardan birini tanlang");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("\uD83C\uDDFA\uD83C\uDDFF3D grafika")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardRow row4 = new KeyboardRow();
                KeyboardRow row5 = new KeyboardRow();
                KeyboardRow row6 = new KeyboardRow();
                KeyboardRow row7 = new KeyboardRow();
                KeyboardRow row8 = new KeyboardRow();
                KeyboardRow row9 = new KeyboardRow();
                KeyboardButton abdumalik1 = new KeyboardButton();
                abdumalik1.setText("3Ds Max (Inagamov 3D) \uD83C\uDDFA\uD83C\uDDFF");
                KeyboardButton abdumalik2 = new KeyboardButton();
                abdumalik2.setText("Blender asoslari \uD83C\uDDFA\uD83C\uDDFF");
                KeyboardButton abdumalik3 = new KeyboardButton();
                abdumalik3.setText("Maya - boshlang'ich kurs \uD83C\uDDFA\uD83C\uDDFF");
                KeyboardButton abdumalik4 = new KeyboardButton();
                abdumalik4.setText("ZBrush \uD83C\uDDFA\uD83C\uDDFF");
                KeyboardButton abdumalik5 = new KeyboardButton();
                abdumalik5.setText("AutoCAD \uD83C\uDDFA\uD83C\uDDFF");
                KeyboardButton abdumalik6 = new KeyboardButton();
                abdumalik6.setText("\uD83D\uDD19 Orqaga");
                KeyboardButton abdumalik7 = new KeyboardButton();
                abdumalik7.setText("\uD83D\uDD1D Asosiy Menyu");
                row1.add(abdumalik1);
                row2.add(abdumalik2);
                row3.add(abdumalik3);
                row4.add(abdumalik4);
                row5.add(abdumalik5);
                row6.add(abdumalik6);
                row6.add(abdumalik7);



                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);
                rowList.add(row4);
                rowList.add(row5);
                rowList.add(row6);
                rowList.add(row7);
                rowList.add(row8);
                rowList.add(row9);

                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();

                message.setText("3d grafika");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }}
                    else if (update.getMessage().getText().equals("3Ds Max (Inagamov 3D) \uD83C\uDDFA\uD83C\uDDFF")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();

                KeyboardButton abdumalik1 = new KeyboardButton();
                abdumalik1.setText("3Ds Max 0 dan");
                KeyboardButton abdumalik2 = new KeyboardButton();
                abdumalik2.setText("Modeling");
                KeyboardButton abdumalik3 = new KeyboardButton();
                abdumalik3.setText("\uD83D\uDD19 Orqaga");
                KeyboardButton abdumalik4 = new KeyboardButton();
                abdumalik4.setText("\uD83D\uDD1D Asosiy Menyu");


                row1.add(abdumalik1);
                row1.add(abdumalik2);
                row2.add(abdumalik3);
                row2.add(abdumalik4);




            rowList.add(row1);
            rowList.add(row2);

                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();

                message.setText("3Ds Max (Inagamov 3D) \uD83C\uDDFA\uD83C\uDDFF");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);


                }


            }
            else if (update.getMessage().getText().equals("3Ds Max 0 dan")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardButton uz = new KeyboardButton();
                uz.setText("1-modul");
                KeyboardButton ru = new KeyboardButton();
                ru.setText("2-modul");
                KeyboardButton se= new KeyboardButton();
                se.setText("\uD83D\uDD19 Orqaga");
                KeyboardButton am= new KeyboardButton();
                am.setText("\uD83D\uDD1D Asosiy Menyu");



                row1.add(uz);
                row1.add(ru);
                row2.add(se);
                row2.add(am);


                rowList.add(row1);
                rowList.add(row2);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("3D maxs 0 dan");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



            else if (update.getMessage().getText().equals("1-modul")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardRow row4 = new KeyboardRow();
                KeyboardRow row5 = new KeyboardRow();
                KeyboardRow row6 = new KeyboardRow();
                KeyboardRow row7 = new KeyboardRow();
                KeyboardRow row8 = new KeyboardRow();
                KeyboardRow row9 = new KeyboardRow();
                KeyboardRow row10 = new KeyboardRow();
                KeyboardRow row11 = new KeyboardRow();
                KeyboardRow row12 = new KeyboardRow();
                KeyboardRow row13= new KeyboardRow();
                KeyboardRow row14 = new KeyboardRow();
                KeyboardRow row15 = new KeyboardRow();
                KeyboardRow row16 = new KeyboardRow();
                KeyboardButton abdumalik1 = new KeyboardButton();
                abdumalik1.setText("1-dars");
                KeyboardButton abdumalik2 = new KeyboardButton();
                abdumalik2.setText("2-dars");
                KeyboardButton abdumalik3 = new KeyboardButton();
                abdumalik3.setText("3-dars");
                KeyboardButton abdumalik4 = new KeyboardButton();
                abdumalik4.setText("4-dars");
                KeyboardButton abdumalik5 = new KeyboardButton();
                abdumalik5.setText("5-dars");
                KeyboardButton abdumalik6 = new KeyboardButton();
                abdumalik6.setText("6-dars");
                KeyboardButton abdumalik7 = new KeyboardButton();
                abdumalik7.setText("7-dars");
                KeyboardButton abdumalik8 = new KeyboardButton();
                abdumalik8.setText("8-dars");
                KeyboardButton abdumalik9 = new KeyboardButton();
                abdumalik9.setText("9-dars");

                KeyboardButton abdumalik10 = new KeyboardButton();
                abdumalik10.setText("10-dars");

                KeyboardButton abdumalik11 = new KeyboardButton();
                abdumalik11.setText("11-dars");

                KeyboardButton abdumalik12 = new KeyboardButton();
                abdumalik12.setText("12-dars");

                KeyboardButton abdumalik13 = new KeyboardButton();
                abdumalik13.setText("13-dars");
                KeyboardButton abdumalik14 = new KeyboardButton();
                abdumalik14.setText("14-dars");
                KeyboardButton abdumalik15 = new KeyboardButton();
                abdumalik15.setText("15-dars");
                KeyboardButton abdumalik16 = new KeyboardButton();
                abdumalik16.setText("16-dars");
                KeyboardButton abdumalik17 = new KeyboardButton();
                abdumalik17.setText("17-dars");
                KeyboardButton abdumalik18 = new KeyboardButton();
                abdumalik18.setText("18-dars");
                KeyboardButton abdumalik19 = new KeyboardButton();
                abdumalik19.setText("19-dars");
                KeyboardButton abdumalik20 = new KeyboardButton();
                abdumalik20.setText("20-dars");
                KeyboardButton abdumalik21 = new KeyboardButton();
                abdumalik21.setText("21-dars");
                KeyboardButton abdumalik22 = new KeyboardButton();
                abdumalik22.setText("22-dars");

                KeyboardButton abdumalik23 = new KeyboardButton();
                abdumalik23.setText("23-dars");

                KeyboardButton abdumalik24 = new KeyboardButton();
                abdumalik24.setText("24-dars");

                KeyboardButton abdumalik25 = new KeyboardButton();
                abdumalik25.setText("25-dars");

                KeyboardButton abdumalik26 = new KeyboardButton();
                abdumalik26.setText("26-dars");
                KeyboardButton abdumalik27 = new KeyboardButton();
                abdumalik27.setText("27-dars");
                KeyboardButton abdumalik28 = new KeyboardButton();
                abdumalik28.setText("28-dars");
                KeyboardButton abdumalik29 = new KeyboardButton();
                abdumalik29.setText("29-dars");
                KeyboardButton abdumalik30 = new KeyboardButton();
                abdumalik30.setText("30-dars");
                KeyboardButton abdumalik31 = new KeyboardButton();
                abdumalik31.setText("\uD83D\uDD19 Orqaga");
                KeyboardButton abdumalik32 = new KeyboardButton();
                abdumalik32.setText("\uD83D\uDD1D Asosiy Menyu");





                row1.add(abdumalik1);
                row1.add(abdumalik2);
                row2.add(abdumalik3);
                row2.add(abdumalik4);
                row3.add(abdumalik5);
                row3.add(abdumalik6);
                row4.add(abdumalik7);
                row4.add(abdumalik8);
                row5.add(abdumalik9);
                row5.add(abdumalik10);
                row6.add(abdumalik11);
                row6.add(abdumalik12);
                row7.add(abdumalik13);
                row7.add(abdumalik14);
                row8.add(abdumalik15);
                row8.add(abdumalik16);
                row9.add(abdumalik17);
                row9.add(abdumalik18);
                row10.add(abdumalik19);
                row10.add(abdumalik20);
                row11.add(abdumalik21);
                row11.add(abdumalik23);
                row12.add(abdumalik24);
                row12.add(abdumalik25);
                row13.add(abdumalik26);
                row13.add(abdumalik26);
                row14.add(abdumalik27);
                row14.add(abdumalik28);
                row15.add(abdumalik29);
                row15.add(abdumalik30);
                row16.add(abdumalik31);
                row16.add(abdumalik32);






                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);
                rowList.add(row4);
                rowList.add(row5);
                rowList.add(row6);
                rowList.add(row7);
                rowList.add(row8);
                rowList.add(row9);
                rowList.add(row10);
                rowList.add(row11);
                rowList.add(row12);
                rowList.add(row13);
                rowList.add(row14);
                rowList.add(row15);
                rowList.add(row16);


                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("3D maxs 0 dan");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }



            else if (update.getMessage().getText().equals("2-modul")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardRow row4 = new KeyboardRow();
                KeyboardRow row5 = new KeyboardRow();
                KeyboardRow row6 = new KeyboardRow();
                KeyboardRow row7 = new KeyboardRow();
                KeyboardRow row8 = new KeyboardRow();
                KeyboardRow row9 = new KeyboardRow();
                KeyboardRow row10 = new KeyboardRow();
                KeyboardRow row11 = new KeyboardRow();
                KeyboardRow row12 = new KeyboardRow();
                KeyboardRow row13= new KeyboardRow();
                KeyboardRow row14 = new KeyboardRow();
                KeyboardRow row15 = new KeyboardRow();
                KeyboardRow row16 = new KeyboardRow();
                KeyboardButton am1 = new KeyboardButton();
                am1.setText("31-dars");
                KeyboardButton am2 = new KeyboardButton();
                am2.setText("32-dars");
                KeyboardButton am3 = new KeyboardButton();
                am3.setText("33-dars");
                KeyboardButton abdumalik4 = new KeyboardButton();
                abdumalik4.setText("34-dars");
                KeyboardButton abdumalik5 = new KeyboardButton();
                abdumalik5.setText("35-dars");
                KeyboardButton abdumalik6 = new KeyboardButton();
                abdumalik6.setText("36-dars");
                KeyboardButton abdumalik7 = new KeyboardButton();
                abdumalik7.setText("37-dars");
                KeyboardButton abdumalik8 = new KeyboardButton();
                abdumalik8.setText("38-dars");
                KeyboardButton abdumalik9 = new KeyboardButton();
                abdumalik9.setText("39-dars");

                KeyboardButton abdumalik10 = new KeyboardButton();
                abdumalik10.setText("40-dars");

                KeyboardButton abdumalik11 = new KeyboardButton();
                abdumalik11.setText("41-dars");

                KeyboardButton abdumalik12 = new KeyboardButton();
                abdumalik12.setText("42-dars");

                KeyboardButton abdumalik13 = new KeyboardButton();
                abdumalik13.setText("43-dars");
                KeyboardButton abdumalik14 = new KeyboardButton();
                abdumalik14.setText("44-dars");
                KeyboardButton abdumalik15 = new KeyboardButton();
                abdumalik15.setText("45-dars");
                KeyboardButton abdumalik16 = new KeyboardButton();
                abdumalik16.setText("46-dars");
                KeyboardButton abdumalik17 = new KeyboardButton();
                abdumalik17.setText("47-dars");
                KeyboardButton abdumalik18 = new KeyboardButton();
                abdumalik18.setText("48-dars");
                KeyboardButton abdumalik19 = new KeyboardButton();
                abdumalik19.setText("49-dars");
                KeyboardButton abdumalik20 = new KeyboardButton();
                abdumalik20.setText("50-dars");
                KeyboardButton abdumalik21 = new KeyboardButton();
                abdumalik21.setText("51-dars");
                KeyboardButton abdumalik22 = new KeyboardButton();
                abdumalik22.setText("52-dars");

                KeyboardButton abdumalik23 = new KeyboardButton();
                abdumalik23.setText("53-dars");

                KeyboardButton abdumalik24 = new KeyboardButton();
                abdumalik24.setText("54-dars");

                KeyboardButton abdumalik25 = new KeyboardButton();
                abdumalik25.setText("55-dars");

                KeyboardButton abdumalik26 = new KeyboardButton();
                abdumalik26.setText("56-dars");
                KeyboardButton abdumalik27 = new KeyboardButton();
                abdumalik27.setText("57-dars");
                KeyboardButton abdumalik28 = new KeyboardButton();
                abdumalik28.setText("58-dars");
                KeyboardButton abdumalik29 = new KeyboardButton();
                abdumalik29.setText("59-dars");
                KeyboardButton abdumalik30 = new KeyboardButton();
                abdumalik30.setText("60-dars");
                KeyboardButton abdumalik31 = new KeyboardButton();
                abdumalik31.setText("\uD83D\uDD19 Orqaga");
                KeyboardButton abdumalik32 = new KeyboardButton();
                abdumalik32.setText("\uD83D\uDD1D Asosiy Menyu");





                row1.add(am1);

                row1.add(am2);
                row2.add(am3);
                row2.add(abdumalik4);
                row3.add(abdumalik5);
                row3.add(abdumalik6);
                row4.add(abdumalik7);
                row4.add(abdumalik8);
                row5.add(abdumalik9);
                row5.add(abdumalik10);
                row6.add(abdumalik11);
                row6.add(abdumalik12);
                row7.add(abdumalik13);
                row7.add(abdumalik14);
                row8.add(abdumalik15);
                row8.add(abdumalik16);
                row9.add(abdumalik17);
                row9.add(abdumalik18);
                row10.add(abdumalik19);
                row10.add(abdumalik20);
                row11.add(abdumalik21);
                row11.add(abdumalik23);
                row12.add(abdumalik24);
                row12.add(abdumalik25);
                row13.add(abdumalik26);
                row13.add(abdumalik26);
                row14.add(abdumalik27);
                row14.add(abdumalik28);
                row15.add(abdumalik29);
                row15.add(abdumalik30);
                row16.add(abdumalik31);
                row16.add(abdumalik32);






                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);
                rowList.add(row4);
                rowList.add(row5);
                rowList.add(row6);
                rowList.add(row7);
                rowList.add(row8);
                rowList.add(row9);
                rowList.add(row10);
                rowList.add(row11);
                rowList.add(row12);
                rowList.add(row13);
                rowList.add(row14);
                rowList.add(row15);
                rowList.add(row16);


                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("3D maxs 0 dan");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }

//                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
//                List<KeyboardRow> rowList = new ArrayList<>();
//                KeyboardRow row1 = new KeyboardRow();
//                KeyboardRow row2 = new KeyboardRow();
//                KeyboardRow row3 = new KeyboardRow();
//                KeyboardButton uz = new KeyboardButton();
//                uz.setText("3D графика");
//                KeyboardButton ru = new KeyboardButton();
//                ru.setText("Видеомонтаж");
//                KeyboardButton eng = new KeyboardButton();
//                eng.setText("Графический монтаж");
//
//
//                row1.add(uz);
//                row2.add(ru);
//                row3.add(eng);
//
//
//                rowList.add(row1);
//                rowList.add(row2);
//                rowList.add(row3);
//
//                markup.setKeyboard(rowList);
//                markup.setResizeKeyboard(true);
//                SendMessage message = new SendMessage();
//                message.setText("Выберите одну из тем");
//                message.setChatId(chatId);
//                message.setReplyMarkup(markup);
//                try {
//                    execute(message);
//                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }
//            }
            else if (update.getMessage().getText().equals("\uD83D\uDC68\uD83C\uDFFB\u200D\uD83D\uDCBBDasturlash darslari")) {

                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardButton damas = new KeyboardButton();
                damas.setText("\uD83C\uDDFA\uD83C\uDDFFFrontend");
                KeyboardButton spark = new KeyboardButton();
                spark.setText("\uD83C\uDDFA\uD83C\uDDFFBackend");
                KeyboardButton jentra = new KeyboardButton();
                jentra.setText("\uD83C\uDDFA\uD83C\uDDFFTelegram-Bot");

                row1.add(damas);
                row2.add(spark);
                row3.add(jentra);

                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);

                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Mavzulardan birini tanlang");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("\uD83D\uDC68\uD83C\uDFFB\u200D\uD83D\uDCBB Уроки программирования")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardButton uz = new KeyboardButton();
                uz.setText("Фронтенд");
                KeyboardButton ru = new KeyboardButton();
                ru.setText("Баскенд");
                KeyboardButton eng = new KeyboardButton();
                eng.setText("Telegram-бот");


                row1.add(uz);
                row2.add(ru);
                row3.add(eng);


                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);

                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Выберите одну из тем");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("\uD83D\uDCDD Kopirayting")) {

                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardButton atta = new KeyboardButton();
                atta.setText("\uD83C\uDDFA\uD83C\uDDFFKopirayting kursi (iPro)");
                KeyboardButton spark = new KeyboardButton();
                spark.setText("\uD83C\uDDFA\uD83C\uDDFFCo-Learning Academy");


                row1.add(atta);
                row2.add(spark);

                rowList.add(row1);
                rowList.add(row2);

                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Mavzulardan birini tanlang");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("\uD83D\uDCDDKoпирайтинг")) {

                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardButton damas = new KeyboardButton();
                damas.setText("Koпирайтинг курси (iPro)");
                KeyboardButton spark = new KeyboardButton();
                spark.setText("Co-Learning Academy");


                row1.add(damas);
                row2.add(spark);

                rowList.add(row1);
                rowList.add(row2);

                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Выберите одну из тем");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("\uD83D\uDCF1 SMM")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardButton uz = new KeyboardButton();
                uz.setText("1-modul");
                KeyboardButton ru = new KeyboardButton();
                ru.setText("2-modul");

                row1.add(uz);
                row2.add(ru);

                rowList.add(row1);
                rowList.add(row2);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Qaysi kursni tanlaysiz");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("\uD83D\uDCF1 SMM")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardButton uz = new KeyboardButton();
                uz.setText("1-модуль ");
                KeyboardButton ru = new KeyboardButton();
                ru.setText("2-модуль");

                row1.add(uz);
                row2.add(ru);

                rowList.add(row1);
                rowList.add(row2);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Выберите одну из тем");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("\uD83C\uDFC4\u200D♂\uFE0F Frilanserlik darslari")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardButton uz = new KeyboardButton();
                uz.setText("UpWork'da karyera \uD83C\uDDFA\uD83C\uDDFF");
                KeyboardButton ru = new KeyboardButton();
                ru.setText("Zafarbek Ibrohimov \uD83C\uDDFA\uD83C\uDDFF");

                row1.add(uz);
                row2.add(ru);

                rowList.add(row1);
                rowList.add(row2);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Qaysi kursni tanlaysiz");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("\uD83C\uDFC4\u200D♂\uFE0F Уроки фриланса ")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardButton uz = new KeyboardButton();
                uz.setText("Карьера в UpWork \\uD83C\\uDDFA\\uD83C\\uDDFF");
                KeyboardButton ru = new KeyboardButton();
                ru.setText("Зафарбек Ибрагимов \\uD83C\\uDDFA\\uD83C\\uDDFF");

                row1.add(uz);
                row2.add(ru);

                rowList.add(row1);
                rowList.add(row2);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Выберите одну из тем");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("🧮 Buxgalteriya kurslari")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardButton uzed = new KeyboardButton();
                uzed.setText("1C dasturida ishlash \uD83C\uDDFA\uD83C\uDDFF");

                row1.add(uzed);

                rowList.add(row1);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Qaysi kursni tanlaysiz");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals(" \uD83E\uDDEE Курсы бухгалтерского учета")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardButton uzed = new KeyboardButton();
                uzed.setText("Работа в программе 1С \uD83C\uDDFA\uD83C\uDDFF");

                row1.add(uzed);

                rowList.add(row1);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Выберите одну из тем");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("\uD83C\uDDFA\uD83C\uDDF8 Ingliz tili darslari")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardButton uzed = new KeyboardButton();
                uzed.setText("Easy English \uD83C\uDDFA\uD83C\uDDF8");
                KeyboardButton uzedn = new KeyboardButton();
                uzedn.setText("English cartoons with subtitle \uD83C\uDDFA\uD83C\uDDF8");
                KeyboardButton uzedl = new KeyboardButton();
                uzedl.setText("Prepuz \uD83C\uDDFA\uD83C\uDDF8");

                row1.add(uzed);
                row2.add(uzedn);
                row3.add(uzedl);

                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Qaysi kursni tanlaysiz");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals(" \uD83C\uDDFA\uD83C\uDDF8 Уроки английского")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardButton uzed = new KeyboardButton();
                uzed.setText("Easy English \\uD83C\\uDDFA\\uD83C\\uDDF8\"");
                KeyboardButton uzedi = new KeyboardButton();
                uzedi.setText("English cartoons with subtitle \uD83C\uDDFA\uD83C\uDDF8");
                KeyboardButton uzedo = new KeyboardButton();
                uzedo.setText("Prepuz \uD83C\uDDFA\uD83C\uDDF8");

                row1.add(uzed);
                row2.add(uzedi);
                row3.add(uzedo);



                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Выберите одну из тем");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("\uD83D\uDCE9 Biz bilan bog'lanish")) {}
            else if (update.getMessage().getText().equals(" \uD83D\uDCE9 Cвязаться с нами")) {}
            else if (update.getMessage().getText().equals(" \uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66 Biz haqimizda")) {}
            else if (update.getMessage().getText().equals(" \uD83D\uDC68\u200D\uD83D\uDC69\u200D\uD83D\uDC67\u200D\uD83D\uDC66 O нас")) {}
            else if (update.getMessage().getText().equals("\uD83C\uDDFA\uD83C\uDDFF3D grafika")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardButton uz = new KeyboardButton();
                uz.setText("3Ds Max (Inogamov 3D");
                KeyboardButton ru = new KeyboardButton();
                ru.setText("Blender asoslari");
                KeyboardButton eng = new KeyboardButton();
                eng.setText("ZBrush");

                row1.add(uz);
                row1.add(ru);
                row2.add(eng);

                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Qaysi kursni tanlaysiz");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            else if (update.getMessage().getText().equals("\uD83C\uDDFA\uD83C\uDDFFVideo Montaj")) {

                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardButton oq = new KeyboardButton();
                oq.setText("Adobe After effects");
                KeyboardButton qora = new KeyboardButton();
                qora.setText("Adobe Premier Pro");

                row1.add(oq);
                row2.add(qora);
                rowList.add(row1);
                rowList.add(row2);

                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Qaysi kursni tanlaysiz");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("\uD83C\uDDFA\uD83C\uDDFFGrafik Montaj")) {

                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardButton oq = new KeyboardButton();
                oq.setText("MockUp dizayn kursi");
                KeyboardButton qora = new KeyboardButton();
                qora.setText("Adobe Illustrator (Madina Mavlonova )");
                KeyboardButton saru = new KeyboardButton();
                saru.setText("Adobe Photoshop (Asror Iskandarov)");


                row1.add(oq);
                row2.add(qora);
                row3.add(saru);

                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);

                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Qaysi Kursni tanlaysiz");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("3D графика")) {

                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardButton Белый = new KeyboardButton();
                Белый.setText("3Ds Max (Inogamov 3D");
                KeyboardButton Черный = new KeyboardButton();
                Черный.setText("Blender asoslari");
                KeyboardButton malochni = new KeyboardButton();
                malochni.setText("ZBrush");


                row1.add(Белый);
                row1.add(Черный);
                row2.add(malochni);

                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("какой курс вы выберете");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("Видеомонтаж")) {

                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardButton oq = new KeyboardButton();
                oq.setText("Adobe After effects");
                KeyboardButton qora = new KeyboardButton();
                qora.setText("Adobe Premier Pro");

                row1.add(oq);
                row2.add(qora);

                rowList.add(row1);
                rowList.add(row2);

                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("какой курс вы выберете");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("Графический монтаж")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardButton uz = new KeyboardButton();
                uz.setText("Курс дизайна MockUp");
                KeyboardButton ru = new KeyboardButton();
                ru.setText("Adobe Illustrator (Мадина Мавлонова)");
                KeyboardButton eng = new KeyboardButton();
                eng.setText("Adobe Photoshop (Асрор Искандаров)");

                row1.add(uz);
                row1.add(ru);
                row2.add(eng);

                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);

                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("какой курс вы выберете");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("\uD83C\uDDFA\uD83C\uDDFFFrontend")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardButton uz = new KeyboardButton();
                uz.setText("Frontend (Saud Abdulwahed )");
                KeyboardButton ru = new KeyboardButton();
                ru.setText("HTML va CSS");
                KeyboardButton eng = new KeyboardButton();
                eng.setText("SASS (Javohir Group)");

                row1.add(uz);
                row1.add(ru);
                row2.add(eng);

                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Qaysi kursni tanlaysiz");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }


            }
            else if (update.getMessage().getText().equals("\uD83C\uDDFA\uD83C\uDDFFBackend")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardButton uz = new KeyboardButton();
                uz.setText("Phyton");
                KeyboardButton ru = new KeyboardButton();
                ru.setText(" C++");
                KeyboardButton eng = new KeyboardButton();
                eng.setText("Java");

                row1.add(uz);
                row1.add(ru);
                row2.add(eng);

                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Qaysi kursni tanlaysiz");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            else if (update.getMessage().getText().equals("\uD83C\uDDFA\uD83C\uDDFFTelegram-Bot")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardButton ru = new KeyboardButton();
                ru.setText(" Telegram bot yaratish");
                KeyboardButton eng = new KeyboardButton();
                eng.setText("Phytonda telegram bot yaratish");


                row1.add(ru);
                row2.add(eng);

                rowList.add(row1);
                rowList.add(row2);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Qaysi kursni tanlaysiz");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("\uD83C\uDDFA\uD83C\uDDFFTelegram-Bot")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardButton ru = new KeyboardButton();
                ru.setText(" Telegram bot yaratish");
                KeyboardButton eng = new KeyboardButton();
                eng.setText("Phytonda telegram bot yaratish");


                row1.add(ru);
                row2.add(eng);

                rowList.add(row1);
                rowList.add(row2);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Qaysi kursni tanlaysiz");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("\uD83C\uDDFA\uD83C\uDDFFKopirayting kursi (iPro)")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardButton eng = new KeyboardButton();
                eng.setText("1-Dars");


                row1.add(eng);

                rowList.add(row1);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Qaysi kursni tanlaysiz");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if (update.getMessage().getText().equals("Co-Learning Academy")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardButton eng = new KeyboardButton();
                eng.setText("1-Dars");
                KeyboardButton zr = new KeyboardButton();
                zr.setText("2-Dars");
                KeyboardButton kr = new KeyboardButton();
                kr.setText("3-Dars");


                row1.add(eng);
                row1.add(zr);
                row1.add(kr);


                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("Qaysi kursni tanlaysiz");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            else if (update.getMessage().getText().equals("Фронтенд")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardButton eng = new KeyboardButton();
                eng.setText("Фронтенд (Saud Abdulwahed )");
                KeyboardButton zr = new KeyboardButton();
                zr.setText("HTML va CSS");
                KeyboardButton kr = new KeyboardButton();
                kr.setText("SASS (Javohir Group)");


                row1.add(eng);
                row2.add(zr);
                row3.add(kr);


                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("какой курс вы выберете");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            else if (update.getMessage().getText().equals("Баскенд")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardRow row3 = new KeyboardRow();
                KeyboardButton eng = new KeyboardButton();
                eng.setText("Phyton");
                KeyboardButton sol = new KeyboardButton();
                sol.setText("C++");
                KeyboardButton aso = new KeyboardButton();
                aso.setText("Java");


                row1.add(eng);
                row2.add(sol);
                row3.add(aso);


                rowList.add(row1);
                rowList.add(row2);
                rowList.add(row3);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("какой курс вы выберете");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
            else if (update.getMessage().getText().equals("Telegram-бот")) {
                ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
                List<KeyboardRow> rowList = new ArrayList<>();
                KeyboardRow row1 = new KeyboardRow();
                KeyboardRow row2 = new KeyboardRow();
                KeyboardButton eng = new KeyboardButton();
                eng.setText("Создать бота в Telegram)");
                KeyboardButton zr = new KeyboardButton();
                zr.setText("Создать бота в Telegram на Phyton");


                row1.add(eng);
                row2.add(zr);


                rowList.add(row1);
                rowList.add(row2);
                markup.setKeyboard(rowList);
                markup.setResizeKeyboard(true);
                SendMessage message = new SendMessage();
                message.setText("какой курс вы выберете");
                message.setChatId(chatId);
                message.setReplyMarkup(markup);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }

            }
        }
        else if (update.getMessage().hasContact()) {
            ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
            List<KeyboardRow> rowList = new ArrayList<>();
            KeyboardRow row1 = new KeyboardRow();
            KeyboardRow row2 = new KeyboardRow();
            KeyboardButton uz = new KeyboardButton();
            uz.setText("\uD83C\uDDFA\uD83C\uDDFFUzbek tili");
            KeyboardButton ru = new KeyboardButton();
            ru.setText("\uD83C\uDDF7\uD83C\uDDFARus tili");


            row1.add(uz);
            row2.add(ru);


            rowList.add(row1);
            rowList.add(row2);
            markup.setKeyboard(rowList);
            markup.setResizeKeyboard(true);
            SendMessage message = new SendMessage();
            message.setText("\uD83C\uDDFA\uD83C\uDDFF Tilni tanlang\n" +
                    "\uD83C\uDDF7\uD83C\uDDFA Выберите язык");
            message.setChatId(chatId);
            message.setReplyMarkup(markup);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }
        }
        else if (update.hasCallbackQuery()) {
//            String data = update.getCallbackQuery().getData();
//            if (data.equals("check")){
//                GetChatMember member = new GetChatMember();
//                member.setChatId("@mu1701a");
//                member.setUserId(update.getCallbackQuery().getMessage().getChatId());
//                ChatMember user = null;
//                try {
//                    user = execute(member);
//                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }
//
//                String status = user.getStatus();
//                if (status.equals("member") || status.equals("creator") || status.equals("administrator")){
//                    SendMessage message = new SendMessage();
//                    message.setText("Obuna bo'lgansiz");
//                    message.setChatId(update.getCallbackQuery().getMessage().getChatId());
//                    try {
//                        execute(message);
//                    } catch (TelegramApiException e) {
//                        throw new RuntimeException(e);
//                    }
//                } else {
//                    SendMessage message = new SendMessage();
//                    message.setText("Obuna bo'lmagansiz");
//                    message.setChatId(update.getCallbackQuery().getMessage().getChatId());
//                    try {
//                        execute(message);
//                    } catch (TelegramApiException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }

        }
    }

    @Override
    public String getBotUsername() {
        return "PDP_Telegram_bot";
    }
}
