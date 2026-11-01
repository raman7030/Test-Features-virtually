package p067l;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.᩸ᩴ */
/* JADX INFO: compiled from: R697 */
/* JADX INFO: loaded from: classes.dex */
public final class C1921 {
    /* JADX INFO: renamed from: ֫ */
    public static void m51420(View view, Rect rect, Rect rect2) {
        Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
        rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
    }
}
