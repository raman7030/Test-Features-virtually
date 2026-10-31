package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3321 implements Serializable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f10404;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f10405;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f10406;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f10407;

    public C3321(int i, int i2, int i3, String str) {
        this.f10405 = i;
        this.f10404 = i2;
        this.f10406 = i3;
        this.f10407 = str;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m10172() {
        return this.f10405;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char m10168() {
        return C10881.m27176(this.f10405);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m10171() {
        return this.f10405 & 4095;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m10169() {
        return this.f10404;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m10167() {
        return this.f10406;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m10170() {
        return this.f10407;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtExtras{mode=");
        sb.append(this.f10405);
        sb.append(", uid=");
        sb.append(this.f10404);
        sb.append(", gid=");
        sb.append(this.f10406);
        sb.append(", link='");
        return C9045.m23341(sb, this.f10407, "'}");
    }
}
