package p067l;

import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܿ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8ZQ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18868 {
    /* JADX INFO: renamed from: ֫ */
    public static void m42941(TextView textView) {
        CharSequence text = textView.getText();
        Object[] spans = (TextUtils.isEmpty(text) || !(text instanceof Spanned)) ? null : ((Spanned) text).getSpans(0, text.length(), C4116.class);
        if (spans == null || spans.length <= 0) {
            return;
        }
        for (Object obj : spans) {
            ((C4116) obj).m8315((InterfaceC9207) null);
        }
    }
}
