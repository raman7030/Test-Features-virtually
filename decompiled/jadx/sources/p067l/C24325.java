package p067l;

import bin.p000mt.plus.R;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: l.᩺ܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R811 */
/* JADX INFO: loaded from: classes.dex */
public final class C24325 {

    /* JADX INFO: renamed from: ֫ */
    public final String f77081;

    /* JADX INFO: renamed from: ۧ */
    public final String f77082;

    public C24325(String str, String str2) {
        this.f77081 = str;
        this.f77082 = str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m53685() {
        HashMap map = new HashMap();
        map.put("Host", "service.cos.myqcloud.com");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(C5468.getTimeZone("GMT"));
        map.put("Date", simpleDateFormat.format(new Date()));
        map.put("Authorization", C13597.m30929(this.f77081, this.f77082, map));
        C11349 c11349 = new C11349();
        c11349.m26292("https://service.cos.myqcloud.com");
        c11349.m26291();
        for (Map.Entry entry : map.entrySet()) {
            c11349.m26286((String) entry.getKey(), (String) entry.getValue());
        }
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
                        String strM53684 = m53684("Name", element);
                        String strM53685 = m53684("Location", element);
                        arrayList.add(new C8232(strM53684, strM53685, "cos." + strM53685 + ".myqcloud.com"));
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

    /* JADX INFO: renamed from: ֫ */
    public static String m53684(String str, Element element) {
        NodeList elementsByTagName = element.getElementsByTagName(str);
        return elementsByTagName.getLength() > 0 ? elementsByTagName.item(0).getTextContent() : "";
    }
}
