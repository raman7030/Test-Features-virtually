package p067l;

/* JADX INFO: renamed from: l.ۨ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 461A */
/* JADX INFO: loaded from: classes3.dex */
public final class C13366 {

    /* JADX INFO: renamed from: ֫ */
    public int f37509;

    public C13366(int i) {
        this.f37509 = i;
    }

    public C13366() {
        this.f37509 = -1;
    }

    public final String toString() {
        int i = this.f37509;
        return i >= 0 ? String.format("L%04x", Integer.valueOf(i)) : String.format("L%08x", Integer.valueOf(hashCode()));
    }
}
