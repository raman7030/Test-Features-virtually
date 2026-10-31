package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩵᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5QL */
/* JADX INFO: loaded from: classes5.dex */
public final class C19667 extends AbstractC5555 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0615 f63522;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterator f63523;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f63524;

    public C19667(AbstractC0615 abstractC0615, int i, Iterator it) {
        this.f63522 = abstractC0615;
        this.f63524 = i - 1;
        this.f63523 = it;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f63523 == null) {
            try {
                this.f63523 = AbstractC0615.m2537(this.f63522, this.f63524 + 1);
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException();
            }
        }
        return this.f63523.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (this.f63523 == null) {
            try {
                this.f63523 = AbstractC0615.m2537(this.f63522, this.f63524 + 1);
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException();
            }
        }
        Object next = this.f63523.next();
        this.f63524++;
        return next;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f63524 >= 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f63524 + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        this.f63523 = null;
        try {
            AbstractC0615 abstractC0615 = this.f63522;
            int i = this.f63524;
            this.f63524 = i - 1;
            return AbstractC0615.m2537(abstractC0615, i).next();
        } catch (IndexOutOfBoundsException unused) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f63524;
    }
}
