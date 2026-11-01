package p067l;

import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩵ۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V91O */
/* JADX INFO: loaded from: classes4.dex */
public final class C20607 {

    /* JADX INFO: renamed from: ֫ */
    public final WeakReference f63675;

    /* JADX INFO: renamed from: ֫ */
    public static TextView m46564(Spanned spanned) {
        C20607[] c20607Arr = (C20607[]) spanned.getSpans(0, spanned.length(), C20607.class);
        if (c20607Arr == null || c20607Arr.length <= 0) {
            return null;
        }
        return (TextView) c20607Arr[0].f63675.get();
    }

    public C20607(TextView textView) {
        this.f63675 = new WeakReference(textView);
    }
}
