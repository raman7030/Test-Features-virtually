package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.y.l;
import com.amazonaws.auth.AWS4Signer;
import com.google.android.material.datepicker.UtcDates;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.parsers.DocumentBuilderFactory;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: l.֨ۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J7U0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0839 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f3033;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f3034;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f3035;

    public C0839(String str, String str2, String str3) {
        this.f3034 = str.concat(".r2.cloudflarestorage.com");
        this.f3033 = str2;
        this.f3035 = str3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m3118() {
        StringBuilder sb = new StringBuilder("https://");
        String str = this.f3034;
        String strM23341 = C9045.m23341(sb, str, "/");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AWS4Signer.TIME_PATTERN);
        simpleDateFormat.setTimeZone(C3261.getTimeZone(UtcDates.UTC));
        String str2 = simpleDateFormat.format(new Date());
        String strSubstring = str2.substring(0, 8);
        String strM3115 = m3115("");
        TreeMap treeMap = new TreeMap();
        treeMap.put(c.f, str);
        treeMap.put("x-amz-content-sha256", strM3115);
        treeMap.put("x-amz-date", str2);
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : treeMap.keySet()) {
            sb2.append(str3.toLowerCase());
            sb2.append(":");
            sb2.append(((String) treeMap.get(str3)).trim());
            sb2.append("\n");
        }
        String string = sb2.toString();
        Set setKeySet = treeMap.keySet();
        StringBuilder sb3 = new StringBuilder();
        Iterator it = setKeySet.iterator();
        if (it.hasNext()) {
            while (true) {
                sb3.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb3.append((CharSequence) l.b);
            }
        }
        String string2 = sb3.toString();
        StringBuilder sbM10501 = C3435.m10501("GET\n/\n\n", string, "\n", string2, "\n");
        sbM10501.append(strM3115);
        String string3 = sbM10501.toString();
        String strM37867 = C16014.m37867(strSubstring, "/auto/s3/aws4_request");
        StringBuilder sbM10502 = C3435.m10501("AWS4-HMAC-SHA256\n", str2, "\n", strM37867, "\n");
        sbM10502.append(m3115(string3));
        try {
            String strM3116 = m3116(m3117(sbM10502.toString(), m3117(AWS4Signer.TERMINATOR, m3117("s3", m3117("auto", m3117(strSubstring, ("AWS4" + this.f3035).getBytes(StandardCharsets.UTF_8)))))));
            StringBuilder sb4 = new StringBuilder("AWS4-HMAC-SHA256 Credential=");
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb4, this.f3033, "/", strM37867, ", SignedHeaders=");
            String strM51498 = C23202.m51498(sb4, string2, ", Signature=", strM3116);
            C9449 c9449 = new C9449();
            c9449.m24282(strM23341);
            c9449.m24276("Host", str);
            c9449.m24276("X-Amz-Content-Sha256", strM3115);
            c9449.m24276("X-Amz-Date", str2);
            c9449.m24276("Authorization", strM51498);
            C18621 c18621Execute = C4925.m14323().m40469(c9449.m24274()).execute();
            try {
                if (!c18621Execute.m43173()) {
                    if (c18621Execute.m43177() != 401 && c18621Execute.m43177() != 403) {
                        throw new IOException("Request failed: " + c18621Execute.m43177() + " " + c18621Execute.m43171());
                    }
                    throw new C19401(R.string.MT_Protector);
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(c18621Execute.m43170().m1611()).getElementsByTagName("Bucket");
                    for (int i = 0; i < elementsByTagName.getLength(); i++) {
                        Node nodeItem = elementsByTagName.item(i);
                        if (nodeItem.getNodeType() == 1) {
                            arrayList.add(new C6169(C23102.m51290("Name", (Element) nodeItem), null, str));
                        }
                    }
                    c18621Execute.close();
                    return arrayList;
                } catch (Exception e) {
                    throw new RuntimeException("Failed to parse ListBuckets response", e);
                }
            } catch (Throwable th) {
                try {
                    c18621Execute.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e2) {
            throw new RuntimeException("Failed to generate HMAC signature", e2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m3117(String str, byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        return mac.doFinal(str.getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m3115(String str) {
        try {
            return m3116(MessageDigest.getInstance(XMSSKeyParameters.SHA_256).digest(str.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m3116(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }
}
