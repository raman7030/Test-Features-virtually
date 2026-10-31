package l;

/* JADX INFO: renamed from: l.۟֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C7113 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f21821;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f21822;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f21823;

    public C7113(int i, int i2, int i3) {
        this.f21823 = i;
        this.f21822 = i2;
        this.f21821 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m19131() {
        return this.f21823;
    }

    public final String toString() {
        return this.f21822 + "," + this.f21821 + ":" + this.f21823;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7113.class == obj.getClass()) {
            C7113 c7113 = (C7113) obj;
            if (this.f21823 == c7113.f21823 && this.f21822 == c7113.f21822 && this.f21821 == c7113.f21821) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f21823 * 31) + this.f21822) * 31) + this.f21821;
    }
}
