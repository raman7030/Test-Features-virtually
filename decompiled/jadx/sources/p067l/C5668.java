package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۗ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CAXH */
/* JADX INFO: loaded from: classes2.dex */
public final class C5668 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public final long f13791;

    /* JADX INFO: renamed from: ᩶ */
    public long f13792;

    /* JADX INFO: renamed from: ᩸ */
    public final long f13793;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f13794;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13794;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.f13792;
        if (j == this.f13793) {
            if (!this.f13794) {
                throw new NoSuchElementException();
            }
            this.f13794 = false;
        } else {
            this.f13792 = this.f13791 + j;
        }
        return Long.valueOf(j);
    }

    public C5668(long j, long j2) {
        this.f13791 = j2;
        this.f13793 = j;
        boolean z = false;
        if (j2 <= 0 ? 1 >= j : 1 <= j) {
            z = true;
        }
        this.f13794 = z;
        this.f13792 = z ? 1L : j;
    }
}
