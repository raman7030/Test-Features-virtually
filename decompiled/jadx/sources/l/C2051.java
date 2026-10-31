package l;

import android.graphics.Path;
import android.graphics.RectF;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: l.֫᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBKQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2051 extends AbstractC14750 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final AbstractC9608 f6850;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final Logger f6851 = Logger.getLogger("SvgGroupNode");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public RectF f6852;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6853;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C16867 f6854;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC7758 f6855;

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo6736(C0639 c0639) {
    }

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo6737() {
        return false;
    }

    static {
        C6785 c6785M24537 = AbstractC9608.m24537();
        c6785M24537.mo18428("x1", 0);
        c6785M24537.mo18428("y1", 1);
        c6785M24537.mo18428("x2", 2);
        c6785M24537.mo18428("y2", 3);
        f6850 = c6785M24537.mo18429();
    }

    public C2051(C9813 c9813, Element element, String str) {
        super(c9813, element, str);
        this.f6853 = new ArrayList();
        this.f6852 = new RectF();
    }

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2051 mo6729() {
        C2051 c2051 = new C2051(this.f45039, this.f45035, this.f45038);
        c2051.m35053(this.f45037);
        c2051.f45036 = (C0639) this.f45036.clone();
        for (C2820 c2820 : this.f6853) {
            c2051.m6732(c2820.m8703(), c2820.m8705(), c2820.m8706());
        }
        return c2051;
    }

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6731(String str) {
        Level level = Level.FINE;
        StringBuilder sbM19190 = C7166.m19190(str, "current gradient is :");
        sbM19190.append(this.f45038);
        f6851.log(level, sbM19190.toString());
    }

    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6733(C0639 c0639) {
        C0639 c06310 = this.f45040;
        c06310.m2616(c0639);
        c06310.m2606(this.f45036);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C14107 m6728(String str, double d) {
        HashMap map = this.f45037;
        boolean z = false;
        if (!map.containsKey(str)) {
            return new C14107(d, false);
        }
        String strTrim = ((String) map.get(str)).trim();
        if (str.equals("r") && strTrim.startsWith("-")) {
            return new C14107(d, false);
        }
        try {
            if (strTrim.endsWith("%")) {
                d = Double.parseDouble(strTrim.substring(0, strTrim.length() - 1)) / 100.0d;
                z = true;
            } else {
                d = Double.parseDouble(strTrim);
            }
        } catch (NumberFormatException unused) {
            m35054("Unsupported coordinate value");
        }
        return new C14107(d, z);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    @Override // l.AbstractC14750
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6730(OutputStreamWriter outputStreamWriter, String str) throws IOException {
        String str2;
        AbstractC9608 abstractC9608;
        C9813 c9813;
        double[] dArr;
        float f;
        AbstractC9608 abstractC9609;
        ArrayList<C2820> arrayList = this.f6853;
        if (arrayList.isEmpty()) {
            m35054("Gradient has no stop info");
            return;
        }
        Path path = new Path();
        C16161.m38094(C12697.m30961(this.f6854.m39643(), EnumC13402.SVG), path);
        RectF rectF = this.f6852;
        path.computeBounds(rectF, true);
        float f2 = rectF.top;
        double dM24869 = f2 - rectF.bottom;
        float f3 = rectF.left;
        double dM24863 = f3 - rectF.right;
        double d = f3;
        double d2 = f2;
        HashMap map = this.f45037;
        boolean zEquals = "userSpaceOnUse".equals((String) map.get("gradientUnits"));
        C9813 c9814 = this.f45039;
        if (zEquals) {
            dM24869 = c9814.m24869();
            dM24863 = c9814.m24863();
            d2 = 0.0d;
            d = 0.0d;
        }
        if (dM24863 == 0.0d || dM24869 == 0.0d) {
            return;
        }
        outputStreamWriter.write(str);
        if (this.f6855 == EnumC7758.FILL) {
            outputStreamWriter.write("<aapt:attr name=\"android:fillColor\">");
        } else {
            outputStreamWriter.write("<aapt:attr name=\"android:strokeColor\">");
        }
        String str3 = "\n";
        outputStreamWriter.write("\n");
        outputStreamWriter.write(str);
        outputStreamWriter.write(EnumC0121.f1143);
        outputStreamWriter.write("<gradient ");
        if (map.containsKey("gradientTransform")) {
            m35056((String) map.get("gradientTransform"));
            if (!zEquals) {
                C0639 c0639 = new C0639(dM24863, dM24869);
                this.f45036.m2611(c0639);
                try {
                    c0639.m2618();
                    this.f45036.m2606(c0639);
                } catch (C1345 e) {
                    throw new Error(e);
                }
            }
        }
        if (zEquals) {
            this.f45036.m2611(this.f6854.f45040);
        }
        boolean zEquals2 = (map.containsKey("gradientType") ? (String) map.get("gradientType") : "linear").equals("linear");
        AbstractC9608 abstractC96010 = f6850;
        if (zEquals2) {
            double[] dArr2 = new double[4];
            dArr = new double[4];
            AbstractC20151 it = abstractC96010.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str4 = str3;
                String str5 = (String) entry.getKey();
                AbstractC9608 abstractC96011 = abstractC96010;
                int iIntValue = ((Integer) entry.getValue()).intValue();
                C9813 c9815 = c9814;
                HashMap map2 = map;
                C14107 c14107M6728 = m6728(str5, iIntValue == 2 ? 1.0d : 0.0d);
                double dM33720 = c14107M6728.m33720();
                if (!zEquals || c14107M6728.m33721()) {
                    dM33720 = iIntValue % 2 == 0 ? (dM33720 * dM24863) + d : (dM33720 * dM24869) + d2;
                }
                dArr2[iIntValue] = dM33720;
                dArr[iIntValue] = dM33720;
                map = map2;
                if (!map.containsKey(str5)) {
                    map.put(str5, "");
                }
                c9814 = c9815;
                abstractC96010 = abstractC96011;
                str3 = str4;
            }
            str2 = str3;
            abstractC9608 = abstractC96010;
            this.f45036.m2612(dArr2, dArr, 2);
            c9813 = c9814;
        } else {
            str2 = "\n";
            abstractC9608 = abstractC96010;
            C14107 c14107M6729 = m6728("cx", 0.5d);
            double dM33721 = c14107M6729.m33720();
            if (!zEquals || c14107M6729.m33721()) {
                dM33721 = (dM33721 * dM24863) + d;
            }
            C14107 c14107M67210 = m6728("cy", 0.5d);
            double dM33722 = c14107M67210.m33720();
            if (!zEquals || c14107M67210.m33721()) {
                dM33722 = (dM33722 * dM24869) + d2;
            }
            C14107 c14107M67211 = m6728("r", 0.5d);
            double dM33723 = c14107M67211.m33720();
            if (!zEquals || c14107M67211.m33721()) {
                dM33723 *= Math.max(dM24869, dM24863);
            }
            double[] dArr3 = {dM33721, dM33722};
            this.f45036.m2612(new double[]{dM33721, dM33722}, dArr3, 1);
            C8401 c8401 = new C8401(dM33723, 0.0d);
            C8401 c8402 = new C8401(dM33723, 0.0d);
            this.f45036.m2607(c8401, c8402);
            c9813 = c9814;
            map.put("cx", c9813.m24847(dArr3[0]));
            map.put("cy", c9813.m24847(dArr3[1]));
            double d3 = 0.0d - c8402.f25752;
            double d4 = 0.0d - c8402.f25753;
            map.put("r", c9813.m24847(Math.sqrt((d4 * d4) + (d3 * d3))));
            dArr = dArr3;
        }
        AbstractC20151 it2 = C6347.f19660.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            String str6 = (String) entry2.getKey();
            String str7 = (String) entry2.getValue();
            String str8 = (String) map.get(str6);
            if (!str7.isEmpty() && str8 != null) {
                String strTrim = str8.trim();
                String strM35052 = m35052(strTrim, "#000000");
                if (strM35052 == null) {
                    abstractC9609 = abstractC9608;
                    Integer num = (Integer) abstractC9609.get(str6);
                    if (num != null) {
                        strTrim = c9813.m24847(dArr[num.intValue()]);
                    } else if (str6.equals("spreadMethod")) {
                        if (strTrim.equals("pad")) {
                            strTrim = "clamp";
                        } else if (strTrim.equals("reflect")) {
                            strTrim = "mirror";
                        } else if (strTrim.equals("repeat")) {
                            strTrim = "repeat";
                        } else {
                            m35054("Unsupported spreadMethod ".concat(strTrim));
                            strTrim = "clamp";
                        }
                    } else {
                        if (strTrim.endsWith("%")) {
                            strM35052 = c9813.m24847(m6728(str6, 0.0d).m33720());
                        }
                        String str9 = str2;
                        outputStreamWriter.write(str9);
                        outputStreamWriter.write(str);
                        outputStreamWriter.write(EnumC0121.f1143);
                        outputStreamWriter.write(ASN1Dump.TAB);
                        outputStreamWriter.write(str7);
                        outputStreamWriter.write("=\"");
                        outputStreamWriter.write(strTrim);
                        outputStreamWriter.write("\"");
                        str2 = str9;
                        abstractC9608 = abstractC9609;
                    }
                    String str10 = str2;
                    outputStreamWriter.write(str10);
                    outputStreamWriter.write(str);
                    outputStreamWriter.write(EnumC0121.f1143);
                    outputStreamWriter.write(ASN1Dump.TAB);
                    outputStreamWriter.write(str7);
                    outputStreamWriter.write("=\"");
                    outputStreamWriter.write(strTrim);
                    outputStreamWriter.write("\"");
                    str2 = str10;
                    abstractC9608 = abstractC9609;
                } else {
                    abstractC9609 = abstractC9608;
                }
                strTrim = strM35052;
                String str11 = str2;
                outputStreamWriter.write(str11);
                outputStreamWriter.write(str);
                outputStreamWriter.write(EnumC0121.f1143);
                outputStreamWriter.write(ASN1Dump.TAB);
                outputStreamWriter.write(str7);
                outputStreamWriter.write("=\"");
                outputStreamWriter.write(strTrim);
                outputStreamWriter.write("\"");
                str2 = str11;
                abstractC9608 = abstractC9609;
            }
        }
        String str12 = str2;
        outputStreamWriter.write(62);
        outputStreamWriter.write(str12);
        String str13 = str + ASN1Dump.TAB;
        for (C2820 c2820 : arrayList) {
            String strM8703 = c2820.m8703();
            try {
                f = Float.parseFloat(c2820.m8706());
            } catch (NumberFormatException unused) {
                m35055("Unsupported opacity value");
                f = 1.0f;
            }
            int iM43818 = C18985.m43818(strM8703);
            int i = C4168.f13596;
            String str14 = String.format("#%08X", Integer.valueOf((iM43818 & 16777215) | (((int) (((iM43818 >> 24) & 255) * f)) << 24)));
            outputStreamWriter.write(str13);
            outputStreamWriter.write("<item android:offset=\"");
            outputStreamWriter.write(C3395.m10362(c2820.m8705()));
            outputStreamWriter.write("\"");
            outputStreamWriter.write(" android:color=\"");
            outputStreamWriter.write(str14);
            outputStreamWriter.write("\"/>");
            outputStreamWriter.write(str12);
            if (arrayList.size() == 1) {
                m35055("Gradient has only one color stop");
                outputStreamWriter.write(str13);
                outputStreamWriter.write("<item android:offset=\"1\"");
                outputStreamWriter.write(" android:color=\"");
                outputStreamWriter.write(str14);
                outputStreamWriter.write("\"/>");
                outputStreamWriter.write(str12);
            }
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write(EnumC0121.f1143);
        outputStreamWriter.write("</gradient>");
        outputStreamWriter.write(str12);
        outputStreamWriter.write(str);
        outputStreamWriter.write("</aapt:attr>");
        outputStreamWriter.write(str12);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6732(String str, String str2, String str3) {
        C2820 c2820 = new C2820(str, str2);
        c2820.m8704(str3);
        this.f6853.add(c2820);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6734(EnumC7758 enumC7758) {
        this.f6855 = enumC7758;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6735(C16867 c16867) {
        this.f6854 = c16867;
    }
}
