package l;

import com.umeng.analytics.pro.bo;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۖ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2783 implements InterfaceC4194 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C2783 f8664 = new C2783();

    @Override // l.InterfaceC4194
    /* JADX INFO: renamed from: ֫ */
    public final int mo2711(int i, byte[] bArr) {
        byte b;
        int i2;
        int i3;
        int i4;
        int[][] iArr = C18305.f56910;
        long j = 0;
        long j2 = 1;
        int i5 = 0;
        int i6 = 1;
        int i7 = 1;
        while (i5 < i - 1) {
            byte b2 = bArr[i5];
            if (b2 < 0) {
                i7++;
                int i8 = i5 + 1;
                if (i8 < i && (((-127 <= b2 && b2 <= -97) || (-32 <= b2 && b2 <= -17)) && ((64 <= (b = bArr[i8]) && b <= 126) || b <= -4))) {
                    i6++;
                    j2 += 500;
                    int i9 = b2 + 256;
                    int i10 = b + 256;
                    if (i10 < 159) {
                        i2 = i10 > 127 ? b + bo.k : b + 231;
                        i3 = 1;
                    } else {
                        i2 = b + bo.h;
                        i3 = 0;
                    }
                    int i11 = (((i9 < 160 ? b2 + 144 : b2 + UTF8.S_P4A) << 1) - i3) - 32;
                    int i12 = i2 - 32;
                    if (i11 < iArr.length) {
                        int[] iArr2 = iArr[i11];
                        if (i12 < iArr2.length && (i4 = iArr2[i12]) != 0) {
                            j += (long) i4;
                        }
                    }
                    i5 = i8;
                }
            }
            i5++;
        }
        return ((int) (((j / j2) * 50.0f) + ((i6 / i7) * 50.0f))) - 1;
    }

    @Override // l.InterfaceC4194
    /* JADX INFO: renamed from: ֫ */
    public final int mo2710() {
        return C14776.f45126;
    }
}
