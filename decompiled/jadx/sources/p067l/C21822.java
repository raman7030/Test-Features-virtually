package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩶᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AN3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21822 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public final Object[] f68657;

    /* JADX INFO: renamed from: ᩹ */
    public int f68658;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C21822(Object[] objArr) {
        this.f68657 = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f68658 < this.f68657.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f68657;
            int i = this.f68658;
            this.f68658 = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f68658--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
