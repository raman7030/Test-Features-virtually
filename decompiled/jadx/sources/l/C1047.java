package l;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z21V */
/* JADX INFO: loaded from: classes.dex */
public final class C1047 {

    /* JADX INFO: renamed from: ܿۖ᩵, reason: not valid java name and contains not printable characters */
    public static int f3863;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f3864;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f3865;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextPaint f3866;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextDirectionHeuristic f3867;

    /* JADX INFO: renamed from: ֫᩺᩹, reason: not valid java name and contains not printable characters */
    public static boolean m3588(Object obj, Object obj2) {
        return ((ArrayList) obj).contains(obj2);
    }

    /* JADX INFO: renamed from: ۠֫֡, reason: not valid java name and contains not printable characters */
    public static boolean m3589(Object obj) {
        return C15799.m37396((String) obj);
    }

    /* JADX INFO: renamed from: ۠ۗۢ, reason: not valid java name and contains not printable characters */
    public static int m3590(Object obj) {
        return ((C12951) obj).m31494();
    }

    /* JADX INFO: renamed from: ۡ۟ᩴ, reason: not valid java name and contains not printable characters */
    public static void m3591(Object obj) {
        ((C11971) obj).m29244();
    }

    /* JADX INFO: renamed from: ۡ۬ۜ, reason: not valid java name and contains not printable characters */
    public static int m3592(Object obj) {
        return ((SpannableStringBuilder) obj).length();
    }

    /* JADX INFO: renamed from: ۤܿ֨, reason: not valid java name and contains not printable characters */
    public static void m3593(Object obj) {
        ((C19697) obj).m45389();
    }

    /* JADX INFO: renamed from: ۧۘۖ, reason: not valid java name and contains not printable characters */
    public static void m3594(Object obj, Object obj2, Object obj3) {
        ((C0994) obj).m3474((String) obj2, (String) obj3);
    }

    /* JADX INFO: renamed from: ۧۘۨ, reason: not valid java name and contains not printable characters */
    public static String m3595(Object obj) {
        return ((String) obj).toLowerCase();
    }

    /* JADX INFO: renamed from: ۨ۫֨, reason: not valid java name and contains not printable characters */
    public static Iterator m3596(Object obj) {
        return ((List) obj).iterator();
    }

    /* JADX INFO: renamed from: ᩶ۖۢ, reason: not valid java name and contains not printable characters */
    public static void m3597(Object obj) {
        ((ArrayList) obj).clear();
    }

    /* JADX INFO: renamed from: ᩸ۗۤ, reason: not valid java name and contains not printable characters */
    public static boolean m3598(Object obj) {
        return ((C9047) obj).m23345();
    }

    /* JADX INFO: renamed from: ᩸ܿۛ, reason: not valid java name and contains not printable characters */
    public static int m3599() {
        return -1405139113;
    }

    /* JADX INFO: renamed from: ᩹ۡᩴ, reason: not valid java name and contains not printable characters */
    public static int m3600(Object obj) {
        return ((TextView) obj).length();
    }

    /* JADX INFO: renamed from: ᩹᩶ᩳ, reason: not valid java name and contains not printable characters */
    public static void m3601(Object obj, Object obj2) {
        ((TextView) obj).setText((CharSequence) obj2);
    }

    /* JADX INFO: renamed from: ᩺۬ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m3602() {
        return C23196.m51460();
    }

    /* JADX INFO: renamed from: ᩻ᩴ᩵, reason: not valid java name and contains not printable characters */
    public static String m3603(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    public C1047(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.f3866 = textPaint;
        this.f3867 = textDirectionHeuristic;
        this.f3864 = i;
        this.f3865 = i2;
    }

    public C1047(PrecomputedText.Params params) {
        this.f3866 = params.getTextPaint();
        this.f3867 = params.getTextDirection();
        this.f3864 = params.getBreakStrategy();
        this.f3865 = params.getHyphenationFrequency();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextPaint m3608() {
        return this.f3866;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextDirectionHeuristic m3607() {
        return this.f3867;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m3604() {
        return this.f3864;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m3606() {
        return this.f3865;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m3605(C1047 c1047) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && (this.f3864 != c1047.f3864 || this.f3865 != c1047.f3865)) {
            return false;
        }
        TextPaint textPaint = this.f3866;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = c1047.f3866;
        TextPaint textPaint3 = c1047.f3866;
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
        if (!(obj instanceof C1047)) {
            return false;
        }
        C1047 c1047 = (C1047) obj;
        return m3605(c1047) && this.f3867 == c1047.f3867;
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = this.f3867;
        int i2 = this.f3865;
        int i3 = this.f3864;
        TextPaint textPaint = this.f3866;
        return i >= 24 ? C11003.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2)) : C11003.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f3866;
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
        sb.append(", textDir=" + this.f3867);
        sb.append(", breakStrategy=" + this.f3864);
        sb.append(", hyphenationFrequency=" + this.f3865);
        sb.append(l.d);
        return sb.toString();
    }
}
