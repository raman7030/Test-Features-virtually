package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩵᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5QL */
/* JADX INFO: loaded from: classes5.dex */
public final class C21060 extends AbstractC7648 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AbstractC2953 f66144;

    /* JADX INFO: renamed from: ᩸ */
    public Iterator f66145;

    /* JADX INFO: renamed from: ᩹ */
    public int f66146;

    public C21060(AbstractC2953 abstractC2953, int i, Iterator it) {
        this.f66144 = abstractC2953;
        this.f66146 = i - 1;
        this.f66145 = it;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f66145 == null) {
            try {
                this.f66145 = AbstractC2953.m4893(this.f66144, this.f66146 + 1);
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException();
            }
        }
        return this.f66145.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (this.f66145 == null) {
            try {
                this.f66145 = AbstractC2953.m4893(this.f66144, this.f66146 + 1);
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException();
            }
        }
        Object next = this.f66145.next();
        this.f66146++;
        return next;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f66146 >= 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f66146 + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        this.f66145 = null;
        try {
            AbstractC2953 abstractC2953 = this.f66144;
            int i = this.f66146;
            this.f66146 = i - 1;
            return AbstractC2953.m4893(abstractC2953, i).next();
        } catch (IndexOutOfBoundsException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f66146;
    }
}
