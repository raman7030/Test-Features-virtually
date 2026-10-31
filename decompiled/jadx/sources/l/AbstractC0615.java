package l;

import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5QL */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0615 extends AbstractSequentialList {
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public abstract Iterator iterator();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Iterator m2537(AbstractC0615 abstractC0615, int i) {
        if (i < 0) {
            throw new NoSuchElementException();
        }
        Iterator it = abstractC0615.iterator();
        for (int i2 = 0; i2 < i; i2++) {
            it.next();
        }
        return it;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        try {
            if (i < 0) {
                throw new NoSuchElementException();
            }
            Iterator it = iterator();
            for (int i2 = 0; i2 < i; i2++) {
                it.next();
            }
            return new C19667(this, i, it);
        } catch (NoSuchElementException unused) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }
}
