package p067l;

import android.graphics.Color;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V2SC */
/* JADX INFO: loaded from: classes2.dex */
public final class C8008 {

    /* JADX INFO: renamed from: ֫ */
    public final int f21061;

    /* JADX INFO: renamed from: ۜ */
    public final int f21062;

    /* JADX INFO: renamed from: ۧ */
    public int f21063;

    /* JADX INFO: renamed from: ܳ */
    public final int f21064;

    /* JADX INFO: renamed from: ܽ */
    public boolean f21065;

    /* JADX INFO: renamed from: ܿ */
    public float[] f21066;

    /* JADX INFO: renamed from: ᩳ */
    public final int f21067;

    /* JADX INFO: renamed from: ᩷ */
    public int f21068;

    /* JADX INFO: renamed from: ᩻ */
    public final int f21069;

    public C8008(int i, int i2) {
        this.f21069 = Color.red(i);
        this.f21067 = Color.green(i);
        this.f21061 = Color.blue(i);
        this.f21062 = i;
        this.f21064 = i2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m18588() {
        return this.f21062;
    }

    /* JADX INFO: renamed from: ֫ */
    public final float[] m18586() {
        if (this.f21066 == null) {
            this.f21066 = new float[3];
        }
        C1199.m21218(this.f21069, this.f21067, this.f21061, this.f21066);
        return this.f21066;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m18587() {
        return this.f21064;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m18585() {
        int iM21223;
        int iM21224;
        if (this.f21065) {
            return;
        }
        int i = this.f21062;
        int iM21213 = C1199.m21213(-1, 4.5f, i);
        int iM21214 = C1199.m21213(-1, 3.0f, i);
        if (iM21213 != -1 && iM21214 != -1) {
            this.f21063 = C1199.m21223(-1, iM21213);
            this.f21068 = C1199.m21223(-1, iM21214);
            this.f21065 = true;
            return;
        }
        int iM21215 = C1199.m21213(-16777216, 4.5f, i);
        int iM21216 = C1199.m21213(-16777216, 3.0f, i);
        if (iM21215 != -1 && iM21216 != -1) {
            this.f21063 = C1199.m21223(-16777216, iM21215);
            this.f21068 = C1199.m21223(-16777216, iM21216);
            this.f21065 = true;
            return;
        }
        if (iM21213 != -1) {
            iM21223 = C1199.m21223(-1, iM21213);
        } else {
            iM21223 = C1199.m21223(-16777216, iM21215);
        }
        this.f21063 = iM21223;
        if (iM21214 != -1) {
            iM21224 = C1199.m21223(-1, iM21214);
        } else {
            iM21224 = C1199.m21223(-16777216, iM21216);
        }
        this.f21068 = iM21224;
        this.f21065 = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C8008.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.f21062));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(m18586()));
        sb.append("] [Population: ");
        sb.append(this.f21064);
        sb.append("] [Title Text: #");
        m18585();
        sb.append(Integer.toHexString(this.f21068));
        sb.append("] [Body Text: #");
        m18585();
        sb.append(Integer.toHexString(this.f21063));
        sb.append(']');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8008.class == obj.getClass()) {
            C8008 c8008 = (C8008) obj;
            if (this.f21064 == c8008.f21064 && this.f21062 == c8008.f21062) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f21062 * 31) + this.f21064;
    }
}
