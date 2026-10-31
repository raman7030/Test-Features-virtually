package l;

import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: l.ۜۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableFutureC6606 extends AbstractFutureC8723 implements RunnableFuture {
    public static final long serialVersionUID = 5232453952276885070L;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Runnable f20341;

    @Override // l.AbstractFutureC8723
    /* JADX INFO: renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ Object mo12867() {
        return null;
    }

    public RunnableFutureC6606(Runnable runnable) {
        this.f20341 = runnable;
    }

    @Override // l.AbstractFutureC8723
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo12866() {
        this.f20341.run();
        return true;
    }

    public final String toString() {
        return super.toString() + "[Wrapped task = " + this.f20341 + "]";
    }
}
