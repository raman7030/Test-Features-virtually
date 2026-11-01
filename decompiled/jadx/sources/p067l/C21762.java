package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩶᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CAXH */
/* JADX INFO: loaded from: classes4.dex */
public final class C21762 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public final int f68516;

    /* JADX INFO: renamed from: ᩶ */
    public int f68517;

    /* JADX INFO: renamed from: ᩸ */
    public final int f68518;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f68519;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f68519;
    }

    public final int nextInt() {
        int i = this.f68517;
        if (i == this.f68518) {
            if (!this.f68519) {
                throw new NoSuchElementException();
            }
            this.f68519 = false;
            return i;
        }
        this.f68517 = this.f68516 + i;
        return i;
    }

    public C21762(int i, int i2, int i3) {
        this.f68516 = i3;
        this.f68518 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f68519 = z;
        this.f68517 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }
}
