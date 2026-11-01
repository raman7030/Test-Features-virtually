package p067l;

import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.۬ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14799 extends AbstractC5568 implements InterfaceC10440 {
    @Override // p067l.InterfaceC7324
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC11111.m25624z(this, consumer);
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC7324 mo3497j(long j, long j2, IntFunction intFunction) {
        return AbstractC11111.m25588C(this, j, j2);
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo3498k(Object[] objArr, int i) {
        AbstractC11111.m25621w(this, (Double[]) objArr, i);
    }

    @Override // p067l.InterfaceC24758
    public final Object newArray(int i) {
        return new double[i];
    }

    @Override // p067l.InterfaceC7324
    public final InterfaceC3437 spliterator() {
        return new C13534(this);
    }

    @Override // p067l.InterfaceC7324
    public final InterfaceC16847 spliterator() {
        return new C13534(this);
    }
}
