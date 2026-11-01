package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֨᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CAXH */
/* JADX INFO: loaded from: classes2.dex */
public final class C3656 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public final int f7679;

    /* JADX INFO: renamed from: ᩶ */
    public int f7680;

    /* JADX INFO: renamed from: ᩸ */
    public final int f7681;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f7682;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7682;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f7680;
        if (i == this.f7681) {
            if (!this.f7682) {
                throw new NoSuchElementException();
            }
            this.f7682 = false;
        } else {
            this.f7680 = this.f7679 + i;
        }
        return Character.valueOf((char) i);
    }

    public C3656(char c, int i) {
        this.f7679 = i;
        this.f7681 = c;
        boolean z = false;
        if (i <= 0 ? 1 >= c : 1 < c || 1 == c) {
            z = true;
        }
        this.f7682 = z;
        this.f7680 = z ? (char) 1 : c;
    }
}
