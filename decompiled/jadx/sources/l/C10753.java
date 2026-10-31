package l;

import com.alipay.sdk.m.y.l;
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
public final class C10753 implements XmlSerializer {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f32379;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C17808 f32381;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f32382;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C0168 f32383;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f32386;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f32387;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String[] f32384 = new String[12];

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int[] f32388 = new int[4];

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String[] f32380 = new String[8];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean[] f32385 = new boolean[4];

    public C10753(boolean z) {
        setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        if (z) {
            this.f32383 = new C0168();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26951(boolean z) throws IOException {
        if (!this.f32387) {
            return;
        }
        int i = this.f32382;
        int i2 = i + 1;
        this.f32382 = i2;
        this.f32387 = false;
        boolean[] zArr = this.f32385;
        if (zArr.length <= i2) {
            boolean[] zArr2 = new boolean[i + 5];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f32385 = zArr2;
        }
        boolean[] zArr3 = this.f32385;
        int i3 = this.f32382;
        int i4 = i3 - 1;
        zArr3[i3] = zArr3[i4];
        int i5 = this.f32388[i4];
        while (true) {
            int[] iArr = this.f32388;
            int i6 = this.f32382;
            if (i5 < iArr[i6]) {
                this.f32381.write(32);
                this.f32381.write("xmlns");
                int i7 = i5 * 2;
                if (!"".equals(this.f32380[i7])) {
                    this.f32381.write(58);
                    this.f32381.write(this.f32380[i7]);
                } else if ("".equals(getNamespace()) && !"".equals(this.f32380[i7 + 1])) {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
                this.f32381.write("=\"");
                m26950(34, this.f32380[i7 + 1]);
                this.f32381.write(34);
                i5++;
            } else {
                int i8 = i6 + 1;
                if (iArr.length <= i8) {
                    int[] iArr2 = new int[i6 + 8];
                    System.arraycopy(iArr, 0, iArr2, 0, i8);
                    this.f32388 = iArr2;
                }
                int[] iArr3 = this.f32388;
                int i9 = this.f32382;
                iArr3[i9 + 1] = iArr3[i9];
                this.f32381.write(z ? " />" : ">");
                C0168 c0168 = this.f32383;
                if (c0168 != null) {
                    c0168.m1296(this.f32381.getPosition());
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m26948(String str) {
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26950(int i, String str) throws IOException {
        String str2;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\t' || cCharAt == '\n') {
                if (i == -1) {
                    this.f32381.write(cCharAt);
                } else {
                    this.f32381.write("&#" + ((int) cCharAt) + ';');
                }
            } else if (cCharAt == '\r') {
                this.f32381.write("&#" + ((int) cCharAt) + ';');
            } else if (cCharAt == '\"') {
                if (cCharAt == i) {
                    C17808 c17808 = this.f32381;
                    if (cCharAt == '\"') {
                        str2 = "&quot;";
                    } else {
                        str2 = "&apos;";
                    }
                    c17808.write(str2);
                } else if (cCharAt < ' ' && cCharAt < 127) {
                    this.f32381.write(cCharAt);
                } else if (m26952(cCharAt)) {
                    this.f32381.write(cCharAt);
                } else {
                    this.f32381.write("&#" + ((int) cCharAt) + l.b);
                }
            } else if (cCharAt == '<') {
                this.f32381.write("&lt;");
            } else if (cCharAt == '>') {
                this.f32381.write("&gt;");
            } else if (cCharAt == '&') {
                this.f32381.write("&amp;");
            } else if (cCharAt != '\'') {
                if (cCharAt < ' ') {
                    if (m26952(cCharAt)) {
                        this.f32381.write(cCharAt);
                    } else {
                        this.f32381.write("&#" + ((int) cCharAt) + l.b);
                    }
                } else if (m26952(cCharAt)) {
                    this.f32381.write(cCharAt);
                } else {
                    this.f32381.write("&#" + ((int) cCharAt) + l.b);
                }
            } else if (cCharAt == i) {
                C17808 c17809 = this.f32381;
                if (cCharAt == '\"') {
                    str2 = "&quot;";
                } else {
                    str2 = "&apos;";
                }
                c17809.write(str2);
            } else if (cCharAt < ' ') {
                if (m26952(cCharAt)) {
                    this.f32381.write(cCharAt);
                } else {
                    this.f32381.write("&#" + ((int) cCharAt) + l.b);
                }
            } else if (m26952(cCharAt)) {
                this.f32381.write(cCharAt);
            } else {
                this.f32381.write("&#" + ((int) cCharAt) + l.b);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m26952(char c) {
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
        this.f32381.write("<!DOCTYPE");
        this.f32381.write(str);
        this.f32381.write(">");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void endDocument() throws IOException {
        while (true) {
            int i = this.f32382;
            if (i > 0) {
                String[] strArr = this.f32384;
                endTag(strArr[(i * 3) - 3], strArr[(i * 3) - 1]);
            } else {
                flush();
                return;
            }
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) throws IOException {
        m26951(false);
        this.f32381.write(38);
        this.f32381.write(str);
        this.f32381.write(59);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final boolean getFeature(String str) {
        return "http://xmlpull.org/v1/doc/features.html#indent-output".equals(str) && this.f32385[this.f32382];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getPrefix(String str, boolean z) {
        try {
            return m26949(str, false, z);
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m26949(String str, boolean z, boolean z2) throws IOException {
        int i = this.f32388[this.f32382 + 1] * 2;
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
                        int i2 = this.f32379;
                        this.f32379 = i2 + 1;
                        sb.append(i2);
                        String string = sb.toString();
                        int i3 = this.f32388[this.f32382 + 1] * 2;
                        while (true) {
                            i3 -= 2;
                            if (i3 < 0) {
                                str3 = string;
                                break;
                            }
                            if (string.equals(this.f32380[i3])) {
                                str3 = null;
                                break;
                            }
                        }
                    } while (str3 == null);
                }
                boolean z3 = this.f32387;
                this.f32387 = false;
                setPrefix(str3, str);
                this.f32387 = z3;
                return str3;
            }
            if (this.f32380[i + 1].equals(str) && (z || !this.f32380[i].equals(""))) {
                String str4 = this.f32380[i];
                int i4 = i + 2;
                while (true) {
                    if (i4 >= this.f32388[this.f32382 + 1] * 2) {
                        str2 = str4;
                        break;
                    }
                    if (this.f32380[i4].equals(str4)) {
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
            this.f32385[this.f32382] = z;
            return;
        }
        throw new RuntimeException("Unsupported Feature");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setProperty(String str, Object obj) {
        throw new RuntimeException(C5368.m15337(obj, "Unsupported Property:"));
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setPrefix(String str, String str2) throws IOException {
        m26951(false);
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str.equals(m26949(str2, true, false))) {
            return;
        }
        int[] iArr = this.f32388;
        int i = this.f32382 + 1;
        int i2 = iArr[i];
        iArr[i] = i2 + 1;
        int i3 = i2 << 1;
        String[] strArr = this.f32380;
        int i4 = i3 + 1;
        if (strArr.length < i4) {
            String[] strArr2 = new String[strArr.length + 16];
            System.arraycopy(strArr, 0, strArr2, 0, i3);
            this.f32380 = strArr2;
        }
        String[] strArr3 = this.f32380;
        strArr3[i3] = str;
        strArr3[i4] = str2;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        this.f32381 = new C17808(writer);
        int[] iArr = this.f32388;
        iArr[0] = 2;
        iArr[1] = 2;
        String[] strArr = this.f32380;
        strArr[0] = "";
        strArr[1] = "";
        strArr[2] = DocumentReader.RESERVED;
        strArr[3] = "http://www.w3.org/XML/1998/namespace";
        this.f32387 = false;
        this.f32379 = 0;
        this.f32382 = 0;
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
        this.f32386 = str;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void startDocument(String str, Boolean bool) throws IOException {
        this.f32381.write("<?xml version='1.0' ");
        if (str != null) {
            this.f32386 = str;
        }
        if (this.f32386 != null) {
            this.f32381.write("encoding='");
            this.f32381.write(this.f32386);
            this.f32381.write("' ");
        }
        if (bool != null) {
            this.f32381.write("standalone='");
            this.f32381.write(bool.booleanValue() ? "yes" : "no");
            this.f32381.write("' ");
        }
        this.f32381.write("?>");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) throws IOException {
        m26951(false);
        C0168 c0168 = this.f32383;
        if (c0168 != null) {
            c0168.mo1294(str2);
        }
        if (this.f32385[this.f32382]) {
            this.f32381.write("\n");
            for (int i = 0; i < this.f32382; i++) {
                this.f32381.write(ASN1Dump.TAB);
            }
        }
        int i2 = this.f32382 * 3;
        String[] strArr = this.f32384;
        if (strArr.length < i2 + 3) {
            String[] strArr2 = new String[strArr.length + 12];
            System.arraycopy(strArr, 0, strArr2, 0, i2);
            this.f32384 = strArr2;
        }
        String strM26949 = str == null ? "" : m26949(str, true, true);
        if (strM26949 == null) {
            strM26949 = "";
        }
        if ("".equals(str)) {
            for (int i3 = this.f32388[this.f32382]; i3 < this.f32388[this.f32382 + 1]; i3++) {
                int i4 = i3 * 2;
                if ("".equals(this.f32380[i4]) && !"".equals(this.f32380[i4 + 1])) {
                    throw new IllegalStateException("Cannot set default namespace for elements in no namespace");
                }
            }
        }
        String[] strArr3 = this.f32384;
        strArr3[i2] = str;
        strArr3[i2 + 1] = strM26949;
        strArr3[i2 + 2] = str2;
        if (c0168 != null) {
            c0168.m1297(this.f32381.m41741(), this.f32381.m41740(), this.f32381.getPosition());
        }
        this.f32381.write(60);
        if (!"".equals(strM26949)) {
            this.f32381.write(strM26949);
            this.f32381.write(58);
        }
        this.f32381.write(str2);
        this.f32387 = true;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        if (!this.f32387) {
            throw new IllegalStateException("illegal position for attribute");
        }
        C0168 c0168 = this.f32383;
        if (c0168 != null) {
            c0168.mo1291(str2, str3);
        }
        if (str == null) {
            str = "";
        }
        String strM26949 = "".equals(str) ? "" : m26949(str, false, true);
        if (strM26949 == null) {
            strM26949 = "";
        }
        this.f32381.write(32);
        if (c0168 != null) {
            c0168.m1289(this.f32381.m41741(), this.f32381.m41740(), this.f32381.getPosition());
        }
        if (!"".equals(strM26949)) {
            this.f32381.write(strM26949);
            this.f32381.write(58);
        }
        this.f32381.write(str2);
        if (c0168 != null) {
            c0168.m1288(this.f32381.getPosition());
        }
        this.f32381.write(61);
        int i = str3.indexOf(34) != -1 ? 39 : 34;
        this.f32381.write(i);
        if (c0168 != null) {
            c0168.m1293(this.f32381.m41741(), this.f32381.m41740(), this.f32381.getPosition());
        }
        m26950(i, str3);
        if (c0168 != null) {
            c0168.m1292(this.f32381.getPosition());
        }
        this.f32381.write(i);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() throws IOException {
        m26951(false);
        this.f32381.flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) throws IOException {
        if (!this.f32387) {
            this.f32382--;
        }
        if ((str == null && this.f32384[this.f32382 * 3] != null) || ((str != null && !str.equals(this.f32384[this.f32382 * 3])) || !this.f32384[(this.f32382 * 3) + 2].equals(str2))) {
            StringBuilder sbM10501 = C3435.m10501("</{", str, l.d, str2, "> does not match start: <{");
            sbM10501.append(this.f32384[this.f32382 * 3]);
            sbM10501.append(l.d);
            throw new IllegalArgumentException(C9045.m23341(sbM10501, this.f32384[(this.f32382 * 3) + 2], ">"));
        }
        if (this.f32387) {
            m26951(true);
            this.f32382--;
        } else {
            if (this.f32385[this.f32382 + 1]) {
                this.f32381.write("\n");
                for (int i = 0; i < this.f32382; i++) {
                    this.f32381.write(ASN1Dump.TAB);
                }
            }
            this.f32381.write("</");
            String str3 = this.f32384[(this.f32382 * 3) + 1];
            if (!"".equals(str3)) {
                this.f32381.write(str3);
                this.f32381.write(58);
            }
            this.f32381.write(str2);
            this.f32381.write(62);
        }
        int[] iArr = this.f32388;
        int i2 = this.f32382;
        iArr[i2 + 1] = iArr[i2];
        C0168 c0168 = this.f32383;
        if (c0168 != null) {
            c0168.mo1290(str2);
        }
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getNamespace() {
        if (getDepth() == 0) {
            return null;
        }
        return this.f32384[(getDepth() * 3) - 3];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getName() {
        if (getDepth() == 0) {
            return null;
        }
        return this.f32384[(getDepth() * 3) - 1];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final int getDepth() {
        return this.f32387 ? this.f32382 + 1 : this.f32382;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) throws IOException {
        m26951(false);
        this.f32385[this.f32382] = false;
        C0168 c0168 = this.f32383;
        if (c0168 != null) {
            boolean zM1295 = c0168.m1295();
            c0168.text(str);
            if (!zM1295) {
                c0168.m1299(this.f32381.m41741(), this.f32381.m41740(), this.f32381.getPosition());
            }
        }
        m26950(-1, str);
        if (c0168 != null) {
            c0168.m1298(this.f32381.getPosition());
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
        m26951(false);
        this.f32381.write("<![CDATA[");
        this.f32381.write(str);
        this.f32381.write("]]>");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void comment(String str) throws IOException {
        m26951(false);
        this.f32381.write("<!--");
        this.f32381.write(str);
        this.f32381.write("-->");
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void processingInstruction(String str) throws IOException {
        m26951(false);
        this.f32381.write("<?");
        this.f32381.write(str);
        this.f32381.write("?>");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19220 m26953() {
        C0168 c0168 = this.f32383;
        C11003.requireNonNull(c0168);
        return c0168.m1287();
    }
}
