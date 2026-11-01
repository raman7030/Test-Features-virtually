package p067l;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ܿ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4VB */
/* JADX INFO: loaded from: classes5.dex */
public final class C18875 extends AbstractC16192 {

    /* JADX INFO: renamed from: ۗ */
    public final transient int f56356;

    /* JADX INFO: renamed from: ۙ */
    public final transient int f56357;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ AbstractC16192 f56358;

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo21230() {
        return true;
    }

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

    public C18875(AbstractC16192 abstractC16192, int i, int i2) {
        this.f56358 = abstractC16192;
        this.f56356 = i;
        this.f56357 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f56357;
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܽ */
    public final Object[] mo26252() {
        return this.f56358.mo26252();
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ܿ */
    public final int mo26253() {
        return this.f56358.mo26253() + this.f56356;
    }

    @Override // p067l.AbstractC23966
    /* JADX INFO: renamed from: ᩳ */
    public final int mo26254() {
        return this.f56358.mo26253() + this.f56356 + this.f56357;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C6194.m14023(i, this.f56357);
        return this.f56358.get(i + this.f56356);
    }

    @Override // p067l.AbstractC16192, java.util.List
    public final AbstractC16192 subList(int i, int i2) {
        C6194.m14024(i, i2, this.f56357);
        int i3 = this.f56356;
        return this.f56358.subList(i + i3, i2 + i3);
    }

    @Override // p067l.AbstractC16192, p067l.AbstractC23966
    public Object writeReplace() {
        return super.writeReplace();
    }
}
