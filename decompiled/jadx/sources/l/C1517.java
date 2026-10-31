package l;

import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֫֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AVO */
/* JADX INFO: loaded from: classes2.dex */
public class C1517 implements InterfaceC19157 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f5376;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC18451[] f5377;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10690 f5378;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public transient long[] f5379;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Class f5380;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC18451[] f5381;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ConcurrentMapC10942 f5382;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public transient int[] f5383;

    /* JADX WARN: Code duplicated, block: B:171:0x03de  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:187:0x0416  */
    /* JADX WARN: Code duplicated, block: B:190:0x041e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0424  */
    /* JADX WARN: Code duplicated, block: B:193:0x042f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0445  */
    /* JADX WARN: Code duplicated, block: B:196:0x0461  */
    /* JADX WARN: Code duplicated, block: B:200:0x046e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0478  */
    /* JADX WARN: Code duplicated, block: B:203:0x0496  */
    /* JADX WARN: Code duplicated, block: B:205:0x049a  */
    /* JADX WARN: Code duplicated, block: B:206:0x049f  */
    /* JADX WARN: Code duplicated, block: B:208:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:209:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:227:0x053a A[PHI: r35 r36 r37
      0x053a: PHI (r35v2 int) = (r35v1 int), (r35v1 int), (r35v3 int), (r35v3 int) binds: [B:219:0x04f4, B:221:0x04fe, B:225:0x0536, B:226:0x0538] A[DONT_GENERATE, DONT_INLINE]
      0x053a: PHI (r36v2 int) = (r36v1 int), (r36v1 int), (r36v3 int), (r36v3 int) binds: [B:219:0x04f4, B:221:0x04fe, B:225:0x0536, B:226:0x0538] A[DONT_GENERATE, DONT_INLINE]
      0x053a: PHI (r37v1 l.۬۟ۡ) = (r37v0 l.۬۟ۡ), (r37v0 l.۬۟ۡ), (r37v0 l.۬۟ۡ), (r37v2 l.۬۟ۡ) binds: [B:219:0x04f4, B:221:0x04fe, B:225:0x0536, B:226:0x0538] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:233:0x0588  */
    /* JADX WARN: Code duplicated, block: B:236:0x0593  */
    /* JADX WARN: Code duplicated, block: B:238:0x0597  */
    /* JADX WARN: Code duplicated, block: B:242:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:244:0x05af  */
    /* JADX WARN: Code duplicated, block: B:248:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:250:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:252:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:254:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:255:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:257:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:262:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:265:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:271:0x0610  */
    /* JADX WARN: Code duplicated, block: B:273:0x0622  */
    /* JADX WARN: Code duplicated, block: B:275:0x0630  */
    /* JADX WARN: Code duplicated, block: B:281:0x0641  */
    /* JADX WARN: Code duplicated, block: B:283:0x0657  */
    /* JADX WARN: Code duplicated, block: B:285:0x0662  */
    /* JADX WARN: Code duplicated, block: B:289:0x068a  */
    /* JADX WARN: Code duplicated, block: B:291:0x0696  */
    /* JADX WARN: Code duplicated, block: B:305:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:308:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:314:0x0776  */
    /* JADX WARN: Code duplicated, block: B:324:0x0799  */
    /* JADX WARN: Code duplicated, block: B:327:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:329:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:334:0x07c7 A[LOOP:12: B:333:0x07c5->B:334:0x07c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:348:0x0573 A[EDGE_INSN: B:348:0x0573->B:230:0x0573 BREAK  A[LOOP:3: B:173:0x03e4->B:229:0x0568], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x05b5 A[EDGE_INSN: B:351:0x05b5->B:246:0x05b5 BREAK  A[LOOP:4: B:231:0x0582->B:245:0x05b2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x05b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x05b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x0602 A[EDGE_INSN: B:357:0x0602->B:268:0x0602 BREAK  A[LOOP:5: B:247:0x05b9->B:267:0x05f9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x05f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x0637 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x060a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x0631 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x07b1 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:202:0x0478, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:308:0x06e0, please report this as an issue */
    public C1517(C23389 c23389, Class cls, Type type) {
        Constructor<?> constructor;
        Class<? super Object> cls2;
        Method[] methodArr;
        Constructor<?> constructor2;
        Field[] fieldArr;
        Constructor<?> constructor3;
        int i;
        Class<? super Object> cls3;
        Constructor<?> constructor4;
        Object obj;
        Class<InterfaceC12966> cls4;
        Field[] fieldArr2;
        Method method;
        Object obj2;
        HashMap map;
        Class<InterfaceC12966> cls5;
        InterfaceC12966 interfaceC12966;
        Class<InterfaceC12966> cls6;
        String str;
        int iOrdinal;
        int iM47652;
        C10690 c10690;
        HashMap map2;
        InterfaceC12966 interfaceC12967;
        Constructor<?> constructor5;
        InterfaceC12966 interfaceC12968;
        C15896[] c15896Arr;
        int length;
        int i2;
        C15896[] c15896Arr2;
        int length2;
        int i3;
        C15896 c15896;
        Class cls7;
        AbstractC18451 c17745;
        int i4;
        Constructor<?> constructor6;
        Class cls8;
        int i5;
        int i6;
        Class<InterfaceC12966> cls9;
        Class<? super Object> cls10;
        ArrayList<Field> arrayList;
        int length3;
        int i7;
        Class<Collection> cls11;
        Class<Map> cls12;
        Class<? super Object> superclass;
        Class cls13;
        int i8;
        int i9;
        int i10;
        Method method2;
        String name;
        Class<?> returnType;
        InterfaceC12966 interfaceC12969;
        String strName;
        String name2;
        int size;
        int i11;
        boolean z;
        InterfaceC12966 interfaceC129610;
        String strName2;
        int i12;
        int i13;
        Class<? super Object> cls14;
        Field[] declaredFields;
        int length4;
        int i14;
        Field field;
        int modifiers;
        Class cls15;
        Class<?> type2;
        Field field2;
        int modifiers2;
        Class<?> type3;
        Method method3;
        String name3;
        Class<?> returnType2;
        InterfaceC12966 interfaceC12966M44740;
        int iOrdinal2;
        int iM47653;
        char cCharAt;
        String strM44736;
        Field fieldM44737;
        InterfaceC12966 interfaceC129611;
        Method method4;
        int modifiers3 = cls.getModifiers();
        ArrayList arrayList2 = new ArrayList();
        HashMap map3 = new HashMap();
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        boolean zM44757 = C19426.m44757(cls);
        int i15 = modifiers3 & 1024;
        int i16 = 0;
        Constructor<?> declaredConstructor = null;
        if (i15 == 0 && (declaredConstructors.length == 1 || !zM44757)) {
            try {
                declaredConstructor = cls.getDeclaredConstructor(null);
            } catch (Exception unused) {
            }
            if (declaredConstructor != null || !cls.isMemberClass() || (modifiers3 & 8) != 0) {
                constructor = declaredConstructor;
                break;
            }
            int length5 = declaredConstructors.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length5) {
                    constructor = declaredConstructor;
                    break;
                }
                Constructor<?> constructor7 = declaredConstructors[i17];
                Class<?>[] parameterTypes = constructor7.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].equals(cls.getDeclaringClass())) {
                    constructor = constructor7;
                    break;
                }
                i17++;
            }
        } else {
            constructor = null;
        }
        ArrayList arrayList3 = new ArrayList();
        Method method5 = null;
        Class superclass2 = cls;
        while (true) {
            cls2 = Object.class;
            if (superclass2 == null || superclass2 == cls2) {
                break;
            }
            Method[] declaredMethods = superclass2.getDeclaredMethods();
            int length6 = declaredMethods.length;
            while (i16 < length6) {
                int i18 = length6;
                Method method6 = declaredMethods[i16];
                Method[] methodArr2 = declaredMethods;
                int modifiers4 = method6.getModifiers();
                if ((modifiers4 & 8) != 0) {
                    if (method6.isAnnotationPresent(InterfaceC3089.class)) {
                        if (method5 != null) {
                            throw new C15082("multi-json creator");
                        }
                        method5 = method6;
                    }
                    i16++;
                    length6 = i18;
                    declaredMethods = methodArr2;
                } else {
                    if ((modifiers4 & 2) == 0) {
                        method4 = method5;
                        if ((modifiers4 & 256) == 0 && (modifiers4 & 4) == 0) {
                            arrayList3.add(method6);
                        }
                    }
                    method5 = method4;
                    i16++;
                    length6 = i18;
                    declaredMethods = methodArr2;
                }
                method4 = method5;
                method5 = method4;
                i16++;
                length6 = i18;
                declaredMethods = methodArr2;
            }
            superclass2 = superclass2.getSuperclass();
            i16 = 0;
        }
        int size2 = arrayList3.size();
        Method[] methodArr3 = new Method[size2];
        arrayList3.toArray(methodArr3);
        Field[] declaredFields2 = cls.getDeclaredFields();
        boolean z2 = cls.isInterface() || i15 != 0;
        Class<InterfaceC12966> cls16 = InterfaceC12966.class;
        String[] strArr = null;
        if (constructor == null || z2) {
            Object obj3 = InterfaceC12261.class;
            int length7 = declaredConstructors.length;
            methodArr = methodArr3;
            int i19 = 0;
            while (true) {
                if (i19 >= length7) {
                    constructor2 = null;
                    break;
                }
                int i20 = length7;
                constructor2 = declaredConstructors[i19];
                if (((InterfaceC3089) constructor2.getAnnotation(InterfaceC3089.class)) != null) {
                    break;
                }
                i19++;
                length7 = i20;
            }
            Constructor<?> constructor8 = constructor2;
            String str2 = "illegal json creator";
            if (constructor8 == null) {
                fieldArr = declaredFields2;
                constructor3 = constructor8;
                i = size2;
                cls3 = cls2;
                constructor4 = constructor;
                obj = obj3;
                cls4 = cls16;
                if (method5 != null) {
                    C19426.m44742(cls, method5, modifiers3);
                    Class<?>[] parameterTypes2 = method5.getParameterTypes();
                    if (parameterTypes2.length > 0) {
                        Type[] genericParameterTypes = method5.getGenericParameterTypes();
                        Annotation[][] parameterAnnotations = method5.getParameterAnnotations();
                        int i21 = 0;
                        while (i21 < parameterTypes2.length) {
                            Annotation[] annotationArr = parameterAnnotations[i21];
                            int length8 = annotationArr.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 >= length8) {
                                    interfaceC12967 = null;
                                    break;
                                }
                                Annotation annotation = annotationArr[i22];
                                if (annotation instanceof InterfaceC12966) {
                                    interfaceC12967 = (InterfaceC12966) annotation;
                                    break;
                                }
                                i22++;
                            }
                            if (interfaceC12967 == null) {
                                throw new C15082("illegal json creator");
                            }
                            Field[] fieldArr3 = fieldArr;
                            C10690.m26815(arrayList2, new C15896(interfaceC12967.name(), cls, parameterTypes2[i21], genericParameterTypes[i21], C19426.m44737(cls, interfaceC12967.name(), fieldArr3, map3), interfaceC12967.ordinal(), EnumC20837.m47652(interfaceC12967.serialzeFeatures())));
                            i21++;
                            fieldArr = fieldArr3;
                            parameterTypes2 = parameterTypes2;
                            map3 = map3;
                        }
                        int size3 = arrayList2.size();
                        C15896[] c15896Arr3 = new C15896[size3];
                        arrayList2.toArray(c15896Arr3);
                        C15896[] c15896Arr4 = new C15896[size3];
                        System.arraycopy(c15896Arr3, 0, c15896Arr4, 0, size3);
                        Arrays.sort(c15896Arr4);
                        c10690 = new C10690(cls, null, null, method5, c15896Arr3, Arrays.equals(c15896Arr3, c15896Arr4) ? c15896Arr3 : c15896Arr4, (InterfaceC12261) cls.getAnnotation(obj), null);
                        map2 = null;
                    }
                } else {
                    map3 = map3;
                    fieldArr2 = fieldArr;
                    if (z2) {
                        method = method5;
                        obj2 = obj;
                        map = map3;
                        cls5 = cls4;
                    } else {
                        if (!zM44757 || declaredConstructors.length <= 0) {
                            throw new C15082("default constructor not found. " + cls);
                        }
                        String[] strArrM44752 = C19426.m44752(cls);
                        if (strArrM44752 == null) {
                            throw new C15082("default constructor not found. " + cls);
                        }
                        Constructor<?> constructor9 = constructor3;
                        for (Constructor<?> constructor10 : declaredConstructors) {
                            Class<?>[] parameterTypes3 = constructor10.getParameterTypes();
                            if ((parameterTypes3.length <= 0 || !parameterTypes3[parameterTypes3.length - 1].getName().equals("l.᩺᩹᩵")) && (constructor9 == null || constructor9.getParameterTypes().length < parameterTypes3.length)) {
                                constructor9 = constructor10;
                            }
                        }
                        constructor9.setAccessible(true);
                        C19426.m44742(cls, constructor9, modifiers3);
                        Class<?>[] parameterTypes4 = constructor9.getParameterTypes();
                        Type[] genericParameterTypes2 = constructor9.getGenericParameterTypes();
                        Annotation[][] parameterAnnotations2 = constructor9.getParameterAnnotations();
                        int i23 = 0;
                        while (i23 < parameterTypes4.length) {
                            String str3 = strArrM44752[i23];
                            Annotation[] annotationArr2 = parameterAnnotations2[i23];
                            int length9 = annotationArr2.length;
                            int i24 = 0;
                            while (true) {
                                if (i24 >= length9) {
                                    interfaceC12966 = null;
                                    break;
                                }
                                Annotation annotation2 = annotationArr2[i24];
                                if (annotation2 instanceof InterfaceC12966) {
                                    interfaceC12966 = (InterfaceC12966) annotation2;
                                    break;
                                }
                                i24++;
                            }
                            Class<?> cls17 = parameterTypes4[i23];
                            Type type4 = genericParameterTypes2[i23];
                            HashMap map4 = map3;
                            Field fieldM44738 = C19426.m44737(cls, str3, fieldArr2, map4);
                            if (fieldM44738 == null || interfaceC12966 != null) {
                                cls6 = cls4;
                            } else {
                                cls6 = cls4;
                                interfaceC12966 = (InterfaceC12966) fieldM44738.getAnnotation(cls6);
                            }
                            if (interfaceC12966 != null) {
                                iOrdinal = interfaceC12966.ordinal();
                                iM47652 = EnumC20837.m47652(interfaceC12966.serialzeFeatures());
                                String strName3 = interfaceC12966.name();
                                str = strName3.length() != 0 ? strName3 : str3;
                            } else {
                                str = str3;
                                iOrdinal = 0;
                                iM47652 = 0;
                            }
                            C10690.m26815(arrayList2, new C15896(str, cls, cls17, type4, fieldM44738, iOrdinal, iM47652));
                            i23++;
                            cls4 = cls6;
                            map3 = map4;
                            method5 = method5;
                            constructor9 = constructor9;
                            obj = obj;
                        }
                        constructor3 = constructor9;
                        method = method5;
                        obj2 = obj;
                        map = map3;
                        cls5 = cls4;
                        int size4 = arrayList2.size();
                        C15896[] c15896Arr5 = new C15896[size4];
                        arrayList2.toArray(c15896Arr5);
                        C15896[] c15896Arr6 = new C15896[size4];
                        System.arraycopy(c15896Arr5, 0, c15896Arr6, 0, size4);
                        Arrays.sort(c15896Arr6);
                        String[] strArr2 = new String[size4];
                        for (int i25 = 0; i25 < size4; i25++) {
                            strArr2[i25] = c15896Arr5[i25].f49123;
                        }
                        strArr = strArr2;
                    }
                    constructor6 = constructor4;
                    if (constructor4 != null) {
                        C19426.m44742(cls, constructor6, modifiers3);
                    }
                    cls8 = cls;
                    i5 = 0;
                    while (true) {
                        i6 = i;
                        if (i5 < i6) {
                            break;
                        }
                        method3 = methodArr[i5];
                        name3 = method3.getName();
                        if (name3.length() < 4 && (((returnType2 = method3.getReturnType()) == Void.TYPE || returnType2 == method3.getDeclaringClass()) && method3.getParameterTypes().length == 1)) {
                            InterfaceC12966 interfaceC129612 = (InterfaceC12966) method3.getAnnotation(cls5);
                            interfaceC12966M44740 = interfaceC129612 == null ? C19426.m44740(method3, cls8) : interfaceC129612;
                            if (interfaceC12966M44740 != null) {
                                if (interfaceC12966M44740.deserialize()) {
                                    iOrdinal2 = interfaceC12966M44740.ordinal();
                                    iM47653 = EnumC20837.m47652(interfaceC12966M44740.serialzeFeatures());
                                    if (interfaceC12966M44740.name().length() != 0) {
                                        C10690.m26815(arrayList2, new C15896(interfaceC12966M44740.name(), method3, null, cls8, type, iOrdinal2, iM47653, interfaceC12966M44740, null));
                                        C19426.m44742(cls8, method3, modifiers3);
                                    }
                                }
                                i6 = i6;
                                i5 = i5;
                                map = map;
                                cls3 = cls3;
                                cls5 = cls5;
                            } else {
                                iOrdinal2 = 0;
                                iM47653 = 0;
                            }
                            if (name3.startsWith("set")) {
                                cCharAt = name3.charAt(3);
                                if (Character.isUpperCase(cCharAt)) {
                                    int i26 = C19426.f62834;
                                    strM44736 = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                                } else if (cCharAt == '_') {
                                    strM44736 = name3.substring(4);
                                } else if (cCharAt == 'f') {
                                    strM44736 = name3.substring(3);
                                } else if (name3.length() >= 5 || !Character.isUpperCase(name3.charAt(4))) {
                                    i6 = i6;
                                    i5 = i5;
                                    map = map;
                                    cls3 = cls3;
                                    cls5 = cls5;
                                } else {
                                    strM44736 = C19426.m44736(name3.substring(3));
                                }
                                fieldM44737 = C19426.m44737(cls8, strM44736, fieldArr2, map);
                                if (fieldM44737 == null && method3.getParameterTypes()[0] == Boolean.TYPE) {
                                    fieldM44737 = C19426.m44737(cls8, am.ae + Character.toUpperCase(strM44736.charAt(0)) + strM44736.substring(1), fieldArr2, map);
                                }
                                if (fieldM44737 != null || (interfaceC129611 = (InterfaceC12966) fieldM44737.getAnnotation(cls5)) == null) {
                                    C10690.m26815(arrayList2, new C15896(strM44736, method3, null, cls, type, iOrdinal2, iM47653, interfaceC12966M44740, null));
                                    C19426.m44742(cls, method3, modifiers3);
                                } else {
                                    iOrdinal2 = interfaceC129611.ordinal();
                                    iM47653 = EnumC20837.m47652(interfaceC129611.serialzeFeatures());
                                    if (interfaceC129611.name().length() != 0) {
                                        C10690.m26815(arrayList2, new C15896(interfaceC129611.name(), method3, fieldM44737, cls8, type, iOrdinal2, iM47653, interfaceC12966M44740, interfaceC129611));
                                    } else {
                                        if (interfaceC12966M44740 == null) {
                                            interfaceC12966M44740 = interfaceC129611;
                                        }
                                        C10690.m26815(arrayList2, new C15896(strM44736, method3, null, cls, type, iOrdinal2, iM47653, interfaceC12966M44740, null));
                                        C19426.m44742(cls, method3, modifiers3);
                                    }
                                }
                                cls8 = cls;
                            } else {
                                i6 = i6;
                                i5 = i5;
                                map = map;
                                cls3 = cls3;
                                cls5 = cls5;
                            }
                        } else {
                            i6 = i6;
                            i5 = i5;
                            map = map;
                            cls3 = cls3;
                            cls5 = cls5;
                        }
                        i5++;
                        cls5 = cls5;
                        map = map;
                        i = i6;
                        cls3 = cls3;
                    }
                    cls9 = cls5;
                    cls10 = cls3;
                    arrayList = new ArrayList(fieldArr2.length);
                    length3 = fieldArr2.length;
                    i7 = 0;
                    while (true) {
                        cls11 = Collection.class;
                        cls12 = Map.class;
                        if (i7 < length3) {
                            break;
                        }
                        field2 = fieldArr2[i7];
                        modifiers2 = field2.getModifiers();
                        if ((modifiers2 & 8) == 0) {
                            if ((modifiers2 & 16) != 0) {
                                type3 = field2.getType();
                                if (cls12.isAssignableFrom(type3) || cls11.isAssignableFrom(type3)) {
                                    if ((field2.getModifiers() & 1) != 0) {
                                        arrayList.add(field2);
                                    }
                                }
                            } else if ((field2.getModifiers() & 1) != 0) {
                                arrayList.add(field2);
                            }
                        }
                        i7++;
                    }
                    superclass = cls8.getSuperclass();
                    while (superclass != null) {
                        cls14 = cls10;
                        if (superclass != cls14) {
                            break;
                        }
                        declaredFields = superclass.getDeclaredFields();
                        length4 = declaredFields.length;
                        i14 = 0;
                        while (i14 < length4) {
                            field = declaredFields[i14];
                            modifiers = field.getModifiers();
                            if ((modifiers & 8) != 0) {
                                cls15 = cls8;
                            } else {
                                if ((modifiers & 16) != 0) {
                                    cls15 = cls8;
                                    type2 = field.getType();
                                    if (!cls12.isAssignableFrom(type2) || cls11.isAssignableFrom(type2)) {
                                    }
                                } else {
                                    cls15 = cls8;
                                }
                                if ((modifiers & 1) != 0) {
                                    arrayList.add(field);
                                }
                            }
                            i14++;
                            cls8 = cls15;
                        }
                        superclass = superclass.getSuperclass();
                        cls10 = cls14;
                    }
                    Class cls18 = cls8;
                    cls13 = cls18;
                    for (Field field3 : arrayList) {
                        name2 = field3.getName();
                        size = arrayList2.size();
                        z = false;
                        for (i11 = 0; i11 < size; i11++) {
                            if (((C15896) arrayList2.get(i11)).f49123.equals(name2)) {
                                z = true;
                            }
                        }
                        if (!z) {
                            interfaceC129610 = (InterfaceC12966) field3.getAnnotation(cls9);
                            if (interfaceC129610 != null) {
                                int iOrdinal3 = interfaceC129610.ordinal();
                                int iM47654 = EnumC20837.m47652(interfaceC129610.serialzeFeatures());
                                strName2 = interfaceC129610.name().length() != 0 ? interfaceC129610.name() : name2;
                                i12 = iOrdinal3;
                                i13 = iM47654;
                            } else {
                                strName2 = name2;
                                i12 = 0;
                                i13 = 0;
                            }
                            C19426.m44742(cls13, field3, modifiers3);
                            C10690.m26815(arrayList2, new C15896(strName2, null, field3, cls13, type, i12, i13, null, interfaceC129610));
                            cls13 = cls;
                        }
                    }
                    i8 = 4;
                    i9 = i6;
                    i10 = 0;
                    while (i10 < i9) {
                        method2 = methodArr[i10];
                        name = method2.getName();
                        if (name.length() >= i8 && name.startsWith("get") && Character.isUpperCase(name.charAt(3)) && method2.getParameterTypes().length == 0) {
                            returnType = method2.getReturnType();
                            if (!cls11.isAssignableFrom(returnType) || cls12.isAssignableFrom(returnType)) {
                                interfaceC12969 = (InterfaceC12966) method2.getAnnotation(cls9);
                                if (interfaceC12969 != null) {
                                    strName = interfaceC12969.name();
                                    strName = strName.length() <= 0 ? Character.toLowerCase(name.charAt(3)) + name.substring(i8) : strName;
                                }
                                C10690.m26815(arrayList2, new C15896(strName, method2, null, cls, type, 0, 0, interfaceC12969, null));
                                C19426.m44742(cls, method2, modifiers3);
                            }
                        }
                        i10++;
                        cls11 = cls11;
                        cls12 = cls12;
                        i9 = i9;
                        i8 = 4;
                    }
                    int size5 = arrayList2.size();
                    C15896[] c15896Arr7 = new C15896[size5];
                    arrayList2.toArray(c15896Arr7);
                    C15896[] c15896Arr8 = new C15896[size5];
                    System.arraycopy(c15896Arr7, 0, c15896Arr8, 0, size5);
                    Arrays.sort(c15896Arr8);
                    c10690 = new C10690(cls, constructor6, constructor3, method, c15896Arr7, c15896Arr8, (InterfaceC12261) cls.getAnnotation(obj2), strArr);
                    map2 = null;
                }
                this.f5380 = cls;
                this.f5378 = c10690;
                c15896Arr = c10690.f32184;
                this.f5377 = new AbstractC18451[c15896Arr.length];
                length = c15896Arr.length;
                for (i2 = 0; i2 < length; i2++) {
                    c15896 = c15896Arr[i2];
                    cls7 = c15896.f49114;
                    if (cls7 != List.class || cls7 == ArrayList.class || (cls7.isArray() && !cls7.getComponentType().isPrimitive())) {
                        c17745 = new C17745(cls, c15896);
                    } else {
                        c17745 = new C10145(cls, c15896);
                    }
                    this.f5377[i2] = c17745;
                    for (String str4 : c15896.f49125) {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        map2.put(str4, c17745);
                    }
                }
                this.f5376 = map2;
                c15896Arr2 = c10690.f32179;
                this.f5381 = new AbstractC18451[c15896Arr2.length];
                length2 = c15896Arr2.length;
                for (i3 = 0; i3 < length2; i3++) {
                    this.f5381[i3] = m5205(c15896Arr2[i3].f49123);
                }
            }
            C19426.m44742(cls, constructor8, modifiers3);
            Class<?>[] parameterTypes5 = constructor8.getParameterTypes();
            Type[] genericParameterTypes3 = constructor8.getGenericParameterTypes();
            Annotation[][] parameterAnnotations3 = constructor8.getParameterAnnotations();
            int i27 = 0;
            while (i27 < parameterTypes5.length) {
                Annotation[] annotationArr3 = parameterAnnotations3[i27];
                int length10 = annotationArr3.length;
                String str5 = str2;
                int i28 = 0;
                while (true) {
                    if (i28 >= length10) {
                        interfaceC12968 = null;
                        break;
                    }
                    int i29 = length10;
                    Annotation annotation3 = annotationArr3[i28];
                    Annotation[] annotationArr4 = annotationArr3;
                    if (annotation3 instanceof InterfaceC12966) {
                        interfaceC12968 = (InterfaceC12966) annotation3;
                        break;
                    } else {
                        i28++;
                        length10 = i29;
                        annotationArr3 = annotationArr4;
                    }
                }
                if (interfaceC12968 == null) {
                    throw new C15082(str5);
                }
                Class<?> cls19 = parameterTypes5[i27];
                Type type5 = genericParameterTypes3[i27];
                Field fieldM44739 = C19426.m44737(cls, interfaceC12968.name(), declaredFields2, map3);
                if (fieldM44739 != null) {
                    C19426.m44742(cls, fieldM44739, modifiers3);
                }
                C10690.m26815(arrayList2, new C15896(interfaceC12968.name(), cls, cls19, type5, fieldM44739, interfaceC12968.ordinal(), EnumC20837.m47652(interfaceC12968.serialzeFeatures())));
                i27++;
                str2 = str5;
                declaredFields2 = declaredFields2;
                constructor8 = constructor8;
                cls2 = cls2;
                parameterTypes5 = parameterTypes5;
                size2 = size2;
                cls16 = cls16;
                obj3 = obj3;
                constructor = constructor;
            }
            fieldArr = declaredFields2;
            constructor3 = constructor8;
            i = size2;
            cls3 = cls2;
            constructor4 = constructor;
            obj = obj3;
            cls4 = cls16;
            int size6 = arrayList2.size();
            C15896[] c15896Arr9 = new C15896[size6];
            arrayList2.toArray(c15896Arr9);
            C15896[] c15896Arr10 = new C15896[size6];
            System.arraycopy(c15896Arr9, 0, c15896Arr10, 0, size6);
            Arrays.sort(c15896Arr10);
            String[] strArr3 = new String[size6];
            for (int i30 = 0; i30 < size6; i30++) {
                strArr3[i30] = c15896Arr9[i30].f49123;
            }
            strArr = strArr3;
            fieldArr2 = fieldArr;
            constructor5 = constructor3;
        } else {
            constructor5 = null;
            cls4 = cls16;
            methodArr = methodArr3;
            i = size2;
            cls3 = cls2;
            constructor4 = constructor;
            obj = InterfaceC12261.class;
            fieldArr2 = declaredFields2;
        }
        constructor3 = constructor5;
        method = method5;
        obj2 = obj;
        map = map3;
        cls5 = cls4;
        constructor6 = constructor4;
        if (constructor4 != null) {
            C19426.m44742(cls, constructor6, modifiers3);
        }
        cls8 = cls;
        i5 = 0;
        while (true) {
            i6 = i;
            if (i5 < i6) {
                break;
                break;
            }
            method3 = methodArr[i5];
            name3 = method3.getName();
            if (name3.length() < 4) {
                i6 = i6;
                i5 = i5;
                map = map;
                cls3 = cls3;
                cls5 = cls5;
            } else {
                InterfaceC12966 interfaceC129613 = (InterfaceC12966) method3.getAnnotation(cls5);
                interfaceC12966M44740 = interfaceC129613 == null ? C19426.m44740(method3, cls8) : interfaceC129613;
                if (interfaceC12966M44740 != null) {
                    if (interfaceC12966M44740.deserialize()) {
                        iOrdinal2 = interfaceC12966M44740.ordinal();
                        iM47653 = EnumC20837.m47652(interfaceC12966M44740.serialzeFeatures());
                        if (interfaceC12966M44740.name().length() != 0) {
                            C10690.m26815(arrayList2, new C15896(interfaceC12966M44740.name(), method3, null, cls8, type, iOrdinal2, iM47653, interfaceC12966M44740, null));
                            C19426.m44742(cls8, method3, modifiers3);
                        }
                    }
                    i6 = i6;
                    i5 = i5;
                    map = map;
                    cls3 = cls3;
                    cls5 = cls5;
                } else {
                    iOrdinal2 = 0;
                    iM47653 = 0;
                }
                if (name3.startsWith("set")) {
                    i6 = i6;
                    i5 = i5;
                    map = map;
                    cls3 = cls3;
                    cls5 = cls5;
                } else {
                    cCharAt = name3.charAt(3);
                    if (Character.isUpperCase(cCharAt)) {
                        int i210 = C19426.f62834;
                        strM44736 = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                    } else if (cCharAt == '_') {
                        strM44736 = name3.substring(4);
                    } else if (cCharAt == 'f') {
                        strM44736 = name3.substring(3);
                    } else {
                        if (name3.length() >= 5) {
                        }
                        i6 = i6;
                        i5 = i5;
                        map = map;
                        cls3 = cls3;
                        cls5 = cls5;
                    }
                    fieldM44737 = C19426.m44737(cls8, strM44736, fieldArr2, map);
                    if (fieldM44737 == null) {
                        fieldM44737 = C19426.m44737(cls8, am.ae + Character.toUpperCase(strM44736.charAt(0)) + strM44736.substring(1), fieldArr2, map);
                    }
                    if (fieldM44737 != null) {
                        C10690.m26815(arrayList2, new C15896(strM44736, method3, null, cls, type, iOrdinal2, iM47653, interfaceC12966M44740, null));
                        C19426.m44742(cls, method3, modifiers3);
                    } else {
                        C10690.m26815(arrayList2, new C15896(strM44736, method3, null, cls, type, iOrdinal2, iM47653, interfaceC12966M44740, null));
                        C19426.m44742(cls, method3, modifiers3);
                    }
                    cls8 = cls;
                }
            }
            i5++;
            cls5 = cls5;
            map = map;
            i = i6;
            cls3 = cls3;
        }
        cls9 = cls5;
        cls10 = cls3;
        arrayList = new ArrayList(fieldArr2.length);
        length3 = fieldArr2.length;
        i7 = 0;
        while (true) {
            cls11 = Collection.class;
            cls12 = Map.class;
            if (i7 < length3) {
                break;
                break;
            }
            field2 = fieldArr2[i7];
            modifiers2 = field2.getModifiers();
            if ((modifiers2 & 8) == 0) {
                if ((modifiers2 & 16) != 0) {
                    type3 = field2.getType();
                    if (cls12.isAssignableFrom(type3)) {
                        if ((field2.getModifiers() & 1) != 0) {
                            arrayList.add(field2);
                        }
                    } else if ((field2.getModifiers() & 1) != 0) {
                        arrayList.add(field2);
                    }
                } else if ((field2.getModifiers() & 1) != 0) {
                    arrayList.add(field2);
                }
            }
            i7++;
        }
        superclass = cls8.getSuperclass();
        while (superclass != null) {
            cls14 = cls10;
            if (superclass != cls14) {
                break;
                break;
            }
            declaredFields = superclass.getDeclaredFields();
            length4 = declaredFields.length;
            i14 = 0;
            while (i14 < length4) {
                field = declaredFields[i14];
                modifiers = field.getModifiers();
                if ((modifiers & 8) != 0) {
                    cls15 = cls8;
                } else {
                    if ((modifiers & 16) != 0) {
                        cls15 = cls8;
                        type2 = field.getType();
                        if (!cls12.isAssignableFrom(type2)) {
                        }
                    } else {
                        cls15 = cls8;
                    }
                    if ((modifiers & 1) != 0) {
                        arrayList.add(field);
                    }
                }
                i14++;
                cls8 = cls15;
            }
            superclass = superclass.getSuperclass();
            cls10 = cls14;
        }
        Class cls110 = cls8;
        cls13 = cls110;
        while (r1.hasNext()) {
            name2 = field3.getName();
            size = arrayList2.size();
            z = false;
            while (i11 < size) {
                if (((C15896) arrayList2.get(i11)).f49123.equals(name2)) {
                    z = true;
                }
            }
            if (!z) {
                interfaceC129610 = (InterfaceC12966) field3.getAnnotation(cls9);
                if (interfaceC129610 != null) {
                    int iOrdinal4 = interfaceC129610.ordinal();
                    int iM47655 = EnumC20837.m47652(interfaceC129610.serialzeFeatures());
                    strName2 = interfaceC129610.name().length() != 0 ? interfaceC129610.name() : name2;
                    i12 = iOrdinal4;
                    i13 = iM47655;
                } else {
                    strName2 = name2;
                    i12 = 0;
                    i13 = 0;
                }
                C19426.m44742(cls13, field3, modifiers3);
                C10690.m26815(arrayList2, new C15896(strName2, null, field3, cls13, type, i12, i13, null, interfaceC129610));
                cls13 = cls;
            }
        }
        i8 = 4;
        i9 = i6;
        i10 = 0;
        while (i10 < i9) {
            method2 = methodArr[i10];
            name = method2.getName();
            if (name.length() >= i8) {
                returnType = method2.getReturnType();
                if (!cls11.isAssignableFrom(returnType)) {
                }
                interfaceC12969 = (InterfaceC12966) method2.getAnnotation(cls9);
                if (interfaceC12969 != null) {
                    strName = interfaceC12969.name();
                    if (strName.length() <= 0) {
                    }
                }
                C10690.m26815(arrayList2, new C15896(strName, method2, null, cls, type, 0, 0, interfaceC12969, null));
                C19426.m44742(cls, method2, modifiers3);
            }
            i10++;
            cls11 = cls11;
            cls12 = cls12;
            i9 = i9;
            i8 = 4;
        }
        int size7 = arrayList2.size();
        C15896[] c15896Arr11 = new C15896[size7];
        arrayList2.toArray(c15896Arr11);
        C15896[] c15896Arr12 = new C15896[size7];
        System.arraycopy(c15896Arr11, 0, c15896Arr12, 0, size7);
        Arrays.sort(c15896Arr12);
        c10690 = new C10690(cls, constructor6, constructor3, method, c15896Arr11, c15896Arr12, (InterfaceC12261) cls.getAnnotation(obj2), strArr);
        map2 = null;
        this.f5380 = cls;
        this.f5378 = c10690;
        c15896Arr = c10690.f32184;
        this.f5377 = new AbstractC18451[c15896Arr.length];
        length = c15896Arr.length;
        while (i2 < length) {
            c15896 = c15896Arr[i2];
            cls7 = c15896.f49114;
            if (cls7 != List.class) {
                c17745 = new C17745(cls, c15896);
            } else {
                c17745 = new C17745(cls, c15896);
            }
            this.f5377[i2] = c17745;
            while (i4 < r8) {
                if (map2 == null) {
                    map2 = new HashMap();
                }
                map2.put(str4, c17745);
            }
        }
        this.f5376 = map2;
        c15896Arr2 = c10690.f32179;
        this.f5381 = new AbstractC18451[c15896Arr2.length];
        length2 = c15896Arr2.length;
        while (i3 < length2) {
            this.f5381[i3] = m5205(c15896Arr2[i3].f49123);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m5203(C11556 c11556, Type type) {
        Object objNewInstance;
        boolean z = type instanceof Class;
        Class cls = this.f5380;
        if (z && cls.isInterface()) {
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{(Class) type}, new C21434(0, (c11556.f34488.f22495 & EnumC13671.OrderedField.f40811) != 0));
        }
        C10690 c10690 = this.f5378;
        Constructor constructor = c10690.f32181;
        int i = c10690.f32183;
        Method method = c10690.f32182;
        if ((constructor == null && method == null) || (method != null && i > 0)) {
            return null;
        }
        try {
            if (i != 0) {
                objNewInstance = constructor.newInstance(c11556.f34496.f42885);
            } else if (constructor != null) {
                objNewInstance = constructor.newInstance(null);
            } else {
                objNewInstance = method.invoke(null, null);
            }
            if (c11556 != null && (c11556.f34488.f22495 & EnumC13671.InitStringFieldAsEmpty.f40811) != 0) {
                for (C15896 c15896 : c10690.f32179) {
                    if (c15896.f49114 == String.class) {
                        Method method2 = c15896.f49127;
                        if (method2 != null) {
                            method2.invoke(objNewInstance, "");
                        } else {
                            c15896.f49124.set(objNewInstance, "");
                        }
                    }
                }
            }
            return objNewInstance;
        } catch (Exception e) {
            throw new C15082("create instance error, class ".concat(cls.getName()), (Throwable) e);
        }
    }

    @Override // l.InterfaceC19157
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object mo5204(C11556 c11556, Type type, Object obj) {
        return m5199(c11556, type, obj);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01aa A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01ae A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01bb A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c6 A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d6 A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01de  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e1 A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01ed A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x02ec A[Catch: IllegalAccessException -> 0x0359, TRY_LEAVE, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x02f6 A[Catch: IllegalAccessException -> 0x0359, TRY_ENTER, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:183:0x0301 A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x030c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0310 A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x0318  */
    /* JADX WARN: Code duplicated, block: B:190:0x031b A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0326 A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x0335 A[Catch: IllegalAccessException -> 0x0359, TRY_ENTER, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x033b  */
    /* JADX WARN: Code duplicated, block: B:201:0x0342  */
    /* JADX WARN: Code duplicated, block: B:228:0x033c A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private Object m5201(C11556 c11556, Type type, Object obj) {
        char c;
        String str;
        int i;
        int i2;
        char cCharAt;
        int i3;
        char cCharAt2;
        Enum enumValueOf;
        boolean z;
        int i4;
        char c2;
        int i5;
        char cCharAt3;
        int i6;
        char cCharAt4;
        String strM19614;
        C7322 c7322 = c11556.f34488;
        Object objM5203 = m5203(c11556, type);
        AbstractC18451[] abstractC18451Arr = this.f5377;
        int length = abstractC18451Arr.length;
        int i7 = 0;
        while (i7 < length) {
            char c3 = i7 == length + (-1) ? ']' : ',';
            AbstractC18451 abstractC18451 = abstractC18451Arr[i7];
            C15896 c15896 = abstractC18451.f57230;
            Class cls = c15896.f49114;
            Field field = c15896.f49124;
            boolean z2 = c15896.f49115;
            try {
                if (cls == Integer.TYPE) {
                    long jM19627 = c7322.m19627();
                    String str2 = c7322.f22489;
                    int i8 = c7322.f22493;
                    int i9 = (int) jM19627;
                    if (z2) {
                        field.setInt(objM5203, i9);
                    } else {
                        abstractC18451.mo17832(objM5203, new Integer(i9));
                    }
                    char c4 = c7322.f22497;
                    if (c4 == ',') {
                        int i10 = c7322.f22486 + 1;
                        c7322.f22486 = i10;
                        c7322.f22497 = i10 >= i8 ? (char) 26 : str2.charAt(i10);
                        c7322.f22491 = 16;
                    } else if (c4 == ']') {
                        int i11 = c7322.f22486 + 1;
                        c7322.f22486 = i11;
                        c7322.f22497 = i11 >= i8 ? (char) 26 : str2.charAt(i11);
                        c7322.f22491 = 15;
                    } else {
                        c7322.m19638();
                    }
                } else {
                    if (cls == String.class) {
                        char c5 = c7322.f22497;
                        int i12 = c7322.f22493;
                        String str3 = c7322.f22489;
                        if (c5 == '\"') {
                            strM19614 = c7322.m19614();
                        } else {
                            if (c5 != 'n' || !str3.startsWith("null", c7322.f22486)) {
                                throw new C15082("not match string. feild : " + obj);
                            }
                            int i13 = c7322.f22486 + 4;
                            c7322.f22486 = i13;
                            c7322.f22497 = i13 >= i12 ? (char) 26 : str3.charAt(i13);
                            strM19614 = null;
                        }
                        if (z2) {
                            field.set(objM5203, strM19614);
                        } else {
                            abstractC18451.mo17832(objM5203, strM19614);
                        }
                        char c6 = c7322.f22497;
                        if (c6 == ',') {
                            int i14 = c7322.f22486 + 1;
                            c7322.f22486 = i14;
                            c7322.f22497 = i14 >= i12 ? (char) 26 : str3.charAt(i14);
                            c7322.f22491 = 16;
                        } else if (c6 == ']') {
                            int i15 = c7322.f22486 + 1;
                            c7322.f22486 = i15;
                            c7322.f22497 = i15 >= i12 ? (char) 26 : str3.charAt(i15);
                            c7322.f22491 = 15;
                        } else {
                            c7322.m19638();
                        }
                    } else if (cls == Long.TYPE) {
                        long jM19628 = c7322.m19627();
                        String str4 = c7322.f22489;
                        int i16 = c7322.f22493;
                        if (z2) {
                            field.setLong(objM5203, jM19628);
                        } else {
                            abstractC18451.mo17832(objM5203, new Long(jM19628));
                        }
                        char c7 = c7322.f22497;
                        if (c7 == ',') {
                            int i17 = c7322.f22486 + 1;
                            c7322.f22486 = i17;
                            c7322.f22497 = i17 >= i16 ? (char) 26 : str4.charAt(i17);
                            c7322.f22491 = 16;
                        } else if (c7 == ']') {
                            int i18 = c7322.f22486 + 1;
                            c7322.f22486 = i18;
                            c7322.f22497 = i18 >= i16 ? (char) 26 : str4.charAt(i18);
                            c7322.f22491 = 15;
                        } else {
                            c7322.m19638();
                        }
                    } else if (cls == Boolean.TYPE) {
                        String str5 = c7322.f22489;
                        String str6 = c7322.f22489;
                        int i19 = c7322.f22493;
                        if (str5.startsWith("false", c7322.f22486)) {
                            i4 = 5;
                            z = false;
                        } else if (str5.startsWith("true", c7322.f22486)) {
                            z = true;
                            i4 = 4;
                        } else {
                            char c8 = c7322.f22497;
                            if (c8 == '1') {
                                z = true;
                            } else {
                                if (c8 == '0') {
                                    z = false;
                                } else {
                                    c7322.f22496 = -1;
                                    z = false;
                                }
                                if (z2) {
                                    field.setBoolean(objM5203, z);
                                } else {
                                    abstractC18451.mo17832(objM5203, Boolean.valueOf(z));
                                }
                                c2 = c7322.f22497;
                                if (c2 == ',') {
                                    i6 = c7322.f22486 + 1;
                                    c7322.f22486 = i6;
                                    if (i6 >= i19) {
                                        cCharAt4 = 26;
                                    } else {
                                        cCharAt4 = str6.charAt(i6);
                                    }
                                    c7322.f22497 = cCharAt4;
                                    c7322.f22491 = 16;
                                } else if (c2 == ']') {
                                    i5 = c7322.f22486 + 1;
                                    c7322.f22486 = i5;
                                    if (i5 >= i19) {
                                        cCharAt3 = 26;
                                    } else {
                                        cCharAt3 = str6.charAt(i5);
                                    }
                                    c7322.f22497 = cCharAt3;
                                    c7322.f22491 = 15;
                                } else {
                                    c7322.m19638();
                                }
                            }
                            i4 = 1;
                        }
                        int i20 = c7322.f22486 + i4;
                        c7322.f22486 = i20;
                        c7322.f22497 = c7322.m19616(i20);
                        if (z2) {
                            field.setBoolean(objM5203, z);
                        } else {
                            abstractC18451.mo17832(objM5203, Boolean.valueOf(z));
                        }
                        c2 = c7322.f22497;
                        if (c2 == ',') {
                            i6 = c7322.f22486 + 1;
                            c7322.f22486 = i6;
                            if (i6 >= i19) {
                                cCharAt4 = 26;
                            } else {
                                cCharAt4 = str6.charAt(i6);
                            }
                            c7322.f22497 = cCharAt4;
                            c7322.f22491 = 16;
                        } else if (c2 == ']') {
                            i5 = c7322.f22486 + 1;
                            c7322.f22486 = i5;
                            if (i5 >= i19) {
                                cCharAt3 = 26;
                            } else {
                                cCharAt3 = str6.charAt(i5);
                            }
                            c7322.f22497 = cCharAt3;
                            c7322.f22491 = 15;
                        } else {
                            c7322.m19638();
                        }
                    } else if (cls.isEnum()) {
                        char c9 = c7322.f22497;
                        String str7 = c7322.f22489;
                        int i21 = c7322.f22493;
                        if (c9 == '\"') {
                            String strM19618 = c7322.m19618(c11556.f34493);
                            enumValueOf = strM19618 == null ? null : Enum.valueOf(cls, strM19618);
                        } else {
                            if (c9 < '0' || c9 > '9') {
                                throw new C15082("illegal enum." + c7322.m19654());
                            }
                            int iM19627 = (int) c7322.m19627();
                            C10145 c10145 = (C10145) abstractC18451;
                            C23389 c23389 = c11556.f34495;
                            if (c10145.f30522 == null) {
                                C15896 c15897 = c10145.f57230;
                                c10145.f30522 = c23389.m51837(c15897.f49114, c15897.f49121);
                            }
                            enumValueOf = ((C22844) c10145.f30522).f73730[iM19627];
                        }
                        abstractC18451.mo17832(objM5203, enumValueOf);
                        char c10 = c7322.f22497;
                        if (c10 == ',') {
                            int i22 = c7322.f22486 + 1;
                            c7322.f22486 = i22;
                            c7322.f22497 = i22 >= i21 ? (char) 26 : str7.charAt(i22);
                            c7322.f22491 = 16;
                        } else if (c10 == ']') {
                            int i23 = c7322.f22486 + 1;
                            c7322.f22486 = i23;
                            c7322.f22497 = i23 >= i21 ? (char) 26 : str7.charAt(i23);
                            c7322.f22491 = 15;
                        } else {
                            c7322.m19638();
                        }
                    } else if (cls == Date.class) {
                        char c11 = c7322.f22497;
                        String str8 = c7322.f22489;
                        int i24 = c7322.f22493;
                        if (c11 == '1') {
                            abstractC18451.mo17832(objM5203, new Date(c7322.m19627()));
                            char c12 = c7322.f22497;
                            if (c12 == ',') {
                                int i25 = c7322.f22486 + 1;
                                c7322.f22486 = i25;
                                c7322.f22497 = i25 >= i24 ? (char) 26 : str8.charAt(i25);
                                c7322.f22491 = 16;
                            } else if (c12 == ']') {
                                int i26 = c7322.f22486 + 1;
                                c7322.f22486 = i26;
                                c7322.f22497 = i26 >= i24 ? (char) 26 : str8.charAt(i26);
                                c7322.f22491 = 15;
                            } else {
                                c7322.m19638();
                            }
                        } else {
                            c = c7322.f22497;
                            str = c7322.f22489;
                            i = c7322.f22493;
                            if (c == '[') {
                                i3 = c7322.f22486 + 1;
                                c7322.f22486 = i3;
                                if (i3 >= i) {
                                    cCharAt2 = 26;
                                } else {
                                    cCharAt2 = str.charAt(i3);
                                }
                                c7322.f22497 = cCharAt2;
                                c7322.f22491 = 14;
                            } else if (c == '{') {
                                i2 = c7322.f22486 + 1;
                                c7322.f22486 = i2;
                                if (i2 >= i) {
                                    cCharAt = 26;
                                } else {
                                    cCharAt = str.charAt(i2);
                                }
                                c7322.f22497 = cCharAt;
                                c7322.f22491 = 12;
                            } else {
                                c7322.m19638();
                            }
                            abstractC18451.mo17833(c11556, objM5203, c15896.f49121, null);
                            if (c3 == ']') {
                                if (c7322.f22491 == 15) {
                                    throw new C15082("syntax error");
                                }
                            } else if (c3 == ',' && c7322.f22491 != 16) {
                                throw new C15082("syntax error");
                            }
                        }
                    } else {
                        c = c7322.f22497;
                        str = c7322.f22489;
                        i = c7322.f22493;
                        if (c == '[') {
                            i3 = c7322.f22486 + 1;
                            c7322.f22486 = i3;
                            if (i3 >= i) {
                                cCharAt2 = 26;
                            } else {
                                cCharAt2 = str.charAt(i3);
                            }
                            c7322.f22497 = cCharAt2;
                            c7322.f22491 = 14;
                        } else if (c == '{') {
                            i2 = c7322.f22486 + 1;
                            c7322.f22486 = i2;
                            if (i2 >= i) {
                                cCharAt = 26;
                            } else {
                                cCharAt = str.charAt(i2);
                            }
                            c7322.f22497 = cCharAt;
                            c7322.f22491 = 12;
                        } else {
                            c7322.m19638();
                        }
                        abstractC18451.mo17833(c11556, objM5203, c15896.f49121, null);
                        if (c3 == ']') {
                            if (c7322.f22491 == 15) {
                                throw new C15082("syntax error");
                            }
                        } else {
                            if (c3 == ',') {
                                throw new C15082("syntax error");
                            }
                            continue;
                        }
                    }
                    i7++;
                }
                i7++;
            } catch (IllegalAccessException e) {
                throw new C15082(C9045.m23341(new StringBuilder("set "), c15896.f49123, d.O), (Throwable) e);
            }
        }
        if (c7322.f22497 != ',') {
            c7322.m19638();
            return objM5203;
        }
        int i27 = c7322.f22486 + 1;
        c7322.f22486 = i27;
        c7322.f22497 = i27 >= c7322.f22493 ? (char) 26 : c7322.f22489.charAt(i27);
        c7322.f22491 = 16;
        return objM5203;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21791. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private java.lang.Object m5199(l.C11556 r48, java.lang.reflect.Type r49, java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 2179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1517.m5199(l.ۨ۟ۡ, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC18451 m5205(String str) {
        if (str == null) {
            return null;
        }
        boolean z = this.f5378.f32185;
        int i = 0;
        AbstractC18451[] abstractC18451Arr = this.f5377;
        if (z) {
            while (i < abstractC18451Arr.length) {
                AbstractC18451 abstractC18451 = abstractC18451Arr[i];
                if (abstractC18451.f57230.f49123.equalsIgnoreCase(str)) {
                    return abstractC18451;
                }
                i++;
            }
            return null;
        }
        int length = abstractC18451Arr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int iCompareTo = abstractC18451Arr[i3].f57230.f49123.compareTo(str);
            if (iCompareTo < 0) {
                i2 = i3 + 1;
            } else {
                if (iCompareTo <= 0) {
                    return abstractC18451Arr[i3];
                }
                length = i3 - 1;
            }
        }
        HashMap map = this.f5376;
        if (map != null) {
            return (AbstractC18451) map.get(str);
        }
        if (this.f5379 == null) {
            long[] jArr = new long[abstractC18451Arr.length];
            for (int i4 = 0; i4 < abstractC18451Arr.length; i4++) {
                jArr[i4] = C19426.m44747(abstractC18451Arr[i4].f57230.f49123);
            }
            Arrays.sort(jArr);
            this.f5379 = jArr;
        }
        int iBinarySearch = Arrays.binarySearch(this.f5379, C19426.m44747(str));
        if (iBinarySearch >= 0) {
            if (this.f5383 == null) {
                int[] iArr = new int[this.f5379.length];
                Arrays.fill(iArr, -1);
                while (i < abstractC18451Arr.length) {
                    int iBinarySearch2 = Arrays.binarySearch(this.f5379, C19426.m44747(abstractC18451Arr[i].f57230.f49123));
                    if (iBinarySearch2 >= 0) {
                        iArr[iBinarySearch2] = i;
                    }
                    i++;
                }
                this.f5383 = iArr;
            }
            int i5 = this.f5383[iBinarySearch];
            if (i5 != -1) {
                return abstractC18451Arr[i5];
            }
        }
        return m5200(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m5198(C11556 c11556, String str, Object obj, Type type, HashMap map) {
        Type typeM11127;
        C7322 c7322 = c11556.f34488;
        AbstractC18451 abstractC18451M5205 = m5205(str);
        if (abstractC18451M5205 == null) {
            abstractC18451M5205 = m5200(str);
        }
        int i = EnumC13671.SupportNonPublicField.f40811;
        Class cls = this.f5380;
        if (abstractC18451M5205 == null && ((c7322.f22495 & i) != 0 || (i & this.f5378.f32175) != 0)) {
            if (this.f5382 == null) {
                ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942(1, 0.75f, 1);
                for (Class superclass = cls; superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    for (Field field : superclass.getDeclaredFields()) {
                        String name = field.getName();
                        if (m5205(name) == null) {
                            int modifiers = field.getModifiers();
                            if ((modifiers & 16) == 0 && (modifiers & 8) == 0) {
                                concurrentMapC10942.put(name, field);
                            }
                        }
                    }
                }
                this.f5382 = concurrentMapC10942;
            }
            Object obj2 = this.f5382.get(str);
            if (obj2 != null) {
                if (obj2 instanceof AbstractC18451) {
                    abstractC18451M5205 = (AbstractC18451) obj2;
                } else {
                    Field field2 = (Field) obj2;
                    field2.setAccessible(true);
                    abstractC18451M5205 = new C10145(cls, new C15896(str, field2.getDeclaringClass(), field2.getType(), field2.getGenericType(), field2, 0, 0));
                    this.f5382.put(str, abstractC18451M5205);
                }
            }
        }
        if (abstractC18451M5205 != null) {
            c7322.m19635();
            abstractC18451M5205.mo17833(c11556, obj, type, map);
            return true;
        }
        if ((c7322.f22495 & EnumC13671.IgnoreNotMatch.f40811) == 0) {
            throw new C15082("setter not found, class " + cls.getName() + ", property " + str);
        }
        c7322.m19635();
        ArrayList arrayList = c11556.f34489;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            typeM11127 = null;
            while (it.hasNext()) {
                typeM11127 = ((InterfaceC3634) it.next()).m11127();
            }
        } else {
            typeM11127 = null;
        }
        if (typeM11127 != null) {
            c11556.m28435((String) null, typeM11127);
        } else {
            c11556.m28434((Object) null);
        }
        if (obj instanceof InterfaceC15627) {
            ((InterfaceC15627) obj).m36828();
            return false;
        }
        ArrayList arrayList2 = c11556.f34491;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((InterfaceC2223) it2.next()).m7402();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private AbstractC18451 m5200(String str) {
        boolean zStartsWith;
        long jM44747 = C19426.m44747(str);
        long[] jArr = this.f5379;
        AbstractC18451[] abstractC18451Arr = this.f5377;
        if (jArr == null) {
            long[] jArr2 = new long[abstractC18451Arr.length];
            for (int i = 0; i < abstractC18451Arr.length; i++) {
                jArr2[i] = C19426.m44747(abstractC18451Arr[i].f57230.f49123);
            }
            Arrays.sort(jArr2);
            this.f5379 = jArr2;
        }
        int iBinarySearch = Arrays.binarySearch(this.f5379, jM44747);
        if (iBinarySearch < 0) {
            zStartsWith = str.startsWith(am.ae);
            if (zStartsWith) {
                iBinarySearch = Arrays.binarySearch(this.f5379, C19426.m44747(str.substring(2)));
            }
        } else {
            zStartsWith = false;
        }
        if (iBinarySearch >= 0) {
            if (this.f5383 == null) {
                int[] iArr = new int[this.f5379.length];
                Arrays.fill(iArr, -1);
                for (int i2 = 0; i2 < abstractC18451Arr.length; i2++) {
                    int iBinarySearch2 = Arrays.binarySearch(this.f5379, C19426.m44747(abstractC18451Arr[i2].f57230.f49123));
                    if (iBinarySearch2 >= 0) {
                        iArr[iBinarySearch2] = i2;
                    }
                }
                this.f5383 = iArr;
            }
            int i3 = this.f5383[iBinarySearch];
            if (i3 != -1) {
                AbstractC18451 abstractC18451 = abstractC18451Arr[i3];
                Class cls = abstractC18451.f57230.f49114;
                if (!zStartsWith || cls == Boolean.TYPE || cls == Boolean.class) {
                    return abstractC18451;
                }
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x025c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0260  */
    /* JADX WARN: Code duplicated, block: B:156:0x0276  */
    /* JADX WARN: Code duplicated, block: B:158:0x027a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0281  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m5202(Map map, C23389 c23389) throws IllegalAccessException, InvocationTargetException {
        double d;
        double d2;
        double d3;
        float f;
        float f2;
        float f3;
        String str;
        Object objM44734;
        C10690 c10690 = this.f5378;
        Constructor constructor = c10690.f32174;
        Constructor constructor2 = c10690.f32174;
        boolean z = false;
        if (constructor == null) {
            Object objM5203 = m5203((C11556) null, this.f5380);
            for (Map.Entry entry : map.entrySet()) {
                AbstractC18451 abstractC18451M5205 = m5205((String) entry.getKey());
                if (abstractC18451M5205 != null) {
                    C15896 c15896 = abstractC18451M5205.f57230;
                    Object value = entry.getValue();
                    Class cls = Boolean.TYPE;
                    Class cls2 = Double.TYPE;
                    Class cls3 = Float.TYPE;
                    Class cls4 = Long.TYPE;
                    Class cls5 = Integer.TYPE;
                    if (value == null) {
                        Class cls6 = c15896.f49114;
                        if (cls6 == cls5) {
                            value = Integer.valueOf(z ? 1 : 0);
                        } else if (cls6 == cls4) {
                            value = 0L;
                        } else if (cls6 == Short.TYPE) {
                            value = Short.valueOf(z ? (short) 1 : (short) 0);
                        } else if (cls6 == Byte.TYPE) {
                            value = Byte.valueOf(z ? (byte) 1 : (byte) 0);
                        } else if (cls6 == cls3) {
                            value = Float.valueOf(0.0f);
                        } else if (cls6 == cls2) {
                            value = Double.valueOf(0.0d);
                        } else if (cls6 == Character.TYPE) {
                            value = '0';
                        } else if (cls6 == cls) {
                            value = Boolean.FALSE;
                        }
                    }
                    Method method = c15896.f49127;
                    if (method != null) {
                        Object[] objArr = new Object[1];
                        objArr[z ? 1 : 0] = C19426.m44734(value, method.getGenericParameterTypes()[z ? 1 : 0], c23389);
                        method.invoke(objM5203, objArr);
                    } else {
                        Field field = c15896.f49124;
                        Type type = c15896.f49121;
                        if (type == cls) {
                            if (value == Boolean.FALSE) {
                                field.setBoolean(objM5203, z);
                            } else if (value == Boolean.TRUE) {
                                field.setBoolean(objM5203, true);
                            } else {
                                str = c15896.f49118;
                                if (str == null && type == Date.class && (value instanceof String)) {
                                    try {
                                        objM44734 = new SimpleDateFormat(str).parse((String) value);
                                    } catch (ParseException unused) {
                                        objM44734 = null;
                                    }
                                } else if (type instanceof ParameterizedType) {
                                    objM44734 = C19426.m44733(value, (ParameterizedType) type, c23389);
                                } else {
                                    objM44734 = C19426.m44734(value, type, c23389);
                                }
                                field.set(objM5203, objM44734);
                            }
                        } else if (type == cls5) {
                            if (value instanceof Number) {
                                field.setInt(objM5203, ((Number) value).intValue());
                            } else {
                                str = c15896.f49118;
                                if (str == null) {
                                    if (type instanceof ParameterizedType) {
                                        objM44734 = C19426.m44733(value, (ParameterizedType) type, c23389);
                                    } else {
                                        objM44734 = C19426.m44734(value, type, c23389);
                                    }
                                } else if (type instanceof ParameterizedType) {
                                    objM44734 = C19426.m44733(value, (ParameterizedType) type, c23389);
                                } else {
                                    objM44734 = C19426.m44734(value, type, c23389);
                                }
                                field.set(objM5203, objM44734);
                            }
                        } else {
                            if (type != cls4) {
                                char c = '.';
                                char c2 = '-';
                                if (type == cls3) {
                                    if (value instanceof Number) {
                                        field.setFloat(objM5203, ((Number) value).floatValue());
                                    } else if (value instanceof String) {
                                        String str2 = (String) value;
                                        if (str2.length() <= 10) {
                                            int i = C19426.f62834;
                                            int length = str2.length();
                                            if (length < 10) {
                                                int i2 = 0;
                                                boolean z2 = false;
                                                long j = 0;
                                                char c3 = '9';
                                                int i3 = 0;
                                                while (true) {
                                                    if (i2 < length) {
                                                        char cCharAt = str2.charAt(i2);
                                                        if (cCharAt == '-' && i2 == 0) {
                                                            z2 = true;
                                                        } else if (cCharAt == c) {
                                                            if (i3 != 0) {
                                                                f = Float.parseFloat(str2);
                                                            } else {
                                                                i3 = (length - i2) - 1;
                                                            }
                                                        } else if (cCharAt < '0' || cCharAt > c3) {
                                                            f = Float.parseFloat(str2);
                                                        } else {
                                                            j = (j * 10) + ((long) (cCharAt - '0'));
                                                        }
                                                        i2++;
                                                        c3 = '9';
                                                        c = '.';
                                                    } else {
                                                        if (z2) {
                                                            j = -j;
                                                        }
                                                        switch (i3) {
                                                            case 0:
                                                                f = j;
                                                                break;
                                                            case 1:
                                                                f2 = j;
                                                                f3 = 10.0f;
                                                                f = f2 / f3;
                                                                break;
                                                            case 2:
                                                                f2 = j;
                                                                f3 = 100.0f;
                                                                f = f2 / f3;
                                                                break;
                                                            case 3:
                                                                f2 = j;
                                                                f3 = 1000.0f;
                                                                f = f2 / f3;
                                                                break;
                                                            case 4:
                                                                f2 = j;
                                                                f3 = 10000.0f;
                                                                f = f2 / f3;
                                                                break;
                                                            case 5:
                                                                f2 = j;
                                                                f3 = 100000.0f;
                                                                f = f2 / f3;
                                                                break;
                                                            case 6:
                                                                f2 = j;
                                                                f3 = 1000000.0f;
                                                                f = f2 / f3;
                                                                break;
                                                            case 7:
                                                                f2 = j;
                                                                f3 = 1.0E7f;
                                                                f = f2 / f3;
                                                                break;
                                                            case 8:
                                                                f2 = j;
                                                                f3 = 1.0E8f;
                                                                f = f2 / f3;
                                                                break;
                                                            case 9:
                                                                f2 = j;
                                                                f3 = 1.0E9f;
                                                                f = f2 / f3;
                                                                break;
                                                            default:
                                                                f = Float.parseFloat(str2);
                                                                break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                f = Float.parseFloat(str2);
                                            }
                                        } else {
                                            f = Float.parseFloat(str2);
                                        }
                                        field.setFloat(objM5203, f);
                                    }
                                } else if (type == cls2) {
                                    if (value instanceof Number) {
                                        field.setDouble(objM5203, ((Number) value).doubleValue());
                                    } else if (value instanceof String) {
                                        String str3 = (String) value;
                                        if (str3.length() <= 10) {
                                            int i4 = C19426.f62834;
                                            int length2 = str3.length();
                                            if (length2 <= 10) {
                                                int i5 = 0;
                                                boolean z3 = false;
                                                long j2 = 0;
                                                char c4 = '.';
                                                int i6 = 0;
                                                while (true) {
                                                    if (i5 < length2) {
                                                        char cCharAt2 = str3.charAt(i5);
                                                        if (cCharAt2 == c2 && i5 == 0) {
                                                            z3 = true;
                                                        } else if (cCharAt2 == c4) {
                                                            if (i6 != 0) {
                                                                d = Double.parseDouble(str3);
                                                            } else {
                                                                i6 = (length2 - i5) - 1;
                                                            }
                                                        } else if (cCharAt2 < '0' || cCharAt2 > '9') {
                                                            d = Double.parseDouble(str3);
                                                        } else {
                                                            j2 = (j2 * 10) + ((long) (cCharAt2 - '0'));
                                                            i5++;
                                                            c2 = '-';
                                                            c4 = '.';
                                                        }
                                                        i5++;
                                                        c2 = '-';
                                                        c4 = '.';
                                                    } else {
                                                        if (z3) {
                                                            j2 = -j2;
                                                        }
                                                        switch (i6) {
                                                            case 0:
                                                                d = j2;
                                                                break;
                                                            case 1:
                                                                d2 = j2;
                                                                d3 = 10.0d;
                                                                d = d2 / d3;
                                                                break;
                                                            case 2:
                                                                d2 = j2;
                                                                d3 = 100.0d;
                                                                d = d2 / d3;
                                                                break;
                                                            case 3:
                                                                d2 = j2;
                                                                d3 = 1000.0d;
                                                                d = d2 / d3;
                                                                break;
                                                            case 4:
                                                                d2 = j2;
                                                                d3 = 10000.0d;
                                                                d = d2 / d3;
                                                                break;
                                                            case 5:
                                                                d2 = j2;
                                                                d3 = 100000.0d;
                                                                d = d2 / d3;
                                                                break;
                                                            case 6:
                                                                d2 = j2;
                                                                d3 = 1000000.0d;
                                                                d = d2 / d3;
                                                                break;
                                                            case 7:
                                                                d2 = j2;
                                                                d3 = 1.0E7d;
                                                                d = d2 / d3;
                                                                break;
                                                            case 8:
                                                                d2 = j2;
                                                                d3 = 1.0E8d;
                                                                d = d2 / d3;
                                                                break;
                                                            case 9:
                                                                d2 = j2;
                                                                d3 = 1.0E9d;
                                                                d = d2 / d3;
                                                                break;
                                                            default:
                                                                d = Double.parseDouble(str3);
                                                                break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                d = Double.parseDouble(str3);
                                            }
                                        } else {
                                            d = Double.parseDouble(str3);
                                        }
                                        field.setDouble(objM5203, d);
                                    }
                                } else if (value != null && type == value.getClass()) {
                                    field.set(objM5203, value);
                                }
                            } else if (value instanceof Number) {
                                field.setLong(objM5203, ((Number) value).longValue());
                            }
                            str = c15896.f49118;
                            if (str == null) {
                                if (type instanceof ParameterizedType) {
                                    objM44734 = C19426.m44733(value, (ParameterizedType) type, c23389);
                                } else {
                                    objM44734 = C19426.m44734(value, type, c23389);
                                }
                            } else if (type instanceof ParameterizedType) {
                                objM44734 = C19426.m44733(value, (ParameterizedType) type, c23389);
                            } else {
                                objM44734 = C19426.m44734(value, type, c23389);
                            }
                            field.set(objM5203, objM44734);
                        }
                    }
                    z = false;
                }
            }
            return objM5203;
        }
        C15896[] c15896Arr = c10690.f32179;
        int length3 = c15896Arr.length;
        Object[] objArr2 = new Object[length3];
        for (int i7 = 0; i7 < length3; i7++) {
            C15896 c15897 = c15896Arr[i7];
            Object objM44731 = map.get(c15897.f49123);
            if (objM44731 == null) {
                objM44731 = C19426.m44731(c15897.f49114);
            }
            objArr2[i7] = objM44731;
        }
        if (constructor2 == null) {
            return null;
        }
        try {
            return constructor2.newInstance(objArr2);
        } catch (Exception e) {
            throw new C15082("create instance error, " + constructor2.toGenericString(), (Throwable) e);
        }
    }
}
