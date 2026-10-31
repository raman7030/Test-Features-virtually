package l;

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
public final class C19375 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f62717 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f62718;

    public C19375(HashMap map) {
        this.f62718 = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC22901 enumC22901 = (EnumC22901) entry.getValue();
            List arrayList = (List) this.f62717.get(enumC22901);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f62717.put(enumC22901, arrayList);
            }
            arrayList.add((C0323) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44637(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901, Object obj) {
        HashMap map = this.f62717;
        m44636((List) map.get(enumC22901), interfaceC23586, enumC22901, obj);
        m44636((List) map.get(EnumC22901.ON_ANY), interfaceC23586, enumC22901, obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44636(List list, InterfaceC23586 interfaceC23586, EnumC22901 enumC22901, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0323 c0323 = (C0323) list.get(size);
                Method method = c0323.f1706;
                try {
                    int i = c0323.f1705;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, interfaceC23586);
                    } else if (i == 2) {
                        method.invoke(obj, interfaceC23586, enumC22901);
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
