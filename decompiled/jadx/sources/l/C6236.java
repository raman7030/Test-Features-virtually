package l;

/* JADX INFO: renamed from: l.ۛᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes2.dex */
public final class C6236 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f19100;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float f19101;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f19102;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f19103;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float f19104;

    static {
        new C10470().m26357();
        C3603.m11056(0);
        C3603.m11056(1);
        C3603.m11056(2);
        C3603.m11056(3);
        C3603.m11056(4);
    }

    public C6236(C10470 c10470) {
        long j = c10470.f31425;
        long j2 = c10470.f31424;
        long j3 = c10470.f31422;
        float f = c10470.f31426;
        float f2 = c10470.f31423;
        this.f19103 = j;
        this.f19102 = j2;
        this.f19100 = j3;
        this.f19104 = f;
        this.f19101 = f2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10470 m17173() {
        return new C10470(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6236)) {
            return false;
        }
        C6236 c6236 = (C6236) obj;
        return this.f19103 == c6236.f19103 && this.f19102 == c6236.f19102 && this.f19100 == c6236.f19100 && this.f19104 == c6236.f19104 && this.f19101 == c6236.f19101;
    }

    public final int hashCode() {
        long j = this.f19103;
        long j2 = this.f19102;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f19100;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        float f = this.f19104;
        int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f19101;
        return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }
}
