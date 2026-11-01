package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7O2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11318 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f31511;

    public C11318(byte[] bArr) {
        this.f31511 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11318.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f31511, ((C11318) obj).f31511);
    }

    public final int hashCode() {
        byte[] bArr = this.f31511;
        int iMin = Math.min(bArr.length, 128);
        int i = 0;
        for (int i2 = 0; i2 < iMin; i2++) {
            i = (i * 31) + bArr[i2];
        }
        return i;
    }
}
