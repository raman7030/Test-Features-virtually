package p067l;

import java.net.ProtocolException;

/* JADX INFO: renamed from: l.ᩴ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L4FG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19892 implements InterfaceC24263 {
    @Override // p067l.InterfaceC24263
    /* JADX INFO: renamed from: ֫ */
    public final C20066 mo9467(C9833 c9833) throws ProtocolException {
        InterfaceC20563 interfaceC20563M23007 = c9833.m23007();
        C17208 c17208M23003 = c9833.m23003();
        C24585 c24585M23006 = c9833.m23006();
        C10678 c10678M23010 = c9833.m23010();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c9833.m23008().getClass();
        interfaceC20563M23007.mo30188(c10678M23010);
        c9833.m23008().getClass();
        C5984 c5984Mo30184 = null;
        if (C5595.m12397(c10678M23010.m24589()) && c10678M23010.m24585() != null) {
            if ("100-continue".equalsIgnoreCase(c10678M23010.m24584("Expect"))) {
                interfaceC20563M23007.mo30190();
                c9833.m23008().getClass();
                c5984Mo30184 = interfaceC20563M23007.mo30184(true);
            }
            if (c5984Mo30184 == null) {
                c9833.m23008().getClass();
                InterfaceC12257 interfaceC12257M54977 = C25037.m54977(new C5810(interfaceC20563M23007.mo30185(c10678M23010, c10678M23010.m24585().mo4352())));
                c10678M23010.m24585().mo4353(interfaceC12257M54977);
                interfaceC12257M54977.close();
                c9833.m23008().getClass();
            } else if (!c24585M23006.m54224()) {
                c17208M23003.m38978();
            }
        }
        interfaceC20563M23007.mo30187();
        if (c5984Mo30184 == null) {
            c9833.m23008().getClass();
            c5984Mo30184 = interfaceC20563M23007.mo30184(false);
        }
        c5984Mo30184.m13415(c10678M23010);
        c5984Mo30184.m13417(c17208M23003.m38977().m54223());
        c5984Mo30184.m13421(jCurrentTimeMillis);
        c5984Mo30184.m13412(System.currentTimeMillis());
        C20066 c20066M13410 = c5984Mo30184.m13410();
        int iM45443 = c20066M13410.m45443();
        if (iM45443 == 100) {
            C5984 c5984Mo30185 = interfaceC20563M23007.mo30184(false);
            c5984Mo30185.m13415(c10678M23010);
            c5984Mo30185.m13417(c17208M23003.m38977().m54223());
            c5984Mo30185.m13421(jCurrentTimeMillis);
            c5984Mo30185.m13412(System.currentTimeMillis());
            c20066M13410 = c5984Mo30185.m13410();
            iM45443 = c20066M13410.m45443();
        }
        c9833.m23008().getClass();
        C5984 c5984M45438 = c20066M13410.m45438();
        c5984M45438.m13414(interfaceC20563M23007.mo30186(c20066M13410));
        C20066 c20066M13411 = c5984M45438.m13410();
        if ("close".equalsIgnoreCase(c20066M13411.m45434().m24584("Connection")) || "close".equalsIgnoreCase(c20066M13411.m45435("Connection"))) {
            c17208M23003.m38978();
        }
        if ((iM45443 != 204 && iM45443 != 205) || c20066M13411.m45436().mo4015() <= 0) {
            return c20066M13411;
        }
        StringBuilder sbM34408 = C15033.m34408(iM45443, "HTTP ", " had non-zero Content-Length: ");
        sbM34408.append(c20066M13411.m45436().mo4015());
        throw new ProtocolException(sbM34408.toString());
    }
}
