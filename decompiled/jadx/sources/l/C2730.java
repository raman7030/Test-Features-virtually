package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۖ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8MB */
/* JADX INFO: loaded from: classes2.dex */
public final class C2730 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C2730 f8507 = new C2730(1.0f);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float f8508;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f8509;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float f8510;

    static {
        C3603.m11056(0);
        C3603.m11056(1);
    }

    public C2730(float f) {
        this(f, 1.0f);
    }

    public C2730(float f, float f2) {
        C22632.m50631(f > 0.0f);
        C22632.m50631(f2 > 0.0f);
        this.f8510 = f;
        this.f8508 = f2;
        this.f8509 = Math.round(f * 1000.0f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m8465(long j) {
        return j * ((long) this.f8509);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2730.class == obj.getClass()) {
            C2730 c2730 = (C2730) obj;
            if (this.f8510 == c2730.f8510 && this.f8508 == c2730.f8508) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f8508) + ((Float.floatToRawIntBits(this.f8510) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f8510), Float.valueOf(this.f8508)};
        String str = C3603.f11424;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
