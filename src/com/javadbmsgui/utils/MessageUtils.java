/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javadbmsgui.utils;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author raunakshakya
 */
public class MessageUtils {

    private static final String MESSAGES_LOCATION = "com/javadbmsgui/system/MessageBundle";
    public static ResourceBundle MESSAGES = ResourceBundle.getBundle(MessageUtils.MESSAGES_LOCATION, Locale.US);

}
