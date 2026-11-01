package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5VI */
/* JADX INFO: loaded from: classes.dex */
public final class C24319 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C15601 f77052;

    /* JADX INFO: renamed from: ᩸ */
    public final int f77053;

    /* JADX INFO: renamed from: ᩹ */
    public int f77054;

    public C24319(C15601 c15601) {
        this.f77052 = c15601;
        long j = c15601.f34241;
        this.f77053 = j == 0 ? 0 : (int) (c15601.f34239 / j);
        this.f77054 = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f77054 < this.f77053;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f77054;
        this.f77054 = i + 1;
        return this.f77052.m35478(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
