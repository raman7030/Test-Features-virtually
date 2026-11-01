package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 7428 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9458 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public C4036 f25803;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25803.f8852 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            C4036 c4036 = this.f25803;
            this.f25803 = c4036.f8852;
            return c4036;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
