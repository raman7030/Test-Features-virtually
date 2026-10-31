package l;

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
public final class C2657 implements XmlSerializer {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f8357 = {65, 66, 88, 0};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18885 f8358;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f8359 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String[] f8360;

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getNamespace() {
        return "";
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m8335(int i, String str) throws IOException {
        if (str != null) {
            this.f8358.writeByte(i | 32);
            this.f8358.writeUTF(str);
        } else {
            this.f8358.writeByte(i | 16);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(OutputStream outputStream, String str) throws IOException {
        if (str != null && !StandardCharsets.UTF_8.name().equalsIgnoreCase(str)) {
            throw new UnsupportedOperationException();
        }
        C18885 c18885 = new C18885(outputStream);
        this.f8358 = c18885;
        c18885.write(f8357, 0, 4);
        this.f8359 = 0;
        this.f8360 = new String[8];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() throws IOException {
        this.f8358.flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void startDocument(String str, Boolean bool) throws IOException {
        if (str != null && !StandardCharsets.UTF_8.name().equalsIgnoreCase(str)) {
            throw new UnsupportedOperationException();
        }
        if (bool != null && !bool.booleanValue()) {
            throw new UnsupportedOperationException();
        }
        this.f8358.writeByte(16);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void endDocument() throws IOException {
        this.f8358.writeByte(17);
        flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final int getDepth() {
        return this.f8359;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getName() {
        return this.f8360[this.f8359 - 1];
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) throws IOException {
        if (str != null && !str.isEmpty()) {
            m8334();
            throw null;
        }
        int i = this.f8359;
        String[] strArr = this.f8360;
        if (i == strArr.length) {
            this.f8360 = (String[]) Arrays.copyOf(strArr, i + (i >> 1));
        }
        String[] strArr2 = this.f8360;
        int i2 = this.f8359;
        this.f8359 = i2 + 1;
        strArr2[i2] = str2;
        this.f8358.writeByte(50);
        this.f8358.m43600(str2);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) throws IOException {
        if (str != null && !str.isEmpty()) {
            m8334();
            throw null;
        }
        this.f8359--;
        this.f8358.writeByte(51);
        this.f8358.m43600(str2);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        if (str != null && !str.isEmpty()) {
            m8334();
            throw null;
        }
        if (str3 == null) {
            this.f8358.writeByte(31);
            this.f8358.m43600(str2);
            return this;
        }
        this.f8358.writeByte(47);
        this.f8358.m43600(str2);
        this.f8358.writeUTF(str3);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8340(String str, String str2) throws IOException {
        this.f8358.writeByte(63);
        this.f8358.m43600(str);
        this.f8358.m43600(str2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8345(String str, byte[] bArr) throws IOException {
        this.f8358.writeByte(79);
        this.f8358.m43600(str);
        this.f8358.writeShort(bArr.length);
        C18885 c18885 = this.f8358;
        c18885.getClass();
        c18885.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8342(String str, byte[] bArr) throws IOException {
        this.f8358.writeByte(95);
        this.f8358.m43600(str);
        this.f8358.writeShort(bArr.length);
        C18885 c18885 = this.f8358;
        c18885.getClass();
        c18885.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8336(int i, String str) throws IOException {
        this.f8358.writeByte(UMErrorCode.E_UM_BE_CREATE_FAILED);
        this.f8358.m43600(str);
        this.f8358.writeInt(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8343(int i, String str) throws IOException {
        this.f8358.writeByte(127);
        this.f8358.m43600(str);
        this.f8358.writeInt(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8337(long j, String str) throws IOException {
        this.f8358.writeByte(143);
        this.f8358.m43600(str);
        this.f8358.writeLong(j);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8344(long j, String str) throws IOException {
        this.f8358.writeByte(159);
        this.f8358.m43600(str);
        this.f8358.writeLong(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8339(String str, float f) throws IOException {
        this.f8358.writeByte(HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS);
        this.f8358.m43600(str);
        this.f8358.writeFloat(f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8338(String str, double d) throws IOException {
        this.f8358.writeByte(191);
        this.f8358.m43600(str);
        this.f8358.writeDouble(d);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8341(String str, boolean z) throws IOException {
        if (z) {
            this.f8358.writeByte(207);
            this.f8358.m43600(str);
        } else {
            this.f8358.writeByte(223);
            this.f8358.m43600(str);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(char[] cArr, int i, int i2) throws IOException {
        m8335(4, new String(cArr, i, i2));
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) throws IOException {
        m8335(4, str);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void cdsect(String str) throws IOException {
        m8335(5, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) throws IOException {
        m8335(6, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void processingInstruction(String str) throws IOException {
        m8335(8, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void comment(String str) throws IOException {
        m8335(9, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void docdecl(String str) throws IOException {
        m8335(10, str);
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void ignorableWhitespace(String str) throws IOException {
        m8335(7, str);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8334() {
        throw new IllegalArgumentException("Namespaces are not supported");
    }
}
