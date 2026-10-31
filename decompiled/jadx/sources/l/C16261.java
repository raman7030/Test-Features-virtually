package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܺ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16261 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f50016;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f50017;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f50018;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f50019;

    public C16261(int i) {
        this.f50019 = new byte[4];
        this.f50016 = new byte[i];
        this.f50017 = 0;
        this.f50018 = 0;
    }

    public C16261(byte[] bArr) {
        this.f50019 = new byte[4];
        this.f50016 = bArr;
        this.f50017 = 0;
        this.f50018 = 0;
    }

    public C16261() {
        this(UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38234(byte b) {
        byte[] bArr = this.f50016;
        int i = this.f50017;
        this.f50017 = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38247(byte[] bArr) {
        m38246(0, bArr.length, bArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38246(int i, int i2, byte[] bArr) {
        System.arraycopy(bArr, i, this.f50016, this.f50017, i2);
        this.f50017 += i2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m38256(byte[] bArr) {
        m38252(0, bArr.length, bArr);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38252(int i, int i2, byte[] bArr) {
        m38245(i2);
        m38246(i, i2, bArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38245(int i) {
        byte[] bArr = this.f50019;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        System.arraycopy(bArr, 0, this.f50016, this.f50017, 4);
        this.f50017 += 4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38237(long j) {
        byte[] bArr = this.f50019;
        bArr[0] = (byte) (j >>> 56);
        bArr[1] = (byte) (j >>> 48);
        bArr[2] = (byte) (j >>> 40);
        bArr[3] = (byte) (j >>> 32);
        System.arraycopy(bArr, 0, this.f50016, this.f50017, 4);
        bArr[0] = (byte) (j >>> 24);
        bArr[1] = (byte) (j >>> 16);
        bArr[2] = (byte) (j >>> 8);
        bArr[3] = (byte) j;
        System.arraycopy(bArr, 0, this.f50016, this.f50017 + 4, 4);
        this.f50017 += 8;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38251(int i) {
        this.f50017 += i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38253(byte[] bArr) {
        int length = bArr.length;
        if ((bArr[0] & GCMSIVBlockCipher.MASK) != 0) {
            m38245(length + 1);
            m38234((byte) 0);
        } else {
            m38245(length);
        }
        m38246(0, bArr.length, bArr);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m38255() {
        return this.f50017 - this.f50018;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m38258() {
        return this.f50018;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m38240() {
        this.f50018 = 0;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m38250() {
        return ((m38241() << 16) & (-65536)) | (m38241() & 65535);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long m38243() {
        return (((((((long) m38233()) << 8) & 65280) | ((long) (m38233() & 255))) << 16) & (-65536)) | ((((((long) m38233()) << 8) & 65280) | ((long) (m38233() & 255))) & 65535);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m38241() {
        return ((m38233() << 8) & 65280) | (m38233() & 255);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38233() {
        byte[] bArr = this.f50016;
        int i = this.f50018;
        this.f50018 = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38238(byte[] bArr) {
        m38236(0, bArr.length, bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38236(int i, int i2, byte[] bArr) {
        System.arraycopy(this.f50016, this.f50018, bArr, i, i2);
        this.f50018 += i2;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] m38254() {
        int iM38250 = m38250();
        if (iM38250 < 0 || iM38250 > 8192) {
            iM38250 = 8192;
        }
        byte[] bArr = new byte[iM38250];
        m38236(0, iM38250, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m38248() {
        int iM38250 = (m38250() + 7) / 8;
        byte[] bArr = new byte[iM38250];
        m38236(0, iM38250, bArr);
        if ((bArr[0] & GCMSIVBlockCipher.MASK) == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[iM38250 + 1];
        bArr2[0] = 0;
        System.arraycopy(bArr, 0, bArr2, 1, iM38250);
        return bArr2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m38257() {
        int iM38250 = m38250();
        if (iM38250 < 0 || iM38250 > 262144) {
            iM38250 = 262144;
        }
        byte[] bArr = new byte[iM38250];
        m38236(0, iM38250, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m38242() {
        this.f50017 = 0;
        this.f50018 = 0;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m38249() {
        this.f50018 = 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte m38244() {
        return this.f50016[5];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38235(int i) {
        int i2 = this.f50017;
        int i3 = i + i2 + 128;
        byte[] bArr = this.f50016;
        if (bArr.length < i3) {
            int length = bArr.length * 2;
            if (length >= i3) {
                i3 = length;
            }
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            this.f50016 = bArr2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[][] m38239(int i, String str) throws C12651 {
        byte[][] bArr = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            int iM38250 = m38250();
            if (m38255() < iM38250) {
                throw new C12651(str);
            }
            byte[] bArr2 = new byte[iM38250];
            bArr[i2] = bArr2;
            m38236(0, iM38250, bArr2);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16261 m38232(byte[][] bArr) {
        int length = bArr.length * 4;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        C16261 c16261 = new C16261(length);
        for (byte[] bArr3 : bArr) {
            c16261.m38256(bArr3);
        }
        return c16261;
    }
}
