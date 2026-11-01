package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.IOException;
import java.util.Random;

/* JADX INFO: renamed from: l.֨ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L4GC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3467 {

    /* JADX INFO: renamed from: ֫ */
    public int f6945;

    /* JADX INFO: renamed from: ۜ */
    public byte[] f6946;

    /* JADX INFO: renamed from: ۡ */
    public String f6947;

    /* JADX INFO: renamed from: ۢ */
    public int f6948 = 1;

    /* JADX INFO: renamed from: ۧ */
    public int f6949;

    /* JADX INFO: renamed from: ܳ */
    public byte[] f6950;

    /* JADX INFO: renamed from: ܺ */
    public byte[] f6951;

    /* JADX INFO: renamed from: ܽ */
    public int f6952;

    /* JADX INFO: renamed from: ܿ */
    public byte[] f6953;

    /* JADX INFO: renamed from: ᩳ */
    public C10173 f6954;

    /* JADX INFO: renamed from: ᩷ */
    public C16877 f6955;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f6956;

    public C3467(String str, int i) throws IOException {
        if (str == null || str.isEmpty()) {
            throw new IOException("input password is empty or null in AES encryptor constructor");
        }
        if (i != 1 && i != 3) {
            throw new IOException("Invalid key strength in AES encryptor constructor");
        }
        this.f6947 = str;
        this.f6956 = false;
        this.f6953 = new byte[16];
        this.f6946 = new byte[16];
        if (i == 1) {
            this.f6945 = 16;
            this.f6949 = 16;
            this.f6952 = 8;
        } else if (i == 3) {
            this.f6945 = 32;
            this.f6949 = 32;
            this.f6952 = 16;
        } else {
            throw new IOException("invalid aes key strength, cannot determine key sizes");
        }
        int i2 = this.f6952;
        if (i2 != 8 && i2 != 16) {
            throw new IOException("invalid salt size, cannot generate salt");
        }
        int i3 = i2 == 16 ? 4 : i2 == 8 ? 2 : 0;
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i3; i4++) {
            int iNextInt = new Random().nextInt();
            int i5 = i4 * 4;
            bArr[i5] = (byte) (iNextInt >> 24);
            bArr[i5 + 1] = (byte) (iNextInt >> 16);
            bArr[i5 + 2] = (byte) (iNextInt >> 8);
            bArr[i5 + 3] = (byte) iNextInt;
        }
        this.f6951 = bArr;
        try {
            byte[] bArrM51184 = new C22914(new C23584(bArr)).m51184(this.f6945 + this.f6949 + 2, this.f6947.getBytes(C0233a.f1077D));
            int length = bArrM51184.length;
            int i6 = this.f6945;
            int i7 = this.f6949;
            if (length != i6 + i7 + 2) {
                throw new IOException("invalid key generated, cannot decrypt file");
            }
            byte[] bArr2 = new byte[i6];
            byte[] bArr3 = new byte[i7];
            this.f6950 = new byte[2];
            System.arraycopy(bArrM51184, 0, bArr2, 0, i6);
            System.arraycopy(bArrM51184, this.f6945, bArr3, 0, this.f6949);
            System.arraycopy(bArrM51184, this.f6945 + this.f6949, this.f6950, 0, 2);
            this.f6954 = new C10173(bArr2);
            C16877 c16877 = new C16877();
            this.f6955 = c16877;
            c16877.m38442(bArr3);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6192(int i, byte[] bArr) throws IOException {
        if (this.f6956) {
            throw new IOException("AES Encryptor is in finished state (A non 16 byte block has already been passed to encryptor)");
        }
        if (i % 16 != 0) {
            this.f6956 = true;
        }
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 16;
            int i4 = i3 <= i ? 16 : i - i2;
            int i5 = this.f6948;
            byte[] bArr2 = this.f6946;
            C2796.m4384(i5, bArr2);
            C10173 c10173 = this.f6954;
            byte[] bArr3 = this.f6953;
            c10173.m23705(bArr2, bArr3);
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = i2 + i6;
                bArr[i7] = (byte) (bArr[i7] ^ bArr3[i6]);
            }
            C16877 c16877 = this.f6955;
            c16877.getClass();
            try {
                c16877.f49973.update(bArr, i2, i4);
                this.f6948++;
                i2 = i3;
            } catch (IllegalStateException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte[] m6194() {
        byte[] bArr = new byte[10];
        System.arraycopy(this.f6955.f49973.doFinal(), 0, bArr, 0, 10);
        return bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m6193() {
        return this.f6950;
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte[] m6195() {
        return this.f6951;
    }
}
