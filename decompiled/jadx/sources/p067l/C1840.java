package p067l;

import android.window.BackEvent;

/* JADX INFO: renamed from: l.᩶ۧ */
/* JADX INFO: compiled from: C9BS */
/* JADX INFO: loaded from: classes4.dex */
public final class C1840 {

    /* JADX INFO: renamed from: ֫ */
    public final float f67789;

    /* JADX INFO: renamed from: ۧ */
    public final int f67790;

    /* JADX INFO: renamed from: ܽ */
    public final float f67791;

    /* JADX INFO: renamed from: ᩳ */
    public final float f67792;

    public C1840(BackEvent backEvent) {
        C13045.m29867(backEvent, "backEvent");
        C1945 c1945 = C1945.f74863;
        float fM52236 = c1945.m52236(backEvent);
        float fM52237 = c1945.m52237(backEvent);
        float fM52233 = c1945.m52233(backEvent);
        int iM52235 = c1945.m52235(backEvent);
        this.f67791 = fM52236;
        this.f67792 = fM52237;
        this.f67789 = fM52233;
        this.f67790 = iM52235;
    }

    /* JADX INFO: renamed from: ܽ */
    public final float m48689() {
        return this.f67792;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m48687() {
        return this.f67789;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m48688() {
        return this.f67790;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f67791 + ", touchY=" + this.f67792 + ", progress=" + this.f67789 + ", swipeEdge=" + this.f67790 + '}';
    }
}
