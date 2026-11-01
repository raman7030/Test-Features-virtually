package p067l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4M0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18693 {

    /* JADX INFO: renamed from: ܽ */
    public static int f55826 = (EnumC17248.STATIC.getValue() | EnumC17248.PRIVATE.getValue()) | EnumC17248.CONSTRUCTOR.getValue();

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC20276 f55824 = new C18022();

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC20276 f55825 = new C19364();

    /* JADX INFO: renamed from: ֫ */
    public static boolean m42657(InterfaceC19897 interfaceC19897) {
        return (interfaceC19897.mo5854() & f55826) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m42656(List list, boolean z) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            char cCharAt = ((CharSequence) it.next()).charAt(0);
            i = (cCharAt == 'J' || cCharAt == 'D') ? i + 2 : i + 1;
        }
        return !z ? i + 1 : i;
    }
}
