package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49SV */
/* JADX INFO: loaded from: classes2.dex */
public final class C5525 implements Serializable {

    /* JADX INFO: renamed from: ۙ */
    public int f13213;

    /* JADX INFO: renamed from: ᩶ */
    public int f13214;

    /* JADX INFO: renamed from: ᩸ */
    public int f13215;

    /* JADX INFO: renamed from: ᩹ */
    public String f13216;

    public C5525(int i, int i2, int i3, String str) {
        this.f13214 = i;
        this.f13213 = i2;
        this.f13215 = i3;
        this.f13216 = str;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m12208() {
        return this.f13214;
    }

    /* JADX INFO: renamed from: ۧ */
    public final char m12204() {
        return C12710.m29221(this.f13214);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m12207() {
        return this.f13214 & 4095;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m12205() {
        return this.f13213;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m12203() {
        return this.f13215;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m12206() {
        return this.f13216;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtExtras{mode=");
        sb.append(this.f13214);
        sb.append(", uid=");
        sb.append(this.f13213);
        sb.append(", gid=");
        sb.append(this.f13215);
        sb.append(", link='");
        return C10965.m25286(sb, this.f13216, "'}");
    }
}
