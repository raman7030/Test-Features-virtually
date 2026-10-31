package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.֡ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YS */
/* JADX INFO: loaded from: classes2.dex */
public final class C0487 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f2095;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C0487 f2096;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f2097;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C7338 f2098;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashSet f2099 = null;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f2100;

    public C0487(String str) {
        this.f2097 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2149(C0487 c0487) {
        if (this.f2099 == null) {
            this.f2099 = new HashSet();
        }
        this.f2099.add(c0487);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0487.class != obj.getClass()) {
            return false;
        }
        String str = ((C0487) obj).f2097;
        String str2 = this.f2097;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f2097;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final String toString() {
        return "" + this.f2097;
    }
}
