package p067l;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩸۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K60O */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC22732 implements ListIterator {

    /* JADX INFO: renamed from: ۗ */
    public final int f71691;

    /* JADX INFO: renamed from: ۙ */
    public final int f71692;

    /* JADX INFO: renamed from: ᩶ */
    public int f71693;

    /* JADX INFO: renamed from: ᩸ */
    public final C14645 f71694;

    /* JADX INFO: renamed from: ᩹ */
    public int f71695;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo3880(C20168 c20168, int i);

    public AbstractC22732(C14645 c14645, int i, int i2) {
        this.f71694 = c14645;
        this.f71691 = i;
        this.f71693 = i;
        this.f71692 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m50881() {
        return this.f71693;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f71695 < this.f71692;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (this.f71695 >= this.f71692) {
            throw new NoSuchElementException();
        }
        C20168 c20168M13859 = this.f71694.m33504().m13859(this.f71693);
        int i = this.f71695;
        this.f71695 = i + 1;
        Object objMo3880 = mo3880(c20168M13859, i);
        this.f71693 = c20168M13859.m45631();
        c20168M13859.m45626();
        return objMo3880;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f71695 > 0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f71695 - 1;
        C20168 c20168M13859 = this.f71694.m33504().m13859(this.f71691);
        this.f71695 = 0;
        while (true) {
            int i2 = this.f71695;
            if (i2 < i) {
                this.f71695 = i2 + 1;
                mo3880(c20168M13859, i2);
            } else {
                this.f71695 = i2 + 1;
                Object objMo3880 = mo3880(c20168M13859, i2);
                this.f71693 = c20168M13859.m45631();
                c20168M13859.m45626();
                return objMo3880;
            }
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f71695;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f71695 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }
}
