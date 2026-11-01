package p067l;

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
public final class C23012 {
    /* JADX INFO: renamed from: ֫ */
    public static C10271 m51397(AbstractC17043 abstractC17043) {
        try {
            C6751 c6751 = new C6751(abstractC17043, false);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            m51398(arrayList2, arrayList, "V1", c6751.m15425());
            m51398(arrayList2, arrayList, "V2", c6751.m15424());
            m51398(arrayList2, arrayList, "V3", c6751.m15427());
            m51398(arrayList2, arrayList, "V3.1", c6751.m15422());
            if (arrayList.isEmpty()) {
                return new C10271(true, false, arrayList, false, new ArrayList(), null);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(m51396((C16975) it.next()));
            }
            return new C10271(true, true, arrayList, arrayList3.size() > 1, arrayList3, null);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = e.getClass().getSimpleName();
            }
            return new C10271(false, false, new ArrayList(), false, new ArrayList(), message);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51398(ArrayList arrayList, ArrayList arrayList2, String str, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        arrayList2.add(str);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C16975 c16975 = (C16975) it.next();
            if (Arrays.equals(c16975.f50210, bArr)) {
                c16975.f50211.add(str);
                return;
            }
        }
        arrayList.add(new C16975(bArr, str));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C3565 m51396(C16975 c16975) {
        byte[] bArr = c16975.f50210;
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        ArrayList arrayList = c16975.f50211;
        int length = bArr.length;
        int iHashCode = Arrays.hashCode(bArr);
        String strM36659 = C16111.m36659(bArr);
        String strM36665 = C16111.m36665(C16111.m36666().digest(bArr));
        String strM36666 = C16111.m36665(C16111.m36668().digest(bArr));
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        Locale locale = Locale.ROOT;
        return new C3565(arrayList, length, iHashCode, strM36659, strM36665, strM36666, String.format(locale, "%08x", Long.valueOf(crc32.getValue())), x509Certificate.getSigAlgName(), x509Certificate.getSigAlgOID(), x509Certificate.getSubjectX500Principal().getName("RFC2253"), x509Certificate.getIssuerX500Principal().getName("RFC2253"), x509Certificate.getSerialNumber().toString(16).toLowerCase(locale), x509Certificate.getNotBefore().getTime(), x509Certificate.getNotAfter().getTime());
    }
}
