package l;

/* JADX INFO: renamed from: l.᩸᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9QN */
/* JADX INFO: loaded from: classes.dex */
public final class C21781 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C1319 f69771 = new C1319();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15429 f69772;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9374 m49107(Class cls) {
        C8668.m22432(cls);
        InterfaceC6405 interfaceC6405Mo4611 = this.f69772.mo4611(cls);
        if (interfaceC6405Mo4611.mo17729()) {
            if (AbstractC21760.class.isAssignableFrom(cls)) {
                return C21223.m48177(C8668.m22441(), C9332.m24022(), interfaceC6405Mo4611.mo17730());
            }
            return C21223.m48177(C8668.m22429(), C9332.m24021(), interfaceC6405Mo4611.mo17730());
        }
        if (AbstractC21760.class.isAssignableFrom(cls)) {
            if (C8375.f25694[interfaceC6405Mo4611.mo17731().ordinal()] != 1) {
                return C14871.m35277(interfaceC6405Mo4611, C2878.m8804(), AbstractC0613.m2519(), C8668.m22441(), C9332.m24022(), C16988.m39819());
            }
            return C14871.m35277(interfaceC6405Mo4611, C2878.m8804(), AbstractC0613.m2519(), C8668.m22441(), null, C16988.m39819());
        }
        if (C8375.f25694[interfaceC6405Mo4611.mo17731().ordinal()] != 1) {
            return C14871.m35277(interfaceC6405Mo4611, C2878.m8803(), AbstractC0613.m2518(), C8668.m22429(), C9332.m24021(), C16988.m39818());
        }
        return C14871.m35277(interfaceC6405Mo4611, C2878.m8803(), AbstractC0613.m2518(), C8668.m22429(), null, C16988.m39818());
    }

    public C21781() {
        InterfaceC20517 interfaceC20517;
        C18938 c18938M43702 = C18938.m43702();
        try {
            int i = C19001.f59885;
            interfaceC20517 = (InterfaceC20517) C19001.class.getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC20517 = f69771;
        }
        C15429 c15429 = new C15429(c18938M43702, interfaceC20517);
        byte[] bArr = C13997.f41722;
        this.f69772 = c15429;
    }
}
