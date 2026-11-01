package p067l;

/* JADX INFO: renamed from: l.ۖ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes2.dex */
public final class C5083 implements InterfaceC16992 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Class f11913;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC10288 f11914;

    public C5083(Class cls, AbstractC10288 abstractC10288) {
        this.f11913 = cls;
        this.f11914 = abstractC10288;
    }

    @Override // p067l.InterfaceC16992
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10288 mo10810(C14271 c14271, C18020 c18020) {
        Class<?> clsM41004 = c18020.m41004();
        if (this.f11913.isAssignableFrom(clsM41004)) {
            return new C17822(this, clsM41004);
        }
        return null;
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f11913.getName() + ",adapter=" + this.f11914 + "]";
    }
}
