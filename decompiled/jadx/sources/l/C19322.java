package l;

/* JADX INFO: renamed from: l.᩵۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7R4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19322 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f60745;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f60746;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f60747;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19322 m44519(String str) {
        return new C19322(-1, -1, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19322 m44518(int i, int i2, String str) {
        C4025.m12110(i >= 0);
        C4025.m12110(i2 >= 0);
        str.getClass();
        return new C19322(i, i2, str);
    }

    public C19322(int i, int i2, String str) {
        this.f60746 = i;
        this.f60745 = i2;
        this.f60747 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f60746;
        if (i >= 0) {
            sb.append(i);
            sb.append(':');
        }
        int i2 = this.f60745;
        if (i2 >= 0) {
            sb.append(i2);
            sb.append(':');
        }
        if (i >= 0 || i2 >= 0) {
            sb.append(' ');
        }
        sb.append("error: ");
        sb.append(this.f60747);
        return sb.toString();
    }
}
