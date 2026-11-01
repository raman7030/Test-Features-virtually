package p067l;

import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.jar.Attributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۙܽᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1W7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6907 {

    /* JADX INFO: renamed from: ֫ */
    public ByteArrayOutputStream f17977 = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: ܽ */
    public String f17979 = null;

    /* JADX INFO: renamed from: ۧ */
    public ByteArrayOutputStream f17978 = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: ܿ */
    public String f17980 = null;

    /* JADX INFO: renamed from: ᩳ */
    public ByteArrayOutputStream f17981 = new ByteArrayOutputStream();

    /* JADX WARN: Code duplicated, block: B:58:0x0204  */
    /* JADX INFO: renamed from: ֫ */
    public final void m15827(ConcurrentMapC12768 concurrentMapC12768, AbstractC14973 abstractC14973, EnumC15467 enumC15467, C9433 c9433, String str, boolean z, boolean z2, long j, C25012 c25012) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException {
        String str2;
        String upperCase;
        long size = concurrentMapC12768.size() + 2;
        long j2 = j / size;
        long j3 = j - (size * j2);
        c25012.m54925(j2);
        TreeMap treeMap = new TreeMap();
        Attributes attributes = new Attributes();
        attributes.putValue("Manifest-Version", "1.0");
        attributes.putValue("Built-By", "Signflinger");
        attributes.putValue("Created-By", "Android Gradle 8.0.2");
        Attributes.Name name = Attributes.Name.MANIFEST_VERSION;
        String value = attributes.getValue(name);
        if (value == null) {
            throw new IllegalArgumentException("Mandatory " + name + " attribute missing");
        }
        ByteArrayOutputStream byteArrayOutputStream = this.f17977;
        AbstractC19648.m44671(byteArrayOutputStream, name, value);
        if (attributes.size() > 1) {
            TreeMap treeMapM44668 = AbstractC19648.m44668(attributes);
            treeMapM44668.remove(name.toString());
            AbstractC19648.m44673(byteArrayOutputStream, treeMapM44668);
        }
        AbstractC19648.m44669(byteArrayOutputStream);
        ArrayList arrayList = new ArrayList(concurrentMapC12768.keySet());
        Collections.sort(arrayList);
        String strM12320 = C5566.m12320(enumC15467);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            Iterator it2 = it;
            byte[] bArr = (byte[]) concurrentMapC12768.get(str3);
            Attributes attributes2 = new Attributes();
            long j4 = j3;
            attributes2.putValue(strM12320, Base64.encodeToString(bArr, 2));
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            AbstractC19648.m44670(byteArrayOutputStream2, str3, attributes2);
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            byteArrayOutputStream.write(byteArray);
            treeMap.put(str3, byteArray);
            it = it2;
            j3 = j4;
        }
        long j5 = j3;
        Attributes attributes3 = new Attributes();
        attributes3.putValue("Signature-Version", "1.0");
        attributes3.putValue("Created-By", "Android Gradle 8.0.2");
        if (z || z2) {
            if (z && z2) {
                attributes3.putValue("X-Android-APK-Signed", "2,3");
            } else if (z) {
                attributes3.putValue("X-Android-APK-Signed", "2");
            } else {
                attributes3.putValue("X-Android-APK-Signed", "3");
            }
        }
        MessageDigest messageDigest = MessageDigest.getInstance(enumC15467.m35209());
        int i = C21660.f68229[enumC15467.ordinal()];
        if (i == 1) {
            str2 = "SHA1-Digest-Manifest";
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unexpected content digest algorithm: " + enumC15467);
            }
            str2 = "SHA-256-Digest-Manifest";
        }
        attributes3.putValue(str2, Base64.encodeToString(messageDigest.digest(byteArrayOutputStream.toByteArray()), 2));
        Attributes.Name name2 = Attributes.Name.SIGNATURE_VERSION;
        String value2 = attributes3.getValue(name2);
        if (value2 == null) {
            throw new IllegalArgumentException("Mandatory " + name2 + " attribute missing");
        }
        ByteArrayOutputStream byteArrayOutputStream3 = this.f17978;
        AbstractC19648.m44671(byteArrayOutputStream3, name2, value2);
        if (attributes3.size() > 1) {
            TreeMap treeMapM44669 = AbstractC19648.m44668(attributes3);
            treeMapM44669.remove(name2.toString());
            AbstractC19648.m44673(byteArrayOutputStream3, treeMapM44669);
        }
        AbstractC19648.m44669(byteArrayOutputStream3);
        String strM12321 = C5566.m12320(enumC15467);
        for (Map.Entry entry : treeMap.entrySet()) {
            c25012.m54925(j2);
            String str4 = (String) entry.getKey();
            byte[] bArrDigest = messageDigest.digest((byte[]) entry.getValue());
            Attributes attributes4 = new Attributes();
            attributes4.putValue(strM12321, Base64.encodeToString(bArrDigest, 2));
            AbstractC19648.m44670(byteArrayOutputStream3, str4, attributes4);
        }
        if (byteArrayOutputStream3.size() > 0 && byteArrayOutputStream3.size() % 1024 == 0) {
            AbstractC19648.m44669(byteArrayOutputStream3);
        }
        c25012.m54925(j2 + j5);
        X509Certificate x509CertificateM34296 = abstractC14973.m34296();
        InterfaceC17804 interfaceC17804M19059 = C8268.m19059(x509CertificateM34296.getPublicKey(), enumC15467, false);
        Signature signature = Signature.getInstance((String) interfaceC17804M19059.first());
        signature.initSign(abstractC14973.m34292());
        signature.update(byteArrayOutputStream3.toByteArray());
        byte[] bArrSign = signature.sign();
        String str5 = c9433.f25763;
        if (str5 != null && str5.equals("catch_.me_.if_.you_.can_")) {
            upperCase = "CERT";
        } else if (TextUtils.isEmpty(str)) {
            Matcher matcher = Pattern.compile("CN=([^,\\s]+)").matcher(x509CertificateM34296.getIssuerX500Principal().toString());
            String strGroup = matcher.find() ? matcher.group(1) : null;
            if (strGroup == null || !strGroup.matches("[a-zA-Z0-9_\\-]+")) {
                upperCase = "CERT";
            } else {
                upperCase = strGroup.toUpperCase();
            }
        } else {
            upperCase = str;
        }
        this.f17979 = C6988.m16053("META-INF/", upperCase, ".SF");
        StringBuilder sbM11879 = C5410.m11879("META-INF/", upperCase, ".");
        sbM11879.append(x509CertificateM34296.getPublicKey().getAlgorithm().toUpperCase(Locale.US));
        this.f17980 = sbM11879.toString();
        C8859 c8859 = new C8859();
        c8859.f24036 = 1;
        c8859.f24031 = new C24952(new C9609(new C24381(x509CertificateM34296.getIssuerX500Principal().getEncoded()), x509CertificateM34296.getSerialNumber()));
        C8268 c8268M19057 = C8268.m19057(enumC15467);
        C8268 c8268 = (C8268) interfaceC17804M19059.mo17724();
        c8859.f24030 = c8268M19057;
        c8859.f24035 = c8268;
        c8859.f24033 = ByteBuffer.wrap(bArrSign);
        C16234 c16234 = new C16234();
        ArrayList arrayList2 = new ArrayList(1);
        c16234.f47780 = arrayList2;
        arrayList2.add(new C24381(x509CertificateM34296.getEncoded()));
        c16234.f47782 = 1;
        c16234.f47783 = Collections.singletonList(c8268M19057);
        c16234.f47785 = new C15643("1.2.840.113549.1.7.1");
        c16234.f47784 = Collections.singletonList(c8859);
        C24361 c24361 = new C24361();
        c24361.f77141 = "1.2.840.113549.1.7.2";
        c24361.f77140 = new C24381(C12312.m28371(c16234));
        this.f17981.write(C12312.m28371(c24361));
    }
}
