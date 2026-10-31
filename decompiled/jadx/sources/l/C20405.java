package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩶᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CAXH */
/* JADX INFO: loaded from: classes4.dex */
public final class C20405 implements Iterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f65840;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f65841;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f65842;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f65843;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f65843;
    }

    public final int nextInt() {
        int i = this.f65841;
        if (i == this.f65842) {
            if (!this.f65843) {
                throw new NoSuchElementException();
            }
            this.f65843 = false;
            return i;
        }
        this.f65841 = this.f65840 + i;
        return i;
    }

    public C20405(int i, int i2, int i3) {
        this.f65840 = i3;
        this.f65842 = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f65843 = z;
        this.f65841 = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }
}
