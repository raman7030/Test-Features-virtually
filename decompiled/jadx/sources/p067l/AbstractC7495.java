package p067l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۚܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82I3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7495 extends AbstractC3471 implements InterfaceC18223 {
    @Override // p067l.AbstractC4813, java.util.concurrent.Future
    public final Object get() {
        return m10163();
    }

    @Override // p067l.AbstractC4813, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return m10160(j, timeUnit);
    }

    @Override // p067l.AbstractC18894, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f10920 instanceof C24517;
    }
}
