package p067l;

import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩴۗۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88XH */
/* JADX INFO: loaded from: classes4.dex */
public final class C19936 {

    /* JADX INFO: renamed from: ֫ */
    public final WeakReference f60528;

    /* JADX INFO: renamed from: ֫ */
    public static Layout m45249(Spanned spanned) {
        C19936[] c19936Arr = (C19936[]) spanned.getSpans(0, spanned.length(), C19936.class);
        if (c19936Arr == null || c19936Arr.length <= 0) {
            return null;
        }
        return (Layout) c19936Arr[0].f60528.get();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45250(Spannable spannable, StaticLayout staticLayout) {
        C19936[] c19936Arr = (C19936[]) spannable.getSpans(0, spannable.length(), C19936.class);
        if (c19936Arr != null) {
            for (C19936 c19936 : c19936Arr) {
                spannable.removeSpan(c19936);
            }
        }
        spannable.setSpan(new C19936(staticLayout), 0, spannable.length(), 18);
    }

    public C19936(StaticLayout staticLayout) {
        this.f60528 = new WeakReference(staticLayout);
    }
}
