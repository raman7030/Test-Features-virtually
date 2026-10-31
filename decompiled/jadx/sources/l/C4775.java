package l;

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
public final class C4775 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ByteArrayOutputStream f15147 = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f15149 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ByteArrayOutputStream f15148 = new ByteArrayOutputStream();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f15150 = null;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ByteArrayOutputStream f15151 = new ByteArrayOutputStream();

    /* JADX WARN: Code duplicated, block: B:58:0x0204  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13947(ConcurrentMapC10942 concurrentMapC10942, AbstractC13262 abstractC13262, EnumC13782 enumC13782, C7433 c7433, String str, boolean z, boolean z2, long j, C23825 c23825) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException {
        String str2;
        String upperCase;
        long size = concurrentMapC10942.size() + 2;
        long j2 = j / size;
        long j3 = j - (size * j2);
        c23825.m52516(j2);
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
        ByteArrayOutputStream byteArrayOutputStream = this.f15147;
        AbstractC18181.m42410(byteArrayOutputStream, name, value);
        if (attributes.size() > 1) {
            TreeMap treeMapM42407 = AbstractC18181.m42407(attributes);
            treeMapM42407.remove(name.toString());
            AbstractC18181.m42412(byteArrayOutputStream, treeMapM42407);
        }
        AbstractC18181.m42408(byteArrayOutputStream);
        ArrayList arrayList = new ArrayList(concurrentMapC10942.keySet());
        Collections.sort(arrayList);
        String strM10283 = C3364.m10283(enumC13782);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            Iterator it2 = it;
            byte[] bArr = (byte[]) concurrentMapC10942.get(str3);
            Attributes attributes2 = new Attributes();
            long j4 = j3;
            attributes2.putValue(strM10283, Base64.encodeToString(bArr, 2));
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            AbstractC18181.m42409(byteArrayOutputStream2, str3, attributes2);
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
        MessageDigest messageDigest = MessageDigest.getInstance(enumC13782.m33093());
        int i = C20298.f65554[enumC13782.ordinal()];
        if (i == 1) {
            str2 = "SHA1-Digest-Manifest";
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unexpected content digest algorithm: " + enumC13782);
            }
            str2 = "SHA-256-Digest-Manifest";
        }
        attributes3.putValue(str2, Base64.encodeToString(messageDigest.digest(byteArrayOutputStream.toByteArray()), 2));
        Attributes.Name name2 = Attributes.Name.SIGNATURE_VERSION;
        String value2 = attributes3.getValue(name2);
        if (value2 == null) {
            throw new IllegalArgumentException("Mandatory " + name2 + " attribute missing");
        }
        ByteArrayOutputStream byteArrayOutputStream3 = this.f15148;
        AbstractC18181.m42410(byteArrayOutputStream3, name2, value2);
        if (attributes3.size() > 1) {
            TreeMap treeMapM42408 = AbstractC18181.m42407(attributes3);
            treeMapM42408.remove(name2.toString());
            AbstractC18181.m42412(byteArrayOutputStream3, treeMapM42408);
        }
        AbstractC18181.m42408(byteArrayOutputStream3);
        String strM10284 = C3364.m10283(enumC13782);
        for (Map.Entry entry : treeMap.entrySet()) {
            c23825.m52516(j2);
            String str4 = (String) entry.getKey();
            byte[] bArrDigest = messageDigest.digest((byte[]) entry.getValue());
            Attributes attributes4 = new Attributes();
            attributes4.putValue(strM10284, Base64.encodeToString(bArrDigest, 2));
            AbstractC18181.m42409(byteArrayOutputStream3, str4, attributes4);
        }
        if (byteArrayOutputStream3.size() > 0 && byteArrayOutputStream3.size() % 1024 == 0) {
            AbstractC18181.m42408(byteArrayOutputStream3);
        }
        c23825.m52516(j2 + j5);
        X509Certificate x509CertificateM32197 = abstractC13262.m32197();
        InterfaceC16241 interfaceC16241M17127 = C6207.m17127(x509CertificateM32197.getPublicKey(), enumC13782, false);
        Signature signature = Signature.getInstance((String) interfaceC16241M17127.first());
        signature.initSign(abstractC13262.m32193());
        signature.update(byteArrayOutputStream3.toByteArray());
        byte[] bArrSign = signature.sign();
        String str5 = c7433.f22850;
        if (str5 != null && str5.equals("catch_.me_.if_.you_.can_")) {
            upperCase = "CERT";
        } else if (TextUtils.isEmpty(str)) {
            Matcher matcher = Pattern.compile("CN=([^,\\s]+)").matcher(x509CertificateM32197.getIssuerX500Principal().toString());
            String strGroup = matcher.find() ? matcher.group(1) : null;
            if (strGroup == null || !strGroup.matches("[a-zA-Z0-9_\\-]+")) {
                upperCase = "CERT";
            } else {
                upperCase = strGroup.toUpperCase();
            }
        } else {
            upperCase = str;
        }
        this.f15149 = C4860.m14172("META-INF/", upperCase, ".SF");
        StringBuilder sbM9834 = C3200.m9834("META-INF/", upperCase, ".");
        sbM9834.append(x509CertificateM32197.getPublicKey().getAlgorithm().toUpperCase(Locale.US));
        this.f15150 = sbM9834.toString();
        C6829 c6829 = new C6829();
        c6829.f21159 = 1;
        c6829.f21154 = new C23762(new C7618(new C23161(x509CertificateM32197.getIssuerX500Principal().getEncoded()), x509CertificateM32197.getSerialNumber()));
        C6207 c6207M17125 = C6207.m17125(enumC13782);
        C6207 c6207 = (C6207) interfaceC16241M17127.mo15809();
        c6829.f21153 = c6207M17125;
        c6829.f21158 = c6207;
        c6829.f21156 = ByteBuffer.wrap(bArrSign);
        C14589 c14589 = new C14589();
        ArrayList arrayList2 = new ArrayList(1);
        c14589.f44672 = arrayList2;
        arrayList2.add(new C23161(x509CertificateM32197.getEncoded()));
        c14589.f44674 = 1;
        c14589.f44675 = Collections.singletonList(c6207M17125);
        c14589.f44677 = new C13967("1.2.840.113549.1.7.1");
        c14589.f44676 = Collections.singletonList(c6829);
        C23140 c23140 = new C23140();
        c23140.f74395 = "1.2.840.113549.1.7.2";
        c23140.f74394 = new C23161(C10462.m26341(c14589));
        this.f15151.write(C10462.m26341(c23140));
    }
}
