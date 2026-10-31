package l;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܿۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: GQL */
/* JADX INFO: loaded from: classes5.dex */
public final class C17064 extends AbstractC11811 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9304 f52317;

    @Override // l.AbstractC11811, l.AbstractC22394, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C17064(C9304 c9304) {
        this.f52317 = c9304;
    }

    @Override // l.InterfaceC11421
    /* JADX INFO: renamed from: ۢ */
    public final boolean mo17071(long j) {
        return this.f52317.m23889(j) != -1;
    }

    @Override // l.AbstractC11811
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28873(long j) {
        C9304 c9304 = this.f52317;
        int iM23889 = c9304.m23889(j);
        if (iM23889 == -1) {
            return false;
        }
        int i = (c9304.f28192 - iM23889) - 1;
        long[] jArr = c9304.f28196;
        int i2 = iM23889 + 1;
        System.arraycopy(jArr, i2, jArr, iM23889, i);
        Object[] objArr = c9304.f28191;
        System.arraycopy(objArr, i2, objArr, iM23889, i);
        int i3 = c9304.f28192 - 1;
        c9304.f28192 = i3;
        c9304.f28191[i3] = null;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C16358(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, l.InterfaceC11421, l.InterfaceC17105, java.util.List
    public final InterfaceC23455 iterator() {
        return new C16358(this);
    }

    @Override // l.AbstractC11811, l.AbstractC22394, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC15234 spliterator() {
        return new C17770(this, 0, this.f52317.f28192);
    }

    @Override // l.AbstractC22394, l.InterfaceC17105
    public final void forEach(LongConsumer longConsumer) {
        C9304 c9304 = this.f52317;
        long[] jArr = c9304.f28196;
        int i = c9304.f28192;
        for (int i2 = 0; i2 < i; i2++) {
            longConsumer.accept(jArr[i2]);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f52317.f28192;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f52317.clear();
    }
}
