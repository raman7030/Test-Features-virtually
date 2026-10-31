package l;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩷ᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31A6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21046 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m47891(C18929 c18929, byte[] bArr) throws EOFException {
        if (!c18929.m43693()) {
            return null;
        }
        c18929.m43686(c18929.m43694());
        long jM43689 = c18929.m43689() - 24;
        while (jM43689 > 0 && jM43689 >= 12) {
            long jM436810 = c18929.m43689();
            if (jM436810 < 4 || jM436810 > jM43689 - 8) {
                return null;
            }
            long jM43697 = c18929.m43697() + jM436810;
            if (c18929.m43690() == 1896449818) {
                try {
                    return m47890(c18929, jM43697, bArr);
                } catch (RuntimeException | C20941 unused) {
                    return null;
                }
            }
            jM43689 -= jM436810 + 8;
            c18929.m43686(jM43697);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m47890(C18929 c18929, long j, byte[] bArr) throws EOFException, C20941 {
        long jM47887 = m47887(c18929, m47887(c18929, j));
        long jM47888 = m47887(c18929, jM47887);
        c18929.m43686(m47887(c18929, jM47888));
        byte[] bArrM47892 = m47892(c18929, m47887(c18929, jM47888), bArr);
        if (bArrM47892 == null) {
            return null;
        }
        m47887(c18929, jM47888);
        c18929.m43686(jM47888);
        if (jM47887 - c18929.m43697() < 8) {
            throw new C20941("V2 signer is missing signatures or public key");
        }
        c18929.m43686(m47887(c18929, jM47887));
        c18929.m43686(m47887(c18929, jM47887));
        return bArrM47892;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m47887(C18929 c18929, long j) throws EOFException, C20941 {
        if (j - c18929.m43697() < 4) {
            throw new C20941("Length-prefixed field is missing its length");
        }
        int iM43690 = c18929.m43690();
        long jM43697 = j - c18929.m43697();
        if (iM43690 >= 0) {
            long j2 = iM43690;
            if (j2 <= jM43697) {
                return c18929.m43697() + j2;
            }
        }
        throw new C20941("Length-prefixed field exceeds its container");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m47892(C18929 c18929, long j, byte[] bArr) {
        try {
            if (j - c18929.m43697() > 4194304) {
                throw new C20941("Signing certificate sequence exceeds safety limit");
            }
            byte[] bArr2 = null;
            byte[] bArr3 = null;
            while (c18929.m43697() < j) {
                long jM47887 = m47887(c18929, j);
                int iM43697 = (int) (jM47887 - c18929.m43697());
                if (iM43697 == 0) {
                    throw new C20941("Signing certificate is empty");
                }
                if (iM43697 > 1048576) {
                    throw new C20941("Signing certificate exceeds safety limit");
                }
                if (bArr3 == null || (bArr != null && bArr.length == iM43697)) {
                    byte[] bArrM43687 = c18929.m43687(iM43697);
                    if (bArr3 == null) {
                        bArr3 = bArrM43687;
                    }
                    if (bArr != null && Arrays.equals(bArr, bArrM43687)) {
                        bArr2 = bArrM43687;
                    }
                } else {
                    c18929.m43686(jM47887);
                }
            }
            if (bArr2 == null) {
                bArr2 = bArr3;
            }
            c18929.m43686(j);
            return bArr2;
        } catch (Throwable th) {
            c18929.m43686(j);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47888(C18929 c18929, InterfaceC17066 interfaceC17066) throws EOFException {
        if (!c18929.m43693()) {
            return false;
        }
        c18929.m43686(c18929.m43694());
        long jM43689 = c18929.m43689() - 24;
        while (jM43689 > 0 && jM43689 >= 12) {
            long jM436810 = c18929.m43689();
            if (jM436810 < 4 || jM436810 > jM43689 - 8) {
                return false;
            }
            long jM43697 = c18929.m43697() + jM436810;
            if (c18929.m43690() != 1896449818) {
                jM43689 -= jM436810 + 8;
                c18929.m43686(jM43697);
            } else {
                try {
                    int iM47887 = (int) (m47887(c18929, jM43697) - c18929.m43697());
                    if (iM47887 <= 16777216) {
                        return m47889(c18929.m43687(iM47887), c18929.m43695(), c18929, interfaceC17066);
                    }
                    throw new C20941("Signer sequence exceeds safety limit");
                } catch (RuntimeException | C20941 | Exception unused) {
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47889(byte[] bArr, InterfaceC7889 interfaceC7889, C18929 c18929, InterfaceC17066 interfaceC17066) throws IOException, CertificateException, C20941 {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        while (byteBufferOrder.position() < byteBufferOrder.limit()) {
            ByteBuffer byteBufferM24593 = C9652.m24593(byteBufferOrder);
            byte[] bArrM24594 = C9652.m24594(byteBufferM24593);
            ByteBuffer byteBufferM24594 = C9652.m24593(byteBufferM24593);
            byte[] bArrM24595 = C9652.m24594(byteBufferM24593);
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArrM24594).order(ByteOrder.LITTLE_ENDIAN);
            ByteBuffer byteBufferM24595 = C9652.m24593(byteBufferOrder2);
            while (byteBufferM24595.hasRemaining()) {
                ByteBuffer byteBufferM24596 = C9652.m24593(byteBufferM24595);
                if (map.put(Integer.valueOf(byteBufferM24596.getInt()), C9652.m24594(byteBufferM24596)) != null) {
                    return false;
                }
            }
            ByteBuffer byteBufferM24597 = C9652.m24593(byteBufferOrder2);
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            while (byteBufferM24597.hasRemaining()) {
                arrayList.add((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(C9652.m24594(byteBufferM24597))));
            }
            C9652.m24593(byteBufferOrder2);
            ArrayList<C6934> arrayList2 = new ArrayList();
            while (byteBufferM24594.hasRemaining()) {
                ByteBuffer byteBufferM24598 = C9652.m24593(byteBufferM24594);
                int i = byteBufferM24598.getInt();
                byte[] bArrM24596 = C9652.m24594(byteBufferM24598);
                if (AbstractC15357.f47068.containsKey(Integer.valueOf(i))) {
                    arrayList2.add(new C6934(i, bArrM24596));
                }
            }
            if (!arrayList2.isEmpty()) {
                for (C6934 c6934 : arrayList2) {
                    AbstractC15357 abstractC15357M36398 = AbstractC15357.m36398(c6934.f21395);
                    try {
                        if (abstractC15357M36398.m36400(KeyFactory.getInstance(abstractC15357M36398.mo4095()).generatePublic(new X509EncodedKeySpec(bArrM24595)), bArrM24594, c6934.f21396) && Arrays.equals(bArrM24595, ((X509Certificate) arrayList.get(0)).getPublicKey().getEncoded())) {
                        }
                    } catch (NoSuchAlgorithmException unused) {
                    }
                }
                C1268 c1268M15636 = C5502.m15636(interfaceC7889, 0L, c18929.m43694());
                C1268 c1268M15637 = C5502.m15636(interfaceC7889, c18929.m43685(), c18929.m43691());
                long jM43696 = c18929.m43696();
                C9030 c9030M12291 = C4091.m12291(C5502.m15636(interfaceC7889, jM43696, c18929.m43688() - jM43696));
                int iM43685 = (int) (c18929.m43685() - c18929.m43694());
                byte[] bArrM23289 = c9030M12291.m23289();
                int iM23288 = c9030M12291.m23288() + 16;
                C22955.m51081(C22955.m51077(iM23288, bArrM23289) - ((long) iM43685), iM23288, bArrM23289);
                boolean z = false;
                for (C6934 c6935 : arrayList2) {
                    AbstractC15357 abstractC15357M36399 = AbstractC15357.m36398(c6935.f21395);
                    if (z) {
                        InterfaceC0562[] interfaceC0562Arr = {c1268M15636, c1268M15637, c9030M12291};
                        for (int i2 = 0; i2 < 3; i2++) {
                            interfaceC0562Arr[i2].reset();
                        }
                    }
                    abstractC15357M36399.mo4094(c1268M15636, c1268M15637, c9030M12291, interfaceC17066);
                    if (!interfaceC17066.mo1526() && Arrays.equals(abstractC15357M36399.f47069, (byte[]) map.get(Integer.valueOf(c6935.f21395)))) {
                        z = true;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
