package l;

import com.alipay.sdk.m.y.q;
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
public final class C13511 implements InterfaceC16602 {
    @Override // l.InterfaceC16602
    /* JADX INFO: renamed from: ֫ */
    public final void mo3046(C5751 c5751, Object obj, Object obj2, Type type) {
        boolean z;
        C6725 c6725 = c5751.f17696;
        C23658 c23658 = c5751.f17702;
        if (obj == null) {
            c6725.m18296();
            return;
        }
        Map treeMap = (Map) obj;
        Class<?> cls = treeMap.getClass();
        boolean z2 = (cls == C21434.class || cls == HashMap.class || cls == LinkedHashMap.class) && treeMap.containsKey("@type");
        if ((c6725.f20878 & EnumC20837.SortField.f67472) != 0) {
            if (treeMap instanceof C21434) {
                treeMap = ((C21434) treeMap).m48555();
            }
            if (!(treeMap instanceof SortedMap) && !(treeMap instanceof LinkedHashMap)) {
                try {
                    treeMap = new TreeMap(treeMap);
                } catch (Exception unused) {
                }
            }
        }
        IdentityHashMap identityHashMap = c5751.f17697;
        if (identityHashMap != null && identityHashMap.containsKey(obj)) {
            c5751.m16192(obj);
            return;
        }
        C14485 c14485 = c5751.f17704;
        c5751.m16190(c14485, obj, obj2);
        try {
            c6725.write(123);
            c5751.m16193();
            if ((c6725.f20878 & EnumC20837.WriteClassName.f67472) == 0 || z2) {
                z = true;
            } else {
                c23658.getClass();
                c6725.m18299("@type", false);
                c6725.m18297(obj.getClass().getName());
                z = false;
            }
            Class<?> cls2 = null;
            InterfaceC16602 interfaceC16602 = null;
            for (Map.Entry entry : treeMap.entrySet()) {
                Object value = entry.getValue();
                Object key = entry.getKey();
                ArrayList arrayList = c5751.f17698;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    Object objM14985 = key;
                    while (true) {
                        if (it.hasNext()) {
                            InterfaceC17308 interfaceC17308 = (InterfaceC17308) it.next();
                            if (objM14985 != null && !(objM14985 instanceof String)) {
                                objM14985 = AbstractC5206.m14985(objM14985);
                            }
                            if (!interfaceC17308.m40620()) {
                            }
                        }
                    }
                }
                ArrayList arrayList2 = c5751.f17705;
                if (arrayList2 != null) {
                    Object objM14986 = (key == null || (key instanceof String)) ? key : AbstractC5206.m14985(key);
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((InterfaceC18014) it2.next()).apply()) {
                            }
                        }
                    }
                }
                ArrayList arrayList3 = c5751.f17706;
                if (arrayList3 != null) {
                    if (key != null && !(key instanceof String)) {
                        key = AbstractC5206.m14985(key);
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        key = ((InterfaceC1786) it3.next()).m5941();
                    }
                }
                ArrayList arrayList4 = c5751.f17695;
                if (arrayList4 != null) {
                    Object objM14987 = (key == null || (key instanceof String)) ? key : AbstractC5206.m14985(key);
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        value = ((InterfaceC8842) it4.next()).m22845();
                    }
                }
                if (value != null || (c6725.f20878 & EnumC20837.WriteMapNullValue.f67472) != 0) {
                    if (key instanceof String) {
                        String str = (String) key;
                        if (!z) {
                            c6725.write(44);
                        }
                        if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0) {
                            c5751.m16194();
                        }
                        c6725.m18299(str, true);
                    } else {
                        if (!z) {
                            c6725.write(44);
                        }
                        if ((c6725.f20878 & EnumC20837.WriteNonStringKeyAsString.f67472) != 0 && !(key instanceof Enum)) {
                            c5751.m16189(AbstractC5206.m14985(key));
                        } else {
                            c5751.m16188(key);
                        }
                        c6725.write(58);
                    }
                    if (value == null) {
                        c6725.m18296();
                    } else {
                        Class<?> cls3 = value.getClass();
                        if (cls3 == cls2) {
                            interfaceC16602.mo3046(c5751, value, key, null);
                        } else {
                            InterfaceC16602 interfaceC16602M52187 = c23658.m52187(cls3);
                            interfaceC16602M52187.mo3046(c5751, value, key, null);
                            interfaceC16602 = interfaceC16602M52187;
                            cls2 = cls3;
                        }
                    }
                    z = false;
                }
            }
            c5751.f17704 = c14485;
            c5751.m16187();
            if ((c6725.f20878 & EnumC20837.PrettyFormat.f67472) != 0 && treeMap.size() > 0) {
                c5751.m16194();
            }
            c6725.write(q.h);
        } catch (Throwable th) {
            c5751.f17704 = c14485;
            throw th;
        }
    }
}
