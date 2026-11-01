package p067l;

/* JADX INFO: renamed from: l.֨ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7Q5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3386 {

    /* JADX INFO: renamed from: ֫ */
    public final int f6692;

    /* JADX INFO: renamed from: ۧ */
    public final int f6693;

    /* JADX INFO: renamed from: ܽ */
    public final String f6694;

    public final String toString() {
        return C6988.m16053("Comment: '", this.f6694, "'");
    }

    public C3386(int i, int i2, String str) {
        this.f6693 = i;
        this.f6692 = i2;
        this.f6694 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m5911() {
        int i = this.f6692;
        int i2 = this.f6693;
        C6194.m14028("Expected %s in the range [0, %s)", 0, i - i2, i - i2 > 0);
        return i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m5912() {
        return this.f6694;
    }
}
