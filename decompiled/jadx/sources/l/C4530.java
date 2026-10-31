package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۙ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79A7 */
/* JADX INFO: loaded from: classes2.dex */
public class C4530 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f14391;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12291 f14392;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C4530(AbstractC12291 abstractC12291) {
        this.f14392 = abstractC12291;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m13304() {
        return this.f14391;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13305(int i) {
        this.f14391 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14391 < this.f14392.mo14300();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f14391;
        this.f14391 = i + 1;
        return this.f14392.get(i);
    }

    public int nextIndex() {
        return m13304();
    }
}
