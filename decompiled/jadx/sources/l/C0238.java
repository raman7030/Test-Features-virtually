package l;

/* JADX INFO: renamed from: l.֡ۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: HAT6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0238 extends AbstractC5178 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f1511;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f1512;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f1513;

    public C0238(int i, int i2, boolean z) {
        this.f1513 = i;
        this.f1512 = i2;
        this.f1511 = z;
    }

    @Override // l.AbstractC5178
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo1496(AbstractC18809 abstractC18809, C19515 c19515) {
        if (!this.f1511) {
            c19515 = null;
        }
        return abstractC18809.mo1328(c19515, this.f1513, this.f1512);
    }

    public final int hashCode() {
        return C2093.m6873(C2093.m6876(C2093.m6876(C2093.m6876(0, this.f1513), this.f1512), this.f1511 ? 1 : 0), 3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0238)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0238 c0238 = (C0238) obj;
        return this.f1513 == c0238.f1513 && this.f1512 == c0238.f1512 && this.f1511 == c0238.f1511;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append(this.f1513);
        sb.append(":");
        return C3200.m9831(this.f1512, "}?", sb);
    }
}
