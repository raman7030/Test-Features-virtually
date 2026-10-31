package l;

import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩴۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88XH */
/* JADX INFO: loaded from: classes4.dex */
public final class C18485 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f57309;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Layout m42973(Spanned spanned) {
        C18485[] c18485Arr = (C18485[]) spanned.getSpans(0, spanned.length(), C18485.class);
        if (c18485Arr == null || c18485Arr.length <= 0) {
            return null;
        }
        return (Layout) c18485Arr[0].f57309.get();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42974(Spannable spannable, StaticLayout staticLayout) {
        C18485[] c18485Arr = (C18485[]) spannable.getSpans(0, spannable.length(), C18485.class);
        if (c18485Arr != null) {
            for (C18485 c18485 : c18485Arr) {
                spannable.removeSpan(c18485);
            }
        }
        spannable.setSpan(new C18485(staticLayout), 0, spannable.length(), 18);
    }

    public C18485(StaticLayout staticLayout) {
        this.f57309 = new WeakReference(staticLayout);
    }
}
