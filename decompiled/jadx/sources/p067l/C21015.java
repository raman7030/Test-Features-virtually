package p067l;

/* JADX INFO: renamed from: l.᩵ᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: A4EU */
/* JADX INFO: loaded from: classes4.dex */
public final class C21015 {

    /* JADX INFO: renamed from: ֫ */
    public static long f65967;

    /* JADX INFO: renamed from: ۧ */
    public static C20344 f65968;

    /* JADX INFO: renamed from: ֫ */
    public static C20344 m47359() {
        synchronized (C21015.class) {
            C20344 c20344 = f65968;
            if (c20344 != null) {
                f65968 = c20344.f62830;
                c20344.f62830 = null;
                f65967 -= 8192;
                return c20344;
            }
            return new C20344();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47360(C20344 c20344) {
        if (c20344.f62830 != null || c20344.f62829 != null) {
            throw new IllegalArgumentException();
        }
        if (c20344.f62833) {
            return;
        }
        synchronized (C21015.class) {
            long j = f65967 + 8192;
            if (j > 65536) {
                return;
            }
            f65967 = j;
            c20344.f62830 = f65968;
            c20344.f62828 = 0;
            c20344.f62831 = 0;
            f65968 = c20344;
        }
    }
}
