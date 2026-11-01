package p067l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: renamed from: l.᩶ᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8AM */
/* JADX INFO: loaded from: classes4.dex */
public final class C21688 {

    /* JADX INFO: renamed from: ֫ */
    public final Map f68306;

    /* JADX INFO: renamed from: ۧ */
    public final List f68307;

    public C21688() {
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.f68306 = map;
        this.f68307 = list;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m48961(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:70:0x011a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0120  */
    /* JADX WARN: Code duplicated, block: B:73:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x013e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0146  */
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC22339 m48962(C18020 c18020, boolean z) {
        InterfaceC22339 c19368;
        InterfaceC22339 c8072;
        String strM34572;
        Type typeM41005 = c18020.m41005();
        Class clsM41004 = c18020.m41004();
        Map map = Collections.EMPTY_MAP;
        InterfaceC12260 interfaceC12260 = (InterfaceC12260) map.get(typeM41005);
        if (interfaceC12260 != null) {
            return new C15646(interfaceC12260, typeM41005);
        }
        InterfaceC12260 interfaceC12261 = (InterfaceC12260) map.get(clsM41004);
        if (interfaceC12261 != null) {
            return new C7638(interfaceC12261, typeM41005);
        }
        InterfaceC22339 c21459 = null;
        if (EnumSet.class.isAssignableFrom(clsM41004)) {
            c19368 = new C13303(typeM41005);
        } else {
            c19368 = clsM41004 == EnumMap.class ? new C19368(typeM41005) : null;
        }
        if (c19368 != null) {
            return c19368;
        }
        List list = Collections.EMPTY_LIST;
        EnumC11630 enumC11630M10406 = C4904.m10406(clsM41004);
        if (Modifier.isAbstract(clsM41004.getModifiers())) {
            c8072 = null;
        } else {
            try {
                Constructor declaredConstructor = clsM41004.getDeclaredConstructor(null);
                EnumC11630 enumC11630 = EnumC11630.ALLOW;
                if (enumC11630M10406 == enumC11630 || (AbstractC17643.f52705.mo25212(null, declaredConstructor) && (enumC11630M10406 != EnumC11630.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    c8072 = (enumC11630M10406 != enumC11630 || (strM34572 = C15140.m34572(declaredConstructor)) == null) ? new C8072(8, declaredConstructor) : new C22721(strM34572);
                } else {
                    c8072 = new C21736(C22934.m51253(clsM41004, "Unable to invoke no-args constructor of ", "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."));
                }
            } catch (NoSuchMethodException unused) {
                c8072 = null;
            }
        }
        if (c8072 != null) {
            return c8072;
        }
        if (Collection.class.isAssignableFrom(clsM41004)) {
            if (clsM41004.isAssignableFrom(ArrayList.class)) {
                c21459 = new C1514();
            } else if (clsM41004.isAssignableFrom(LinkedHashSet.class)) {
                c21459 = new C6406(10);
            } else if (clsM41004.isAssignableFrom(TreeSet.class)) {
                c21459 = new C21720();
            } else if (clsM41004.isAssignableFrom(ArrayDeque.class)) {
                c21459 = new C7913();
            }
        } else if (Map.class.isAssignableFrom(clsM41004)) {
            if (clsM41004.isAssignableFrom(C25020.class)) {
                if (typeM41005 instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) typeM41005).getActualTypeArguments();
                    if (actualTypeArguments.length == 0 || C8276.m19070(actualTypeArguments[0]) != String.class) {
                        if (clsM41004.isAssignableFrom(LinkedHashMap.class)) {
                            c21459 = new C17073();
                        } else if (clsM41004.isAssignableFrom(TreeMap.class)) {
                            c21459 = new C20780(7);
                        } else if (clsM41004.isAssignableFrom(ConcurrentMapC12768.class)) {
                            c21459 = new C19158(7);
                        } else if (clsM41004.isAssignableFrom(ConcurrentSkipListMap.class)) {
                            c21459 = new C21459(9);
                        }
                    }
                }
                c21459 = new C9417();
            } else if (clsM41004.isAssignableFrom(LinkedHashMap.class)) {
                c21459 = new C17073();
            } else if (clsM41004.isAssignableFrom(TreeMap.class)) {
                c21459 = new C20780(7);
            } else if (clsM41004.isAssignableFrom(ConcurrentMapC12768.class)) {
                c21459 = new C19158(7);
            } else if (clsM41004.isAssignableFrom(ConcurrentSkipListMap.class)) {
                c21459 = new C21459(9);
            }
        }
        if (c21459 != null) {
            return c21459;
        }
        String strM48961 = m48961(clsM41004);
        if (strM48961 != null) {
            return new C14417(4, strM48961);
        }
        if (z) {
            return enumC11630M10406 != EnumC11630.ALLOW ? new C8047(3, C22934.m51253(clsM41004, "Unable to create instance of ", "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.")) : new C24793(clsM41004);
        }
        return new C18758(4, C22934.m51253(clsM41004, "Unable to create instance of ", "; Register an InstanceCreator or a TypeAdapter for this type."));
    }

    public final String toString() {
        return this.f68306.toString();
    }
}
