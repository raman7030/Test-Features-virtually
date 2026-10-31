package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֨۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 2661 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0965 implements Iterator {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f3627;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f3628;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C18729 f3629;

    public AbstractC0965(C18729 c18729, int i) {
        this.f3629 = c18729;
        this.f3627 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3628 < this.f3627;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3628;
        if (i >= this.f3627) {
            throw new NoSuchElementException();
        }
        this.f3628 = i + 1;
        return ((C14370) this).f43313.f75598.m31424(this.f3629.m43368() - 1);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
