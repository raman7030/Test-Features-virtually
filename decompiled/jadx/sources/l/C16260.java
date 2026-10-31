package l;

/* JADX INFO: renamed from: l.ܺ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes4.dex */
public final class C16260 extends AbstractC8333 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2856 f50014;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Class f50015;

    public C16260(C2856 c2856, Class cls) {
        this.f50014 = c2856;
        this.f50015 = cls;
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        this.f50014.f9114.mo2845(c23525, obj);
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        Object objMo2844 = this.f50014.f9114.mo2844(c17175);
        if (objMo2844 != null) {
            Class cls = this.f50015;
            if (!cls.isInstance(objMo2844)) {
                throw new C14682("Expected a " + cls.getName() + " but was " + objMo2844.getClass().getName() + "; at path " + c17175.m40393());
            }
        }
        return objMo2844;
    }
}
