package l;

/* JADX INFO: renamed from: l.᩹᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66T2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22519 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f72873;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f72874;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f72875;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50494(char[] cArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (this.f72873 * 31) + cArr[i2];
            this.f72873 = i3;
            int i4 = this.f72875 + 1;
            this.f72875 = i4;
            if (i4 == 14740) {
                this.f72874 = (this.f72874 * 31) + i3;
                this.f72875 = 0;
                this.f72873 = 0;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50493(int i) {
        return (i * 31) + (this.f72875 == 0 ? this.f72874 : (this.f72874 * 31) + this.f72873);
    }
}
