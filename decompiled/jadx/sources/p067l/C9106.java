package p067l;

/* JADX INFO: renamed from: l.ۜ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public final class C9106 implements InterfaceC16992 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Class f24671;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC10288 f24672;

    public C9106(Class cls, AbstractC10288 abstractC10288) {
        this.f24671 = cls;
        this.f24672 = abstractC10288;
    }

    @Override // p067l.InterfaceC16992
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10288 mo10810(C14271 c14271, C18020 c18020) {
        if (c18020.m41004() == this.f24671) {
            return this.f24672;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f24671.getName() + ",adapter=" + this.f24672 + "]";
    }
}
