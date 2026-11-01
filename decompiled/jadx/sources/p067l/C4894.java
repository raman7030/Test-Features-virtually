package p067l;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: l.ۖܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: FAO8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4894 implements XmlSerializer {

    /* JADX INFO: renamed from: ᩳ */
    public static final byte[] f11151 = {65, 66, 88, 0};

    /* JADX INFO: renamed from: ֫ */
    public C20317 f11152;

    /* JADX INFO: renamed from: ۧ */
    public int f11153 = 0;

    /* JADX INFO: renamed from: ܽ */
    public String[] f11154;

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getNamespace() {
        return "";
    }

    /* JADX INFO: renamed from: ܽ */
    private void m10379(int i, String str) throws IOException {
        if (str != null) {
            this.f11152.writeByte(i | 32);
            this.f11152.writeUTF(str);
        } else {
            this.f11152.writeByte(i | 16);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(OutputStream outputStream, String str) throws IOException {
        if (str != null && !StandardCharsets.UTF_8.name().equalsIgnoreCase(str)) {
            throw new UnsupportedOperationException();
        }
        C20317 c20317 = new C20317(outputStream);
        this.f11152 = c20317;
        c20317.write(f11151, 0, 4);
        this.f11153 = 0;
        this.f11154 = new String[8];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() throws IOException {
        this.f11152.flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void startDocument(String str, Boolean bool) throws IOException {
        if (str != null && !StandardCharsets.UTF_8.name().equalsIgnoreCase(str)) {
            throw new UnsupportedOperationException();
        }
        if (bool != null && !bool.booleanValue()) {
            throw new UnsupportedOperationException();
        }
        this.f11152.writeByte(16);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void endDocument() throws IOException {
        this.f11152.writeByte(17);
        flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final int getDepth() {
        return this.f11153;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getName() {
        return this.f11154[this.f11153 - 1];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) throws IOException {
        if (str != null && !str.isEmpty()) {
            m10378();
            throw null;
        }
        int i = this.f11153;
        String[] strArr = this.f11154;
        if (i == strArr.length) {
            this.f11154 = (String[]) Arrays.copyOf(strArr, i + (i >> 1));
        }
        String[] strArr2 = this.f11154;
        int i2 = this.f11153;
        this.f11153 = i2 + 1;
        strArr2[i2] = str2;
        this.f11152.writeByte(50);
        this.f11152.m45866(str2);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) throws IOException {
        if (str != null && !str.isEmpty()) {
            m10378();
            throw null;
        }
        this.f11153--;
        this.f11152.writeByte(51);
        this.f11152.m45866(str2);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        if (str != null && !str.isEmpty()) {
            m10378();
            throw null;
        }
        if (str3 == null) {
            this.f11152.writeByte(31);
            this.f11152.m45866(str2);
            return this;
        }
        this.f11152.writeByte(47);
        this.f11152.m45866(str2);
        this.f11152.writeUTF(str3);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10384(String str, String str2) throws IOException {
        this.f11152.writeByte(63);
        this.f11152.m45866(str);
        this.f11152.m45866(str2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10389(String str, byte[] bArr) throws IOException {
        this.f11152.writeByte(79);
        this.f11152.m45866(str);
        this.f11152.writeShort(bArr.length);
        C20317 c20317 = this.f11152;
        c20317.getClass();
        c20317.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10386(String str, byte[] bArr) throws IOException {
        this.f11152.writeByte(95);
        this.f11152.m45866(str);
        this.f11152.writeShort(bArr.length);
        C20317 c20317 = this.f11152;
        c20317.getClass();
        c20317.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10380(int i, String str) throws IOException {
        this.f11152.writeByte(UMErrorCode.E_UM_BE_CREATE_FAILED);
        this.f11152.m45866(str);
        this.f11152.writeInt(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10387(int i, String str) throws IOException {
        this.f11152.writeByte(127);
        this.f11152.m45866(str);
        this.f11152.writeInt(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10381(long j, String str) throws IOException {
        this.f11152.writeByte(143);
        this.f11152.m45866(str);
        this.f11152.writeLong(j);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10388(long j, String str) throws IOException {
        this.f11152.writeByte(159);
        this.f11152.m45866(str);
        this.f11152.writeLong(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10383(String str, float f) throws IOException {
        this.f11152.writeByte(HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS);
        this.f11152.m45866(str);
        this.f11152.writeFloat(f);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10382(String str, double d) throws IOException {
        this.f11152.writeByte(191);
        this.f11152.m45866(str);
        this.f11152.writeDouble(d);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10385(String str, boolean z) throws IOException {
        if (z) {
            this.f11152.writeByte(207);
            this.f11152.m45866(str);
        } else {
            this.f11152.writeByte(223);
            this.f11152.m45866(str);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(char[] cArr, int i, int i2) throws IOException {
        m10379(4, new String(cArr, i, i2));
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) throws IOException {
        m10379(4, str);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void cdsect(String str) throws IOException {
        m10379(5, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) throws IOException {
        m10379(6, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void processingInstruction(String str) throws IOException {
        m10379(8, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void comment(String str) throws IOException {
        m10379(9, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void docdecl(String str) throws IOException {
        m10379(10, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void ignorableWhitespace(String str) throws IOException {
        m10379(7, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setFeature(String str, boolean z) {
        if (!"http://xmlpull.org/v1/doc/features.html#indent-output".equals(str)) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setPrefix(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getPrefix(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10378() {
        throw new IllegalArgumentException("Namespaces are not supported");
    }
}
