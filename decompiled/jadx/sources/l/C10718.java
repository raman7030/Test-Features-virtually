package l;

import bin.mt.plus.R;
import java.io.IOException;
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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: l.ۧۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: D80C */
/* JADX INFO: loaded from: classes3.dex */
public final class C10718 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f32301;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f32302;

    public C10718(String str, String str2) {
        this.f32301 = str;
        this.f32302 = str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m26897() throws NoSuchAlgorithmException, InvalidKeyException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(C3261.getTimeZone("GMT"));
        String str = simpleDateFormat.format(new Date());
        String strM14172 = C4860.m14172("GET\n\n\n", str, "\n/");
        Mac mac = Mac.getInstance("HmacSHA1");
        Charset charset = StandardCharsets.UTF_8;
        mac.init(new SecretKeySpec(this.f32302.getBytes(charset), "HmacSHA1"));
        String strM51498 = C23202.m51498(new StringBuilder("OBS "), this.f32301, ":", C19490.getEncoder().encodeToString(mac.doFinal(strM14172.getBytes(charset))));
        C9449 c9449 = new C9449();
        c9449.m24282("https://obs.cn-north-4.myhuaweicloud.com/");
        c9449.m24281();
        c9449.m24283("Date", str);
        c9449.m24283("Authorization", strM51498);
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
                        Element element = (Element) nodeItem;
                        String strM51290 = C23102.m51290("Name", element);
                        String strM51291 = C23102.m51290("Location", element);
                        arrayList.add(new C6169(strM51290, strM51291, "obs." + strM51291 + ".myhuaweicloud.com"));
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
    }
}
