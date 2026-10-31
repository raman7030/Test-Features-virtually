package l;

/* JADX INFO: renamed from: l.۫۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12413 {
    public static final C12413 c = new C12413();
    public final boolean a;
    public final long b;

    public C12413() {
        this.a = false;
        this.b = 0L;
    }

    public C12413(long j) {
        this.a = true;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12413)) {
            return false;
        }
        C12413 c12413 = (C12413) obj;
        boolean z = c12413.a;
        boolean z2 = this.a;
        if (z2 && z) {
            return this.b == c12413.b;
        }
        return z2 == z;
    }

    public final int hashCode() {
        if (!this.a) {
            return 0;
        }
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        if (!this.a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.b + "]";
    }
}
