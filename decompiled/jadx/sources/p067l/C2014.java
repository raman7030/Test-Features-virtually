package p067l;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;

/* JADX INFO: renamed from: l.᩻ۤ */
/* JADX INFO: compiled from: M5X0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2014 {
    /* JADX INFO: renamed from: ֫ */
    public static C1734 m54520(Context context, C1422 c1422) {
        return C1142.m18806(context, c1422);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Typeface m54519(Context context, C1422 c1422, int i, boolean z, int i2, Handler handler, C2018 c2018) {
        C1597 c1597 = new C1597(c2018, handler);
        if (z) {
            return C1664.m41301(context, c1422, c1597, i, i2);
        }
        return C1664.m41300(context, c1422, i, c1597);
    }
}
