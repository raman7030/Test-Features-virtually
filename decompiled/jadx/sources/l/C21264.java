package l;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩸֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L5YG */
/* JADX INFO: loaded from: classes4.dex */
public final class C21264 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48280(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PrecomputedText.Params m48278(TextView textView) {
        return textView.getTextMetricsParams();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String[] m48281(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static CharSequence m48279(PrecomputedText precomputedText) {
        return precomputedText;
    }
}
