package l;

import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ۢ᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9904 implements InterfaceC5214 {
    @Override // l.InterfaceC5214
    public final long count() {
        return 0L;
    }

    public final void e(int i, Object obj) {
    }

    public final void g(Object obj) {
    }

    @Override // l.InterfaceC5214
    public /* synthetic */ InterfaceC5214 j(long j, long j2, IntFunction intFunction) {
        return AbstractC9198.F(this, j, j2, intFunction);
    }

    @Override // l.InterfaceC5214
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // l.InterfaceC5214
    public InterfaceC5214 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC5214
    public final Object[] m(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }
}
