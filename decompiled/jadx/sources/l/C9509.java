package l;

/* JADX INFO: renamed from: l.ۢۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970E */
/* JADX INFO: loaded from: classes3.dex */
public final class C9509 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f28879;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24369() {
        return this.f28879 < 1024;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m24370() {
        if (!m24369()) {
            return false;
        }
        this.f28879++;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24368(int i) {
        int i2;
        if (i < 0 || i > (i2 = this.f28879)) {
            throw new IllegalArgumentException("Invalid proof budget release");
        }
        this.f28879 = i2 - i;
    }
}
