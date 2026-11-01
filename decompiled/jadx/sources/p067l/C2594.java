package p067l;

/* JADX INFO: renamed from: l.֡ۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2594 extends AbstractC7289 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f4289;

    /* JADX INFO: renamed from: ۧ */
    public final int f4290;

    /* JADX INFO: renamed from: ܽ */
    public final int f4291;

    public C2594(int i, int i2, boolean z) {
        this.f4291 = i;
        this.f4290 = i2;
        this.f4289 = z;
    }

    @Override // p067l.AbstractC7289
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3894(AbstractC20244 abstractC20244, C20915 c20915) {
        if (!this.f4289) {
            c20915 = null;
        }
        return abstractC20244.mo3736(c20915, this.f4291, this.f4290);
    }

    public final int hashCode() {
        return C4358.m8999(C4358.m9002(C4358.m9002(C4358.m9002(0, this.f4291), this.f4290), this.f4289 ? 1 : 0), 3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2594)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C2594 c2594 = (C2594) obj;
        return this.f4291 == c2594.f4291 && this.f4290 == c2594.f4290 && this.f4289 == c2594.f4289;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.f4291);
        sb.append(":");
        return C5410.m11876(this.f4290, "}?", sb);
    }
}
