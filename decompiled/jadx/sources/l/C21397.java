package l;

/* JADX INFO: renamed from: l.᩸ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5AZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21397 extends AbstractC6079 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final transient Object f68898;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo19283() {
        return false;
    }

    public C21397(Object obj) {
        obj.getClass();
        this.f68898 = obj;
    }

    @Override // l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f68898.equals(obj);
    }

    @Override // l.AbstractC6079, l.AbstractC22725
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC14545 mo16996() {
        return AbstractC14545.of(this.f68898);
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ֫ */
    public final int mo24235(int i, Object[] objArr) {
        objArr[i] = this.f68898;
        return i + 1;
    }

    @Override // l.AbstractC6079, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f68898.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f68898.toString() + ']';
    }

    @Override // l.AbstractC6079, l.AbstractC22725
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // l.AbstractC6079, l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC20151 iterator() {
        return new C20171(this.f68898);
    }
}
