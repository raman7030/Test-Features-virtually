package l;

import android.app.Activity;
import android.graphics.Rect;

/* JADX INFO: renamed from: l.ۛ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: FAMT */
/* JADX INFO: loaded from: classes2.dex */
public final class C5752 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Rect m16195(Activity activity) {
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        C11233.m27803(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }
}
