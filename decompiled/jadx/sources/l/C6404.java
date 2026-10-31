package l;

import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.ۜ֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: G8OG */
/* JADX INFO: loaded from: classes2.dex */
public final class C6404 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C6404 f19812 = new C6404(0, 0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f19813;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float f19814;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f19815;

    static {
        C3603.m11056(0);
        C3603.m11056(1);
        C3603.m11056(3);
    }

    public C6404(int i, int i2) {
        this(i, i2, 1.0f);
    }

    public C6404(int i, int i2, float f) {
        this.f19815 = i;
        this.f19813 = i2;
        this.f19814 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6404) {
            C6404 c6404 = (C6404) obj;
            if (this.f19815 == c6404.f19815 && this.f19813 == c6404.f19813 && this.f19814 == c6404.f19814) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f19814) + ((((this.f19815 + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31) + this.f19813) * 31);
    }
}
