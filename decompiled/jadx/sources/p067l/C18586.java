package p067l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܿۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes5.dex */
public final class C18586 extends AbstractC13594 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C11211 f55499;

    @Override // p067l.AbstractC13594, p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C10143.convert(spliterator());
    }

    public C18586(C11211 c11211) {
        this.f55499 = c11211;
    }

    @Override // p067l.InterfaceC13223
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo19003(long j) {
        return this.f55499.m25898(j) != -1;
    }

    @Override // p067l.AbstractC13594
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo30922(long j) {
        C11211 c11211 = this.f55499;
        int iM25898 = c11211.m25898(j);
        if (iM25898 == -1) {
            return false;
        }
        int i = (c11211.f31141 - iM25898) - 1;
        long[] jArr = c11211.f31145;
        int i2 = iM25898 + 1;
        System.arraycopy(jArr, i2, jArr, iM25898, i);
        Object[] objArr = c11211.f31140;
        System.arraycopy(objArr, i2, objArr, iM25898, i);
        int i3 = c11211.f31141 - 1;
        c11211.f31141 = i3;
        c11211.f31140[i3] = null;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C17915(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p067l.InterfaceC13223, p067l.InterfaceC18625, java.util.List
    public final InterfaceC24660 iterator() {
        return new C17915(this);
    }

    @Override // p067l.AbstractC13594, p067l.AbstractC23652, java.util.Collection, java.lang.Iterable, p067l.InterfaceC3456, p067l.InterfaceC21210, p067l.InterfaceC6477, java.util.Set, p067l.InterfaceC10814
    public final InterfaceC16847 spliterator() {
        return new C19257(this, 0, this.f55499.f31141);
    }

    @Override // p067l.AbstractC23652, p067l.InterfaceC18625
    public final void forEach(LongConsumer longConsumer) {
        C11211 c11211 = this.f55499;
        long[] jArr = c11211.f31145;
        int i = c11211.f31141;
        for (int i2 = 0; i2 < i; i2++) {
            longConsumer.accept(jArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f55499.f31141;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f55499.clear();
    }
}
