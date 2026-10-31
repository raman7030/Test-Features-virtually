package l;

import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩵ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V91O */
/* JADX INFO: loaded from: classes4.dex */
public final class C19191 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f60445;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static TextView m44269(Spanned spanned) {
        C19191[] c19191Arr = (C19191[]) spanned.getSpans(0, spanned.length(), C19191.class);
        if (c19191Arr == null || c19191Arr.length <= 0) {
            return null;
        }
        return (TextView) c19191Arr[0].f60445.get();
    }

    public C19191(TextView textView) {
        this.f60445 = new WeakReference(textView);
    }
}
