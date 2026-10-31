package l;

import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: l.᩻ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableFutureC23539 extends AbstractFutureC8723 implements RunnableFuture {
    public static final long serialVersionUID = 5232453952276885070L;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Runnable f75590;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Object f75591;

    public RunnableFutureC23539(Runnable runnable, Object obj) {
        runnable.getClass();
        this.f75590 = runnable;
        this.f75591 = obj;
    }

    @Override // l.AbstractFutureC8723
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo12867() {
        return this.f75591;
    }

    @Override // l.AbstractFutureC8723
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo12866() {
        this.f75590.run();
        return true;
    }

    public final String toString() {
        return super.toString() + "[Wrapped task = " + this.f75590 + "]";
    }
}
