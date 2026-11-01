package p067l;

import com.umeng.analytics.pro.C0655am;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.᩸۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAUQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C22739 extends AbstractC7316 implements Map, Cloneable, Serializable, InvocationHandler {

    /* JADX INFO: renamed from: ۬ */
    public final Map f71707;

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f71707.put((String) obj, obj2);
    }

    public C22739() {
        this(0, false);
    }

    public C22739(Map map) {
        this.f71707 = map;
    }

    public C22739(int i, boolean z) {
        if (z) {
            this.f71707 = new LinkedHashMap(16);
        } else {
            this.f71707 = new HashMap(16);
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f71707.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f71707.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f71707.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f71707.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f71707.get(obj);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m50887(String str) {
        Boolean boolM47048 = C20831.m47048(this.f71707.get(str));
        if (boolM47048 == null) {
            return false;
        }
        return boolM47048.booleanValue();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m50888(String str) {
        Integer numM47039 = C20831.m47039(this.f71707.get(str));
        if (numM47039 == null) {
            return 0;
        }
        return numM47039.intValue();
    }

    /* JADX INFO: renamed from: ܿ */
    public final Boolean m50889() {
        Object obj = this.f71707.get(C0655am.f2277aE);
        if (obj == null) {
            return null;
        }
        return C20831.m47048(obj);
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m50890(String str) {
        Object obj = this.f71707.get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C3292 m50891(String str) {
        Object obj = this.f71707.get(str);
        if (obj instanceof C3292) {
            return (C3292) obj;
        }
        if (obj instanceof String) {
            return (C3292) AbstractC7316.m16891(AbstractC7316.f19153, (String) obj);
        }
        return (C3292) AbstractC7316.m16892(obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50886(String str, Object obj) {
        this.f71707.put(str, obj);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f71707.putAll(map);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f71707.clear();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f71707.remove(obj);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f71707.keySet();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f71707.values();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f71707.entrySet();
    }

    public final Object clone() {
        return new C22739(new LinkedHashMap(this.f71707));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f71707.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f71707.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        Class<?> cls = Void.TYPE;
        String strName = null;
        Map map = this.f71707;
        if (length == 1) {
            if (method.getName().equals(AnnotationHandler.EQUAL)) {
                return Boolean.valueOf(map.equals(objArr[0]));
            }
            if (method.getReturnType() != cls) {
                throw new C16702("illegal setter");
            }
            InterfaceC14691 interfaceC14691 = (InterfaceC14691) method.getAnnotation(InterfaceC14691.class);
            String strName2 = (interfaceC14691 == null || interfaceC14691.name().length() == 0) ? null : interfaceC14691.name();
            if (strName2 == null) {
                String name = method.getName();
                if (!name.startsWith("set")) {
                    throw new C16702("illegal setter");
                }
                String strSubstring = name.substring(3);
                if (strSubstring.length() == 0) {
                    throw new C16702("illegal setter");
                }
                strName2 = Character.toLowerCase(strSubstring.charAt(0)) + strSubstring.substring(1);
            }
            map.put(strName2, objArr[0]);
            return null;
        }
        if (parameterTypes.length != 0) {
            throw new UnsupportedOperationException(method.toGenericString());
        }
        if (method.getReturnType() == cls) {
            throw new C16702("illegal getter");
        }
        InterfaceC14691 interfaceC14692 = (InterfaceC14691) method.getAnnotation(InterfaceC14691.class);
        if (interfaceC14692 != null && interfaceC14692.name().length() != 0) {
            strName = interfaceC14692.name();
        }
        if (strName == null) {
            String name2 = method.getName();
            if (name2.startsWith("get")) {
                String strSubstring2 = name2.substring(3);
                if (strSubstring2.length() == 0) {
                    throw new C16702("illegal getter");
                }
                strName = Character.toLowerCase(strSubstring2.charAt(0)) + strSubstring2.substring(1);
            } else {
                if (!name2.startsWith(C0655am.f2303ae)) {
                    if (name2.startsWith("hashCode")) {
                        return Integer.valueOf(map.hashCode());
                    }
                    if (name2.startsWith(AnnotationHandler.STRING)) {
                        return mo16897();
                    }
                    throw new C16702("illegal getter");
                }
                String strSubstring3 = name2.substring(2);
                if (strSubstring3.length() == 0) {
                    throw new C16702("illegal getter");
                }
                strName = Character.toLowerCase(strSubstring3.charAt(0)) + strSubstring3.substring(1);
            }
        }
        return C20831.m47028(map.get(strName), method.getGenericReturnType(), C24597.f77883);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final Map m50892() {
        return this.f71707;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m50885(Class cls, C24597 c24597) {
        return (cls != Map.class && (cls != Object.class || this.f71707.containsKey("@type"))) ? C20831.m47042(this, cls, c24597) : this;
    }
}
