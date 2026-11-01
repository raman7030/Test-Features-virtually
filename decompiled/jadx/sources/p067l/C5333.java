package p067l;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۗ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5333 extends C6674 implements ListIterator {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AbstractC14050 f12545;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5333(AbstractC14050 abstractC14050, int i) {
        super(abstractC14050);
        this.f12545 = abstractC14050;
        int iMo16197 = abstractC14050.mo16197();
        if (i < 0 || i > iMo16197) {
            throw new IndexOutOfBoundsException(C19768.m44907("index: ", i, iMo16197, ", size: "));
        }
        m15193(i);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m15192() > 0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        m15193(m15192() - 1);
        return this.f12545.get(m15192());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m15192() - 1;
    }
}
