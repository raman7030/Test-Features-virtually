package l;

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
public final class C14136 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final String f42638;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final String f42639;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f42640;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f42641;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C10338 f42642;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13159 f42643;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f42644;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f42645;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f42646;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC14386 f42647;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f42648;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C10338 f42649;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33748(C8743 c8743, C18621 c18621) {
        if (!this.f42648.equals(c8743.f26640.toString()) || !this.f42644.equals(c8743.f26643)) {
            return false;
        }
        int i = C0799.f2925;
        for (String str : C0799.m3018(c18621.f57742)) {
            if (!C20032.m46183(this.f42642.m26141(str), c8743.f26641.m26141(str))) {
                return false;
            }
        }
        return true;
    }

    static {
        C18872.m43580().getClass();
        f42639 = "OkHttp-Sent-Millis";
        C18872.m43580().getClass();
        f42638 = "OkHttp-Received-Millis";
    }

    public C14136(InterfaceC1274 interfaceC1274) throws IOException {
        EnumC0981 enumC0981M3446;
        try {
            InterfaceC6171 interfaceC6171M52567 = C23852.m52567(interfaceC1274);
            this.f42648 = interfaceC6171M52567.mo12300();
            this.f42644 = interfaceC6171M52567.mo12300();
            C12454 c12454 = new C12454();
            int iM20810 = C7787.m20810(interfaceC6171M52567);
            for (int i = 0; i < iM20810; i++) {
                c12454.m30613(interfaceC6171M52567.mo12300());
            }
            this.f42642 = new C10338(c12454);
            C21967 c21967M49454 = C21967.m49454(interfaceC6171M52567.mo12300());
            this.f42647 = c21967M49454.f70362;
            this.f42640 = c21967M49454.f70360;
            this.f42645 = c21967M49454.f70361;
            C12454 c12455 = new C12454();
            int iM20811 = C7787.m20810(interfaceC6171M52567);
            for (int i2 = 0; i2 < iM20811; i2++) {
                c12455.m30613(interfaceC6171M52567.mo12300());
            }
            String str = f42639;
            String strM30615 = c12455.m30615(str);
            String str2 = f42638;
            String strM30616 = c12455.m30615(str2);
            c12455.m30617(str);
            c12455.m30617(str2);
            this.f42641 = strM30615 != null ? Long.parseLong(strM30615) : 0L;
            this.f42646 = strM30616 != null ? Long.parseLong(strM30616) : 0L;
            this.f42649 = new C10338(c12455);
            if (this.f42648.startsWith("https://")) {
                String strMo12300 = interfaceC6171M52567.mo12300();
                if (strMo12300.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strMo12300 + "\"");
                }
                C20922 c20922M47749 = C20922.m47749(interfaceC6171M52567.mo12300());
                List listM33744 = m33744(interfaceC6171M52567);
                List listM33745 = m33744(interfaceC6171M52567);
                if (!interfaceC6171M52567.mo12308()) {
                    enumC0981M3446 = EnumC0981.m3446(interfaceC6171M52567.mo12300());
                } else {
                    enumC0981M3446 = EnumC0981.SSL_3_0;
                }
                this.f42643 = C13159.m31887(enumC0981M3446, c20922M47749, listM33744, listM33745);
            } else {
                this.f42643 = null;
            }
            interfaceC1274.close();
        } catch (Throwable th) {
            interfaceC1274.close();
            throw th;
        }
    }

    public C14136(C18621 c18621) {
        C10338 c10338;
        C8743 c8743 = c18621.f57743;
        this.f42648 = c8743.f26640.toString();
        int i = C0799.f2925;
        C10338 c10339 = c18621.f57739.f57743.f26641;
        C10338 c103310 = c18621.f57742;
        Set setM3018 = C0799.m3018(c103310);
        if (!setM3018.isEmpty()) {
            C12454 c12454 = new C12454();
            int iM26139 = c10339.m26139();
            for (int i2 = 0; i2 < iM26139; i2++) {
                String strM26136 = c10339.m26136(i2);
                if (setM3018.contains(strM26136)) {
                    c12454.m30614(strM26136, c10339.m26140(i2));
                }
            }
            c10338 = new C10338(c12454);
        } else {
            c10338 = new C10338(new C12454());
        }
        this.f42642 = c10338;
        this.f42644 = c8743.f26643;
        this.f42647 = c18621.f57740;
        this.f42640 = c18621.f57736;
        this.f42645 = c18621.f57741;
        this.f42649 = c103310;
        this.f42643 = c18621.f57735;
        this.f42641 = c18621.f57738;
        this.f42646 = c18621.f57747;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33747(C13680 c13680) {
        InterfaceC10405 interfaceC10405M52568 = C23852.m52568(c13680.m32917(0));
        String str = this.f42648;
        interfaceC10405M52568.mo26251(str);
        interfaceC10405M52568.writeByte(10);
        interfaceC10405M52568.mo26251(this.f42644);
        interfaceC10405M52568.writeByte(10);
        C10338 c10338 = this.f42642;
        interfaceC10405M52568.mo26249(c10338.m26139());
        interfaceC10405M52568.writeByte(10);
        int iM26139 = c10338.m26139();
        for (int i = 0; i < iM26139; i++) {
            interfaceC10405M52568.mo26251(c10338.m26136(i));
            interfaceC10405M52568.mo26251(": ");
            interfaceC10405M52568.mo26251(c10338.m26140(i));
            interfaceC10405M52568.writeByte(10);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f42647 == EnumC14386.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f42640);
        String str2 = this.f42645;
        if (str2 != null) {
            sb.append(' ');
            sb.append(str2);
        }
        interfaceC10405M52568.mo26251(sb.toString());
        interfaceC10405M52568.writeByte(10);
        C10338 c10339 = this.f42649;
        interfaceC10405M52568.mo26249(c10339.m26139() + 2);
        interfaceC10405M52568.writeByte(10);
        int iM261310 = c10339.m26139();
        for (int i2 = 0; i2 < iM261310; i2++) {
            interfaceC10405M52568.mo26251(c10339.m26136(i2));
            interfaceC10405M52568.mo26251(": ");
            interfaceC10405M52568.mo26251(c10339.m26140(i2));
            interfaceC10405M52568.writeByte(10);
        }
        interfaceC10405M52568.mo26251(f42639);
        interfaceC10405M52568.mo26251(": ");
        interfaceC10405M52568.mo26249(this.f42641);
        interfaceC10405M52568.writeByte(10);
        interfaceC10405M52568.mo26251(f42638);
        interfaceC10405M52568.mo26251(": ");
        interfaceC10405M52568.mo26249(this.f42646);
        interfaceC10405M52568.writeByte(10);
        if (str.startsWith("https://")) {
            interfaceC10405M52568.writeByte(10);
            C13159 c13159 = this.f42643;
            interfaceC10405M52568.mo26251(c13159.m31888().f67678);
            interfaceC10405M52568.writeByte(10);
            m33745(interfaceC10405M52568, c13159.m31890());
            m33745(interfaceC10405M52568, c13159.m31889());
            interfaceC10405M52568.mo26251(c13159.m31891().m3447());
            interfaceC10405M52568.writeByte(10);
        }
        interfaceC10405M52568.close();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m33744(InterfaceC6171 interfaceC6171) throws IOException {
        int iM20810 = C7787.m20810(interfaceC6171);
        if (iM20810 == -1) {
            return Collections.EMPTY_LIST;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iM20810);
            for (int i = 0; i < iM20810; i++) {
                String strMo12300 = interfaceC6171.mo12300();
                C12521 c12521 = new C12521();
                c12521.m30710(C11816.m28896(strMo12300));
                arrayList.add(certificateFactory.generateCertificate(c12521.mo12307()));
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33745(InterfaceC10405 interfaceC10405, List list) throws IOException {
        try {
            interfaceC10405.mo26249(list.size());
            interfaceC10405.writeByte(10);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                interfaceC10405.mo26251(C11816.m28897(((Certificate) list.get(i)).getEncoded()).mo2326());
                interfaceC10405.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18621 m33746(C1505 c1505) {
        C10338 c10338 = this.f42649;
        String strM26137 = c10338.m26137("Content-Type");
        String strM26138 = c10338.m26137("Content-Length");
        C9449 c9449 = new C9449();
        c9449.m24282(this.f42648);
        c9449.m24277(this.f42644, (AbstractC2393) null);
        c9449.f28651 = this.f42642.m26138();
        C8743 c8743M24274 = c9449.m24274();
        C3804 c3804 = new C3804();
        c3804.f11993 = c8743M24274;
        c3804.f12001 = this.f42647;
        c3804.f11998 = this.f42640;
        c3804.f11996 = this.f42645;
        c3804.f11999 = c10338.m26138();
        c3804.f11991 = new C23309(c1505, strM26137, strM26138);
        c3804.f12000 = this.f42643;
        c3804.f11997 = this.f42641;
        c3804.f11994 = this.f42646;
        return c3804.m11474();
    }
}
