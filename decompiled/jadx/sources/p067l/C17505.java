package p067l;

/* JADX INFO: renamed from: l.ܺ۫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X8TF */
/* JADX INFO: loaded from: classes4.dex */
public final class C17505 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C17505 f52339 = new C10801().m24895();

    /* JADX INFO: renamed from: ֫ */
    public final boolean f52340;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f52341;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f52342;

    public C17505(C10801 c10801) {
        this.f52340 = c10801.f29935;
        this.f52341 = c10801.f29936;
        this.f52342 = c10801.f29937;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17505.class == obj.getClass()) {
            C17505 c17505 = (C17505) obj;
            if (this.f52340 == c17505.f52340 && this.f52341 == c17505.f52341 && this.f52342 == c17505.f52342) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f52340 ? 1 : 0) << 2) + ((this.f52341 ? 1 : 0) << 1) + (this.f52342 ? 1 : 0);
    }
}
