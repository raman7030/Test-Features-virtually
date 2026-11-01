package p067l;

import android.graphics.RectF;

/* JADX INFO: renamed from: l.᩻ܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G6MJ */
/* JADX INFO: loaded from: classes.dex */
public final class C24924 {

    /* JADX INFO: renamed from: ֫ */
    public final long f79595;

    /* JADX INFO: renamed from: ۧ */
    public final RectF f79596;

    /* JADX INFO: renamed from: ܳ */
    public final long f79597;

    /* JADX INFO: renamed from: ܽ */
    public final int f79598;

    /* JADX INFO: renamed from: ܿ */
    public final RectF f79599;

    /* JADX INFO: renamed from: ᩳ */
    public final int f79600;

    /* JADX INFO: renamed from: ᩻ */
    public final float f79601;

    public C24924(long j, long j2, int i, int i2, int i3, int i4) {
        this.f79600 = i3;
        this.f79595 = j;
        this.f79597 = j2;
        this.f79598 = i4;
        float fScalb = Math.scalb(1.0f, i3);
        this.f79601 = fScalb;
        double d = i4;
        double d2 = j * d;
        double d3 = j2 * d;
        double d4 = fScalb;
        double d5 = i;
        double d6 = d2 + d;
        float fMin = (float) Math.min(d5, d6 / d4);
        double d7 = i2;
        double d8 = d + d3;
        this.f79596 = new RectF((float) (d2 / d4), (float) (d3 / d4), fMin, (float) Math.min(d7, d8 / d4));
        this.f79599 = new RectF((float) Math.max(0.0d, (d2 - 1.0d) / d4), (float) Math.max(0.0d, (d3 - 1.0d) / d4), (float) Math.min(d5, (d6 + 1.0d) / d4), (float) Math.min(d7, (d8 + 1.0d) / d4));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24924)) {
            return false;
        }
        C24924 c24924 = (C24924) obj;
        return this.f79600 == c24924.f79600 && this.f79598 == c24924.f79598 && this.f79595 == c24924.f79595 && this.f79597 == c24924.f79597;
    }

    public final int hashCode() {
        int i = ((this.f79600 * 31) + this.f79598) * 31;
        long j = this.f79595;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f79597;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }
}
