package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: UAS0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13643 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13163 f40683;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f40684;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C13643[] f40685;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f40686;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f40687;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C22816[] f40688;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C19787 f40689;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f40690;

    public C13643() {
        this.f40684 = -1;
        this.f40683 = new C13163();
        this.f40687 = false;
    }

    public C13643(C13163 c13163) {
        this.f40684 = -1;
        new C13163();
        this.f40687 = false;
        this.f40683 = c13163;
    }

    public final int hashCode() {
        return C2093.m6873(C2093.m6876(7, this.f40683.hashCode()), 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13643) {
            return this.f40683.equals(((C13643) obj).f40683);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f40684);
        sb.append(":");
        sb.append(this.f40683);
        if (this.f40687) {
            sb.append("=>");
            C22816[] c22816Arr = this.f40688;
            if (c22816Arr != null) {
                sb.append(Arrays.toString(c22816Arr));
            } else {
                sb.append(this.f40686);
            }
        }
        return sb.toString();
    }
}
