package l;

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
public final class C20328 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map f65632;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f65633;

    public C20328() {
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.f65632 = map;
        this.f65633 = list;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46638(Class cls) {
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC21013 m46639(C16469 c16469, boolean z) {
        InterfaceC21013 c17887;
        InterfaceC21013 c6001;
        String strM32470;
        Type typeM38779 = c16469.m38779();
        Class clsM38778 = c16469.m38778();
        Map map = Collections.EMPTY_MAP;
        InterfaceC10408 interfaceC10408 = (InterfaceC10408) map.get(typeM38779);
        if (interfaceC10408 != null) {
            return new C13970(interfaceC10408, typeM38779);
        }
        InterfaceC10408 interfaceC10409 = (InterfaceC10408) map.get(clsM38778);
        if (interfaceC10409 != null) {
            return new C5544(interfaceC10409, typeM38779);
        }
        InterfaceC21013 c20087 = null;
        if (EnumSet.class.isAssignableFrom(clsM38778)) {
            c17887 = new C11505(typeM38779);
        } else {
            c17887 = clsM38778 == EnumMap.class ? new C17887(typeM38779) : null;
        }
        if (c17887 != null) {
            return c17887;
        }
        List list = Collections.EMPTY_LIST;
        EnumC9745 enumC9745M8360 = C2668.m8360(clsM38778);
        if (Modifier.isAbstract(clsM38778.getModifiers())) {
            c6001 = null;
        } else {
            try {
                Constructor declaredConstructor = clsM38778.getDeclaredConstructor(null);
                EnumC9745 enumC9745 = EnumC9745.ALLOW;
                if (enumC9745M8360 == enumC9745 || (AbstractC16072.f49542.mo23268(null, declaredConstructor) && (enumC9745M8360 != EnumC9745.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    c6001 = (enumC9745M8360 != enumC9745 || (strM32470 = C13438.m32470(declaredConstructor)) == null) ? new C6001(8, declaredConstructor) : new C21415(strM32470);
                } else {
                    c6001 = new C20378(C21639.m48905(clsM38778, "Unable to invoke no-args constructor of ", "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."));
                }
            } catch (NoSuchMethodException unused) {
                c6001 = null;
            }
        }
        if (c6001 != null) {
            return c6001;
        }
        if (Collection.class.isAssignableFrom(clsM38778)) {
            if (clsM38778.isAssignableFrom(ArrayList.class)) {
                c20087 = new C13540();
            } else if (clsM38778.isAssignableFrom(LinkedHashSet.class)) {
                c20087 = new C4248(10);
            } else if (clsM38778.isAssignableFrom(TreeSet.class)) {
                c20087 = new C20361();
            } else if (clsM38778.isAssignableFrom(ArrayDeque.class)) {
                c20087 = new C5834();
            }
        } else if (Map.class.isAssignableFrom(clsM38778)) {
            if (clsM38778.isAssignableFrom(C23834.class)) {
                if (typeM38779 instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) typeM38779).getActualTypeArguments();
                    if (actualTypeArguments.length == 0 || C6216.m17138(actualTypeArguments[0]) != String.class) {
                        if (clsM38778.isAssignableFrom(LinkedHashMap.class)) {
                            c20087 = new C15472();
                        } else if (clsM38778.isAssignableFrom(TreeMap.class)) {
                            c20087 = new C19373(7);
                        } else if (clsM38778.isAssignableFrom(ConcurrentMapC10942.class)) {
                            c20087 = new C17665(7);
                        } else if (clsM38778.isAssignableFrom(ConcurrentSkipListMap.class)) {
                            c20087 = new C20087(9);
                        }
                    }
                }
                c20087 = new C7416();
            } else if (clsM38778.isAssignableFrom(LinkedHashMap.class)) {
                c20087 = new C15472();
            } else if (clsM38778.isAssignableFrom(TreeMap.class)) {
                c20087 = new C19373(7);
            } else if (clsM38778.isAssignableFrom(ConcurrentMapC10942.class)) {
                c20087 = new C17665(7);
            } else if (clsM38778.isAssignableFrom(ConcurrentSkipListMap.class)) {
                c20087 = new C20087(9);
            }
        }
        if (c20087 != null) {
            return c20087;
        }
        String strM46638 = m46638(clsM38778);
        if (strM46638 != null) {
            return new C12677(4, strM46638);
        }
        if (z) {
            return enumC9745M8360 != EnumC9745.ALLOW ? new C5975(3, C21639.m48905(clsM38778, "Unable to create instance of ", "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.")) : new C23595(clsM38778);
        }
        return new C17245(4, C21639.m48905(clsM38778, "Unable to create instance of ", "; Register an InstanceCreator or a TypeAdapter for this type."));
    }

    public final String toString() {
        return this.f65632.toString();
    }
}
