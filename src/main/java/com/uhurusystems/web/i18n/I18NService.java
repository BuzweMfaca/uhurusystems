package com.uhurusystems.web.i18n;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class I18NService {

    @Autowired
    private MessageSource messageSource;

    /**
     * Returns a message for the given message id and the default locate in the session context
     * @param messageId The key to the message resource file
     */
    public String getMessage(String messageID){
        Locale locale = LocaleContextHolder.getLocale();
        return getMessage(messageID, locale);
    }

    /**
     * Returns a message for the given message id and locale
     * @param messageId The key to the message resource file
     * @param locale The Locate
     */
     public String getMessage(String messageId, Locale locale){
         return messageSource.getMessage(messageId, null, locale);
     }
}
