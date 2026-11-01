package p067l;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: l.ܳۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableFutureC16022 extends AbstractFutureC10659 implements RunnableFuture {
    public static final long serialVersionUID = 2838392045355241008L;

    /* JADX INFO: renamed from: ۛ */
    public Object f46396;

    /* JADX INFO: renamed from: ۤ */
    public final Callable f46397;

    public RunnableFutureC16022(Callable callable) {
        callable.getClass();
        this.f46397 = callable;
    }

    @Override // p067l.AbstractFutureC10659
    /* JADX INFO: renamed from: ᩳ */
    public final Object mo14731() {
        return this.f46396;
    }

    @Override // p067l.AbstractFutureC10659
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo14730() {
        try {
            this.f46396 = this.f46397.call();
            return true;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String toString() {
        return super.toString() + "[Wrapped task = " + this.f46397 + "]";
    }
}
