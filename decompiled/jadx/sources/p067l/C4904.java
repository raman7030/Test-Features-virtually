package p067l;

import java.lang.reflect.AccessibleObject;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U87V */
/* JADX INFO: loaded from: classes2.dex */
public final class C4904 {
    /* JADX INFO: renamed from: ֫ */
    public static EnumC11630 m10406(Class cls) {
        Iterator it = Collections.EMPTY_LIST.iterator();
        while (it.hasNext()) {
            EnumC11630 enumC11630Check = ((InterfaceC10959) it.next()).check();
            if (enumC11630Check != EnumC11630.INDECISIVE) {
                return enumC11630Check;
            }
        }
        return EnumC11630.ALLOW;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m10407(Object obj, AccessibleObject accessibleObject) {
        return AbstractC17643.f52705.mo25212(obj, accessibleObject);
    }
}
