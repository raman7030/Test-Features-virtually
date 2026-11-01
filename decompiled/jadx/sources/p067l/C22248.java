package p067l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.᩷ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7SL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C22248 {
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m50078(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
