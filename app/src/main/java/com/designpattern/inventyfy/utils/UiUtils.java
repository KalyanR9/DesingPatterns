package com.designpattern.inventyfy.utils;

import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;

/**
 * Created by desaidr
 */

public class UiUtils {

    public static SpannableString getLinkSpannableString(final String text, final String urlToAdd) {
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(new URLSpan(urlToAdd), 0, text.length(), 0);
        spannableString.setSpan(new UnderlineSpan(), 0, text.length(), 0);
        spannableString.setSpan(new RelativeSizeSpan(1.5f), 0, text.length(), 0);
        return spannableString;
    }
}
