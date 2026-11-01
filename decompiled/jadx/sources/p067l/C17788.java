package p067l;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ܺ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBKJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17788 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f53119;

    /* JADX INFO: renamed from: ۧ */
    public float f53120;

    /* JADX INFO: renamed from: ܽ */
    public float f53121;

    /* JADX INFO: renamed from: ᩳ */
    public float f53122;

    public C17788(C2976 c2976, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        if (f3 == 0.0f || f4 == 0.0f) {
            return;
        }
        boolean z = f6 != 0.0f;
        boolean z2 = f7 != 0.0f;
        double d = f5;
        double dCos = Math.cos(d);
        double dSin = Math.sin(d);
        double d2 = (f - f8) / 2.0f;
        double d3 = (f2 - f9) / 2.0f;
        double d4 = (dSin * d3) + (dCos * d2);
        double d5 = (d3 * dCos) + ((-dSin) * d2);
        double d6 = f3 * f3;
        double d7 = f4 * f4;
        double d8 = d5 * d5 * d6;
        double d9 = (d6 * d7) - d8;
        double d10 = d7 * d4 * d4;
        double d11 = (d9 - d10) / (d8 + d10);
        double dSqrt = Math.sqrt(d11 < 0.0d ? 0.0d : d11);
        dSqrt = z == z2 ? -dSqrt : dSqrt;
        double d12 = f3;
        double d13 = dSqrt * d12 * d5;
        double d14 = f4;
        double d15 = d13 / d14;
        double d16 = (((-dSqrt) * d14) * d4) / d12;
        C10353 c10353 = new C10353(((dCos * d15) - (dSin * d16)) + ((double) ((f + f8) / 2.0f)), (dCos * d16) + (dSin * d15) + ((double) ((f2 + f9) / 2.0f)));
        C10353 c10354 = new C10353(d12, 0.0d);
        C10353 c10355 = new C10353(0.0d, d14);
        C10353 c10353M40391 = m40391(c10354, d);
        C10353 c10353M40392 = m40391(c10355, d);
        c10353M40391.f28665 += c10353.f28665;
        c10353M40391.f28666 += c10353.f28666;
        c10353M40392.f28665 += c10353.f28665;
        c10353M40392.f28666 += c10353.f28666;
        double dHypot = ((double) (f3 * f4)) / Math.hypot(d14 * Math.cos(0.7853981633974483d), Math.sin(0.7853981633974483d) * d12);
        C10353 c10353M40393 = m40391(new C10353(Math.cos(0.7853981633974483d) * dHypot, Math.sin(0.7853981633974483d) * dHypot), d);
        c10353M40393.f28665 += c10353.f28665;
        c10353M40393.f28666 += c10353.f28666;
        C10353 c10356 = (C10353) c2976.m4942(c10353M40393);
        C10353 c10357 = (C10353) c2976.m4942(c10353M40391);
        C10353 c10358 = (C10353) c2976.m4942(c10353M40392);
        C10353 c10359 = (C10353) c2976.m4942(c10353);
        double d17 = c10359.f28665;
        double d18 = c10359.f28666;
        double d19 = c10356.f28665;
        double d20 = d19 - d17;
        double d21 = c10356.f28666;
        double d22 = d21 - d18;
        double d23 = c10357.f28665;
        double d24 = d23 - d17;
        double d25 = c10357.f28666;
        double d26 = d25 - d18;
        double d27 = c10358.f28665;
        double d28 = d27 - d17;
        double d29 = c10358.f28666;
        double d30 = d29 - d18;
        double d31 = c10353M40391.f28665;
        double d32 = c10353M40393.f28665;
        double d33 = c10353M40391.f28666;
        double d34 = c10353M40393.f28666;
        this.f53119 = (((d29 - d21) * (d23 - d19)) - ((d25 - d21) * (d27 - d19))) * (((c10353M40392.f28666 - d34) * (d31 - d32)) - ((d33 - d34) * (c10353M40392.f28665 - d32))) < 0.0d;
        double d35 = d20 * d20;
        double d36 = d20 * d22;
        double d37 = d22 * d22;
        double d38 = d24 * d24;
        double d39 = d24 * d26;
        double d40 = d26 * d26;
        double d41 = d28 * d28;
        double d42 = d28 * d30;
        double d43 = d30 * d30;
        double d44 = d36 * d40;
        double d45 = d37 * d38;
        double d46 = d35 * d40;
        double d47 = d36 * d38;
        double d48 = d35 * d39;
        double d49 = -(((d47 * d43) + ((d46 * d42) + ((((d37 * d39) * d41) - (d44 * d41)) - (d45 * d42)))) - (d48 * d43));
        if (d49 != 0.0d) {
            double dM14667 = C6406.m14667(d39, d43, (((d37 * d42) + (((-d37) * d39) + d44)) - (d40 * d42)) - (d36 * d43), d49);
            double d50 = (((d35 * d43) + ((d40 * d41) + ((d45 - d46) - (d37 * d41)))) - (d43 * d38)) / d49;
            double d51 = (((d35 * d42) + ((d39 * d41) + ((d47 - d48) - (d36 * d41)))) - (d38 * d42)) / (-d49);
            double d52 = dM14667 - d51;
            if (d52 == 0.0d) {
                float fHypot = (float) Math.hypot(d24, d26);
                this.f53121 = fHypot;
                this.f53120 = fHypot;
                this.f53122 = 0.0f;
                return;
            }
            double dAtan = Math.atan(d50 / d52);
            double d53 = dAtan / 2.0d;
            if (Math.sin(dAtan) == 0.0d) {
                this.f53121 = (float) Math.sqrt(1.0d / d51);
                this.f53120 = (float) Math.sqrt(1.0d / dM14667);
                this.f53122 = 0.0f;
                return;
            }
            double d54 = dM14667 + d51;
            double dSin2 = ((d50 / Math.sin(dAtan)) + d54) / 2.0d;
            double d55 = d54 - dSin2;
            if (dSin2 != 0.0d && d55 != 0.0d) {
                this.f53121 = (float) Math.sqrt(1.0d / dSin2);
                this.f53120 = (float) Math.sqrt(1.0d / d55);
                this.f53122 = (float) Math.toDegrees(d53 + 1.5707963267948966d);
                return;
            }
        }
        Logger.getLogger("EllipseSolver").log(Level.WARNING, "Early return in the ellipse transformation computation!");
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m40393() {
        return this.f53120;
    }

    /* JADX INFO: renamed from: ܽ */
    public final float m40394() {
        return this.f53121;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final float m40395() {
        return this.f53122;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m40392() {
        return this.f53119;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10353 m40391(C10353 c10353, double d) {
        double dCos = Math.cos(d);
        double dSin = Math.sin(d);
        double d2 = c10353.f28665;
        double d3 = c10353.f28666;
        return new C10353((d2 * dCos) - (d3 * dSin), (d3 * dCos) + (d2 * dSin));
    }
}
