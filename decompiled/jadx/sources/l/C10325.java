package l;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: renamed from: l.ۤܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes3.dex */
public class C10325 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f31071;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC23024 f31072;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f31073;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f31074;

    static {
        C11321.m27961(C10325.class);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int m26072(int i) {
        int i2 = 1;
        while (i2 < i) {
            i2 <<= 1;
            if (i2 <= 0) {
                throw new IllegalArgumentException(C18307.m42645(i, "Cannot get next power of 2; ", " is too large"));
            }
        }
        return i2;
    }

    public C10325(byte[] bArr) {
        this(bArr, true);
    }

    public C10325() {
        this(new byte[m26072(256)], false);
    }

    public C10325(byte[] bArr, boolean z) {
        this.f31071 = bArr;
        this.f31072 = AbstractC23024.f74108;
        this.f31073 = 0;
        this.f31074 = z ? bArr.length : 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m26081() {
        return this.f31071;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m26092() {
        return this.f31074 - this.f31073;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m26083() {
        return this.f31073;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m26097(int i) {
        this.f31073 = i;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m26091() {
        return this.f31074;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26087(int i, byte[] bArr) throws C13146 {
        if (m26092() < i) {
            throw new C13146("Underflow");
        }
        System.arraycopy(this.f31071, this.f31073, bArr, 0, i);
        this.f31073 += i;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte m26095() throws C13146 {
        if (m26092() < 1) {
            throw new C13146("Underflow");
        }
        byte[] bArr = this.f31071;
        int i = this.f31073;
        this.f31073 = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m26096(int i) throws C13146 {
        if (m26092() < i) {
            throw new C13146("Underflow");
        }
        this.f31073 += i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26076(int i) {
        int length = this.f31071.length;
        int i2 = this.f31074;
        if (length - i2 < i) {
            byte[] bArr = new byte[m26072(i2 + i)];
            byte[] bArr2 = this.f31071;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            this.f31071 = bArr;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] m26098() {
        int iM26092 = m26092();
        if (iM26092 <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[iM26092];
        System.arraycopy(this.f31071, this.f31073, bArr, 0, iM26092);
        return bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26075(byte b) {
        m26076(1);
        byte[] bArr = this.f31071;
        int i = this.f31074;
        this.f31074 = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m26094(int i) throws C13146 {
        byte[] bArr = new byte[i];
        m26087(i, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26077(int i, byte[] bArr) {
        m26076(i);
        System.arraycopy(bArr, 0, this.f31071, this.f31074, i);
        this.f31074 += i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26080(C0097 c0097) {
        int iM26092 = c0097.m26092();
        m26076(iM26092);
        System.arraycopy(c0097.f31071, c0097.f31073, this.f31071, this.f31074, iM26092);
        this.f31074 += iM26092;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m26100() throws C13146 {
        ((C11736) this.f31072).getClass();
        byte[] bArr = new byte[2];
        m26087(2, bArr);
        return (bArr[0] & 255) | ((bArr[1] << 8) & 65280);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26086(int i) {
        ((C11736) this.f31072).getClass();
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException(C19370.m44628(i, "Invalid uint16 value: "));
        }
        m26077(2, new byte[]{(byte) i, (byte) (i >> 8)});
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long m26082() {
        return this.f31072.mo17003(this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m26099() {
        return (int) this.f31072.mo17003(this);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26088(long j) {
        ((C11736) this.f31072).getClass();
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException(C16014.m37865(j, "Invalid uint32 value: "));
        }
        m26077(4, new byte[]{(byte) j, (byte) (j >> 8), (byte) (j >> 16), (byte) (j >> 24)});
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long m26084() throws C13146 {
        C11736 c11736 = (C11736) this.f31072;
        long jMo17003 = (c11736.mo17003(this) & 4294967295L) + (c11736.mo17003(this) << 32);
        if (jMo17003 >= 0) {
            return jMo17003;
        }
        throw new C13146("Cannot handle values > 9223372036854775807");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m26093(long j) {
        C11736 c11736 = (C11736) this.f31072;
        if (j >= 0) {
            c11736.mo17001(this, j);
        } else {
            c11736.getClass();
            throw new IllegalArgumentException(C16014.m37865(j, "Invalid uint64 value: "));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26078(long j) {
        this.f31072.mo17001(this, j);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m26090() {
        return this.f31072.mo17000(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m26073(int i, Charset charset) throws C13146 {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                ((C11736) this.f31072).getClass();
                return AbstractC23024.m51163(this, i, C8208.f25225);
            case "UTF-8":
                byte[] bArr = new byte[i];
                m26087(i, bArr);
                return new String(bArr, charset);
            case "UTF-16BE":
                return AbstractC23024.m51163(this, i, C8208.f25223);
            case "UTF-16LE":
                return AbstractC23024.m51163(this, i, C8208.f25225);
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m26074(Charset charset) throws C13146 {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                ((C11736) this.f31072).getClass();
                return AbstractC23024.m51164((C0097) this, C8208.f25225);
            case "UTF-8":
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte bM26095 = m26095();
                while (bM26095 != 0) {
                    byteArrayOutputStream.write(bM26095);
                    bM26095 = m26095();
                }
                return new String(byteArrayOutputStream.toByteArray(), charset);
            case "UTF-16BE":
                return AbstractC23024.m51164(this, C8208.f25223);
            case "UTF-16LE":
                return AbstractC23024.m51164(this, C8208.f25225);
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26089(String str, Charset charset) {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                this.f31072.mo17002(this, str);
                return;
            case "UTF-8":
                byte[] bytes = str.getBytes(charset);
                m26077(bytes.length, bytes);
                return;
            case "UTF-16BE":
                AbstractC23024.f74107.mo17002(this, str);
                return;
            case "UTF-16LE":
                AbstractC23024.f74108.mo17002(this, str);
                return;
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26079(String str, Charset charset) {
        String strName = charset.name();
        strName.getClass();
        switch (strName) {
            case "UTF-16":
                this.f31072.m51165((C0097) this, str);
                return;
            case "UTF-8":
                byte[] bytes = str.getBytes(charset);
                m26077(bytes.length, bytes);
                m26075((byte) 0);
                return;
            case "UTF-16BE":
                AbstractC23024.f74107.m51165((C0097) this, str);
                return;
            case "UTF-16LE":
                AbstractC23024.f74108.m51165((C0097) this, str);
                return;
            default:
                throw new UnsupportedCharsetException(charset.name());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Buffer [rpos=");
        sb.append(this.f31073);
        sb.append(", wpos=");
        sb.append(this.f31074);
        sb.append(", size=");
        return C3200.m9831(this.f31071.length, "]", sb);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InputStream m26085() {
        return new C3269(this);
    }
}
