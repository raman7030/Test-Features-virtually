package p067l;

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
public abstract class AbstractC16387 {

    /* JADX INFO: renamed from: ᩻ */
    public static final Logger f48147 = Logger.getLogger("SvgNode");

    /* JADX INFO: renamed from: ֫ */
    public final Element f48148;

    /* JADX INFO: renamed from: ܽ */
    public final String f48151;

    /* JADX INFO: renamed from: ܿ */
    public final C11695 f48152;

    /* JADX INFO: renamed from: ܳ */
    public final HashMap f48150 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public C2976 f48149 = new C2976();

    /* JADX INFO: renamed from: ᩳ */
    public C2976 f48153 = new C2976();

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC16387 mo8855();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8856(OutputStreamWriter outputStreamWriter, String str);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8857(String str);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo8859(C2976 c2976);

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo8862(C2976 c2976);

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo8863();

    /* JADX INFO: renamed from: ܽ */
    public void mo29855() {
    }

    public AbstractC16387(C11695 c11695, Element element, String str) {
        this.f48151 = str;
        this.f48152 = c11695;
        this.f48148 = element;
        NamedNodeMap attributes = element.getAttributes();
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = attributes.item(i);
            String nodeName = nodeItem.getNodeName();
            String nodeValue = nodeItem.getNodeValue();
            if (C8401.f22535.containsKey(nodeName)) {
                m37198(nodeName, nodeValue);
            }
            if ("transform".equals(nodeName)) {
                f48147.log(Level.FINE, nodeName + " " + nodeValue);
                m37203(nodeValue);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x010d A[PHI: r22
      0x010d: PHI (r22v5 int) = (r22v0 int), (r22v0 int), (r22v0 int), (r22v0 int), (r22v0 int), (r22v6 int) binds: [B:59:0x010b, B:54:0x00ef, B:42:0x00c6, B:32:0x00a9, B:23:0x008e, B:12:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᩳ */
    public final void m37203(String str) {
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
            C2976 c2976 = null;
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
                C2976 c2977 = new C2976();
                if ("matrix".equalsIgnoreCase(strTrim)) {
                    if (length2 == 6) {
                        i = i2;
                        c2977.m4945(fArr[c], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
                    }
                    i = i2;
                    c = 0;
                } else {
                    i = i2;
                    if ("translate".equalsIgnoreCase(strTrim)) {
                        if (length2 == 1 || length2 == 2) {
                            c2977.m4955(fArr[0], length2 == 2 ? fArr[1] : 0.0d);
                        } else {
                            c = 0;
                        }
                    } else if ("scale".equalsIgnoreCase(strTrim)) {
                        if (length2 == 1 || length2 == 2) {
                            c2977.m4943(fArr[0], fArr[length2 != 2 ? (char) 0 : (char) 1]);
                        } else {
                            c = 0;
                        }
                    } else if ("rotate".equalsIgnoreCase(strTrim)) {
                        if (length2 == 1 || length2 == 3) {
                            c2977.m4944(Math.toRadians(fArr[0]), length2 == 3 ? fArr[1] : 0.0d, length2 == 3 ? fArr[2] : 0.0d);
                        } else {
                            c = 0;
                        }
                    } else if (!"skewX".equalsIgnoreCase(strTrim)) {
                        if ("skewY".equalsIgnoreCase(strTrim)) {
                            if (length2 != 1) {
                                c = 0;
                            } else {
                                c = 0;
                                c2977.m4950(0.0d, Math.tan(Math.toRadians(fArr[0])));
                            }
                        }
                        c2976 = c2977;
                    } else if (length2 != 1) {
                        c = 0;
                    } else {
                        c2977.m4950(Math.tan(Math.toRadians(fArr[0])), 0.0d);
                    }
                }
                c = 0;
                c2976 = c2977;
            }
            if (c2976 != null) {
                this.f48149.m4946(c2976);
            }
            i2 = i + 2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public EnumC19070 mo29850(C4444 c4444) {
        return C13766.m31354((EnumMap) c4444.f9971, this);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m37198(String str, String str2) {
        if (str.equals("fill-rule") || str.equals("clip-rule")) {
            if (str2.equals("nonzero")) {
                str2 = "nonZero";
            } else if (str2.equals("evenodd")) {
                str2 = "evenOdd";
            }
        }
        f48147.log(Level.FINE, C20865.m47154(">>>> PROP ", str, " = ", str2));
        if (str2.startsWith("url(") && !str.equals("fill") && !str.equals("stroke")) {
            m37201("Unsupported URL value: ".concat(str2));
            return;
        }
        boolean zEquals = str.equals("stroke-width");
        HashMap map = this.f48150;
        if (zEquals && str2.equals("0")) {
            map.remove("stroke");
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo29854(String str, String str2) {
        m37198(str, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37200(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            HashMap map2 = this.f48150;
            if (!map2.containsKey(str)) {
                map2.put(str, (String) entry.getValue());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m37199(String str, String str2) {
        try {
            return C24494.m53992(str);
        } catch (IllegalArgumentException unused) {
            m37201(C6988.m16053("Unsupported color format \"", str, "\""));
            return str2;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m37201(String str) {
        this.f48152.m26869(str, this.f48148);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m37202(String str) {
        C11695 c11695 = this.f48152;
        c11695.getClass();
        c11695.m26870(str, this.f48148, EnumC22424.WARNING);
    }
}
