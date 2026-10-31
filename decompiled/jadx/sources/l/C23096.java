package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5VI */
/* JADX INFO: loaded from: classes.dex */
public final class C23096 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13923 f74306;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f74307;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f74308;

    public C23096(C13923 c13923) {
        this.f74306 = c13923;
        long j = c13923.f31276;
        this.f74307 = j == 0 ? 0 : (int) (c13923.f31274 / j);
        this.f74308 = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f74308 < this.f74307;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f74308;
        this.f74308 = i + 1;
        return this.f74306.m33359(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
