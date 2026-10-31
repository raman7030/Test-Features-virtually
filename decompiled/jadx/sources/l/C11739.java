package l;

/* JADX INFO: renamed from: l.ۨܰۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6MI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f35027;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f35028;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f35030;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public double f35031;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f35032;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double f35033;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public double f35034;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public double f35035;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double f35036;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public double f35037;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f35039;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f35041;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f35043;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public double f35044;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double f35045;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f35029 = 1.0f;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f35042 = 1.0f;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public double f35038 = 1.0d;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f35040 = 1.0f;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m28698(int i, double d, double d2, float f) {
        return (float) ((((double) i) * 0.5d) - (((d + d2) * ((double) f)) * 0.5d));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28713(int i, int i2) {
        this.f35041 = Math.max(0, i);
        int iMax = Math.max(0, i2);
        this.f35039 = iMax;
        this.f35036 = Math.hypot(this.f35041, iMax);
        this.f35030 = 0.0f;
        this.f35038 = 1.0d;
        this.f35031 = 0.0d;
        m28703();
        m28727();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28725(int i, int i2) {
        double d;
        double d2;
        boolean z = false;
        int iMax = Math.max(0, i);
        int iMax2 = Math.max(0, i2);
        if (this.f35028 == iMax && this.f35032 == iMax2) {
            return;
        }
        if (m28720() && !m28718()) {
            z = true;
        }
        double d3 = ((double) this.f35042) / ((double) this.f35029);
        if (m28720()) {
            double d4 = (((double) this.f35028) * 0.5d) - ((double) this.f35043);
            double d5 = this.f35042;
            double d6 = d4 / d5;
            double d7 = ((((double) this.f35032) * 0.5d) - ((double) this.f35027)) / d5;
            double d8 = this.f35038;
            double d9 = this.f35031;
            d2 = ((d9 * d7) + (d8 * d6)) / ((double) this.f35041);
            d = ((d8 * d7) + ((-d9) * d6)) / ((double) this.f35039);
        } else {
            d = 0.5d;
            d2 = 0.5d;
        }
        this.f35028 = iMax;
        this.f35032 = iMax2;
        m28727();
        if (z && m28720()) {
            this.f35042 = m28696(d3 * ((double) this.f35029), m28721(), 8.0f);
            m28699(((double) this.f35041) * d2, ((double) this.f35039) * d, ((double) this.f35028) * 0.5d, 0.5d * ((double) this.f35032), true);
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m28727() {
        m28705();
        this.f35042 = this.f35029;
        this.f35043 = m28720() ? m28698(this.f35028, this.f35044, this.f35045, this.f35042) : 0.0f;
        this.f35027 = m28720() ? m28698(this.f35032, this.f35035, this.f35033, this.f35042) : 0.0f;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m28735() {
        if (this.f35030 == 0.0f) {
            return;
        }
        if (m28720()) {
            float f = this.f35042;
            int i = this.f35028;
            int i2 = this.f35032;
            m28710(f, 0.0f, i * 0.5f, i2 * 0.5f, i * 0.5f, i2 * 0.5f, true);
            return;
        }
        m28701(0.0f);
        m28727();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m28731() {
        return Math.round(this.f35030 / 90.0f) * 90.0f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28708() {
        if (m28720()) {
            float f = this.f35042;
            float fM28731 = m28731();
            int i = this.f35028;
            int i2 = this.f35032;
            m28710(f, fM28731, i * 0.5f, i2 * 0.5f, i * 0.5f, i2 * 0.5f, true);
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m28720() {
        return this.f35041 > 0 && this.f35039 > 0 && this.f35028 > 0 && this.f35032 > 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m28718() {
        if (!m28720()) {
            return false;
        }
        float fAbs = Math.abs(this.f35042 - this.f35029);
        float f = this.f35029;
        return fAbs <= 1.0E-4f * f && Math.abs(this.f35043 - m28698(this.f35028, this.f35044, this.f35045, f)) <= 0.01f && Math.abs(this.f35027 - m28698(this.f35032, this.f35035, this.f35033, this.f35029)) <= 0.01f;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m28729() {
        if (!m28720()) {
            return false;
        }
        double d = this.f35034;
        float f = this.f35042;
        return d * ((double) f) <= ((double) (((float) this.f35028) + 0.01f)) && this.f35037 * ((double) f) <= ((double) (((float) this.f35032) + 0.01f));
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m28707() {
        if (!m28720()) {
            return false;
        }
        double d = this.f35037;
        double d2 = this.f35034;
        return d >= 3.0d * d2 && (((double) this.f35028) / d2) * d >= ((double) this.f35032) * 2.0d;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float m28732() {
        return this.f35042;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float m28730() {
        return this.f35029;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final float m28721() {
        return Math.min(1.0f, this.f35029);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final float m28717() {
        return this.f35030;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final float m28733() {
        return this.f35043;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final float m28706() {
        return this.f35027;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m28719() {
        return this.f35041;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m28737() {
        return this.f35039;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6094 m28736() {
        if (!m28720()) {
            return null;
        }
        double d = (((double) this.f35028) * 0.5d) - ((double) this.f35043);
        double d2 = this.f35042;
        double d3 = d / d2;
        double d4 = ((((double) this.f35032) * 0.5d) - ((double) this.f35027)) / d2;
        int i = this.f35041;
        int i2 = this.f35039;
        double d5 = d2 / ((double) this.f35029);
        double d6 = this.f35038;
        double d7 = this.f35031;
        return new C6094(i, i2, d5, ((d7 * d4) + (d6 * d3)) / ((double) i), ((d6 * d4) + ((-d7) * d3)) / ((double) i2), this.f35030);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28714(C6094 c6094) {
        if (m28720() && c6094.m17004() && this.f35041 == c6094.f18677 && this.f35039 == c6094.f18675) {
            m28701(c6094.f18674);
            this.f35042 = m28696(c6094.f18676 * ((double) this.f35029), m28721(), 8.0f);
            m28699(c6094.f18672 * ((double) this.f35041), c6094.f18673 * ((double) this.f35039), ((double) this.f35028) * 0.5d, ((double) this.f35032) * 0.5d, true);
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final float m28728() {
        return m28704(this.f35028, this.f35044, this.f35045);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m28734() {
        return m28697(this.f35028, this.f35044, this.f35045);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float m28716() {
        return m28704(this.f35032, this.f35035, this.f35033);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float m28722() {
        return m28697(this.f35032, this.f35035, this.f35033);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m28726() {
        if (!m28720()) {
            return this.f35029;
        }
        if (this.f35041 > 200 || this.f35039 > 200) {
            float f = this.f35029;
            if (f >= 1.5f) {
                if (this.f35042 < 0.9f * f) {
                    return f;
                }
                return 1.0f;
            }
        }
        float fMax = m28707() ? (float) (((double) this.f35028) / this.f35034) : Math.max(1.0f, this.f35029 * 2.5f);
        if (this.f35041 <= 200 && this.f35039 <= 200) {
            fMax = Math.max(fMax, (float) Math.min(((double) this.f35028) / this.f35034, ((double) this.f35032) / this.f35037));
        }
        float fMax2 = Math.max(this.f35029, Math.min(8.0f, fMax));
        return this.f35042 < 0.9f * fMax2 ? fMax2 : this.f35029;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28715(float f, float f2) {
        m28702("dx", f);
        m28702("dy", f2);
        if (!m28720()) {
            return false;
        }
        float f3 = this.f35043;
        float fM28728 = m28728();
        float fM28734 = m28734();
        if (f > 0.0f) {
            if (f3 < fM28734) {
                return true;
            }
        } else if (f < 0.0f && f3 > fM28728) {
            return true;
        }
        float f4 = this.f35027;
        float fM28716 = m28716();
        float fM28722 = m28722();
        if (f2 > 0.0f) {
            return f4 < fM28722;
        }
        return f2 < 0.0f && f4 > fM28716;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m28723(float f, float f2) {
        m28702("dx", f);
        m28702("dy", f2);
        if (!m28720()) {
            return f;
        }
        float f3 = this.f35043;
        double d = f3;
        double d2 = f;
        this.f35043 = m28696(d + d2, Math.min(f3, m28728()), Math.max(f3, m28734()));
        float f4 = this.f35027;
        this.f35027 = m28696(((double) f4) + ((double) f2), Math.min(f4, m28716()), Math.max(f4, m28722()));
        return (float) (d2 - (((double) this.f35043) - d));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28712(float f, float f2, float f3, boolean z) {
        m28711(f, this.f35030, f2, f3, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28709(float f, float f2, float f3, float f4, float f5) {
        m28710(f, this.f35030, f2, f3, f4, f5, true);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28724() {
        if (m28720()) {
            float f = this.f35042;
            float f2 = this.f35028 * 0.5f;
            float f3 = this.f35032 * 0.5f;
            m28709(f, f2, f3, f2, f3);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private float m28704(int i, double d, double d2) {
        if (!m28720()) {
            return 0.0f;
        }
        float f = this.f35042;
        double d3 = i;
        return (d2 - d) * ((double) f) <= d3 ? m28698(i, d, d2, f) : (float) (d3 - (d2 * ((double) f)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m28697(int i, double d, double d2) {
        if (!m28720()) {
            return 0.0f;
        }
        float f = this.f35042;
        return (d2 - d) * ((double) f) <= ((double) i) ? m28698(i, d, d2, f) : (float) ((-d) * ((double) f));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28699(double d, double d2, double d3, double d4, boolean z) {
        double d5 = this.f35038;
        double d6 = this.f35031;
        double d7 = this.f35042;
        m28700(d3 - (((d5 * d) - (d6 * d2)) * d7), d4 - (((d5 * d2) + (d6 * d)) * d7), z);
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m28705() {
        this.f35029 = m28720() ? (float) Math.min((this.f35041 > 200 || this.f35039 > 200) ? 8.0f : 1.0f, Math.min(((double) this.f35028) / this.f35034, ((double) this.f35032) / this.f35037)) : 1.0f;
        this.f35040 = m28720() ? (float) Math.min(1.0d, ((double) Math.min(this.f35028, this.f35032)) / this.f35036) : 1.0f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28701(float f) {
        float f2 = f % 360.0f;
        if (f2 >= 180.0f) {
            f2 -= 360.0f;
        } else if (f2 < -180.0f) {
            f2 += 360.0f;
        }
        if (f2 == this.f35030) {
            return;
        }
        if (f2 == 0.0f) {
            f2 = 0.0f;
        }
        this.f35030 = f2;
        if (f2 == 0.0f || f2 == -180.0f) {
            this.f35038 = f2 == 0.0f ? 1.0d : -1.0d;
            this.f35031 = 0.0d;
        } else if (f2 == 90.0f || f2 == -90.0f) {
            this.f35038 = 0.0d;
            this.f35031 = f2 == 90.0f ? 1.0d : -1.0d;
        } else {
            double radians = Math.toRadians(f2);
            this.f35038 = Math.cos(radians);
            this.f35031 = Math.sin(radians);
        }
        m28703();
        m28705();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28703() {
        int i = this.f35041;
        double d = this.f35038;
        double d2 = ((double) i) * d;
        int i2 = this.f35039;
        double d3 = this.f35031;
        double d4 = ((double) (-i2)) * d3;
        double d5 = ((double) i) * d3;
        double d6 = ((double) i2) * d;
        this.f35044 = Math.min(0.0d, d2) + Math.min(0.0d, d4);
        this.f35045 = Math.max(0.0d, d4) + Math.max(0.0d, d2);
        this.f35035 = Math.min(0.0d, d6) + Math.min(0.0d, d5);
        double dMax = Math.max(0.0d, d6) + Math.max(0.0d, d5);
        this.f35033 = dMax;
        this.f35034 = this.f35045 - this.f35044;
        this.f35037 = dMax - this.f35035;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28700(double d, double d2, boolean z) {
        float f = z ? 0.0f : this.f35028 * 0.5f;
        float f2 = z ? 0.0f : this.f35032 * 0.5f;
        this.f35043 = m28696(d, m28728() - f, m28734() + f);
        this.f35027 = m28696(d2, m28716() - f2, m28722() + f2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m28696(double d, float f, float f2) {
        return (float) Math.max(f, Math.min(f2, d));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28710(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        float fM28696;
        m28702("scale", f);
        if (f > 0.0f) {
            m28702("rotation", f2);
            m28702("oldFocusX", f3);
            m28702("oldFocusY", f4);
            m28702("newFocusX", f5);
            m28702("newFocusY", f6);
            if (m28720()) {
                double d = ((double) f3) - ((double) this.f35043);
                double d2 = this.f35042;
                double d3 = d / d2;
                double d4 = (((double) f4) - ((double) this.f35027)) / d2;
                double d5 = this.f35038;
                double d6 = this.f35031;
                double d7 = (d5 * d3) + (d6 * d4);
                double d8 = (d5 * d4) + ((-d6) * d3);
                m28701(f2);
                if (z) {
                    fM28696 = m28696(f, m28721(), 8.0f);
                } else {
                    fM28696 = m28696(f, this.f35040 * 0.5f, 12.0f);
                }
                this.f35042 = fM28696;
                m28699(d7, d8, f5, f6, z);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Scale must be positive");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28711(float f, float f2, float f3, float f4, boolean z) {
        float fM28696;
        m28702("scale", f);
        if (f > 0.0f) {
            m28702("rotation", f2);
            m28702("x", f3);
            m28702("y", f4);
            if (m28720()) {
                m28701(f2);
                if (z) {
                    fM28696 = m28696(f, m28721(), 8.0f);
                } else {
                    fM28696 = m28696(f, this.f35040 * 0.5f, 12.0f);
                }
                this.f35042 = fM28696;
                m28700(f3, f4, z);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Scale must be positive");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28702(String str, float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            throw new IllegalArgumentException(str.concat(" must be finite"));
        }
    }
}
