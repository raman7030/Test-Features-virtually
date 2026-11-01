package p067l;

import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* JADX INFO: renamed from: l.ۢ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBKO */
/* JADX INFO: loaded from: classes3.dex */
public final class C11695 {

    /* JADX INFO: renamed from: ۚ */
    public static final Logger f32601 = Logger.getLogger("SvgTree");

    /* JADX INFO: renamed from: ۡ */
    public C13036 f32607;

    /* JADX INFO: renamed from: ܳ */
    public boolean f32610;

    /* JADX INFO: renamed from: ܽ */
    public DecimalFormat f32612;

    /* JADX INFO: renamed from: ܿ */
    public boolean f32613;

    /* JADX INFO: renamed from: ᩳ */
    public String f32614;

    /* JADX INFO: renamed from: ᩵ */
    public float[] f32616;

    /* JADX INFO: renamed from: ֡ */
    public float f32602 = -1.0f;

    /* JADX INFO: renamed from: ֫ */
    public float f32603 = -1.0f;

    /* JADX INFO: renamed from: ܺ */
    public final C2976 f32611 = new C2976();

    /* JADX INFO: renamed from: ۖ */
    public float f32604 = 1.0f;

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayList f32617 = new ArrayList();

    /* JADX INFO: renamed from: ᩻ */
    public final HashMap f32618 = new HashMap();

    /* JADX INFO: renamed from: ۜ */
    public final HashSet f32606 = new HashSet();

    /* JADX INFO: renamed from: ۢ */
    public final HashSet f32608 = new HashSet();

    /* JADX INFO: renamed from: ۧ */
    public final LinkedHashMap f32609 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۘ */
    public final HashMap f32605 = new HashMap();

    /* JADX INFO: renamed from: ᩴ */
    public final HashMap f32615 = new HashMap();

    /* JADX INFO: renamed from: ۢ */
    public final float m26878() {
        return this.f32602;
    }

    /* JADX INFO: renamed from: ܳ */
    public final float m26884() {
        return this.f32603;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m26885() {
        this.f32610 = true;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m26877() {
        this.f32613 = true;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final float[] m26892() {
        return this.f32616;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26880() {
        this.f32607.mo8859(new C2976());
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m26875() {
        this.f32607.mo29855();
        if (!this.f32617.isEmpty() || this.f32610) {
            return;
        }
        m26869("No vector content found", (Node) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Document m26864(String str, ArrayList arrayList, byte[] bArr) {
        this.f32614 = str;
        try {
            return C7000.m16113(arrayList, bArr);
        } catch (ParserConfigurationException e) {
            throw new Error("Internal error", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26865() {
        f32601.log(Level.FINE, "file: " + this.f32614);
        this.f32607.mo8857("");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26881(C13036 c13036) {
        this.f32607 = c13036;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26869(String str, Node node) {
        m26870(str, node, EnumC22424.ERROR);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26870(String str, Node node, EnumC22424 enumC22424) {
        C6194.m14030(!str.isEmpty());
        this.f32617.add(new C25105(enumC22424, node == null ? 0 : C7000.m16112(node).m12608() + 1, str));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m26890() {
        ArrayList<C25105> arrayList = this.f32617;
        if (arrayList.isEmpty()) {
            return "";
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (C25105 c25105 : arrayList) {
            if (sb.length() != 0) {
                sb.append('\n');
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c25105.f80346.name());
            int i = c25105.f80347;
            sb2.append(i == 0 ? "" : C20778.m46922(i, " @ line "));
            sb2.append(": ");
            sb2.append(c25105.f80345);
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m26889() {
        return this.f32610;
    }

    /* JADX INFO: renamed from: ܿ */
    public final double m26888(String str) {
        float[] fArr = this.f32616;
        return m26861(str, fArr == null ? -1.0f : fArr[2]);
    }

    /* JADX INFO: renamed from: ܳ */
    public final double m26883(String str) {
        float[] fArr = this.f32616;
        return m26861(str, fArr == null ? -1.0f : fArr[3]);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: ֫ */
    public final void m26874(Element element) {
        NamedNodeMap attributes = element.getAttributes();
        int length = attributes.getLength();
        EnumC9012 enumC9012 = EnumC9012.PIXEL;
        EnumC9012 enumC9013 = enumC9012;
        for (int i = 0; i < length; i++) {
            Node nodeItem = attributes.item(i);
            String strTrim = nodeItem.getNodeName().trim();
            String strTrim2 = nodeItem.getNodeValue().trim();
            int length2 = strTrim2.length();
            EnumC9012 enumC9014 = EnumC9012.PIXEL;
            if (strTrim2.substring(Math.max(strTrim2.length() - 2, 0)).matches("em|ex|px|in|cm|mm|pt|pc")) {
                length2 -= 2;
            } else if (strTrim2.endsWith("%")) {
                length2--;
                enumC9014 = EnumC9012.PERCENTAGE;
            }
            if ("width".equals(strTrim)) {
                this.f32602 = Float.parseFloat(strTrim2.substring(0, length2));
                enumC9012 = enumC9014;
            } else if ("height".equals(strTrim)) {
                this.f32603 = Float.parseFloat(strTrim2.substring(0, length2));
                enumC9013 = enumC9014;
            } else if ("viewBox".equals(strTrim)) {
                this.f32616 = new float[4];
                String[] strArrSplit = strTrim2.split("[ ,]+");
                int i2 = 0;
                while (true) {
                    float[] fArr = this.f32616;
                    if (i2 < fArr.length) {
                        fArr[i2] = Float.parseFloat(strArrSplit[i2]);
                        i2++;
                    }
                }
            }
        }
        float[] fArr2 = this.f32616;
        if (fArr2 == null) {
            float f = this.f32602;
            if (f > 0.0f) {
                float f2 = this.f32603;
                if (f2 > 0.0f) {
                    this.f32616 = new float[]{0.0f, 0.0f, f, f2};
                } else if ((this.f32602 >= 0.0f || this.f32603 < 0.0f) && fArr2 != null) {
                    this.f32602 = fArr2[2];
                    this.f32603 = fArr2[3];
                }
            } else if (this.f32602 >= 0.0f) {
                this.f32602 = fArr2[2];
                this.f32603 = fArr2[3];
            } else {
                this.f32602 = fArr2[2];
                this.f32603 = fArr2[3];
            }
        } else if (this.f32602 >= 0.0f) {
            this.f32602 = fArr2[2];
            this.f32603 = fArr2[3];
        } else {
            this.f32602 = fArr2[2];
            this.f32603 = fArr2[3];
        }
        EnumC9012 enumC9015 = EnumC9012.PERCENTAGE;
        if (enumC9012 == enumC9015) {
            float f3 = this.f32602;
            if (f3 > 0.0f) {
                this.f32602 = (this.f32616[2] * f3) / 100.0f;
            }
        }
        if (enumC9013 == enumC9015) {
            float f4 = this.f32603;
            if (f4 > 0.0f) {
                this.f32603 = (this.f32616[3] * f4) / 100.0f;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static double m26861(String str, double d) {
        if (str.endsWith("%")) {
            return (Double.parseDouble(str.substring(0, str.length() - 1)) / 100.0d) * d;
        }
        return Double.parseDouble(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26882(AbstractC16387 abstractC16387, String str) {
        this.f32618.put(str, abstractC16387);
    }

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC16387 m26887(String str) {
        return (AbstractC16387) this.f32618.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26871(C13036 c13036) {
        this.f32608.add(c13036);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final HashSet m26893() {
        return this.f32608;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26867(String str) {
        this.f32606.add(str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m26891(String str) {
        return this.f32606.contains(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26873(AbstractC16387 abstractC16387, C13036 c13036, String str) {
        this.f32609.put(abstractC16387, Pair.create(c13036, str));
    }

    /* JADX INFO: renamed from: ܽ */
    public final Set m26886() {
        return this.f32609.entrySet();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26872(AbstractC16387 abstractC16387, String str) {
        HashMap map = this.f32605;
        if (map.containsKey(str)) {
            ((Set) map.get(str)).add(abstractC16387);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(abstractC16387);
        map.put(str, hashSet);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26868(String str, String str2) {
        this.f32615.put(str, str2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m26879(String str) {
        return (String) this.f32615.get(str);
    }

    /* JADX INFO: renamed from: ۜ */
    public final Set m26876() {
        return this.f32605.entrySet();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13036 m26863(AbstractC16387 abstractC16387) {
        return this.f32607.m29853(abstractC16387);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m26862(double d) {
        if (this.f32612 == null) {
            float[] fArr = this.f32616;
            int iFloor = 4 - ((int) Math.floor(Math.log10(Math.max(fArr != null ? fArr[3] : -1.0f, fArr == null ? -1.0f : fArr[2]))));
            StringBuilder sb = new StringBuilder("#");
            if (iFloor > 0) {
                if (iFloor > 6) {
                    iFloor = 6;
                }
                sb.append('.');
                for (int i = 0; i < iFloor; i++) {
                    sb.append('#');
                }
            }
            DecimalFormat decimalFormat = new DecimalFormat(sb.toString(), new DecimalFormatSymbols(Locale.ROOT));
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            this.f32612 = decimalFormat;
        }
        return C5595.m12401(this.f32612.format(d));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26866(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        if (this.f32607 == null) {
            throw new IllegalStateException("SvgTree is not fully initialized");
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, StandardCharsets.UTF_8);
        outputStreamWriter.write("<vector xmlns:android=\"http://schemas.android.com/apk/res/android\"");
        outputStreamWriter.write("\n");
        if (this.f32613) {
            outputStreamWriter.write(ASN1Dump.TAB);
            outputStreamWriter.write("xmlns:aapt=\"http://schemas.android.com/aapt\"");
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:width=\"");
        float f = this.f32602;
        float f2 = this.f32604;
        outputStreamWriter.write(m26862(f * f2));
        outputStreamWriter.write("dp\"");
        outputStreamWriter.write("\n");
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:height=\"");
        outputStreamWriter.write(m26862(this.f32603 * f2));
        outputStreamWriter.write("dp\"");
        outputStreamWriter.write("\n");
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:viewportWidth=\"");
        float[] fArr = this.f32616;
        outputStreamWriter.write(m26862(fArr == null ? -1.0f : fArr[2]));
        outputStreamWriter.write("\"");
        outputStreamWriter.write("\n");
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:viewportHeight=\"");
        float[] fArr2 = this.f32616;
        outputStreamWriter.write(m26862(fArr2 != null ? fArr2[3] : -1.0f));
        outputStreamWriter.write("\">");
        outputStreamWriter.write("\n");
        float[] fArr3 = this.f32616;
        C2976 c2976 = new C2976(-fArr3[0], -fArr3[1]);
        C2976 c2977 = this.f32611;
        c2977.m4951(c2976);
        this.f32607.mo8862(c2977);
        f32601.log(Level.FINE, "matrix=" + c2977);
        this.f32607.mo8856(outputStreamWriter, EnumC2483.f3919);
        outputStreamWriter.write("</vector>");
        outputStreamWriter.write("\n");
        outputStreamWriter.close();
    }
}
