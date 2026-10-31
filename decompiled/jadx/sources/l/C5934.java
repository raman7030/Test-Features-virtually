package l;

import android.graphics.Color;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V2SC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5934 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f18207;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f18208;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f18209;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f18210;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f18211;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float[] f18212;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f18213;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f18214;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f18215;

    public C5934(int i, int i2) {
        this.f18215 = Color.red(i);
        this.f18213 = Color.green(i);
        this.f18207 = Color.blue(i);
        this.f18208 = i;
        this.f18210 = i2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m16662() {
        return this.f18208;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float[] m16660() {
        if (this.f18212 == null) {
            this.f18212 = new float[3];
        }
        C7191.m19271(this.f18215, this.f18213, this.f18207, this.f18212);
        return this.f18212;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m16661() {
        return this.f18210;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m16659() {
        int iM19276;
        int iM19277;
        if (this.f18211) {
            return;
        }
        int i = this.f18208;
        int iM19266 = C7191.m19266(-1, 4.5f, i);
        int iM19267 = C7191.m19266(-1, 3.0f, i);
        if (iM19266 != -1 && iM19267 != -1) {
            this.f18209 = C7191.m19276(-1, iM19266);
            this.f18214 = C7191.m19276(-1, iM19267);
            this.f18211 = true;
            return;
        }
        int iM19268 = C7191.m19266(-16777216, 4.5f, i);
        int iM19269 = C7191.m19266(-16777216, 3.0f, i);
        if (iM19268 != -1 && iM19269 != -1) {
            this.f18209 = C7191.m19276(-16777216, iM19268);
            this.f18214 = C7191.m19276(-16777216, iM19269);
            this.f18211 = true;
            return;
        }
        if (iM19266 != -1) {
            iM19276 = C7191.m19276(-1, iM19266);
        } else {
            iM19276 = C7191.m19276(-16777216, iM19268);
        }
        this.f18209 = iM19276;
        if (iM19267 != -1) {
            iM19277 = C7191.m19276(-1, iM19267);
        } else {
            iM19277 = C7191.m19276(-16777216, iM19269);
        }
        this.f18214 = iM19277;
        this.f18211 = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C5934.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.f18208));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(m16660()));
        sb.append("] [Population: ");
        sb.append(this.f18210);
        sb.append("] [Title Text: #");
        m16659();
        sb.append(Integer.toHexString(this.f18214));
        sb.append("] [Body Text: #");
        m16659();
        sb.append(Integer.toHexString(this.f18209));
        sb.append(']');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5934.class == obj.getClass()) {
            C5934 c5934 = (C5934) obj;
            if (this.f18210 == c5934.f18210 && this.f18208 == c5934.f18208) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18208 * 31) + this.f18210;
    }
}
