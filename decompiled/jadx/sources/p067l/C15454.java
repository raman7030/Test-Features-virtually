package p067l;

import android.view.Choreographer;

/* JADX INFO: renamed from: l.ܰۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB4Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C15454 extends AbstractC13444 {

    /* JADX INFO: renamed from: ۧ */
    public final Choreographer f44147;

    /* JADX INFO: renamed from: ܽ */
    public final Choreographer.FrameCallback f44148;

    public C15454(C12103 c12103) {
        super(c12103);
        this.f44147 = Choreographer.getInstance();
        this.f44148 = new ChoreographerFrameCallbackC24172(this);
    }

    @Override // p067l.AbstractC13444
    /* JADX INFO: renamed from: ֫ */
    public final void mo30591() {
        this.f44147.postFrameCallback(this.f44148);
    }
}
