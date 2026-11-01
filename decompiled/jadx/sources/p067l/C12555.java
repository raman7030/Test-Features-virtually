package p067l;

import bin.p000mt.plus.R;
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
public final class C12555 {

    /* JADX INFO: renamed from: ֫ */
    public final String f35275;

    /* JADX INFO: renamed from: ۧ */
    public final String f35276;

    public C12555(String str, String str2) {
        this.f35275 = str;
        this.f35276 = str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m28937() throws NoSuchAlgorithmException, InvalidKeyException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(C5468.getTimeZone("GMT"));
        String str = simpleDateFormat.format(new Date());
        String strM16053 = C6988.m16053("GET\n\n\n", str, "\n/");
        Mac mac = Mac.getInstance("HmacSHA1");
        Charset charset = StandardCharsets.UTF_8;
        mac.init(new SecretKeySpec(this.f35276.getBytes(charset), "HmacSHA1"));
        String strM53894 = C24420.m53894(new StringBuilder("OBS "), this.f35275, ":", C20892.getEncoder().encodeToString(mac.doFinal(strM16053.getBytes(charset))));
        C11349 c11349 = new C11349();
        c11349.m26292("https://obs.cn-north-4.myhuaweicloud.com/");
        c11349.m26291();
        c11349.m26293("Date", str);
        c11349.m26293("Authorization", strM53894);
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
                        Element element = (Element) nodeItem;
                        String strM53684 = C24325.m53684("Name", element);
                        String strM53685 = C24325.m53684("Location", element);
                        arrayList.add(new C8232(strM53684, strM53685, "obs." + strM53685 + ".myhuaweicloud.com"));
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
    }
}
