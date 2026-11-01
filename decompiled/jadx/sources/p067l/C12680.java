package p067l;

/* JADX INFO: renamed from: l.ۧ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A78P */
/* JADX INFO: loaded from: classes3.dex */
public final class C12680 {

    /* JADX INFO: renamed from: ֫ */
    public final C22446 f35578;

    /* JADX INFO: renamed from: ۧ */
    public final long f35579;

    public C12680(C22446 c22446, long j) {
        this.f35578 = c22446;
        this.f35579 = j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m29160() {
        return this.f35579;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m29156() {
        return this.f35578.f70816;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m29158(int i) {
        return this.f35578.f70818[i];
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m29159(int i) {
        return this.f35578.f70817[i];
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m29161(int i) {
        return this.f35578.f70815[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m29157(long j) {
        C22446 c22446 = this.f35578;
        int i = c22446.f70816;
        if (i <= 1 || j <= c22446.f70815[0]) {
            return 0;
        }
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (c22446.f70815[i4] <= j) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        return Math.max(0, Math.min(i2, c22446.f70816 - 1));
    }
}
