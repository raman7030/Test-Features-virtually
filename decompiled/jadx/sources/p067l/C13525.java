package p067l;

/* JADX INFO: renamed from: l.ۨܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MI */
/* JADX INFO: loaded from: classes3.dex */
public final class C13525 {

    /* JADX INFO: renamed from: ֡ */
    public float f38027;

    /* JADX INFO: renamed from: ֨ */
    public int f38028;

    /* JADX INFO: renamed from: ۖ */
    public float f38030;

    /* JADX INFO: renamed from: ۘ */
    public double f38031;

    /* JADX INFO: renamed from: ۚ */
    public int f38032;

    /* JADX INFO: renamed from: ۜ */
    public double f38033;

    /* JADX INFO: renamed from: ۡ */
    public double f38034;

    /* JADX INFO: renamed from: ۢ */
    public double f38035;

    /* JADX INFO: renamed from: ۧ */
    public double f38036;

    /* JADX INFO: renamed from: ܳ */
    public double f38037;

    /* JADX INFO: renamed from: ܽ */
    public int f38039;

    /* JADX INFO: renamed from: ᩳ */
    public int f38041;

    /* JADX INFO: renamed from: ᩵ */
    public float f38043;

    /* JADX INFO: renamed from: ᩷ */
    public double f38044;

    /* JADX INFO: renamed from: ᩻ */
    public double f38045;

    /* JADX INFO: renamed from: ֫ */
    public float f38029 = 1.0f;

    /* JADX INFO: renamed from: ᩴ */
    public float f38042 = 1.0f;

    /* JADX INFO: renamed from: ܺ */
    public double f38038 = 1.0d;

    /* JADX INFO: renamed from: ܿ */
    public float f38040 = 1.0f;

    /* JADX INFO: renamed from: ֫ */
    public static float m30746(int i, double d, double d2, float f) {
        return (float) ((((double) i) * 0.5d) - (((d + d2) * ((double) f)) * 0.5d));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30761(int i, int i2) {
        this.f38041 = Math.max(0, i);
        int iMax = Math.max(0, i2);
        this.f38039 = iMax;
        this.f38036 = Math.hypot(this.f38041, iMax);
        this.f38030 = 0.0f;
        this.f38038 = 1.0d;
        this.f38031 = 0.0d;
        m30751();
        m30775();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30773(int i, int i2) {
        double d;
        double d2;
        boolean z = false;
        int iMax = Math.max(0, i);
        int iMax2 = Math.max(0, i2);
        if (this.f38028 == iMax && this.f38032 == iMax2) {
            return;
        }
        if (m30768() && !m30766()) {
            z = true;
        }
        double d3 = ((double) this.f38042) / ((double) this.f38029);
        if (m30768()) {
            double d4 = (((double) this.f38028) * 0.5d) - ((double) this.f38043);
            double d5 = this.f38042;
            double d6 = d4 / d5;
            double d7 = ((((double) this.f38032) * 0.5d) - ((double) this.f38027)) / d5;
            double d8 = this.f38038;
            double d9 = this.f38031;
            d2 = ((d9 * d7) + (d8 * d6)) / ((double) this.f38041);
            d = ((d8 * d7) + ((-d9) * d6)) / ((double) this.f38039);
        } else {
            d = 0.5d;
            d2 = 0.5d;
        }
        this.f38028 = iMax;
        this.f38032 = iMax2;
        m30775();
        if (z && m30768()) {
            this.f38042 = m30744(d3 * ((double) this.f38029), m30769(), 8.0f);
            m30747(((double) this.f38041) * d2, ((double) this.f38039) * d, ((double) this.f38028) * 0.5d, 0.5d * ((double) this.f38032), true);
        }
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m30775() {
        m30753();
        this.f38042 = this.f38029;
        this.f38043 = m30768() ? m30746(this.f38028, this.f38044, this.f38045, this.f38042) : 0.0f;
        this.f38027 = m30768() ? m30746(this.f38032, this.f38035, this.f38033, this.f38042) : 0.0f;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final void m30783() {
        if (this.f38030 == 0.0f) {
            return;
        }
        if (m30768()) {
            float f = this.f38042;
            int i = this.f38028;
            int i2 = this.f38032;
            m30758(f, 0.0f, i * 0.5f, i2 * 0.5f, i * 0.5f, i2 * 0.5f, true);
            return;
        }
        m30749(0.0f);
        m30775();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final float m30779() {
        return Math.round(this.f38030 / 90.0f) * 90.0f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30756() {
        if (m30768()) {
            float f = this.f38042;
            float fM30779 = m30779();
            int i = this.f38028;
            int i2 = this.f38032;
            m30758(f, fM30779, i * 0.5f, i2 * 0.5f, i * 0.5f, i2 * 0.5f, true);
        }
    }

    /* JADX INFO: renamed from: ۠ */
    public final boolean m30768() {
        return this.f38041 > 0 && this.f38039 > 0 && this.f38028 > 0 && this.f38032 > 0;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m30766() {
        if (!m30768()) {
            return false;
        }
        float fAbs = Math.abs(this.f38042 - this.f38029);
        float f = this.f38029;
        return fAbs <= 1.0E-4f * f && Math.abs(this.f38043 - m30746(this.f38028, this.f38044, this.f38045, f)) <= 0.01f && Math.abs(this.f38027 - m30746(this.f38032, this.f38035, this.f38033, this.f38029)) <= 0.01f;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m30777() {
        if (!m30768()) {
            return false;
        }
        double d = this.f38034;
        float f = this.f38042;
        return d * ((double) f) <= ((double) (((float) this.f38028) + 0.01f)) && this.f38037 * ((double) f) <= ((double) (((float) this.f38032) + 0.01f));
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m30755() {
        if (!m30768()) {
            return false;
        }
        double d = this.f38037;
        double d2 = this.f38034;
        return d >= 3.0d * d2 && (((double) this.f38028) / d2) * d >= ((double) this.f38032) * 2.0d;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final float m30780() {
        return this.f38042;
    }

    /* JADX INFO: renamed from: ܿ */
    public final float m30778() {
        return this.f38029;
    }

    /* JADX INFO: renamed from: ۡ */
    public final float m30769() {
        return Math.min(1.0f, this.f38029);
    }

    /* JADX INFO: renamed from: ۘ */
    public final float m30765() {
        return this.f38030;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final float m30781() {
        return this.f38043;
    }

    /* JADX INFO: renamed from: ֡ */
    public final float m30754() {
        return this.f38027;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m30767() {
        return this.f38041;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m30785() {
        return this.f38039;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final C8160 m30784() {
        if (!m30768()) {
            return null;
        }
        double d = (((double) this.f38028) * 0.5d) - ((double) this.f38043);
        double d2 = this.f38042;
        double d3 = d / d2;
        double d4 = ((((double) this.f38032) * 0.5d) - ((double) this.f38027)) / d2;
        int i = this.f38041;
        int i2 = this.f38039;
        double d5 = d2 / ((double) this.f38029);
        double d6 = this.f38038;
        double d7 = this.f38031;
        return new C8160(i, i2, d5, ((d7 * d4) + (d6 * d3)) / ((double) i), ((d6 * d4) + ((-d7) * d3)) / ((double) i2), this.f38030);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30762(C8160 c8160) {
        if (m30768() && c8160.m18935() && this.f38041 == c8160.f21533 && this.f38039 == c8160.f21531) {
            m30749(c8160.f21530);
            this.f38042 = m30744(c8160.f21532 * ((double) this.f38029), m30769(), 8.0f);
            m30747(c8160.f21528 * ((double) this.f38041), c8160.f21529 * ((double) this.f38039), ((double) this.f38028) * 0.5d, ((double) this.f38032) * 0.5d, true);
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final float m30776() {
        return m30752(this.f38028, this.f38044, this.f38045);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final float m30782() {
        return m30745(this.f38028, this.f38044, this.f38045);
    }

    /* JADX INFO: renamed from: ۖ */
    public final float m30764() {
        return m30752(this.f38032, this.f38035, this.f38033);
    }

    /* JADX INFO: renamed from: ۢ */
    public final float m30770() {
        return m30745(this.f38032, this.f38035, this.f38033);
    }

    /* JADX INFO: renamed from: ܳ */
    public final float m30774() {
        if (!m30768()) {
            return this.f38029;
        }
        if (this.f38041 > 200 || this.f38039 > 200) {
            float f = this.f38029;
            if (f >= 1.5f) {
                if (this.f38042 < 0.9f * f) {
                    return f;
                }
                return 1.0f;
            }
        }
        float fMax = m30755() ? (float) (((double) this.f38028) / this.f38034) : Math.max(1.0f, this.f38029 * 2.5f);
        if (this.f38041 <= 200 && this.f38039 <= 200) {
            fMax = Math.max(fMax, (float) Math.min(((double) this.f38028) / this.f38034, ((double) this.f38032) / this.f38037));
        }
        float fMax2 = Math.max(this.f38029, Math.min(8.0f, fMax));
        return this.f38042 < 0.9f * fMax2 ? fMax2 : this.f38029;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m30763(float f, float f2) {
        m30750("dx", f);
        m30750("dy", f2);
        if (!m30768()) {
            return false;
        }
        float f3 = this.f38043;
        float fM30776 = m30776();
        float fM30782 = m30782();
        if (f > 0.0f) {
            if (f3 < fM30782) {
                return true;
            }
        } else if (f < 0.0f && f3 > fM30776) {
            return true;
        }
        float f4 = this.f38027;
        float fM30764 = m30764();
        float fM30770 = m30770();
        if (f2 > 0.0f) {
            return f4 < fM30770;
        }
        return f2 < 0.0f && f4 > fM30764;
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m30771(float f, float f2) {
        m30750("dx", f);
        m30750("dy", f2);
        if (!m30768()) {
            return f;
        }
        float f3 = this.f38043;
        double d = f3;
        double d2 = f;
        this.f38043 = m30744(d + d2, Math.min(f3, m30776()), Math.max(f3, m30782()));
        float f4 = this.f38027;
        this.f38027 = m30744(((double) f4) + ((double) f2), Math.min(f4, m30764()), Math.max(f4, m30770()));
        return (float) (d2 - (((double) this.f38043) - d));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30760(float f, float f2, float f3, boolean z) {
        m30759(f, this.f38030, f2, f3, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30757(float f, float f2, float f3, float f4, float f5) {
        m30758(f, this.f38030, f2, f3, f4, f5, true);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30772() {
        if (m30768()) {
            float f = this.f38042;
            float f2 = this.f38028 * 0.5f;
            float f3 = this.f38032 * 0.5f;
            m30757(f, f2, f3, f2, f3);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private float m30752(int i, double d, double d2) {
        if (!m30768()) {
            return 0.0f;
        }
        float f = this.f38042;
        double d3 = i;
        return (d2 - d) * ((double) f) <= d3 ? m30746(i, d, d2, f) : (float) (d3 - (d2 * ((double) f)));
    }

    /* JADX INFO: renamed from: ֫ */
    private float m30745(int i, double d, double d2) {
        if (!m30768()) {
            return 0.0f;
        }
        float f = this.f38042;
        return (d2 - d) * ((double) f) <= ((double) i) ? m30746(i, d, d2, f) : (float) ((-d) * ((double) f));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m30747(double d, double d2, double d3, double d4, boolean z) {
        double d5 = this.f38038;
        double d6 = this.f38031;
        double d7 = this.f38042;
        m30748(d3 - (((d5 * d) - (d6 * d2)) * d7), d4 - (((d5 * d2) + (d6 * d)) * d7), z);
    }

    /* JADX INFO: renamed from: ᩶ */
    private void m30753() {
        this.f38029 = m30768() ? (float) Math.min((this.f38041 > 200 || this.f38039 > 200) ? 8.0f : 1.0f, Math.min(((double) this.f38028) / this.f38034, ((double) this.f38032) / this.f38037)) : 1.0f;
        this.f38040 = m30768() ? (float) Math.min(1.0d, ((double) Math.min(this.f38028, this.f38032)) / this.f38036) : 1.0f;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m30749(float f) {
        float f2 = f % 360.0f;
        if (f2 >= 180.0f) {
            f2 -= 360.0f;
        } else if (f2 < -180.0f) {
            f2 += 360.0f;
        }
        if (f2 == this.f38030) {
            return;
        }
        if (f2 == 0.0f) {
            f2 = 0.0f;
        }
        this.f38030 = f2;
        if (f2 == 0.0f || f2 == -180.0f) {
            this.f38038 = f2 == 0.0f ? 1.0d : -1.0d;
            this.f38031 = 0.0d;
        } else if (f2 == 90.0f || f2 == -90.0f) {
            this.f38038 = 0.0d;
            this.f38031 = f2 == 90.0f ? 1.0d : -1.0d;
        } else {
            double radians = Math.toRadians(f2);
            this.f38038 = Math.cos(radians);
            this.f38031 = Math.sin(radians);
        }
        m30751();
        m30753();
    }

    /* JADX INFO: renamed from: ۙ */
    private void m30751() {
        int i = this.f38041;
        double d = this.f38038;
        double d2 = ((double) i) * d;
        int i2 = this.f38039;
        double d3 = this.f38031;
        double d4 = ((double) (-i2)) * d3;
        double d5 = ((double) i) * d3;
        double d6 = ((double) i2) * d;
        this.f38044 = Math.min(0.0d, d2) + Math.min(0.0d, d4);
        this.f38045 = Math.max(0.0d, d4) + Math.max(0.0d, d2);
        this.f38035 = Math.min(0.0d, d6) + Math.min(0.0d, d5);
        double dMax = Math.max(0.0d, d6) + Math.max(0.0d, d5);
        this.f38033 = dMax;
        this.f38034 = this.f38045 - this.f38044;
        this.f38037 = dMax - this.f38035;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m30748(double d, double d2, boolean z) {
        float f = z ? 0.0f : this.f38028 * 0.5f;
        float f2 = z ? 0.0f : this.f38032 * 0.5f;
        this.f38043 = m30744(d, m30776() - f, m30782() + f);
        this.f38027 = m30744(d2, m30764() - f2, m30770() + f2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m30744(double d, float f, float f2) {
        return (float) Math.max(f, Math.min(f2, d));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30758(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        float fM30744;
        m30750("scale", f);
        if (f > 0.0f) {
            m30750("rotation", f2);
            m30750("oldFocusX", f3);
            m30750("oldFocusY", f4);
            m30750("newFocusX", f5);
            m30750("newFocusY", f6);
            if (m30768()) {
                double d = ((double) f3) - ((double) this.f38043);
                double d2 = this.f38042;
                double d3 = d / d2;
                double d4 = (((double) f4) - ((double) this.f38027)) / d2;
                double d5 = this.f38038;
                double d6 = this.f38031;
                double d7 = (d5 * d3) + (d6 * d4);
                double d8 = (d5 * d4) + ((-d6) * d3);
                m30749(f2);
                if (z) {
                    fM30744 = m30744(f, m30769(), 8.0f);
                } else {
                    fM30744 = m30744(f, this.f38040 * 0.5f, 12.0f);
                }
                this.f38042 = fM30744;
                m30747(d7, d8, f5, f6, z);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Scale must be positive");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30759(float f, float f2, float f3, float f4, boolean z) {
        float fM30744;
        m30750("scale", f);
        if (f > 0.0f) {
            m30750("rotation", f2);
            m30750("x", f3);
            m30750("y", f4);
            if (m30768()) {
                m30749(f2);
                if (z) {
                    fM30744 = m30744(f, m30769(), 8.0f);
                } else {
                    fM30744 = m30744(f, this.f38040 * 0.5f, 12.0f);
                }
                this.f38042 = fM30744;
                m30748(f3, f4, z);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Scale must be positive");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30750(String str, float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            throw new IllegalArgumentException(str.concat(" must be finite"));
        }
    }
}
