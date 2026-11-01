package p067l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ܿ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C19178 {
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m43667(Unsafe unsafe, FutureC5767 futureC5767, long j, Object obj) {
        while (!unsafe.compareAndSwapObject(futureC5767, j, (Object) null, obj)) {
            if (unsafe.getObject(futureC5767, j) != null) {
                return false;
            }
        }
        return true;
    }
}
