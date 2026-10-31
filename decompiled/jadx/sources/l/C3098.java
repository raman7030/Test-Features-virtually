package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۗ۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4CU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3098 implements InterfaceC23037 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17733 f9692;

    public C3098(InterfaceC17733 interfaceC17733) {
        this.f9692 = interfaceC17733;
    }

    @Override // l.InterfaceC23037
    /* JADX INFO: renamed from: ֫ */
    public final C18621 mo7384(C7855 c7855) {
        InterfaceC5508 interfaceC5508Mo17691;
        InterfaceC17733 interfaceC17733 = this.f9692;
        C18621 c18621Mo31019 = interfaceC17733 != null ? interfaceC17733.mo31019(c7855.m21045()) : null;
        C10154 c10154M29804 = new C12270(System.currentTimeMillis(), c7855.m21045(), c18621Mo31019).m29804();
        C8743 c8743 = c10154M29804.f30536;
        C18621 c18621 = c10154M29804.f30535;
        if (interfaceC17733 != null) {
            interfaceC17733.mo31017(c10154M29804);
        }
        if (c18621Mo31019 != null && c18621 == null) {
            C20032.m46179(c18621Mo31019.m43170());
        }
        if (c8743 == null && c18621 == null) {
            C3804 c3804 = new C3804();
            c3804.m11479(c7855.m21045());
            c3804.m11482(EnumC14386.HTTP_1_1);
            c3804.m11475(504);
            c3804.m11486("Unsatisfiable Request (only-if-cached)");
            c3804.m11478(C20032.f64894);
            c3804.m11485(-1L);
            c3804.m11476(System.currentTimeMillis());
            return c3804.m11474();
        }
        if (c8743 == null) {
            C3804 c3804M43172 = c18621.m43172();
            c3804M43172.m11483(m9448(c18621));
            return c3804M43172.m11474();
        }
        try {
            C18621 c18621M21036 = c7855.m21036(c8743);
            if (c18621M21036 == null && c18621Mo31019 != null) {
                C20032.m46179(c18621Mo31019.m43170());
            }
            if (c18621 != null) {
                if (c18621M21036.m43177() == 304) {
                    C3804 c3804M43173 = c18621.m43172();
                    C10338 c10338M43180 = c18621.m43180();
                    C10338 c10338M43181 = c18621M21036.m43180();
                    C12454 c12454 = new C12454();
                    int iM26139 = c10338M43180.m26139();
                    for (int i = 0; i < iM26139; i++) {
                        String strM26136 = c10338M43180.m26136(i);
                        String strM26140 = c10338M43180.m26140(i);
                        if ((!"Warning".equalsIgnoreCase(strM26136) || !strM26140.startsWith("1")) && ("Content-Length".equalsIgnoreCase(strM26136) || "Content-Encoding".equalsIgnoreCase(strM26136) || "Content-Type".equalsIgnoreCase(strM26136) || !m9449(strM26136) || c10338M43181.m26137(strM26136) == null)) {
                            AbstractC8037.f24775.mo21353(c12454, strM26136, strM26140);
                        }
                    }
                    int iM261310 = c10338M43181.m26139();
                    for (int i2 = 0; i2 < iM261310; i2++) {
                        String strM26137 = c10338M43181.m26136(i2);
                        if (!"Content-Length".equalsIgnoreCase(strM26137) && !"Content-Encoding".equalsIgnoreCase(strM26137) && !"Content-Type".equalsIgnoreCase(strM26137) && m9449(strM26137)) {
                            AbstractC8037.f24775.mo21353(c12454, strM26137, c10338M43181.m26140(i2));
                        }
                    }
                    c3804M43173.m11480(c12454.m30612());
                    c3804M43173.m11485(c18621M21036.m43175());
                    c3804M43173.m11476(c18621M21036.m43179());
                    c3804M43173.m11483(m9448(c18621));
                    c3804M43173.m11487(m9448(c18621M21036));
                    C18621 c18621M11474 = c3804M43173.m11474();
                    c18621M21036.m43170().close();
                    interfaceC17733.mo31015();
                    interfaceC17733.mo31018(c18621, c18621M11474);
                    return c18621M11474;
                }
                C20032.m46179(c18621.m43170());
            }
            C3804 c3804M43174 = c18621M21036.m43172();
            c3804M43174.m11483(m9448(c18621));
            c3804M43174.m11487(m9448(c18621M21036));
            C18621 c18621M11475 = c3804M43174.m11474();
            if (interfaceC17733 != null) {
                if (C0799.m3019(c18621M11475) && C10154.m25491(c8743, c18621M11475)) {
                    InterfaceC12975 interfaceC12975Mo31014 = interfaceC17733.mo31014(c18621M11475);
                    if (interfaceC12975Mo31014 != null && (interfaceC5508Mo17691 = interfaceC12975Mo31014.mo17691()) != null) {
                        C4509 c4509 = new C4509(c18621M11475.m43170().mo1616(), interfaceC12975Mo31014, C23852.m52568(interfaceC5508Mo17691));
                        String strM43169 = c18621M11475.m43169("Content-Type");
                        long jMo1615 = c18621M11475.m43170().mo1615();
                        C3804 c3804M43175 = c18621M11475.m43172();
                        c3804M43175.m11478(new C14910(strM43169, jMo1615, C23852.m52567(c4509)));
                        return c3804M43175.m11474();
                    }
                } else if (C3395.m10359(c8743.m22620())) {
                    try {
                        interfaceC17733.mo31016(c8743);
                    } catch (IOException unused) {
                    }
                }
            }
            return c18621M11475;
        } catch (Throwable th) {
            if (c18621Mo31019 != null) {
                C20032.m46179(c18621Mo31019.m43170());
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18621 m9448(C18621 c18621) {
        if (c18621 == null || c18621.m43170() == null) {
            return c18621;
        }
        C3804 c3804M43172 = c18621.m43172();
        c3804M43172.m11478((AbstractC0275) null);
        return c3804M43172.m11474();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m9449(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
