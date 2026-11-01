package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۖ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8MB */
/* JADX INFO: loaded from: classes2.dex */
public final class C4963 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C4963 f11302 = new C4963(1.0f);

    /* JADX INFO: renamed from: ֫ */
    public final float f11303;

    /* JADX INFO: renamed from: ۧ */
    public final int f11304;

    /* JADX INFO: renamed from: ܽ */
    public final float f11305;

    static {
        C5792.m13032(0);
        C5792.m13032(1);
    }

    public C4963(float f) {
        this(f, 1.0f);
    }

    public C4963(float f, float f2) {
        C23877.m52957(f > 0.0f);
        C23877.m52957(f2 > 0.0f);
        this.f11305 = f;
        this.f11303 = f2;
        this.f11304 = Math.round(f * 1000.0f);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m10512(long j) {
        return j * ((long) this.f11304);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4963.class == obj.getClass()) {
            C4963 c4963 = (C4963) obj;
            if (this.f11305 == c4963.f11305 && this.f11303 == c4963.f11303) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f11303) + ((Float.floatToRawIntBits(this.f11305) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f11305), Float.valueOf(this.f11303)};
        String str = C5792.f14228;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
