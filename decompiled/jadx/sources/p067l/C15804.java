package p067l;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15804 {

    /* JADX INFO: renamed from: ۡ */
    public static final String f45727;

    /* JADX INFO: renamed from: ܺ */
    public static final String f45728;

    /* JADX INFO: renamed from: ֫ */
    public final int f45729;

    /* JADX INFO: renamed from: ۜ */
    public final long f45730;

    /* JADX INFO: renamed from: ۢ */
    public final C12194 f45731;

    /* JADX INFO: renamed from: ۧ */
    public final C14875 f45732;

    /* JADX INFO: renamed from: ܳ */
    public final String f45733;

    /* JADX INFO: renamed from: ܽ */
    public final String f45734;

    /* JADX INFO: renamed from: ܿ */
    public final long f45735;

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC16041 f45736;

    /* JADX INFO: renamed from: ᩷ */
    public final String f45737;

    /* JADX INFO: renamed from: ᩻ */
    public final C12194 f45738;

    /* JADX INFO: renamed from: ֫ */
    public final boolean m35880(C10678 c10678, C20066 c20066) {
        if (!this.f45737.equals(c10678.f29566.toString()) || !this.f45733.equals(c10678.f29569)) {
            return false;
        }
        int i = C3127.f5696;
        for (String str : C3127.m5331(c20066.f60965)) {
            if (!C21407.m48499(this.f45731.m28166(str), c10678.f29567.m28166(str))) {
                return false;
            }
        }
        return true;
    }

    static {
        C20304.m45846().getClass();
        f45728 = "OkHttp-Sent-Millis";
        C20304.m45846().getClass();
        f45727 = "OkHttp-Received-Millis";
    }

    public C15804(InterfaceC3579 interfaceC3579) throws IOException {
        EnumC3301 enumC3301M5749;
        try {
            InterfaceC8233 interfaceC8233M54976 = C25037.m54976(interfaceC3579);
            this.f45737 = interfaceC8233M54976.mo14205();
            this.f45733 = interfaceC8233M54976.mo14205();
            C14205 c14205 = new C14205();
            int iM22791 = C9770.m22791(interfaceC8233M54976);
            for (int i = 0; i < iM22791; i++) {
                c14205.m32678(interfaceC8233M54976.mo14205());
            }
            this.f45731 = new C12194(c14205);
            C23245 c23245M51791 = C23245.m51791(interfaceC8233M54976.mo14205());
            this.f45736 = c23245M51791.f73073;
            this.f45729 = c23245M51791.f73071;
            this.f45734 = c23245M51791.f73072;
            C14205 c14206 = new C14205();
            int iM22792 = C9770.m22791(interfaceC8233M54976);
            for (int i2 = 0; i2 < iM22792; i2++) {
                c14206.m32678(interfaceC8233M54976.mo14205());
            }
            String str = f45728;
            String strM32680 = c14206.m32680(str);
            String str2 = f45727;
            String strM32681 = c14206.m32680(str2);
            c14206.m32682(str);
            c14206.m32682(str2);
            this.f45730 = strM32680 != null ? Long.parseLong(strM32680) : 0L;
            this.f45735 = strM32681 != null ? Long.parseLong(strM32681) : 0L;
            this.f45738 = new C12194(c14206);
            if (this.f45737.startsWith("https://")) {
                String strMo14205 = interfaceC8233M54976.mo14205();
                if (strMo14205.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strMo14205 + "\"");
                }
                C22253 c22253M50079 = C22253.m50079(interfaceC8233M54976.mo14205());
                List listM35876 = m35876(interfaceC8233M54976);
                List listM35877 = m35876(interfaceC8233M54976);
                if (!interfaceC8233M54976.mo14213()) {
                    enumC3301M5749 = EnumC3301.m5749(interfaceC8233M54976.mo14205());
                } else {
                    enumC3301M5749 = EnumC3301.SSL_3_0;
                }
                this.f45732 = C14875.m33983(enumC3301M5749, c22253M50079, listM35876, listM35877);
            } else {
                this.f45732 = null;
            }
            interfaceC3579.close();
        } catch (Throwable th) {
            interfaceC3579.close();
            throw th;
        }
    }

    public C15804(C20066 c20066) {
        C12194 c12194;
        C10678 c10678 = c20066.f60966;
        this.f45737 = c10678.f29566.toString();
        int i = C3127.f5696;
        C12194 c12195 = c20066.f60962.f60966.f29567;
        C12194 c12196 = c20066.f60965;
        Set setM5331 = C3127.m5331(c12196);
        if (!setM5331.isEmpty()) {
            C14205 c14205 = new C14205();
            int iM28164 = c12195.m28164();
            for (int i2 = 0; i2 < iM28164; i2++) {
                String strM28161 = c12195.m28161(i2);
                if (setM5331.contains(strM28161)) {
                    c14205.m32679(strM28161, c12195.m28165(i2));
                }
            }
            c12194 = new C12194(c14205);
        } else {
            c12194 = new C12194(new C14205());
        }
        this.f45731 = c12194;
        this.f45733 = c10678.f29569;
        this.f45736 = c20066.f60963;
        this.f45729 = c20066.f60959;
        this.f45734 = c20066.f60964;
        this.f45738 = c12196;
        this.f45732 = c20066.f60958;
        this.f45730 = c20066.f60961;
        this.f45735 = c20066.f60970;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35879(C15370 c15370) {
        InterfaceC12257 interfaceC12257M54977 = C25037.m54977(c15370.m35032(0));
        String str = this.f45737;
        interfaceC12257M54977.mo28280(str);
        interfaceC12257M54977.writeByte(10);
        interfaceC12257M54977.mo28280(this.f45733);
        interfaceC12257M54977.writeByte(10);
        C12194 c12194 = this.f45731;
        interfaceC12257M54977.mo28278(c12194.m28164());
        interfaceC12257M54977.writeByte(10);
        int iM28164 = c12194.m28164();
        for (int i = 0; i < iM28164; i++) {
            interfaceC12257M54977.mo28280(c12194.m28161(i));
            interfaceC12257M54977.mo28280(": ");
            interfaceC12257M54977.mo28280(c12194.m28165(i));
            interfaceC12257M54977.writeByte(10);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f45736 == EnumC16041.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f45729);
        String str2 = this.f45734;
        if (str2 != null) {
            sb.append(' ');
            sb.append(str2);
        }
        interfaceC12257M54977.mo28280(sb.toString());
        interfaceC12257M54977.writeByte(10);
        C12194 c12195 = this.f45738;
        interfaceC12257M54977.mo28278(c12195.m28164() + 2);
        interfaceC12257M54977.writeByte(10);
        int iM28165 = c12195.m28164();
        for (int i2 = 0; i2 < iM28165; i2++) {
            interfaceC12257M54977.mo28280(c12195.m28161(i2));
            interfaceC12257M54977.mo28280(": ");
            interfaceC12257M54977.mo28280(c12195.m28165(i2));
            interfaceC12257M54977.writeByte(10);
        }
        interfaceC12257M54977.mo28280(f45728);
        interfaceC12257M54977.mo28280(": ");
        interfaceC12257M54977.mo28278(this.f45730);
        interfaceC12257M54977.writeByte(10);
        interfaceC12257M54977.mo28280(f45727);
        interfaceC12257M54977.mo28280(": ");
        interfaceC12257M54977.mo28278(this.f45735);
        interfaceC12257M54977.writeByte(10);
        if (str.startsWith("https://")) {
            interfaceC12257M54977.writeByte(10);
            C14875 c14875 = this.f45732;
            interfaceC12257M54977.mo28280(c14875.m33984().f70363);
            interfaceC12257M54977.writeByte(10);
            m35877(interfaceC12257M54977, c14875.m33986());
            m35877(interfaceC12257M54977, c14875.m33985());
            interfaceC12257M54977.mo28280(c14875.m33987().m5750());
            interfaceC12257M54977.writeByte(10);
        }
        interfaceC12257M54977.close();
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m35876(InterfaceC8233 interfaceC8233) throws IOException {
        int iM22791 = C9770.m22791(interfaceC8233);
        if (iM22791 == -1) {
            return Collections.EMPTY_LIST;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iM22791);
            for (int i = 0; i < iM22791; i++) {
                String strMo14205 = interfaceC8233.mo14205();
                C14268 c14268 = new C14268();
                c14268.m32784(C13598.m30945(strMo14205));
                arrayList.add(certificateFactory.generateCertificate(c14268.mo14212()));
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35877(InterfaceC12257 interfaceC12257, List list) throws IOException {
        try {
            interfaceC12257.mo28278(list.size());
            interfaceC12257.writeByte(10);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                interfaceC12257.mo28280(C13598.m30946(((Certificate) list.get(i)).getEncoded()).mo4697());
                interfaceC12257.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20066 m35878(C3798 c3798) {
        C12194 c12194 = this.f45738;
        String strM28162 = c12194.m28162("Content-Type");
        String strM28163 = c12194.m28162("Content-Length");
        C11349 c11349 = new C11349();
        c11349.m26292(this.f45737);
        c11349.m26287(this.f45733, (AbstractC4643) null);
        c11349.f31600 = this.f45731.m28163();
        C10678 c10678M26284 = c11349.m26284();
        C5984 c5984 = new C5984();
        c5984.f14801 = c10678M26284;
        c5984.f14809 = this.f45736;
        c5984.f14806 = this.f45729;
        c5984.f14804 = this.f45734;
        c5984.f14807 = c12194.m28163();
        c5984.f14799 = new C24522(c3798, strM28162, strM28163);
        c5984.f14808 = this.f45732;
        c5984.f14805 = this.f45730;
        c5984.f14802 = this.f45735;
        return c5984.m13410();
    }
}
