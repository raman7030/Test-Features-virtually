package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.alipay.sdk.p010m.p058y.C0254q;

/* JADX INFO: renamed from: l.ܽᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8E3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18355 {

    /* JADX INFO: renamed from: ֫ */
    public C2952 f54804;

    /* JADX INFO: renamed from: ۧ */
    public int[] f54805 = new int[16];

    /* JADX INFO: renamed from: ܽ */
    public int[] f54806 = new int[16];

    public C18355(C2952 c2952) {
        this.f54804 = c2952;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41792(int i, int i2, byte[] bArr) {
        m41791(1, i2);
        byte b = bArr[i];
        int i3 = b & 240;
        int i4 = b & 15;
        C2952 c2952 = this.f54804;
        if (i3 == 128) {
            m41791(3, i2);
            c2952.m4884(i4, bArr[i + 1], bArr[i + 2]);
            return;
        }
        if (i3 == 144) {
            m41791(3, i2);
            byte b2 = bArr[i + 2];
            if (b2 == 0) {
                c2952.m4884(i4, bArr[i + 1], b2);
                return;
            } else {
                c2952.m4887(i4, bArr[i + 1], b2);
                return;
            }
        }
        if (i3 == 160) {
            m41791(3, i2);
            byte b3 = bArr[i + 1];
            byte b4 = bArr[i + 2];
            return;
        }
        if (i3 != 176) {
            if (i3 == 192) {
                m41791(2, i2);
                c2952.m4883(i4, (int) bArr[i + 1]);
                return;
            } else if (i3 == 208) {
                m41791(2, i2);
                c2952.m4891(i4, ((double) bArr[i + 1]) * 0.007874015748031496d);
                return;
            } else {
                if (i3 != 224) {
                    return;
                }
                m41791(3, i2);
                c2952.m4889(i4, ((double) (((bArr[i + 2] << 7) + bArr[i + 1]) - 8192)) * 1.220703125E-4d);
            }
        }
        m41791(3, i2);
        byte b5 = bArr[i + 1];
        byte b6 = bArr[i + 2];
        int[] iArr = this.f54806;
        if (b5 == 6) {
            iArr[i4] = b6 << 7;
            m41790(i4);
            return;
        }
        if (b5 == 38) {
            iArr[i4] = b6 | (iArr[i4] & C0184a.f879g);
            m41790(i4);
            return;
        }
        int[] iArr2 = this.f54805;
        switch (b5) {
            case 98:
                iArr2[i4] = b6 | 16384 | (iArr2[i4] & C0184a.f879g);
                break;
            case C0254q.f1216f /* 99 */:
                iArr2[i4] = (b6 << 7) | 16384;
                break;
            case 100:
                iArr2[i4] = b6 | (iArr2[i4] & C0184a.f879g);
                break;
            case 101:
                iArr2[i4] = b6 << 7;
                break;
            default:
                double d = ((double) b6) * 0.007874015748031496d;
                if (b5 == 1) {
                    c2952.m4888(i4, d * 0.1d);
                    break;
                } else if (b5 == 7) {
                    c2952.m4892(i4, d);
                    break;
                } else if (b5 == 10) {
                    c2952.m4886(i4, (d * 2.0d) - 1.0d);
                    break;
                } else if (b5 == 74) {
                    c2952.m4890(i4, d);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41790(int i) {
        int i2 = this.f54805[i];
        int i3 = i2 & 16384;
        int[] iArr = this.f54806;
        if (i3 == 0) {
            int i4 = iArr[i];
            if (i2 != 0) {
                return;
            }
            this.f54804.m4882(i, (((double) (i4 & 127)) * 0.01d) + ((double) (i4 >> 7)));
            return;
        }
        int i5 = iArr[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41791(int i, int i2) {
        if (i2 < i) {
            throw new IllegalArgumentException(C20780.m46928("Expected message of at least ", i, " bytes but got ", " bytes.", i2));
        }
    }
}
