package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 7428 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7460 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C1755 f22890;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22890.f6076 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            C1755 c1755 = this.f22890;
            this.f22890 = c1755.f6076;
            return c1755;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
