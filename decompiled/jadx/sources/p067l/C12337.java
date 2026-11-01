package p067l;

/* JADX INFO: renamed from: l.ۤ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 18YS */
/* JADX INFO: loaded from: classes3.dex */
public final class C12337 {

    /* JADX INFO: renamed from: ֫ */
    public int f34427;

    /* JADX INFO: renamed from: ۧ */
    public char f34428;

    public C12337(char c, int i) {
        this.f34428 = c;
        this.f34427 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12337)) {
            return false;
        }
        C12337 c12337 = (C12337) obj;
        return this.f34428 == c12337.f34428 && this.f34427 == c12337.f34427;
    }

    public final int hashCode() {
        return C12826.hash(Character.valueOf(this.f34428), Integer.valueOf(this.f34427));
    }
}
