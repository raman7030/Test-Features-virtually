package p067l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܺ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes4.dex */
public final class C17823 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f53185;

    /* JADX INFO: renamed from: ۧ */
    public int f53186;

    /* JADX INFO: renamed from: ܽ */
    public int f53187;

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] f53188;

    public C17823(int i) {
        this.f53188 = new byte[4];
        this.f53185 = new byte[i];
        this.f53186 = 0;
        this.f53187 = 0;
    }

    public C17823(byte[] bArr) {
        this.f53188 = new byte[4];
        this.f53185 = bArr;
        this.f53186 = 0;
        this.f53187 = 0;
    }

    public C17823() {
        this(UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40448(byte b) {
        byte[] bArr = this.f53185;
        int i = this.f53186;
        this.f53186 = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40461(byte[] bArr) {
        m40460(0, bArr.length, bArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40460(int i, int i2, byte[] bArr) {
        System.arraycopy(bArr, i, this.f53185, this.f53186, i2);
        this.f53186 += i2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m40470(byte[] bArr) {
        m40466(0, bArr.length, bArr);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m40466(int i, int i2, byte[] bArr) {
        m40459(i2);
        m40460(i, i2, bArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m40459(int i) {
        byte[] bArr = this.f53188;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        System.arraycopy(bArr, 0, this.f53185, this.f53186, 4);
        this.f53186 += 4;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40451(long j) {
        byte[] bArr = this.f53188;
        bArr[0] = (byte) (j >>> 56);
        bArr[1] = (byte) (j >>> 48);
        bArr[2] = (byte) (j >>> 40);
        bArr[3] = (byte) (j >>> 32);
        System.arraycopy(bArr, 0, this.f53185, this.f53186, 4);
        bArr[0] = (byte) (j >>> 24);
        bArr[1] = (byte) (j >>> 16);
        bArr[2] = (byte) (j >>> 8);
        bArr[3] = (byte) j;
        System.arraycopy(bArr, 0, this.f53185, this.f53186 + 4, 4);
        this.f53186 += 8;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m40465(int i) {
        this.f53186 += i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m40467(byte[] bArr) {
        int length = bArr.length;
        if ((bArr[0] & GCMSIVBlockCipher.MASK) != 0) {
            m40459(length + 1);
            m40448((byte) 0);
        } else {
            m40459(length);
        }
        m40460(0, bArr.length, bArr);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m40469() {
        return this.f53186 - this.f53187;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m40472() {
        return this.f53187;
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m40454() {
        this.f53187 = 0;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m40464() {
        return ((m40455() << 16) & (-65536)) | (m40455() & 65535);
    }

    /* JADX INFO: renamed from: ۢ */
    public final long m40457() {
        return (((((((long) m40447()) << 8) & 65280) | ((long) (m40447() & 255))) << 16) & (-65536)) | ((((((long) m40447()) << 8) & 65280) | ((long) (m40447() & 255))) & 65535);
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m40455() {
        return ((m40447() << 8) & 65280) | (m40447() & 255);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40447() {
        byte[] bArr = this.f53185;
        int i = this.f53187;
        this.f53187 = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40452(byte[] bArr) {
        m40450(0, bArr.length, bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40450(int i, int i2, byte[] bArr) {
        System.arraycopy(this.f53185, this.f53187, bArr, i, i2);
        this.f53187 += i2;
    }

    /* JADX INFO: renamed from: ܿ */
    public final byte[] m40468() {
        int iM40464 = m40464();
        if (iM40464 < 0 || iM40464 > 8192) {
            iM40464 = 8192;
        }
        byte[] bArr = new byte[iM40464];
        m40450(0, iM40464, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ܳ */
    public final byte[] m40462() {
        int iM40464 = (m40464() + 7) / 8;
        byte[] bArr = new byte[iM40464];
        m40450(0, iM40464, bArr);
        if ((bArr[0] & GCMSIVBlockCipher.MASK) == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[iM40464 + 1];
        bArr2[0] = 0;
        System.arraycopy(bArr, 0, bArr2, 1, iM40464);
        return bArr2;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final byte[] m40471() {
        int iM40464 = m40464();
        if (iM40464 < 0 || iM40464 > 262144) {
            iM40464 = 262144;
        }
        byte[] bArr = new byte[iM40464];
        m40450(0, iM40464, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m40456() {
        this.f53186 = 0;
        this.f53187 = 0;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m40463() {
        this.f53187 = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte m40458() {
        return this.f53185[5];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40449(int i) {
        int i2 = this.f53186;
        int i3 = i + i2 + 128;
        byte[] bArr = this.f53185;
        if (bArr.length < i3) {
            int length = bArr.length * 2;
            if (length >= i3) {
                i3 = length;
            }
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            this.f53185 = bArr2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[][] m40453(int i, String str) throws C14392 {
        byte[][] bArr = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            int iM40464 = m40464();
            if (m40469() < iM40464) {
                throw new C14392(str);
            }
            byte[] bArr2 = new byte[iM40464];
            bArr[i2] = bArr2;
            m40450(0, iM40464, bArr2);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17823 m40446(byte[][] bArr) {
        int length = bArr.length * 4;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        C17823 c17823 = new C17823(length);
        for (byte[] bArr3 : bArr) {
            c17823.m40470(bArr3);
        }
        return c17823;
    }
}
