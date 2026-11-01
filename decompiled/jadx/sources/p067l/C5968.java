package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R4U5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5968 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public int f14770 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC20050 f14771;

    public C5968(AbstractC20050 abstractC20050) {
        this.f14771 = abstractC20050;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14770 < this.f14771.size();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f14770;
        this.f14770 = i + 1;
        return this.f14771.mo18930(i);
    }
}
