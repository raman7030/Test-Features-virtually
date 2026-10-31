package l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ܿ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17686 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m41421(Unsafe unsafe, FutureC3575 futureC3575, long j, Object obj) {
        while (!unsafe.compareAndSwapObject(futureC3575, j, (Object) null, obj)) {
            if (unsafe.getObject(futureC3575, j) != null) {
                return false;
            }
        }
        return true;
    }
}
