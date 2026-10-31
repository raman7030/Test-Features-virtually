package l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۛ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6397 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m17724(Unsafe unsafe, Object obj, long j, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, (Object) null)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
