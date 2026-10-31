package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05HO */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0643 extends AbstractC4628 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f2490;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f2491;

    /* JADX INFO: renamed from: ۧ */
    public abstract Object mo1942(int i);

    public AbstractC0643(int i, int i2) {
        C4025.m12112(i2, i);
        this.f2491 = i;
        this.f2490 = i2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f2490 < this.f2491;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f2490;
        this.f2490 = i + 1;
        return mo1942(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2490;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2490 > 0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f2490 - 1;
        this.f2490 = i;
        return mo1942(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2490 - 1;
    }
}
