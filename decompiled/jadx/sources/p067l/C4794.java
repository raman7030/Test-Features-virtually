package p067l;

/* JADX INFO: renamed from: l.ۖ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4794 extends AbstractC21520 {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC21520 f10873;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC21520 f10874 = C2762.f4657;

    public C4794(AbstractC2781 abstractC2781) {
        this.f10873 = abstractC2781.f4695.values().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10874.hasNext() || this.f10873.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f10874.hasNext()) {
            this.f10874 = ((AbstractC23966) this.f10873.next()).iterator();
        }
        return this.f10874.next();
    }
}
