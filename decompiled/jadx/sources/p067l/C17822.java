package p067l;

/* JADX INFO: renamed from: l.ܺ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes4.dex */
public final class C17822 extends AbstractC10288 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C5083 f53183;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ Class f53184;

    public C17822(C5083 c5083, Class cls) {
        this.f53183 = c5083;
        this.f53184 = cls;
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) {
        this.f53183.f11914.mo5174(c24726, obj);
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) {
        Object objMo5173 = this.f53183.f11914.mo5173(c18691);
        if (objMo5173 != null) {
            Class cls = this.f53184;
            if (!cls.isInstance(objMo5173)) {
                throw new C16322("Expected a " + cls.getName() + " but was " + objMo5173.getClass().getName() + "; at path " + c18691.m42638());
            }
        }
        return objMo5173;
    }
}
