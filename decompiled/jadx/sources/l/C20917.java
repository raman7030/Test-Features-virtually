package l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.᩷ܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7SL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20917 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m47748(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
