package l;

import com.alipay.sdk.m.y.q;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۖܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X9ZK */
/* JADX INFO: loaded from: classes2.dex */
public final class C2640 extends AbstractC6167 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final char[] f8330 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte f8331;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte f8332;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public short f8333;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f8334;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f8335;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public short f8336;

    public C2640(String str) {
        char[] charArray = str.toCharArray();
        this.f8335 = m8313(charArray, 0, 8);
        this.f8333 = (short) (m8313(charArray, 9, 4) & 65535);
        this.f8336 = (short) (m8313(charArray, 14, 4) & 65535);
        this.f8331 = (byte) (m8313(charArray, 19, 2) & 255);
        this.f8332 = (byte) (m8313(charArray, 21, 2) & 255);
        byte[] bArr = new byte[6];
        this.f8334 = bArr;
        bArr[0] = (byte) (m8313(charArray, 24, 2) & 255);
        this.f8334[1] = (byte) (m8313(charArray, 26, 2) & 255);
        this.f8334[2] = (byte) (m8313(charArray, 28, 2) & 255);
        this.f8334[3] = (byte) (m8313(charArray, 30, 2) & 255);
        this.f8334[4] = (byte) (m8313(charArray, 32, 2) & 255);
        this.f8334[5] = (byte) (m8313(charArray, 34, 2) & 255);
    }

    @Override // l.AbstractC6167
    /* JADX INFO: renamed from: ۧ */
    public final void mo2235(C13222 c13222) {
        c13222.m32063(4);
        c13222.m32069(this.f8335);
        c13222.m32067(this.f8333);
        c13222.m32067(this.f8336);
        c13222.m32064(this.f8331);
        c13222.m32064(this.f8332);
        int i = c13222.f39586;
        c13222.m32059(6);
        C13222 c13222M32066 = c13222.m32066(i);
        for (int i2 = 0; i2 < 6; i2++) {
            c13222M32066.m32064(this.f8334[i2]);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m8313(char[] cArr, int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 < cArr.length && i4 < i2; i6++) {
            int i7 = i5 << 4;
            char c = cArr[i6];
            switch (c) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                case '8':
                case '9':
                    i3 = c - '0';
                    break;
                default:
                    switch (c) {
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'E':
                        case 'F':
                            i3 = c - '7';
                            break;
                        default:
                            switch (c) {
                                case 'a':
                                case 'b':
                                case q.f /* 99 */:
                                case 'd':
                                case 'e':
                                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                    i3 = c - 'W';
                                    break;
                                default:
                                    throw new IllegalArgumentException(new String(cArr, i, i2));
                            }
                            break;
                    }
                    break;
            }
            i5 = i7 + i3;
            i4++;
        }
        return i5;
    }

    @Override // l.AbstractC6167
    /* JADX INFO: renamed from: ֫ */
    public final void mo2234(C13222 c13222) {
        c13222.m32063(4);
        this.f8335 = c13222.m32058();
        this.f8333 = (short) c13222.m32062();
        this.f8336 = (short) c13222.m32062();
        this.f8331 = (byte) c13222.m32065();
        this.f8332 = (byte) c13222.m32065();
        int i = c13222.f39586;
        c13222.m32059(6);
        if (this.f8334 == null) {
            this.f8334 = new byte[6];
        }
        C13222 c13222M32066 = c13222.m32066(i);
        for (int i2 = 0; i2 < 6; i2++) {
            this.f8334[i2] = (byte) c13222M32066.m32065();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m8314(int i, int i2) {
        char[] cArr = new char[i2];
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                cArr[i3] = f8330[i & 15];
                i >>>= 4;
                i2 = i3;
            } else {
                return new String(cArr);
            }
        }
    }

    public final String toString() {
        return m8314(this.f8335, 8) + '-' + m8314(this.f8333, 4) + '-' + m8314(this.f8336, 4) + '-' + m8314(this.f8331, 2) + m8314(this.f8332, 2) + '-' + m8314(this.f8334[0], 2) + m8314(this.f8334[1], 2) + m8314(this.f8334[2], 2) + m8314(this.f8334[3], 2) + m8314(this.f8334[4], 2) + m8314(this.f8334[5], 2);
    }
}
