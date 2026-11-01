package p067l;

/* JADX INFO: renamed from: l.۬ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes3.dex */
public final class C14965 implements Comparable {

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC22097 f42746;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC6919 f42747;

    /* JADX INFO: renamed from: ᩹ */
    public final int f42748;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f42748 - ((C14965) obj).f42748;
    }

    public C14965(InterfaceC22097 interfaceC22097, InterfaceC6919 interfaceC6919, int i) {
        this.f42746 = interfaceC22097;
        this.f42747 = interfaceC6919;
        this.f42748 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14965)) {
            return false;
        }
        C14965 c14965 = (C14965) obj;
        return this.f42746.equals(c14965.f42746) && this.f42747.equals(c14965.f42747) && this.f42748 == c14965.f42748;
    }

    public final int hashCode() {
        return C12826.hash(this.f42746, this.f42747, Integer.valueOf(this.f42748));
    }
}
