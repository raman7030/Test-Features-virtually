package p067l;

import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: l.ۜۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableFutureC8647 extends AbstractFutureC10659 implements RunnableFuture {
    public static final long serialVersionUID = 5232453952276885070L;

    /* JADX INFO: renamed from: ۤ */
    public final Runnable f23218;

    @Override // p067l.AbstractFutureC10659
    /* JADX INFO: renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ Object mo14731() {
        return null;
    }

    public RunnableFutureC8647(Runnable runnable) {
        this.f23218 = runnable;
    }

    @Override // p067l.AbstractFutureC10659
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo14730() {
        this.f23218.run();
        return true;
    }

    public final String toString() {
        return super.toString() + "[Wrapped task = " + this.f23218 + "]";
    }
}
