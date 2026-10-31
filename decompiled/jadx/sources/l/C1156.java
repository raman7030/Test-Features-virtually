package l;

import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.util.Random;

/* JADX INFO: renamed from: l.֨ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L4GC */
/* JADX INFO: loaded from: classes2.dex */
public final class C1156 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f4176;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f4177;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f4178;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f4179 = 1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f4180;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f4181;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte[] f4182;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f4183;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f4184;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C8212 f4185;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C15266 f4186;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f4187;

    public C1156(String str, int i) throws IOException {
        if (str == null || str.isEmpty()) {
            throw new IOException("input password is empty or null in AES encryptor constructor");
        }
        if (i != 1 && i != 3) {
            throw new IOException("Invalid key strength in AES encryptor constructor");
        }
        this.f4178 = str;
        this.f4187 = false;
        this.f4184 = new byte[16];
        this.f4177 = new byte[16];
        if (i == 1) {
            this.f4176 = 16;
            this.f4180 = 16;
            this.f4183 = 8;
        } else if (i == 3) {
            this.f4176 = 32;
            this.f4180 = 32;
            this.f4183 = 16;
        } else {
            throw new IOException("invalid aes key strength, cannot determine key sizes");
        }
        int i2 = this.f4183;
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
        this.f4182 = bArr;
        try {
            byte[] bArrM48836 = new C21618(new C22323(bArr)).m48836(this.f4176 + this.f4180 + 2, this.f4178.getBytes(a.D));
            int length = bArrM48836.length;
            int i6 = this.f4176;
            int i7 = this.f4180;
            if (length != i6 + i7 + 2) {
                throw new IOException("invalid key generated, cannot decrypt file");
            }
            byte[] bArr2 = new byte[i6];
            byte[] bArr3 = new byte[i7];
            this.f4181 = new byte[2];
            System.arraycopy(bArrM48836, 0, bArr2, 0, i6);
            System.arraycopy(bArrM48836, this.f4176, bArr3, 0, this.f4180);
            System.arraycopy(bArrM48836, this.f4176 + this.f4180, this.f4181, 0, 2);
            this.f4185 = new C8212(bArr2);
            C15266 c15266 = new C15266();
            this.f4186 = c15266;
            c15266.m36281(bArr3);
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3951(int i, byte[] bArr) throws IOException {
        if (this.f4187) {
            throw new IOException("AES Encryptor is in finished state (A non 16 byte block has already been passed to encryptor)");
        }
        if (i % 16 != 0) {
            this.f4187 = true;
        }
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 16;
            int i4 = i3 <= i ? 16 : i - i2;
            int i5 = this.f4179;
            byte[] bArr2 = this.f4177;
            C0450.m2007(i5, bArr2);
            C8212 c8212 = this.f4185;
            byte[] bArr3 = this.f4184;
            c8212.m21736(bArr2, bArr3);
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = i2 + i6;
                bArr[i7] = (byte) (bArr[i7] ^ bArr3[i6]);
            }
            C15266 c15266 = this.f4186;
            c15266.getClass();
            try {
                c15266.f46849.update(bArr, i2, i4);
                this.f4179++;
                i2 = i3;
            } catch (IllegalStateException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m3953() {
        byte[] bArr = new byte[10];
        System.arraycopy(this.f4186.f46849.doFinal(), 0, bArr, 0, 10);
        return bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m3952() {
        return this.f4181;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m3954() {
        return this.f4182;
    }
}
