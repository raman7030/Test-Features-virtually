package l;

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
public final class C16867 extends AbstractC14750 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Logger f51755 = Logger.getLogger("SvgLeafNode");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C2051 f51756;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C2051 f51757;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f51758;

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6737() {
        return false;
    }

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14750 mo6729() {
        C16867 c16867 = new C16867(this.f45039, this.f45035, this.f45038);
        c16867.m35053(this.f45037);
        c16867.f45036 = (C0639) this.f45036.clone();
        c16867.f51758 = this.f51758;
        return c16867;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private double m39641(String str) {
        double d;
        String str2 = (String) this.f45037.get(str);
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

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ֫ */
    public final void mo6731(String str) {
        Level level = Level.FINE;
        StringBuilder sbM15339 = C5368.m15339(str);
        String str2 = this.f51758;
        if (str2 == null) {
            str2 = " null pathData ";
        }
        sbM15339.append(str2);
        String str3 = this.f45038;
        if (str3 == null) {
            str3 = " null name ";
        }
        sbM15339.append(str3);
        f51755.log(level, sbM15339.toString());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m39642(String str) {
        this.f51758 = str;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m39643() {
        return this.f51758;
    }

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ۧ */
    public final void mo6736(C0639 c0639) {
        String str = this.f51758;
        if (str == null || str.isEmpty()) {
            return;
        }
        C2757[] c2757ArrM30961 = C12697.m30961(this.f51758, EnumC13402.SVG);
        C0639 c06310 = this.f45040;
        c06310.m2611(c0639);
        boolean zM8518 = C2757.m8518(c2757ArrM30961);
        if (!c06310.m2617() || zM8518) {
            C2757.m8516(c06310, c2757ArrM30961);
        }
        this.f51758 = C2757.m8514(c2757ArrM30961, this.f45039);
    }

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ֫ */
    public final void mo6733(C0639 c0639) {
        String str;
        C0639 c06310 = this.f45040;
        c06310.m2616(c0639);
        c06310.m2606(this.f45036);
        HashMap map = this.f45037;
        if ("non-scaling-stroke".equals(map.get("vector-effect")) || (c06310.m2614() & 6) == 0 || (str = (String) map.get("stroke-width")) == null) {
            return;
        }
        try {
            double d = Double.parseDouble(str);
            double dM2601 = c06310.m2601();
            if (dM2601 != 0.0d) {
                map.put("stroke-width", this.f45039.m24847(d * Math.sqrt(Math.abs(dM2601))));
            }
            if ((c06310.m2614() & 4) != 0) {
                m35055("Scaling of the stroke width is approximate");
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x016d  */
    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ֫ */
    public final void mo6730(OutputStreamWriter outputStreamWriter, String str) throws IOException {
        C2051 c2051;
        String str2 = this.f51758;
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        HashMap map = this.f45037;
        String str3 = (String) map.get("fill");
        String str4 = (String) map.get("stroke");
        Level level = Level.FINE;
        Logger logger = f51755;
        logger.log(level, "fill color " + str3);
        boolean z = "none".equals(str3) || "#00000000".equals(str3);
        boolean z2 = str4 == null || "none".equals(str4);
        if (z && z2) {
            return;
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write("<path");
        outputStreamWriter.write("\n");
        if (str3 == null && this.f51756 == null) {
            logger.log(level, "Adding default fill color");
            outputStreamWriter.write(str);
            outputStreamWriter.write(ASN1Dump.TAB);
            outputStreamWriter.write("android:fillColor=\"#FF000000\"");
            outputStreamWriter.write("\n");
        }
        if (!z2 && !map.containsKey("stroke-width") && this.f51757 == null) {
            logger.log(level, "Adding default stroke width");
            outputStreamWriter.write(str);
            outputStreamWriter.write(ASN1Dump.TAB);
            outputStreamWriter.write("android:strokeWidth=\"1\"");
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:pathData=\"" + this.f51758 + "\"");
        double dM39641 = m39641("opacity");
        double dM39642 = m39641("fill-opacity");
        double dM39643 = m39641("stroke-opacity");
        String strM51749 = C23340.m51749(dM39642 * dM39641);
        if (strM51749.equals("1")) {
            map.remove("fill-opacity");
        } else {
            map.put("fill-opacity", strM51749);
        }
        String strM517410 = C23340.m51749(dM39643 * dM39641);
        if (strM517410.equals("1")) {
            map.remove("stroke-opacity");
        } else {
            map.put("stroke-opacity", strM517410);
        }
        map.remove("opacity");
        for (Map.Entry entry : map.entrySet()) {
            String str5 = (String) entry.getKey();
            String str6 = (String) C6347.f19663.get(str5);
            if (!str6.isEmpty()) {
                String strTrim = ((String) entry.getValue()).trim();
                String strM35052 = m35052(strTrim, "#000000");
                if (strM35052 == null) {
                    if (str5.equals("fill") || str5.equals("stroke")) {
                        if (strTrim.startsWith("url(#") && strTrim.endsWith(MotionUtils.EASING_TYPE_FORMAT_END)) {
                            AbstractC14750 abstractC14750M24872 = this.f45039.m24872(C15472.m36561(1, 5, strTrim));
                            if (abstractC14750M24872 instanceof C2051) {
                                c2051 = (C2051) abstractC14750M24872;
                            } else {
                                c2051 = null;
                            }
                        } else {
                            c2051 = null;
                        }
                        if (c2051 != null) {
                            C2051 c2051Mo6729 = c2051.mo6729();
                            c2051Mo6729.m6735(this);
                            if (str5.equals("fill")) {
                                c2051Mo6729.m6734(EnumC7758.FILL);
                                this.f51756 = c2051Mo6729;
                            } else {
                                c2051Mo6729.m6734(EnumC7758.STROKE);
                                this.f51757 = c2051Mo6729;
                            }
                        }
                    }
                    if (strTrim.endsWith("px")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 2).trim();
                    }
                } else {
                    strTrim = strM35052;
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
        if (this.f51756 == null && this.f51757 == null) {
            outputStreamWriter.write(47);
        }
        outputStreamWriter.write(62);
        outputStreamWriter.write("\n");
        C2051 c2052 = this.f51756;
        if (c2052 != null) {
            c2052.mo6730(outputStreamWriter, C16014.m37867(str, EnumC0121.f1143));
        }
        C2051 c2053 = this.f51757;
        if (c2053 != null) {
            c2053.mo6730(outputStreamWriter, C16014.m37867(str, EnumC0121.f1143));
        }
        if (this.f51756 == null && this.f51757 == null) {
            return;
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write("</path>");
        outputStreamWriter.write("\n");
    }
}
