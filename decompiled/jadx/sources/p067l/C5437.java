package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۗ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39IB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5437 extends AbstractC8119 {

    /* JADX INFO: renamed from: ۙ */
    public int f12970;

    /* JADX INFO: renamed from: ᩶ */
    public boolean[] f12971;

    public C5437() {
        throw null;
    }

    public C5437(AbstractC13503 abstractC13503, byte[] bArr, int i) {
        super(abstractC13503, bArr);
        this.f12970 = i;
        int length = (bArr.length * 8) - i;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = true;
            if ((bArr[i2 / 8] & (1 << (7 - (i2 % 8)))) == 0) {
                z = false;
            }
            zArr[i2] = z;
        }
        this.f12971 = zArr;
    }

    @Override // p067l.AbstractC7468
    public final Object getValue() {
        boolean[] zArr = this.f12971;
        return Arrays.copyOf(zArr, zArr.length);
    }

    @Override // p067l.AbstractC7468
    /* JADX INFO: renamed from: ܽ */
    public final String mo11953() {
        return Arrays.toString(this.f12971);
    }
}
