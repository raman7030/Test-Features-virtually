package l;

import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.am;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩵ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95VI */
/* JADX INFO: loaded from: classes4.dex */
public final class C19426 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f62834 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f62835 = true;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static volatile Method f62836;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f62837;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static volatile Class f62838;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static volatile HashMap f62839;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static volatile Constructor f62840;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f62841;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f62842;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f62843;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f62844;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static volatile Method f62845;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static volatile Method f62846;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m44757(Class cls) {
        if (f62838 == null && !f62837) {
            try {
                f62838 = InterfaceC9470.class;
            } catch (Throwable unused) {
                f62837 = true;
            }
        }
        if (f62838 == null) {
            return false;
        }
        return cls.isAnnotationPresent(f62838);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String[] m44752(Class cls) {
        if (f62840 == null && !f62844) {
            try {
                Class<?> cls2 = Class.forName("kotlin.reflect.jvm.internal.KClassImpl");
                f62840 = cls2.getConstructor(Class.class);
                f62846 = cls2.getMethod("getConstructors", null);
                f62836 = InterfaceC6293.class.getMethod("getParameters", null);
                f62845 = InterfaceC11938.class.getMethod("getName", null);
            } catch (Throwable unused) {
                f62844 = true;
            }
        }
        if (f62840 == null || f62843) {
            return null;
        }
        try {
            Iterator it = ((Iterable) f62846.invoke(f62840.newInstance(cls), null)).iterator();
            Object obj = null;
            while (it.hasNext()) {
                Object next = it.next();
                List list = (List) f62836.invoke(next, null);
                if (obj == null || list.size() != 0) {
                    obj = next;
                }
                it.hasNext();
            }
            List list2 = (List) f62836.invoke(obj, null);
            String[] strArr = new String[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                strArr[i] = (String) f62845.invoke(list2.get(i), null);
            }
            return strArr;
        } catch (Throwable unused2) {
            f62843 = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Byte m44759(Object obj) {
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            throw new C15082(C5368.m15337(obj, "can not cast to byte, value : "));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(str));
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Short m44746(Object obj) {
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (!(obj instanceof String)) {
            throw new C15082(C5368.m15337(obj, "can not cast to short, value : "));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final BigDecimal m44738(Object obj) {
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string)) {
            return null;
        }
        return new BigDecimal(string);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final BigInteger m44751(Object obj) {
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string)) {
            return null;
        }
        return new BigInteger(string);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Float m44763(Object obj) {
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            throw new C15082(C5368.m15337(obj, "can not cast to float, value : "));
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(string));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Double m44753(Object obj) {
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            throw new C15082(C5368.m15337(obj, "can not cast to double, value : "));
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(string));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Date m44758(Object obj) {
        long jLongValue;
        if (obj instanceof Calendar) {
            return ((Calendar) obj).getTime();
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            int iScale = bigDecimal.scale();
            jLongValue = (iScale < -100 || iScale > 100) ? bigDecimal.longValueExact() : bigDecimal.longValue();
        } else if (obj instanceof Number) {
            jLongValue = ((Number) obj).longValue();
        } else if (obj instanceof String) {
            String str = (String) obj;
            if (str.indexOf(45) != -1) {
                int length = str.length();
                String str2 = AbstractC5206.f16310;
                if (length != str2.length()) {
                    if (str.length() == 10) {
                        str2 = "yyyy-MM-dd";
                    } else if (str.length() == 19) {
                        str2 = "yyyy-MM-dd HH:mm:ss";
                    } else {
                        str2 = (str.length() == 29 && str.charAt(26) == ':' && str.charAt(28) == '0') ? "yyyy-MM-dd'T'HH:mm:ss.SSSXXX" : "yyyy-MM-dd HH:mm:ss.SSS";
                    }
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, AbstractC5206.f16309);
                simpleDateFormat.setTimeZone(AbstractC5206.f16308);
                try {
                    return simpleDateFormat.parse(str);
                } catch (ParseException unused) {
                    throw new C15082("can not cast to Date, value : ".concat(str));
                }
            }
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            jLongValue = Long.parseLong(str);
        } else {
            jLongValue = -1;
        }
        if (jLongValue >= 0) {
            return new Date(jLongValue);
        }
        throw new C15082(C5368.m15337(obj, "can not cast to Date, value : "));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Long m44762(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            int iScale = bigDecimal.scale();
            return (iScale < -100 || iScale > 100) ? Long.valueOf(bigDecimal.longValueExact()) : Long.valueOf(bigDecimal.longValue());
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            try {
                return Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                C7322 c7322 = new C7322(str);
                Calendar calendar = c7322.m19643(false) ? c7322.f22494 : null;
                c7322.m19640();
                if (calendar != null) {
                    return Long.valueOf(calendar.getTimeInMillis());
                }
            }
        }
        throw new C15082(C5368.m15337(obj, "can not cast to long, value : "));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Integer m44745(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            int iScale = bigDecimal.scale();
            return (iScale < -100 || iScale > 100) ? Integer.valueOf(bigDecimal.intValueExact()) : Integer.valueOf(bigDecimal.intValue());
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            throw new C15082(C5368.m15337(obj, "can not cast to int, value : "));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Boolean m44754(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof BigDecimal) {
            return Boolean.valueOf(((BigDecimal) obj).intValueExact() == 1);
        }
        if (obj instanceof Number) {
            return Boolean.valueOf(((Number) obj).intValue() == 1);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            if ("true".equalsIgnoreCase(str) || "1".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(str) || "0".equals(str)) {
                return Boolean.FALSE;
            }
        }
        throw new C15082(C5368.m15337(obj, "can not cast to int, value : "));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object m44735(Map map, Class cls, C23389 c23389) {
        return m44732((Object) map, cls, c23389);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object m44732(Object obj, Class cls, C23389 c23389) {
        Calendar calendar;
        if (obj == null) {
            return null;
        }
        if (cls == null) {
            throw new IllegalArgumentException("clazz is null");
        }
        if (cls != obj.getClass()) {
            if (!(obj instanceof Map)) {
                int i = 0;
                if (cls.isArray()) {
                    if (obj instanceof Collection) {
                        Collection collection = (Collection) obj;
                        Object objNewInstance = Array.newInstance(cls.getComponentType(), collection.size());
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            Array.set(objNewInstance, i, m44732(it.next(), (Class) cls.getComponentType(), c23389));
                            i++;
                        }
                        return objNewInstance;
                    }
                    if (cls == byte[].class) {
                        if (obj instanceof byte[]) {
                            return (byte[]) obj;
                        }
                        if (!(obj instanceof String)) {
                            throw new C15082(C5368.m15337(obj, "can not cast to int, value : "));
                        }
                        String str = (String) obj;
                        return C7322.m19609(0, str.length(), str);
                    }
                }
                if (!cls.isAssignableFrom(obj.getClass())) {
                    if (cls == Boolean.TYPE || cls == Boolean.class) {
                        return m44754(obj);
                    }
                    if (cls == Byte.TYPE || cls == Byte.class) {
                        return m44759(obj);
                    }
                    if ((cls == Character.TYPE || cls == Character.class) && (obj instanceof String)) {
                        String str2 = (String) obj;
                        if (str2.length() == 1) {
                            return Character.valueOf(str2.charAt(0));
                        }
                    }
                    if (cls == Short.TYPE || cls == Short.class) {
                        return m44746(obj);
                    }
                    if (cls == Integer.TYPE || cls == Integer.class) {
                        return m44745(obj);
                    }
                    if (cls == Long.TYPE || cls == Long.class) {
                        return m44762(obj);
                    }
                    if (cls == Float.TYPE || cls == Float.class) {
                        return m44763(obj);
                    }
                    if (cls == Double.TYPE || cls == Double.class) {
                        return m44753(obj);
                    }
                    if (cls == String.class) {
                        return obj.toString();
                    }
                    if (cls == BigDecimal.class) {
                        return m44738(obj);
                    }
                    if (cls == BigInteger.class) {
                        return m44751(obj);
                    }
                    if (cls == Date.class) {
                        return m44758(obj);
                    }
                    if (cls.isEnum()) {
                        try {
                            if (obj instanceof String) {
                                String str3 = (String) obj;
                                if (str3.length() == 0) {
                                    return null;
                                }
                                return Enum.valueOf(cls, str3);
                            }
                            if ((obj instanceof Integer) || (obj instanceof Long)) {
                                int iIntValue = ((Number) obj).intValue();
                                Object[] enumConstants = cls.getEnumConstants();
                                if (iIntValue < enumConstants.length) {
                                    return enumConstants[iIntValue];
                                }
                            }
                            throw new C15082("can not cast to : ".concat(cls.getName()));
                        } catch (Exception e) {
                            throw new C15082("can not cast to : ".concat(cls.getName()), (Throwable) e);
                        }
                    }
                    if (Calendar.class.isAssignableFrom(cls)) {
                        Date dateM44758 = m44758(obj);
                        if (cls == Calendar.class) {
                            calendar = Calendar.getInstance(AbstractC5206.f16308, AbstractC5206.f16309);
                        } else {
                            try {
                                calendar = (Calendar) cls.newInstance();
                            } catch (Exception e2) {
                                throw new C15082("can not cast to : ".concat(cls.getName()), (Throwable) e2);
                            }
                        }
                        calendar.setTime(dateM44758);
                        return calendar;
                    }
                    if (obj instanceof String) {
                        String str4 = (String) obj;
                        if (str4.length() == 0 || "null".equals(str4)) {
                            return null;
                        }
                        if (cls == Currency.class) {
                            return Currency.getInstance(str4);
                        }
                    }
                    throw new C15082("can not cast to : ".concat(cls.getName()));
                }
            } else if (cls != Map.class) {
                Map map = (Map) obj;
                if (cls != Object.class || map.containsKey("@type")) {
                    return m44748(map, cls, c23389);
                }
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object m44734(Object obj, Type type, C23389 c23389) {
        if (obj == null) {
            return null;
        }
        if (type instanceof Class) {
            return m44732(obj, (Class) type, c23389);
        }
        if (type instanceof ParameterizedType) {
            return m44733(obj, (ParameterizedType) type, c23389);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
        }
        if (type instanceof TypeVariable) {
            return obj;
        }
        throw new C15082("can not cast to : " + type);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object m44733(Object obj, ParameterizedType parameterizedType, C23389 c23389) {
        Object objM44734;
        Collection hashSet;
        Object objM44735;
        if (obj == null) {
            return obj;
        }
        Type rawType = parameterizedType.getRawType();
        if (rawType == List.class || rawType == ArrayList.class) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object obj2 = list.get(i);
                    if (type instanceof Class) {
                        if (obj2 != null && obj2.getClass() == C21434.class) {
                            objM44734 = ((C21434) obj2).m48548((Class) type, c23389);
                        } else {
                            objM44734 = m44732(obj2, (Class) type, c23389);
                        }
                    } else {
                        objM44734 = m44734(obj2, type, c23389);
                    }
                    arrayList.add(objM44734);
                }
                return arrayList;
            }
        }
        if (rawType == Set.class || rawType == HashSet.class || rawType == TreeSet.class || rawType == List.class || rawType == ArrayList.class) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof Iterable) {
                if (rawType != Set.class && rawType != HashSet.class) {
                    if (rawType == TreeSet.class) {
                        hashSet = new TreeSet();
                    } else {
                        hashSet = new ArrayList();
                    }
                } else {
                    hashSet = new HashSet();
                }
                for (Object obj3 : (Iterable) obj) {
                    if (type2 instanceof Class) {
                        if (obj3 != null && obj3.getClass() == C21434.class) {
                            objM44735 = ((C21434) obj3).m48548((Class) type2, c23389);
                        } else {
                            objM44735 = m44732(obj3, (Class) type2, c23389);
                        }
                    } else {
                        objM44735 = m44734(obj3, type2, c23389);
                    }
                    hashSet.add(objM44735);
                }
                return hashSet;
            }
        }
        if (rawType == Map.class || rawType == HashMap.class) {
            Type type3 = parameterizedType.getActualTypeArguments()[0];
            Type type4 = parameterizedType.getActualTypeArguments()[1];
            if (obj instanceof Map) {
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    map.put(m44734(entry.getKey(), type3, c23389), m44734(entry.getValue(), type4, c23389));
                }
                return map;
            }
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
        }
        if (parameterizedType.getActualTypeArguments().length == 1 && (parameterizedType.getActualTypeArguments()[0] instanceof WildcardType)) {
            return m44734(obj, rawType, c23389);
        }
        throw new C15082("can not cast to : " + parameterizedType);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Object m44748(Map map, Class cls, C23389 c23389) {
        C21434 c21434;
        int iIntValue = 0;
        try {
            if (cls == StackTraceElement.class) {
                String str = (String) map.get("className");
                String str2 = (String) map.get("methodName");
                String str3 = (String) map.get("fileName");
                Number number = (Number) map.get("lineNumber");
                if (number != null) {
                    if (number instanceof BigDecimal) {
                        iIntValue = ((BigDecimal) number).intValueExact();
                    } else {
                        iIntValue = number.intValue();
                    }
                }
                return new StackTraceElement(str, str2, str3, iIntValue);
            }
            Object obj = map.get("@type");
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (c23389 == null) {
                    c23389 = C23389.f75137;
                }
                Class clsM51836 = c23389.m51836(str4, 0, null);
                if (clsM51836 == null) {
                    throw new ClassNotFoundException(str4.concat(" not found"));
                }
                if (!clsM51836.equals(cls)) {
                    return m44748(map, clsM51836, c23389);
                }
            }
            if (cls.isInterface()) {
                if (map instanceof C21434) {
                    c21434 = (C21434) map;
                } else {
                    c21434 = new C21434(map);
                }
                if (c23389 == null) {
                    c23389 = C23389.f75137;
                }
                if (c23389.m51838((Type) cls) == null) {
                    return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, c21434);
                }
                C11556 c11556 = new C11556(AbstractC5206.m14985(c21434), C23389.f75137, AbstractC5206.f16312);
                Object objM28435 = c11556.m28435((String) null, cls);
                c11556.m28450();
                c11556.close();
                return objM28435;
            }
            if (cls == String.class && (map instanceof C21434)) {
                return map.toString();
            }
            if (c23389 == null) {
                c23389 = C23389.f75137;
            }
            InterfaceC19157 interfaceC19157M51838 = c23389.m51838((Type) cls);
            C1517 c1517 = interfaceC19157M51838 instanceof C1517 ? (C1517) interfaceC19157M51838 : null;
            if (c1517 == null) {
                throw new C15082("can not get javaBeanDeserializer");
            }
            return c1517.m5202(map, c23389);
        } catch (Exception e) {
            throw new C15082(e.getMessage(), (Throwable) e);
        }
    }

    static {
        ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942(36, 0.75f, 1);
        f62841 = concurrentMapC10942;
        concurrentMapC10942.put(ClassTransform.BYTE, Byte.TYPE);
        concurrentMapC10942.put(ClassTransform.SHORT, Short.TYPE);
        concurrentMapC10942.put(ClassTransform.INTEGER, Integer.TYPE);
        concurrentMapC10942.put(ClassTransform.LONG, Long.TYPE);
        concurrentMapC10942.put(ClassTransform.FLOAT, Float.TYPE);
        concurrentMapC10942.put(ClassTransform.DOUBLE, Double.TYPE);
        concurrentMapC10942.put(ClassTransform.BOOLEAN, Boolean.TYPE);
        concurrentMapC10942.put(ClassTransform.CHARACTER, Character.TYPE);
        concurrentMapC10942.put("[byte", byte[].class);
        concurrentMapC10942.put("[short", short[].class);
        concurrentMapC10942.put("[int", int[].class);
        concurrentMapC10942.put("[long", long[].class);
        concurrentMapC10942.put("[float", float[].class);
        concurrentMapC10942.put("[double", double[].class);
        concurrentMapC10942.put("[boolean", boolean[].class);
        concurrentMapC10942.put("[char", char[].class);
        concurrentMapC10942.put("[B", byte[].class);
        concurrentMapC10942.put("[S", short[].class);
        concurrentMapC10942.put("[I", int[].class);
        concurrentMapC10942.put("[J", long[].class);
        concurrentMapC10942.put("[F", float[].class);
        concurrentMapC10942.put("[D", double[].class);
        concurrentMapC10942.put("[C", char[].class);
        concurrentMapC10942.put("[Z", boolean[].class);
        concurrentMapC10942.put("java.util.HashMap", HashMap.class);
        concurrentMapC10942.put("java.util.TreeMap", TreeMap.class);
        concurrentMapC10942.put("java.util.Date", Date.class);
        concurrentMapC10942.put("com.alibaba.fastjson.JSONObject", C21434.class);
        concurrentMapC10942.put("java.util.concurrent.ConcurrentHashMap", ConcurrentMapC10942.class);
        concurrentMapC10942.put("java.text.SimpleDateFormat", SimpleDateFormat.class);
        concurrentMapC10942.put("java.lang.StackTraceElement", StackTraceElement.class);
        concurrentMapC10942.put("java.lang.RuntimeException", RuntimeException.class);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Class m44755(String str) {
        return (Class) f62841.get(str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Class m44760(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.length() >= 256) {
            throw new C15082("className too long. ".concat(str));
        }
        ConcurrentMapC10942 concurrentMapC10942 = f62841;
        Class<?> cls = (Class) concurrentMapC10942.get(str);
        if (cls != null) {
            return cls;
        }
        if (str.charAt(0) == '[') {
            Class clsM44760 = m44760(str.substring(1));
            if (clsM44760 == null) {
                return null;
            }
            return Array.newInstance((Class<?>) clsM44760, 0).getClass();
        }
        if (str.startsWith("L") && str.endsWith(l.b)) {
            return m44760(str.substring(1, str.length() - 1));
        }
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                return contextClassLoader.loadClass(str);
            }
        } catch (Exception unused) {
        }
        try {
            cls = Class.forName(str);
            concurrentMapC10942.put(str, cls);
            return cls;
        } catch (Exception unused2) {
            return cls;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:107:0x0208 A[LOOP:5: B:103:0x01f3->B:107:0x0208, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x0212  */
    /* JADX WARN: Code duplicated, block: B:111:0x021d  */
    /* JADX WARN: Code duplicated, block: B:114:0x022d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0233  */
    /* JADX WARN: Code duplicated, block: B:117:0x0239 A[PHI: r28 r29 r30
      0x0239: PHI (r28v3 l.ۙ۟ۡ) = (r24v5 l.ۙ۟ۡ), (r24v5 l.ۙ۟ۡ), (r28v5 l.ۙ۟ۡ), (r28v6 l.ۙ۟ۡ) binds: [B:128:0x029a, B:145:0x02f5, B:120:0x0253, B:116:0x0233] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r29v3 int) = (r7v1 int), (r7v1 int), (r29v5 int), (r29v6 int) binds: [B:128:0x029a, B:145:0x02f5, B:120:0x0253, B:116:0x0233] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r30v7 java.lang.Class<? super ? super java.lang.Object>) = 
      (r25v2 java.lang.Class<? super ? super java.lang.Object>)
      (r25v2 java.lang.Class<? super ? super java.lang.Object>)
      (r30v9 java.lang.Class<? super ? super java.lang.Object>)
      (r30v10 java.lang.Class<? super ? super java.lang.Object>)
     binds: [B:128:0x029a, B:145:0x02f5, B:120:0x0253, B:116:0x0233] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x023d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0253  */
    /* JADX WARN: Code duplicated, block: B:121:0x0278  */
    /* JADX WARN: Code duplicated, block: B:122:0x027f  */
    /* JADX WARN: Code duplicated, block: B:125:0x028d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0294  */
    /* JADX WARN: Code duplicated, block: B:130:0x029d  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:136:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:138:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:141:0x02de  */
    /* JADX WARN: Code duplicated, block: B:147:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:149:0x0300  */
    /* JADX WARN: Code duplicated, block: B:151:0x0308  */
    /* JADX WARN: Code duplicated, block: B:154:0x0317  */
    /* JADX WARN: Code duplicated, block: B:156:0x032d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0333  */
    /* JADX WARN: Code duplicated, block: B:161:0x033f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x0377  */
    /* JADX WARN: Code duplicated, block: B:168:0x0388  */
    /* JADX WARN: Code duplicated, block: B:202:0x043f  */
    /* JADX WARN: Code duplicated, block: B:310:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:132:0x02a8, please report this as an issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m44739(Class cls, int i, InterfaceC12261 interfaceC12261, boolean z, EnumC4500 enumC4500) {
        Class<? super Object> cls2;
        boolean z2;
        String[] strArrOrders;
        int i2;
        int i3;
        String[] strArr;
        boolean z3;
        Field[] fieldArr;
        Class<? super Object> cls3;
        EnumC4500 enumC4501;
        Annotation[][] annotationArr;
        short[] sArr;
        Annotation[][] parameterAnnotations;
        short[] sArr2;
        Constructor<?>[] constructorArr;
        InterfaceC12966 interfaceC12966;
        Annotation[][] annotationArr2;
        int iM47652;
        int iOrdinal;
        Field[] fieldArr2;
        EnumC4500 enumC4502;
        String strSubstring;
        int i4;
        InterfaceC12966 interfaceC12967;
        char cCharAt;
        String strM44736;
        Field fieldM44737;
        InterfaceC12966 interfaceC12968;
        boolean z4;
        EnumC4500 enumC4503;
        short[] sArr3;
        String[] strArrM44752;
        short[] sArr4;
        int i5;
        Annotation[] annotationArr3;
        int length;
        int i6;
        Annotation annotation;
        Annotation[] annotationArr4;
        String[] strArr2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap map = new HashMap();
        Field[] declaredFields = cls.getDeclaredFields();
        boolean zM44757 = m44757(cls);
        ArrayList<Method> arrayList = new ArrayList();
        Class superclass = cls;
        while (true) {
            cls2 = Object.class;
            if (superclass == null || superclass == cls2) {
                break;
            }
            for (Method method : superclass.getDeclaredMethods()) {
                int modifiers = method.getModifiers();
                if ((modifiers & 8) == 0 && (modifiers & 2) == 0 && (modifiers & 256) == 0 && (modifiers & 4) == 0 && !method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 0 && method.getReturnType() != ClassLoader.class && method.getDeclaringClass() != cls2) {
                    arrayList.add(method);
                }
            }
            superclass = superclass.getSuperclass();
        }
        String[] strArr3 = null;
        int i7 = i;
        EnumC4500 enumC4504 = enumC4500;
        short[] sArr5 = null;
        Constructor<?>[] declaredConstructors = null;
        String[] strArr4 = null;
        Annotation[][] annotationArr5 = null;
        for (Method method2 : arrayList) {
            String name = method2.getName();
            short[] sArr6 = sArr5;
            if (name.equals("getMetaClass")) {
                z3 = true;
                strArr = strArr4;
                if (method2.getReturnType().getName().equals("groovy.lang.MetaClass")) {
                    annotationArr = annotationArr5;
                    enumC4501 = enumC4504;
                    cls3 = cls2;
                    fieldArr = declaredFields;
                }
                sArr5 = sArr6;
                strArr4 = strArr;
                annotationArr5 = annotationArr;
                enumC4504 = enumC4501;
                cls2 = cls3;
                declaredFields = fieldArr;
            } else {
                strArr = strArr4;
                z3 = true;
            }
            InterfaceC12966 interfaceC12966M44740 = (InterfaceC12966) method2.getAnnotation(InterfaceC12966.class);
            if (interfaceC12966M44740 == null) {
                interfaceC12966M44740 = m44740(method2, cls);
            }
            if (zM44757) {
                annotationArr = annotationArr5;
                if (f62839 != null || f62842) {
                    enumC4501 = enumC4504;
                    cls3 = cls2;
                    fieldArr = declaredFields;
                } else {
                    enumC4501 = enumC4504;
                    try {
                        HashMap map2 = new HashMap();
                        cls3 = cls2;
                        try {
                            int i8 = C8410.f25763;
                            fieldArr = declaredFields;
                            try {
                                map2.put(C8410.class, new String[]{"getEndInclusive", "isEmpty"});
                                int i9 = C4882.f15427;
                                map2.put(C4882.class, new String[]{"getEndInclusive", "isEmpty"});
                                map2.put(C13348.class, new String[]{"getEndInclusive", "isEmpty"});
                                map2.put(Class.forName("l.᩸᩶᩵"), new String[]{"getEndInclusive", "isEmpty"});
                                map2.put(Class.forName("l.ܶ᩶᩵"), new String[]{"getEndInclusive", "isEmpty"});
                                f62839 = map2;
                            } catch (Throwable unused) {
                                f62842 = z3;
                            }
                        } catch (Throwable unused2) {
                            fieldArr = declaredFields;
                            f62842 = z3;
                            if (f62839 != null) {
                                sArr5 = sArr6;
                                strArr4 = strArr;
                                annotationArr5 = annotationArr;
                                enumC4504 = enumC4501;
                                cls2 = cls3;
                                declaredFields = fieldArr;
                            }
                            if (interfaceC12966M44740 == null) {
                                interfaceC12966M44740 = interfaceC12966M44740;
                                sArr = sArr6;
                                parameterAnnotations = annotationArr;
                                sArr2 = sArr;
                                constructorArr = declaredConstructors;
                                interfaceC12966 = interfaceC12966M44740;
                                annotationArr2 = parameterAnnotations;
                            } else {
                                interfaceC12966M44740 = interfaceC12966M44740;
                                sArr = sArr6;
                                parameterAnnotations = annotationArr;
                                sArr2 = sArr;
                                constructorArr = declaredConstructors;
                                interfaceC12966 = interfaceC12966M44740;
                                annotationArr2 = parameterAnnotations;
                            }
                            if (interfaceC12966 != null) {
                                if (interfaceC12966.serialize()) {
                                    iOrdinal = interfaceC12966.ordinal();
                                    iM47652 = EnumC20837.m47652(interfaceC12966.serialzeFeatures());
                                    if (interfaceC12966.name().length() != 0) {
                                        String strName = interfaceC12966.name();
                                        m44742(cls, method2, i7);
                                        enumC4501 = enumC4501;
                                        i7 = i7;
                                        cls3 = cls3;
                                        linkedHashMap.put(strName, new C15896(strName, method2, null, cls, null, iOrdinal, iM47652, interfaceC12966, null));
                                    }
                                } else {
                                    i7 = i7;
                                    enumC4501 = enumC4501;
                                    cls3 = cls3;
                                }
                                fieldArr2 = fieldArr;
                                fieldArr2 = fieldArr2;
                                enumC4504 = enumC4501;
                                i7 = i7;
                                declaredFields = fieldArr2;
                                annotationArr5 = annotationArr2;
                                sArr5 = sArr2;
                                declaredConstructors = constructorArr;
                                strArr4 = strArr;
                                cls2 = cls3;
                            } else {
                                iM47652 = 0;
                                iOrdinal = 0;
                            }
                            if (name.startsWith("get")) {
                                if (name.length() >= 4) {
                                    if (name.equals("getClass")) {
                                        fieldArr2 = fieldArr;
                                    } else {
                                        cCharAt = name.charAt(3);
                                        if (Character.isUpperCase(cCharAt)) {
                                            strM44736 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                                        } else if (cCharAt == '_') {
                                            strM44736 = name.substring(4);
                                        } else if (cCharAt == 'f') {
                                            strM44736 = name.substring(3);
                                        } else if (name.length() < 5) {
                                        }
                                        if (m44743(cls, interfaceC12261, strM44736)) {
                                            fieldArr2 = fieldArr;
                                        } else {
                                            fieldArr2 = fieldArr;
                                            fieldM44737 = m44737(cls, strM44736, fieldArr2, map);
                                            if (fieldM44737 != null) {
                                                interfaceC12968 = (InterfaceC12966) fieldM44737.getAnnotation(InterfaceC12966.class);
                                                if (interfaceC12968 != null) {
                                                    if (interfaceC12968.serialize()) {
                                                        iOrdinal = interfaceC12968.ordinal();
                                                        iM47652 = EnumC20837.m47652(interfaceC12968.serialzeFeatures());
                                                        if (interfaceC12968.name().length() != 0) {
                                                            strM44736 = interfaceC12968.name();
                                                            z4 = true;
                                                        }
                                                    }
                                                    declaredFields = fieldArr2;
                                                    annotationArr5 = annotationArr2;
                                                    sArr5 = sArr2;
                                                    declaredConstructors = constructorArr;
                                                    strArr4 = strArr;
                                                    cls2 = cls3;
                                                }
                                                InterfaceC12966 interfaceC12969 = interfaceC12968;
                                                int i10 = iOrdinal;
                                                int i11 = iM47652;
                                                enumC4503 = enumC4501;
                                                if (enumC4503 != null) {
                                                    strM44736 = enumC4503.m13252(strM44736);
                                                }
                                                String str = strM44736;
                                                m44742(cls, method2, i7);
                                                iOrdinal = i10;
                                                linkedHashMap.put(str, new C15896(str, method2, fieldM44737, cls, null, iOrdinal, i11, interfaceC12966, interfaceC12969));
                                                iM47652 = i11;
                                            } else {
                                                interfaceC12968 = null;
                                            }
                                            z4 = false;
                                            InterfaceC12966 interfaceC129610 = interfaceC12968;
                                            int i12 = iOrdinal;
                                            int i13 = iM47652;
                                            enumC4503 = enumC4501;
                                            if (enumC4503 != null) {
                                                strM44736 = enumC4503.m13252(strM44736);
                                            }
                                            String str2 = strM44736;
                                            m44742(cls, method2, i7);
                                            iOrdinal = i12;
                                            linkedHashMap.put(str2, new C15896(str2, method2, fieldM44737, cls, null, iOrdinal, i13, interfaceC12966, interfaceC129610));
                                            iM47652 = i13;
                                        }
                                    }
                                    fieldArr2 = fieldArr2;
                                    enumC4504 = enumC4501;
                                    i7 = i7;
                                    declaredFields = fieldArr2;
                                    annotationArr5 = annotationArr2;
                                    sArr5 = sArr2;
                                    declaredConstructors = constructorArr;
                                    strArr4 = strArr;
                                    cls2 = cls3;
                                }
                                enumC4502 = enumC4500;
                                fieldArr2 = fieldArr;
                                i7 = i;
                                enumC4504 = enumC4502;
                                declaredFields = fieldArr2;
                                annotationArr5 = annotationArr2;
                                sArr5 = sArr2;
                                declaredConstructors = constructorArr;
                                strArr4 = strArr;
                                cls2 = cls3;
                            } else {
                                fieldArr2 = fieldArr;
                            }
                            if (name.startsWith(am.ae)) {
                                fieldArr2 = fieldArr2;
                                enumC4502 = enumC4500;
                            } else {
                                fieldArr2 = fieldArr2;
                                enumC4502 = enumC4500;
                            }
                            i7 = i;
                            enumC4504 = enumC4502;
                            declaredFields = fieldArr2;
                            annotationArr5 = annotationArr2;
                            sArr5 = sArr2;
                            declaredConstructors = constructorArr;
                            strArr4 = strArr;
                            cls2 = cls3;
                        }
                    } catch (Throwable unused3) {
                        cls3 = cls2;
                    }
                }
                if (f62839 != null && (strArr2 = (String[]) f62839.get(cls)) != null && Arrays.binarySearch(strArr2, name) >= 0) {
                    sArr5 = sArr6;
                    strArr4 = strArr;
                    annotationArr5 = annotationArr;
                    enumC4504 = enumC4501;
                    cls2 = cls3;
                    declaredFields = fieldArr;
                }
            } else {
                annotationArr = annotationArr5;
                enumC4501 = enumC4504;
                cls3 = cls2;
                fieldArr = declaredFields;
            }
            if (interfaceC12966M44740 == null || !zM44757) {
                interfaceC12966M44740 = interfaceC12966M44740;
                sArr = sArr6;
                parameterAnnotations = annotationArr;
            } else {
                if (declaredConstructors == null) {
                    declaredConstructors = cls.getDeclaredConstructors();
                    if (declaredConstructors.length == 1) {
                        parameterAnnotations = declaredConstructors[0].getParameterAnnotations();
                        strArrM44752 = m44752(cls);
                        if (strArrM44752 != null) {
                            String[] strArr5 = new String[strArrM44752.length];
                            interfaceC12966M44740 = interfaceC12966M44740;
                            System.arraycopy(strArrM44752, 0, strArr5, 0, strArrM44752.length);
                            Arrays.sort(strArr5);
                            short[] sArr7 = new short[strArrM44752.length];
                            for (short s = 0; s < strArrM44752.length; s = (short) (s + 1)) {
                                sArr7[Arrays.binarySearch(strArr5, strArrM44752[s])] = s;
                            }
                            strArrM44752 = strArr5;
                            sArr3 = sArr7;
                            declaredConstructors = declaredConstructors;
                        } else {
                            interfaceC12966M44740 = interfaceC12966M44740;
                            sArr3 = sArr6;
                        }
                    }
                    if (strArrM44752 == null && sArr3 != null && name.startsWith("get")) {
                        String strM44737 = m44736(name.substring(3));
                        int iBinarySearch = Arrays.binarySearch(strArrM44752, strM44737);
                        if (iBinarySearch < 0) {
                            constructorArr = declaredConstructors;
                            int i14 = 0;
                            while (true) {
                                if (i14 < strArrM44752.length) {
                                    if (strM44737.equalsIgnoreCase(strArrM44752[i14])) {
                                        i5 = i14;
                                        break;
                                    }
                                    i14++;
                                }
                            }
                            if (i5 >= 0 && (annotationArr3 = parameterAnnotations[sArr3[i5]]) != null) {
                                length = annotationArr3.length;
                                i6 = 0;
                                while (true) {
                                    if (i6 < length) {
                                        sArr2 = sArr3;
                                        annotation = annotationArr3[i6];
                                        annotationArr4 = annotationArr3;
                                        if (annotation instanceof InterfaceC12966) {
                                            interfaceC12966 = (InterfaceC12966) annotation;
                                            annotationArr2 = parameterAnnotations;
                                            strArr = strArrM44752;
                                        } else {
                                            i6++;
                                            sArr3 = sArr2;
                                            annotationArr3 = annotationArr4;
                                        }
                                    }
                                    if (interfaceC12966 != null) {
                                        if (interfaceC12966.serialize()) {
                                            i7 = i7;
                                            enumC4501 = enumC4501;
                                            cls3 = cls3;
                                        } else {
                                            iOrdinal = interfaceC12966.ordinal();
                                            iM47652 = EnumC20837.m47652(interfaceC12966.serialzeFeatures());
                                            if (interfaceC12966.name().length() != 0) {
                                                String strName2 = interfaceC12966.name();
                                                m44742(cls, method2, i7);
                                                enumC4501 = enumC4501;
                                                i7 = i7;
                                                cls3 = cls3;
                                                linkedHashMap.put(strName2, new C15896(strName2, method2, null, cls, null, iOrdinal, iM47652, interfaceC12966, null));
                                            }
                                        }
                                        fieldArr2 = fieldArr;
                                        fieldArr2 = fieldArr2;
                                        enumC4504 = enumC4501;
                                        i7 = i7;
                                        declaredFields = fieldArr2;
                                        annotationArr5 = annotationArr2;
                                        sArr5 = sArr2;
                                        declaredConstructors = constructorArr;
                                        strArr4 = strArr;
                                        cls2 = cls3;
                                    } else {
                                        iM47652 = 0;
                                        iOrdinal = 0;
                                    }
                                    if (name.startsWith("get")) {
                                        if (name.length() >= 4) {
                                            if (name.equals("getClass")) {
                                                fieldArr2 = fieldArr;
                                            } else {
                                                cCharAt = name.charAt(3);
                                                if (Character.isUpperCase(cCharAt)) {
                                                    strM44736 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                                                } else if (cCharAt == '_') {
                                                    strM44736 = name.substring(4);
                                                } else if (cCharAt == 'f') {
                                                    strM44736 = name.substring(3);
                                                } else {
                                                    if (name.length() < 5 && Character.isUpperCase(name.charAt(4))) {
                                                        strM44736 = m44736(name.substring(3));
                                                    }
                                                    i7 = i;
                                                    enumC4504 = enumC4502;
                                                    declaredFields = fieldArr2;
                                                    annotationArr5 = annotationArr2;
                                                    sArr5 = sArr2;
                                                    declaredConstructors = constructorArr;
                                                    strArr4 = strArr;
                                                    cls2 = cls3;
                                                }
                                                if (m44743(cls, interfaceC12261, strM44736)) {
                                                    fieldArr2 = fieldArr;
                                                } else {
                                                    fieldArr2 = fieldArr;
                                                    fieldM44737 = m44737(cls, strM44736, fieldArr2, map);
                                                    if (fieldM44737 != null) {
                                                        interfaceC12968 = (InterfaceC12966) fieldM44737.getAnnotation(InterfaceC12966.class);
                                                        if (interfaceC12968 != null) {
                                                            if (interfaceC12968.serialize()) {
                                                                iOrdinal = interfaceC12968.ordinal();
                                                                iM47652 = EnumC20837.m47652(interfaceC12968.serialzeFeatures());
                                                                if (interfaceC12968.name().length() != 0) {
                                                                    strM44736 = interfaceC12968.name();
                                                                    z4 = true;
                                                                }
                                                            }
                                                            declaredFields = fieldArr2;
                                                            annotationArr5 = annotationArr2;
                                                            sArr5 = sArr2;
                                                            declaredConstructors = constructorArr;
                                                            strArr4 = strArr;
                                                            cls2 = cls3;
                                                        }
                                                        InterfaceC12966 interfaceC129611 = interfaceC12968;
                                                        int i15 = iOrdinal;
                                                        int i16 = iM47652;
                                                        enumC4503 = enumC4501;
                                                        if (enumC4503 != null && !z4) {
                                                            strM44736 = enumC4503.m13252(strM44736);
                                                        }
                                                        String str3 = strM44736;
                                                        m44742(cls, method2, i7);
                                                        iOrdinal = i15;
                                                        linkedHashMap.put(str3, new C15896(str3, method2, fieldM44737, cls, null, iOrdinal, i16, interfaceC12966, interfaceC129611));
                                                        iM47652 = i16;
                                                    } else {
                                                        interfaceC12968 = null;
                                                    }
                                                    z4 = false;
                                                    InterfaceC12966 interfaceC129612 = interfaceC12968;
                                                    int i17 = iOrdinal;
                                                    int i18 = iM47652;
                                                    enumC4503 = enumC4501;
                                                    if (enumC4503 != null) {
                                                        strM44736 = enumC4503.m13252(strM44736);
                                                    }
                                                    String str4 = strM44736;
                                                    m44742(cls, method2, i7);
                                                    iOrdinal = i17;
                                                    linkedHashMap.put(str4, new C15896(str4, method2, fieldM44737, cls, null, iOrdinal, i18, interfaceC12966, interfaceC129612));
                                                    iM47652 = i18;
                                                }
                                            }
                                            fieldArr2 = fieldArr2;
                                            enumC4504 = enumC4501;
                                            i7 = i7;
                                            declaredFields = fieldArr2;
                                            annotationArr5 = annotationArr2;
                                            sArr5 = sArr2;
                                            declaredConstructors = constructorArr;
                                            strArr4 = strArr;
                                            cls2 = cls3;
                                        }
                                        enumC4502 = enumC4500;
                                        fieldArr2 = fieldArr;
                                        i7 = i;
                                        enumC4504 = enumC4502;
                                        declaredFields = fieldArr2;
                                        annotationArr5 = annotationArr2;
                                        sArr5 = sArr2;
                                        declaredConstructors = constructorArr;
                                        strArr4 = strArr;
                                        cls2 = cls3;
                                    } else {
                                        fieldArr2 = fieldArr;
                                    }
                                    if (name.startsWith(am.ae) || name.length() < 3) {
                                        fieldArr2 = fieldArr2;
                                        enumC4502 = enumC4500;
                                    } else {
                                        char cCharAt2 = name.charAt(2);
                                        if (Character.isUpperCase(cCharAt2)) {
                                            strSubstring = Character.toLowerCase(name.charAt(2)) + name.substring(3);
                                        } else if (cCharAt2 == '_') {
                                            strSubstring = name.substring(3);
                                        } else if (cCharAt2 == 'f') {
                                            strSubstring = name.substring(2);
                                        } else {
                                            fieldArr2 = fieldArr2;
                                            enumC4502 = enumC4500;
                                        }
                                        if (m44743(cls, interfaceC12261, strSubstring)) {
                                            fieldArr2 = fieldArr2;
                                            enumC4502 = enumC4500;
                                        } else {
                                            Field fieldM44738 = m44737(cls, strSubstring, fieldArr2, map);
                                            if (fieldM44738 == null) {
                                                fieldM44738 = m44737(cls, name, fieldArr2, map);
                                            }
                                            Field field = fieldM44738;
                                            if (field != null) {
                                                InterfaceC12966 interfaceC129613 = (InterfaceC12966) field.getAnnotation(InterfaceC12966.class);
                                                if (interfaceC129613 != null) {
                                                    if (interfaceC129613.serialize()) {
                                                        iOrdinal = interfaceC129613.ordinal();
                                                        iM47652 = EnumC20837.m47652(interfaceC129613.serialzeFeatures());
                                                        if (interfaceC129613.name().length() != 0) {
                                                            strSubstring = interfaceC129613.name();
                                                        }
                                                    } else {
                                                        fieldArr2 = fieldArr2;
                                                        enumC4502 = enumC4500;
                                                    }
                                                }
                                                interfaceC12967 = interfaceC129613;
                                                i4 = iM47652;
                                            } else {
                                                i4 = iM47652;
                                                interfaceC12967 = null;
                                            }
                                            enumC4502 = enumC4500;
                                            if (enumC4502 != null) {
                                                strSubstring = enumC4502.m13252(strSubstring);
                                            }
                                            String str5 = strSubstring;
                                            m44742(cls, field, i);
                                            m44742(cls, method2, i);
                                            linkedHashMap.put(str5, new C15896(str5, method2, field, cls, null, iOrdinal, i4, interfaceC12966, interfaceC12967));
                                        }
                                    }
                                    i7 = i;
                                    enumC4504 = enumC4502;
                                    declaredFields = fieldArr2;
                                    annotationArr5 = annotationArr2;
                                    sArr5 = sArr2;
                                    declaredConstructors = constructorArr;
                                    strArr4 = strArr;
                                    cls2 = cls3;
                                }
                            }
                            sArr4 = sArr3;
                        } else {
                            constructorArr = declaredConstructors;
                        }
                        i5 = iBinarySearch;
                        if (i5 >= 0) {
                            length = annotationArr3.length;
                            i6 = 0;
                            while (true) {
                                if (i6 < length) {
                                    sArr2 = sArr3;
                                    annotation = annotationArr3[i6];
                                    annotationArr4 = annotationArr3;
                                    if (annotation instanceof InterfaceC12966) {
                                        interfaceC12966 = (InterfaceC12966) annotation;
                                        annotationArr2 = parameterAnnotations;
                                        strArr = strArrM44752;
                                    } else {
                                        i6++;
                                        sArr3 = sArr2;
                                        annotationArr3 = annotationArr4;
                                    }
                                }
                                if (interfaceC12966 != null) {
                                    if (interfaceC12966.serialize()) {
                                        i7 = i7;
                                        enumC4501 = enumC4501;
                                        cls3 = cls3;
                                    } else {
                                        iOrdinal = interfaceC12966.ordinal();
                                        iM47652 = EnumC20837.m47652(interfaceC12966.serialzeFeatures());
                                        if (interfaceC12966.name().length() != 0) {
                                            String strName3 = interfaceC12966.name();
                                            m44742(cls, method2, i7);
                                            enumC4501 = enumC4501;
                                            i7 = i7;
                                            cls3 = cls3;
                                            linkedHashMap.put(strName3, new C15896(strName3, method2, null, cls, null, iOrdinal, iM47652, interfaceC12966, null));
                                        }
                                    }
                                    fieldArr2 = fieldArr;
                                    fieldArr2 = fieldArr2;
                                    enumC4504 = enumC4501;
                                    i7 = i7;
                                    declaredFields = fieldArr2;
                                    annotationArr5 = annotationArr2;
                                    sArr5 = sArr2;
                                    declaredConstructors = constructorArr;
                                    strArr4 = strArr;
                                    cls2 = cls3;
                                } else {
                                    iM47652 = 0;
                                    iOrdinal = 0;
                                }
                                if (name.startsWith("get")) {
                                    if (name.length() >= 4) {
                                        if (name.equals("getClass")) {
                                            fieldArr2 = fieldArr;
                                        } else {
                                            cCharAt = name.charAt(3);
                                            if (Character.isUpperCase(cCharAt)) {
                                                strM44736 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                                            } else if (cCharAt == '_') {
                                                strM44736 = name.substring(4);
                                            } else if (cCharAt == 'f') {
                                                strM44736 = name.substring(3);
                                            } else if (name.length() < 5) {
                                            }
                                            if (m44743(cls, interfaceC12261, strM44736)) {
                                                fieldArr2 = fieldArr;
                                            } else {
                                                fieldArr2 = fieldArr;
                                                fieldM44737 = m44737(cls, strM44736, fieldArr2, map);
                                                if (fieldM44737 != null) {
                                                    interfaceC12968 = (InterfaceC12966) fieldM44737.getAnnotation(InterfaceC12966.class);
                                                    if (interfaceC12968 != null) {
                                                        if (interfaceC12968.serialize()) {
                                                            iOrdinal = interfaceC12968.ordinal();
                                                            iM47652 = EnumC20837.m47652(interfaceC12968.serialzeFeatures());
                                                            if (interfaceC12968.name().length() != 0) {
                                                                strM44736 = interfaceC12968.name();
                                                                z4 = true;
                                                            }
                                                        }
                                                        declaredFields = fieldArr2;
                                                        annotationArr5 = annotationArr2;
                                                        sArr5 = sArr2;
                                                        declaredConstructors = constructorArr;
                                                        strArr4 = strArr;
                                                        cls2 = cls3;
                                                    }
                                                    InterfaceC12966 interfaceC129614 = interfaceC12968;
                                                    int i19 = iOrdinal;
                                                    int i110 = iM47652;
                                                    enumC4503 = enumC4501;
                                                    if (enumC4503 != null) {
                                                        strM44736 = enumC4503.m13252(strM44736);
                                                    }
                                                    String str6 = strM44736;
                                                    m44742(cls, method2, i7);
                                                    iOrdinal = i19;
                                                    linkedHashMap.put(str6, new C15896(str6, method2, fieldM44737, cls, null, iOrdinal, i110, interfaceC12966, interfaceC129614));
                                                    iM47652 = i110;
                                                } else {
                                                    interfaceC12968 = null;
                                                }
                                                z4 = false;
                                                InterfaceC12966 interfaceC129615 = interfaceC12968;
                                                int i111 = iOrdinal;
                                                int i112 = iM47652;
                                                enumC4503 = enumC4501;
                                                if (enumC4503 != null) {
                                                    strM44736 = enumC4503.m13252(strM44736);
                                                }
                                                String str7 = strM44736;
                                                m44742(cls, method2, i7);
                                                iOrdinal = i111;
                                                linkedHashMap.put(str7, new C15896(str7, method2, fieldM44737, cls, null, iOrdinal, i112, interfaceC12966, interfaceC129615));
                                                iM47652 = i112;
                                            }
                                        }
                                        fieldArr2 = fieldArr2;
                                        enumC4504 = enumC4501;
                                        i7 = i7;
                                        declaredFields = fieldArr2;
                                        annotationArr5 = annotationArr2;
                                        sArr5 = sArr2;
                                        declaredConstructors = constructorArr;
                                        strArr4 = strArr;
                                        cls2 = cls3;
                                    }
                                    enumC4502 = enumC4500;
                                    fieldArr2 = fieldArr;
                                    i7 = i;
                                    enumC4504 = enumC4502;
                                    declaredFields = fieldArr2;
                                    annotationArr5 = annotationArr2;
                                    sArr5 = sArr2;
                                    declaredConstructors = constructorArr;
                                    strArr4 = strArr;
                                    cls2 = cls3;
                                } else {
                                    fieldArr2 = fieldArr;
                                }
                                if (name.startsWith(am.ae)) {
                                    fieldArr2 = fieldArr2;
                                    enumC4502 = enumC4500;
                                } else {
                                    fieldArr2 = fieldArr2;
                                    enumC4502 = enumC4500;
                                }
                                i7 = i;
                                enumC4504 = enumC4502;
                                declaredFields = fieldArr2;
                                annotationArr5 = annotationArr2;
                                sArr5 = sArr2;
                                declaredConstructors = constructorArr;
                                strArr4 = strArr;
                                cls2 = cls3;
                            }
                        }
                        sArr4 = sArr3;
                    } else {
                        sArr4 = sArr3;
                        constructorArr = declaredConstructors;
                    }
                    strArr = strArrM44752;
                    sArr = sArr4;
                    declaredConstructors = constructorArr;
                }
                sArr3 = sArr6;
                strArrM44752 = strArr;
                parameterAnnotations = annotationArr;
                if (strArrM44752 == null) {
                    sArr4 = sArr3;
                    constructorArr = declaredConstructors;
                    strArr = strArrM44752;
                    sArr = sArr4;
                    declaredConstructors = constructorArr;
                } else {
                    sArr4 = sArr3;
                    constructorArr = declaredConstructors;
                    strArr = strArrM44752;
                    sArr = sArr4;
                    declaredConstructors = constructorArr;
                }
                if (interfaceC12966 != null) {
                    if (interfaceC12966.serialize()) {
                        i7 = i7;
                        enumC4501 = enumC4501;
                        cls3 = cls3;
                    } else {
                        iOrdinal = interfaceC12966.ordinal();
                        iM47652 = EnumC20837.m47652(interfaceC12966.serialzeFeatures());
                        if (interfaceC12966.name().length() != 0) {
                            String strName4 = interfaceC12966.name();
                            m44742(cls, method2, i7);
                            enumC4501 = enumC4501;
                            i7 = i7;
                            cls3 = cls3;
                            linkedHashMap.put(strName4, new C15896(strName4, method2, null, cls, null, iOrdinal, iM47652, interfaceC12966, null));
                        }
                    }
                    fieldArr2 = fieldArr;
                    fieldArr2 = fieldArr2;
                    enumC4504 = enumC4501;
                    i7 = i7;
                    declaredFields = fieldArr2;
                    annotationArr5 = annotationArr2;
                    sArr5 = sArr2;
                    declaredConstructors = constructorArr;
                    strArr4 = strArr;
                    cls2 = cls3;
                } else {
                    iM47652 = 0;
                    iOrdinal = 0;
                }
                if (name.startsWith("get")) {
                    if (name.length() >= 4) {
                        if (name.equals("getClass")) {
                            fieldArr2 = fieldArr;
                        } else {
                            cCharAt = name.charAt(3);
                            if (Character.isUpperCase(cCharAt)) {
                                strM44736 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                            } else if (cCharAt == '_') {
                                strM44736 = name.substring(4);
                            } else if (cCharAt == 'f') {
                                strM44736 = name.substring(3);
                            } else if (name.length() < 5) {
                            }
                            if (m44743(cls, interfaceC12261, strM44736)) {
                                fieldArr2 = fieldArr;
                            } else {
                                fieldArr2 = fieldArr;
                                fieldM44737 = m44737(cls, strM44736, fieldArr2, map);
                                if (fieldM44737 != null) {
                                    interfaceC12968 = (InterfaceC12966) fieldM44737.getAnnotation(InterfaceC12966.class);
                                    if (interfaceC12968 != null) {
                                        if (interfaceC12968.serialize()) {
                                            iOrdinal = interfaceC12968.ordinal();
                                            iM47652 = EnumC20837.m47652(interfaceC12968.serialzeFeatures());
                                            if (interfaceC12968.name().length() != 0) {
                                                strM44736 = interfaceC12968.name();
                                                z4 = true;
                                            }
                                        }
                                        declaredFields = fieldArr2;
                                        annotationArr5 = annotationArr2;
                                        sArr5 = sArr2;
                                        declaredConstructors = constructorArr;
                                        strArr4 = strArr;
                                        cls2 = cls3;
                                    }
                                    InterfaceC12966 interfaceC129616 = interfaceC12968;
                                    int i113 = iOrdinal;
                                    int i114 = iM47652;
                                    enumC4503 = enumC4501;
                                    if (enumC4503 != null) {
                                        strM44736 = enumC4503.m13252(strM44736);
                                    }
                                    String str8 = strM44736;
                                    m44742(cls, method2, i7);
                                    iOrdinal = i113;
                                    linkedHashMap.put(str8, new C15896(str8, method2, fieldM44737, cls, null, iOrdinal, i114, interfaceC12966, interfaceC129616));
                                    iM47652 = i114;
                                } else {
                                    interfaceC12968 = null;
                                }
                                z4 = false;
                                InterfaceC12966 interfaceC129617 = interfaceC12968;
                                int i115 = iOrdinal;
                                int i116 = iM47652;
                                enumC4503 = enumC4501;
                                if (enumC4503 != null) {
                                    strM44736 = enumC4503.m13252(strM44736);
                                }
                                String str9 = strM44736;
                                m44742(cls, method2, i7);
                                iOrdinal = i115;
                                linkedHashMap.put(str9, new C15896(str9, method2, fieldM44737, cls, null, iOrdinal, i116, interfaceC12966, interfaceC129617));
                                iM47652 = i116;
                            }
                        }
                        fieldArr2 = fieldArr2;
                        enumC4504 = enumC4501;
                        i7 = i7;
                        declaredFields = fieldArr2;
                        annotationArr5 = annotationArr2;
                        sArr5 = sArr2;
                        declaredConstructors = constructorArr;
                        strArr4 = strArr;
                        cls2 = cls3;
                    }
                    enumC4502 = enumC4500;
                    fieldArr2 = fieldArr;
                    i7 = i;
                    enumC4504 = enumC4502;
                    declaredFields = fieldArr2;
                    annotationArr5 = annotationArr2;
                    sArr5 = sArr2;
                    declaredConstructors = constructorArr;
                    strArr4 = strArr;
                    cls2 = cls3;
                } else {
                    fieldArr2 = fieldArr;
                }
                if (name.startsWith(am.ae)) {
                    fieldArr2 = fieldArr2;
                    enumC4502 = enumC4500;
                } else {
                    fieldArr2 = fieldArr2;
                    enumC4502 = enumC4500;
                }
                i7 = i;
                enumC4504 = enumC4502;
                declaredFields = fieldArr2;
                annotationArr5 = annotationArr2;
                sArr5 = sArr2;
                declaredConstructors = constructorArr;
                strArr4 = strArr;
                cls2 = cls3;
            }
            sArr2 = sArr;
            constructorArr = declaredConstructors;
            interfaceC12966 = interfaceC12966M44740;
            annotationArr2 = parameterAnnotations;
            if (interfaceC12966 != null) {
                if (interfaceC12966.serialize()) {
                    i7 = i7;
                    enumC4501 = enumC4501;
                    cls3 = cls3;
                } else {
                    iOrdinal = interfaceC12966.ordinal();
                    iM47652 = EnumC20837.m47652(interfaceC12966.serialzeFeatures());
                    if (interfaceC12966.name().length() != 0) {
                        String strName5 = interfaceC12966.name();
                        m44742(cls, method2, i7);
                        enumC4501 = enumC4501;
                        i7 = i7;
                        cls3 = cls3;
                        linkedHashMap.put(strName5, new C15896(strName5, method2, null, cls, null, iOrdinal, iM47652, interfaceC12966, null));
                    }
                }
                fieldArr2 = fieldArr;
                fieldArr2 = fieldArr2;
                enumC4504 = enumC4501;
                i7 = i7;
                declaredFields = fieldArr2;
                annotationArr5 = annotationArr2;
                sArr5 = sArr2;
                declaredConstructors = constructorArr;
                strArr4 = strArr;
                cls2 = cls3;
            } else {
                iM47652 = 0;
                iOrdinal = 0;
            }
            if (name.startsWith("get")) {
                if (name.length() >= 4) {
                    if (name.equals("getClass")) {
                        fieldArr2 = fieldArr;
                    } else {
                        cCharAt = name.charAt(3);
                        if (Character.isUpperCase(cCharAt)) {
                            strM44736 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                        } else if (cCharAt == '_') {
                            strM44736 = name.substring(4);
                        } else if (cCharAt == 'f') {
                            strM44736 = name.substring(3);
                        } else if (name.length() < 5) {
                        }
                        if (m44743(cls, interfaceC12261, strM44736)) {
                            fieldArr2 = fieldArr;
                        } else {
                            fieldArr2 = fieldArr;
                            fieldM44737 = m44737(cls, strM44736, fieldArr2, map);
                            if (fieldM44737 != null) {
                                interfaceC12968 = (InterfaceC12966) fieldM44737.getAnnotation(InterfaceC12966.class);
                                if (interfaceC12968 != null) {
                                    if (interfaceC12968.serialize()) {
                                        iOrdinal = interfaceC12968.ordinal();
                                        iM47652 = EnumC20837.m47652(interfaceC12968.serialzeFeatures());
                                        if (interfaceC12968.name().length() != 0) {
                                            strM44736 = interfaceC12968.name();
                                            z4 = true;
                                        }
                                    }
                                    declaredFields = fieldArr2;
                                    annotationArr5 = annotationArr2;
                                    sArr5 = sArr2;
                                    declaredConstructors = constructorArr;
                                    strArr4 = strArr;
                                    cls2 = cls3;
                                }
                                InterfaceC12966 interfaceC129618 = interfaceC12968;
                                int i117 = iOrdinal;
                                int i118 = iM47652;
                                enumC4503 = enumC4501;
                                if (enumC4503 != null) {
                                    strM44736 = enumC4503.m13252(strM44736);
                                }
                                String str10 = strM44736;
                                m44742(cls, method2, i7);
                                iOrdinal = i117;
                                linkedHashMap.put(str10, new C15896(str10, method2, fieldM44737, cls, null, iOrdinal, i118, interfaceC12966, interfaceC129618));
                                iM47652 = i118;
                            } else {
                                interfaceC12968 = null;
                            }
                            z4 = false;
                            InterfaceC12966 interfaceC129619 = interfaceC12968;
                            int i119 = iOrdinal;
                            int i1110 = iM47652;
                            enumC4503 = enumC4501;
                            if (enumC4503 != null) {
                                strM44736 = enumC4503.m13252(strM44736);
                            }
                            String str11 = strM44736;
                            m44742(cls, method2, i7);
                            iOrdinal = i119;
                            linkedHashMap.put(str11, new C15896(str11, method2, fieldM44737, cls, null, iOrdinal, i1110, interfaceC12966, interfaceC129619));
                            iM47652 = i1110;
                        }
                    }
                    fieldArr2 = fieldArr2;
                    enumC4504 = enumC4501;
                    i7 = i7;
                    declaredFields = fieldArr2;
                    annotationArr5 = annotationArr2;
                    sArr5 = sArr2;
                    declaredConstructors = constructorArr;
                    strArr4 = strArr;
                    cls2 = cls3;
                }
                enumC4502 = enumC4500;
                fieldArr2 = fieldArr;
                i7 = i;
                enumC4504 = enumC4502;
                declaredFields = fieldArr2;
                annotationArr5 = annotationArr2;
                sArr5 = sArr2;
                declaredConstructors = constructorArr;
                strArr4 = strArr;
                cls2 = cls3;
            } else {
                fieldArr2 = fieldArr;
            }
            if (name.startsWith(am.ae)) {
                fieldArr2 = fieldArr2;
                enumC4502 = enumC4500;
            } else {
                fieldArr2 = fieldArr2;
                enumC4502 = enumC4500;
            }
            i7 = i;
            enumC4504 = enumC4502;
            declaredFields = fieldArr2;
            annotationArr5 = annotationArr2;
            sArr5 = sArr2;
            declaredConstructors = constructorArr;
            strArr4 = strArr;
            cls2 = cls3;
        }
        Class<? super Object> cls4 = cls2;
        Field[] fieldArr3 = declaredFields;
        EnumC4500 enumC4505 = enumC4504;
        ArrayList<Field> arrayList2 = new ArrayList(fieldArr3.length);
        for (Field field2 : fieldArr3) {
            if ((field2.getModifiers() & 8) == 0 && !field2.getName().equals("this$0") && (field2.getModifiers() & 1) != 0) {
                arrayList2.add(field2);
            }
        }
        Class<? super Object> superclass2 = cls.getSuperclass();
        while (superclass2 != null) {
            Class<? super Object> cls5 = cls4;
            if (superclass2 == cls5) {
                break;
            }
            for (Field field3 : superclass2.getDeclaredFields()) {
                if ((field3.getModifiers() & 8) == 0 && (field3.getModifiers() & 1) != 0) {
                    arrayList2.add(field3);
                }
            }
            superclass2 = superclass2.getSuperclass();
            cls4 = cls5;
        }
        for (Field field4 : arrayList2) {
            InterfaceC12966 interfaceC129620 = (InterfaceC12966) field4.getAnnotation(InterfaceC12966.class);
            String name2 = field4.getName();
            if (interfaceC129620 == null) {
                i2 = 0;
                i3 = 0;
            } else if (interfaceC129620.serialize()) {
                int iOrdinal2 = interfaceC129620.ordinal();
                int iM47653 = EnumC20837.m47652(interfaceC129620.serialzeFeatures());
                if (interfaceC129620.name().length() != 0) {
                    name2 = interfaceC129620.name();
                }
                i2 = iOrdinal2;
                i3 = iM47653;
            }
            if (enumC4505 != null) {
                name2 = enumC4505.m13252(name2);
            }
            String str12 = name2;
            if (!linkedHashMap.containsKey(str12)) {
                m44742(cls, field4, i7);
                linkedHashMap.put(str12, new C15896(str12, null, field4, cls, null, i2, i3, null, interfaceC129620));
            }
            i7 = i;
            enumC4505 = enumC4505;
        }
        ArrayList arrayList3 = new ArrayList();
        if (interfaceC12261 == null) {
            z2 = false;
            strArrOrders = strArr3;
        } else {
            strArrOrders = interfaceC12261.orders();
            if (strArrOrders != null && strArrOrders.length == linkedHashMap.size()) {
                int length2 = strArrOrders.length;
                int i20 = 0;
                while (true) {
                    if (i20 >= length2) {
                        z2 = true;
                    } else if (linkedHashMap.containsKey(strArrOrders[i20])) {
                        i20++;
                    }
                }
            }
            strArr3 = strArrOrders;
            z2 = false;
            strArrOrders = strArr3;
        }
        if (z2) {
            for (String str13 : strArrOrders) {
                arrayList3.add((C15896) linkedHashMap.get(str13));
            }
        } else {
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                arrayList3.add((C15896) it.next());
            }
            if (z) {
                Collections.sort(arrayList3);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC12966 m44740(Method method, Class cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Method method2 : cls2.getMethods()) {
                if (method2.getName().equals(method.getName())) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    if (parameterTypes.length == parameterTypes2.length) {
                        int i = 0;
                        while (true) {
                            if (i < parameterTypes.length) {
                                if (!parameterTypes[i].equals(parameterTypes2[i])) {
                                    break;
                                }
                                i++;
                            } else {
                                InterfaceC12966 interfaceC12966 = (InterfaceC12966) method2.getAnnotation(InterfaceC12966.class);
                                if (interfaceC12966 == null) {
                                    break;
                                }
                                return interfaceC12966;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || !Modifier.isAbstract(superclass.getModifiers())) {
            return null;
        }
        Class<?>[] parameterTypes3 = method.getParameterTypes();
        for (Method method3 : superclass.getMethods()) {
            Class<?>[] parameterTypes4 = method3.getParameterTypes();
            if (parameterTypes4.length == parameterTypes3.length && method3.getName().equals(method.getName())) {
                int i2 = 0;
                while (true) {
                    if (i2 < parameterTypes3.length) {
                        if (!parameterTypes4[i2].equals(parameterTypes3[i2])) {
                            break;
                        }
                        i2++;
                    } else {
                        InterfaceC12966 interfaceC12967 = (InterfaceC12966) method3.getAnnotation(InterfaceC12966.class);
                        if (interfaceC12967 == null) {
                            break;
                        }
                        return interfaceC12967;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m44743(Class cls, InterfaceC12261 interfaceC12261, String str) {
        if (interfaceC12261 != null && interfaceC12261.ignores() != null) {
            for (String str2 : interfaceC12261.ignores()) {
                if (str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        Class superclass = cls.getSuperclass();
        return (superclass == Object.class || superclass == null || !m44743(superclass, (InterfaceC12261) superclass.getAnnotation(InterfaceC12261.class), str)) ? false : true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m44761(Type type) {
        Type genericSuperclass;
        if (type instanceof ParameterizedType) {
            return true;
        }
        return (type instanceof Class) && (genericSuperclass = ((Class) type).getGenericSuperclass()) != Object.class && m44761(genericSuperclass);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Type m44756(Type type) {
        return type instanceof Class ? m44756(((Class) type).getGenericSuperclass()) : type;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Class m44730(Type type) {
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m44730(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            return (Class) ((TypeVariable) type).getBounds()[0];
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return m44730(upperBounds[0]);
            }
            return Object.class;
        }
        return Object.class;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m44736(String str) {
        if (str == null || str.length() == 0 || (str.length() > 1 && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(0)))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44742(Class cls, Member member, int i) {
        if (member == 0 || !f62835) {
            return;
        }
        Class superclass = cls.getSuperclass();
        if ((superclass != null && superclass != Object.class) || (member.getModifiers() & 1) == 0 || (i & 1) == 0) {
            try {
                ((AccessibleObject) member).setAccessible(true);
            } catch (AccessControlException unused) {
                f62835 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Field m44737(Class cls, String str, Field[] fieldArr, HashMap map) {
        Field fieldM44749 = m44749(cls, str, fieldArr, map);
        if (fieldM44749 == null) {
            fieldM44749 = m44749(cls, C20094.m46315("_", str), fieldArr, map);
        }
        if (fieldM44749 == null) {
            fieldM44749 = m44749(cls, C20094.m46315("m_", str), fieldArr, map);
        }
        if (fieldM44749 != null) {
            return fieldM44749;
        }
        return m44749(cls, "m" + str.substring(0, 1).toUpperCase() + str.substring(1), fieldArr, map);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Field m44749(Class cls, String str, Field[] fieldArr, HashMap map) {
        char cCharAt;
        char cCharAt2;
        for (Field field : fieldArr) {
            String name = field.getName();
            if (str.equals(name) || (str.length() > 2 && (cCharAt = str.charAt(0)) >= 'a' && cCharAt <= 'z' && (cCharAt2 = str.charAt(1)) >= 'A' && cCharAt2 <= 'Z' && str.equalsIgnoreCase(name))) {
                return field;
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            return null;
        }
        Field[] declaredFields = (Field[]) map.get(superclass);
        if (declaredFields == null) {
            declaredFields = superclass.getDeclaredFields();
            map.put(superclass, declaredFields);
        }
        return m44737(superclass, str, declaredFields, map);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Type m44750(Type type) {
        Type typeM44750;
        if (type instanceof ParameterizedType) {
            typeM44750 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (typeM44750 instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) typeM44750).getUpperBounds();
                if (upperBounds.length == 1) {
                    typeM44750 = upperBounds[0];
                }
            }
        } else if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.getName().startsWith("java.")) {
                typeM44750 = null;
            } else {
                typeM44750 = m44750(cls.getGenericSuperclass());
            }
        } else {
            typeM44750 = null;
        }
        return typeM44750 == null ? Object.class : typeM44750;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m44731(Class cls) {
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        return cls == Character.TYPE ? '0' : null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m44744(Type[] typeArr, TypeVariable[] typeVariableArr, Type[] typeArr2) {
        if (typeArr2 == null || typeVariableArr.length == 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < typeArr.length; i++) {
            Type type = typeArr[i];
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (m44744(actualTypeArguments, typeVariableArr, typeArr2)) {
                    typeArr[i] = new C18720(actualTypeArguments, parameterizedType.getOwnerType(), parameterizedType.getRawType());
                    z = true;
                }
            } else if (type instanceof TypeVariable) {
                for (int i2 = 0; i2 < typeVariableArr.length; i2++) {
                    if (type.equals(typeVariableArr[i2])) {
                        typeArr[i] = typeArr2[i2];
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m44747(String str) {
        if (str == null) {
            return 0L;
        }
        long j = -3750763034362895579L;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '_' && cCharAt != '-') {
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    cCharAt = (char) (cCharAt + ' ');
                }
                j = (j ^ ((long) cCharAt)) * 1099511628211L;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44741(Class cls, String str) {
        f62841.put(str, cls);
    }
}
