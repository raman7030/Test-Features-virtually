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

/* JADX INFO: renamed from: l.ܺᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PB28 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16105 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10220 m38013(C18929 c18929, boolean z, byte[] bArr) throws EOFException {
        if (!c18929.m43693()) {
            return null;
        }
        c18929.m43686(c18929.m43694());
        long jM43689 = c18929.m43689() - 24;
        int i = z ? 462663009 : -262969152;
        while (jM43689 > 0 && jM43689 >= 12) {
            long jM436810 = c18929.m43689();
            if (jM436810 < 4 || jM436810 > jM43689 - 8) {
                return null;
            }
            long jM43697 = c18929.m43697() + jM436810;
            if (c18929.m43690() == i) {
                try {
                    return m38012(c18929, jM43697, bArr);
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
    public static C10220 m38012(C18929 c18929, long j, byte[] bArr) throws EOFException, C20941 {
        long jM47887 = C21046.m47887(c18929, C21046.m47887(c18929, j));
        long jM47888 = C21046.m47887(c18929, jM47887);
        c18929.m43686(C21046.m47887(c18929, jM47888));
        byte[] bArrM47892 = C21046.m47892(c18929, C21046.m47887(c18929, jM47888), bArr);
        if (bArrM47892 == null) {
            return null;
        }
        if (jM47888 - c18929.m43697() < 12) {
            throw new C20941("V3 signed data is missing SDK range or attributes");
        }
        int iM43690 = c18929.m43690();
        int iM43691 = c18929.m43690();
        long jM47889 = C21046.m47887(c18929, jM47888);
        long jM43697 = c18929.m43697();
        long j2 = 0;
        while (true) {
            byte[] bArr2 = bArrM47892;
            int i = iM43691;
            if (c18929.m43697() >= jM47889) {
                c18929.m43686(jM43697);
                C21709 c21709M49039 = null;
                while (c18929.m43697() < jM47889) {
                    long jM478810 = C21046.m47887(c18929, jM47889);
                    if (jM478810 - c18929.m43697() < 4) {
                        throw new C20941("V3 signing attribute is missing its ID");
                    }
                    if (c18929.m43690() != 1000370060) {
                        c18929.m43686(jM478810);
                    } else {
                        try {
                            C21709 c21709M49040 = C21709.m49040(c18929.m43687((int) (jM478810 - c18929.m43697())));
                            c21709M49039 = c21709M49039 == null ? c21709M49040 : C21709.m49039(Arrays.asList(c21709M49039, c21709M49040));
                        } catch (Exception e) {
                            throw new C20941("Failed to parse V3 signing certificate lineage", e);
                        }
                    }
                }
                c18929.m43686(jM47888);
                if (jM47887 - c18929.m43697() < 16) {
                    throw new C20941("V3 signer is missing SDK range, signatures, or public key");
                }
                int iM43692 = c18929.m43690();
                int iM43693 = c18929.m43690();
                if (iM43690 != iM43692 || i != iM43693) {
                    throw new C20941("V3 signer SDK range does not match signed data");
                }
                c18929.m43686(C21046.m47887(c18929, jM47887));
                c18929.m43686(C21046.m47887(c18929, jM47887));
                return new C10220(bArr2, c21709M49039);
            }
            long jM478811 = C21046.m47887(c18929, jM47889);
            if (jM478811 - c18929.m43697() < 4) {
                throw new C20941("V3 signing attribute is missing its ID");
            }
            if (c18929.m43690() == 1000370060) {
                long jM43698 = (jM478811 - c18929.m43697()) + j2;
                if (jM43698 > 4194304) {
                    throw new C20941("V3 proof-of-rotation data exceeds safety limit");
                }
                j2 = jM43698;
            }
            c18929.m43686(jM478811);
            bArrM47892 = bArr2;
            iM43691 = i;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38014(C18929 c18929, boolean z, InterfaceC17066 interfaceC17066) throws EOFException {
        if (!c18929.m43693()) {
            return false;
        }
        c18929.m43686(c18929.m43694());
        long jM43689 = c18929.m43689() - 24;
        int i = z ? 462663009 : -262969152;
        while (jM43689 > 0 && jM43689 >= 12) {
            long jM436810 = c18929.m43689();
            if (jM436810 < 4 || jM436810 > jM43689 - 8) {
                return false;
            }
            long jM43697 = c18929.m43697() + jM436810;
            if (c18929.m43690() == i) {
                try {
                    int iM47887 = (int) (C21046.m47887(c18929, jM43697) - c18929.m43697());
                    if (iM47887 <= 16777216) {
                        return m38015(c18929.m43687(iM47887), c18929.m43695(), c18929, interfaceC17066);
                    }
                    throw new C20941("Signer sequence exceeds safety limit");
                } catch (RuntimeException | C20941 | Exception unused) {
                    return false;
                }
            }
            jM43689 -= jM436810 + 8;
            c18929.m43686(jM43697);
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38015(byte[] bArr, InterfaceC7889 interfaceC7889, C18929 c18929, InterfaceC17066 interfaceC17066) throws IOException, CertificateException, C20941 {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        while (byteBufferOrder.position() < byteBufferOrder.limit()) {
            ByteBuffer byteBufferM24593 = C9652.m24593(byteBufferOrder);
            byte[] bArrM24594 = C9652.m24594(byteBufferM24593);
            int i = byteBufferM24593.getInt();
            int i2 = byteBufferM24593.getInt();
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
            int i3 = byteBufferOrder2.getInt();
            int i4 = byteBufferOrder2.getInt();
            C9652.m24593(byteBufferOrder2);
            if (i3 == i && i4 == i2) {
                ArrayList<C9051> arrayList2 = new ArrayList();
                while (byteBufferM24594.hasRemaining()) {
                    ByteBuffer byteBufferM24598 = C9652.m24593(byteBufferM24594);
                    int i5 = byteBufferM24598.getInt();
                    byte[] bArrM24596 = C9652.m24594(byteBufferM24598);
                    if (AbstractC15357.f47068.containsKey(Integer.valueOf(i5))) {
                        arrayList2.add(new C9051(i5, bArrM24596));
                    }
                }
                if (!arrayList2.isEmpty()) {
                    for (C9051 c9051 : arrayList2) {
                        AbstractC15357 abstractC15357M36398 = AbstractC15357.m36398(c9051.f27451);
                        try {
                            if (abstractC15357M36398.m36400(KeyFactory.getInstance(abstractC15357M36398.mo4095()).generatePublic(new X509EncodedKeySpec(bArrM24595)), bArrM24594, c9051.f27452) && Arrays.equals(bArrM24595, ((X509Certificate) arrayList.get(0)).getPublicKey().getEncoded())) {
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
                    for (C9051 c9052 : arrayList2) {
                        AbstractC15357 abstractC15357M36399 = AbstractC15357.m36398(c9052.f27451);
                        if (z) {
                            InterfaceC0562[] interfaceC0562Arr = {c1268M15636, c1268M15637, c9030M12291};
                            for (int i6 = 0; i6 < 3; i6++) {
                                interfaceC0562Arr[i6].reset();
                            }
                        }
                        abstractC15357M36399.mo4094(c1268M15636, c1268M15637, c9030M12291, interfaceC17066);
                        if (!interfaceC17066.mo1526() && Arrays.equals(abstractC15357M36399.f47069, (byte[]) map.get(Integer.valueOf(c9052.f27451)))) {
                            z = true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
