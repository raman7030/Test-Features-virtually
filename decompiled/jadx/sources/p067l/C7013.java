package p067l;

import com.umeng.analytics.pro.C0684bo;

/* JADX INFO: renamed from: l.ۙ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T1SY */
/* JADX INFO: loaded from: classes3.dex */
public final class C7013 implements InterfaceC12378 {

    /* JADX INFO: renamed from: ۧ */
    public static final int[] f18271 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 6, 6, 0, 0, 7, 7, 4, 4, 0, 0, 4, 4, 0, 0};

    /* JADX INFO: renamed from: ֫ */
    public int f18272;

    public C7013(int i) {
        this.f18272 = i;
    }

    @Override // p067l.InterfaceC12378
    /* JADX INFO: renamed from: ֫ */
    public final int mo12629(int i, int i2, byte[] bArr) {
        int i3 = (i + i2) - 16;
        int i4 = i;
        while (i4 <= i3) {
            int i5 = f18271[bArr[i4] & C0684bo.f2505j];
            int i6 = 5;
            int i7 = 0;
            while (i7 < 3) {
                if (((i5 >>> i7) & 1) != 0) {
                    int i8 = i6 >>> 3;
                    int i9 = i6 & 7;
                    long j = 0;
                    for (int i10 = 0; i10 < 6; i10++) {
                        j |= (((long) bArr[(i4 + i8) + i10]) & 255) << (i10 * 8);
                    }
                    long j2 = j >>> i9;
                    if (((j2 >>> 37) & 15) == 5 && ((j2 >>> 9) & 7) == 0) {
                        long j3 = (-77309403137L) & j2;
                        long j4 = (((((int) ((j2 >>> 13) & 1048575)) | ((((int) (j2 >>> 36)) & 1) << 20)) << 4) - ((this.f18272 + i4) - i)) >>> 4;
                        long j5 = (((((j4 & 1048575) << 13) | j3) | ((1048576 & j4) << 16)) << i9) | (j & ((1 << i9) - 1));
                        for (int i11 = 0; i11 < 6; i11++) {
                            bArr[i4 + i8 + i11] = (byte) (j5 >>> (i11 * 8));
                        }
                    }
                }
                i7++;
                i6 += 41;
            }
            i4 += 16;
        }
        int i12 = i4 - i;
        this.f18272 += i12;
        return i12;
    }
}
