package l;

/* JADX INFO: renamed from: l.᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U1BV */
/* JADX INFO: loaded from: classes4.dex */
public final class C19102 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f60171;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f60172;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f60173;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f60174;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f60175;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f60176;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44024() {
        this.f60171 = 0.0f;
        this.f60175 = 0.0f;
        this.f60176 = 0.0f;
        this.f60174 = 0.0f;
        this.f60172 = 0.0f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44028(AbstractC19123 abstractC19123, float f) {
        if (abstractC19123 != null) {
            this.f60171 = abstractC19123.m44148(f);
            this.f60173 = abstractC19123.m44146(f);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44031(AbstractC19123 abstractC19123, AbstractC19123 abstractC19124, float f) {
        if (abstractC19123 != null) {
            this.f60176 = abstractC19123.m44148(f);
        }
        if (abstractC19124 != null) {
            this.f60175 = abstractC19124.m44148(f);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44029(AbstractC19123 abstractC19123, AbstractC19123 abstractC19124, float f) {
        if (abstractC19123 != null) {
            this.f60172 = abstractC19123.m44148(f);
        }
        if (abstractC19124 != null) {
            this.f60174 = abstractC19124.m44148(f);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44026(AbstractC14307 abstractC14307, float f) {
        if (abstractC14307 != null) {
            this.f60171 = abstractC14307.m34137(f);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44030(AbstractC14307 abstractC14307, AbstractC14307 abstractC14308, float f) {
        if (abstractC14307 != null) {
            this.f60176 = abstractC14307.m34137(f);
        }
        if (abstractC14308 != null) {
            this.f60175 = abstractC14308.m34137(f);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44027(AbstractC14307 abstractC14307, AbstractC14307 abstractC14308, float f) {
        if (abstractC14307 == null && abstractC14308 == null) {
            return;
        }
        if (abstractC14307 == null) {
            this.f60172 = abstractC14307.m34137(f);
        }
        if (abstractC14308 == null) {
            this.f60174 = abstractC14308.m34137(f);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44025(float f, float f2, int i, int i2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.f60176;
        float f8 = f4 + this.f60175;
        float f9 = (this.f60172 * f5) + f7;
        float f10 = (this.f60174 * f6) + f8;
        float radians = (float) Math.toRadians(this.f60173);
        float radians2 = (float) Math.toRadians(this.f60171);
        double d = radians;
        double d2 = i2 * f6;
        float fSin = (((float) ((Math.sin(d) * ((double) ((-i) * f5))) - (Math.cos(d) * d2))) * radians2) + f9;
        float fCos = (radians2 * ((float) ((Math.cos(d) * ((double) (i * f5))) - (Math.sin(d) * d2)))) + f10;
        fArr[0] = fSin;
        fArr[1] = fCos;
    }
}
