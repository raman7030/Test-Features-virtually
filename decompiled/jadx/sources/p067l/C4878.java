package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۖܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X9ZK */
/* JADX INFO: loaded from: classes2.dex */
public final class C4878 extends AbstractC8230 {

    /* JADX INFO: renamed from: ᩻ */
    public static final char[] f11124 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ֫ */
    public byte f11125;

    /* JADX INFO: renamed from: ۧ */
    public byte f11126;

    /* JADX INFO: renamed from: ܳ */
    public short f11127;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f11128;

    /* JADX INFO: renamed from: ܿ */
    public int f11129;

    /* JADX INFO: renamed from: ᩳ */
    public short f11130;

    public C4878(String str) {
        char[] charArray = str.toCharArray();
        this.f11129 = m10357(charArray, 0, 8);
        this.f11127 = (short) (m10357(charArray, 9, 4) & 65535);
        this.f11130 = (short) (m10357(charArray, 14, 4) & 65535);
        this.f11125 = (byte) (m10357(charArray, 19, 2) & 255);
        this.f11126 = (byte) (m10357(charArray, 21, 2) & 255);
        byte[] bArr = new byte[6];
        this.f11128 = bArr;
        bArr[0] = (byte) (m10357(charArray, 24, 2) & 255);
        this.f11128[1] = (byte) (m10357(charArray, 26, 2) & 255);
        this.f11128[2] = (byte) (m10357(charArray, 28, 2) & 255);
        this.f11128[3] = (byte) (m10357(charArray, 30, 2) & 255);
        this.f11128[4] = (byte) (m10357(charArray, 32, 2) & 255);
        this.f11128[5] = (byte) (m10357(charArray, 34, 2) & 255);
    }

    @Override // p067l.AbstractC8230
    /* JADX INFO: renamed from: ۧ */
    public final void mo4602(C14935 c14935) {
        c14935.m34161(4);
        c14935.m34167(this.f11129);
        c14935.m34165(this.f11127);
        c14935.m34165(this.f11130);
        c14935.m34162(this.f11125);
        c14935.m34162(this.f11126);
        int i = c14935.f42650;
        c14935.m34157(6);
        C14935 c14935M34164 = c14935.m34164(i);
        for (int i2 = 0; i2 < 6; i2++) {
            c14935M34164.m34162(this.f11128[i2]);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m10357(char[] cArr, int i, int i2) {
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
                                case C0254q.f1216f /* 99 */:
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

    @Override // p067l.AbstractC8230
    /* JADX INFO: renamed from: ֫ */
    public final void mo4601(C14935 c14935) {
        c14935.m34161(4);
        this.f11129 = c14935.m34156();
        this.f11127 = (short) c14935.m34160();
        this.f11130 = (short) c14935.m34160();
        this.f11125 = (byte) c14935.m34163();
        this.f11126 = (byte) c14935.m34163();
        int i = c14935.f42650;
        c14935.m34157(6);
        if (this.f11128 == null) {
            this.f11128 = new byte[6];
        }
        C14935 c14935M34164 = c14935.m34164(i);
        for (int i2 = 0; i2 < 6; i2++) {
            this.f11128[i2] = (byte) c14935M34164.m34163();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m10358(int i, int i2) {
        char[] cArr = new char[i2];
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                cArr[i3] = f11124[i & 15];
                i >>>= 4;
                i2 = i3;
            } else {
                return new String(cArr);
            }
        }
    }

    public final String toString() {
        return m10358(this.f11129, 8) + '-' + m10358(this.f11127, 4) + '-' + m10358(this.f11130, 4) + '-' + m10358(this.f11125, 2) + m10358(this.f11126, 2) + '-' + m10358(this.f11128[0], 2) + m10358(this.f11128[1], 2) + m10358(this.f11128[2], 2) + m10358(this.f11128[3], 2) + m10358(this.f11128[4], 2) + m10358(this.f11128[5], 2);
    }
}
