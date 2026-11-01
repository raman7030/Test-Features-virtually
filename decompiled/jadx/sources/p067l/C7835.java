package p067l;

import android.app.Activity;
import android.graphics.Rect;

/* JADX INFO: renamed from: l.ۛ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: FAMT */
/* JADX INFO: loaded from: classes2.dex */
public final class C7835 {
    /* JADX INFO: renamed from: ֫ */
    public static Rect m18114(Activity activity) {
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        C13045.m29865(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }
}
