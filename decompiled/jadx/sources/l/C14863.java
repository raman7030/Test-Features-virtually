package l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ܳ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14863 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m35260(Unsafe unsafe, FutureC3575 futureC3575, long j) {
        C24036 c24036 = FutureC3575.f11334;
        while (!unsafe.compareAndSwapObject(futureC3575, j, (Object) null, c24036)) {
            if (unsafe.getObject(futureC3575, j) != null) {
                return false;
            }
        }
        return true;
    }
}
