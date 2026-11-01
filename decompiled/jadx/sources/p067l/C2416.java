package p067l;

/* JADX INFO: renamed from: l.֡֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 16MO */
/* JADX INFO: loaded from: classes2.dex */
public final class C2416 implements InterfaceC8472 {
    @Override // p067l.InterfaceC8472
    /* JADX INFO: renamed from: ֫ */
    public final C21194 mo3345(InterfaceC24565 interfaceC24565, C11155 c11155, C6972 c6972) {
        if (interfaceC24565.mo31076() != null) {
            return m3344(interfaceC24565, c11155, interfaceC24565.mo31076(), interfaceC24565.mo31074());
        }
        String strMo31075 = interfaceC24565.mo31075();
        if (strMo31075 == null || strMo31075.isEmpty()) {
            strMo31075 = interfaceC24565.mo31077();
        }
        C5909 c5909 = (C5909) c6972.m15969(strMo31075);
        if (c5909 != null) {
            return m3344(interfaceC24565, c11155, c5909.m13285(), c5909.m13283());
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21194 m3344(InterfaceC24565 interfaceC24565, C11155 c11155, String str, String str2) {
        if (interfaceC24565.mo31073() != null && interfaceC24565.mo31073().m33421().equals("!")) {
            C21194 c21194 = new C21194(EnumC23205.WRAP, new C10603(str, str2), c11155.m25725());
            c21194.m47862();
            return c21194;
        }
        return new C21194(EnumC23205.WRAP, new C4568(str, str2), c11155.m25725());
    }
}
