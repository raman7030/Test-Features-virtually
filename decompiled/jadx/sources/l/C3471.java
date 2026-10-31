package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۗ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CAXH */
/* JADX INFO: loaded from: classes2.dex */
public final class C3471 implements Iterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f10985;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f10986;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f10987;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f10988;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10988;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j = this.f10986;
        if (j == this.f10987) {
            if (!this.f10988) {
                throw new NoSuchElementException();
            }
            this.f10988 = false;
        } else {
            this.f10986 = this.f10985 + j;
        }
        return Long.valueOf(j);
    }

    public C3471(long j, long j2) {
        this.f10985 = j2;
        this.f10987 = j;
        boolean z = false;
        if (j2 <= 0 ? 1 >= j : 1 <= j) {
            z = true;
        }
        this.f10988 = z;
        this.f10986 = z ? 1L : j;
    }
}
