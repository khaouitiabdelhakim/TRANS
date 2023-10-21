package com.blair.trans

import android.widget.TextView

object TextTransformer {
    fun toggleCase(textView: TextView) {
        val strText = textView.text
        var transformedText = ""
        for (c in strText) {
            transformedText += if (c.isLowerCase()) {
                c.uppercaseChar()
            } else {
                c.lowercaseChar()
            }
        }
        textView.text = transformedText
    }
}