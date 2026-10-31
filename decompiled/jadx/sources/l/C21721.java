package l;

import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩸ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K77P */
/* JADX INFO: loaded from: classes.dex */
public final class C21721 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8315 m49048(AbstractC15440 abstractC15440) {
        try {
            C4611 c4611 = new C4611(abstractC15440, false);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            m49049(arrayList2, arrayList, "V1", c4611.m13536());
            m49049(arrayList2, arrayList, "V2", c4611.m13535());
            m49049(arrayList2, arrayList, "V3", c4611.m13538());
            m49049(arrayList2, arrayList, "V3.1", c4611.m13533());
            if (arrayList.isEmpty()) {
                return new C8315(true, false, arrayList, false, new ArrayList(), null);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(m49047((C15369) it.next()));
            }
            return new C8315(true, true, arrayList, arrayList3.size() > 1, arrayList3, null);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = e.getClass().getSimpleName();
            }
            return new C8315(false, false, new ArrayList(), false, new ArrayList(), message);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49049(ArrayList arrayList, ArrayList arrayList2, String str, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        arrayList2.add(str);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C15369 c15369 = (C15369) it.next();
            if (Arrays.equals(c15369.f47083, bArr)) {
                c15369.f47084.add(str);
                return;
            }
        }
        arrayList.add(new C15369(bArr, str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1259 m49047(C15369 c15369) {
        byte[] bArr = c15369.f47083;
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        ArrayList arrayList = c15369.f47084;
        int length = bArr.length;
        int iHashCode = Arrays.hashCode(bArr);
        String strM34525 = C14460.m34525(bArr);
        String strM34531 = C14460.m34531(C14460.m34532().digest(bArr));
        String strM34532 = C14460.m34531(C14460.m34534().digest(bArr));
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        Locale locale = Locale.ROOT;
        return new C1259(arrayList, length, iHashCode, strM34525, strM34531, strM34532, String.format(locale, "%08x", Long.valueOf(crc32.getValue())), x509Certificate.getSigAlgName(), x509Certificate.getSigAlgOID(), x509Certificate.getSubjectX500Principal().getName("RFC2253"), x509Certificate.getIssuerX500Principal().getName("RFC2253"), x509Certificate.getSerialNumber().toString(16).toLowerCase(locale), x509Certificate.getNotBefore().getTime(), x509Certificate.getNotAfter().getTime());
    }
}
