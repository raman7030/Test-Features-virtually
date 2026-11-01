package p067l;

/* JADX INFO: renamed from: l.֨ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: GAZW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3582 extends AbstractC10288 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC10288 f7268;

    public C3582(AbstractC10288 abstractC10288) {
        this.f7268 = abstractC10288;
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) {
        if (obj == null) {
            c24726.m54383();
        } else {
            this.f7268.mo5174(c24726, obj);
        }
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) {
        if (c18691.m42643() == EnumC16008.NULL) {
            c18691.m42639();
            return null;
        }
        return this.f7268.mo5173(c18691);
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f7268 + "]";
    }
}
