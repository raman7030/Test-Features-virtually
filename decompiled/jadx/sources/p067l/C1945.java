package p067l;

import android.window.BackEvent;

/* JADX INFO: renamed from: l.᩹ۧ */
/* JADX INFO: compiled from: C9BS */
/* JADX INFO: loaded from: classes.dex */
public final class C1945 {

    /* JADX INFO: renamed from: ֫ */
    public static final C1945 f74863 = new C1945();

    /* JADX INFO: renamed from: ֫ */
    public final float m52233(BackEvent backEvent) {
        C13045.m29867(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m52235(BackEvent backEvent) {
        C13045.m29867(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* JADX INFO: renamed from: ܽ */
    public final float m52236(BackEvent backEvent) {
        C13045.m29867(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final float m52237(BackEvent backEvent) {
        C13045.m29867(backEvent, "backEvent");
        return backEvent.getTouchY();
    }

    /* JADX INFO: renamed from: ֫ */
    public final BackEvent m52234(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }
}
