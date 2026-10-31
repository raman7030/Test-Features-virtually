package l;

import android.view.Choreographer;

/* JADX INFO: renamed from: l.ܰۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB4Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C13769 extends AbstractC11654 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Choreographer f41070;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Choreographer.FrameCallback f41071;

    public C13769(C10243 c10243) {
        super(c10243);
        this.f41070 = Choreographer.getInstance();
        this.f41071 = new ChoreographerFrameCallbackC22942(this);
    }

    @Override // l.AbstractC11654
    /* JADX INFO: renamed from: ֫ */
    public final void mo28543() {
        this.f41070.postFrameCallback(this.f41071);
    }
}
