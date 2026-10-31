package l;

import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.۬ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13079 extends AbstractC3366 implements InterfaceC8492 {
    @Override // l.InterfaceC5214
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC9198.z(this, consumer);
    }

    @Override // l.InterfaceC5214
    public final /* synthetic */ InterfaceC5214 j(long j, long j2, IntFunction intFunction) {
        return AbstractC9198.C(this, j, j2);
    }

    @Override // l.InterfaceC5214
    public final /* synthetic */ void k(Object[] objArr, int i) {
        AbstractC9198.w(this, (Double[]) objArr, i);
    }

    @Override // l.InterfaceC23558
    public final Object newArray(int i) {
        return new double[i];
    }

    @Override // l.InterfaceC5214
    public final InterfaceC1124 spliterator() {
        return new C11748(this);
    }

    @Override // l.InterfaceC5214
    public final InterfaceC15234 spliterator() {
        return new C11748(this);
    }
}
