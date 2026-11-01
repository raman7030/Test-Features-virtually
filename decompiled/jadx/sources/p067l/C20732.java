package p067l;

/* JADX INFO: renamed from: l.᩵۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7R4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20732 {

    /* JADX INFO: renamed from: ֫ */
    public final int f63975;

    /* JADX INFO: renamed from: ۧ */
    public final int f63976;

    /* JADX INFO: renamed from: ܽ */
    public final String f63977;

    /* JADX INFO: renamed from: ֫ */
    public static C20732 m46813(String str) {
        return new C20732(-1, -1, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20732 m46812(int i, int i2, String str) {
        C6194.m14030(i >= 0);
        C6194.m14030(i2 >= 0);
        str.getClass();
        return new C20732(i, i2, str);
    }

    public C20732(int i, int i2, String str) {
        this.f63976 = i;
        this.f63975 = i2;
        this.f63977 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f63976;
        if (i >= 0) {
            sb.append(i);
            sb.append(':');
        }
        int i2 = this.f63975;
        if (i2 >= 0) {
            sb.append(i2);
            sb.append(':');
        }
        if (i >= 0 || i2 >= 0) {
            sb.append(' ');
        }
        sb.append("error: ");
        sb.append(this.f63977);
        return sb.toString();
    }
}
