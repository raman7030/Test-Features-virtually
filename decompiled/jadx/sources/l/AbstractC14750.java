package l;

import java.io.OutputStreamWriter;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* JADX INFO: renamed from: l.ܳ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBJL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14750 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Logger f45034 = Logger.getLogger("SvgNode");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Element f45035;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f45038;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9813 f45039;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f45037 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C0639 f45036 = new C0639();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C0639 f45040 = new C0639();

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC14750 mo6729();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo6730(OutputStreamWriter outputStreamWriter, String str);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo6731(String str);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo6733(C0639 c0639);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo6736(C0639 c0639);

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo6737();

    /* JADX INFO: renamed from: ܽ */
    public void mo27793() {
    }

    public AbstractC14750(C9813 c9813, Element element, String str) {
        this.f45038 = str;
        this.f45039 = c9813;
        this.f45035 = element;
        NamedNodeMap attributes = element.getAttributes();
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = attributes.item(i);
            String nodeName = nodeItem.getNodeName();
            String nodeValue = nodeItem.getNodeValue();
            if (C6347.f19663.containsKey(nodeName)) {
                m35051(nodeName, nodeValue);
            }
            if ("transform".equals(nodeName)) {
                f45034.log(Level.FINE, nodeName + " " + nodeValue);
                m35056(nodeValue);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x010d A[PHI: r22
      0x010d: PHI (r22v5 int) = (r22v0 int), (r22v0 int), (r22v0 int), (r22v0 int), (r22v0 int), (r22v6 int) binds: [B:59:0x010b, B:54:0x00ef, B:42:0x00c6, B:32:0x00a9, B:23:0x008e, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m35056(String str) {
        float[] fArr;
        int i;
        String[] strArrSplit = str.replaceAll(",", " ").split("[()]");
        char c = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= strArrSplit.length - 1) {
                return;
            }
            String strTrim = strArrSplit[i2].trim();
            String[] strArrSplit2 = strArrSplit[i2 + 1].trim().split("\\s+");
            int length = strArrSplit2.length;
            C0639 c0639 = null;
            if (length == 0) {
                fArr = null;
            } else {
                fArr = new float[length];
                for (int i3 = 0; i3 < length; i3++) {
                    fArr[i3] = Float.parseFloat(strArrSplit2[i3]);
                }
            }
            if (fArr == null) {
                i = i2;
                c = 0;
            } else {
                int length2 = fArr.length;
                C0639 c06310 = new C0639();
                if ("matrix".equalsIgnoreCase(strTrim)) {
                    if (length2 == 6) {
                        i = i2;
                        c06310.m2605(fArr[c], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
                    }
                    i = i2;
                    c = 0;
                } else {
                    i = i2;
                    if ("translate".equalsIgnoreCase(strTrim)) {
                        if (length2 == 1 || length2 == 2) {
                            c06310.m2615(fArr[0], length2 == 2 ? fArr[1] : 0.0d);
                        } else {
                            c = 0;
                        }
                    } else if ("scale".equalsIgnoreCase(strTrim)) {
                        if (length2 == 1 || length2 == 2) {
                            c06310.m2603(fArr[0], fArr[length2 != 2 ? (char) 0 : (char) 1]);
                        } else {
                            c = 0;
                        }
                    } else if ("rotate".equalsIgnoreCase(strTrim)) {
                        if (length2 == 1 || length2 == 3) {
                            c06310.m2604(Math.toRadians(fArr[0]), length2 == 3 ? fArr[1] : 0.0d, length2 == 3 ? fArr[2] : 0.0d);
                        } else {
                            c = 0;
                        }
                    } else if (!"skewX".equalsIgnoreCase(strTrim)) {
                        if ("skewY".equalsIgnoreCase(strTrim)) {
                            if (length2 != 1) {
                                c = 0;
                            } else {
                                c = 0;
                                c06310.m2610(0.0d, Math.tan(Math.toRadians(fArr[0])));
                            }
                        }
                        c0639 = c06310;
                    } else if (length2 != 1) {
                        c = 0;
                    } else {
                        c06310.m2610(Math.tan(Math.toRadians(fArr[0])), 0.0d);
                    }
                }
                c = 0;
                c0639 = c06310;
            }
            if (c0639 != null) {
                this.f45036.m2606(c0639);
            }
            i2 = i + 2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public EnumC17573 mo27788(C2184 c2184) {
        return C11992.m29299((EnumMap) c2184.f7186, this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m35051(String str, String str2) {
        if (str.equals("fill-rule") || str.equals("clip-rule")) {
            if (str2.equals("nonzero")) {
                str2 = "nonZero";
            } else if (str2.equals("evenodd")) {
                str2 = "evenOdd";
            }
        }
        f45034.log(Level.FINE, C19462.m44858(">>>> PROP ", str, " = ", str2));
        if (str2.startsWith("url(") && !str.equals("fill") && !str.equals("stroke")) {
            m35054("Unsupported URL value: ".concat(str2));
            return;
        }
        boolean zEquals = str.equals("stroke-width");
        HashMap map = this.f45037;
        if (zEquals && str2.equals("0")) {
            map.remove("stroke");
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo27792(String str, String str2) {
        m35051(str, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35053(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            HashMap map2 = this.f45037;
            if (!map2.containsKey(str)) {
                map2.put(str, (String) entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m35052(String str, String str2) {
        try {
            return C23280.m51596(str);
        } catch (IllegalArgumentException unused) {
            m35054(C4860.m14172("Unsupported color format \"", str, "\""));
            return str2;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m35054(String str) {
        this.f45039.m24854(str, this.f45035);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m35055(String str) {
        C9813 c9813 = this.f45039;
        c9813.getClass();
        c9813.m24855(str, this.f45035, EnumC21102.WARNING);
    }
}
