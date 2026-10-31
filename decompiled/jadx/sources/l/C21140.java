package l;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: renamed from: l.᩷᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public class C21140 extends FrameLayout {
    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        if (Build.VERSION.SDK_INT >= 28 && windowInsets != null && (displayCutout = windowInsets.getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
            setPadding(Math.max(displayCutout.getSafeInsetLeft(), 0), Math.max(displayCutout.getSafeInsetTop(), 0), Math.max(displayCutout.getSafeInsetRight(), 0), Math.max(displayCutout.getSafeInsetBottom(), 0));
        }
        return super.onApplyWindowInsets(windowInsets);
    }
}
