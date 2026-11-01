package p067l;

import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܽᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18348 extends AbstractC15884 {
    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: j */
    public final InterfaceC7324 mo3497j(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == this.f45985c) {
            return this;
        }
        long jCount = this.f45983a.count();
        if (j >= jCount) {
            return this.f45984b.mo3497j(j - jCount, j2 - jCount, intFunction);
        }
        if (j2 > jCount) {
            return AbstractC11111.m25597L(EnumC10521.REFERENCE, this.f45983a.mo3497j(j, jCount, intFunction), this.f45984b.mo3497j(0L, j2 - jCount, intFunction));
        }
        return this.f45983a.mo3497j(j, j2, intFunction);
    }

    @Override // p067l.InterfaceC7324
    public final InterfaceC16847 spliterator() {
        return new C24602(this);
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: k */
    public final void mo3498k(Object[] objArr, int i) {
        C12826.requireNonNull(objArr);
        InterfaceC7324 interfaceC7324 = this.f45983a;
        interfaceC7324.mo3498k(objArr, i);
        this.f45984b.mo3498k(objArr, i + ((int) interfaceC7324.count()));
    }

    @Override // p067l.InterfaceC7324
    /* JADX INFO: renamed from: m */
    public final Object[] mo3499m(IntFunction intFunction) {
        long j = this.f45985c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        mo3498k(objArr, 0);
        return objArr;
    }

    @Override // p067l.InterfaceC7324
    public final void forEach(Consumer consumer) {
        this.f45983a.forEach(consumer);
        this.f45984b.forEach(consumer);
    }

    public final String toString() {
        long j = this.f45985c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.f45983a, this.f45984b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
