package l;

import java.util.AbstractMap;

/* JADX INFO: renamed from: l.۟۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4NW */
/* JADX INFO: loaded from: classes4.dex */
public final class C7490 extends AbstractC14545 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1826 f23076;

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo19283() {
        return true;
    }

    public C7490(C1826 c1826) {
        this.f23076 = c1826;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C18054 c18054 = this.f23076.f6259;
        return new AbstractMap.SimpleImmutableEntry(c18054.f56264.f28541.get(i), c18054.f56263.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23076.f6259.size();
    }

    @Override // l.AbstractC14545, l.AbstractC22725
    public Object writeReplace() {
        return super.writeReplace();
    }
}
