package p067l;

/* JADX INFO: renamed from: l.᩵֡ */
/* JADX INFO: compiled from: U1BV */
/* JADX INFO: loaded from: classes4.dex */
public final class C1790 {

    /* JADX INFO: renamed from: ֫ */
    public float f63404;

    /* JADX INFO: renamed from: ۧ */
    public float f63405;

    /* JADX INFO: renamed from: ܳ */
    public float f63406;

    /* JADX INFO: renamed from: ܽ */
    public float f63407;

    /* JADX INFO: renamed from: ܿ */
    public float f63408;

    /* JADX INFO: renamed from: ᩳ */
    public float f63409;

    /* JADX INFO: renamed from: ֫ */
    public final void m46318() {
        this.f63404 = 0.0f;
        this.f63408 = 0.0f;
        this.f63409 = 0.0f;
        this.f63407 = 0.0f;
        this.f63405 = 0.0f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46322(AbstractC1791 abstractC1791, float f) {
        if (abstractC1791 != null) {
            this.f63404 = abstractC1791.m46442(f);
            this.f63406 = abstractC1791.m46440(f);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46325(AbstractC1791 abstractC1791, AbstractC1791 abstractC1792, float f) {
        if (abstractC1791 != null) {
            this.f63409 = abstractC1791.m46442(f);
        }
        if (abstractC1792 != null) {
            this.f63408 = abstractC1792.m46442(f);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46323(AbstractC1791 abstractC1791, AbstractC1791 abstractC1792, float f) {
        if (abstractC1791 != null) {
            this.f63405 = abstractC1791.m46442(f);
        }
        if (abstractC1792 != null) {
            this.f63407 = abstractC1792.m46442(f);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46320(AbstractC1552 abstractC1552, float f) {
        if (abstractC1552 != null) {
            this.f63404 = abstractC1552.m36270(f);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46324(AbstractC1552 abstractC1552, AbstractC1552 abstractC1553, float f) {
        if (abstractC1552 != null) {
            this.f63409 = abstractC1552.m36270(f);
        }
        if (abstractC1553 != null) {
            this.f63408 = abstractC1553.m36270(f);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46321(AbstractC1552 abstractC1552, AbstractC1552 abstractC1553, float f) {
        if (abstractC1552 == null && abstractC1553 == null) {
            return;
        }
        if (abstractC1552 == null) {
            this.f63405 = abstractC1552.m36270(f);
        }
        if (abstractC1553 == null) {
            this.f63407 = abstractC1553.m36270(f);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46319(float f, float f2, int i, int i2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.f63409;
        float f8 = f4 + this.f63408;
        float f9 = (this.f63405 * f5) + f7;
        float f10 = (this.f63407 * f6) + f8;
        float radians = (float) Math.toRadians(this.f63406);
        float radians2 = (float) Math.toRadians(this.f63404);
        double d = radians;
        double d2 = i2 * f6;
        float fSin = (((float) ((Math.sin(d) * ((double) ((-i) * f5))) - (Math.cos(d) * d2))) * radians2) + f9;
        float fCos = (radians2 * ((float) ((Math.cos(d) * ((double) (i * f5))) - (Math.sin(d) * d2)))) + f10;
        fArr[0] = fSin;
        fArr[1] = fCos;
    }
}
