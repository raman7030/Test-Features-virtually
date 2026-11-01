package p067l;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.ۚ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28G5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7338 {
    /* JADX INFO: renamed from: ֫ */
    public static void m16930(C23207 c23207) {
        c23207.m51729(-3.4028235E38f, Integer.MIN_VALUE);
        if (c23207.m51735() instanceof Spanned) {
            if (!(c23207.m51735() instanceof Spannable)) {
                c23207.m51726(SpannableString.valueOf(c23207.m51735()));
            }
            CharSequence charSequenceM51735 = c23207.m51735();
            charSequenceM51735.getClass();
            Spannable spannable = (Spannable) charSequenceM51735;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }
}
