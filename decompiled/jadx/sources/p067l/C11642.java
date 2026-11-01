package p067l;

import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p041p.C0187d;
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
public final class C11642 {
    /* JADX INFO: renamed from: ֫ */
    public static void m26752(AbstractC17043 abstractC17043, AbstractC14973 abstractC14973, boolean z, boolean z2, InterfaceC14797 interfaceC14797) throws IOException, InvalidKeyException {
        List<AbstractC16964> listSingletonList;
        InterfaceC2903 interfaceC2903M54923;
        InterfaceC2903 interfaceC2903M54924;
        char c;
        char c2;
        byte[] bArrM26757;
        byte[] bArrM26758;
        byte[] bArr;
        int length;
        int i;
        if (!z && !z2) {
            throw new RuntimeException();
        }
        if (interfaceC14797 != null) {
            interfaceC14797.mo14982(z, z2);
        }
        PublicKey publicKey = abstractC14973.m34296().getPublicKey();
        String algorithm = publicKey.getAlgorithm();
        if (C0187d.f883a.equalsIgnoreCase(algorithm)) {
            if (((RSAKey) publicKey).getModulus().bitLength() <= 3072) {
                HashMap map = AbstractC16964.f50193;
                listSingletonList = Collections.singletonList(new C3554(259, XMSSKeyParameters.SHA_256, C0187d.f883a, "SHA256withRSA", null));
            } else {
                HashMap map2 = AbstractC16964.f50193;
                listSingletonList = Collections.singletonList(new C3554(260, XMSSKeyParameters.SHA_512, C0187d.f883a, "SHA512withRSA", null));
            }
        } else if ("DSA".equalsIgnoreCase(algorithm)) {
            HashMap map3 = AbstractC16964.f50193;
            listSingletonList = Collections.singletonList(new C3554(769, XMSSKeyParameters.SHA_256, "DSA", "SHA256withDSA", null));
        } else {
            if (!"EC".equalsIgnoreCase(algorithm)) {
                throw new InvalidKeyException(C21466.m48631("Unsupported key algorithm: ", algorithm));
            }
            HashMap map4 = AbstractC16964.f50193;
            listSingletonList = Collections.singletonList(new C3554(513, XMSSKeyParameters.SHA_256, "EC", "SHA256withECDSA", null));
        }
        C24618 c24618M38671 = abstractC17043.m38671("rw");
        try {
            C20359 c20359 = new C20359(c24618M38671);
            if (c20359.m45964()) {
                throw new C3924(R.string.MT_Protector);
            }
            InterfaceC2903 interfaceC2903M14195 = C6257.m14195((InterfaceC2903) C7598.m17547(c24618M38671, 0L, c20359.m45960()));
            InterfaceC2903 interfaceC2903M14199 = C6257.m14199(C7598.m17547(c24618M38671, c20359.m45951(), c20359.m45957()));
            long jM45962 = c20359.m45962();
            C10951 c10951M14196 = C6257.m14196(C7598.m17547(c24618M38671, jM45962, c20359.m45954() - jM45962));
            int iM45951 = (int) (c20359.m45951() - interfaceC2903M14195.size());
            if (iM45951 != 0) {
                byte[] bArrM25233 = c10951M14196.m25233();
                int iM25232 = c10951M14196.m25232() + 16;
                C24185.m53472(C24185.m53468(iM25232, bArrM25233) - ((long) iM45951), iM25232, bArrM25233);
            }
            if (interfaceC14797 == null) {
                interfaceC2903M54923 = interfaceC2903M14199;
                interfaceC2903M54924 = c10951M14196;
            } else {
                C25012 c25012 = new C25012((interfaceC2903M14195.size() + interfaceC2903M14199.size() + c10951M14196.size()) * ((long) listSingletonList.size()), interfaceC14797);
                interfaceC2903M14195 = c25012.m54923(interfaceC2903M14195);
                interfaceC2903M54923 = c25012.m54923(interfaceC2903M14199);
                interfaceC2903M54924 = c25012.m54923(c10951M14196);
            }
            InterfaceC18588 interfaceC18588M40721 = C17917.m40721(interfaceC14797);
            boolean z3 = false;
            for (AbstractC16964 abstractC16964 : listSingletonList) {
                if (z3) {
                    InterfaceC2903[] interfaceC2903Arr = {interfaceC2903M14195, interfaceC2903M54923, interfaceC2903M54924};
                    int i2 = 0;
                    for (int i3 = 3; i2 < i3; i3 = 3) {
                        interfaceC2903Arr[i2].reset();
                        i2++;
                    }
                }
                abstractC16964.mo6338(interfaceC2903M14195, interfaceC2903M54923, interfaceC2903M54924, interfaceC18588M40721);
                if (interfaceC14797 != null && interfaceC14797.mo3924()) {
                    c24618M38671.close();
                    return;
                }
                z3 = true;
            }
            if (z) {
                byte[] bArrM26759 = m26757(m26755(listSingletonList), m26756(abstractC14973.m34296()), new byte[4], new byte[4]);
                Iterator it = listSingletonList.iterator();
                while (it.hasNext()) {
                    ((AbstractC16964) it.next()).m38557(abstractC14973.m34292(), publicKey, bArrM26759);
                    if (interfaceC14797 != null && interfaceC14797.mo3924()) {
                        c24618M38671.close();
                        return;
                    }
                }
                byte[] bArrM267510 = m26758(listSingletonList);
                byte[] bArrM26754 = m26754(publicKey);
                int length2 = bArrM26759.length + bArrM267510.length + bArrM26754.length;
                bArrM26757 = m26757(C24185.m53471(length2 + 16), C24185.m53471(length2 + 12), C24185.m53471(bArrM26759.length), bArrM26759, C24185.m53471(bArrM267510.length), bArrM267510, C24185.m53471(bArrM26754.length), bArrM26754);
                c = 7;
                c2 = 6;
            } else {
                c = 7;
                c2 = 6;
                bArrM26757 = null;
            }
            if (z2) {
                byte[] bArrM267511 = m26757(m26755(listSingletonList), m26756(abstractC14973.m34296()), C24185.m53471(28), C24185.m53471(Integer.MAX_VALUE), new byte[4]);
                Iterator it2 = listSingletonList.iterator();
                while (it2.hasNext()) {
                    ((AbstractC16964) it2.next()).m38557(abstractC14973.m34292(), publicKey, bArrM267511);
                    if (interfaceC14797 != null && interfaceC14797.mo3924()) {
                        c24618M38671.close();
                        return;
                    }
                }
                byte[] bArrM267512 = m26758(listSingletonList);
                byte[] bArrM26755 = m26754(publicKey);
                int length3 = bArrM267511.length + bArrM267512.length + bArrM26755.length;
                int i4 = length3 + 20;
                byte[] bArrM53471 = C24185.m53471(length3 + 24);
                byte[] bArrM53472 = C24185.m53471(i4);
                byte[] bArrM53473 = C24185.m53471(bArrM267511.length);
                byte[] bArrM53474 = C24185.m53471(28);
                byte[] bArrM53475 = C24185.m53471(Integer.MAX_VALUE);
                byte[] bArrM53476 = C24185.m53471(bArrM267512.length);
                byte[] bArrM53477 = C24185.m53471(bArrM26755.length);
                byte[][] bArr2 = new byte[10][];
                bArr2[0] = bArrM53471;
                bArr2[1] = bArrM53472;
                bArr2[2] = bArrM53473;
                bArr2[3] = bArrM267511;
                bArr2[4] = bArrM53474;
                bArr2[5] = bArrM53475;
                bArr2[c2] = bArrM53476;
                bArr2[c] = bArrM267512;
                bArr2[8] = bArrM53477;
                bArr2[9] = bArrM26755;
                bArrM26758 = m26757(bArr2);
            } else {
                bArrM26758 = null;
            }
            if (interfaceC14797 != null && interfaceC14797.mo3924()) {
                c24618M38671.close();
                return;
            }
            int iM46927 = C20780.m46927(!z ? 0 : bArrM26757.length + 12, 8, !z2 ? 0 : bArrM26758.length + 12, 24);
            if (iM46927 % 4096 != 0) {
                int i5 = iM46927 % 4096;
                int i6 = 4096 - i5;
                if (i6 < 12) {
                    i6 = 8192 - i5;
                }
                bArr = new byte[i6];
                C24185.m53470(i6 - 8, 0, bArr);
                C24185.m53469(1114793335, 8, bArr);
                iM46927 += i6;
            } else {
                bArr = null;
            }
            byte[] bArr3 = new byte[iM46927];
            long j = ((long) iM46927) - 8;
            C24185.m53470(j, 0, bArr3);
            if (z) {
                C24185.m53470(bArrM26757.length + 4, 8, bArr3);
                C24185.m53469(1896449818, 16, bArr3);
                System.arraycopy(bArrM26757, 0, bArr3, 20, bArrM26757.length);
                length = bArrM26757.length + 20;
            } else {
                length = 8;
            }
            if (z2) {
                C24185.m53470(bArrM26758.length + 4, length, bArr3);
                C24185.m53469(-262969152, length + 8, bArr3);
                int i7 = length + 12;
                System.arraycopy(bArrM26758, 0, bArr3, i7, bArrM26758.length);
                length = i7 + bArrM26758.length;
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr3, length, bArr.length);
                length += bArr.length;
            }
            C24185.m53470(j, length, bArr3);
            C24185.m53470(2334950737559900225L, length + 8, bArr3);
            C24185.m53470(3617552046287187010L, length + 16, bArr3);
            if (length + 24 != iM46927) {
                throw new IllegalStateException();
            }
            if (interfaceC14797 != null && interfaceC14797.mo3924()) {
                c24618M38671.close();
                return;
            }
            int iM45960 = (int) (c20359.m45960() % ((long) 4096));
            int i8 = iM45960 == 0 ? 0 : 4096 - iM45960;
            c24618M38671.setLength(c20359.m45960());
            c24618M38671.seek(c20359.m45960());
            if (i8 != 0) {
                i = 0;
                c24618M38671.write(new byte[i8], 0, i8);
            } else {
                i = 0;
            }
            c24618M38671.write(bArr3, i, iM46927);
            long filePointer = c24618M38671.getFilePointer();
            interfaceC2903M14199.reset();
            interfaceC2903M14199.mo4681(interfaceC2903M14199.size(), c24618M38671);
            C24185.m53472(filePointer, c10951M14196.m25232() + 16, c10951M14196.m25233());
            c10951M14196.reset();
            C6257.m14198(c10951M14196, c24618M38671, c10951M14196.size());
            c24618M38671.close();
        } catch (Throwable th) {
            try {
                c24618M38671.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m26757(byte[]... bArr) {
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

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m26755(List list) {
        ArrayList<byte[]> arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int length = 4;
        int length2 = 4;
        while (it.hasNext()) {
            AbstractC16964 abstractC16964 = (AbstractC16964) it.next();
            byte[] bArrM26753 = m26753(abstractC16964.mo6337(), abstractC16964.f50194);
            length2 += bArrM26753.length;
            arrayList.add(bArrM26753);
        }
        byte[] bArr = new byte[length2];
        C24185.m53469(length2 - 4, 0, bArr);
        for (byte[] bArr2 : arrayList) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m26756(X509Certificate... x509CertificateArr) throws CertificateEncodingException {
        ArrayList<byte[]> arrayList = new ArrayList(x509CertificateArr.length);
        int length = 4;
        for (X509Certificate x509Certificate : x509CertificateArr) {
            byte[] encoded = x509Certificate.getEncoded();
            length += encoded.length + 4;
            arrayList.add(encoded);
        }
        byte[] bArr = new byte[length];
        C24185.m53469(length - 4, 0, bArr);
        int length2 = 4;
        for (byte[] bArr2 : arrayList) {
            C24185.m53469(bArr2.length, length2, bArr);
            int i = length2 + 4;
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            length2 = i + bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m26758(List list) {
        ArrayList<byte[]> arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            AbstractC16964 abstractC16964 = (AbstractC16964) it.next();
            byte[] bArrM26753 = m26753(abstractC16964.mo6337(), abstractC16964.f50195);
            length += bArrM26753.length;
            arrayList.add(bArrM26753);
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (byte[] bArr2 : arrayList) {
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m26753(int i, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + 12];
        C24185.m53469(bArr.length + 8, 0, bArr2);
        C24185.m53469(i, 4, bArr2);
        C24185.m53469(bArr.length, 8, bArr2);
        System.arraycopy(bArr, 0, bArr2, 12, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m26754(PublicKey publicKey) throws InvalidKeyException {
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
