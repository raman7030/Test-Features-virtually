package l;

/* JADX INFO: renamed from: l.֨ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: GAZW */
/* JADX INFO: loaded from: classes2.dex */
public final class C1277 extends AbstractC8333 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8333 f4494;

    public C1277(AbstractC8333 abstractC8333) {
        this.f4494 = abstractC8333;
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        if (obj == null) {
            c23525.m51981();
        } else {
            this.f4494.mo2845(c23525, obj);
        }
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        return this.f4494.mo2844(c17175);
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f4494 + "]";
    }
}
