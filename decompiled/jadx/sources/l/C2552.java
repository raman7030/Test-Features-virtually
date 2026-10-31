package l;

/* JADX INFO: renamed from: l.ۖ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C2552 extends AbstractC20151 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC20151 f8083;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC20151 f8084 = C0414.f1880;

    public C2552(AbstractC0434 abstractC0434) {
        this.f8083 = abstractC0434.f1919.values().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8084.hasNext() || this.f8083.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f8084.hasNext()) {
            this.f8084 = ((AbstractC22725) this.f8083.next()).iterator();
        }
        return this.f8084.next();
    }
}
