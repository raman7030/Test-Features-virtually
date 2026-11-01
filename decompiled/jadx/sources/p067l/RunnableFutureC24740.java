package p067l;

import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: l.᩻ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableFutureC24740 extends AbstractFutureC10659 implements RunnableFuture {
    public static final long serialVersionUID = 5232453952276885070L;

    /* JADX INFO: renamed from: ۛ */
    public final Runnable f78336;

    /* JADX INFO: renamed from: ۤ */
    public Object f78337;

    public RunnableFutureC24740(Runnable runnable, Object obj) {
        runnable.getClass();
        this.f78336 = runnable;
        this.f78337 = obj;
    }

    @Override // p067l.AbstractFutureC10659
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo14731() {
        return this.f78337;
    }

    @Override // p067l.AbstractFutureC10659
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo14730() {
        this.f78336.run();
        return true;
    }

    public final String toString() {
        return super.toString() + "[Wrapped task = " + this.f78336 + "]";
    }
}
