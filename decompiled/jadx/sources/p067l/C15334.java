package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: UAS0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15334 {

    /* JADX INFO: renamed from: ֫ */
    public C14878 f43764;

    /* JADX INFO: renamed from: ۜ */
    public int f43765;

    /* JADX INFO: renamed from: ۧ */
    public C15334[] f43766;

    /* JADX INFO: renamed from: ܳ */
    public int f43767;

    /* JADX INFO: renamed from: ܽ */
    public boolean f43768;

    /* JADX INFO: renamed from: ܿ */
    public C24052[] f43769;

    /* JADX INFO: renamed from: ᩳ */
    public C21174 f43770;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f43771;

    public C15334() {
        this.f43765 = -1;
        this.f43764 = new C14878();
        this.f43768 = false;
    }

    public C15334(C14878 c14878) {
        this.f43765 = -1;
        new C14878();
        this.f43768 = false;
        this.f43764 = c14878;
    }

    public final int hashCode() {
        return C4358.m8999(C4358.m9002(7, this.f43764.hashCode()), 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15334) {
            return this.f43764.equals(((C15334) obj).f43764);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f43765);
        sb.append(":");
        sb.append(this.f43764);
        if (this.f43768) {
            sb.append("=>");
            C24052[] c24052Arr = this.f43769;
            if (c24052Arr != null) {
                sb.append(Arrays.toString(c24052Arr));
            } else {
                sb.append(this.f43767);
            }
        }
        return sb.toString();
    }
}
