package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.util.ASN1Dump;

/* JADX INFO: renamed from: l.ܽ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBJQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18399 extends AbstractC16387 {

    /* JADX INFO: renamed from: ۡ */
    public static final Logger f54935 = Logger.getLogger("SvgLeafNode");

    /* JADX INFO: renamed from: ۜ */
    public C4318 f54936;

    /* JADX INFO: renamed from: ۢ */
    public C4318 f54937;

    /* JADX INFO: renamed from: ᩷ */
    public String f54938;

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8863() {
        return false;
    }

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16387 mo8855() {
        C18399 c18399 = new C18399(this.f48152, this.f48148, this.f48151);
        c18399.m37200(this.f48150);
        c18399.f48149 = (C2976) this.f48149.clone();
        c18399.f54938 = this.f54938;
        return c18399;
    }

    /* JADX INFO: renamed from: ܳ */
    private double m41877(String str) {
        double d;
        String str2 = (String) this.f48150.get(str);
        if (str2 != null) {
            try {
                if (str2.endsWith("%")) {
                    d = Double.parseDouble(str2.substring(0, str2.length() - 1)) / 100.0d;
                } else {
                    d = Double.parseDouble(str2);
                }
            } catch (NumberFormatException unused) {
                d = 1.0d;
            }
        } else {
            d = 1.0d;
        }
        return Math.min(Math.max(d, 0.0d), 1.0d);
    }

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ֫ */
    public final void mo8857(String str) {
        Level level = Level.FINE;
        StringBuilder sbM17248 = C7470.m17248(str);
        String str2 = this.f54938;
        if (str2 == null) {
            str2 = " null pathData ";
        }
        sbM17248.append(str2);
        String str3 = this.f48151;
        if (str3 == null) {
            str3 = " null name ";
        }
        sbM17248.append(str3);
        f54935.log(level, sbM17248.toString());
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m41878(String str) {
        this.f54938 = str;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m41879() {
        return this.f54938;
    }

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ۧ */
    public final void mo8862(C2976 c2976) {
        String str = this.f54938;
        if (str == null || str.isEmpty()) {
            return;
        }
        C4989[] c4989ArrM33039 = C14436.m33039(this.f54938, EnumC15106.SVG);
        C2976 c2977 = this.f48153;
        c2977.m4951(c2976);
        boolean zM10565 = C4989.m10565(c4989ArrM33039);
        if (!c2977.m4957() || zM10565) {
            C4989.m10563(c2977, c4989ArrM33039);
        }
        this.f54938 = C4989.m10561(c4989ArrM33039, this.f48152);
    }

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ֫ */
    public final void mo8859(C2976 c2976) {
        String str;
        C2976 c2977 = this.f48153;
        c2977.m4956(c2976);
        c2977.m4946(this.f48149);
        HashMap map = this.f48150;
        if ("non-scaling-stroke".equals(map.get("vector-effect")) || (c2977.m4954() & 6) == 0 || (str = (String) map.get("stroke-width")) == null) {
            return;
        }
        try {
            double d = Double.parseDouble(str);
            double dM4941 = c2977.m4941();
            if (dM4941 != 0.0d) {
                map.put("stroke-width", this.f48152.m26862(d * Math.sqrt(Math.abs(dM4941))));
            }
            if ((c2977.m4954() & 4) != 0) {
                m37202("Scaling of the stroke width is approximate");
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x016d  */
    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ֫ */
    public final void mo8856(OutputStreamWriter outputStreamWriter, String str) throws IOException {
        C4318 c4318;
        String str2 = this.f54938;
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        HashMap map = this.f48150;
        String str3 = (String) map.get("fill");
        String str4 = (String) map.get("stroke");
        Level level = Level.FINE;
        Logger logger = f54935;
        logger.log(level, "fill color " + str3);
        boolean z = "none".equals(str3) || "#00000000".equals(str3);
        boolean z2 = str4 == null || "none".equals(str4);
        if (z && z2) {
            return;
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write("<path");
        outputStreamWriter.write("\n");
        if (str3 == null && this.f54936 == null) {
            logger.log(level, "Adding default fill color");
            outputStreamWriter.write(str);
            outputStreamWriter.write(ASN1Dump.TAB);
            outputStreamWriter.write("android:fillColor=\"#FF000000\"");
            outputStreamWriter.write("\n");
        }
        if (!z2 && !map.containsKey("stroke-width") && this.f54937 == null) {
            logger.log(level, "Adding default stroke width");
            outputStreamWriter.write(str);
            outputStreamWriter.write(ASN1Dump.TAB);
            outputStreamWriter.write("android:strokeWidth=\"1\"");
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:pathData=\"" + this.f54938 + "\"");
        double dM41877 = m41877("opacity");
        double dM41878 = m41877("fill-opacity");
        double dM41879 = m41877("stroke-opacity");
        String strM54146 = C24550.m54146(dM41878 * dM41877);
        if (strM54146.equals("1")) {
            map.remove("fill-opacity");
        } else {
            map.put("fill-opacity", strM54146);
        }
        String strM54147 = C24550.m54146(dM41879 * dM41877);
        if (strM54147.equals("1")) {
            map.remove("stroke-opacity");
        } else {
            map.put("stroke-opacity", strM54147);
        }
        map.remove("opacity");
        for (Map.Entry entry : map.entrySet()) {
            String str5 = (String) entry.getKey();
            String str6 = (String) C8401.f22535.get(str5);
            if (!str6.isEmpty()) {
                String strTrim = ((String) entry.getValue()).trim();
                String strM37199 = m37199(strTrim, "#000000");
                if (strM37199 == null) {
                    if (str5.equals("fill") || str5.equals("stroke")) {
                        if (strTrim.startsWith("url(#") && strTrim.endsWith(MotionUtils.EASING_TYPE_FORMAT_END)) {
                            AbstractC16387 abstractC16387M26887 = this.f48152.m26887(C17073.m38720(1, 5, strTrim));
                            if (abstractC16387M26887 instanceof C4318) {
                                c4318 = (C4318) abstractC16387M26887;
                            } else {
                                c4318 = null;
                            }
                        } else {
                            c4318 = null;
                        }
                        if (c4318 != null) {
                            C4318 c4318Mo8855 = c4318.mo8855();
                            c4318Mo8855.m8861(this);
                            if (str5.equals("fill")) {
                                c4318Mo8855.m8860(EnumC9742.FILL);
                                this.f54936 = c4318Mo8855;
                            } else {
                                c4318Mo8855.m8860(EnumC9742.STROKE);
                                this.f54937 = c4318Mo8855;
                            }
                        }
                    }
                    if (strTrim.endsWith("px")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 2).trim();
                    }
                } else {
                    strTrim = strM37199;
                }
                outputStreamWriter.write("\n");
                outputStreamWriter.write(str);
                outputStreamWriter.write(ASN1Dump.TAB);
                outputStreamWriter.write(str6);
                outputStreamWriter.write("=\"");
                outputStreamWriter.write(strTrim);
                outputStreamWriter.write("\"");
            }
        }
        if (this.f54936 == null && this.f54937 == null) {
            outputStreamWriter.write(47);
        }
        outputStreamWriter.write(62);
        outputStreamWriter.write("\n");
        C4318 c4319 = this.f54936;
        if (c4319 != null) {
            c4319.mo8856(outputStreamWriter, C17588.m40053(str, EnumC2483.f3919));
        }
        C4318 c43110 = this.f54937;
        if (c43110 != null) {
            c43110.mo8856(outputStreamWriter, C17588.m40053(str, EnumC2483.f3919));
        }
        if (this.f54936 == null && this.f54937 == null) {
            return;
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write("</path>");
        outputStreamWriter.write("\n");
    }
}
