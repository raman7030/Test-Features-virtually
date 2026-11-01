package p067l;

import android.graphics.drawable.Drawable;
import com.google.android.material.motion.MotionUtils;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.ۘܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 316P */
/* JADX INFO: loaded from: classes2.dex */
public final class C6190 {

    /* JADX INFO: renamed from: ֫ */
    public final Drawable f15571;

    /* JADX INFO: renamed from: ۜ */
    public final int f15572;

    /* JADX INFO: renamed from: ۢ */
    public final String f15573;

    /* JADX INFO: renamed from: ۧ */
    public final int f15574;

    /* JADX INFO: renamed from: ܳ */
    public final String f15575;

    /* JADX INFO: renamed from: ܽ */
    public final String f15576;

    /* JADX INFO: renamed from: ܿ */
    public final int f15577;

    /* JADX INFO: renamed from: ᩳ */
    public final long f15578;

    /* JADX INFO: renamed from: ᩷ */
    public final long f15579;

    /* JADX INFO: renamed from: ᩻ */
    public final Drawable f15580;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6190)) {
            return false;
        }
        C6190 c6190 = (C6190) obj;
        return C13045.m29864((Object) this.f15575, (Object) c6190.f15575) && C13045.m29864((Object) this.f15576, (Object) c6190.f15576) && C13045.m29864((Object) this.f15573, (Object) c6190.f15573) && this.f15579 == c6190.f15579 && this.f15578 == c6190.f15578 && this.f15572 == c6190.f15572 && this.f15577 == c6190.f15577 && C13045.m29864(this.f15571, c6190.f15571) && C13045.m29864(this.f15580, c6190.f15580) && this.f15574 == c6190.f15574;
    }

    public final String toString() {
        StringBuilder sbM12525 = C5633.m12525("ApkInfo(packageName=", this.f15575, ", label=", this.f15576, ", versionName=");
        sbM12525.append(this.f15573);
        sbM12525.append(", versionCode=");
        sbM12525.append(this.f15579);
        sbM12525.append(", length=");
        sbM12525.append(this.f15578);
        sbM12525.append(", targetSdk=");
        C7913.m18269(sbM12525, this.f15572, ", minimumSdk=", this.f15577, ", icon=");
        sbM12525.append(this.f15571);
        sbM12525.append(", rawIcon=");
        sbM12525.append(this.f15580);
        sbM12525.append(", iconRes=");
        return C5410.m11876(this.f15574, MotionUtils.EASING_TYPE_FORMAT_END, sbM12525);
    }

    public final int hashCode() {
        int iM29411 = C12832.m29411(C12832.m29411(this.f15575.hashCode() * 31, 31, this.f15576), 31, this.f15573);
        long j = this.f15579;
        int i = (iM29411 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f15578;
        return ((this.f15580.hashCode() + ((this.f15571.hashCode() + ((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f15572) * 31) + this.f15577) * 31)) * 31)) * 31) + this.f15574;
    }

    public C6190(String str, String str2, String str3, long j, long j2, int i, int i2, Drawable drawable, Drawable drawable2, int i3) {
        C13045.m29867(str2, AnnotatedPrivateKey.LABEL);
        this.f15575 = str;
        this.f15576 = str2;
        this.f15573 = str3;
        this.f15579 = j;
        this.f15578 = j2;
        this.f15572 = i;
        this.f15577 = i2;
        this.f15571 = drawable;
        this.f15580 = drawable2;
        this.f15574 = i3;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m14014() {
        return this.f15575;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m14015() {
        return this.f15576;
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m14012() {
        return this.f15573;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final long m14018() {
        return this.f15579;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m14017() {
        return this.f15578;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m14011() {
        return this.f15572;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m14016() {
        return this.f15577;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Drawable m14010() {
        return this.f15571;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final Drawable m14019() {
        return this.f15580;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m14013() {
        return this.f15574;
    }
}
