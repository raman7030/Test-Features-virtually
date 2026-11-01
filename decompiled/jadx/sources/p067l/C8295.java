package p067l;

/* JADX INFO: renamed from: l.ۛᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes2.dex */
public final class C8295 {

    /* JADX INFO: renamed from: ֫ */
    public final long f21965;

    /* JADX INFO: renamed from: ۧ */
    public final float f21966;

    /* JADX INFO: renamed from: ܽ */
    public final long f21967;

    /* JADX INFO: renamed from: ܿ */
    public final long f21968;

    /* JADX INFO: renamed from: ᩳ */
    public final float f21969;

    static {
        new C12319().m28389();
        C5792.m13032(0);
        C5792.m13032(1);
        C5792.m13032(2);
        C5792.m13032(3);
        C5792.m13032(4);
    }

    public C8295(C12319 c12319) {
        long j = c12319.f34390;
        long j2 = c12319.f34389;
        long j3 = c12319.f34387;
        float f = c12319.f34391;
        float f2 = c12319.f34388;
        this.f21968 = j;
        this.f21967 = j2;
        this.f21965 = j3;
        this.f21969 = f;
        this.f21966 = f2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12319 m19111() {
        return new C12319(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8295)) {
            return false;
        }
        C8295 c8295 = (C8295) obj;
        return this.f21968 == c8295.f21968 && this.f21967 == c8295.f21967 && this.f21965 == c8295.f21965 && this.f21969 == c8295.f21969 && this.f21966 == c8295.f21966;
    }

    public final int hashCode() {
        long j = this.f21968;
        long j2 = this.f21967;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f21965;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        float f = this.f21969;
        int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f21966;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
