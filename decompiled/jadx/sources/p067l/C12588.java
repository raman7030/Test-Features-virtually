package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.simpleframework.xml.stream.DocumentReader;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: l.ۧۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1GU */
/* JADX INFO: loaded from: classes3.dex */
public final class C12588 implements XmlSerializer {

    /* JADX INFO: renamed from: ֫ */
    public int f35354;

    /* JADX INFO: renamed from: ۢ */
    public C19293 f35356;

    /* JADX INFO: renamed from: ۧ */
    public int f35357;

    /* JADX INFO: renamed from: ܳ */
    public C2528 f35358;

    /* JADX INFO: renamed from: ᩳ */
    public String f35361;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f35362;

    /* JADX INFO: renamed from: ܽ */
    public String[] f35359 = new String[12];

    /* JADX INFO: renamed from: ᩻ */
    public int[] f35363 = new int[4];

    /* JADX INFO: renamed from: ۜ */
    public String[] f35355 = new String[8];

    /* JADX INFO: renamed from: ܿ */
    public boolean[] f35360 = new boolean[4];

    public C12588(boolean z) {
        setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        if (z) {
            this.f35358 = new C2528();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m28995(boolean z) throws IOException {
        if (!this.f35362) {
            return;
        }
        int i = this.f35357;
        int i2 = i + 1;
        this.f35357 = i2;
        this.f35362 = false;
        boolean[] zArr = this.f35360;
        if (zArr.length <= i2) {
            boolean[] zArr2 = new boolean[i + 5];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f35360 = zArr2;
        }
        boolean[] zArr3 = this.f35360;
        int i3 = this.f35357;
        int i4 = i3 - 1;
        zArr3[i3] = zArr3[i4];
        int i5 = this.f35363[i4];
        while (true) {
            int[] iArr = this.f35363;
            int i6 = this.f35357;
            if (i5 < iArr[i6]) {
                this.f35356.write(32);
                this.f35356.write("xmlns");
                int i7 = i5 * 2;
                if (!"".equals(this.f35355[i7])) {
                    this.f35356.write(58);
                    this.f35356.write(this.f35355[i7]);
                } else if ("".equals(getNamespace()) && !"".equals(this.f35355[i7 + 1])) {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
                this.f35356.write("=\"");
                m28994(34, this.f35355[i7 + 1]);
                this.f35356.write(34);
                i5++;
            } else {
                int i8 = i6 + 1;
                if (iArr.length <= i8) {
                    int[] iArr2 = new int[i6 + 8];
                    System.arraycopy(iArr, 0, iArr2, 0, i8);
                    this.f35363 = iArr2;
                }
                int[] iArr3 = this.f35363;
                int i9 = this.f35357;
                iArr3[i9 + 1] = iArr3[i9];
                this.f35356.write(z ? " />" : ">");
                C2528 c2528 = this.f35358;
                if (c2528 != null) {
                    c2528.m3704(this.f35356.getPosition());
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m28992(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\r') {
                sb.append("&#");
                sb.append((int) cCharAt);
                sb.append(';');
            } else if (cCharAt == '&') {
                sb.append("&amp;");
            } else if (cCharAt == '<') {
                sb.append("&lt;");
            } else if (cCharAt == '>') {
                sb.append("&gt;");
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x0074, please report this as an issue */
    /* JADX INFO: renamed from: ֫ */
    private void m28994(int i, String str) throws IOException {
        String str2;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\t' || cCharAt == '\n') {
                if (i == -1) {
                    this.f35356.write(cCharAt);
                } else {
                    this.f35356.write("&#" + ((int) cCharAt) + ';');
                }
            } else if (cCharAt == '\r') {
                this.f35356.write("&#" + ((int) cCharAt) + ';');
            } else if (cCharAt == '\"') {
                if (cCharAt == i) {
                    C19293 c19293 = this.f35356;
                    if (cCharAt == '\"') {
                        str2 = "&quot;";
                    } else {
                        str2 = "&apos;";
                    }
                    c19293.write(str2);
                } else if (cCharAt < ' ' && cCharAt < 127) {
                    this.f35356.write(cCharAt);
                } else if (m28996(cCharAt)) {
                    this.f35356.write(cCharAt);
                } else {
                    this.f35356.write("&#" + ((int) cCharAt) + C0249l.f1196b);
                }
            } else if (cCharAt == '<') {
                this.f35356.write("&lt;");
            } else if (cCharAt == '>') {
                this.f35356.write("&gt;");
            } else if (cCharAt == '&') {
                this.f35356.write("&amp;");
            } else if (cCharAt != '\'') {
                if (cCharAt < ' ') {
                    if (m28996(cCharAt)) {
                        this.f35356.write(cCharAt);
                    } else {
                        this.f35356.write("&#" + ((int) cCharAt) + C0249l.f1196b);
                    }
                } else if (m28996(cCharAt)) {
                    this.f35356.write(cCharAt);
                } else {
                    this.f35356.write("&#" + ((int) cCharAt) + C0249l.f1196b);
                }
            } else if (cCharAt == i) {
                C19293 c19294 = this.f35356;
                if (cCharAt == '\"') {
                    str2 = "&quot;";
                } else {
                    str2 = "&apos;";
                }
                c19294.write(str2);
            } else if (cCharAt < ' ') {
                if (m28996(cCharAt)) {
                    this.f35356.write(cCharAt);
                } else {
                    this.f35356.write("&#" + ((int) cCharAt) + C0249l.f1196b);
                }
            } else if (m28996(cCharAt)) {
                this.f35356.write(cCharAt);
            } else {
                this.f35356.write("&#" + ((int) cCharAt) + C0249l.f1196b);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m28996(char c) {
        Character.UnicodeBlock unicodeBlockOf;
        if ((c < ' ' && c != '\r' && c != '\n' && c != '\t') || c == 127) {
            return false;
        }
        if (c > 127) {
            return (!Character.isValidCodePoint(c) || (unicodeBlockOf = Character.UnicodeBlock.of(c)) == Character.UnicodeBlock.PRIVATE_USE_AREA || unicodeBlockOf == Character.UnicodeBlock.SPECIALS || unicodeBlockOf == Character.UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_A || unicodeBlockOf == Character.UnicodeBlock.SUPPLEMENTARY_PRIVATE_USE_AREA_B) ? false : true;
        }
        return true;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void docdecl(String str) throws IOException {
        this.f35356.write("<!DOCTYPE");
        this.f35356.write(str);
        this.f35356.write(">");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void endDocument() throws IOException {
        while (true) {
            int i = this.f35357;
            if (i > 0) {
                String[] strArr = this.f35359;
                endTag(strArr[(i * 3) - 3], strArr[(i * 3) - 1]);
            } else {
                flush();
                return;
            }
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) throws IOException {
        m28995(false);
        this.f35356.write(38);
        this.f35356.write(str);
        this.f35356.write(59);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final boolean getFeature(String str) {
        return "http://xmlpull.org/v1/doc/features.html#indent-output".equals(str) && this.f35360[this.f35357];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getPrefix(String str, boolean z) {
        try {
            return m28993(str, false, z);
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private String m28993(String str, boolean z, boolean z2) throws IOException {
        int i = this.f35363[this.f35357 + 1] * 2;
        while (true) {
            i -= 2;
            String str2 = null;
            String str3 = "";
            if (i < 0) {
                if (!z2) {
                    return null;
                }
                if (!"".equals(str)) {
                    do {
                        StringBuilder sb = new StringBuilder("n");
                        int i2 = this.f35354;
                        this.f35354 = i2 + 1;
                        sb.append(i2);
                        String string = sb.toString();
                        int i3 = this.f35363[this.f35357 + 1] * 2;
                        while (true) {
                            i3 -= 2;
                            if (i3 < 0) {
                                str3 = string;
                                break;
                            }
                            if (string.equals(this.f35355[i3])) {
                                str3 = null;
                                break;
                            }
                        }
                    } while (str3 == null);
                }
                boolean z3 = this.f35362;
                this.f35362 = false;
                setPrefix(str3, str);
                this.f35362 = z3;
                return str3;
            }
            if (this.f35355[i + 1].equals(str) && (z || !this.f35355[i].equals(""))) {
                String str4 = this.f35355[i];
                int i4 = i + 2;
                while (true) {
                    if (i4 >= this.f35363[this.f35357 + 1] * 2) {
                        str2 = str4;
                        break;
                    }
                    if (this.f35355[i4].equals(str4)) {
                        break;
                    }
                    i4++;
                }
                if (str2 != null) {
                    return str2;
                }
            }
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final Object getProperty(String str) {
        throw new RuntimeException("Unsupported property");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void ignorableWhitespace(String str) throws IOException {
        text(str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setFeature(String str, boolean z) {
        if ("http://xmlpull.org/v1/doc/features.html#indent-output".equals(str)) {
            this.f35360[this.f35357] = z;
            return;
        }
        throw new RuntimeException("Unsupported Feature");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setProperty(String str, Object obj) {
        throw new RuntimeException(C7470.m17246(obj, "Unsupported Property:"));
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setPrefix(String str, String str2) throws IOException {
        m28995(false);
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str.equals(m28993(str2, true, false))) {
            return;
        }
        int[] iArr = this.f35363;
        int i = this.f35357 + 1;
        int i2 = iArr[i];
        iArr[i] = i2 + 1;
        int i3 = i2 << 1;
        String[] strArr = this.f35355;
        int i4 = i3 + 1;
        if (strArr.length < i4) {
            String[] strArr2 = new String[strArr.length + 16];
            System.arraycopy(strArr, 0, strArr2, 0, i3);
            this.f35355 = strArr2;
        }
        String[] strArr3 = this.f35355;
        strArr3[i3] = str;
        strArr3[i4] = str2;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        this.f35356 = new C19293(writer);
        int[] iArr = this.f35363;
        iArr[0] = 2;
        iArr[1] = 2;
        String[] strArr = this.f35355;
        strArr[0] = "";
        strArr[1] = "";
        strArr[2] = DocumentReader.RESERVED;
        strArr[3] = "http://www.w3.org/XML/1998/namespace";
        this.f35362 = false;
        this.f35354 = 0;
        this.f35357 = 0;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(OutputStream outputStream, String str) {
        OutputStreamWriter outputStreamWriter;
        if (outputStream == null) {
            throw new IllegalArgumentException();
        }
        if (str == null) {
            outputStreamWriter = new OutputStreamWriter(outputStream);
        } else {
            outputStreamWriter = new OutputStreamWriter(outputStream, str);
        }
        setOutput(outputStreamWriter);
        this.f35361 = str;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void startDocument(String str, Boolean bool) throws IOException {
        this.f35356.write("<?xml version='1.0' ");
        if (str != null) {
            this.f35361 = str;
        }
        if (this.f35361 != null) {
            this.f35356.write("encoding='");
            this.f35356.write(this.f35361);
            this.f35356.write("' ");
        }
        if (bool != null) {
            this.f35356.write("standalone='");
            this.f35356.write(bool.booleanValue() ? "yes" : "no");
            this.f35356.write("' ");
        }
        this.f35356.write("?>");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) throws IOException {
        m28995(false);
        C2528 c2528 = this.f35358;
        if (c2528 != null) {
            c2528.mo3702(str2);
        }
        if (this.f35360[this.f35357]) {
            this.f35356.write("\n");
            for (int i = 0; i < this.f35357; i++) {
                this.f35356.write(ASN1Dump.TAB);
            }
        }
        int i2 = this.f35357 * 3;
        String[] strArr = this.f35359;
        if (strArr.length < i2 + 3) {
            String[] strArr2 = new String[strArr.length + 12];
            System.arraycopy(strArr, 0, strArr2, 0, i2);
            this.f35359 = strArr2;
        }
        String strM28993 = str == null ? "" : m28993(str, true, true);
        if (strM28993 == null) {
            strM28993 = "";
        }
        if ("".equals(str)) {
            for (int i3 = this.f35363[this.f35357]; i3 < this.f35363[this.f35357 + 1]; i3++) {
                int i4 = i3 * 2;
                if ("".equals(this.f35355[i4]) && !"".equals(this.f35355[i4 + 1])) {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
            }
        }
        String[] strArr3 = this.f35359;
        strArr3[i2] = str;
        strArr3[i2 + 1] = strM28993;
        strArr3[i2 + 2] = str2;
        if (c2528 != null) {
            c2528.m3705(this.f35356.m43987(), this.f35356.m43986(), this.f35356.getPosition());
        }
        this.f35356.write(60);
        if (!"".equals(strM28993)) {
            this.f35356.write(strM28993);
            this.f35356.write(58);
        }
        this.f35356.write(str2);
        this.f35362 = true;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        if (!this.f35362) {
            throw new IllegalStateException("illegal position for attribute");
        }
        C2528 c2528 = this.f35358;
        if (c2528 != null) {
            c2528.mo3699(str2, str3);
        }
        if (str == null) {
            str = "";
        }
        String strM28993 = "".equals(str) ? "" : m28993(str, false, true);
        if (strM28993 == null) {
            strM28993 = "";
        }
        this.f35356.write(32);
        if (c2528 != null) {
            c2528.m3697(this.f35356.m43987(), this.f35356.m43986(), this.f35356.getPosition());
        }
        if (!"".equals(strM28993)) {
            this.f35356.write(strM28993);
            this.f35356.write(58);
        }
        this.f35356.write(str2);
        if (c2528 != null) {
            c2528.m3696(this.f35356.getPosition());
        }
        this.f35356.write(61);
        int i = str3.indexOf(34) != -1 ? 39 : 34;
        this.f35356.write(i);
        if (c2528 != null) {
            c2528.m3701(this.f35356.m43987(), this.f35356.m43986(), this.f35356.getPosition());
        }
        m28994(i, str3);
        if (c2528 != null) {
            c2528.m3700(this.f35356.getPosition());
        }
        this.f35356.write(i);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() throws IOException {
        m28995(false);
        this.f35356.flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) throws IOException {
        if (!this.f35362) {
            this.f35357--;
        }
        if ((str == null && this.f35359[this.f35357 * 3] != null) || ((str != null && !str.equals(this.f35359[this.f35357 * 3])) || !this.f35359[(this.f35357 * 3) + 2].equals(str2))) {
            StringBuilder sbM12525 = C5633.m12525("</{", str, C0249l.f1198d, str2, "> does not match start: <{");
            sbM12525.append(this.f35359[this.f35357 * 3]);
            sbM12525.append(C0249l.f1198d);
            throw new IllegalArgumentException(C10965.m25286(sbM12525, this.f35359[(this.f35357 * 3) + 2], ">"));
        }
        if (this.f35362) {
            m28995(true);
            this.f35357--;
        } else {
            if (this.f35360[this.f35357 + 1]) {
                this.f35356.write("\n");
                for (int i = 0; i < this.f35357; i++) {
                    this.f35356.write(ASN1Dump.TAB);
                }
            }
            this.f35356.write("</");
            String str3 = this.f35359[(this.f35357 * 3) + 1];
            if (!"".equals(str3)) {
                this.f35356.write(str3);
                this.f35356.write(58);
            }
            this.f35356.write(str2);
            this.f35356.write(62);
        }
        int[] iArr = this.f35363;
        int i2 = this.f35357;
        iArr[i2 + 1] = iArr[i2];
        C2528 c2528 = this.f35358;
        if (c2528 != null) {
            c2528.mo3698(str2);
        }
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getNamespace() {
        if (getDepth() == 0) {
            return null;
        }
        return this.f35359[(getDepth() * 3) - 3];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getName() {
        if (getDepth() == 0) {
            return null;
        }
        return this.f35359[(getDepth() * 3) - 1];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final int getDepth() {
        return this.f35362 ? this.f35357 + 1 : this.f35357;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) throws IOException {
        m28995(false);
        this.f35360[this.f35357] = false;
        C2528 c2528 = this.f35358;
        if (c2528 != null) {
            boolean zM3703 = c2528.m3703();
            c2528.text(str);
            if (!zM3703) {
                c2528.m3707(this.f35356.m43987(), this.f35356.m43986(), this.f35356.getPosition());
            }
        }
        m28994(-1, str);
        if (c2528 != null) {
            c2528.m3706(this.f35356.getPosition());
        }
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(char[] cArr, int i, int i2) throws IOException {
        text(new String(cArr, i, i2));
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void cdsect(String str) throws IOException {
        m28995(false);
        this.f35356.write("<![CDATA[");
        this.f35356.write(str);
        this.f35356.write("]]>");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void comment(String str) throws IOException {
        m28995(false);
        this.f35356.write("<!--");
        this.f35356.write(str);
        this.f35356.write("-->");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void processingInstruction(String str) throws IOException {
        m28995(false);
        this.f35356.write("<?");
        this.f35356.write(str);
        this.f35356.write("?>");
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20635 m28997() {
        C2528 c2528 = this.f35358;
        C12826.requireNonNull(c2528);
        return c2528.m3695();
    }
}
