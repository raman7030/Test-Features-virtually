package p067l;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۤ */
/* JADX INFO: compiled from: Z21V */
/* JADX INFO: loaded from: classes.dex */
public final class C0894 {

    /* JADX INFO: renamed from: ܿۖ᩵, reason: not valid java name and contains not printable characters */
    public static int f81854;

    /* JADX INFO: renamed from: ֫ */
    public final int f6635;

    /* JADX INFO: renamed from: ۧ */
    public final int f6636;

    /* JADX INFO: renamed from: ܽ */
    public final TextPaint f6637;

    /* JADX INFO: renamed from: ᩳ */
    public final TextDirectionHeuristic f6638;

    /* JADX INFO: renamed from: ֫᩺᩹, reason: not valid java name and contains not printable characters */
    public static boolean m55758(Object obj, Object obj2) {
        return ((ArrayList) obj).contains(obj2);
    }

    /* JADX INFO: renamed from: ۠֫֡, reason: not valid java name and contains not printable characters */
    public static boolean m55759(Object obj) {
        return C17384.m39567((String) obj);
    }

    /* JADX INFO: renamed from: ۠ۗۢ, reason: not valid java name and contains not printable characters */
    public static int m55760(Object obj) {
        return ((C14677) obj).m33581();
    }

    /* JADX INFO: renamed from: ۡ۟ᩴ, reason: not valid java name and contains not printable characters */
    public static void m55761(Object obj) {
        ((C13746) obj).m31298();
    }

    /* JADX INFO: renamed from: ۡ۬ۜ, reason: not valid java name and contains not printable characters */
    public static int m55762(Object obj) {
        return ((SpannableStringBuilder) obj).length();
    }

    /* JADX INFO: renamed from: ۤܿ֨, reason: not valid java name and contains not printable characters */
    public static void m55763(Object obj) {
        ((C21089) obj).m47686();
    }

    /* JADX INFO: renamed from: ۧۘۖ, reason: not valid java name and contains not printable characters */
    public static void m55764(Object obj, Object obj2, Object obj3) {
        ((C3313) obj).m5777((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۧۘۨ, reason: not valid java name and contains not printable characters */
    public static String m55765(Object obj) {
        return ((String) obj).toLowerCase();
    }

    /* JADX INFO: renamed from: ۨ۫֨, reason: not valid java name and contains not printable characters */
    public static Iterator m55766(Object obj) {
        return ((List) obj).iterator();
    }

    /* JADX INFO: renamed from: ᩶ۖۢ, reason: not valid java name and contains not printable characters */
    public static void m55767(Object obj) {
        ((ArrayList) obj).clear();
    }

    /* JADX INFO: renamed from: ᩸ۗۤ, reason: not valid java name and contains not printable characters */
    public static boolean m55768(Object obj) {
        return ((C10967) obj).m25290();
    }

    /* JADX INFO: renamed from: ᩸ܿۛ, reason: not valid java name and contains not printable characters */
    public static int m55769() {
        return -1405139113;
    }

    /* JADX INFO: renamed from: ᩹ۡᩴ, reason: not valid java name and contains not printable characters */
    public static int m55770(Object obj) {
        return ((TextView) obj).length();
    }

    /* JADX INFO: renamed from: ᩹᩶ᩳ, reason: not valid java name and contains not printable characters */
    public static void m55771(Object obj, Object obj2) {
        ((TextView) obj).setText((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ᩺۬ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m55772() {
        return C24414.m53856();
    }

    /* JADX INFO: renamed from: ᩻ᩴ᩵, reason: not valid java name and contains not printable characters */
    public static String m55773(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    public C0894(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.f6637 = textPaint;
        this.f6638 = textDirectionHeuristic;
        this.f6635 = i;
        this.f6636 = i2;
    }

    public C0894(PrecomputedText.Params params) {
        this.f6637 = params.getTextPaint();
        this.f6638 = params.getTextDirection();
        this.f6635 = params.getBreakStrategy();
        this.f6636 = params.getHyphenationFrequency();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final TextPaint m5879() {
        return this.f6637;
    }

    /* JADX INFO: renamed from: ܽ */
    public final TextDirectionHeuristic m5878() {
        return this.f6638;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m5875() {
        return this.f6635;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m5877() {
        return this.f6636;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m5876(C0894 c0894) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && (this.f6635 != c0894.f6635 || this.f6636 != c0894.f6636)) {
            return false;
        }
        TextPaint textPaint = this.f6637;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = c0894.f6637;
        TextPaint textPaint3 = c0894.f6637;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint3.getTextScaleX() || textPaint.getTextSkewX() != textPaint3.getTextSkewX() || textPaint.getLetterSpacing() != textPaint3.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint3.getFontFeatureSettings()) || textPaint.getFlags() != textPaint3.getFlags()) {
            return false;
        }
        if (i >= 24) {
            if (!textPaint.getTextLocales().equals(textPaint3.getTextLocales())) {
                return false;
            }
        } else if (!textPaint.getTextLocale().equals(textPaint3.getTextLocale())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            return textPaint3.getTypeface() == null;
        }
        return textPaint.getTypeface().equals(textPaint3.getTypeface());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0894)) {
            return false;
        }
        C0894 c0894 = (C0894) obj;
        return m5876(c0894) && this.f6638 == c0894.f6638;
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = this.f6638;
        int i2 = this.f6636;
        int i3 = this.f6635;
        TextPaint textPaint = this.f6637;
        return i >= 24 ? C12826.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2)) : C12826.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f6637;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f6638);
        sb.append(", breakStrategy=" + this.f6635);
        sb.append(", hyphenationFrequency=" + this.f6636);
        sb.append(C0249l.f1198d);
        return sb.toString();
    }
}
