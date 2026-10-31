package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5XG */
/* JADX INFO: loaded from: classes3.dex */
public final class C13218 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12513 f39568;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f39569;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f39570;

    public C13218(C12513 c12513) {
        this.f39568 = c12513;
        long j = c12513.f31276;
        this.f39569 = j == 0 ? 0 : (int) (c12513.f31274 / j);
        this.f39570 = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f39570 < this.f39569;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f39570;
        this.f39570 = i + 1;
        C12513 c12513 = this.f39568;
        return new C3341(c12513.f31272, c12513, (int) ((((long) i) * c12513.f31276) + c12513.f31273));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
