package p067l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ᩳ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C19849 {
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m45090(Unsafe unsafe, FutureC5767 futureC5767, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(futureC5767, j, obj, obj2)) {
            if (unsafe.getObject(futureC5767, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
