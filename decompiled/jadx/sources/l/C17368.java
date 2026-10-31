package l;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ܿ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4VB */
/* JADX INFO: loaded from: classes5.dex */
public final class C17368 extends AbstractC14545 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final transient int f53172;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final transient int f53173;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC14545 f53174;

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo19283() {
        return true;
    }

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

    public C17368(AbstractC14545 abstractC14545, int i, int i2) {
        this.f53174 = abstractC14545;
        this.f53172 = i;
        this.f53173 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f53173;
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܽ */
    public final Object[] mo24242() {
        return this.f53174.mo24242();
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܿ */
    public final int mo24243() {
        return this.f53174.mo24243() + this.f53172;
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ᩳ */
    public final int mo24244() {
        return this.f53174.mo24243() + this.f53172 + this.f53173;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C4025.m12103(i, this.f53173);
        return this.f53174.get(i + this.f53172);
    }

    @Override // l.AbstractC14545, java.util.List
    public final AbstractC14545 subList(int i, int i2) {
        C4025.m12104(i, i2, this.f53173);
        int i3 = this.f53172;
        return this.f53174.subList(i + i3, i2 + i3);
    }

    @Override // l.AbstractC14545, l.AbstractC22725
    public Object writeReplace() {
        return super.writeReplace();
    }
}
