package l;

/* JADX INFO: renamed from: l.ۧ۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A78P */
/* JADX INFO: loaded from: classes3.dex */
public final class C10850 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21125 f32602;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f32603;

    public C10850(C21125 c21125, long j) {
        this.f32602 = c21125;
        this.f32603 = j;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m27115() {
        return this.f32603;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27111() {
        return this.f32602.f68134;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m27113(int i) {
        return this.f32602.f68136[i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m27114(int i) {
        return this.f32602.f68135[i];
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m27116(int i) {
        return this.f32602.f68133[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27112(long j) {
        C21125 c21125 = this.f32602;
        int i = c21125.f68134;
        if (i <= 1 || j <= c21125.f68133[0]) {
            return 0;
        }
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (c21125.f68133[i4] <= j) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        return Math.max(0, Math.min(i2, c21125.f68134 - 1));
    }
}
