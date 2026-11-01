package p067l;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۛ */
/* JADX INFO: compiled from: 51AH */
/* JADX INFO: loaded from: classes2.dex */
public final class C0853 {
    /* JADX INFO: renamed from: ֫ */
    public static DisplayCutout m3874(Rect rect, List list) {
        return new DisplayCutout(rect, list);
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m3878(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m3876(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m3877(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m3879(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m3875(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }
}
