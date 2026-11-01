package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֨۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 2661 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3285 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final int f6402;

    /* JADX INFO: renamed from: ᩸ */
    public int f6403;

    /* JADX INFO: renamed from: ᩹ */
    public final C20168 f6404;

    public AbstractC3285(C20168 c20168, int i) {
        this.f6404 = c20168;
        this.f6402 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6403 < this.f6402;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f6403;
        if (i >= this.f6402) {
            throw new NoSuchElementException();
        }
        this.f6403 = i + 1;
        return ((C16025) this).f46404.f78344.m33510(this.f6404.m45635() - 1);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
