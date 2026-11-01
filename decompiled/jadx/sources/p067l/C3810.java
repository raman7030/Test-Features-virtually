package p067l;

import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0708d;
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
public class C3810 implements InterfaceC20575 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f8157;

    /* JADX INFO: renamed from: ۜ */
    public final AbstractC19904[] f8158;

    /* JADX INFO: renamed from: ۧ */
    public final C12528 f8159;

    /* JADX INFO: renamed from: ܳ */
    public transient long[] f8160;

    /* JADX INFO: renamed from: ܽ */
    public final Class f8161;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC19904[] f8162;

    /* JADX INFO: renamed from: ᩳ */
    public ConcurrentMapC12768 f8163;

    /* JADX INFO: renamed from: ᩻ */
    public transient int[] f8164;

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
    public C3810(C24597 c24597, Class cls, Type type) {
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
        Class<InterfaceC14691> cls4;
        Field[] fieldArr2;
        Method method;
        Object obj2;
        HashMap map;
        Class<InterfaceC14691> cls5;
        InterfaceC14691 interfaceC14691;
        Class<InterfaceC14691> cls6;
        String str;
        int iOrdinal;
        int iM49980;
        C12528 c12528;
        HashMap map2;
        InterfaceC14691 interfaceC14692;
        Constructor<?> constructor5;
        InterfaceC14691 interfaceC14693;
        C17476[] c17476Arr;
        int length;
        int i2;
        C17476[] c17476Arr2;
        int length2;
        int i3;
        C17476 c17476;
        Class cls7;
        AbstractC19904 c19233;
        int i4;
        Constructor<?> constructor6;
        Class cls8;
        int i5;
        int i6;
        Class<InterfaceC14691> cls9;
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
        InterfaceC14691 interfaceC14694;
        String strName;
        String name2;
        int size;
        int i11;
        boolean z;
        InterfaceC14691 interfaceC14695;
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
        InterfaceC14691 interfaceC14691M47034;
        int iOrdinal2;
        int iM49981;
        char cCharAt;
        String strM47030;
        Field fieldM47031;
        InterfaceC14691 interfaceC14696;
        Method method4;
        int modifiers3 = cls.getModifiers();
        ArrayList arrayList2 = new ArrayList();
        HashMap map3 = new HashMap();
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        boolean zM47051 = C20831.m47051(cls);
        int i15 = modifiers3 & 1024;
        int i16 = 0;
        Constructor<?> declaredConstructor = null;
        if (i15 == 0 && (declaredConstructors.length == 1 || !zM47051)) {
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
                    if (method6.isAnnotationPresent(InterfaceC5304.class)) {
                        if (method5 != null) {
                            throw new C16702("multi-json creator");
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
        Class<InterfaceC14691> cls16 = InterfaceC14691.class;
        String[] strArr = null;
        if (constructor == null || z2) {
            Object obj3 = InterfaceC14021.class;
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
                if (((InterfaceC5304) constructor2.getAnnotation(InterfaceC5304.class)) != null) {
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
                    C20831.m47036(cls, method5, modifiers3);
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
                                    interfaceC14692 = null;
                                    break;
                                }
                                Annotation annotation = annotationArr[i22];
                                if (annotation instanceof InterfaceC14691) {
                                    interfaceC14692 = (InterfaceC14691) annotation;
                                    break;
                                }
                                i22++;
                            }
                            if (interfaceC14692 == null) {
                                throw new C16702("illegal json creator");
                            }
                            Field[] fieldArr3 = fieldArr;
                            C12528.m28855(arrayList2, new C17476(interfaceC14692.name(), cls, parameterTypes2[i21], genericParameterTypes[i21], C20831.m47031(cls, interfaceC14692.name(), fieldArr3, map3), interfaceC14692.ordinal(), EnumC22172.m49980(interfaceC14692.serialzeFeatures())));
                            i21++;
                            fieldArr = fieldArr3;
                            parameterTypes2 = parameterTypes2;
                            map3 = map3;
                        }
                        int size3 = arrayList2.size();
                        C17476[] c17476Arr3 = new C17476[size3];
                        arrayList2.toArray(c17476Arr3);
                        C17476[] c17476Arr4 = new C17476[size3];
                        System.arraycopy(c17476Arr3, 0, c17476Arr4, 0, size3);
                        Arrays.sort(c17476Arr4);
                        c12528 = new C12528(cls, null, null, method5, c17476Arr3, Arrays.equals(c17476Arr3, c17476Arr4) ? c17476Arr3 : c17476Arr4, (InterfaceC14021) cls.getAnnotation(obj), null);
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
                        if (!zM47051 || declaredConstructors.length <= 0) {
                            throw new C16702("default constructor not found. " + cls);
                        }
                        String[] strArrM47046 = C20831.m47046(cls);
                        if (strArrM47046 == null) {
                            throw new C16702("default constructor not found. " + cls);
                        }
                        Constructor<?> constructor9 = constructor3;
                        for (Constructor<?> constructor10 : declaredConstructors) {
                            Class<?>[] parameterTypes3 = constructor10.getParameterTypes();
                            if ((parameterTypes3.length <= 0 || !parameterTypes3[parameterTypes3.length - 1].getName().equals("l.᩺᩹᩵")) && (constructor9 == null || constructor9.getParameterTypes().length < parameterTypes3.length)) {
                                constructor9 = constructor10;
                            }
                        }
                        constructor9.setAccessible(true);
                        C20831.m47036(cls, constructor9, modifiers3);
                        Class<?>[] parameterTypes4 = constructor9.getParameterTypes();
                        Type[] genericParameterTypes2 = constructor9.getGenericParameterTypes();
                        Annotation[][] parameterAnnotations2 = constructor9.getParameterAnnotations();
                        int i23 = 0;
                        while (i23 < parameterTypes4.length) {
                            String str3 = strArrM47046[i23];
                            Annotation[] annotationArr2 = parameterAnnotations2[i23];
                            int length9 = annotationArr2.length;
                            int i24 = 0;
                            while (true) {
                                if (i24 >= length9) {
                                    interfaceC14691 = null;
                                    break;
                                }
                                Annotation annotation2 = annotationArr2[i24];
                                if (annotation2 instanceof InterfaceC14691) {
                                    interfaceC14691 = (InterfaceC14691) annotation2;
                                    break;
                                }
                                i24++;
                            }
                            Class<?> cls17 = parameterTypes4[i23];
                            Type type4 = genericParameterTypes2[i23];
                            HashMap map4 = map3;
                            Field fieldM47032 = C20831.m47031(cls, str3, fieldArr2, map4);
                            if (fieldM47032 == null || interfaceC14691 != null) {
                                cls6 = cls4;
                            } else {
                                cls6 = cls4;
                                interfaceC14691 = (InterfaceC14691) fieldM47032.getAnnotation(cls6);
                            }
                            if (interfaceC14691 != null) {
                                iOrdinal = interfaceC14691.ordinal();
                                iM49980 = EnumC22172.m49980(interfaceC14691.serialzeFeatures());
                                String strName3 = interfaceC14691.name();
                                str = strName3.length() != 0 ? strName3 : str3;
                            } else {
                                str = str3;
                                iOrdinal = 0;
                                iM49980 = 0;
                            }
                            C12528.m28855(arrayList2, new C17476(str, cls, cls17, type4, fieldM47032, iOrdinal, iM49980));
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
                        C17476[] c17476Arr5 = new C17476[size4];
                        arrayList2.toArray(c17476Arr5);
                        C17476[] c17476Arr6 = new C17476[size4];
                        System.arraycopy(c17476Arr5, 0, c17476Arr6, 0, size4);
                        Arrays.sort(c17476Arr6);
                        String[] strArr2 = new String[size4];
                        for (int i25 = 0; i25 < size4; i25++) {
                            strArr2[i25] = c17476Arr5[i25].f52263;
                        }
                        strArr = strArr2;
                    }
                    constructor6 = constructor4;
                    if (constructor4 != null) {
                        C20831.m47036(cls, constructor6, modifiers3);
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
                            InterfaceC14691 interfaceC14697 = (InterfaceC14691) method3.getAnnotation(cls5);
                            interfaceC14691M47034 = interfaceC14697 == null ? C20831.m47034(method3, cls8) : interfaceC14697;
                            if (interfaceC14691M47034 != null) {
                                if (interfaceC14691M47034.deserialize()) {
                                    iOrdinal2 = interfaceC14691M47034.ordinal();
                                    iM49981 = EnumC22172.m49980(interfaceC14691M47034.serialzeFeatures());
                                    if (interfaceC14691M47034.name().length() != 0) {
                                        C12528.m28855(arrayList2, new C17476(interfaceC14691M47034.name(), method3, null, cls8, type, iOrdinal2, iM49981, interfaceC14691M47034, null));
                                        C20831.m47036(cls8, method3, modifiers3);
                                    }
                                }
                                i6 = i6;
                                i5 = i5;
                                map = map;
                                cls3 = cls3;
                                cls5 = cls5;
                            } else {
                                iOrdinal2 = 0;
                                iM49981 = 0;
                            }
                            if (name3.startsWith("set")) {
                                cCharAt = name3.charAt(3);
                                if (Character.isUpperCase(cCharAt)) {
                                    int i26 = C20831.f65447;
                                    strM47030 = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                                } else if (cCharAt == '_') {
                                    strM47030 = name3.substring(4);
                                } else if (cCharAt == 'f') {
                                    strM47030 = name3.substring(3);
                                } else if (name3.length() >= 5 || !Character.isUpperCase(name3.charAt(4))) {
                                    i6 = i6;
                                    i5 = i5;
                                    map = map;
                                    cls3 = cls3;
                                    cls5 = cls5;
                                } else {
                                    strM47030 = C20831.m47030(name3.substring(3));
                                }
                                fieldM47031 = C20831.m47031(cls8, strM47030, fieldArr2, map);
                                if (fieldM47031 == null && method3.getParameterTypes()[0] == Boolean.TYPE) {
                                    fieldM47031 = C20831.m47031(cls8, C0655am.f2303ae + Character.toUpperCase(strM47030.charAt(0)) + strM47030.substring(1), fieldArr2, map);
                                }
                                if (fieldM47031 != null || (interfaceC14696 = (InterfaceC14691) fieldM47031.getAnnotation(cls5)) == null) {
                                    C12528.m28855(arrayList2, new C17476(strM47030, method3, null, cls, type, iOrdinal2, iM49981, interfaceC14691M47034, null));
                                    C20831.m47036(cls, method3, modifiers3);
                                } else {
                                    iOrdinal2 = interfaceC14696.ordinal();
                                    iM49981 = EnumC22172.m49980(interfaceC14696.serialzeFeatures());
                                    if (interfaceC14696.name().length() != 0) {
                                        C12528.m28855(arrayList2, new C17476(interfaceC14696.name(), method3, fieldM47031, cls8, type, iOrdinal2, iM49981, interfaceC14691M47034, interfaceC14696));
                                    } else {
                                        if (interfaceC14691M47034 == null) {
                                            interfaceC14691M47034 = interfaceC14696;
                                        }
                                        C12528.m28855(arrayList2, new C17476(strM47030, method3, null, cls, type, iOrdinal2, iM49981, interfaceC14691M47034, null));
                                        C20831.m47036(cls, method3, modifiers3);
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
                            if (((C17476) arrayList2.get(i11)).f52263.equals(name2)) {
                                z = true;
                            }
                        }
                        if (!z) {
                            interfaceC14695 = (InterfaceC14691) field3.getAnnotation(cls9);
                            if (interfaceC14695 != null) {
                                int iOrdinal3 = interfaceC14695.ordinal();
                                int iM49982 = EnumC22172.m49980(interfaceC14695.serialzeFeatures());
                                strName2 = interfaceC14695.name().length() != 0 ? interfaceC14695.name() : name2;
                                i12 = iOrdinal3;
                                i13 = iM49982;
                            } else {
                                strName2 = name2;
                                i12 = 0;
                                i13 = 0;
                            }
                            C20831.m47036(cls13, field3, modifiers3);
                            C12528.m28855(arrayList2, new C17476(strName2, null, field3, cls13, type, i12, i13, null, interfaceC14695));
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
                                interfaceC14694 = (InterfaceC14691) method2.getAnnotation(cls9);
                                if (interfaceC14694 != null) {
                                    strName = interfaceC14694.name();
                                    strName = strName.length() <= 0 ? Character.toLowerCase(name.charAt(3)) + name.substring(i8) : strName;
                                }
                                C12528.m28855(arrayList2, new C17476(strName, method2, null, cls, type, 0, 0, interfaceC14694, null));
                                C20831.m47036(cls, method2, modifiers3);
                            }
                        }
                        i10++;
                        cls11 = cls11;
                        cls12 = cls12;
                        i9 = i9;
                        i8 = 4;
                    }
                    int size5 = arrayList2.size();
                    C17476[] c17476Arr7 = new C17476[size5];
                    arrayList2.toArray(c17476Arr7);
                    C17476[] c17476Arr8 = new C17476[size5];
                    System.arraycopy(c17476Arr7, 0, c17476Arr8, 0, size5);
                    Arrays.sort(c17476Arr8);
                    c12528 = new C12528(cls, constructor6, constructor3, method, c17476Arr7, c17476Arr8, (InterfaceC14021) cls.getAnnotation(obj2), strArr);
                    map2 = null;
                }
                this.f8161 = cls;
                this.f8159 = c12528;
                c17476Arr = c12528.f35155;
                this.f8158 = new AbstractC19904[c17476Arr.length];
                length = c17476Arr.length;
                for (i2 = 0; i2 < length; i2++) {
                    c17476 = c17476Arr[i2];
                    cls7 = c17476.f52254;
                    if (cls7 != List.class || cls7 == ArrayList.class || (cls7.isArray() && !cls7.getComponentType().isPrimitive())) {
                        c19233 = new C19233(cls, c17476);
                    } else {
                        c19233 = new C12010(cls, c17476);
                    }
                    this.f8158[i2] = c19233;
                    for (String str4 : c17476.f52265) {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        map2.put(str4, c19233);
                    }
                }
                this.f8157 = map2;
                c17476Arr2 = c12528.f35150;
                this.f8162 = new AbstractC19904[c17476Arr2.length];
                length2 = c17476Arr2.length;
                for (i3 = 0; i3 < length2; i3++) {
                    this.f8162[i3] = m7432(c17476Arr2[i3].f52263);
                }
            }
            C20831.m47036(cls, constructor8, modifiers3);
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
                        interfaceC14693 = null;
                        break;
                    }
                    int i29 = length10;
                    Annotation annotation3 = annotationArr3[i28];
                    Annotation[] annotationArr4 = annotationArr3;
                    if (annotation3 instanceof InterfaceC14691) {
                        interfaceC14693 = (InterfaceC14691) annotation3;
                        break;
                    } else {
                        i28++;
                        length10 = i29;
                        annotationArr3 = annotationArr4;
                    }
                }
                if (interfaceC14693 == null) {
                    throw new C16702(str5);
                }
                Class<?> cls19 = parameterTypes5[i27];
                Type type5 = genericParameterTypes3[i27];
                Field fieldM47033 = C20831.m47031(cls, interfaceC14693.name(), declaredFields2, map3);
                if (fieldM47033 != null) {
                    C20831.m47036(cls, fieldM47033, modifiers3);
                }
                C12528.m28855(arrayList2, new C17476(interfaceC14693.name(), cls, cls19, type5, fieldM47033, interfaceC14693.ordinal(), EnumC22172.m49980(interfaceC14693.serialzeFeatures())));
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
            C17476[] c17476Arr9 = new C17476[size6];
            arrayList2.toArray(c17476Arr9);
            C17476[] c17476Arr10 = new C17476[size6];
            System.arraycopy(c17476Arr9, 0, c17476Arr10, 0, size6);
            Arrays.sort(c17476Arr10);
            String[] strArr3 = new String[size6];
            for (int i30 = 0; i30 < size6; i30++) {
                strArr3[i30] = c17476Arr9[i30].f52263;
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
            obj = InterfaceC14021.class;
            fieldArr2 = declaredFields2;
        }
        constructor3 = constructor5;
        method = method5;
        obj2 = obj;
        map = map3;
        cls5 = cls4;
        constructor6 = constructor4;
        if (constructor4 != null) {
            C20831.m47036(cls, constructor6, modifiers3);
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
                InterfaceC14691 interfaceC14698 = (InterfaceC14691) method3.getAnnotation(cls5);
                interfaceC14691M47034 = interfaceC14698 == null ? C20831.m47034(method3, cls8) : interfaceC14698;
                if (interfaceC14691M47034 != null) {
                    if (interfaceC14691M47034.deserialize()) {
                        iOrdinal2 = interfaceC14691M47034.ordinal();
                        iM49981 = EnumC22172.m49980(interfaceC14691M47034.serialzeFeatures());
                        if (interfaceC14691M47034.name().length() != 0) {
                            C12528.m28855(arrayList2, new C17476(interfaceC14691M47034.name(), method3, null, cls8, type, iOrdinal2, iM49981, interfaceC14691M47034, null));
                            C20831.m47036(cls8, method3, modifiers3);
                        }
                    }
                    i6 = i6;
                    i5 = i5;
                    map = map;
                    cls3 = cls3;
                    cls5 = cls5;
                } else {
                    iOrdinal2 = 0;
                    iM49981 = 0;
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
                        int i210 = C20831.f65447;
                        strM47030 = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                    } else if (cCharAt == '_') {
                        strM47030 = name3.substring(4);
                    } else if (cCharAt == 'f') {
                        strM47030 = name3.substring(3);
                    } else {
                        if (name3.length() >= 5) {
                        }
                        i6 = i6;
                        i5 = i5;
                        map = map;
                        cls3 = cls3;
                        cls5 = cls5;
                    }
                    fieldM47031 = C20831.m47031(cls8, strM47030, fieldArr2, map);
                    if (fieldM47031 == null) {
                        fieldM47031 = C20831.m47031(cls8, C0655am.f2303ae + Character.toUpperCase(strM47030.charAt(0)) + strM47030.substring(1), fieldArr2, map);
                    }
                    if (fieldM47031 != null) {
                        C12528.m28855(arrayList2, new C17476(strM47030, method3, null, cls, type, iOrdinal2, iM49981, interfaceC14691M47034, null));
                        C20831.m47036(cls, method3, modifiers3);
                    } else {
                        C12528.m28855(arrayList2, new C17476(strM47030, method3, null, cls, type, iOrdinal2, iM49981, interfaceC14691M47034, null));
                        C20831.m47036(cls, method3, modifiers3);
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
                if (((C17476) arrayList2.get(i11)).f52263.equals(name2)) {
                    z = true;
                }
            }
            if (!z) {
                interfaceC14695 = (InterfaceC14691) field3.getAnnotation(cls9);
                if (interfaceC14695 != null) {
                    int iOrdinal4 = interfaceC14695.ordinal();
                    int iM49983 = EnumC22172.m49980(interfaceC14695.serialzeFeatures());
                    strName2 = interfaceC14695.name().length() != 0 ? interfaceC14695.name() : name2;
                    i12 = iOrdinal4;
                    i13 = iM49983;
                } else {
                    strName2 = name2;
                    i12 = 0;
                    i13 = 0;
                }
                C20831.m47036(cls13, field3, modifiers3);
                C12528.m28855(arrayList2, new C17476(strName2, null, field3, cls13, type, i12, i13, null, interfaceC14695));
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
                interfaceC14694 = (InterfaceC14691) method2.getAnnotation(cls9);
                if (interfaceC14694 != null) {
                    strName = interfaceC14694.name();
                    if (strName.length() <= 0) {
                    }
                }
                C12528.m28855(arrayList2, new C17476(strName, method2, null, cls, type, 0, 0, interfaceC14694, null));
                C20831.m47036(cls, method2, modifiers3);
            }
            i10++;
            cls11 = cls11;
            cls12 = cls12;
            i9 = i9;
            i8 = 4;
        }
        int size7 = arrayList2.size();
        C17476[] c17476Arr11 = new C17476[size7];
        arrayList2.toArray(c17476Arr11);
        C17476[] c17476Arr12 = new C17476[size7];
        System.arraycopy(c17476Arr11, 0, c17476Arr12, 0, size7);
        Arrays.sort(c17476Arr12);
        c12528 = new C12528(cls, constructor6, constructor3, method, c17476Arr11, c17476Arr12, (InterfaceC14021) cls.getAnnotation(obj2), strArr);
        map2 = null;
        this.f8161 = cls;
        this.f8159 = c12528;
        c17476Arr = c12528.f35155;
        this.f8158 = new AbstractC19904[c17476Arr.length];
        length = c17476Arr.length;
        while (i2 < length) {
            c17476 = c17476Arr[i2];
            cls7 = c17476.f52254;
            if (cls7 != List.class) {
                c19233 = new C19233(cls, c17476);
            } else {
                c19233 = new C19233(cls, c17476);
            }
            this.f8158[i2] = c19233;
            while (i4 < r8) {
                if (map2 == null) {
                    map2 = new HashMap();
                }
                map2.put(str4, c19233);
            }
        }
        this.f8157 = map2;
        c17476Arr2 = c12528.f35150;
        this.f8162 = new AbstractC19904[c17476Arr2.length];
        length2 = c17476Arr2.length;
        while (i3 < length2) {
            this.f8162[i3] = m7432(c17476Arr2[i3].f52263);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m7430(C13351 c13351, Type type) {
        Object objNewInstance;
        boolean z = type instanceof Class;
        Class cls = this.f8161;
        if (z && cls.isInterface()) {
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{(Class) type}, new C22739(0, (c13351.f37485.f25386 & EnumC15361.OrderedField.f43892) != 0));
        }
        C12528 c12528 = this.f8159;
        Constructor constructor = c12528.f35152;
        int i = c12528.f35154;
        Method method = c12528.f35153;
        if ((constructor == null && method == null) || (method != null && i > 0)) {
            return null;
        }
        try {
            if (i != 0) {
                objNewInstance = constructor.newInstance(c13351.f37493.f45975);
            } else if (constructor != null) {
                objNewInstance = constructor.newInstance(null);
            } else {
                objNewInstance = method.invoke(null, null);
            }
            if (c13351 != null && (c13351.f37485.f25386 & EnumC15361.InitStringFieldAsEmpty.f43892) != 0) {
                for (C17476 c17476 : c12528.f35150) {
                    if (c17476.f52254 == String.class) {
                        Method method2 = c17476.f52267;
                        if (method2 != null) {
                            method2.invoke(objNewInstance, "");
                        } else {
                            c17476.f52264.set(objNewInstance, "");
                        }
                    }
                }
            }
            return objNewInstance;
        } catch (Exception e) {
            throw new C16702("create instance error, class ".concat(cls.getName()), (Throwable) e);
        }
    }

    @Override // p067l.InterfaceC20575
    /* JADX INFO: renamed from: ֫ */
    public Object mo7431(C13351 c13351, Type type, Object obj) {
        return m7426(c13351, type, obj);
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
    /* JADX INFO: renamed from: ܽ */
    private Object m7428(C13351 c13351, Type type, Object obj) {
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
        String strM21582;
        C9327 c9327 = c13351.f37485;
        Object objM7430 = m7430(c13351, type);
        AbstractC19904[] abstractC19904Arr = this.f8158;
        int length = abstractC19904Arr.length;
        int i7 = 0;
        while (i7 < length) {
            char c3 = i7 == length + (-1) ? ']' : ',';
            AbstractC19904 abstractC19904 = abstractC19904Arr[i7];
            C17476 c17476 = abstractC19904.f60448;
            Class cls = c17476.f52254;
            Field field = c17476.f52264;
            boolean z2 = c17476.f52255;
            try {
                if (cls == Integer.TYPE) {
                    long jM21595 = c9327.m21595();
                    String str2 = c9327.f25380;
                    int i8 = c9327.f25384;
                    int i9 = (int) jM21595;
                    if (z2) {
                        field.setInt(objM7430, i9);
                    } else {
                        abstractC19904.mo19779(objM7430, new Integer(i9));
                    }
                    char c4 = c9327.f25388;
                    if (c4 == ',') {
                        int i10 = c9327.f25377 + 1;
                        c9327.f25377 = i10;
                        c9327.f25388 = i10 >= i8 ? (char) 26 : str2.charAt(i10);
                        c9327.f25382 = 16;
                    } else if (c4 == ']') {
                        int i11 = c9327.f25377 + 1;
                        c9327.f25377 = i11;
                        c9327.f25388 = i11 >= i8 ? (char) 26 : str2.charAt(i11);
                        c9327.f25382 = 15;
                    } else {
                        c9327.m21606();
                    }
                } else {
                    if (cls == String.class) {
                        char c5 = c9327.f25388;
                        int i12 = c9327.f25384;
                        String str3 = c9327.f25380;
                        if (c5 == '\"') {
                            strM21582 = c9327.m21582();
                        } else {
                            if (c5 != 'n' || !str3.startsWith("null", c9327.f25377)) {
                                throw new C16702("not match string. feild : " + obj);
                            }
                            int i13 = c9327.f25377 + 4;
                            c9327.f25377 = i13;
                            c9327.f25388 = i13 >= i12 ? (char) 26 : str3.charAt(i13);
                            strM21582 = null;
                        }
                        if (z2) {
                            field.set(objM7430, strM21582);
                        } else {
                            abstractC19904.mo19779(objM7430, strM21582);
                        }
                        char c6 = c9327.f25388;
                        if (c6 == ',') {
                            int i14 = c9327.f25377 + 1;
                            c9327.f25377 = i14;
                            c9327.f25388 = i14 >= i12 ? (char) 26 : str3.charAt(i14);
                            c9327.f25382 = 16;
                        } else if (c6 == ']') {
                            int i15 = c9327.f25377 + 1;
                            c9327.f25377 = i15;
                            c9327.f25388 = i15 >= i12 ? (char) 26 : str3.charAt(i15);
                            c9327.f25382 = 15;
                        } else {
                            c9327.m21606();
                        }
                    } else if (cls == Long.TYPE) {
                        long jM21596 = c9327.m21595();
                        String str4 = c9327.f25380;
                        int i16 = c9327.f25384;
                        if (z2) {
                            field.setLong(objM7430, jM21596);
                        } else {
                            abstractC19904.mo19779(objM7430, new Long(jM21596));
                        }
                        char c7 = c9327.f25388;
                        if (c7 == ',') {
                            int i17 = c9327.f25377 + 1;
                            c9327.f25377 = i17;
                            c9327.f25388 = i17 >= i16 ? (char) 26 : str4.charAt(i17);
                            c9327.f25382 = 16;
                        } else if (c7 == ']') {
                            int i18 = c9327.f25377 + 1;
                            c9327.f25377 = i18;
                            c9327.f25388 = i18 >= i16 ? (char) 26 : str4.charAt(i18);
                            c9327.f25382 = 15;
                        } else {
                            c9327.m21606();
                        }
                    } else if (cls == Boolean.TYPE) {
                        String str5 = c9327.f25380;
                        String str6 = c9327.f25380;
                        int i19 = c9327.f25384;
                        if (str5.startsWith("false", c9327.f25377)) {
                            i4 = 5;
                            z = false;
                        } else if (str5.startsWith("true", c9327.f25377)) {
                            z = true;
                            i4 = 4;
                        } else {
                            char c8 = c9327.f25388;
                            if (c8 == '1') {
                                z = true;
                            } else {
                                if (c8 == '0') {
                                    z = false;
                                } else {
                                    c9327.f25387 = -1;
                                    z = false;
                                }
                                if (z2) {
                                    field.setBoolean(objM7430, z);
                                } else {
                                    abstractC19904.mo19779(objM7430, Boolean.valueOf(z));
                                }
                                c2 = c9327.f25388;
                                if (c2 == ',') {
                                    i6 = c9327.f25377 + 1;
                                    c9327.f25377 = i6;
                                    if (i6 >= i19) {
                                        cCharAt4 = 26;
                                    } else {
                                        cCharAt4 = str6.charAt(i6);
                                    }
                                    c9327.f25388 = cCharAt4;
                                    c9327.f25382 = 16;
                                } else if (c2 == ']') {
                                    i5 = c9327.f25377 + 1;
                                    c9327.f25377 = i5;
                                    if (i5 >= i19) {
                                        cCharAt3 = 26;
                                    } else {
                                        cCharAt3 = str6.charAt(i5);
                                    }
                                    c9327.f25388 = cCharAt3;
                                    c9327.f25382 = 15;
                                } else {
                                    c9327.m21606();
                                }
                            }
                            i4 = 1;
                        }
                        int i20 = c9327.f25377 + i4;
                        c9327.f25377 = i20;
                        c9327.f25388 = c9327.m21584(i20);
                        if (z2) {
                            field.setBoolean(objM7430, z);
                        } else {
                            abstractC19904.mo19779(objM7430, Boolean.valueOf(z));
                        }
                        c2 = c9327.f25388;
                        if (c2 == ',') {
                            i6 = c9327.f25377 + 1;
                            c9327.f25377 = i6;
                            if (i6 >= i19) {
                                cCharAt4 = 26;
                            } else {
                                cCharAt4 = str6.charAt(i6);
                            }
                            c9327.f25388 = cCharAt4;
                            c9327.f25382 = 16;
                        } else if (c2 == ']') {
                            i5 = c9327.f25377 + 1;
                            c9327.f25377 = i5;
                            if (i5 >= i19) {
                                cCharAt3 = 26;
                            } else {
                                cCharAt3 = str6.charAt(i5);
                            }
                            c9327.f25388 = cCharAt3;
                            c9327.f25382 = 15;
                        } else {
                            c9327.m21606();
                        }
                    } else if (cls.isEnum()) {
                        char c9 = c9327.f25388;
                        String str7 = c9327.f25380;
                        int i21 = c9327.f25384;
                        if (c9 == '\"') {
                            String strM21586 = c9327.m21586(c13351.f37490);
                            enumValueOf = strM21586 == null ? null : Enum.valueOf(cls, strM21586);
                        } else {
                            if (c9 < '0' || c9 > '9') {
                                throw new C16702("illegal enum." + c9327.m21622());
                            }
                            int iM21595 = (int) c9327.m21595();
                            C12010 c12010 = (C12010) abstractC19904;
                            C24597 c24597 = c13351.f37492;
                            if (c12010.f33484 == null) {
                                C17476 c17477 = c12010.f60448;
                                c12010.f33484 = c24597.m54234(c17477.f52254, c17477.f52261);
                            }
                            enumValueOf = ((C24079) c12010.f33484).f76462[iM21595];
                        }
                        abstractC19904.mo19779(objM7430, enumValueOf);
                        char c10 = c9327.f25388;
                        if (c10 == ',') {
                            int i22 = c9327.f25377 + 1;
                            c9327.f25377 = i22;
                            c9327.f25388 = i22 >= i21 ? (char) 26 : str7.charAt(i22);
                            c9327.f25382 = 16;
                        } else if (c10 == ']') {
                            int i23 = c9327.f25377 + 1;
                            c9327.f25377 = i23;
                            c9327.f25388 = i23 >= i21 ? (char) 26 : str7.charAt(i23);
                            c9327.f25382 = 15;
                        } else {
                            c9327.m21606();
                        }
                    } else if (cls == Date.class) {
                        char c11 = c9327.f25388;
                        String str8 = c9327.f25380;
                        int i24 = c9327.f25384;
                        if (c11 == '1') {
                            abstractC19904.mo19779(objM7430, new Date(c9327.m21595()));
                            char c12 = c9327.f25388;
                            if (c12 == ',') {
                                int i25 = c9327.f25377 + 1;
                                c9327.f25377 = i25;
                                c9327.f25388 = i25 >= i24 ? (char) 26 : str8.charAt(i25);
                                c9327.f25382 = 16;
                            } else if (c12 == ']') {
                                int i26 = c9327.f25377 + 1;
                                c9327.f25377 = i26;
                                c9327.f25388 = i26 >= i24 ? (char) 26 : str8.charAt(i26);
                                c9327.f25382 = 15;
                            } else {
                                c9327.m21606();
                            }
                        } else {
                            c = c9327.f25388;
                            str = c9327.f25380;
                            i = c9327.f25384;
                            if (c == '[') {
                                i3 = c9327.f25377 + 1;
                                c9327.f25377 = i3;
                                if (i3 >= i) {
                                    cCharAt2 = 26;
                                } else {
                                    cCharAt2 = str.charAt(i3);
                                }
                                c9327.f25388 = cCharAt2;
                                c9327.f25382 = 14;
                            } else if (c == '{') {
                                i2 = c9327.f25377 + 1;
                                c9327.f25377 = i2;
                                if (i2 >= i) {
                                    cCharAt = 26;
                                } else {
                                    cCharAt = str.charAt(i2);
                                }
                                c9327.f25388 = cCharAt;
                                c9327.f25382 = 12;
                            } else {
                                c9327.m21606();
                            }
                            abstractC19904.mo19780(c13351, objM7430, c17476.f52261, null);
                            if (c3 == ']') {
                                if (c9327.f25382 == 15) {
                                    throw new C16702("syntax error");
                                }
                            } else if (c3 == ',' && c9327.f25382 != 16) {
                                throw new C16702("syntax error");
                            }
                        }
                    } else {
                        c = c9327.f25388;
                        str = c9327.f25380;
                        i = c9327.f25384;
                        if (c == '[') {
                            i3 = c9327.f25377 + 1;
                            c9327.f25377 = i3;
                            if (i3 >= i) {
                                cCharAt2 = 26;
                            } else {
                                cCharAt2 = str.charAt(i3);
                            }
                            c9327.f25388 = cCharAt2;
                            c9327.f25382 = 14;
                        } else if (c == '{') {
                            i2 = c9327.f25377 + 1;
                            c9327.f25377 = i2;
                            if (i2 >= i) {
                                cCharAt = 26;
                            } else {
                                cCharAt = str.charAt(i2);
                            }
                            c9327.f25388 = cCharAt;
                            c9327.f25382 = 12;
                        } else {
                            c9327.m21606();
                        }
                        abstractC19904.mo19780(c13351, objM7430, c17476.f52261, null);
                        if (c3 == ']') {
                            if (c9327.f25382 == 15) {
                                throw new C16702("syntax error");
                            }
                        } else {
                            if (c3 == ',') {
                                throw new C16702("syntax error");
                            }
                            continue;
                        }
                    }
                    i7++;
                }
                i7++;
            } catch (IllegalAccessException e) {
                throw new C16702(C10965.m25286(new StringBuilder("set "), c17476.f52263, C0708d.f2599O), (Throwable) e);
            }
        }
        if (c9327.f25388 != ',') {
            c9327.m21606();
            return objM7430;
        }
        int i27 = c9327.f25377 + 1;
        c9327.f25377 = i27;
        c9327.f25388 = i27 >= c9327.f25384 ? (char) 26 : c9327.f25380.charAt(i27);
        c9327.f25382 = 16;
        return objM7430;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21791. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۧ */
    private java.lang.Object m7426(p067l.C13351 r48, java.lang.reflect.Type r49, java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 2179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C3810.m7426(l.ۨ۟ۡ, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC19904 m7432(String str) {
        if (str == null) {
            return null;
        }
        boolean z = this.f8159.f35156;
        int i = 0;
        AbstractC19904[] abstractC19904Arr = this.f8158;
        if (z) {
            while (i < abstractC19904Arr.length) {
                AbstractC19904 abstractC19904 = abstractC19904Arr[i];
                if (abstractC19904.f60448.f52263.equalsIgnoreCase(str)) {
                    return abstractC19904;
                }
                i++;
            }
            return null;
        }
        int length = abstractC19904Arr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int iCompareTo = abstractC19904Arr[i3].f60448.f52263.compareTo(str);
            if (iCompareTo < 0) {
                i2 = i3 + 1;
            } else {
                if (iCompareTo <= 0) {
                    return abstractC19904Arr[i3];
                }
                length = i3 - 1;
            }
        }
        HashMap map = this.f8157;
        if (map != null) {
            return (AbstractC19904) map.get(str);
        }
        if (this.f8160 == null) {
            long[] jArr = new long[abstractC19904Arr.length];
            for (int i4 = 0; i4 < abstractC19904Arr.length; i4++) {
                jArr[i4] = C20831.m47041(abstractC19904Arr[i4].f60448.f52263);
            }
            Arrays.sort(jArr);
            this.f8160 = jArr;
        }
        int iBinarySearch = Arrays.binarySearch(this.f8160, C20831.m47041(str));
        if (iBinarySearch >= 0) {
            if (this.f8164 == null) {
                int[] iArr = new int[this.f8160.length];
                Arrays.fill(iArr, -1);
                while (i < abstractC19904Arr.length) {
                    int iBinarySearch2 = Arrays.binarySearch(this.f8160, C20831.m47041(abstractC19904Arr[i].f60448.f52263));
                    if (iBinarySearch2 >= 0) {
                        iArr[iBinarySearch2] = i;
                    }
                    i++;
                }
                this.f8164 = iArr;
            }
            int i5 = this.f8164[iBinarySearch];
            if (i5 != -1) {
                return abstractC19904Arr[i5];
            }
        }
        return m7427(str);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m7425(C13351 c13351, String str, Object obj, Type type, HashMap map) {
        Type typeM13103;
        C9327 c9327 = c13351.f37485;
        AbstractC19904 abstractC19904M7432 = m7432(str);
        if (abstractC19904M7432 == null) {
            abstractC19904M7432 = m7427(str);
        }
        int i = EnumC15361.SupportNonPublicField.f43892;
        Class cls = this.f8161;
        if (abstractC19904M7432 == null && ((c9327.f25386 & i) != 0 || (i & this.f8159.f35146) != 0)) {
            if (this.f8163 == null) {
                ConcurrentMapC12768 concurrentMapC12768 = new ConcurrentMapC12768(1, 0.75f, 1);
                for (Class superclass = cls; superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    for (Field field : superclass.getDeclaredFields()) {
                        String name = field.getName();
                        if (m7432(name) == null) {
                            int modifiers = field.getModifiers();
                            if ((modifiers & 16) == 0 && (modifiers & 8) == 0) {
                                concurrentMapC12768.put(name, field);
                            }
                        }
                    }
                }
                this.f8163 = concurrentMapC12768;
            }
            Object obj2 = this.f8163.get(str);
            if (obj2 != null) {
                if (obj2 instanceof AbstractC19904) {
                    abstractC19904M7432 = (AbstractC19904) obj2;
                } else {
                    Field field2 = (Field) obj2;
                    field2.setAccessible(true);
                    abstractC19904M7432 = new C12010(cls, new C17476(str, field2.getDeclaringClass(), field2.getType(), field2.getGenericType(), field2, 0, 0));
                    this.f8163.put(str, abstractC19904M7432);
                }
            }
        }
        if (abstractC19904M7432 != null) {
            c9327.m21603();
            abstractC19904M7432.mo19780(c13351, obj, type, map);
            return true;
        }
        if ((c9327.f25386 & EnumC15361.IgnoreNotMatch.f43892) == 0) {
            throw new C16702("setter not found, class " + cls.getName() + ", property " + str);
        }
        c9327.m21603();
        ArrayList arrayList = c13351.f37486;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            typeM13103 = null;
            while (it.hasNext()) {
                typeM13103 = ((InterfaceC5822) it.next()).m13103();
            }
        } else {
            typeM13103 = null;
        }
        if (typeM13103 != null) {
            c13351.m30481((String) null, typeM13103);
        } else {
            c13351.m30480((Object) null);
        }
        if (obj instanceof InterfaceC17220) {
            ((InterfaceC17220) obj).m38994();
            return false;
        }
        ArrayList arrayList2 = c13351.f37488;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((InterfaceC4481) it2.next()).m9485();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    private AbstractC19904 m7427(String str) {
        boolean zStartsWith;
        long jM47041 = C20831.m47041(str);
        long[] jArr = this.f8160;
        AbstractC19904[] abstractC19904Arr = this.f8158;
        if (jArr == null) {
            long[] jArr2 = new long[abstractC19904Arr.length];
            for (int i = 0; i < abstractC19904Arr.length; i++) {
                jArr2[i] = C20831.m47041(abstractC19904Arr[i].f60448.f52263);
            }
            Arrays.sort(jArr2);
            this.f8160 = jArr2;
        }
        int iBinarySearch = Arrays.binarySearch(this.f8160, jM47041);
        if (iBinarySearch < 0) {
            zStartsWith = str.startsWith(C0655am.f2303ae);
            if (zStartsWith) {
                iBinarySearch = Arrays.binarySearch(this.f8160, C20831.m47041(str.substring(2)));
            }
        } else {
            zStartsWith = false;
        }
        if (iBinarySearch >= 0) {
            if (this.f8164 == null) {
                int[] iArr = new int[this.f8160.length];
                Arrays.fill(iArr, -1);
                for (int i2 = 0; i2 < abstractC19904Arr.length; i2++) {
                    int iBinarySearch2 = Arrays.binarySearch(this.f8160, C20831.m47041(abstractC19904Arr[i2].f60448.f52263));
                    if (iBinarySearch2 >= 0) {
                        iArr[iBinarySearch2] = i2;
                    }
                }
                this.f8164 = iArr;
            }
            int i3 = this.f8164[iBinarySearch];
            if (i3 != -1) {
                AbstractC19904 abstractC19904 = abstractC19904Arr[i3];
                Class cls = abstractC19904.f60448.f52254;
                if (!zStartsWith || cls == Boolean.TYPE || cls == Boolean.class) {
                    return abstractC19904;
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
    /* JADX INFO: renamed from: ֫ */
    public final Object m7429(Map map, C24597 c24597) throws IllegalAccessException, InvocationTargetException {
        double d;
        double d2;
        double d3;
        float f;
        float f2;
        float f3;
        String str;
        Object objM47028;
        C12528 c12528 = this.f8159;
        Constructor constructor = c12528.f35145;
        Constructor constructor2 = c12528.f35145;
        boolean z = false;
        if (constructor == null) {
            Object objM7430 = m7430((C13351) null, this.f8161);
            for (Map.Entry entry : map.entrySet()) {
                AbstractC19904 abstractC19904M7432 = m7432((String) entry.getKey());
                if (abstractC19904M7432 != null) {
                    C17476 c17476 = abstractC19904M7432.f60448;
                    Object value = entry.getValue();
                    Class cls = Boolean.TYPE;
                    Class cls2 = Double.TYPE;
                    Class cls3 = Float.TYPE;
                    Class cls4 = Long.TYPE;
                    Class cls5 = Integer.TYPE;
                    if (value == null) {
                        Class cls6 = c17476.f52254;
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
                    Method method = c17476.f52267;
                    if (method != null) {
                        Object[] objArr = new Object[1];
                        objArr[z ? 1 : 0] = C20831.m47028(value, method.getGenericParameterTypes()[z ? 1 : 0], c24597);
                        method.invoke(objM7430, objArr);
                    } else {
                        Field field = c17476.f52264;
                        Type type = c17476.f52261;
                        if (type == cls) {
                            if (value == Boolean.FALSE) {
                                field.setBoolean(objM7430, z);
                            } else if (value == Boolean.TRUE) {
                                field.setBoolean(objM7430, true);
                            } else {
                                str = c17476.f52258;
                                if (str == null && type == Date.class && (value instanceof String)) {
                                    try {
                                        objM47028 = new SimpleDateFormat(str).parse((String) value);
                                    } catch (ParseException unused) {
                                        objM47028 = null;
                                    }
                                } else if (type instanceof ParameterizedType) {
                                    objM47028 = C20831.m47027(value, (ParameterizedType) type, c24597);
                                } else {
                                    objM47028 = C20831.m47028(value, type, c24597);
                                }
                                field.set(objM7430, objM47028);
                            }
                        } else if (type == cls5) {
                            if (value instanceof Number) {
                                field.setInt(objM7430, ((Number) value).intValue());
                            } else {
                                str = c17476.f52258;
                                if (str == null) {
                                    if (type instanceof ParameterizedType) {
                                        objM47028 = C20831.m47027(value, (ParameterizedType) type, c24597);
                                    } else {
                                        objM47028 = C20831.m47028(value, type, c24597);
                                    }
                                } else if (type instanceof ParameterizedType) {
                                    objM47028 = C20831.m47027(value, (ParameterizedType) type, c24597);
                                } else {
                                    objM47028 = C20831.m47028(value, type, c24597);
                                }
                                field.set(objM7430, objM47028);
                            }
                        } else {
                            if (type != cls4) {
                                char c = '.';
                                char c2 = '-';
                                if (type == cls3) {
                                    if (value instanceof Number) {
                                        field.setFloat(objM7430, ((Number) value).floatValue());
                                    } else if (value instanceof String) {
                                        String str2 = (String) value;
                                        if (str2.length() <= 10) {
                                            int i = C20831.f65447;
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
                                        field.setFloat(objM7430, f);
                                    }
                                } else if (type == cls2) {
                                    if (value instanceof Number) {
                                        field.setDouble(objM7430, ((Number) value).doubleValue());
                                    } else if (value instanceof String) {
                                        String str3 = (String) value;
                                        if (str3.length() <= 10) {
                                            int i4 = C20831.f65447;
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
                                        field.setDouble(objM7430, d);
                                    }
                                } else if (value != null && type == value.getClass()) {
                                    field.set(objM7430, value);
                                }
                            } else if (value instanceof Number) {
                                field.setLong(objM7430, ((Number) value).longValue());
                            }
                            str = c17476.f52258;
                            if (str == null) {
                                if (type instanceof ParameterizedType) {
                                    objM47028 = C20831.m47027(value, (ParameterizedType) type, c24597);
                                } else {
                                    objM47028 = C20831.m47028(value, type, c24597);
                                }
                            } else if (type instanceof ParameterizedType) {
                                objM47028 = C20831.m47027(value, (ParameterizedType) type, c24597);
                            } else {
                                objM47028 = C20831.m47028(value, type, c24597);
                            }
                            field.set(objM7430, objM47028);
                        }
                    }
                    z = false;
                }
            }
            return objM7430;
        }
        C17476[] c17476Arr = c12528.f35150;
        int length3 = c17476Arr.length;
        Object[] objArr2 = new Object[length3];
        for (int i7 = 0; i7 < length3; i7++) {
            C17476 c17477 = c17476Arr[i7];
            Object objM47025 = map.get(c17477.f52263);
            if (objM47025 == null) {
                objM47025 = C20831.m47025(c17477.f52254);
            }
            objArr2[i7] = objM47025;
        }
        if (constructor2 == null) {
            return null;
        }
        try {
            return constructor2.newInstance(objArr2);
        } catch (Exception e) {
            throw new C16702("create instance error, " + constructor2.toGenericString(), (Throwable) e);
        }
    }
}
