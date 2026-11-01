package p067l;

import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p030j0.C0155a;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۨܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C60Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C13533 implements Cloneable {

    /* JADX INFO: renamed from: ۙ */
    public boolean f38060;

    /* JADX INFO: renamed from: ᩶ */
    public int f38061;

    /* JADX INFO: renamed from: ᩸ */
    public int f38062;

    /* JADX INFO: renamed from: ᩹ */
    public int f38063;

    public C13533() {
    }

    public C13533(int i, int i2, int i3) {
        m30799(i, i2, i3);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30799(int i, int i2, int i3) {
        this.f38061 = i;
        this.f38062 = i2;
        this.f38063 = i3;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m30803() {
        return this.f38060;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30801(boolean z) {
        this.f38060 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30800(C9729 c9729) {
        int i = this.f38061;
        int i2 = this.f38062;
        int i3 = i2 - i;
        boolean z = false;
        if (i3 > 300000) {
            if (i3 > 350000) {
                z = true;
                break;
            }
            int i4 = 0;
            while (i < i2) {
                char cCharAt = c9729.charAt(i);
                if (cCharAt > 127 && ((19968 > cCharAt || cCharAt > 40869) && !C15517.m35316(cCharAt) && (i4 = i4 + 1) > 75000)) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.f38060 = z;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m30802() {
        return this.f38060 && this.f38062 - this.f38061 > 300000;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m30798() {
        return m30802() ? this.f38061 + C0155a.f509a : this.f38062;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m30797(CharSequence charSequence, C11477 c11477) {
        if (!m30802()) {
            return c11477.m26499(charSequence, this.f38061, this.f38062, 0.0f);
        }
        String strM16224 = C7050.m16224(R.string.MT_Protector);
        int i = this.f38061;
        return c11477.f32005.measureText(strM16224) + c11477.m26499(charSequence, i, C0155a.f509a + i, 0.0f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Line(");
        sb.append(this.f38061);
        sb.append(", ");
        sb.append(this.f38062);
        sb.append(", ");
        return C5410.m11876(this.f38063, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }

    public final C13533 clone() {
        try {
            return (C13533) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
