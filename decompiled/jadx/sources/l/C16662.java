package l;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ܽ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4VB */
/* JADX INFO: loaded from: classes5.dex */
public final class C16662 extends AbstractC14545 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC14545 f51160;

    @Override // l.AbstractC14545, l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC14545, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // l.AbstractC14545, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    public C16662(AbstractC14545 abstractC14545) {
        this.f51160 = abstractC14545;
    }

    @Override // l.AbstractC14545
    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC14545 mo34737() {
        return this.f51160;
    }

    @Override // l.AbstractC14545, l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f51160.contains(obj);
    }

    @Override // l.AbstractC14545, java.util.List
    public final int indexOf(Object obj) {
        AbstractC14545 abstractC14545 = this.f51160;
        int iLastIndexOf = abstractC14545.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (abstractC14545.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // l.AbstractC14545, java.util.List
    public final int lastIndexOf(Object obj) {
        AbstractC14545 abstractC14545 = this.f51160;
        int iIndexOf = abstractC14545.indexOf(obj);
        if (iIndexOf >= 0) {
            return (abstractC14545.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC14545 abstractC14545 = this.f51160;
        C4025.m12103(i, abstractC14545.size());
        return abstractC14545.get((abstractC14545.size() - 1) - i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f51160.size();
    }

    @Override // l.AbstractC14545, java.util.List
    public final AbstractC14545 subList(int i, int i2) {
        AbstractC14545 abstractC14545 = this.f51160;
        C4025.m12104(i, i2, abstractC14545.size());
        return abstractC14545.subList(abstractC14545.size() - i2, abstractC14545.size() - i).mo34737();
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo19283() {
        return this.f51160.mo19283();
    }

    @Override // l.AbstractC14545, l.AbstractC22725
    public Object writeReplace() {
        return super.writeReplace();
    }
}
