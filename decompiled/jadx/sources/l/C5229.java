package l;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.ۚ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5229 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15020(C21927 c21927) {
        c21927.m49392(-3.4028235E38f, Integer.MIN_VALUE);
        if (c21927.m49398() instanceof Spanned) {
            if (!(c21927.m49398() instanceof Spannable)) {
                c21927.m49389(SpannableString.valueOf(c21927.m49398()));
            }
            CharSequence charSequenceM49398 = c21927.m49398();
            charSequenceM49398.getClass();
            Spannable spannable = (Spannable) charSequenceM49398;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }
}
