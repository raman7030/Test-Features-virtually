package p067l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ܳ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16495 {
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m37413(Unsafe unsafe, FutureC5767 futureC5767, long j) {
        C25213 c25213 = FutureC5767.f14140;
        while (!unsafe.compareAndSwapObject(futureC5767, j, (Object) null, c25213)) {
            if (unsafe.getObject(futureC5767, j) != null) {
                return false;
            }
        }
        return true;
    }
}
