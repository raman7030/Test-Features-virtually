package p067l;

/* JADX INFO: renamed from: l.۫۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14166 {

    /* JADX INFO: renamed from: c */
    public static final C14166 f40405c = new C14166();

    /* JADX INFO: renamed from: a */
    public final boolean f40406a;

    /* JADX INFO: renamed from: b */
    public final long f40407b;

    public C14166() {
        this.f40406a = false;
        this.f40407b = 0L;
    }

    public C14166(long j) {
        this.f40406a = true;
        this.f40407b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14166)) {
            return false;
        }
        C14166 c14166 = (C14166) obj;
        boolean z = c14166.f40406a;
        boolean z2 = this.f40406a;
        if (z2 && z) {
            return this.f40407b == c14166.f40407b;
        }
        return z2 == z;
    }

    public final int hashCode() {
        if (!this.f40406a) {
            return 0;
        }
        long j = this.f40407b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        if (!this.f40406a) {
            return "OptionalLong.empty";
        }
        return "OptionalLong[" + this.f40407b + "]";
    }
}
