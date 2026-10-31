package l;

import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֡ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C0450 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Charset[] f1950 = {Charset.forName("GBK")};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Charset[] f1951 = {Charset.forName("GBK"), Charset.forName(a.D), Charset.forName("BIG5")};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8212 f1952;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15266 f1955;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6141 f1956;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f1957;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f1959;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f1953 = 1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f1958 = new byte[16];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f1954 = new byte[16];

    public C0450(int i, String str, byte[] bArr, byte[] bArr2, InterfaceC6141 interfaceC6141) throws IOException {
        this.f1956 = interfaceC6141;
        if (i == 1) {
            this.f1957 = 16;
            this.f1959 = 16;
        } else if (i == 2) {
            this.f1957 = 24;
            this.f1959 = 24;
        } else if (i == 3) {
            this.f1957 = 32;
            this.f1959 = 32;
        } else {
            throw new IOException("Invalid aes key strength");
        }
        if (str == null || str.isEmpty()) {
            throw new IOException("Empty or null password provided for AES Decryptor");
        }
        byte[] bArr3 = new byte[this.f1957];
        byte[] bArr4 = new byte[this.f1959];
        byte[] bArr5 = new byte[2];
        for (Charset charset : m2006(str)) {
            try {
                byte[] bArrM48836 = new C21618(new C22323(bArr)).m48836(this.f1957 + this.f1959 + 2, str.getBytes(charset));
                int length = bArrM48836.length;
                int i2 = this.f1957 + this.f1959;
                if (length == i2 + 2) {
                    System.arraycopy(bArrM48836, i2, bArr5, 0, 2);
                    if (Arrays.equals(bArr2, bArr5)) {
                        System.arraycopy(bArrM48836, 0, bArr3, 0, this.f1957);
                        System.arraycopy(bArrM48836, this.f1957, bArr4, 0, this.f1959);
                        this.f1952 = new C8212(bArr3);
                        C15266 c15266 = new C15266();
                        this.f1955 = c15266;
                        c15266.m36281(bArr4);
                        return;
                    }
                }
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
        throw ((C3979) this.f1956.get());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2008(int i, byte[] bArr) throws IOException {
        byte[] bArr2 = this.f1954;
        byte[] bArr3 = this.f1958;
        if (this.f1952 == null) {
            throw new IOException("AES not initialized properly");
        }
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 16;
            int i4 = i3 <= i ? 16 : i - i2;
            try {
                C15266 c15266 = this.f1955;
                c15266.getClass();
                try {
                    c15266.f46849.update(bArr, i2, i4);
                    m2007(this.f1953, bArr3);
                    this.f1952.m21736(bArr3, bArr2);
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = i2 + i5;
                        bArr[i6] = (byte) (bArr[i6] ^ bArr2[i5]);
                    }
                    this.f1953++;
                    i2 = i3;
                } catch (IllegalStateException e) {
                    throw new RuntimeException(e);
                }
            } catch (IOException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new IOException(e3);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m2009() {
        return this.f1955.f46849.doFinal();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m2007(int i, byte[] bArr) {
        bArr[0] = (byte) i;
        bArr[1] = (byte) (i >> 8);
        bArr[2] = (byte) (i >> 16);
        bArr[3] = (byte) (i >> 24);
        bArr[4] = 0;
        bArr[5] = 0;
        bArr[6] = 0;
        bArr[7] = 0;
        bArr[8] = 0;
        bArr[9] = 0;
        bArr[10] = 0;
        bArr[11] = 0;
        bArr[12] = 0;
        bArr[13] = 0;
        bArr[14] = 0;
        bArr[15] = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Charset[] m2006(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt > '~') {
                return f1951;
            }
        }
        return f1950;
    }
}
