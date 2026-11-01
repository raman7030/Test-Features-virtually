package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: l.ܽۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z83J */
/* JADX INFO: loaded from: classes4.dex */
public final class C17918 {

    /* JADX INFO: renamed from: ֫ */
    public final String f53520;

    /* JADX INFO: renamed from: ۧ */
    public final String f53521;

    public C17918(String str, String str2) {
        this.f53520 = str;
        this.f53521 = str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m40722(InputStream inputStream) {
        try {
            NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getElementsByTagName("Bucket");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element = (Element) elementsByTagName.item(i);
                arrayList.add(new C8232(element.getElementsByTagName("Name").item(0).getTextContent(), element.getElementsByTagName("Location").item(0).getTextContent(), element.getElementsByTagName("ExtranetEndpoint").item(0).getTextContent()));
            }
            return arrayList;
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse ListBuckets response", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m40723() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(C5468.getTimeZone("GMT"));
        String str = simpleDateFormat.format(new Date());
        String str2 = this.f53521;
        String strM16053 = C6988.m16053("GET\n\n\n", str, "\n/");
        try {
            Charset charset = StandardCharsets.UTF_8;
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(charset), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            String strEncodeToString = C20892.getEncoder().encodeToString(mac.doFinal(strM16053.getBytes(charset)));
            C11349 c11349 = new C11349();
            c11349.m26292("https://oss-cn-hangzhou.aliyuncs.com");
            c11349.m26287("GET", (AbstractC4643) null);
            c11349.m26286("Date", str);
            c11349.m26286("Authorization", C24420.m53894(new StringBuilder("OSS "), this.f53520, ":", strEncodeToString));
            C20066 c20066Execute = C7050.m16220().m42716(c11349.m26284()).execute();
            try {
                if (c20066Execute.m45439()) {
                    AbstractC2630 abstractC2630M45436 = c20066Execute.m45436();
                    C12826.requireNonNull(abstractC2630M45436);
                    ArrayList arrayListM40722 = m40722(abstractC2630M45436.m4011());
                    c20066Execute.close();
                    return arrayListM40722;
                }
                if (c20066Execute.m45443() != 401 && c20066Execute.m45443() != 403) {
                    throw new IOException("Request failed: " + c20066Execute.m45443() + " " + c20066Execute.m45437());
                }
                throw new C20807(R.string.MT_Protector);
            } catch (Throwable th) {
                try {
                    c20066Execute.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new RuntimeException("Failed to generate HMAC signature", e);
        }
    }
}
