package l;

/* JADX INFO: renamed from: l.ۙۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7O7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4599 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13758 f14663;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f14664;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4599 m13509(int i, int i2, String str) {
        C4025.m12109("startPosition must be non-negative", i >= 0);
        C4025.m12109("startPosition cannot be after endPosition", i <= i2);
        return new C4599(C13758.m33067(Integer.valueOf(i), Integer.valueOf(i2)), str);
    }

    public C4599(C13758 c13758, String str) {
        this.f14663 = c13758;
        C4025.m12106(str, "Null replacementString");
        this.f14664 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13758 m13510() {
        return this.f14663;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m13511() {
        return this.f14664;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4599) {
            C4599 c4599 = (C4599) obj;
            if (this.f14663.equals(c4599.f14663) && this.f14664.equals(c4599.f14664)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hash(this.f14663, this.f14664);
    }
}
