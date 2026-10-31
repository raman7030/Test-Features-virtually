package l;

import bin.mt.plus.R;
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
public final class C23102 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f74336;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f74337;

    public C23102(String str, String str2) {
        this.f74336 = str;
        this.f74337 = str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m51291() {
        HashMap map = new HashMap();
        map.put("Host", "service.cos.myqcloud.com");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(C3261.getTimeZone("GMT"));
        map.put("Date", simpleDateFormat.format(new Date()));
        map.put("Authorization", C11814.m28880(this.f74336, this.f74337, map));
        C9449 c9449 = new C9449();
        c9449.m24282("https://service.cos.myqcloud.com");
        c9449.m24281();
        for (Map.Entry entry : map.entrySet()) {
            c9449.m24276((String) entry.getKey(), (String) entry.getValue());
        }
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
                        String strM51290 = m51290("Name", element);
                        String strM51291 = m51290("Location", element);
                        arrayList.add(new C6169(strM51290, strM51291, "cos." + strM51291 + ".myqcloud.com"));
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51290(String str, Element element) {
        NodeList elementsByTagName = element.getElementsByTagName(str);
        return elementsByTagName.getLength() > 0 ? elementsByTagName.item(0).getTextContent() : "";
    }
}
