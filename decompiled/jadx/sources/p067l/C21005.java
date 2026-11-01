package p067l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩵ܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7M1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21005 {
    /* JADX INFO: renamed from: ֫ */
    public static C15638 m47345(InterfaceC11617 interfaceC11617) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC11617.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (interfaceC11617.mo4751(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new C15638(length, i);
    }
}
