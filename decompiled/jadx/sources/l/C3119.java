package l;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۗ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3119 extends C4530 implements ListIterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12291 f9742;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3119(AbstractC12291 abstractC12291, int i) {
        super(abstractC12291);
        this.f9742 = abstractC12291;
        int iMo14300 = abstractC12291.mo14300();
        if (i < 0 || i > iMo14300) {
            throw new IndexOutOfBoundsException(C18307.m42646("index: ", i, iMo14300, ", size: "));
        }
        m13305(i);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m13304() > 0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        m13305(m13304() - 1);
        return this.f9742.get(m13304());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m13304() - 1;
    }
}
