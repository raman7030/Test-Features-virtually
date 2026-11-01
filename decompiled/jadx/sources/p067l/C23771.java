package p067l;

/* JADX INFO: renamed from: l.᩹᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66T2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23771 {

    /* JADX INFO: renamed from: ֫ */
    public int f75599;

    /* JADX INFO: renamed from: ۧ */
    public int f75600;

    /* JADX INFO: renamed from: ܽ */
    public int f75601;

    /* JADX INFO: renamed from: ֫ */
    public final void m52836(char[] cArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (this.f75599 * 31) + cArr[i2];
            this.f75599 = i3;
            int i4 = this.f75601 + 1;
            this.f75601 = i4;
            if (i4 == 14740) {
                this.f75600 = (this.f75600 * 31) + i3;
                this.f75601 = 0;
                this.f75599 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m52835(int i) {
        return (i * 31) + (this.f75601 == 0 ? this.f75600 : (this.f75600 * 31) + this.f75599);
    }
}
