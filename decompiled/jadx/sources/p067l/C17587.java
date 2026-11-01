package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܺܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: L42O */
/* JADX INFO: loaded from: classes4.dex */
public final class C17587 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public C4848 f52577;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f52577.f11035 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C4848 c4848 = this.f52577;
        C4848 c4849 = c4848.f11035;
        if (c4849 == null) {
            throw new NoSuchElementException();
        }
        Object obj = c4848.f11034;
        this.f52577 = c4849;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
