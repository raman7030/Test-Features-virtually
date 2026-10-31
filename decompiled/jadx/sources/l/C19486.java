package l;

/* JADX INFO: renamed from: l.᩵۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3PG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19486 extends AbstractC22725 {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final transient AbstractC0434 f62982;

    public C19486(AbstractC0434 abstractC0434) {
        this.f62982 = abstractC0434;
    }

    @Override // l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f62982.mo1989(obj);
    }

    @Override // l.AbstractC22725, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final AbstractC20151 iterator() {
        AbstractC0434 abstractC0434 = this.f62982;
        abstractC0434.getClass();
        return new C2552(abstractC0434);
    }

    @Override // l.AbstractC22725
    /* JADX INFO: renamed from: ֫ */
    public final int mo24235(int i, Object[] objArr) {
        AbstractC20151 it = this.f62982.f1919.values().iterator();
        while (it.hasNext()) {
            i = ((AbstractC22725) it.next()).mo24235(i, objArr);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f62982.f1918;
    }

    @Override // l.AbstractC22725
    public Object writeReplace() {
        return super.writeReplace();
    }
}
