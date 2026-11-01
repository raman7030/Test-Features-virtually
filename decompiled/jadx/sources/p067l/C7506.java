package p067l;

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
public final class C7506 implements InterfaceC16992 {

    /* JADX INFO: renamed from: ۗ */
    public final List f19708;

    /* JADX INFO: renamed from: ۙ */
    public final C15631 f19709;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC16952 f19710;

    /* JADX INFO: renamed from: ᩸ */
    public final C21688 f19711;

    /* JADX INFO: renamed from: ᩹ */
    public final C5594 f19712;

    public C7506(C21688 c21688, InterfaceC16952 interfaceC16952, C5594 c5594, C15631 c15631) {
        List list = Collections.EMPTY_LIST;
        this.f19711 = c21688;
        this.f19710 = interfaceC16952;
        this.f19712 = c5594;
        this.f19709 = c15631;
        this.f19708 = list;
    }

    @Override // p067l.InterfaceC16992
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10288 mo10810(C14271 c14271, C18020 c18020) {
        Class clsM41004 = c18020.m41004();
        if (!Object.class.isAssignableFrom(clsM41004)) {
            return null;
        }
        int i = C15140.f43223;
        if (!Modifier.isStatic(clsM41004.getModifiers()) && (clsM41004.isAnonymousClass() || clsM41004.isLocalClass())) {
            return new C10859();
        }
        List list = Collections.EMPTY_LIST;
        EnumC11630 enumC11630M10406 = C4904.m10406(clsM41004);
        if (enumC11630M10406 == EnumC11630.BLOCK_ALL) {
            throw new C15611(C22934.m51253(clsM41004, "ReflectionAccessFilter does not permit using reflection for ", ". Register a TypeAdapter for this type or adjust the access filter."));
        }
        boolean z = enumC11630M10406 == EnumC11630.BLOCK_INACCESSIBLE;
        return C15140.m34574(clsM41004) ? new C2811(clsM41004, m17385(c14271, c18020, clsM41004, z, true), z) : new C20247(this.f19711.m48962(c18020, true), m17385(c14271, c18020, clsM41004, z, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m17387(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!C4904.m10407(obj, accessibleObject)) {
            throw new C15611(C17588.m40053(C15140.m34565(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17386(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + C15140.m34567(field) + " and " + C15140.m34567(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX INFO: renamed from: ֫ */
    private C20918 m17385(C14271 c14271, C18020 c18020, Class cls, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        Method method;
        String strValue;
        List listAsList;
        List<String> listSingletonList;
        C18020 c18021;
        AbstractC10288 abstractC10288M32800;
        int i;
        AbstractC6165 abstractC6165;
        if (cls.isInterface()) {
            return C20918.f65700;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C18020 c18020M41002 = c18020;
        boolean z5 = z;
        Class clsM41004 = cls;
        while (clsM41004 != Object.class) {
            Field[] declaredFields = clsM41004.getDeclaredFields();
            boolean z6 = true;
            boolean z7 = false;
            if (clsM41004 == cls || declaredFields.length <= 0) {
                z3 = z5;
            } else {
                List list = Collections.EMPTY_LIST;
                EnumC11630 enumC11630M10406 = C4904.m10406(clsM41004);
                if (enumC11630M10406 == EnumC11630.BLOCK_ALL) {
                    throw new C15611("ReflectionAccessFilter does not permit using reflection for " + clsM41004 + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z3 = enumC11630M10406 == EnumC11630.BLOCK_INACCESSIBLE;
            }
            int length = declaredFields.length;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                C5594 c5594 = this.f19712;
                boolean zM12390 = c5594.m12390(field, z6);
                boolean zM12391 = c5594.m12390(field, z7);
                boolean z8 = !zM12391;
                if (zM12390 && zM12391) {
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
                        Method methodM34569 = C15140.m34569(clsM41004, field);
                        if (!z3) {
                            C15140.m34570(methodM34569);
                        }
                        if (methodM34569.getAnnotation(InterfaceC23699.class) != null && field.getAnnotation(InterfaceC23699.class) == null) {
                            throw new C15611(C6988.m16053("@SerializedName on ", C15140.m34565(methodM34569, z7), " is not supported"));
                        }
                        z4 = z8;
                        method = methodM34569;
                    }
                    if (!z3 && method == null) {
                        C15140.m34570((AccessibleObject) field);
                    }
                    Type typeM19062 = C8276.m19062(clsM41004, c18020M41002.m41005(), field.getGenericType());
                    InterfaceC23699 interfaceC23699 = (InterfaceC23699) field.getAnnotation(InterfaceC23699.class);
                    if (interfaceC23699 == null) {
                        InterfaceC16952 interfaceC16952 = this.f19710;
                        strValue = interfaceC16952.mo4615(field);
                        listAsList = interfaceC16952.mo4614(field);
                    } else {
                        strValue = interfaceC23699.value();
                        listAsList = Arrays.asList(interfaceC23699.alternate());
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
                    C18020 c18020M41003 = C18020.m41002(typeM19062);
                    Class clsM41005 = c18020M41003.m41004();
                    boolean z9 = clsM41005 != null && clsM41005.isPrimitive();
                    int modifiers = field.getModifiers();
                    boolean z10 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
                    InterfaceC23029 interfaceC23029 = (InterfaceC23029) field.getAnnotation(InterfaceC23029.class);
                    if (interfaceC23029 != null) {
                        c18021 = c18020M41003;
                        abstractC10288M32800 = this.f19709.m35522(this.f19711, c14271, c18020M41003, interfaceC23029, false);
                    } else {
                        c18021 = c18020M41003;
                        abstractC10288M32800 = null;
                    }
                    boolean z11 = abstractC10288M32800 != null;
                    C18020 c18022 = c18021;
                    if (abstractC10288M32800 == null) {
                        abstractC10288M32800 = c14271.m32800(c18022);
                    }
                    AbstractC10288 c22929 = zM12390 ? abstractC10288M32800 : z11 ? abstractC10288M32800 : new C22929(c14271, abstractC10288M32800, c18022.m41005());
                    i = length;
                    C17563 c17563 = new C17563(str, field, z3, method, c22929, abstractC10288M32800, z9, z10);
                    if (z4) {
                        for (String str2 : listSingletonList) {
                            AbstractC6165 abstractC6166 = (AbstractC6165) linkedHashMap.put(str2, c17563);
                            if (abstractC6166 != null) {
                                m17386(cls, str2, abstractC6166.f15478, field);
                                throw null;
                            }
                        }
                    }
                    if (!zM12390 && (abstractC6165 = (AbstractC6165) linkedHashMap2.put(str, c17563)) != null) {
                        m17386(cls, str, abstractC6165.f15478, field);
                        throw null;
                    }
                }
                i2++;
                z6 = true;
                length = i;
                z7 = false;
            }
            c18020M41002 = C18020.m41002(C8276.m19062(clsM41004, c18020M41002.m41005(), clsM41004.getGenericSuperclass()));
            clsM41004 = c18020M41002.m41004();
            z5 = z3;
        }
        return new C20918(new ArrayList(linkedHashMap2.values()), linkedHashMap);
    }
}
