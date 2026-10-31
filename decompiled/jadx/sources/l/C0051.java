package l;

/* JADX INFO: renamed from: l.֡֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 16MO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0051 implements InterfaceC6423 {
    @Override // l.InterfaceC6423
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19809 mo950(InterfaceC23356 interfaceC23356, C9246 c9246, C4844 c4844) {
        if (interfaceC23356.mo29024() != null) {
            return m949(interfaceC23356, c9246, interfaceC23356.mo29024(), interfaceC23356.mo29022());
        }
        String strMo29023 = interfaceC23356.mo29023();
        if (strMo29023 == null || strMo29023.isEmpty()) {
            strMo29023 = interfaceC23356.mo29025();
        }
        C3726 c3726 = (C3726) c4844.m14089(strMo29023);
        if (c3726 != null) {
            return m949(interfaceC23356, c9246, c3726.m11333(), c3726.m11331());
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19809 m949(InterfaceC23356 interfaceC23356, C9246 c9246, String str, String str2) {
        if (interfaceC23356.mo29021() != null && interfaceC23356.mo29021().m31335().equals("!")) {
            C19809 c19809 = new C19809(EnumC21925.WRAP, new C8665(str, str2), c9246.m23724());
            c19809.m45551();
            return c19809;
        }
        return new C19809(EnumC21925.WRAP, new C2315(str, str2), c9246.m23724());
    }
}
