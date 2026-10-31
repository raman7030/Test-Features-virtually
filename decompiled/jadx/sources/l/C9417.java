package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7O2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9417 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f28564;

    public C9417(byte[] bArr) {
        this.f28564 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9417.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f28564, ((C9417) obj).f28564);
    }

    public final int hashCode() {
        byte[] bArr = this.f28564;
        int iMin = Math.min(bArr.length, 128);
        int i = 0;
        for (int i2 = 0; i2 < iMin; i2++) {
            i = (i * 31) + bArr[i2];
        }
        return i;
    }
}
