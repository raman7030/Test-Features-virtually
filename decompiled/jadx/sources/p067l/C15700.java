package p067l;

/* JADX INFO: renamed from: l.ܰ᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5LF */
/* JADX INFO: loaded from: classes3.dex */
public final class C15700 {

    /* JADX INFO: renamed from: ֫ */
    public int f45499;

    /* JADX INFO: renamed from: ۧ */
    public long f45500;

    public C15700(int i, long j) {
        this.f45500 = j;
        this.f45499 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m35763() {
        return this.f45499;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15700 m35762(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new C15700(i3, j);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m35764() {
        return (int) this.f45500;
    }
}
