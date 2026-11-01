package p067l;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩸֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L5YG */
/* JADX INFO: loaded from: classes4.dex */
public final class C22577 {
    /* JADX INFO: renamed from: ֫ */
    public static void m50611(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static PrecomputedText.Params m50609(TextView textView) {
        return textView.getTextMetricsParams();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String[] m50612(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* JADX INFO: renamed from: ֫ */
    public static CharSequence m50610(PrecomputedText precomputedText) {
        return precomputedText;
    }
}
