package l;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: l.ܳۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableFutureC14366 extends AbstractFutureC8723 implements RunnableFuture {
    public static final long serialVersionUID = 2838392045355241008L;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Object f43305;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Callable f43306;

    public RunnableFutureC14366(Callable callable) {
        callable.getClass();
        this.f43306 = callable;
    }

    @Override // l.AbstractFutureC8723
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo12867() {
        return this.f43305;
    }

    @Override // l.AbstractFutureC8723
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo12866() {
        try {
            this.f43305 = this.f43306.call();
            return true;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String toString() {
        return super.toString() + "[Wrapped task = " + this.f43306 + "]";
    }
}
