package p067l;

import android.content.Context;
import android.widget.OverScroller;

/* JADX INFO: renamed from: l.۠ۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 14SR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9919 {

    /* JADX INFO: renamed from: ֫ */
    public final OverScroller f27481;

    public C9919(Context context) {
        this.f27481 = new OverScroller(context);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m23211() {
        return this.f27481.computeScrollOffset();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23210(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f27481.fling(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m23212() {
        this.f27481.forceFinished(true);
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m23214() {
        return this.f27481.isFinished();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m23213() {
        return this.f27481.getCurrX();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m23215() {
        return this.f27481.getCurrY();
    }
}
