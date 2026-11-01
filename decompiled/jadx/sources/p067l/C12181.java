package p067l;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: renamed from: l.ۤܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes3.dex */
public class C12181 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f34034;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC24250 f34035;

    /* JADX INFO: renamed from: ܽ */
    public int f34036;

    /* JADX INFO: renamed from: ᩳ */
    public int f34037;

    static {
        C13128.m30022(C12181.class);
    }

    /* JADX INFO: renamed from: ܳ */
    public static int m28097(int i) {
        int i2 = 1;
        while (i2 < i) {
            i2 <<= 1;
            if (i2 <= 0) {
                throw new IllegalArgumentException(C19768.m44906(i, "Cannot get next power of 2; ", " is too large"));
            }
        }
        return i2;
    }

    public C12181(byte[] bArr) {
        this(bArr, true);
    }

    public C12181() {
        this(new byte[m28097(256)], false);
    }

    public C12181(byte[] bArr, boolean z) {
        this.f34034 = bArr;
        this.f34035 = AbstractC24250.f76847;
        this.f34036 = 0;
        this.f34037 = z ? bArr.length : 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m28106() {
        return this.f34034;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m28117() {
        return this.f34037 - this.f34036;
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m28108() {
        return this.f34036;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m28122(int i) {
        this.f34036 = i;
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m28116() {
        return this.f34037;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28112(int i, byte[] bArr) throws C14862 {
        if (m28117() < i) {
            throw new C14862("Underflow");
        }
        System.arraycopy(this.f34034, this.f34036, bArr, 0, i);
        this.f34036 += i;
    }

    /* JADX INFO: renamed from: ܿ */
    public final byte m28120() throws C14862 {
        if (m28117() < 1) {
            throw new C14862("Underflow");
        }
        byte[] bArr = this.f34034;
        int i = this.f34036;
        this.f34036 = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m28121(int i) throws C14862 {
        if (m28117() < i) {
            throw new C14862("Underflow");
        }
        this.f34036 += i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28101(int i) {
        int length = this.f34034.length;
        int i2 = this.f34037;
        if (length - i2 < i) {
            byte[] bArr = new byte[m28097(i2 + i)];
            byte[] bArr2 = this.f34034;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            this.f34034 = bArr;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] m28123() {
        int iM28117 = m28117();
        if (iM28117 <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[iM28117];
        System.arraycopy(this.f34034, this.f34036, bArr, 0, iM28117);
        return bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28100(byte b) {
        m28101(1);
        byte[] bArr = this.f34034;
        int i = this.f34037;
        this.f34037 = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte[] m28119(int i) throws C14862 {
        byte[] bArr = new byte[i];
        m28112(i, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28102(int i, byte[] bArr) {
        m28101(i);
        System.arraycopy(bArr, 0, this.f34034, this.f34037, i);
        this.f34037 += i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28105(C2460 c2460) {
        int iM28117 = c2460.m28117();
        m28101(iM28117);
        System.arraycopy(c2460.f34034, c2460.f34036, this.f34034, this.f34037, iM28117);
        this.f34037 += iM28117;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m28125() throws C14862 {
        ((C13522) this.f34035).getClass();
        byte[] bArr = new byte[2];
        m28112(2, bArr);
        return (bArr[0] & 255) | ((bArr[1] << 8) & 65280);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28111(int i) {
        ((C13522) this.f34035).getClass();
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException(C20778.m46922(i, "Invalid uint16 value: "));
        }
        m28102(2, new byte[]{(byte) i, (byte) (i >> 8)});
    }

    /* JADX INFO: renamed from: ۜ */
    public final long m28107() {
        return this.f34035.mo18934(this);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m28124() {
        return (int) this.f34035.mo18934(this);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28113(long j) {
        ((C13522) this.f34035).getClass();
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException(C17588.m40051(j, "Invalid uint32 value: "));
        }
        m28102(4, new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24)});
    }

    /* JADX INFO: renamed from: ۢ */
    public final long m28109() throws C14862 {
        C13522 c13522 = (C13522) this.f34035;
        long jMo18934 = (c13522.mo18934(this) & 4294967295L) + (c13522.mo18934(this) << 32);
        if (jMo18934 >= 0) {
            return jMo18934;
        }
        throw new C14862("Cannot handle values > 9223372036854775807");
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m28118(long j) {
        C13522 c13522 = (C13522) this.f34035;
        if (j >= 0) {
            c13522.mo18932(this, j);
        } else {
            c13522.getClass();
            throw new IllegalArgumentException(C17588.m40051(j, "Invalid uint64 value: "));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28103(long j) {
        this.f34035.mo18932(this, j);
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m28115() {
        return this.f34035.mo18931(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m28098(int i, Charset charset) throws C14862 {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                ((C13522) this.f34035).getClass();
                return AbstractC24250.m53556(this, i, C10169.f28135);
            case "UTF-8":
                byte[] bArr = new byte[i];
                m28112(i, bArr);
                return new String(bArr, charset);
            case "UTF-16BE":
                return AbstractC24250.m53556(this, i, C10169.f28133);
            case "UTF-16LE":
                return AbstractC24250.m53556(this, i, C10169.f28135);
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m28099(Charset charset) throws C14862 {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                ((C13522) this.f34035).getClass();
                return AbstractC24250.m53557((C2460) this, C10169.f28135);
            case "UTF-8":
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte bM28120 = m28120();
                while (bM28120 != 0) {
                    byteArrayOutputStream.write(bM28120);
                    bM28120 = m28120();
                }
                return new String(byteArrayOutputStream.toByteArray(), charset);
            case "UTF-16BE":
                return AbstractC24250.m53557(this, C10169.f28133);
            case "UTF-16LE":
                return AbstractC24250.m53557(this, C10169.f28135);
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28114(String str, Charset charset) {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                this.f34035.mo18933(this, str);
                return;
            case "UTF-8":
                byte[] bytes = str.getBytes(charset);
                m28102(bytes.length, bytes);
                return;
            case "UTF-16BE":
                AbstractC24250.f76846.mo18933(this, str);
                return;
            case "UTF-16LE":
                AbstractC24250.f76847.mo18933(this, str);
                return;
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28104(String str, Charset charset) {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                this.f34035.m53558((C2460) this, str);
                return;
            case "UTF-8":
                byte[] bytes = str.getBytes(charset);
                m28102(bytes.length, bytes);
                m28100((byte) 0);
                return;
            case "UTF-16BE":
                AbstractC24250.f76846.m53558((C2460) this, str);
                return;
            case "UTF-16LE":
                AbstractC24250.f76847.m53558((C2460) this, str);
                return;
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Buffer [rpos=");
        sb.append(this.f34036);
        sb.append(", wpos=");
        sb.append(this.f34037);
        sb.append(", size=");
        return C5410.m11876(this.f34034.length, "]", sb);
    }

    /* JADX INFO: renamed from: ۧ */
    public final InputStream m28110() {
        return new C5475(this);
    }
}
