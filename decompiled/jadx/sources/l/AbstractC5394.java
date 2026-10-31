package l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۚܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 82I3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5394 extends AbstractC1160 implements InterfaceC16682 {
    @Override // l.AbstractC2572, java.util.concurrent.Future
    public final Object get() {
        return m8130();
    }

    @Override // l.AbstractC2572, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return m8127(j, timeUnit);
    }

    @Override // l.AbstractC17388, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8130 instanceof C23304;
    }
}
