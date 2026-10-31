package l;

/* JADX INFO: renamed from: l.ܳۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6574 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14340 extends AbstractC6079 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC9608 f43241;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final transient AbstractC14545 f43242;

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo19283() {
        return true;
    }

    public C14340(AbstractC9608 abstractC9608, AbstractC14545 abstractC14545) {
        this.f43241 = abstractC9608;
        this.f43242 = abstractC14545;
    }

    @Override // l.AbstractC6079, l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC20151 iterator() {
        return this.f43242.listIterator(0);
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ֫ */
    public final int mo24235(int i, Object[] objArr) {
        return this.f43242.mo24235(i, objArr);
    }

    @Override // l.AbstractC6079, l.AbstractC22725
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC14545 mo16996() {
        return this.f43242;
    }

    @Override // l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f43241.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f43241.size();
    }

    @Override // l.AbstractC6079, l.AbstractC22725
    public Object writeReplace() {
        return super.writeReplace();
    }
}
