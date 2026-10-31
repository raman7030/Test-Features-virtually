package l;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: l.۬ܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37HW */
/* JADX INFO: loaded from: classes3.dex */
public final class C13192 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static CharSequence m32018(String str) {
        SpannableStringBuilder spannableStringBuilder = null;
        if (str == null) {
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 10132) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(str);
                }
                int i2 = i + 1;
                spannableStringBuilder.replace(i, i2, (CharSequence) "￼");
                spannableStringBuilder.setSpan(new C3315(), i, i2, 33);
            }
        }
        return spannableStringBuilder == null ? str : spannableStringBuilder;
    }
}
