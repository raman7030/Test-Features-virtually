package p067l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩵ۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D5S8 */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class C20782 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f65328 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f65329;

    public C20782(HashMap map) {
        this.f65329 = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC24133 enumC24133 = (EnumC24133) entry.getValue();
            List arrayList = (List) this.f65328.get(enumC24133);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f65328.put(enumC24133, arrayList);
            }
            arrayList.add((C2675) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46931(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133, Object obj) {
        HashMap map = this.f65328;
        m46930((List) map.get(enumC24133), interfaceC24784, enumC24133, obj);
        m46930((List) map.get(EnumC24133.ON_ANY), interfaceC24784, enumC24133, obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46930(List list, InterfaceC24784 interfaceC24784, EnumC24133 enumC24133, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C2675 c2675 = (C2675) list.get(size);
                Method method = c2675.f4482;
                try {
                    int i = c2675.f4481;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, interfaceC24784);
                    } else if (i == 2) {
                        method.invoke(obj, interfaceC24784, enumC24133);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
