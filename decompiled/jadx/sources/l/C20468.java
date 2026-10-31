package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩶᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AN3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20468 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object[] f65980;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f65981;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C20468(Object[] objArr) {
        this.f65980 = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f65981 < this.f65980.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f65980;
            int i = this.f65981;
            this.f65981 = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f65981--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
