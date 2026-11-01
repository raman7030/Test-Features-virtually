package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: l.֡ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D4GL */
/* JADX INFO: loaded from: classes2.dex */
public final class C2796 {

    /* JADX INFO: renamed from: ۢ */
    public static final Charset[] f4726 = {Charset.forName("GBK")};

    /* JADX INFO: renamed from: ᩷ */
    public static final Charset[] f4727 = {Charset.forName("GBK"), Charset.forName(C0233a.f1077D), Charset.forName("BIG5")};

    /* JADX INFO: renamed from: ֫ */
    public C10173 f4728;

    /* JADX INFO: renamed from: ܳ */
    public C16877 f4731;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC8205 f4732;

    /* JADX INFO: renamed from: ܿ */
    public int f4733;

    /* JADX INFO: renamed from: ᩻ */
    public int f4735;

    /* JADX INFO: renamed from: ۜ */
    public int f4729 = 1;

    /* JADX INFO: renamed from: ᩳ */
    public byte[] f4734 = new byte[16];

    /* JADX INFO: renamed from: ۧ */
    public byte[] f4730 = new byte[16];

    public C2796(int i, String str, byte[] bArr, byte[] bArr2, InterfaceC8205 interfaceC8205) throws IOException {
        this.f4732 = interfaceC8205;
        if (i == 1) {
            this.f4733 = 16;
            this.f4735 = 16;
        } else if (i == 2) {
            this.f4733 = 24;
            this.f4735 = 24;
        } else if (i == 3) {
            this.f4733 = 32;
            this.f4735 = 32;
        } else {
            throw new IOException("Invalid aes key strength");
        }
        if (str == null || str.isEmpty()) {
            throw new IOException("Empty or null password provided for AES Decryptor");
        }
        byte[] bArr3 = new byte[this.f4733];
        byte[] bArr4 = new byte[this.f4735];
        byte[] bArr5 = new byte[2];
        for (Charset charset : m4383(str)) {
            try {
                byte[] bArrM51184 = new C22914(new C23584(bArr)).m51184(this.f4733 + this.f4735 + 2, str.getBytes(charset));
                int length = bArrM51184.length;
                int i2 = this.f4733 + this.f4735;
                if (length == i2 + 2) {
                    System.arraycopy(bArrM51184, i2, bArr5, 0, 2);
                    if (Arrays.equals(bArr2, bArr5)) {
                        System.arraycopy(bArrM51184, 0, bArr3, 0, this.f4733);
                        System.arraycopy(bArrM51184, this.f4733, bArr4, 0, this.f4735);
                        this.f4728 = new C10173(bArr3);
                        C16877 c16877 = new C16877();
                        this.f4731 = c16877;
                        c16877.m38442(bArr4);
                        return;
                    }
                }
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
        throw ((C6150) this.f4732.get());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4385(int i, byte[] bArr) throws IOException {
        byte[] bArr2 = this.f4730;
        byte[] bArr3 = this.f4734;
        if (this.f4728 == null) {
            throw new IOException("AES not initialized properly");
        }
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 16;
            int i4 = i3 <= i ? 16 : i - i2;
            try {
                C16877 c16877 = this.f4731;
                c16877.getClass();
                try {
                    c16877.f49973.update(bArr, i2, i4);
                    m4384(this.f4729, bArr3);
                    this.f4728.m23705(bArr3, bArr2);
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = i2 + i5;
                        bArr[i6] = (byte) (bArr[i6] ^ bArr2[i5]);
                    }
                    this.f4729++;
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

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m4386() {
        return this.f4731.f49973.doFinal();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m4384(int i, byte[] bArr) {
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

    /* JADX INFO: renamed from: ֫ */
    public static Charset[] m4383(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt > '~') {
                return f4727;
            }
        }
        return f4726;
    }
}
