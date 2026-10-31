package l;

import bin.mt.plus.R;
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
public final class C16361 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f50347;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f50348;

    public C16361(String str, String str2) {
        this.f50347 = str;
        this.f50348 = str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m38505(InputStream inputStream) {
        try {
            NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getElementsByTagName("Bucket");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element = (Element) elementsByTagName.item(i);
                arrayList.add(new C6169(element.getElementsByTagName("Name").item(0).getTextContent(), element.getElementsByTagName("Location").item(0).getTextContent(), element.getElementsByTagName("ExtranetEndpoint").item(0).getTextContent()));
            }
            return arrayList;
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse ListBuckets response", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m38506() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(C3261.getTimeZone("GMT"));
        String str = simpleDateFormat.format(new Date());
        String str2 = this.f50348;
        String strM14172 = C4860.m14172("GET\n\n\n", str, "\n/");
        try {
            Charset charset = StandardCharsets.UTF_8;
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(charset), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            String strEncodeToString = C19490.getEncoder().encodeToString(mac.doFinal(strM14172.getBytes(charset)));
            C9449 c9449 = new C9449();
            c9449.m24282("https://oss-cn-hangzhou.aliyuncs.com");
            c9449.m24277("GET", (AbstractC2393) null);
            c9449.m24276("Date", str);
            c9449.m24276("Authorization", C23202.m51498(new StringBuilder("OSS "), this.f50347, ":", strEncodeToString));
            C18621 c18621Execute = C4925.m14323().m40469(c9449.m24274()).execute();
            try {
                if (c18621Execute.m43173()) {
                    AbstractC0275 abstractC0275M43170 = c18621Execute.m43170();
                    C11003.requireNonNull(abstractC0275M43170);
                    ArrayList arrayListM38505 = m38505(abstractC0275M43170.m1611());
                    c18621Execute.close();
                    return arrayListM38505;
                }
                if (c18621Execute.m43177() != 401 && c18621Execute.m43177() != 403) {
                    throw new IOException("Request failed: " + c18621Execute.m43177() + " " + c18621Execute.m43171());
                }
                throw new C19401(R.string.MT_Protector);
            } catch (Throwable th) {
                try {
                    c18621Execute.close();
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
