package p067l;

import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֡᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5QL */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2953 extends AbstractSequentialList {
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public abstract Iterator iterator();

    /* JADX INFO: renamed from: ֫ */
    public static Iterator m4893(AbstractC2953 abstractC2953, int i) {
        if (i < 0) {
            throw new NoSuchElementException();
        }
        Iterator it = abstractC2953.iterator();
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
            return new C21060(this, i, it);
        } catch (NoSuchElementException unused) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }
}
