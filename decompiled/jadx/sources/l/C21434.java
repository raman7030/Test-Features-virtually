package l;

import com.umeng.analytics.pro.am;
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
public final class C21434 extends AbstractC5206 implements Map, Cloneable, Serializable, InvocationHandler {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Map f69009;

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f69009.put((String) obj, obj2);
    }

    public C21434() {
        this(0, false);
    }

    public C21434(Map map) {
        this.f69009 = map;
    }

    public C21434(int i, boolean z) {
        if (z) {
            this.f69009 = new LinkedHashMap(16);
        } else {
            this.f69009 = new HashMap(16);
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f69009.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f69009.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f69009.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f69009.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f69009.get(obj);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m48550(String str) {
        Boolean boolM44754 = C19426.m44754(this.f69009.get(str));
        if (boolM44754 == null) {
            return false;
        }
        return boolM44754.booleanValue();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m48551(String str) {
        Integer numM44745 = C19426.m44745(this.f69009.get(str));
        if (numM44745 == null) {
            return 0;
        }
        return numM44745.intValue();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Boolean m48552() {
        Object obj = this.f69009.get(am.aE);
        if (obj == null) {
            return null;
        }
        return C19426.m44754(obj);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m48553(String str) {
        Object obj = this.f69009.get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C0972 m48554(String str) {
        Object obj = this.f69009.get(str);
        if (obj instanceof C0972) {
            return (C0972) obj;
        }
        if (obj instanceof String) {
            return (C0972) AbstractC5206.m14981(AbstractC5206.f16312, (String) obj);
        }
        return (C0972) AbstractC5206.m14982(obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48549(String str, Object obj) {
        this.f69009.put(str, obj);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f69009.putAll(map);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f69009.clear();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f69009.remove(obj);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f69009.keySet();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f69009.values();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f69009.entrySet();
    }

    public final Object clone() {
        return new C21434(new LinkedHashMap(this.f69009));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f69009.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f69009.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        Class<?> cls = Void.TYPE;
        String strName = null;
        Map map = this.f69009;
        if (length == 1) {
            if (method.getName().equals(AnnotationHandler.EQUAL)) {
                return Boolean.valueOf(map.equals(objArr[0]));
            }
            if (method.getReturnType() != cls) {
                throw new C15082("illegal setter");
            }
            InterfaceC12966 interfaceC12966 = (InterfaceC12966) method.getAnnotation(InterfaceC12966.class);
            String strName2 = (interfaceC12966 == null || interfaceC12966.name().length() == 0) ? null : interfaceC12966.name();
            if (strName2 == null) {
                String name = method.getName();
                if (!name.startsWith("set")) {
                    throw new C15082("illegal setter");
                }
                String strSubstring = name.substring(3);
                if (strSubstring.length() == 0) {
                    throw new C15082("illegal setter");
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
            throw new C15082("illegal getter");
        }
        InterfaceC12966 interfaceC12967 = (InterfaceC12966) method.getAnnotation(InterfaceC12966.class);
        if (interfaceC12967 != null && interfaceC12967.name().length() != 0) {
            strName = interfaceC12967.name();
        }
        if (strName == null) {
            String name2 = method.getName();
            if (name2.startsWith("get")) {
                String strSubstring2 = name2.substring(3);
                if (strSubstring2.length() == 0) {
                    throw new C15082("illegal getter");
                }
                strName = Character.toLowerCase(strSubstring2.charAt(0)) + strSubstring2.substring(1);
            } else {
                if (!name2.startsWith(am.ae)) {
                    if (name2.startsWith("hashCode")) {
                        return Integer.valueOf(map.hashCode());
                    }
                    if (name2.startsWith(AnnotationHandler.STRING)) {
                        return mo14987();
                    }
                    throw new C15082("illegal getter");
                }
                String strSubstring3 = name2.substring(2);
                if (strSubstring3.length() == 0) {
                    throw new C15082("illegal getter");
                }
                strName = Character.toLowerCase(strSubstring3.charAt(0)) + strSubstring3.substring(1);
            }
        }
        return C19426.m44734(map.get(strName), method.getGenericReturnType(), C23389.f75137);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Map m48555() {
        return this.f69009;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m48548(Class cls, C23389 c23389) {
        return (cls != Map.class && (cls != Object.class || this.f69009.containsKey("@type"))) ? C19426.m44748(this, cls, c23389) : this;
    }
}
