package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.p.d;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۢᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AYU */
/* JADX INFO: loaded from: classes3.dex */
public final class C9757 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24738(AbstractC15440 abstractC15440, AbstractC13262 abstractC13262, boolean z, boolean z2, InterfaceC13077 interfaceC13077) throws IOException, InvalidKeyException {
        List<AbstractC15357> listSingletonList;
        InterfaceC0562 interfaceC0562M52514;
        InterfaceC0562 interfaceC0562M52515;
        char c;
        char c2;
        byte[] bArrM24743;
        byte[] bArrM24744;
        byte[] bArr;
        int length;
        int i;
        if (!z && !z2) {
            throw new RuntimeException();
        }
        if (interfaceC13077 != null) {
            interfaceC13077.mo13118(z, z2);
        }
        PublicKey publicKey = abstractC13262.m32197().getPublicKey();
        String algorithm = publicKey.getAlgorithm();
        if (d.a.equalsIgnoreCase(algorithm)) {
            if (((RSAKey) publicKey).getModulus().bitLength() <= 3072) {
                HashMap map = AbstractC15357.f47068;
                listSingletonList = Collections.singletonList(new C1247(259, XMSSKeyParameters.SHA_256, d.a, "SHA256withRSA", null));
            } else {
                HashMap map2 = AbstractC15357.f47068;
                listSingletonList = Collections.singletonList(new C1247(260, XMSSKeyParameters.SHA_512, d.a, "SHA512withRSA", null));
            }
        } else if ("DSA".equalsIgnoreCase(algorithm)) {
            HashMap map3 = AbstractC15357.f47068;
            listSingletonList = Collections.singletonList(new C1247(769, XMSSKeyParameters.SHA_256, "DSA", "SHA256withDSA", null));
        } else {
            if (!"EC".equalsIgnoreCase(algorithm)) {
                throw new InvalidKeyException(C20094.m46315("Unsupported key algorithm: ", algorithm));
            }
            HashMap map4 = AbstractC15357.f47068;
            listSingletonList = Collections.singletonList(new C1247(513, XMSSKeyParameters.SHA_256, "EC", "SHA256withECDSA", null));
        }
        C23411 c23411M36513 = abstractC15440.m36513("rw");
        try {
            C18929 c18929 = new C18929(c23411M36513);
            if (c18929.m43698()) {
                throw new C1637(R.string.MT_Protector);
            }
            InterfaceC0562 interfaceC0562M12290 = C4091.m12290((InterfaceC0562) C5502.m15636(c23411M36513, 0L, c18929.m43694()));
            InterfaceC0562 interfaceC0562M12294 = C4091.m12294(C5502.m15636(c23411M36513, c18929.m43685(), c18929.m43691()));
            long jM43696 = c18929.m43696();
            C9030 c9030M12291 = C4091.m12291(C5502.m15636(c23411M36513, jM43696, c18929.m43688() - jM43696));
            int iM43685 = (int) (c18929.m43685() - interfaceC0562M12290.size());
            if (iM43685 != 0) {
                byte[] bArrM23289 = c9030M12291.m23289();
                int iM23288 = c9030M12291.m23288() + 16;
                C22955.m51081(C22955.m51077(iM23288, bArrM23289) - ((long) iM43685), iM23288, bArrM23289);
            }
            if (interfaceC13077 == null) {
                interfaceC0562M52514 = interfaceC0562M12294;
                interfaceC0562M52515 = c9030M12291;
            } else {
                C23825 c23825 = new C23825((interfaceC0562M12290.size() + interfaceC0562M12294.size() + c9030M12291.size()) * ((long) listSingletonList.size()), interfaceC13077);
                interfaceC0562M12290 = c23825.m52514(interfaceC0562M12290);
                interfaceC0562M52514 = c23825.m52514(interfaceC0562M12294);
                interfaceC0562M52515 = c23825.m52514(c9030M12291);
            }
            InterfaceC17066 interfaceC17066M38504 = C16360.m38504(interfaceC13077);
            boolean z3 = false;
            for (AbstractC15357 abstractC15357 : listSingletonList) {
                if (z3) {
                    InterfaceC0562[] interfaceC0562Arr = {interfaceC0562M12290, interfaceC0562M52514, interfaceC0562M52515};
                    int i2 = 0;
                    for (int i3 = 3; i2 < i3; i3 = 3) {
                        interfaceC0562Arr[i2].reset();
                        i2++;
                    }
                }
                abstractC15357.mo4094(interfaceC0562M12290, interfaceC0562M52514, interfaceC0562M52515, interfaceC17066M38504);
                if (interfaceC13077 != null && interfaceC13077.mo1526()) {
                    c23411M36513.close();
                    return;
                }
                z3 = true;
            }
            if (z) {
                byte[] bArrM24745 = m24743(m24741(listSingletonList), m24742(abstractC13262.m32197()), new byte[4], new byte[4]);
                Iterator it = listSingletonList.iterator();
                while (it.hasNext()) {
                    ((AbstractC15357) it.next()).m36399(abstractC13262.m32193(), publicKey, bArrM24745);
                    if (interfaceC13077 != null && interfaceC13077.mo1526()) {
                        c23411M36513.close();
                        return;
                    }
                }
                byte[] bArrM24746 = m24744(listSingletonList);
                byte[] bArrM24740 = m24740(publicKey);
                int length2 = bArrM24745.length + bArrM24746.length + bArrM24740.length;
                bArrM24743 = m24743(C22955.m51080(length2 + 16), C22955.m51080(length2 + 12), C22955.m51080(bArrM24745.length), bArrM24745, C22955.m51080(bArrM24746.length), bArrM24746, C22955.m51080(bArrM24740.length), bArrM24740);
                c = 7;
                c2 = 6;
            } else {
                c = 7;
                c2 = 6;
                bArrM24743 = null;
            }
            if (z2) {
                byte[] bArrM24747 = m24743(m24741(listSingletonList), m24742(abstractC13262.m32197()), C22955.m51080(28), C22955.m51080(Integer.MAX_VALUE), new byte[4]);
                Iterator it2 = listSingletonList.iterator();
                while (it2.hasNext()) {
                    ((AbstractC15357) it2.next()).m36399(abstractC13262.m32193(), publicKey, bArrM24747);
                    if (interfaceC13077 != null && interfaceC13077.mo1526()) {
                        c23411M36513.close();
                        return;
                    }
                }
                byte[] bArrM24748 = m24744(listSingletonList);
                byte[] bArrM24741 = m24740(publicKey);
                int length3 = bArrM24747.length + bArrM24748.length + bArrM24741.length;
                int i4 = length3 + 20;
                byte[] bArrM51080 = C22955.m51080(length3 + 24);
                byte[] bArrM51081 = C22955.m51080(i4);
                byte[] bArrM51082 = C22955.m51080(bArrM24747.length);
                byte[] bArrM51083 = C22955.m51080(28);
                byte[] bArrM51084 = C22955.m51080(Integer.MAX_VALUE);
                byte[] bArrM51085 = C22955.m51080(bArrM24748.length);
                byte[] bArrM51086 = C22955.m51080(bArrM24741.length);
                byte[][] bArr2 = new byte[10][];
                bArr2[0] = bArrM51080;
                bArr2[1] = bArrM51081;
                bArr2[2] = bArrM51082;
                bArr2[3] = bArrM24747;
                bArr2[4] = bArrM51083;
                bArr2[5] = bArrM51084;
                bArr2[c2] = bArrM51085;
                bArr2[c] = bArrM24748;
                bArr2[8] = bArrM51086;
                bArr2[9] = bArrM24741;
                bArrM24744 = m24743(bArr2);
            } else {
                bArrM24744 = null;
            }
            if (interfaceC13077 != null && interfaceC13077.mo1526()) {
                c23411M36513.close();
                return;
            }
            int iM44633 = C19373.m44633(!z ? 0 : bArrM24743.length + 12, 8, !z2 ? 0 : bArrM24744.length + 12, 24);
            if (iM44633 % 4096 != 0) {
                int i5 = iM44633 % 4096;
                int i6 = 4096 - i5;
                if (i6 < 12) {
                    i6 = 8192 - i5;
                }
                bArr = new byte[i6];
                C22955.m51079(i6 - 8, 0, bArr);
                C22955.m51078(1114793335, 8, bArr);
                iM44633 += i6;
            } else {
                bArr = null;
            }
            byte[] bArr3 = new byte[iM44633];
            long j = ((long) iM44633) - 8;
            C22955.m51079(j, 0, bArr3);
            if (z) {
                C22955.m51079(bArrM24743.length + 4, 8, bArr3);
                C22955.m51078(1896449818, 16, bArr3);
                System.arraycopy(bArrM24743, 0, bArr3, 20, bArrM24743.length);
                length = bArrM24743.length + 20;
            } else {
                length = 8;
            }
            if (z2) {
                C22955.m51079(bArrM24744.length + 4, length, bArr3);
                C22955.m51078(-262969152, length + 8, bArr3);
                int i7 = length + 12;
                System.arraycopy(bArrM24744, 0, bArr3, i7, bArrM24744.length);
                length = i7 + bArrM24744.length;
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr3, length, bArr.length);
                length += bArr.length;
            }
            C22955.m51079(j, length, bArr3);
            C22955.m51079(2334950737559900225L, length + 8, bArr3);
            C22955.m51079(3617552046287187010L, length + 16, bArr3);
            if (length + 24 != iM44633) {
                throw new IllegalStateException();
            }
            if (interfaceC13077 != null && interfaceC13077.mo1526()) {
                c23411M36513.close();
                return;
            }
            int iM43694 = (int) (c18929.m43694() % ((long) 4096));
            int i8 = iM43694 == 0 ? 0 : 4096 - iM43694;
            c23411M36513.setLength(c18929.m43694());
            c23411M36513.seek(c18929.m43694());
            if (i8 != 0) {
                i = 0;
                c23411M36513.write(new byte[i8], 0, i8);
            } else {
                i = 0;
            }
            c23411M36513.write(bArr3, i, iM44633);
            long filePointer = c23411M36513.getFilePointer();
            interfaceC0562M12294.reset();
            interfaceC0562M12294.mo2313(interfaceC0562M12294.size(), c23411M36513);
            C22955.m51081(filePointer, c9030M12291.m23288() + 16, c9030M12291.m23289());
            c9030M12291.reset();
            C4091.m12293(c9030M12291, c23411M36513, c9030M12291.size());
            c23411M36513.close();
        } catch (Throwable th) {
            try {
                c23411M36513.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24743(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24741(List list) {
        ArrayList<byte[]> arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int length = 4;
        int length2 = 4;
        while (it.hasNext()) {
            AbstractC15357 abstractC15357 = (AbstractC15357) it.next();
            byte[] bArrM24739 = m24739(abstractC15357.mo4093(), abstractC15357.f47069);
            length2 += bArrM24739.length;
            arrayList.add(bArrM24739);
        }
        byte[] bArr = new byte[length2];
        C22955.m51078(length2 - 4, 0, bArr);
        for (byte[] bArr2 : arrayList) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24742(X509Certificate... x509CertificateArr) throws CertificateEncodingException {
        ArrayList<byte[]> arrayList = new ArrayList(x509CertificateArr.length);
        int length = 4;
        for (X509Certificate x509Certificate : x509CertificateArr) {
            byte[] encoded = x509Certificate.getEncoded();
            length += encoded.length + 4;
            arrayList.add(encoded);
        }
        byte[] bArr = new byte[length];
        C22955.m51078(length - 4, 0, bArr);
        int length2 = 4;
        for (byte[] bArr2 : arrayList) {
            C22955.m51078(bArr2.length, length2, bArr);
            int i = length2 + 4;
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            length2 = i + bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m24744(List list) {
        ArrayList<byte[]> arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            AbstractC15357 abstractC15357 = (AbstractC15357) it.next();
            byte[] bArrM24739 = m24739(abstractC15357.mo4093(), abstractC15357.f47070);
            length += bArrM24739.length;
            arrayList.add(bArrM24739);
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (byte[] bArr2 : arrayList) {
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24739(int i, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 12];
        C22955.m51078(bArr.length + 8, 0, bArr2);
        C22955.m51078(i, 4, bArr2);
        C22955.m51078(bArr.length, 8, bArr2);
        System.arraycopy(bArr, 0, bArr2, 12, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24740(PublicKey publicKey) throws InvalidKeyException {
        try {
            byte[] encoded = ((X509EncodedKeySpec) KeyFactory.getInstance(publicKey.getAlgorithm()).getKeySpec(publicKey, X509EncodedKeySpec.class)).getEncoded();
            if (encoded != null && encoded.length != 0) {
                return encoded;
            }
            throw new InvalidKeyException("Failed to obtain X.509 encoded form of public key " + publicKey + " of class " + publicKey.getClass().getName());
        } catch (InvalidKeySpecException e) {
            throw new InvalidKeyException("Failed to obtain X.509 encoded form of public key " + publicKey + " of class " + publicKey.getClass().getName(), e);
        }
    }
}
