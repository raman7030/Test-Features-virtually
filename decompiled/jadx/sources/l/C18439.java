package l;

import java.net.ProtocolException;

/* JADX INFO: renamed from: l.ᩴ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L4FG */
/* JADX INFO: loaded from: classes5.dex */
public final class C18439 implements InterfaceC23037 {
    @Override // l.InterfaceC23037
    /* JADX INFO: renamed from: ֫ */
    public final C18621 mo7384(C7855 c7855) throws ProtocolException {
        InterfaceC19145 interfaceC19145M21042 = c7855.m21042();
        C15615 c15615M21038 = c7855.m21038();
        C23377 c23377M21041 = c7855.m21041();
        C8743 c8743M21045 = c7855.m21045();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c7855.m21043().getClass();
        interfaceC19145M21042.mo28144(c8743M21045);
        c7855.m21043().getClass();
        C3804 c3804Mo28140 = null;
        if (C3395.m10358(c8743M21045.m22620()) && c8743M21045.m22616() != null) {
            if ("100-continue".equalsIgnoreCase(c8743M21045.m22615("Expect"))) {
                interfaceC19145M21042.mo28146();
                c7855.m21043().getClass();
                c3804Mo28140 = interfaceC19145M21042.mo28140(true);
            }
            if (c3804Mo28140 == null) {
                c7855.m21043().getClass();
                InterfaceC10405 interfaceC10405M52568 = C23852.m52568(new C3622(interfaceC19145M21042.mo28141(c8743M21045, c8743M21045.m22616().mo1976())));
                c8743M21045.m22616().mo1977(interfaceC10405M52568);
                interfaceC10405M52568.close();
                c7855.m21043().getClass();
            } else if (!c23377M21041.m51827()) {
                c15615M21038.m36812();
            }
        }
        interfaceC19145M21042.mo28143();
        if (c3804Mo28140 == null) {
            c7855.m21043().getClass();
            c3804Mo28140 = interfaceC19145M21042.mo28140(false);
        }
        c3804Mo28140.m11479(c8743M21045);
        c3804Mo28140.m11481(c15615M21038.m36811().m51826());
        c3804Mo28140.m11485(jCurrentTimeMillis);
        c3804Mo28140.m11476(System.currentTimeMillis());
        C18621 c18621M11474 = c3804Mo28140.m11474();
        int iM43177 = c18621M11474.m43177();
        if (iM43177 == 100) {
            C3804 c3804Mo28141 = interfaceC19145M21042.mo28140(false);
            c3804Mo28141.m11479(c8743M21045);
            c3804Mo28141.m11481(c15615M21038.m36811().m51826());
            c3804Mo28141.m11485(jCurrentTimeMillis);
            c3804Mo28141.m11476(System.currentTimeMillis());
            c18621M11474 = c3804Mo28141.m11474();
            iM43177 = c18621M11474.m43177();
        }
        c7855.m21043().getClass();
        C3804 c3804M43172 = c18621M11474.m43172();
        c3804M43172.m11478(interfaceC19145M21042.mo28142(c18621M11474));
        C18621 c18621M11475 = c3804M43172.m11474();
        if ("close".equalsIgnoreCase(c18621M11475.m43168().m22615("Connection")) || "close".equalsIgnoreCase(c18621M11475.m43169("Connection"))) {
            c15615M21038.m36812();
        }
        if ((iM43177 != 204 && iM43177 != 205) || c18621M11475.m43170().mo1615() <= 0) {
            return c18621M11475;
        }
        StringBuilder sbM32308 = C13325.m32308(iM43177, "HTTP ", " had non-zero Content-Length: ");
        sbM32308.append(c18621M11475.m43170().mo1615());
        throw new ProtocolException(sbM32308.toString());
    }
}
