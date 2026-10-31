package l;

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
public final class C9813 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Logger f29650 = Logger.getLogger("SvgTree");

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C11224 f29656;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f29659;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public DecimalFormat f29661;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f29662;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f29663;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float[] f29665;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f29651 = -1.0f;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f29652 = -1.0f;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C0639 f29660 = new C0639();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f29653 = 1.0f;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f29666 = new ArrayList();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashMap f29667 = new HashMap();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashSet f29655 = new HashSet();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final HashSet f29657 = new HashSet();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f29658 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final HashMap f29654 = new HashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f29664 = new HashMap();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float m24863() {
        return this.f29651;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m24869() {
        return this.f29652;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m24870() {
        this.f29659 = true;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m24862() {
        this.f29662 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float[] m24877() {
        return this.f29665;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24865() {
        this.f29656.mo6733(new C0639());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m24860() {
        this.f29656.mo27793();
        if (!this.f29666.isEmpty() || this.f29659) {
            return;
        }
        m24854("No vector content found", (Node) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Document m24849(String str, ArrayList arrayList, byte[] bArr) {
        this.f29663 = str;
        try {
            return C4873.m14231(arrayList, bArr);
        } catch (ParserConfigurationException e) {
            throw new Error("Internal error", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24850() {
        f29650.log(Level.FINE, "file: " + this.f29663);
        this.f29656.mo6731("");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24866(C11224 c11224) {
        this.f29656 = c11224;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24854(String str, Node node) {
        m24855(str, node, EnumC21102.ERROR);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24855(String str, Node node, EnumC21102 enumC21102) {
        C4025.m12110(!str.isEmpty());
        this.f29666.add(new C23923(enumC21102, node == null ? 0 : C4873.m14230(node).m10600() + 1, str));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m24875() {
        ArrayList<C23923> arrayList = this.f29666;
        if (arrayList.isEmpty()) {
            return "";
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (C23923 c23923 : arrayList) {
            if (sb.length() != 0) {
                sb.append('\n');
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c23923.f77595.name());
            int i = c23923.f77596;
            sb2.append(i == 0 ? "" : C19370.m44628(i, " @ line "));
            sb2.append(": ");
            sb2.append(c23923.f77594);
            sb.append(sb2.toString());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m24874() {
        return this.f29659;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final double m24873(String str) {
        float[] fArr = this.f29665;
        return m24846(str, fArr == null ? -1.0f : fArr[2]);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final double m24868(String str) {
        float[] fArr = this.f29665;
        return m24846(str, fArr == null ? -1.0f : fArr[3]);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24859(Element element) {
        NamedNodeMap attributes = element.getAttributes();
        int length = attributes.getLength();
        EnumC6990 enumC6990 = EnumC6990.PIXEL;
        EnumC6990 enumC6991 = enumC6990;
        for (int i = 0; i < length; i++) {
            Node nodeItem = attributes.item(i);
            String strTrim = nodeItem.getNodeName().trim();
            String strTrim2 = nodeItem.getNodeValue().trim();
            int length2 = strTrim2.length();
            EnumC6990 enumC6992 = EnumC6990.PIXEL;
            if (strTrim2.substring(Math.max(strTrim2.length() - 2, 0)).matches("em|ex|px|in|cm|mm|pt|pc")) {
                length2 -= 2;
            } else if (strTrim2.endsWith("%")) {
                length2--;
                enumC6992 = EnumC6990.PERCENTAGE;
            }
            if ("width".equals(strTrim)) {
                this.f29651 = Float.parseFloat(strTrim2.substring(0, length2));
                enumC6990 = enumC6992;
            } else if ("height".equals(strTrim)) {
                this.f29652 = Float.parseFloat(strTrim2.substring(0, length2));
                enumC6991 = enumC6992;
            } else if ("viewBox".equals(strTrim)) {
                this.f29665 = new float[4];
                String[] strArrSplit = strTrim2.split("[ ,]+");
                int i2 = 0;
                while (true) {
                    float[] fArr = this.f29665;
                    if (i2 < fArr.length) {
                        fArr[i2] = Float.parseFloat(strArrSplit[i2]);
                        i2++;
                    }
                }
            }
        }
        float[] fArr2 = this.f29665;
        if (fArr2 == null) {
            float f = this.f29651;
            if (f > 0.0f) {
                float f2 = this.f29652;
                if (f2 > 0.0f) {
                    this.f29665 = new float[]{0.0f, 0.0f, f, f2};
                } else if ((this.f29651 >= 0.0f || this.f29652 < 0.0f) && fArr2 != null) {
                    this.f29651 = fArr2[2];
                    this.f29652 = fArr2[3];
                }
            } else if (this.f29651 >= 0.0f) {
                this.f29651 = fArr2[2];
                this.f29652 = fArr2[3];
            } else {
                this.f29651 = fArr2[2];
                this.f29652 = fArr2[3];
            }
        } else if (this.f29651 >= 0.0f) {
            this.f29651 = fArr2[2];
            this.f29652 = fArr2[3];
        } else {
            this.f29651 = fArr2[2];
            this.f29652 = fArr2[3];
        }
        EnumC6990 enumC6993 = EnumC6990.PERCENTAGE;
        if (enumC6990 == enumC6993) {
            float f3 = this.f29651;
            if (f3 > 0.0f) {
                this.f29651 = (this.f29665[2] * f3) / 100.0f;
            }
        }
        if (enumC6991 == enumC6993) {
            float f4 = this.f29652;
            if (f4 > 0.0f) {
                this.f29652 = (this.f29665[3] * f4) / 100.0f;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static double m24846(String str, double d) {
        if (str.endsWith("%")) {
            return (Double.parseDouble(str.substring(0, str.length() - 1)) / 100.0d) * d;
        }
        return Double.parseDouble(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24867(AbstractC14750 abstractC14750, String str) {
        this.f29667.put(str, abstractC14750);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC14750 m24872(String str) {
        return (AbstractC14750) this.f29667.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24856(C11224 c11224) {
        this.f29657.add(c11224);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashSet m24878() {
        return this.f29657;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24852(String str) {
        this.f29655.add(str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m24876(String str) {
        return this.f29655.contains(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24858(AbstractC14750 abstractC14750, C11224 c11224, String str) {
        this.f29658.put(abstractC14750, Pair.create(c11224, str));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Set m24871() {
        return this.f29658.entrySet();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24857(AbstractC14750 abstractC14750, String str) {
        HashMap map = this.f29654;
        if (map.containsKey(str)) {
            ((Set) map.get(str)).add(abstractC14750);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(abstractC14750);
        map.put(str, hashSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24853(String str, String str2) {
        this.f29664.put(str, str2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m24864(String str) {
        return (String) this.f29664.get(str);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Set m24861() {
        return this.f29654.entrySet();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11224 m24848(AbstractC14750 abstractC14750) {
        return this.f29656.m27791(abstractC14750);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m24847(double d) {
        if (this.f29661 == null) {
            float[] fArr = this.f29665;
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
            this.f29661 = decimalFormat;
        }
        return C3395.m10362(this.f29661.format(d));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24851(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        if (this.f29656 == null) {
            throw new IllegalStateException("SvgTree is not fully initialized");
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, StandardCharsets.UTF_8);
        outputStreamWriter.write("<vector xmlns:android=\"http://schemas.android.com/apk/res/android\"");
        outputStreamWriter.write("\n");
        if (this.f29662) {
            outputStreamWriter.write(ASN1Dump.TAB);
            outputStreamWriter.write("xmlns:aapt=\"http://schemas.android.com/aapt\"");
            outputStreamWriter.write("\n");
        }
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:width=\"");
        float f = this.f29651;
        float f2 = this.f29653;
        outputStreamWriter.write(m24847(f * f2));
        outputStreamWriter.write("dp\"");
        outputStreamWriter.write("\n");
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:height=\"");
        outputStreamWriter.write(m24847(this.f29652 * f2));
        outputStreamWriter.write("dp\"");
        outputStreamWriter.write("\n");
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:viewportWidth=\"");
        float[] fArr = this.f29665;
        outputStreamWriter.write(m24847(fArr == null ? -1.0f : fArr[2]));
        outputStreamWriter.write("\"");
        outputStreamWriter.write("\n");
        outputStreamWriter.write(ASN1Dump.TAB);
        outputStreamWriter.write("android:viewportHeight=\"");
        float[] fArr2 = this.f29665;
        outputStreamWriter.write(m24847(fArr2 != null ? fArr2[3] : -1.0f));
        outputStreamWriter.write("\">");
        outputStreamWriter.write("\n");
        float[] fArr3 = this.f29665;
        C0639 c0639 = new C0639(-fArr3[0], -fArr3[1]);
        C0639 c06310 = this.f29660;
        c06310.m2611(c0639);
        this.f29656.mo6736(c06310);
        f29650.log(Level.FINE, "matrix=" + c06310);
        this.f29656.mo6730(outputStreamWriter, EnumC0121.f1143);
        outputStreamWriter.write("</vector>");
        outputStreamWriter.write("\n");
        outputStreamWriter.close();
    }
}
