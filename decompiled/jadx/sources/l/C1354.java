package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֨᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CAXH */
/* JADX INFO: loaded from: classes2.dex */
public final class C1354 implements Iterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f4907;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f4908;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f4909;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f4910;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4910;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f4908;
        if (i == this.f4909) {
            if (!this.f4910) {
                throw new NoSuchElementException();
            }
            this.f4910 = false;
        } else {
            this.f4908 = this.f4907 + i;
        }
        return Character.valueOf((char) i);
    }

    public C1354(char c, int i) {
        this.f4907 = i;
        this.f4909 = c;
        boolean z = false;
        if (i <= 0 ? 1 >= c : 1 < c || 1 == c) {
            z = true;
        }
        this.f4910 = z;
        this.f4908 = z ? (char) 1 : c;
    }
}
