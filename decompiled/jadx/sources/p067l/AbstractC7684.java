package p067l;

/* JADX INFO: renamed from: l.ۚ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 01SB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7684 extends AbstractC9088 {

    /* JADX INFO: renamed from: ۧ */
    public int f20151 = 0;

    /* JADX INFO: renamed from: ֫ */
    public int f20150 = 0;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7010();

    /* JADX INFO: renamed from: ֫ */
    public final int m17799(short[] sArr, int i) {
        mo7010();
        short s = sArr[i];
        int i2 = (this.f20151 >>> 11) * s;
        if (Integer.compare(this.f20150 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i2) < 0) {
            this.f20151 = i2;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
            return 0;
        }
        this.f20151 -= i2;
        this.f20150 -= i2;
        sArr[i] = (short) (s - (s >>> 5));
        return 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m17800(short[] sArr) {
        int iM17799 = 1;
        do {
            iM17799 = m17799(sArr, iM17799) | (iM17799 << 1);
        } while (iM17799 < sArr.length);
        return iM17799 - sArr.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m17798(int i) {
        int i2 = 0;
        do {
            mo7010();
            int i3 = this.f20151 >>> 1;
            this.f20151 = i3;
            int i4 = this.f20150;
            int i5 = (i4 - i3) >>> 31;
            this.f20150 = i4 - (i3 & (i5 - 1));
            i2 = (i2 << 1) | (1 - i5);
            i--;
        } while (i != 0);
        return i2;
    }
}
