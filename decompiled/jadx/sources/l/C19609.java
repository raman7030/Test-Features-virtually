package l;

import android.os.SystemClock;

/* JADX INFO: renamed from: l.᩵ܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7M1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19609 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13962 m45050(InterfaceC9731 interfaceC9731) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC9731.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (interfaceC9731.mo2380(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new C13962(length, i);
    }
}
