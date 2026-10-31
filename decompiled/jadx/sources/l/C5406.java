package l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۚܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H88J */
/* JADX INFO: loaded from: classes3.dex */
public final class C5406 implements InterfaceC15387 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final List f16870;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13955 f16871;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC15345 f16872;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20328 f16873;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3394 f16874;

    public C5406(C20328 c20328, InterfaceC15345 interfaceC15345, C3394 c3394, C13955 c13955) {
        List list = Collections.EMPTY_LIST;
        this.f16873 = c20328;
        this.f16872 = interfaceC15345;
        this.f16874 = c3394;
        this.f16871 = c13955;
        this.f16870 = list;
    }

    @Override // l.InterfaceC15387
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8333 mo8743(C12524 c12524, C16469 c16469) {
        Class clsM38778 = c16469.m38778();
        if (!Object.class.isAssignableFrom(clsM38778)) {
            return null;
        }
        int i = C13438.f40152;
        if (!Modifier.isStatic(clsM38778.getModifiers()) && (clsM38778.isAnonymousClass() || clsM38778.isLocalClass())) {
            return new C8934();
        }
        List list = Collections.EMPTY_LIST;
        EnumC9745 enumC9745M8360 = C2668.m8360(clsM38778);
        if (enumC9745M8360 == EnumC9745.BLOCK_ALL) {
            throw new C13934(C21639.m48905(clsM38778, "ReflectionAccessFilter does not permit using reflection for ", ". Register a TypeAdapter for this type or adjust the access filter."));
        }
        boolean z = enumC9745M8360 == EnumC9745.BLOCK_INACCESSIBLE;
        return C13438.m32472(clsM38778) ? new C0466(clsM38778, m15474(c12524, c16469, clsM38778, z, true), z) : new C18812(this.f16873.m46639(c16469, true), m15474(c12524, c16469, clsM38778, z, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15476(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!C2668.m8361(obj, accessibleObject)) {
            throw new C13934(C16014.m37867(C13438.m32463(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15475(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + C13438.m32465(field) + " and " + C13438.m32465(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C19518 m15474(C12524 c12524, C16469 c16469, Class cls, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        Method method;
        String strValue;
        List listAsList;
        List<String> listSingletonList;
        C16469 c164610;
        AbstractC8333 abstractC8333M30728;
        int i;
        AbstractC3995 abstractC3995;
        if (cls.isInterface()) {
            return C19518.f63080;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C16469 c16469M38776 = c16469;
        boolean z5 = z;
        Class clsM38778 = cls;
        while (clsM38778 != Object.class) {
            Field[] declaredFields = clsM38778.getDeclaredFields();
            boolean z6 = true;
            boolean z7 = false;
            if (clsM38778 == cls || declaredFields.length <= 0) {
                z3 = z5;
            } else {
                List list = Collections.EMPTY_LIST;
                EnumC9745 enumC9745M8360 = C2668.m8360(clsM38778);
                if (enumC9745M8360 == EnumC9745.BLOCK_ALL) {
                    throw new C13934("ReflectionAccessFilter does not permit using reflection for " + clsM38778 + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z3 = enumC9745M8360 == EnumC9745.BLOCK_INACCESSIBLE;
            }
            int length = declaredFields.length;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                C3394 c3394 = this.f16874;
                boolean zM10351 = c3394.m10351(field, z6);
                boolean zM10352 = c3394.m10351(field, z7);
                boolean z8 = !zM10352;
                if (zM10351 && zM10352) {
                    i2 = i2;
                    i = length;
                } else {
                    if (!z2) {
                        z4 = z8;
                        method = null;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        method = null;
                        z4 = false;
                    } else {
                        Method methodM32467 = C13438.m32467(clsM38778, field);
                        if (!z3) {
                            C13438.m32468(methodM32467);
                        }
                        if (methodM32467.getAnnotation(InterfaceC22444.class) != null && field.getAnnotation(InterfaceC22444.class) == null) {
                            throw new C13934(C4860.m14172("@SerializedName on ", C13438.m32463(methodM32467, z7), " is not supported"));
                        }
                        z4 = z8;
                        method = methodM32467;
                    }
                    if (!z3 && method == null) {
                        C13438.m32468((AccessibleObject) field);
                    }
                    Type typeM17130 = C6216.m17130(clsM38778, c16469M38776.m38779(), field.getGenericType());
                    InterfaceC22444 interfaceC22444 = (InterfaceC22444) field.getAnnotation(InterfaceC22444.class);
                    if (interfaceC22444 == null) {
                        InterfaceC15345 interfaceC15345 = this.f16872;
                        strValue = interfaceC15345.mo2248(field);
                        listAsList = interfaceC15345.mo2247(field);
                    } else {
                        strValue = interfaceC22444.value();
                        listAsList = Arrays.asList(interfaceC22444.alternate());
                    }
                    if (listAsList.isEmpty()) {
                        listSingletonList = Collections.singletonList(strValue);
                    } else {
                        ArrayList arrayList = new ArrayList(listAsList.size() + 1);
                        arrayList.add(strValue);
                        arrayList.addAll(listAsList);
                        listSingletonList = arrayList;
                    }
                    String str = (String) listSingletonList.get(0);
                    C16469 c16469M38777 = C16469.m38776(typeM17130);
                    Class clsM38779 = c16469M38777.m38778();
                    boolean z9 = clsM38779 != null && clsM38779.isPrimitive();
                    int modifiers = field.getModifiers();
                    boolean z10 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
                    InterfaceC21739 interfaceC21739 = (InterfaceC21739) field.getAnnotation(InterfaceC21739.class);
                    if (interfaceC21739 != null) {
                        c164610 = c16469M38777;
                        abstractC8333M30728 = this.f16871.m33403(this.f16873, c12524, c16469M38777, interfaceC21739, false);
                    } else {
                        c164610 = c16469M38777;
                        abstractC8333M30728 = null;
                    }
                    boolean z11 = abstractC8333M30728 != null;
                    C16469 c164611 = c164610;
                    if (abstractC8333M30728 == null) {
                        abstractC8333M30728 = c12524.m30728(c164611);
                    }
                    AbstractC8333 c21634 = zM10351 ? abstractC8333M30728 : z11 ? abstractC8333M30728 : new C21634(c12524, abstractC8333M30728, c164611.m38779());
                    i = length;
                    C15988 c15988 = new C15988(str, field, z3, method, c21634, abstractC8333M30728, z9, z10);
                    if (z4) {
                        for (String str2 : listSingletonList) {
                            AbstractC3995 abstractC3996 = (AbstractC3995) linkedHashMap.put(str2, c15988);
                            if (abstractC3996 != null) {
                                m15475(cls, str2, abstractC3996.f12662, field);
                                throw null;
                            }
                        }
                    }
                    if (!zM10351 && (abstractC3995 = (AbstractC3995) linkedHashMap2.put(str, c15988)) != null) {
                        m15475(cls, str, abstractC3995.f12662, field);
                        throw null;
                    }
                }
                i2++;
                z6 = true;
                length = i;
                z7 = false;
            }
            c16469M38776 = C16469.m38776(C6216.m17130(clsM38778, c16469M38776.m38779(), clsM38778.getGenericSuperclass()));
            clsM38778 = c16469M38776.m38778();
            z5 = z3;
        }
        return new C19518(new ArrayList(linkedHashMap2.values()), linkedHashMap);
    }
}
