package l;

/* JADX INFO: renamed from: l.֨ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7Q5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1071 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f3921;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f3922;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f3923;

    public final String toString() {
        return C4860.m14172("Comment: '", this.f3923, "'");
    }

    public C1071(int i, int i2, String str) {
        this.f3922 = i;
        this.f3921 = i2;
        this.f3923 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m3640() {
        int i = this.f3921;
        int i2 = this.f3922;
        C4025.m12108("Expected %s in the range [0, %s)", 0, i - i2, i - i2 > 0);
        return i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m3641() {
        return this.f3923;
    }
}
