package l;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܿܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17484 implements Iterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23834 f53423;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14661 f53424;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f53425;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14661 f53426 = null;

    public AbstractC17484(C23834 c23834) {
        this.f53423 = c23834;
        this.f53424 = c23834.f77119.f44804;
        this.f53425 = c23834.f77122;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f53424 != this.f53423.f77119;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14661 m40876() {
        C14661 c14661 = this.f53424;
        C23834 c23834 = this.f53423;
        if (c14661 == c23834.f77119) {
            throw new NoSuchElementException();
        }
        if (c23834.f77122 != this.f53425) {
            throw new ConcurrentModificationException();
        }
        this.f53424 = c14661.f44804;
        this.f53426 = c14661;
        return c14661;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C14661 c14661 = this.f53426;
        if (c14661 == null) {
            throw new IllegalStateException();
        }
        C23834 c23834 = this.f53423;
        c23834.m52530(c14661, true);
        this.f53426 = null;
        this.f53425 = c23834.f77122;
    }

    @Override // java.util.Iterator
    public Object next() {
        return m40876();
    }
}
