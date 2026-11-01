package p067l;

/* JADX INFO: renamed from: l.ۧܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8S9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12938 {

    /* JADX INFO: renamed from: ֫ */
    public final int f36360;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f36361;

    public C12938(int i, boolean z) {
        this.f36360 = i;
        this.f36361 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12938.class != obj.getClass()) {
            return false;
        }
        C12938 c12938 = (C12938) obj;
        return this.f36360 == c12938.f36360 && this.f36361 == c12938.f36361;
    }

    public final int hashCode() {
        return (this.f36360 * 31) + (this.f36361 ? 1 : 0);
    }
}
