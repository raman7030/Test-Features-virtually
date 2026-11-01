package p067l;

import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p037n.C0172c;
import com.alipay.sdk.p010m.p058y.C0249l;
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
public final class C3166 {

    /* JADX INFO: renamed from: ֫ */
    public final String f5807;

    /* JADX INFO: renamed from: ۧ */
    public final String f5808;

    /* JADX INFO: renamed from: ܽ */
    public final String f5809;

    public C3166(String str, String str2, String str3) {
        this.f5808 = str.concat(".r2.cloudflarestorage.com");
        this.f5807 = str2;
        this.f5809 = str3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m5432() {
        StringBuilder sb = new StringBuilder("https://");
        String str = this.f5808;
        String strM25286 = C10965.m25286(sb, str, "/");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AWS4Signer.TIME_PATTERN);
        simpleDateFormat.setTimeZone(C5468.getTimeZone(UtcDates.UTC));
        String str2 = simpleDateFormat.format(new Date());
        String strSubstring = str2.substring(0, 8);
        String strM5429 = m5429("");
        TreeMap treeMap = new TreeMap();
        treeMap.put(C0172c.f710f, str);
        treeMap.put("x-amz-content-sha256", strM5429);
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
                sb3.append((CharSequence) C0249l.f1196b);
            }
        }
        String string2 = sb3.toString();
        StringBuilder sbM12525 = C5633.m12525("GET\n/\n\n", string, "\n", string2, "\n");
        sbM12525.append(strM5429);
        String string3 = sbM12525.toString();
        String strM40053 = C17588.m40053(strSubstring, "/auto/s3/aws4_request");
        StringBuilder sbM12526 = C5633.m12525("AWS4-HMAC-SHA256\n", str2, "\n", strM40053, "\n");
        sbM12526.append(m5429(string3));
        try {
            String strM5430 = m5430(m5431(sbM12526.toString(), m5431(AWS4Signer.TERMINATOR, m5431("s3", m5431("auto", m5431(strSubstring, ("AWS4" + this.f5809).getBytes(StandardCharsets.UTF_8)))))));
            StringBuilder sb4 = new StringBuilder("AWS4-HMAC-SHA256 Credential=");
            ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb4, this.f5807, "/", strM40053, ", SignedHeaders=");
            String strM53894 = C24420.m53894(sb4, string2, ", Signature=", strM5430);
            C11349 c11349 = new C11349();
            c11349.m26292(strM25286);
            c11349.m26286("Host", str);
            c11349.m26286("X-Amz-Content-Sha256", strM5429);
            c11349.m26286("X-Amz-Date", str2);
            c11349.m26286("Authorization", strM53894);
            C20066 c20066Execute = C7050.m16220().m42716(c11349.m26284()).execute();
            try {
                if (!c20066Execute.m45439()) {
                    if (c20066Execute.m45443() != 401 && c20066Execute.m45443() != 403) {
                        throw new IOException("Request failed: " + c20066Execute.m45443() + " " + c20066Execute.m45437());
                    }
                    throw new C20807(R.string.MT_Protector);
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(c20066Execute.m45436().m4011()).getElementsByTagName("Bucket");
                    for (int i = 0; i < elementsByTagName.getLength(); i++) {
                        Node nodeItem = elementsByTagName.item(i);
                        if (nodeItem.getNodeType() == 1) {
                            arrayList.add(new C8232(C24325.m53684("Name", (Element) nodeItem), null, str));
                        }
                    }
                    c20066Execute.close();
                    return arrayList;
                } catch (Exception e) {
                    throw new RuntimeException("Failed to parse ListBuckets response", e);
                }
            } catch (Throwable th) {
                try {
                    c20066Execute.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e2) {
            throw new RuntimeException("Failed to generate HMAC signature", e2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m5431(String str, byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        return mac.doFinal(str.getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m5429(String str) {
        try {
            return m5430(MessageDigest.getInstance(XMSSKeyParameters.SHA_256).digest(str.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m5430(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }
}
