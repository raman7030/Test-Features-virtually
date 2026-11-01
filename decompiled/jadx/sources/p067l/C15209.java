package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ܰ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DATI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15209 implements InterfaceC18147 {
    @Override // p067l.InterfaceC18147
    /* JADX INFO: renamed from: ֫ */
    public final void mo5359(C7834 c7834, Object obj, Object obj2, Type type) {
        boolean z;
        C8760 c8760 = c7834.f20541;
        C24853 c24853 = c7834.f20547;
        if (obj == null) {
            c8760.m20244();
            return;
        }
        Map treeMap = (Map) obj;
        Class<?> cls = treeMap.getClass();
        boolean z2 = (cls == C22739.class || cls == HashMap.class || cls == LinkedHashMap.class) && treeMap.containsKey("@type");
        if ((c8760.f23752 & EnumC22172.SortField.f70155) != 0) {
            if (treeMap instanceof C22739) {
                treeMap = ((C22739) treeMap).m50892();
            }
            if (!(treeMap instanceof SortedMap) && !(treeMap instanceof LinkedHashMap)) {
                try {
                    treeMap = new TreeMap(treeMap);
                } catch (Exception unused) {
                }
            }
        }
        IdentityHashMap identityHashMap = c7834.f20542;
        if (identityHashMap != null && identityHashMap.containsKey(obj)) {
            c7834.m18111(obj);
            return;
        }
        C16135 c16135 = c7834.f20549;
        c7834.m18109(c16135, obj, obj2);
        try {
            c8760.write(123);
            c7834.m18112();
            if ((c8760.f23752 & EnumC22172.WriteClassName.f70155) == 0 || z2) {
                z = true;
            } else {
                c24853.getClass();
                c8760.m20247("@type", false);
                c8760.m20245(obj.getClass().getName());
                z = false;
            }
            Class<?> cls2 = null;
            InterfaceC18147 interfaceC18147 = null;
            for (Map.Entry entry : treeMap.entrySet()) {
                Object value = entry.getValue();
                Object key = entry.getKey();
                ArrayList arrayList = c7834.f20543;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    Object objM16895 = key;
                    while (true) {
                        if (it.hasNext()) {
                            InterfaceC18818 interfaceC18818 = (InterfaceC18818) it.next();
                            if (objM16895 != null && !(objM16895 instanceof String)) {
                                objM16895 = AbstractC7316.m16895(objM16895);
                            }
                            if (!interfaceC18818.m42871()) {
                            }
                        }
                    }
                }
                ArrayList arrayList2 = c7834.f20550;
                if (arrayList2 != null) {
                    Object objM16896 = (key == null || (key instanceof String)) ? key : AbstractC7316.m16895(key);
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((InterfaceC19489) it2.next()).apply()) {
                            }
                        }
                    }
                }
                ArrayList arrayList3 = c7834.f20551;
                if (arrayList3 != null) {
                    if (key != null && !(key instanceof String)) {
                        key = AbstractC7316.m16895(key);
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        key = ((InterfaceC4066) it3.next()).m8136();
                    }
                }
                ArrayList arrayList4 = c7834.f20540;
                if (arrayList4 != null) {
                    Object objM16897 = (key == null || (key instanceof String)) ? key : AbstractC7316.m16895(key);
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        value = ((InterfaceC10772) it4.next()).m24815();
                    }
                }
                if (value != null || (c8760.f23752 & EnumC22172.WriteMapNullValue.f70155) != 0) {
                    if (key instanceof String) {
                        String str = (String) key;
                        if (!z) {
                            c8760.write(44);
                        }
                        if ((c8760.f23752 & EnumC22172.PrettyFormat.f70155) != 0) {
                            c7834.m18113();
                        }
                        c8760.m20247(str, true);
                    } else {
                        if (!z) {
                            c8760.write(44);
                        }
                        if ((c8760.f23752 & EnumC22172.WriteNonStringKeyAsString.f70155) != 0 && !(key instanceof Enum)) {
                            c7834.m18108(AbstractC7316.m16895(key));
                        } else {
                            c7834.m18107(key);
                        }
                        c8760.write(58);
                    }
                    if (value == null) {
                        c8760.m20244();
                    } else {
                        Class<?> cls3 = value.getClass();
                        if (cls3 == cls2) {
                            interfaceC18147.mo5359(c7834, value, key, null);
                        } else {
                            InterfaceC18147 interfaceC18147M54590 = c24853.m54590(cls3);
                            interfaceC18147M54590.mo5359(c7834, value, key, null);
                            interfaceC18147 = interfaceC18147M54590;
                            cls2 = cls3;
                        }
                    }
                    z = false;
                }
            }
            c7834.f20549 = c16135;
            c7834.m18106();
            if ((c8760.f23752 & EnumC22172.PrettyFormat.f70155) != 0 && treeMap.size() > 0) {
                c7834.m18113();
            }
            c8760.write(C0254q.f1218h);
        } catch (Throwable th) {
            c7834.f20549 = c16135;
            throw th;
        }
    }
}
