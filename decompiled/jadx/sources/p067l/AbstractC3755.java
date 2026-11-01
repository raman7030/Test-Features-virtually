package p067l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֨᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3755 extends AbstractRunnableC6438 {

    /* JADX INFO: renamed from: ۛ */
    public FutureC5767 f7978;

    /* JADX INFO: renamed from: ۨ */
    public Executor f7979;

    /* JADX INFO: renamed from: ᩺ */
    public FutureC5767 f7980;

    public AbstractC3755(Executor executor, FutureC5767 futureC5767, FutureC5767 futureC5768) {
        this.f7979 = executor;
        this.f7978 = futureC5767;
        this.f7980 = futureC5768;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m7254() {
        Executor executor = this.f7979;
        if (m24523()) {
            if (executor == null) {
                return true;
            }
            this.f7979 = null;
            executor.execute(this);
        }
        return false;
    }

    @Override // p067l.AbstractRunnableC6438
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo7255() {
        return this.f7978 != null;
    }
}
