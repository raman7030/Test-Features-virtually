package p067l;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ܽ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4VB */
/* JADX INFO: loaded from: classes5.dex */
public final class C18204 extends AbstractC16192 {

    /* JADX INFO: renamed from: ۙ */
    public final transient AbstractC16192 f54342;

    @Override // p067l.AbstractC16192, p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC16192, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p067l.AbstractC16192, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    public C18204(AbstractC16192 abstractC16192) {
        this.f54342 = abstractC16192;
    }

    @Override // p067l.AbstractC16192
    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC16192 mo36886() {
        return this.f54342;
    }

    @Override // p067l.AbstractC16192, p067l.AbstractC23966, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f54342.contains(obj);
    }

    @Override // p067l.AbstractC16192, java.util.List
    public final int indexOf(Object obj) {
        AbstractC16192 abstractC16192 = this.f54342;
        int iLastIndexOf = abstractC16192.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (abstractC16192.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // p067l.AbstractC16192, java.util.List
    public final int lastIndexOf(Object obj) {
        AbstractC16192 abstractC16192 = this.f54342;
        int iIndexOf = abstractC16192.indexOf(obj);
        if (iIndexOf >= 0) {
            return (abstractC16192.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC16192 abstractC16192 = this.f54342;
        C6194.m14023(i, abstractC16192.size());
        return abstractC16192.get((abstractC16192.size() - 1) - i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f54342.size();
    }

    @Override // p067l.AbstractC16192, java.util.List
    public final AbstractC16192 subList(int i, int i2) {
        AbstractC16192 abstractC16192 = this.f54342;
        C6194.m14024(i, i2, abstractC16192.size());
        return abstractC16192.subList(abstractC16192.size() - i2, abstractC16192.size() - i).mo36886();
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo21230() {
        return this.f54342.mo21230();
    }

    @Override // p067l.AbstractC16192, p067l.AbstractC23966
    public Object writeReplace() {
        return super.writeReplace();
    }
}
