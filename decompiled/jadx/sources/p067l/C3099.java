package p067l;

/* JADX INFO: renamed from: l.֨֡ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes2.dex */
public final class C3099 implements Cloneable {

    /* JADX INFO: renamed from: ᩸ */
    public EnumC9273 f5626;

    /* JADX INFO: renamed from: ᩹ */
    public float f5627;

    public C3099(float f, EnumC9273 enumC9273) {
        this.f5627 = f;
        this.f5626 = enumC9273;
    }

    public C3099(float f) {
        this.f5627 = f;
        this.f5626 = EnumC9273.px;
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m5260(C19884 c19884) {
        int iOrdinal = this.f5626.ordinal();
        float f = this.f5627;
        switch (iOrdinal) {
            case 1:
                return f * c19884.m45172();
            case 2:
                return f * c19884.m45174();
            case 3:
                return f * c19884.m45176();
            case 4:
                return (f * c19884.m45176()) / 2.54f;
            case 5:
                return (f * c19884.m45176()) / 25.4f;
            case 6:
                return (f * c19884.m45176()) / 72.0f;
            case 7:
                return (f * c19884.m45176()) / 6.0f;
            case 8:
                C18522 c18522M45175 = c19884.m45175();
                return c18522M45175 == null ? f : (f * c18522M45175.f55314) / 100.0f;
            default:
                return f;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final float m5261(C19884 c19884) {
        if (this.f5626 == EnumC9273.percent) {
            C18522 c18522M45175 = c19884.m45175();
            float f = this.f5627;
            return c18522M45175 == null ? f : (f * c18522M45175.f55311) / 100.0f;
        }
        return m5260(c19884);
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m5257(C19884 c19884) {
        float fSqrt;
        if (this.f5626 == EnumC9273.percent) {
            C18522 c18522M45175 = c19884.m45175();
            float f = this.f5627;
            if (c18522M45175 == null) {
                return f;
            }
            float f2 = c18522M45175.f55314;
            float f3 = c18522M45175.f55311;
            if (f2 == f3) {
                fSqrt = f * f2;
            } else {
                fSqrt = f * ((float) (Math.sqrt((f3 * f3) + (f2 * f2)) / 1.414213562373095d));
            }
            return fSqrt / 100.0f;
        }
        return m5260(c19884);
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m5258(C19884 c19884, float f) {
        if (this.f5626 == EnumC9273.percent) {
            return (this.f5627 * f) / 100.0f;
        }
        return m5260(c19884);
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m5256(float f) {
        float f2;
        float f3;
        int iOrdinal = this.f5626.ordinal();
        float f4 = this.f5627;
        if (iOrdinal == 0) {
            return f4;
        }
        if (iOrdinal == 3) {
            return f4 * f;
        }
        if (iOrdinal == 4) {
            f2 = f4 * f;
            f3 = 2.54f;
        } else if (iOrdinal == 5) {
            f2 = f4 * f;
            f3 = 25.4f;
        } else if (iOrdinal == 6) {
            f2 = f4 * f;
            f3 = 72.0f;
        } else {
            if (iOrdinal != 7) {
                return f4;
            }
            f2 = f4 * f;
            f3 = 6.0f;
        }
        return f2 / f3;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m5262() {
        return this.f5627 == 0.0f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m5259() {
        return this.f5627 < 0.0f;
    }

    public final String toString() {
        return String.valueOf(this.f5627) + this.f5626;
    }
}
