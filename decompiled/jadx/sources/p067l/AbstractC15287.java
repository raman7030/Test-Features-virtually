package p067l;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܰۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15287 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C17930 f43612;

    /* JADX INFO: renamed from: ᩶ */
    public int f43613;

    /* JADX INFO: renamed from: ᩸ */
    public int f43614;

    /* JADX INFO: renamed from: ᩹ */
    public int f43615;

    /* JADX INFO: renamed from: ۧ */
    public abstract Object mo18265(int i);

    public AbstractC15287(C17930 c17930) {
        this.f43612 = c17930;
        this.f43615 = c17930.f53544;
        this.f43614 = c17930.isEmpty() ? -1 : 0;
        this.f43613 = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f43614 >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C17930 c17930 = this.f43612;
        if (c17930.f53544 == this.f43615) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f43614;
            this.f43613 = i;
            Object objMo18265 = mo18265(i);
            this.f43614 = c17930.m40781(this.f43614);
            return objMo18265;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C17930 c17930 = this.f43612;
        if (c17930.f53544 == this.f43615) {
            C6194.m14035("no calls to next() since the last call to remove()", this.f43613 >= 0);
            this.f43615 += 32;
            c17930.remove(C17930.m40760(c17930, this.f43613));
            this.f43614--;
            this.f43613 = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
