package p067l;

/* JADX INFO: renamed from: l.᩷᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes4.dex */
public final class C22408 {

    /* JADX INFO: renamed from: ֫ */
    public final int f70686;

    /* JADX INFO: renamed from: ۧ */
    public final int f70687;

    public C22408(int i, int i2) {
        this.f70686 = i;
        this.f70687 = i2;
    }

    public final String toString() {
        return this.f70686 + ":" + this.f70687;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22408)) {
            return false;
        }
        C22408 c22408 = (C22408) obj;
        return this.f70686 == c22408.f70686 && this.f70687 == c22408.f70687;
    }

    public final int hashCode() {
        return (this.f70686 * 31) + this.f70687;
    }
}
