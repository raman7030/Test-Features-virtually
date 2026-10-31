package l;

import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܿ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C8ZQ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17361 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40690(TextView textView) {
        CharSequence text = textView.getText();
        Object[] spans = (TextUtils.isEmpty(text) || !(text instanceof Spanned)) ? null : ((Spanned) text).getSpans(0, text.length(), C1839.class);
        if (spans == null || spans.length <= 0) {
            return;
        }
        for (Object obj : spans) {
            ((C1839) obj).m6117((InterfaceC7196) null);
        }
    }
}
