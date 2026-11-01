package p067l;

import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.ۜ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G8OG */
/* JADX INFO: loaded from: classes2.dex */
public final class C8454 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C8454 f22684 = new C8454(0, 0);

    /* JADX INFO: renamed from: ֫ */
    public final int f22685;

    /* JADX INFO: renamed from: ۧ */
    public final float f22686;

    /* JADX INFO: renamed from: ܽ */
    public final int f22687;

    static {
        C5792.m13032(0);
        C5792.m13032(1);
        C5792.m13032(3);
    }

    public C8454(int i, int i2) {
        this(i, i2, 1.0f);
    }

    public C8454(int i, int i2, float f) {
        this.f22687 = i;
        this.f22685 = i2;
        this.f22686 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8454) {
            C8454 c8454 = (C8454) obj;
            if (this.f22687 == c8454.f22687 && this.f22685 == c8454.f22685 && this.f22686 == c8454.f22686) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f22686) + ((((this.f22687 + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31) + this.f22685) * 31);
    }
}
