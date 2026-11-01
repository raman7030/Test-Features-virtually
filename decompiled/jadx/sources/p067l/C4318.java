package p067l;

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
public final class C4318 extends AbstractC16387 {

    /* JADX INFO: renamed from: ۖ */
    public static final AbstractC11500 f9633;

    /* JADX INFO: renamed from: ܺ */
    public static final Logger f9634 = Logger.getLogger("SvgGroupNode");

    /* JADX INFO: renamed from: ۜ */
    public RectF f9635;

    /* JADX INFO: renamed from: ۡ */
    public final ArrayList f9636;

    /* JADX INFO: renamed from: ۢ */
    public C18399 f9637;

    /* JADX INFO: renamed from: ᩷ */
    public EnumC9742 f9638;

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ۧ */
    public final void mo8862(C2976 c2976) {
    }

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8863() {
        return false;
    }

    static {
        C8817 c8817M26550 = AbstractC11500.m26550();
        c8817M26550.mo20376("x1", 0);
        c8817M26550.mo20376("y1", 1);
        c8817M26550.mo20376("x2", 2);
        c8817M26550.mo20376("y2", 3);
        f9633 = c8817M26550.mo20377();
    }

    public C4318(C11695 c11695, Element element, String str) {
        super(c11695, element, str);
        this.f9636 = new ArrayList();
        this.f9635 = new RectF();
    }

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ֫ */
    public final C4318 mo8855() {
        C4318 c4318 = new C4318(this.f48152, this.f48148, this.f48151);
        c4318.m37200(this.f48150);
        c4318.f48149 = (C2976) this.f48149.clone();
        for (C5049 c5049 : this.f9636) {
            c4318.m8858(c5049.m10764(), c5049.m10766(), c5049.m10767());
        }
        return c4318;
    }

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ֫ */
    public final void mo8857(String str) {
        Level level = Level.FINE;
        StringBuilder sbM21133 = C9179.m21133(str, "current gradient is :");
        sbM21133.append(this.f48151);
        f9634.log(level, sbM21133.toString());
    }

    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ֫ */
    public final void mo8859(C2976 c2976) {
        C2976 c2977 = this.f48153;
        c2977.m4956(c2976);
        c2977.m4946(this.f48149);
    }

    /* JADX INFO: renamed from: ֫ */
    private C15776 m8854(String str, double d) {
        HashMap map = this.f48150;
        boolean z = false;
        if (!map.containsKey(str)) {
            return new C15776(d, false);
        }
        String strTrim = ((String) map.get(str)).trim();
        if (str.equals("r") && strTrim.startsWith("-")) {
            return new C15776(d, false);
        }
        try {
            if (strTrim.endsWith("%")) {
                d = Double.parseDouble(strTrim.substring(0, strTrim.length() - 1)) / 100.0d;
                z = true;
            } else {
                d = Double.parseDouble(strTrim);
            }
        } catch (NumberFormatException unused) {
            m37201("Unsupported coordinate value");
        }
        return new C15776(d, z);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    @Override // p067l.AbstractC16387
    /* JADX INFO: renamed from: ֫ */
    public final void mo8856(OutputStreamWriter outputStreamWriter, String str) throws IOException {
        String str2;
        AbstractC11500 abstractC11500;
        C11695 c11695;
        double[] dArr;
        float f;
        AbstractC11500 abstractC11501;
        ArrayList<C5049> arrayList = this.f9636;
        if (arrayList.isEmpty()) {
            m37201("Gradient has no stop info");
            return;
        }
        Path path = new Path();
        C17728.m40286(C14436.m33039(this.f9637.m41879(), EnumC15106.SVG), path);
        RectF rectF = this.f9635;
        path.computeBounds(rectF, true);
        float f2 = rectF.top;
        double dM26884 = f2 - rectF.bottom;
        float f3 = rectF.left;
        double dM26878 = f3 - rectF.right;
        double d = f3;
        double d2 = f2;
        HashMap map = this.f48150;
        boolean zEquals = "userSpaceOnUse".equals((String) map.get("gradientUnits"));
        C11695 c11696 = this.f48152;
        if (zEquals) {
            dM26884 = c11696.m26884();
            dM26878 = c11696.m26878();
            d2 = 0.0d;
            d = 0.0d;
        }
        if (dM26878 == 0.0d || dM26884 == 0.0d) {
            return;
        }
        outputStreamWriter.write(str);
        if (this.f9638 == EnumC9742.FILL) {
            outputStreamWriter.write("<aapt:attr name=\"android:fillColor\">");
        } else {
            outputStreamWriter.write("<aapt:attr name=\"android:strokeColor\">");
        }
        String str3 = "\n";
        outputStreamWriter.write("\n");
        outputStreamWriter.write(str);
        outputStreamWriter.write(EnumC2483.f3919);
        outputStreamWriter.write("<gradient ");
        if (map.containsKey("gradientTransform")) {
            m37203((String) map.get("gradientTransform"));
            if (!zEquals) {
                C2976 c2976 = new C2976(dM26878, dM26884);
                this.f48149.m4951(c2976);
                try {
                    c2976.m4958();
                    this.f48149.m4946(c2976);
                } catch (C3647 e) {
                    throw new Error(e);
                }
            }
        }
        if (zEquals) {
            this.f48149.m4951(this.f9637.f48153);
        }
        boolean zEquals2 = (map.containsKey("gradientType") ? (String) map.get("gradientType") : "linear").equals("linear");
        AbstractC11500 abstractC11502 = f9633;
        if (zEquals2) {
            double[] dArr2 = new double[4];
            dArr = new double[4];
            AbstractC21520 it = abstractC11502.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str4 = str3;
                String str5 = (String) entry.getKey();
                AbstractC11500 abstractC11503 = abstractC11502;
                int iIntValue = ((Integer) entry.getValue()).intValue();
                C11695 c11697 = c11696;
                HashMap map2 = map;
                C15776 c15776M8854 = m8854(str5, iIntValue == 2 ? 1.0d : 0.0d);
                double dM35846 = c15776M8854.m35846();
                if (!zEquals || c15776M8854.m35847()) {
                    dM35846 = iIntValue % 2 == 0 ? (dM35846 * dM26878) + d : (dM35846 * dM26884) + d2;
                }
                dArr2[iIntValue] = dM35846;
                dArr[iIntValue] = dM35846;
                map = map2;
                if (!map.containsKey(str5)) {
                    map.put(str5, "");
                }
                c11696 = c11697;
                abstractC11502 = abstractC11503;
                str3 = str4;
            }
            str2 = str3;
            abstractC11500 = abstractC11502;
            this.f48149.m4952(dArr2, dArr, 2);
            c11695 = c11696;
        } else {
            str2 = "\n";
            abstractC11500 = abstractC11502;
            C15776 c15776M8855 = m8854("cx", 0.5d);
            double dM35847 = c15776M8855.m35846();
            if (!zEquals || c15776M8855.m35847()) {
                dM35847 = (dM35847 * dM26878) + d;
            }
            C15776 c15776M8856 = m8854("cy", 0.5d);
            double dM35848 = c15776M8856.m35846();
            if (!zEquals || c15776M8856.m35847()) {
                dM35848 = (dM35848 * dM26884) + d2;
            }
            C15776 c15776M8857 = m8854("r", 0.5d);
            double dM35849 = c15776M8857.m35846();
            if (!zEquals || c15776M8857.m35847()) {
                dM35849 *= Math.max(dM26884, dM26878);
            }
            double[] dArr3 = {dM35847, dM35848};
            this.f48149.m4952(new double[]{dM35847, dM35848}, dArr3, 1);
            C10353 c10353 = new C10353(dM35849, 0.0d);
            C10353 c10354 = new C10353(dM35849, 0.0d);
            this.f48149.m4947(c10353, c10354);
            c11695 = c11696;
            map.put("cx", c11695.m26862(dArr3[0]));
            map.put("cy", c11695.m26862(dArr3[1]));
            double d3 = 0.0d - c10354.f28665;
            double d4 = 0.0d - c10354.f28666;
            map.put("r", c11695.m26862(Math.sqrt((d4 * d4) + (d3 * d3))));
            dArr = dArr3;
        }
        AbstractC21520 it2 = C8401.f22532.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            String str6 = (String) entry2.getKey();
            String str7 = (String) entry2.getValue();
            String str8 = (String) map.get(str6);
            if (!str7.isEmpty() && str8 != null) {
                String strTrim = str8.trim();
                String strM37199 = m37199(strTrim, "#000000");
                if (strM37199 == null) {
                    abstractC11501 = abstractC11500;
                    Integer num = (Integer) abstractC11501.get(str6);
                    if (num != null) {
                        strTrim = c11695.m26862(dArr[num.intValue()]);
                    } else if (str6.equals("spreadMethod")) {
                        if (strTrim.equals("pad")) {
                            strTrim = "clamp";
                        } else if (strTrim.equals("reflect")) {
                            strTrim = "mirror";
                        } else if (strTrim.equals("repeat")) {
                            strTrim = "repeat";
                        } else {
                            m37201("Unsupported spreadMethod ".concat(strTrim));
                            strTrim = "clamp";
                        }
                    } else {
                        if (strTrim.endsWith("%")) {
                            strM37199 = c11695.m26862(m8854(str6, 0.0d).m35846());
                        }
                        String str9 = str2;
                        outputStreamWriter.write(str9);
                        outputStreamWriter.write(str);
                        outputStreamWriter.write(EnumC2483.f3919);
                        outputStreamWriter.write(ASN1Dump.TAB);
                        outputStreamWriter.write(str7);
                        outputStreamWriter.write("=\"");
                        outputStreamWriter.write(strTrim);
                        outputStreamWriter.write("\"");
                        str2 = str9;
                        abstractC11500 = abstractC11501;
                    }
                    String str10 = str2;
                    outputStreamWriter.write(str10);
                    outputStreamWriter.write(str);
                    outputStreamWriter.write(EnumC2483.f3919);
                    outputStreamWriter.write(ASN1Dump.TAB);
                    outputStreamWriter.write(str7);
                    outputStreamWriter.write("=\"");
                    outputStreamWriter.write(strTrim);
                    outputStreamWriter.write("\"");
                    str2 = str10;
                    abstractC11500 = abstractC11501;
                } else {
                    abstractC11501 = abstractC11500;
                }
                strTrim = strM37199;
                String str11 = str2;
                outputStreamWriter.write(str11);
                outputStreamWriter.write(str);
                outputStreamWriter.write(EnumC2483.f3919);
                outputStreamWriter.write(ASN1Dump.TAB);
                outputStreamWriter.write(str7);
                outputStreamWriter.write("=\"");
                outputStreamWriter.write(strTrim);
                outputStreamWriter.write("\"");
                str2 = str11;
                abstractC11500 = abstractC11501;
            }
        }
        String str12 = str2;
        outputStreamWriter.write(62);
        outputStreamWriter.write(str12);
        String str13 = str + ASN1Dump.TAB;
        for (C5049 c5049 : arrayList) {
            String strM10764 = c5049.m10764();
            try {
                f = Float.parseFloat(c5049.m10767());
            } catch (NumberFormatException unused) {
                m37202("Unsupported opacity value");
                f = 1.0f;
            }
            int iM46086 = C20412.m46086(strM10764);
            int i = C6330.f16409;
            String str14 = String.format("#%08X", Integer.valueOf((iM46086 & 16777215) | (((int) (((iM46086 >> 24) & 255) * f)) << 24)));
            outputStreamWriter.write(str13);
            outputStreamWriter.write("<item android:offset=\"");
            outputStreamWriter.write(C5595.m12401(c5049.m10766()));
            outputStreamWriter.write("\"");
            outputStreamWriter.write(" android:color=\"");
            outputStreamWriter.write(str14);
            outputStreamWriter.write("\"/>");
            outputStreamWriter.write(str12);
            if (arrayList.size() == 1) {
                m37202("Gradient has only one color stop");
                outputStreamWriter.write(str13);
                outputStreamWriter.write("<item android:offset=\"1\"");
                outputStreamWriter.write(" android:color=\"");
                outputStreamWriter.write(str14);
                outputStreamWriter.write("\"/>");
                outputStreamWriter.write(str12);
            }
        }
        outputStreamWriter.write(str);
        outputStreamWriter.write(EnumC2483.f3919);
        outputStreamWriter.write("</gradient>");
        outputStreamWriter.write(str12);
        outputStreamWriter.write(str);
        outputStreamWriter.write("</aapt:attr>");
        outputStreamWriter.write(str12);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8858(String str, String str2, String str3) {
        C5049 c5049 = new C5049(str, str2);
        c5049.m10765(str3);
        this.f9636.add(c5049);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8860(EnumC9742 enumC9742) {
        this.f9638 = enumC9742;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8861(C18399 c18399) {
        this.f9637 = c18399;
    }
}
