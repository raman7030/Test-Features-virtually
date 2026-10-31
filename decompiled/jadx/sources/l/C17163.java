package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ܿۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17163 extends AbstractC6079 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final transient int f52573;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final transient Object[] f52574;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient int f52575;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final transient AbstractC9608 f52576;

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo19283() {
        return true;
    }

    public C17163(AbstractC9608 abstractC9608, Object[] objArr, int i, int i2) {
        this.f52576 = abstractC9608;
        this.f52574 = objArr;
        this.f52573 = i;
        this.f52575 = i2;
    }

    @Override // l.AbstractC6079, l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC20151 iterator() {
        return mo16996().listIterator(0);
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ֫ */
    public final int mo24235(int i, Object[] objArr) {
        return mo16996().mo24235(i, objArr);
    }

    @Override // l.AbstractC6079
    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC14545 mo6050() {
        return new C17869(this);
    }

    @Override // l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f52576.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f52575;
    }

    @Override // l.AbstractC6079, l.AbstractC22725
    public Object writeReplace() {
        return super.writeReplace();
    }
}
