package p067l;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.۬ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6SN */
/* JADX INFO: loaded from: classes3.dex */
public final class C14873 {

    /* JADX INFO: renamed from: ֡ */
    public final float f42381;

    /* JADX INFO: renamed from: ֨ */
    public final int f42382;

    /* JADX INFO: renamed from: ֫ */
    public final boolean f42383;

    /* JADX INFO: renamed from: ۖ */
    public final float f42384;

    /* JADX INFO: renamed from: ۘ */
    public final String f42385;

    /* JADX INFO: renamed from: ۚ */
    public final boolean f42386;

    /* JADX INFO: renamed from: ۜ */
    public final String f42387;

    /* JADX INFO: renamed from: ۡ */
    public final boolean f42388;

    /* JADX INFO: renamed from: ۢ */
    public final float f42389;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f42390;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f42391;

    /* JADX INFO: renamed from: ܺ */
    public final boolean f42392;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f42393;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f42394;

    /* JADX INFO: renamed from: ᩳ */
    public final int f42395;

    /* JADX INFO: renamed from: ᩴ */
    public final int f42396;

    /* JADX INFO: renamed from: ᩵ */
    public final Integer f42397;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f42398;

    /* JADX INFO: renamed from: ᩻ */
    public final Integer f42399;

    public C14873(String str, String str2, int i, int i2, int i3, float f, float f2, float f3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Integer num, Integer num2) {
        this.f42387 = str;
        this.f42385 = str2;
        this.f42395 = i;
        this.f42396 = i2;
        this.f42382 = i3;
        this.f42381 = f;
        this.f42398 = z;
        this.f42389 = f2;
        this.f42384 = f3;
        this.f42393 = z2;
        this.f42394 = z3;
        this.f42388 = z4;
        this.f42392 = z5;
        this.f42391 = z6;
        this.f42390 = z7;
        this.f42386 = z8;
        this.f42383 = z9;
        this.f42397 = num;
        this.f42399 = num2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14873 m33977(ByteArrayInputStream byteArrayInputStream, long j, int i) throws IOException {
        Integer num;
        Integer num2;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        C25112 c25112M55102 = C25112.m55102(j, byteArrayInputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy text config exceeds app state limit");
            }
            String strM55114 = c25112M55102.m55114(i);
            boolean zM55109 = c25112M55102.m55109();
            byte b = (byte) c25112M55102.readByte();
            float fIntBitsToFloat = Float.intBitsToFloat(c25112M55102.readInt());
            int iM55110 = c25112M55102.m55110();
            boolean zM551010 = c25112M55102.m55109();
            boolean zM551011 = c25112M55102.m55109();
            boolean zM551012 = c25112M55102.m55109();
            boolean zM551013 = c25112M55102.m55109();
            boolean zM551014 = c25112M55102.m55109();
            Integer numValueOf = null;
            String strM55115 = zM551014 ? c25112M55102.m55114(i) : null;
            int i2 = c25112M55102.m55113() == 0 ? 0 : c25112M55102.readInt();
            if (i2 < 591749667) {
                c25112M55102.m55112();
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
                boolean zM551015 = c25112M55102.m55109();
                boolean zM551016 = i2 >= 591749669 ? c25112M55102.m55109() : false;
                boolean zM551017 = i2 >= 591749668 ? c25112M55102.m55109() : false;
                Integer numValueOf2 = (i2 < 591749670 || !c25112M55102.m55109()) ? null : Integer.valueOf(c25112M55102.readInt());
                if (i2 >= 591749671 && c25112M55102.m55109()) {
                    numValueOf = Integer.valueOf(c25112M55102.readInt());
                }
                if (i2 >= 591749672) {
                    float fIntBitsToFloat2 = Float.intBitsToFloat(c25112M55102.readInt());
                    float fIntBitsToFloat3 = Float.intBitsToFloat(c25112M55102.readInt());
                    if (fIntBitsToFloat2 < 0.8f || fIntBitsToFloat2 > 2.0f || fIntBitsToFloat3 < 0.0f || fIntBitsToFloat3 >= Float.POSITIVE_INFINITY) {
                        throw new IOException("Invalid line metrics");
                    }
                    num2 = numValueOf;
                    z3 = zM551017;
                    z = zM551015;
                    z2 = zM551016;
                    num = numValueOf2;
                    f2 = fIntBitsToFloat3;
                    f = fIntBitsToFloat2;
                } else {
                    num2 = numValueOf;
                    z3 = zM551017;
                    z = zM551015;
                    z2 = zM551016;
                    num = numValueOf2;
                    f = 1.0f;
                    f2 = 0.0f;
                }
            }
            c25112M55102.m55115();
            C14873 c14873 = new C14873(strM55114, strM55115, b, iM55110, i2, fIntBitsToFloat, f, f2, zM55109, zM551010, zM551011, zM551012, zM551013, zM551014, z, z2, z3, num, num2);
            c25112M55102.close();
            return c14873;
        } catch (Throwable th) {
            try {
                c25112M55102.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33978(C23929 c23929) {
        c23929.f76018 = this.f42387;
        c23929.f75988 = this.f42398;
        c23929.m53010(this.f42381, this.f42395);
        c23929.m26490(this.f42396);
        c23929.mo26489(this.f42389);
        c23929.m26491(this.f42393);
        c23929.m26502(this.f42394);
        c23929.f75952 = this.f42388;
        c23929.f75997 = this.f42392;
        boolean z = this.f42391;
        c23929.f75992 = z;
        if (z) {
            c23929.f76022 = this.f42385;
        }
        int i = this.f42382;
        if (i < 591749667) {
            return;
        }
        c23929.m26506(this.f42390);
        if (i >= 591749669) {
            c23929.m26509(this.f42386);
        }
        if (i >= 591749668) {
            c23929.f75986 = this.f42383;
        }
        c23929.m53014(this.f42397);
        c23929.m53011(this.f42399);
    }
}
