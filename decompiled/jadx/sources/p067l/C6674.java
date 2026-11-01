package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۙ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79A7 */
/* JADX INFO: loaded from: classes2.dex */
public class C6674 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public int f17222;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC14050 f17223;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C6674(AbstractC14050 abstractC14050) {
        this.f17223 = abstractC14050;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m15192() {
        return this.f17222;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m15193(int i) {
        this.f17222 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17222 < this.f17223.mo16197();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f17222;
        this.f17222 = i + 1;
        return this.f17223.get(i);
    }

    public int nextIndex() {
        return m15192();
    }
}
