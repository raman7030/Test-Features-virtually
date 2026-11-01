package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05HO */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2980 extends AbstractC6767 {

    /* JADX INFO: renamed from: ᩸ */
    public int f5262;

    /* JADX INFO: renamed from: ᩹ */
    public final int f5263;

    /* JADX INFO: renamed from: ۧ */
    public abstract Object mo4334(int i);

    public AbstractC2980(int i, int i2) {
        C6194.m14032(i2, i);
        this.f5263 = i;
        this.f5262 = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f5262 < this.f5263;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f5262;
        this.f5262 = i + 1;
        return mo4334(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5262;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5262 > 0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f5262 - 1;
        this.f5262 = i;
        return mo4334(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5262 - 1;
    }
}
