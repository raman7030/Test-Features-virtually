package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۬ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6SN */
/* JADX INFO: loaded from: classes3.dex */
public final class C13157 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final float f39326;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f39327;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f39328;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float f39329;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f39330;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f39331;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f39332;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f39333;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float f39334;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f39335;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f39336;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f39337;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f39338;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f39339;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f39340;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f39341;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Integer f39342;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f39343;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Integer f39344;

    public C13157(String str, String str2, int i, int i2, int i3, float f, float f2, float f3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Integer num, Integer num2) {
        this.f39332 = str;
        this.f39330 = str2;
        this.f39340 = i;
        this.f39341 = i2;
        this.f39327 = i3;
        this.f39326 = f;
        this.f39343 = z;
        this.f39334 = f2;
        this.f39329 = f3;
        this.f39338 = z2;
        this.f39339 = z3;
        this.f39333 = z4;
        this.f39337 = z5;
        this.f39336 = z6;
        this.f39335 = z7;
        this.f39331 = z8;
        this.f39328 = z9;
        this.f39342 = num;
        this.f39344 = num2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13157 m31884(ByteArrayInputStream byteArrayInputStream, long j, int i) throws IOException {
        Integer num;
        Integer num2;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        C23930 c23930M52696 = C23930.m52696(j, byteArrayInputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy text config exceeds app state limit");
            }
            String strM52708 = c23930M52696.m52708(i);
            boolean zM52703 = c23930M52696.m52703();
            byte b = (byte) c23930M52696.readByte();
            float fIntBitsToFloat = Float.intBitsToFloat(c23930M52696.readInt());
            int iM52704 = c23930M52696.m52704();
            boolean zM52704 = c23930M52696.m52703();
            boolean zM52705 = c23930M52696.m52703();
            boolean zM52706 = c23930M52696.m52703();
            boolean zM52707 = c23930M52696.m52703();
            boolean zM52708 = c23930M52696.m52703();
            Integer numValueOf = null;
            String strM52709 = zM52708 ? c23930M52696.m52708(i) : null;
            int i2 = c23930M52696.m52707() == 0 ? 0 : c23930M52696.readInt();
            if (i2 < 591749667) {
                c23930M52696.m52706();
                num = null;
                num2 = null;
                f = 1.0f;
                f2 = 0.0f;
                z = false;
                z2 = false;
                z3 = false;
            } else {
                if (i2 > 591749672) {
                    throw new IOException("Unsupported legacy text config version");
                }
                boolean zM52709 = c23930M52696.m52703();
                boolean zM527010 = i2 >= 591749669 ? c23930M52696.m52703() : false;
                boolean zM527011 = i2 >= 591749668 ? c23930M52696.m52703() : false;
                Integer numValueOf2 = (i2 < 591749670 || !c23930M52696.m52703()) ? null : Integer.valueOf(c23930M52696.readInt());
                if (i2 >= 591749671 && c23930M52696.m52703()) {
                    numValueOf = Integer.valueOf(c23930M52696.readInt());
                }
                if (i2 >= 591749672) {
                    float fIntBitsToFloat2 = Float.intBitsToFloat(c23930M52696.readInt());
                    float fIntBitsToFloat3 = Float.intBitsToFloat(c23930M52696.readInt());
                    if (fIntBitsToFloat2 < 0.8f || fIntBitsToFloat2 > 2.0f || fIntBitsToFloat3 < 0.0f || fIntBitsToFloat3 >= Float.POSITIVE_INFINITY) {
                        throw new IOException("Invalid line metrics");
                    }
                    num2 = numValueOf;
                    z3 = zM527011;
                    z = zM52709;
                    z2 = zM527010;
                    num = numValueOf2;
                    f2 = fIntBitsToFloat3;
                    f = fIntBitsToFloat2;
                } else {
                    num2 = numValueOf;
                    z3 = zM527011;
                    z = zM52709;
                    z2 = zM527010;
                    num = numValueOf2;
                    f = 1.0f;
                    f2 = 0.0f;
                }
            }
            c23930M52696.m52709();
            C13157 c13157 = new C13157(strM52708, strM52709, b, iM52704, i2, fIntBitsToFloat, f, f2, zM52703, zM52704, zM52705, zM52706, zM52707, zM52708, z, z2, z3, num, num2);
            c23930M52696.close();
            return c13157;
        } catch (Throwable th) {
            try {
                c23930M52696.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31885(C22686 c22686) {
        c22686.f73293 = this.f39332;
        c22686.f73263 = this.f39343;
        c22686.m50684(this.f39326, this.f39340);
        c22686.m24478(this.f39341);
        c22686.mo24477(this.f39334);
        c22686.m24479(this.f39338);
        c22686.m24490(this.f39339);
        c22686.f73227 = this.f39333;
        c22686.f73272 = this.f39337;
        boolean z = this.f39336;
        c22686.f73267 = z;
        if (z) {
            c22686.f73297 = this.f39330;
        }
        int i = this.f39327;
        if (i < 591749667) {
            return;
        }
        c22686.m24494(this.f39335);
        if (i >= 591749669) {
            c22686.m24497(this.f39331);
        }
        if (i >= 591749668) {
            c22686.f73261 = this.f39328;
        }
        c22686.m50688(this.f39342);
        c22686.m50685(this.f39344);
    }
}
