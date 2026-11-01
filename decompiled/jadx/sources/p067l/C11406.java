package p067l;

/* JADX INFO: renamed from: l.ۢۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970E */
/* JADX INFO: loaded from: classes3.dex */
public final class C11406 {

    /* JADX INFO: renamed from: ֫ */
    public int f31826;

    /* JADX INFO: renamed from: ֫ */
    public final boolean m26379() {
        return this.f31826 < 1024;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m26380() {
        if (!m26379()) {
            return false;
        }
        this.f31826++;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26378(int i) {
        int i2;
        if (i < 0 || i > (i2 = this.f31826)) {
            throw new IllegalArgumentException("Invalid proof budget release");
        }
        this.f31826 = i2 - i;
    }
}
