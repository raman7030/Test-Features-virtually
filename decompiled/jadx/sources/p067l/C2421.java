package p067l;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: renamed from: l.֡֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1HV */
/* JADX INFO: loaded from: classes2.dex */
public final class C2421 implements Cloneable {

    /* JADX INFO: renamed from: ᩹ */
    public EnumC6446 f3715;

    /* JADX INFO: renamed from: ۙ */
    public EnumC5105 f3709 = EnumC5105.base;

    /* JADX INFO: renamed from: ᩸ */
    public Charset f3714 = C19186.f57350;

    /* JADX INFO: renamed from: ᩶ */
    public final ThreadLocal f3713 = new ThreadLocal();

    /* JADX INFO: renamed from: ۫ */
    public boolean f3711 = true;

    /* JADX INFO: renamed from: ۗ */
    public int f3708 = 1;

    /* JADX INFO: renamed from: ۬ */
    public int f3712 = 30;

    /* JADX INFO: renamed from: ۤ */
    public EnumC20528 f3710 = EnumC20528.html;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC5105 m3376() {
        return this.f3709;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3371(EnumC5105 enumC5105) {
        this.f3709 = enumC5105;
    }

    /* JADX INFO: renamed from: ܳ */
    public final CharsetEncoder m3375() {
        CharsetEncoder charsetEncoderNewEncoder = this.f3714.newEncoder();
        this.f3713.set(charsetEncoderNewEncoder);
        this.f3715 = EnumC6446.m14736(charsetEncoderNewEncoder.charset().name());
        return charsetEncoderNewEncoder;
    }

    /* JADX INFO: renamed from: ֫ */
    public final CharsetEncoder m3370() {
        CharsetEncoder charsetEncoder = (CharsetEncoder) this.f3713.get();
        return charsetEncoder != null ? charsetEncoder : m3375();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final EnumC20528 m3379() {
        return this.f3710;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3372(EnumC20528 enumC20528) {
        this.f3710 = enumC20528;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m3374() {
        return this.f3711;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m3373() {
        this.f3711 = false;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m3378() {
        return this.f3708;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m3377() {
        return this.f3712;
    }

    public final C2421 clone() {
        try {
            C2421 c2421 = (C2421) super.clone();
            String strName = this.f3714.name();
            c2421.getClass();
            c2421.f3714 = Charset.forName(strName);
            c2421.f3709 = EnumC5105.valueOf(this.f3709.name());
            return c2421;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
