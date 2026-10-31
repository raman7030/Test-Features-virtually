package l;

import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.֫ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1892 extends AbstractC9904 implements InterfaceC6103 {
    @Override // l.InterfaceC5214
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC9198.B(this, consumer);
    }

    @Override // l.AbstractC9904, l.InterfaceC5214
    public final /* synthetic */ InterfaceC5214 j(long j, long j2, IntFunction intFunction) {
        return AbstractC9198.E(this, j, j2);
    }

    @Override // l.AbstractC9904, l.InterfaceC5214
    public final /* bridge */ /* synthetic */ InterfaceC5214 a(int i) {
        a(i);
        throw null;
    }

    @Override // l.AbstractC9904, l.InterfaceC5214
    public final InterfaceC23558 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC5214
    public final /* synthetic */ void k(Object[] objArr, int i) {
        AbstractC9198.y(this, (Long[]) objArr, i);
    }

    @Override // l.InterfaceC23558
    public final /* bridge */ /* synthetic */ Object b() {
        return AbstractC9198.f;
    }

    @Override // l.InterfaceC5214
    public final /* bridge */ /* synthetic */ InterfaceC1124 spliterator() {
        return C22291.c;
    }

    @Override // l.InterfaceC5214
    public final /* bridge */ /* synthetic */ InterfaceC15234 spliterator() {
        return C22291.c;
    }
}
