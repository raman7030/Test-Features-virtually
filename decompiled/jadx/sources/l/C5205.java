package l;

/* JADX INFO: renamed from: l.ۚ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O73P */
/* JADX INFO: loaded from: classes2.dex */
public final class C5205 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long[] f16305;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f16306;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long[] f16307;

    public C5205(long[] jArr, long[] jArr2, int[] iArr) {
        this.f16307 = jArr;
        this.f16305 = jArr2;
        this.f16306 = iArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14976() {
        return this.f16307.length;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m14980() {
        return this.f16307[0];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m14978(int i) {
        return this.f16305[i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m14979(int i) {
        return this.f16306[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14977(long j) {
        long[] jArr = this.f16307;
        int length = jArr.length - 1;
        int i = 0;
        int i2 = 0;
        while (i <= length) {
            int i3 = (i + length) >>> 1;
            if (jArr[i3] <= j) {
                i = i3 + 1;
                i2 = i3;
            } else {
                length = i3 - 1;
            }
        }
        return i2;
    }
}
