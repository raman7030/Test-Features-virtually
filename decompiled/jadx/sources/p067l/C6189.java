package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A41S */
/* JADX INFO: loaded from: classes2.dex */
public final class C6189 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public C4848 f15570;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f15570.isEmpty();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f15570.isEmpty()) {
            throw new NoSuchElementException();
        }
        C4848 c4848 = this.f15570;
        Object obj = c4848.f11034;
        this.f15570 = c4848.f11035;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
