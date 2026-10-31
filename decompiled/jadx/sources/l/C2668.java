package l;

import java.lang.reflect.AccessibleObject;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U87V */
/* JADX INFO: loaded from: classes2.dex */
public final class C2668 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC9745 m8360(Class cls) {
        Iterator it = Collections.EMPTY_LIST.iterator();
        while (it.hasNext()) {
            EnumC9745 enumC9745Check = ((InterfaceC9039) it.next()).check();
            if (enumC9745Check != EnumC9745.INDECISIVE) {
                return enumC9745Check;
            }
        }
        return EnumC9745.ALLOW;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8361(Object obj, AccessibleObject accessibleObject) {
        return AbstractC16072.f49542.mo23268(obj, accessibleObject);
    }
}
