package l;

import com.alipay.sdk.m.p.d;
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
public final class C18118 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final HashMap f56387;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final HashMap f56388;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14589 f56389;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f56390;

    public C18118(byte[] bArr) {
        C14589 c14589 = (C14589) C15399.m36436(((C23140) C15399.m36436(ByteBuffer.wrap(bArr), C23140.class)).f74394.m51340(), C14589.class);
        this.f56389 = c14589;
        this.f56390 = m42243(c14589.f44672);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final X509Certificate[] m42246() {
        List list = this.f56390;
        if (list.isEmpty()) {
            return null;
        }
        return (X509Certificate[]) list.toArray(new X509Certificate[0]);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x001e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42245(byte[] bArr) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, CertificateException, C17412 {
        char c;
        X509Certificate x509Certificate;
        String str;
        C14589 c14589 = this.f56389;
        if (c14589.f44676.isEmpty()) {
            return false;
        }
        List listM42243 = m42243(c14589.f44672);
        int i = 0;
        for (C6829 c6829 : c14589.f44676) {
            String str2 = c6829.f21153.f19046;
            String str3 = c6829.f21158.f19046;
            C23762 c23762 = c6829.f21154;
            Iterator it = listM42243.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c = 0;
                    x509Certificate = null;
                    break;
                }
                x509Certificate = (X509Certificate) it.next();
                C7618 c7618 = c23762.f76925;
                if (c7618 != null) {
                    ByteBuffer byteBufferM51340 = c7618.f23563.m51340();
                    byte[] bArr2 = new byte[byteBufferM51340.remaining()];
                    byteBufferM51340.get(bArr2);
                    X500Principal x500Principal = new X500Principal(bArr2);
                    if (c7618.f23562.equals(x509Certificate.getSerialNumber()) && x500Principal.equals(x509Certificate.getIssuerX500Principal())) {
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
            String strM50967 = (String) f56388.get(str3);
            if (strM50967 == null) {
                if ("1.2.840.113549.1.1.1".equals(str3)) {
                    str = d.a;
                } else if (C6207.f19045.equals(str3)) {
                    str = "DSA";
                } else {
                    if (!C6207.f19038.equals(str3)) {
                        throw new SignatureException(C19462.m44858("Unsupported JCA Signature algorithm . Digest algorithm: ", str2, ", signature algorithm: ", str3));
                    }
                    str = "ECDSA";
                }
                String strM42242 = m42242(str2);
                if (strM42242.startsWith("SHA-")) {
                    strM42242 = C20087.m46305(4, strM42242, new StringBuilder("SHA"));
                }
                strM50967 = C22870.m50967(strM42242, "with", str);
            }
            Signature signature = Signature.getInstance(strM50967);
            signature.initVerify(x509Certificate.getPublicKey());
            C23161 c23161 = c6829.f21157;
            if (c23161 != null) {
                try {
                    C16706 c16706 = new C16706(C15399.m36451(c23161.m51340()));
                    String strM39272 = c16706.m39272();
                    if (strM39272 == null) {
                        throw new SignatureException("No Content Type in signed attributes");
                    }
                    if (strM39272.equals(c14589.f44677.f41680)) {
                        byte[] bArrM39273 = c16706.m39273();
                        if (bArrM39273 == null) {
                            throw new SignatureException("No content digest in signed attributes");
                        }
                        if (Arrays.equals(bArrM39273, MessageDigest.getInstance(m42242(str2)).digest(bArr))) {
                            ByteBuffer byteBufferM51341 = c6829.f21157.m51340();
                            signature.update((byte) 49);
                            byteBufferM51341.position(1);
                            signature.update(byteBufferM51341);
                        }
                        if (x509Certificate != null) {
                            i++;
                        }
                    }
                    x509Certificate = null;
                    if (x509Certificate != null) {
                        i++;
                    }
                } catch (C22456 e) {
                    throw new SignatureException("Failed to parse signed attributes", e);
                }
            } else {
                signature.update(bArr);
            }
            ByteBuffer byteBufferSlice = c6829.f21156.slice();
            byte[] bArr3 = new byte[byteBufferSlice.remaining()];
            byteBufferSlice.get(bArr3);
            if (!signature.verify(bArr3)) {
                x509Certificate = null;
            }
            if (x509Certificate != null) {
                i++;
            }
        }
        return i == c14589.f44676.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m42243(List list) throws CertificateException {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ByteBuffer byteBufferM51340 = ((C23161) list.get(i)).m51340();
            byte[] bArr = new byte[byteBufferM51340.remaining()];
            byteBufferM51340.get(bArr);
            try {
                arrayList.add(new C16000(C2596.m8223(bArr), bArr));
            } catch (CertificateException e) {
                throw new CertificateException("Failed to parse certificate #" + (i + 1), e);
            }
        }
        return arrayList;
    }

    static {
        HashMap map = new HashMap();
        f56387 = map;
        map.put("1.2.840.113549.2.5", "MD5");
        map.put(C6207.f19043, "SHA-1");
        map.put("2.16.840.1.101.3.4.2.4", "SHA-224");
        map.put(C6207.f19042, XMSSKeyParameters.SHA_256);
        map.put("2.16.840.1.101.3.4.2.2", "SHA-384");
        map.put("2.16.840.1.101.3.4.2.3", XMSSKeyParameters.SHA_512);
        HashMap map2 = new HashMap();
        f56388 = map2;
        map2.put("1.2.840.113549.1.1.4", "MD5withRSA");
        map2.put("1.2.840.113549.1.1.5", "SHA1withRSA");
        map2.put("1.2.840.113549.1.1.14", "SHA224withRSA");
        map2.put("1.2.840.113549.1.1.11", "SHA256withRSA");
        map2.put("1.2.840.113549.1.1.12", "SHA384withRSA");
        map2.put("1.2.840.113549.1.1.13", "SHA512withRSA");
        map2.put("1.2.840.10040.4.3", "SHA1withDSA");
        map2.put("2.16.840.1.101.3.4.3.1", "SHA224withDSA");
        map2.put(C6207.f19039, "SHA256withDSA");
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m42242(String str) throws SignatureException {
        String str2 = (String) f56387.get(str);
        if (str2 != null) {
            return str2;
        }
        throw new SignatureException(C20094.m46315("Unsupported digest algorithm: ", str));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m42244(String str) {
        return (String) f56388.get(str);
    }
}
