package l;

/* JADX INFO: renamed from: l.᩷᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes4.dex */
public final class C21085 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f68004;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f68005;

    public C21085(int i, int i2) {
        this.f68004 = i;
        this.f68005 = i2;
    }

    public final String toString() {
        return this.f68004 + ":" + this.f68005;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21085)) {
            return false;
        }
        C21085 c21085 = (C21085) obj;
        return this.f68004 == c21085.f68004 && this.f68005 == c21085.f68005;
    }

    public final int hashCode() {
        return (this.f68004 * 31) + this.f68005;
    }
}
