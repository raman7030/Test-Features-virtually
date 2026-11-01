package p067l;

/* JADX INFO: renamed from: l.ۙۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7O7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6739 {

    /* JADX INFO: renamed from: ֫ */
    public final C15444 f17491;

    /* JADX INFO: renamed from: ۧ */
    public final String f17492;

    /* JADX INFO: renamed from: ֫ */
    public static C6739 m15398(int i, int i2, String str) {
        C6194.m14029("startPosition must be non-negative", i >= 0);
        C6194.m14029("startPosition cannot be after endPosition", i <= i2);
        return new C6739(C15444.m35182(Integer.valueOf(i), Integer.valueOf(i2)), str);
    }

    public C6739(C15444 c15444, String str) {
        this.f17491 = c15444;
        C6194.m14026(str, "Null replacementString");
        this.f17492 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15444 m15399() {
        return this.f17491;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m15400() {
        return this.f17492;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6739) {
            C6739 c6739 = (C6739) obj;
            if (this.f17491.equals(c6739.f17491) && this.f17492.equals(c6739.f17492)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hash(this.f17491, this.f17492);
    }
}
