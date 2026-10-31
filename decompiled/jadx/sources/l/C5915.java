package l;

/* JADX INFO: renamed from: l.ۛ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C5915 extends AbstractC22848 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f18151;

    public C5915(Iterable iterable) {
        this.f18151 = AbstractC14545.m34730(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC22848
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16646 mo16574() {
        AbstractC4628 abstractC4628ListIterator = this.f18151.listIterator(0);
        while (abstractC4628ListIterator.hasNext()) {
            if (((Boolean) ((C7326) abstractC4628ListIterator.next()).f22515.orElse(Boolean.FALSE)).booleanValue()) {
                return C16646.of(Boolean.TRUE);
            }
        }
        return C16646.empty();
    }

    @Override // l.AbstractC22848
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC22848 mo16575(AbstractC22848 abstractC22848) {
        if (!(abstractC22848 instanceof C5915)) {
            return abstractC22848;
        }
        return new C5915(C8882.m22948(this.f18151, ((C5915) abstractC22848).f18151));
    }
}
