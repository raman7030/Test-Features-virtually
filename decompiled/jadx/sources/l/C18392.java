package l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ᩳ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18392 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m42818(Unsafe unsafe, FutureC3575 futureC3575, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(futureC3575, j, obj, obj2)) {
            if (unsafe.getObject(futureC3575, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
