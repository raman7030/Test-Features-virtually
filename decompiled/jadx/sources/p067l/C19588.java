package p067l;

import com.alipay.sdk.p010m.p041p.C0187d;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ᩳܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5FD */
/* JADX INFO: loaded from: classes4.dex */
public final class C19588 {

    /* JADX INFO: renamed from: ܽ */
    public static final HashMap f59600;

    /* JADX INFO: renamed from: ᩳ */
    public static final HashMap f59601;

    /* JADX INFO: renamed from: ֫ */
    public C16234 f59602;

    /* JADX INFO: renamed from: ۧ */
    public List f59603;

    public C19588(byte[] bArr) {
        C16234 c16234 = (C16234) C17004.m38594(((C24361) C17004.m38594(ByteBuffer.wrap(bArr), C24361.class)).f77140.m53736(), C16234.class);
        this.f59602 = c16234;
        this.f59603 = m44502(c16234.f47780);
    }

    /* JADX INFO: renamed from: ֫ */
    public final X509Certificate[] m44505() {
        List list = this.f59603;
        if (list.isEmpty()) {
            return null;
        }
        return (X509Certificate[]) list.toArray(new X509Certificate[0]);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x001e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m44504(byte[] bArr) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CertificateException, C18917 {
        char c;
        X509Certificate x509Certificate;
        String str;
        C16234 c16234 = this.f59602;
        if (c16234.f47784.isEmpty()) {
            return false;
        }
        List listM44502 = m44502(c16234.f47780);
        int i = 0;
        for (C8859 c8859 : c16234.f47784) {
            String str2 = c8859.f24030.f21907;
            String str3 = c8859.f24035.f21907;
            C24952 c24952 = c8859.f24031;
            Iterator it = listM44502.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c = 0;
                    x509Certificate = null;
                    break;
                }
                x509Certificate = (X509Certificate) it.next();
                C9609 c9609 = c24952.f79677;
                if (c9609 != null) {
                    ByteBuffer byteBufferM53736 = c9609.f26476.m53736();
                    byte[] bArr2 = new byte[byteBufferM53736.remaining()];
                    byteBufferM53736.get(bArr2);
                    X500Principal x500Principal = new X500Principal(bArr2);
                    if (c9609.f26475.equals(x509Certificate.getSerialNumber()) && x500Principal.equals(x509Certificate.getIssuerX500Principal())) {
                        c = 0;
                        break;
                    }
                }
            }
            if (x509Certificate == null) {
                throw new SignatureException("Signing certificate referenced in SignerInfo not found in SignedData");
            }
            if (x509Certificate.hasUnsupportedCriticalExtension()) {
                throw new SignatureException("Signing certificate has unsupported critical extensions");
            }
            boolean[] keyUsage = x509Certificate.getKeyUsage();
            if (keyUsage != null) {
                boolean z = keyUsage.length >= 1 && keyUsage[c];
                boolean z2 = keyUsage.length >= 2 && keyUsage[1];
                if (!z && !z2) {
                    throw new SignatureException("Signing certificate not authorized for use in digital signatures: keyUsage extension missing digitalSignature and nonRepudiation");
                }
            }
            String strM53357 = (String) f59601.get(str3);
            if (strM53357 == null) {
                if ("1.2.840.113549.1.1.1".equals(str3)) {
                    str = C0187d.f883a;
                } else if (C8268.f21906.equals(str3)) {
                    str = "DSA";
                } else {
                    if (!C8268.f21899.equals(str3)) {
                        throw new SignatureException(C20865.m47154("Unsupported JCA Signature algorithm . Digest algorithm: ", str2, ", signature algorithm: ", str3));
                    }
                    str = "ECDSA";
                }
                String strM44501 = m44501(str2);
                if (strM44501.startsWith("SHA-")) {
                    strM44501 = C21459.m48621(4, strM44501, new StringBuilder("SHA"));
                }
                strM53357 = C24104.m53357(strM44501, "with", str);
            }
            Signature signature = Signature.getInstance(strM53357);
            signature.initVerify(x509Certificate.getPublicKey());
            C24381 c24381 = c8859.f24034;
            if (c24381 != null) {
                try {
                    C18246 c18246 = new C18246(C17004.m38609(c24381.m53736()));
                    String strM41508 = c18246.m41508();
                    if (strM41508 == null) {
                        throw new SignatureException("No Content Type in signed attributes");
                    }
                    if (strM41508.equals(c16234.f47785.f44760)) {
                        byte[] bArrM41509 = c18246.m41509();
                        if (bArrM41509 == null) {
                            throw new SignatureException("No content digest in signed attributes");
                        }
                        if (Arrays.equals(bArrM41509, MessageDigest.getInstance(m44501(str2)).digest(bArr))) {
                            ByteBuffer byteBufferM53737 = c8859.f24034.m53736();
                            signature.update((byte) 49);
                            byteBufferM53737.position(1);
                            signature.update(byteBufferM53737);
                        }
                        if (x509Certificate != null) {
                            i++;
                        }
                    }
                    x509Certificate = null;
                    if (x509Certificate != null) {
                        i++;
                    }
                } catch (C23711 e) {
                    throw new SignatureException("Failed to parse signed attributes", e);
                }
            } else {
                signature.update(bArr);
            }
            ByteBuffer byteBufferSlice = c8859.f24033.slice();
            byte[] bArr3 = new byte[byteBufferSlice.remaining()];
            byteBufferSlice.get(bArr3);
            if (!signature.verify(bArr3)) {
                x509Certificate = null;
            }
            if (x509Certificate != null) {
                i++;
            }
        }
        return i == c16234.f47784.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m44502(List list) throws CertificateException {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ByteBuffer byteBufferM53736 = ((C24381) list.get(i)).m53736();
            byte[] bArr = new byte[byteBufferM53736.remaining()];
            byteBufferM53736.get(bArr);
            try {
                arrayList.add(new C17575(C4836.m10262(bArr), bArr));
            } catch (CertificateException e) {
                throw new CertificateException("Failed to parse certificate #" + (i + 1), e);
            }
        }
        return arrayList;
    }

    static {
        HashMap map = new HashMap();
        f59600 = map;
        map.put("1.2.840.113549.2.5", "MD5");
        map.put(C8268.f21904, "SHA-1");
        map.put("2.16.840.1.101.3.4.2.4", "SHA-224");
        map.put(C8268.f21903, XMSSKeyParameters.SHA_256);
        map.put("2.16.840.1.101.3.4.2.2", "SHA-384");
        map.put("2.16.840.1.101.3.4.2.3", XMSSKeyParameters.SHA_512);
        HashMap map2 = new HashMap();
        f59601 = map2;
        map2.put("1.2.840.113549.1.1.4", "MD5withRSA");
        map2.put("1.2.840.113549.1.1.5", "SHA1withRSA");
        map2.put("1.2.840.113549.1.1.14", "SHA224withRSA");
        map2.put("1.2.840.113549.1.1.11", "SHA256withRSA");
        map2.put("1.2.840.113549.1.1.12", "SHA384withRSA");
        map2.put("1.2.840.113549.1.1.13", "SHA512withRSA");
        map2.put("1.2.840.10040.4.3", "SHA1withDSA");
        map2.put("2.16.840.1.101.3.4.3.1", "SHA224withDSA");
        map2.put(C8268.f21900, "SHA256withDSA");
        map2.put("2.16.840.1.101.3.4.3.3", "SHA384withDSA");
        map2.put("2.16.840.1.101.3.4.3.4", "SHA512withDSA");
        map2.put("2.16.840.1.101.3.4.3.5", "SHA3-224withDSA");
        map2.put("2.16.840.1.101.3.4.3.6", "SHA3-256withDSA");
        map2.put("2.16.840.1.101.3.4.3.7", "SHA3-384withDSA");
        map2.put("2.16.840.1.101.3.4.3.8", "SHA3-512withDSA");
        map2.put("2.16.840.1.101.3.4.3.9", "SHA3-224withECDSA");
        map2.put("2.16.840.1.101.3.4.3.10", "SHA3-256withECDSA");
        map2.put("2.16.840.1.101.3.4.3.11", "SHA3-384withECDSA");
        map2.put("2.16.840.1.101.3.4.3.12", "SHA3-512withECDSA");
        map2.put("2.16.840.1.101.3.4.3.13", "SHA3-224withRSA");
        map2.put("2.16.840.1.101.3.4.3.14", "SHA3-256withRSA");
        map2.put("2.16.840.1.101.3.4.3.15", "SHA3-384withRSA");
        map2.put("2.16.840.1.101.3.4.3.16", "SHA3-512withRSA");
        map2.put("1.2.840.10045.4.1", "SHA1withECDSA");
        map2.put("1.2.840.10045.4.3.1", "SHA224withECDSA");
        map2.put("1.2.840.10045.4.3.2", "SHA256withECDSA");
        map2.put("1.2.840.10045.4.3.3", "SHA384withECDSA");
        map2.put("1.2.840.10045.4.3.4", "SHA512withECDSA");
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m44501(String str) throws SignatureException {
        String str2 = (String) f59600.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new SignatureException(C21466.m48631("Unsupported digest algorithm: ", str));
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m44503(String str) {
        return (String) f59601.get(str);
    }
}
