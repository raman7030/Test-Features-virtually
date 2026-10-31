package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.۬᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 48EV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13353 implements InterfaceC10532 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f39926;

    public C13353(int i) {
        this.f39926 = i;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0091 A[PHI: r2
      0x0091: PHI (r2v10 int) = (r2v1 int), (r2v11 int) binds: [B:19:0x00a5, B:15:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC10532
    /* JADX INFO: renamed from: ֫ */
    public final int mo10634(int i, int i2, byte[] bArr) {
        int i3;
        int i4;
        int i5 = (i2 + i) - 8;
        int i6 = i;
        while (i6 <= i5) {
            byte b = bArr[i6];
            int i7 = b & 255;
            if (i7 == 239) {
                int i8 = i6 + 1;
                byte b2 = bArr[i8];
                if ((b2 & cb.k) == 0) {
                    int i9 = i6 + 2;
                    int i10 = i6 + 3;
                    int i11 = ((((b2 & 240) << 13) | ((bArr[i9] & 255) << 9)) | ((bArr[i10] & 255) << 1)) - ((this.f39926 + i6) - i);
                    bArr[i8] = (byte) ((b2 & 15) | ((i11 >>> 8) & 240));
                    bArr[i9] = (byte) (((i11 >>> 16) & 15) | ((i11 >>> 7) & 16) | ((i11 << 4) & BERTags.FLAGS));
                    bArr[i10] = (byte) (((i11 >>> 13) & 128) | ((i11 >>> 4) & 127));
                    i6 = i9;
                }
            } else if ((b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) == 23) {
                int i12 = ((bArr[i6 + 1] & 255) << 8) | i7;
                int i13 = i6 + 2;
                int i14 = i12 | ((bArr[i13] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24);
                if ((i14 & 3712) != 0) {
                    i13 = i6 + 4;
                    int iM42700 = C18321.m42700(i13, bArr);
                    if ((((i14 << 8) ^ iM42700) & 1015811) != 3) {
                        i6 = i13;
                    } else {
                        i3 = (i14 & (-4096)) + (iM42700 >>> 20);
                        i4 = (iM42700 << 12) | 279;
                        C18321.m42701(i6, i4, bArr);
                        C18321.m42701(i6 + 4, i3, bArr);
                        i6 += 6;
                    }
                } else {
                    int i15 = i14 >>> 27;
                    if (((i14 - 12544) & 16256) >= (i15 & 29)) {
                        i6 = i13;
                    } else {
                        int iM42694 = C18321.m42694(i6 + 4, bArr) - ((this.f39926 + i6) - i);
                        i3 = (i14 >>> 12) | (iM42694 << 20);
                        i4 = ((iM42694 + 2048) & (-4096)) | 23 | (i15 << 7);
                        C18321.m42701(i6, i4, bArr);
                        C18321.m42701(i6 + 4, i3, bArr);
                        i6 += 6;
                    }
                }
            }
            i6 += 2;
        }
        int i16 = i6 - i;
        this.f39926 += i16;
        return i16;
    }
}
