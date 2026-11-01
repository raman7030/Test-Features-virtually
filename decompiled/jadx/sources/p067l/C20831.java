package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import com.umeng.analytics.pro.C0655am;
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
public final class C20831 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f65447 = 0;

    /* JADX INFO: renamed from: ۖ */
    public static boolean f65448 = true;

    /* JADX INFO: renamed from: ۜ */
    public static volatile Method f65449;

    /* JADX INFO: renamed from: ۡ */
    public static volatile boolean f65450;

    /* JADX INFO: renamed from: ۢ */
    public static volatile Class f65451;

    /* JADX INFO: renamed from: ۧ */
    public static volatile HashMap f65452;

    /* JADX INFO: renamed from: ܳ */
    public static volatile Constructor f65453;

    /* JADX INFO: renamed from: ܺ */
    public static final ConcurrentMapC12768 f65454;

    /* JADX INFO: renamed from: ܽ */
    public static volatile boolean f65455;

    /* JADX INFO: renamed from: ܿ */
    public static volatile boolean f65456;

    /* JADX INFO: renamed from: ᩳ */
    public static volatile boolean f65457;

    /* JADX INFO: renamed from: ᩷ */
    public static volatile Method f65458;

    /* JADX INFO: renamed from: ᩻ */
    public static volatile Method f65459;

    /* JADX INFO: renamed from: ܽ */
    public static boolean m47051(Class cls) {
        if (f65451 == null && !f65450) {
            try {
                f65451 = InterfaceC11369.class;
            } catch (Throwable unused) {
                f65450 = true;
            }
        }
        if (f65451 == null) {
            return false;
        }
        return cls.isAnnotationPresent(f65451);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String[] m47046(Class cls) {
        if (f65453 == null && !f65457) {
            try {
                Class<?> cls2 = Class.forName("kotlin.reflect.jvm.internal.KClassImpl");
                f65453 = cls2.getConstructor(Class.class);
                f65459 = cls2.getMethod("getConstructors", null);
                f65449 = InterfaceC8350.class.getMethod("getParameters", null);
                f65458 = InterfaceC13715.class.getMethod("getName", null);
            } catch (Throwable unused) {
                f65457 = true;
            }
        }
        if (f65453 == null || f65456) {
            return null;
        }
        try {
            Iterator it = ((Iterable) f65459.invoke(f65453.newInstance(cls), null)).iterator();
            Object obj = null;
            while (it.hasNext()) {
                Object next = it.next();
                List list = (List) f65449.invoke(next, null);
                if (obj == null || list.size() != 0) {
                    obj = next;
                }
                it.hasNext();
            }
            List list2 = (List) f65449.invoke(obj, null);
            String[] strArr = new String[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                strArr[i] = (String) f65458.invoke(list2.get(i), null);
            }
            return strArr;
        } catch (Throwable unused2) {
            f65456 = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static final Byte m47053(Object obj) {
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            throw new C16702(C7470.m17246(obj, "can not cast to byte, value : "));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(str));
    }

    /* JADX INFO: renamed from: ۢ */
    public static final Short m47040(Object obj) {
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (!(obj instanceof String)) {
            throw new C16702(C7470.m17246(obj, "can not cast to short, value : "));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(str));
    }

    /* JADX INFO: renamed from: ֫ */
    public static final BigDecimal m47032(Object obj) {
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

    /* JADX INFO: renamed from: ۧ */
    public static final BigInteger m47045(Object obj) {
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

    /* JADX INFO: renamed from: ᩻ */
    public static final Float m47057(Object obj) {
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            throw new C16702(C7470.m17246(obj, "can not cast to float, value : "));
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(string));
    }

    /* JADX INFO: renamed from: ܳ */
    public static final Double m47047(Object obj) {
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            throw new C16702(C7470.m17246(obj, "can not cast to double, value : "));
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(string));
    }

    /* JADX INFO: renamed from: ܿ */
    public static final Date m47052(Object obj) {
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
                String str2 = AbstractC7316.f19151;
                if (length != str2.length()) {
                    if (str.length() == 10) {
                        str2 = "yyyy-MM-dd";
                    } else if (str.length() == 19) {
                        str2 = "yyyy-MM-dd HH:mm:ss";
                    } else {
                        str2 = (str.length() == 29 && str.charAt(26) == ':' && str.charAt(28) == '0') ? "yyyy-MM-dd'T'HH:mm:ss.SSSXXX" : "yyyy-MM-dd HH:mm:ss.SSS";
                    }
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, AbstractC7316.f19150);
                simpleDateFormat.setTimeZone(AbstractC7316.f19149);
                try {
                    return simpleDateFormat.parse(str);
                } catch (ParseException unused) {
                    throw new C16702("can not cast to Date, value : ".concat(str));
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
        throw new C16702(C7470.m17246(obj, "can not cast to Date, value : "));
    }

    /* JADX INFO: renamed from: ᩷ */
    public static final Long m47056(Object obj) {
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
                C9327 c9327 = new C9327(str);
                Calendar calendar = c9327.m21611(false) ? c9327.f25385 : null;
                c9327.m21608();
                if (calendar != null) {
                    return Long.valueOf(calendar.getTimeInMillis());
                }
            }
        }
        throw new C16702(C7470.m17246(obj, "can not cast to long, value : "));
    }

    /* JADX INFO: renamed from: ۜ */
    public static final Integer m47039(Object obj) {
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
            throw new C16702(C7470.m17246(obj, "can not cast to int, value : "));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    /* JADX INFO: renamed from: ܽ */
    public static final Boolean m47048(Object obj) {
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
        throw new C16702(C7470.m17246(obj, "can not cast to int, value : "));
    }

    /* JADX INFO: renamed from: ֫ */
    public static final Object m47029(Map map, Class cls, C24597 c24597) {
        return m47026((Object) map, cls, c24597);
    }

    /* JADX INFO: renamed from: ֫ */
    public static final Object m47026(Object obj, Class cls, C24597 c24597) {
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
                            Array.set(objNewInstance, i, m47026(it.next(), (Class) cls.getComponentType(), c24597));
                            i++;
                        }
                        return objNewInstance;
                    }
                    if (cls == byte[].class) {
                        if (obj instanceof byte[]) {
                            return (byte[]) obj;
                        }
                        if (!(obj instanceof String)) {
                            throw new C16702(C7470.m17246(obj, "can not cast to int, value : "));
                        }
                        String str = (String) obj;
                        return C9327.m21577(0, str.length(), str);
                    }
                }
                if (!cls.isAssignableFrom(obj.getClass())) {
                    if (cls == Boolean.TYPE || cls == Boolean.class) {
                        return m47048(obj);
                    }
                    if (cls == Byte.TYPE || cls == Byte.class) {
                        return m47053(obj);
                    }
                    if ((cls == Character.TYPE || cls == Character.class) && (obj instanceof String)) {
                        String str2 = (String) obj;
                        if (str2.length() == 1) {
                            return Character.valueOf(str2.charAt(0));
                        }
                    }
                    if (cls == Short.TYPE || cls == Short.class) {
                        return m47040(obj);
                    }
                    if (cls == Integer.TYPE || cls == Integer.class) {
                        return m47039(obj);
                    }
                    if (cls == Long.TYPE || cls == Long.class) {
                        return m47056(obj);
                    }
                    if (cls == Float.TYPE || cls == Float.class) {
                        return m47057(obj);
                    }
                    if (cls == Double.TYPE || cls == Double.class) {
                        return m47047(obj);
                    }
                    if (cls == String.class) {
                        return obj.toString();
                    }
                    if (cls == BigDecimal.class) {
                        return m47032(obj);
                    }
                    if (cls == BigInteger.class) {
                        return m47045(obj);
                    }
                    if (cls == Date.class) {
                        return m47052(obj);
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
                            throw new C16702("can not cast to : ".concat(cls.getName()));
                        } catch (Exception e) {
                            throw new C16702("can not cast to : ".concat(cls.getName()), (Throwable) e);
                        }
                    }
                    if (Calendar.class.isAssignableFrom(cls)) {
                        Date dateM47052 = m47052(obj);
                        if (cls == Calendar.class) {
                            calendar = Calendar.getInstance(AbstractC7316.f19149, AbstractC7316.f19150);
                        } else {
                            try {
                                calendar = (Calendar) cls.newInstance();
                            } catch (Exception e2) {
                                throw new C16702("can not cast to : ".concat(cls.getName()), (Throwable) e2);
                            }
                        }
                        calendar.setTime(dateM47052);
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
                    throw new C16702("can not cast to : ".concat(cls.getName()));
                }
            } else if (cls != Map.class) {
                Map map = (Map) obj;
                if (cls != Object.class || map.containsKey("@type")) {
                    return m47042(map, cls, c24597);
                }
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final Object m47028(Object obj, Type type, C24597 c24597) {
        if (obj == null) {
            return null;
        }
        if (type instanceof Class) {
            return m47026(obj, (Class) type, c24597);
        }
        if (type instanceof ParameterizedType) {
            return m47027(obj, (ParameterizedType) type, c24597);
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
        throw new C16702("can not cast to : " + type);
    }

    /* JADX INFO: renamed from: ֫ */
    public static final Object m47027(Object obj, ParameterizedType parameterizedType, C24597 c24597) {
        Object objM47028;
        Collection hashSet;
        Object objM47029;
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
                        if (obj2 != null && obj2.getClass() == C22739.class) {
                            objM47028 = ((C22739) obj2).m50885((Class) type, c24597);
                        } else {
                            objM47028 = m47026(obj2, (Class) type, c24597);
                        }
                    } else {
                        objM47028 = m47028(obj2, type, c24597);
                    }
                    arrayList.add(objM47028);
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
                        if (obj3 != null && obj3.getClass() == C22739.class) {
                            objM47029 = ((C22739) obj3).m50885((Class) type2, c24597);
                        } else {
                            objM47029 = m47026(obj3, (Class) type2, c24597);
                        }
                    } else {
                        objM47029 = m47028(obj3, type2, c24597);
                    }
                    hashSet.add(objM47029);
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
                    map.put(m47028(entry.getKey(), type3, c24597), m47028(entry.getValue(), type4, c24597));
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
            return m47028(obj, rawType, c24597);
        }
        throw new C16702("can not cast to : " + parameterizedType);
    }

    /* JADX INFO: renamed from: ۧ */
    public static final Object m47042(Map map, Class cls, C24597 c24597) {
        C22739 c22739;
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
                if (c24597 == null) {
                    c24597 = C24597.f77883;
                }
                Class clsM54233 = c24597.m54233(str4, 0, null);
                if (clsM54233 == null) {
                    throw new ClassNotFoundException(str4.concat(" not found"));
                }
                if (!clsM54233.equals(cls)) {
                    return m47042(map, clsM54233, c24597);
                }
            }
            if (cls.isInterface()) {
                if (map instanceof C22739) {
                    c22739 = (C22739) map;
                } else {
                    c22739 = new C22739(map);
                }
                if (c24597 == null) {
                    c24597 = C24597.f77883;
                }
                if (c24597.m54235((Type) cls) == null) {
                    return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, c22739);
                }
                C13351 c13351 = new C13351(AbstractC7316.m16895(c22739), C24597.f77883, AbstractC7316.f19153);
                Object objM30481 = c13351.m30481((String) null, cls);
                c13351.m30496();
                c13351.close();
                return objM30481;
            }
            if (cls == String.class && (map instanceof C22739)) {
                return map.toString();
            }
            if (c24597 == null) {
                c24597 = C24597.f77883;
            }
            InterfaceC20575 interfaceC20575M54235 = c24597.m54235((Type) cls);
            C3810 c3810 = interfaceC20575M54235 instanceof C3810 ? (C3810) interfaceC20575M54235 : null;
            if (c3810 == null) {
                throw new C16702("can not get javaBeanDeserializer");
            }
            return c3810.m7429(map, c24597);
        } catch (Exception e) {
            throw new C16702(e.getMessage(), (Throwable) e);
        }
    }

    static {
        ConcurrentMapC12768 concurrentMapC12768 = new ConcurrentMapC12768(36, 0.75f, 1);
        f65454 = concurrentMapC12768;
        concurrentMapC12768.put(ClassTransform.BYTE, Byte.TYPE);
        concurrentMapC12768.put(ClassTransform.SHORT, Short.TYPE);
        concurrentMapC12768.put(ClassTransform.INTEGER, Integer.TYPE);
        concurrentMapC12768.put(ClassTransform.LONG, Long.TYPE);
        concurrentMapC12768.put(ClassTransform.FLOAT, Float.TYPE);
        concurrentMapC12768.put(ClassTransform.DOUBLE, Double.TYPE);
        concurrentMapC12768.put(ClassTransform.BOOLEAN, Boolean.TYPE);
        concurrentMapC12768.put(ClassTransform.CHARACTER, Character.TYPE);
        concurrentMapC12768.put("[byte", byte[].class);
        concurrentMapC12768.put("[short", short[].class);
        concurrentMapC12768.put("[int", int[].class);
        concurrentMapC12768.put("[long", long[].class);
        concurrentMapC12768.put("[float", float[].class);
        concurrentMapC12768.put("[double", double[].class);
        concurrentMapC12768.put("[boolean", boolean[].class);
        concurrentMapC12768.put("[char", char[].class);
        concurrentMapC12768.put("[B", byte[].class);
        concurrentMapC12768.put("[S", short[].class);
        concurrentMapC12768.put("[I", int[].class);
        concurrentMapC12768.put("[J", long[].class);
        concurrentMapC12768.put("[F", float[].class);
        concurrentMapC12768.put("[D", double[].class);
        concurrentMapC12768.put("[C", char[].class);
        concurrentMapC12768.put("[Z", boolean[].class);
        concurrentMapC12768.put("java.util.HashMap", HashMap.class);
        concurrentMapC12768.put("java.util.TreeMap", TreeMap.class);
        concurrentMapC12768.put("java.util.Date", Date.class);
        concurrentMapC12768.put("com.alibaba.fastjson.JSONObject", C22739.class);
        concurrentMapC12768.put("java.util.concurrent.ConcurrentHashMap", ConcurrentMapC12768.class);
        concurrentMapC12768.put("java.text.SimpleDateFormat", SimpleDateFormat.class);
        concurrentMapC12768.put("java.lang.StackTraceElement", StackTraceElement.class);
        concurrentMapC12768.put("java.lang.RuntimeException", RuntimeException.class);
    }

    /* JADX INFO: renamed from: ܽ */
    public static Class m47049(String str) {
        return (Class) f65454.get(str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static Class m47054(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.length() >= 256) {
            throw new C16702("className too long. ".concat(str));
        }
        ConcurrentMapC12768 concurrentMapC12768 = f65454;
        Class<?> cls = (Class) concurrentMapC12768.get(str);
        if (cls != null) {
            return cls;
        }
        if (str.charAt(0) == '[') {
            Class clsM47054 = m47054(str.substring(1));
            if (clsM47054 == null) {
                return null;
            }
            return Array.newInstance((Class<?>) clsM47054, 0).getClass();
        }
        if (str.startsWith("L") && str.endsWith(C0249l.f1196b)) {
            return m47054(str.substring(1, str.length() - 1));
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
            concurrentMapC12768.put(str, cls);
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
    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m47033(Class cls, int i, InterfaceC14021 interfaceC14021, boolean z, EnumC6645 enumC6645) {
        Class<? super Object> cls2;
        boolean z2;
        String[] strArrOrders;
        int i2;
        int i3;
        String[] strArr;
        boolean z3;
        Field[] fieldArr;
        Class<? super Object> cls3;
        EnumC6645 enumC6646;
        Annotation[][] annotationArr;
        short[] sArr;
        Annotation[][] parameterAnnotations;
        short[] sArr2;
        Constructor<?>[] constructorArr;
        InterfaceC14691 interfaceC14691;
        Annotation[][] annotationArr2;
        int iM49980;
        int iOrdinal;
        Field[] fieldArr2;
        EnumC6645 enumC6647;
        String strSubstring;
        int i4;
        InterfaceC14691 interfaceC14692;
        char cCharAt;
        String strM47030;
        Field fieldM47031;
        InterfaceC14691 interfaceC14693;
        boolean z4;
        EnumC6645 enumC6648;
        short[] sArr3;
        String[] strArrM47046;
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
        boolean zM47051 = m47051(cls);
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
        EnumC6645 enumC6649 = enumC6645;
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
                    enumC6646 = enumC6649;
                    cls3 = cls2;
                    fieldArr = declaredFields;
                }
                sArr5 = sArr6;
                strArr4 = strArr;
                annotationArr5 = annotationArr;
                enumC6649 = enumC6646;
                cls2 = cls3;
                declaredFields = fieldArr;
            } else {
                strArr = strArr4;
                z3 = true;
            }
            InterfaceC14691 interfaceC14691M47034 = (InterfaceC14691) method2.getAnnotation(InterfaceC14691.class);
            if (interfaceC14691M47034 == null) {
                interfaceC14691M47034 = m47034(method2, cls);
            }
            if (zM47051) {
                annotationArr = annotationArr5;
                if (f65452 != null || f65455) {
                    enumC6646 = enumC6649;
                    cls3 = cls2;
                    fieldArr = declaredFields;
                } else {
                    enumC6646 = enumC6649;
                    try {
                        HashMap map2 = new HashMap();
                        cls3 = cls2;
                        try {
                            int i8 = C10362.f28677;
                            fieldArr = declaredFields;
                            try {
                                map2.put(C10362.class, new String[]{"getEndInclusive", "isEmpty"});
                                int i9 = C7009.f18262;
                                map2.put(C7009.class, new String[]{"getEndInclusive", "isEmpty"});
                                map2.put(C15055.class, new String[]{"getEndInclusive", "isEmpty"});
                                map2.put(Class.forName("l.᩸᩶᩵"), new String[]{"getEndInclusive", "isEmpty"});
                                map2.put(Class.forName("l.ܶ᩶᩵"), new String[]{"getEndInclusive", "isEmpty"});
                                f65452 = map2;
                            } catch (Throwable unused) {
                                f65455 = z3;
                            }
                        } catch (Throwable unused2) {
                            fieldArr = declaredFields;
                            f65455 = z3;
                            if (f65452 != null) {
                                sArr5 = sArr6;
                                strArr4 = strArr;
                                annotationArr5 = annotationArr;
                                enumC6649 = enumC6646;
                                cls2 = cls3;
                                declaredFields = fieldArr;
                            }
                            if (interfaceC14691M47034 == null) {
                                interfaceC14691M47034 = interfaceC14691M47034;
                                sArr = sArr6;
                                parameterAnnotations = annotationArr;
                                sArr2 = sArr;
                                constructorArr = declaredConstructors;
                                interfaceC14691 = interfaceC14691M47034;
                                annotationArr2 = parameterAnnotations;
                            } else {
                                interfaceC14691M47034 = interfaceC14691M47034;
                                sArr = sArr6;
                                parameterAnnotations = annotationArr;
                                sArr2 = sArr;
                                constructorArr = declaredConstructors;
                                interfaceC14691 = interfaceC14691M47034;
                                annotationArr2 = parameterAnnotations;
                            }
                            if (interfaceC14691 != null) {
                                if (interfaceC14691.serialize()) {
                                    iOrdinal = interfaceC14691.ordinal();
                                    iM49980 = EnumC22172.m49980(interfaceC14691.serialzeFeatures());
                                    if (interfaceC14691.name().length() != 0) {
                                        String strName = interfaceC14691.name();
                                        m47036(cls, method2, i7);
                                        enumC6646 = enumC6646;
                                        i7 = i7;
                                        cls3 = cls3;
                                        linkedHashMap.put(strName, new C17476(strName, method2, null, cls, null, iOrdinal, iM49980, interfaceC14691, null));
                                    }
                                } else {
                                    i7 = i7;
                                    enumC6646 = enumC6646;
                                    cls3 = cls3;
                                }
                                fieldArr2 = fieldArr;
                                fieldArr2 = fieldArr2;
                                enumC6649 = enumC6646;
                                i7 = i7;
                                declaredFields = fieldArr2;
                                annotationArr5 = annotationArr2;
                                sArr5 = sArr2;
                                declaredConstructors = constructorArr;
                                strArr4 = strArr;
                                cls2 = cls3;
                            } else {
                                iM49980 = 0;
                                iOrdinal = 0;
                            }
                            if (name.startsWith("get")) {
                                if (name.length() >= 4) {
                                    if (name.equals("getClass")) {
                                        fieldArr2 = fieldArr;
                                    } else {
                                        cCharAt = name.charAt(3);
                                        if (Character.isUpperCase(cCharAt)) {
                                            strM47030 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                                        } else if (cCharAt == '_') {
                                            strM47030 = name.substring(4);
                                        } else if (cCharAt == 'f') {
                                            strM47030 = name.substring(3);
                                        } else if (name.length() < 5) {
                                        }
                                        if (m47037(cls, interfaceC14021, strM47030)) {
                                            fieldArr2 = fieldArr;
                                        } else {
                                            fieldArr2 = fieldArr;
                                            fieldM47031 = m47031(cls, strM47030, fieldArr2, map);
                                            if (fieldM47031 != null) {
                                                interfaceC14693 = (InterfaceC14691) fieldM47031.getAnnotation(InterfaceC14691.class);
                                                if (interfaceC14693 != null) {
                                                    if (interfaceC14693.serialize()) {
                                                        iOrdinal = interfaceC14693.ordinal();
                                                        iM49980 = EnumC22172.m49980(interfaceC14693.serialzeFeatures());
                                                        if (interfaceC14693.name().length() != 0) {
                                                            strM47030 = interfaceC14693.name();
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
                                                InterfaceC14691 interfaceC14694 = interfaceC14693;
                                                int i10 = iOrdinal;
                                                int i11 = iM49980;
                                                enumC6648 = enumC6646;
                                                if (enumC6648 != null) {
                                                    strM47030 = enumC6648.m15135(strM47030);
                                                }
                                                String str = strM47030;
                                                m47036(cls, method2, i7);
                                                iOrdinal = i10;
                                                linkedHashMap.put(str, new C17476(str, method2, fieldM47031, cls, null, iOrdinal, i11, interfaceC14691, interfaceC14694));
                                                iM49980 = i11;
                                            } else {
                                                interfaceC14693 = null;
                                            }
                                            z4 = false;
                                            InterfaceC14691 interfaceC14695 = interfaceC14693;
                                            int i12 = iOrdinal;
                                            int i13 = iM49980;
                                            enumC6648 = enumC6646;
                                            if (enumC6648 != null) {
                                                strM47030 = enumC6648.m15135(strM47030);
                                            }
                                            String str2 = strM47030;
                                            m47036(cls, method2, i7);
                                            iOrdinal = i12;
                                            linkedHashMap.put(str2, new C17476(str2, method2, fieldM47031, cls, null, iOrdinal, i13, interfaceC14691, interfaceC14695));
                                            iM49980 = i13;
                                        }
                                    }
                                    fieldArr2 = fieldArr2;
                                    enumC6649 = enumC6646;
                                    i7 = i7;
                                    declaredFields = fieldArr2;
                                    annotationArr5 = annotationArr2;
                                    sArr5 = sArr2;
                                    declaredConstructors = constructorArr;
                                    strArr4 = strArr;
                                    cls2 = cls3;
                                }
                                enumC6647 = enumC6645;
                                fieldArr2 = fieldArr;
                                i7 = i;
                                enumC6649 = enumC6647;
                                declaredFields = fieldArr2;
                                annotationArr5 = annotationArr2;
                                sArr5 = sArr2;
                                declaredConstructors = constructorArr;
                                strArr4 = strArr;
                                cls2 = cls3;
                            } else {
                                fieldArr2 = fieldArr;
                            }
                            if (name.startsWith(C0655am.f2303ae)) {
                                fieldArr2 = fieldArr2;
                                enumC6647 = enumC6645;
                            } else {
                                fieldArr2 = fieldArr2;
                                enumC6647 = enumC6645;
                            }
                            i7 = i;
                            enumC6649 = enumC6647;
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
                if (f65452 != null && (strArr2 = (String[]) f65452.get(cls)) != null && Arrays.binarySearch(strArr2, name) >= 0) {
                    sArr5 = sArr6;
                    strArr4 = strArr;
                    annotationArr5 = annotationArr;
                    enumC6649 = enumC6646;
                    cls2 = cls3;
                    declaredFields = fieldArr;
                }
            } else {
                annotationArr = annotationArr5;
                enumC6646 = enumC6649;
                cls3 = cls2;
                fieldArr = declaredFields;
            }
            if (interfaceC14691M47034 == null || !zM47051) {
                interfaceC14691M47034 = interfaceC14691M47034;
                sArr = sArr6;
                parameterAnnotations = annotationArr;
            } else {
                if (declaredConstructors == null) {
                    declaredConstructors = cls.getDeclaredConstructors();
                    if (declaredConstructors.length == 1) {
                        parameterAnnotations = declaredConstructors[0].getParameterAnnotations();
                        strArrM47046 = m47046(cls);
                        if (strArrM47046 != null) {
                            String[] strArr5 = new String[strArrM47046.length];
                            interfaceC14691M47034 = interfaceC14691M47034;
                            System.arraycopy(strArrM47046, 0, strArr5, 0, strArrM47046.length);
                            Arrays.sort(strArr5);
                            short[] sArr7 = new short[strArrM47046.length];
                            for (short s = 0; s < strArrM47046.length; s = (short) (s + 1)) {
                                sArr7[Arrays.binarySearch(strArr5, strArrM47046[s])] = s;
                            }
                            strArrM47046 = strArr5;
                            sArr3 = sArr7;
                            declaredConstructors = declaredConstructors;
                        } else {
                            interfaceC14691M47034 = interfaceC14691M47034;
                            sArr3 = sArr6;
                        }
                    }
                    if (strArrM47046 == null && sArr3 != null && name.startsWith("get")) {
                        String strM47031 = m47030(name.substring(3));
                        int iBinarySearch = Arrays.binarySearch(strArrM47046, strM47031);
                        if (iBinarySearch < 0) {
                            constructorArr = declaredConstructors;
                            int i14 = 0;
                            while (true) {
                                if (i14 < strArrM47046.length) {
                                    if (strM47031.equalsIgnoreCase(strArrM47046[i14])) {
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
                                        if (annotation instanceof InterfaceC14691) {
                                            interfaceC14691 = (InterfaceC14691) annotation;
                                            annotationArr2 = parameterAnnotations;
                                            strArr = strArrM47046;
                                        } else {
                                            i6++;
                                            sArr3 = sArr2;
                                            annotationArr3 = annotationArr4;
                                        }
                                    }
                                    if (interfaceC14691 != null) {
                                        if (interfaceC14691.serialize()) {
                                            i7 = i7;
                                            enumC6646 = enumC6646;
                                            cls3 = cls3;
                                        } else {
                                            iOrdinal = interfaceC14691.ordinal();
                                            iM49980 = EnumC22172.m49980(interfaceC14691.serialzeFeatures());
                                            if (interfaceC14691.name().length() != 0) {
                                                String strName2 = interfaceC14691.name();
                                                m47036(cls, method2, i7);
                                                enumC6646 = enumC6646;
                                                i7 = i7;
                                                cls3 = cls3;
                                                linkedHashMap.put(strName2, new C17476(strName2, method2, null, cls, null, iOrdinal, iM49980, interfaceC14691, null));
                                            }
                                        }
                                        fieldArr2 = fieldArr;
                                        fieldArr2 = fieldArr2;
                                        enumC6649 = enumC6646;
                                        i7 = i7;
                                        declaredFields = fieldArr2;
                                        annotationArr5 = annotationArr2;
                                        sArr5 = sArr2;
                                        declaredConstructors = constructorArr;
                                        strArr4 = strArr;
                                        cls2 = cls3;
                                    } else {
                                        iM49980 = 0;
                                        iOrdinal = 0;
                                    }
                                    if (name.startsWith("get")) {
                                        if (name.length() >= 4) {
                                            if (name.equals("getClass")) {
                                                fieldArr2 = fieldArr;
                                            } else {
                                                cCharAt = name.charAt(3);
                                                if (Character.isUpperCase(cCharAt)) {
                                                    strM47030 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                                                } else if (cCharAt == '_') {
                                                    strM47030 = name.substring(4);
                                                } else if (cCharAt == 'f') {
                                                    strM47030 = name.substring(3);
                                                } else {
                                                    if (name.length() < 5 && Character.isUpperCase(name.charAt(4))) {
                                                        strM47030 = m47030(name.substring(3));
                                                    }
                                                    i7 = i;
                                                    enumC6649 = enumC6647;
                                                    declaredFields = fieldArr2;
                                                    annotationArr5 = annotationArr2;
                                                    sArr5 = sArr2;
                                                    declaredConstructors = constructorArr;
                                                    strArr4 = strArr;
                                                    cls2 = cls3;
                                                }
                                                if (m47037(cls, interfaceC14021, strM47030)) {
                                                    fieldArr2 = fieldArr;
                                                } else {
                                                    fieldArr2 = fieldArr;
                                                    fieldM47031 = m47031(cls, strM47030, fieldArr2, map);
                                                    if (fieldM47031 != null) {
                                                        interfaceC14693 = (InterfaceC14691) fieldM47031.getAnnotation(InterfaceC14691.class);
                                                        if (interfaceC14693 != null) {
                                                            if (interfaceC14693.serialize()) {
                                                                iOrdinal = interfaceC14693.ordinal();
                                                                iM49980 = EnumC22172.m49980(interfaceC14693.serialzeFeatures());
                                                                if (interfaceC14693.name().length() != 0) {
                                                                    strM47030 = interfaceC14693.name();
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
                                                        InterfaceC14691 interfaceC14696 = interfaceC14693;
                                                        int i15 = iOrdinal;
                                                        int i16 = iM49980;
                                                        enumC6648 = enumC6646;
                                                        if (enumC6648 != null && !z4) {
                                                            strM47030 = enumC6648.m15135(strM47030);
                                                        }
                                                        String str3 = strM47030;
                                                        m47036(cls, method2, i7);
                                                        iOrdinal = i15;
                                                        linkedHashMap.put(str3, new C17476(str3, method2, fieldM47031, cls, null, iOrdinal, i16, interfaceC14691, interfaceC14696));
                                                        iM49980 = i16;
                                                    } else {
                                                        interfaceC14693 = null;
                                                    }
                                                    z4 = false;
                                                    InterfaceC14691 interfaceC14697 = interfaceC14693;
                                                    int i17 = iOrdinal;
                                                    int i18 = iM49980;
                                                    enumC6648 = enumC6646;
                                                    if (enumC6648 != null) {
                                                        strM47030 = enumC6648.m15135(strM47030);
                                                    }
                                                    String str4 = strM47030;
                                                    m47036(cls, method2, i7);
                                                    iOrdinal = i17;
                                                    linkedHashMap.put(str4, new C17476(str4, method2, fieldM47031, cls, null, iOrdinal, i18, interfaceC14691, interfaceC14697));
                                                    iM49980 = i18;
                                                }
                                            }
                                            fieldArr2 = fieldArr2;
                                            enumC6649 = enumC6646;
                                            i7 = i7;
                                            declaredFields = fieldArr2;
                                            annotationArr5 = annotationArr2;
                                            sArr5 = sArr2;
                                            declaredConstructors = constructorArr;
                                            strArr4 = strArr;
                                            cls2 = cls3;
                                        }
                                        enumC6647 = enumC6645;
                                        fieldArr2 = fieldArr;
                                        i7 = i;
                                        enumC6649 = enumC6647;
                                        declaredFields = fieldArr2;
                                        annotationArr5 = annotationArr2;
                                        sArr5 = sArr2;
                                        declaredConstructors = constructorArr;
                                        strArr4 = strArr;
                                        cls2 = cls3;
                                    } else {
                                        fieldArr2 = fieldArr;
                                    }
                                    if (name.startsWith(C0655am.f2303ae) || name.length() < 3) {
                                        fieldArr2 = fieldArr2;
                                        enumC6647 = enumC6645;
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
                                            enumC6647 = enumC6645;
                                        }
                                        if (m47037(cls, interfaceC14021, strSubstring)) {
                                            fieldArr2 = fieldArr2;
                                            enumC6647 = enumC6645;
                                        } else {
                                            Field fieldM47032 = m47031(cls, strSubstring, fieldArr2, map);
                                            if (fieldM47032 == null) {
                                                fieldM47032 = m47031(cls, name, fieldArr2, map);
                                            }
                                            Field field = fieldM47032;
                                            if (field != null) {
                                                InterfaceC14691 interfaceC14698 = (InterfaceC14691) field.getAnnotation(InterfaceC14691.class);
                                                if (interfaceC14698 != null) {
                                                    if (interfaceC14698.serialize()) {
                                                        iOrdinal = interfaceC14698.ordinal();
                                                        iM49980 = EnumC22172.m49980(interfaceC14698.serialzeFeatures());
                                                        if (interfaceC14698.name().length() != 0) {
                                                            strSubstring = interfaceC14698.name();
                                                        }
                                                    } else {
                                                        fieldArr2 = fieldArr2;
                                                        enumC6647 = enumC6645;
                                                    }
                                                }
                                                interfaceC14692 = interfaceC14698;
                                                i4 = iM49980;
                                            } else {
                                                i4 = iM49980;
                                                interfaceC14692 = null;
                                            }
                                            enumC6647 = enumC6645;
                                            if (enumC6647 != null) {
                                                strSubstring = enumC6647.m15135(strSubstring);
                                            }
                                            String str5 = strSubstring;
                                            m47036(cls, field, i);
                                            m47036(cls, method2, i);
                                            linkedHashMap.put(str5, new C17476(str5, method2, field, cls, null, iOrdinal, i4, interfaceC14691, interfaceC14692));
                                        }
                                    }
                                    i7 = i;
                                    enumC6649 = enumC6647;
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
                                    if (annotation instanceof InterfaceC14691) {
                                        interfaceC14691 = (InterfaceC14691) annotation;
                                        annotationArr2 = parameterAnnotations;
                                        strArr = strArrM47046;
                                    } else {
                                        i6++;
                                        sArr3 = sArr2;
                                        annotationArr3 = annotationArr4;
                                    }
                                }
                                if (interfaceC14691 != null) {
                                    if (interfaceC14691.serialize()) {
                                        i7 = i7;
                                        enumC6646 = enumC6646;
                                        cls3 = cls3;
                                    } else {
                                        iOrdinal = interfaceC14691.ordinal();
                                        iM49980 = EnumC22172.m49980(interfaceC14691.serialzeFeatures());
                                        if (interfaceC14691.name().length() != 0) {
                                            String strName3 = interfaceC14691.name();
                                            m47036(cls, method2, i7);
                                            enumC6646 = enumC6646;
                                            i7 = i7;
                                            cls3 = cls3;
                                            linkedHashMap.put(strName3, new C17476(strName3, method2, null, cls, null, iOrdinal, iM49980, interfaceC14691, null));
                                        }
                                    }
                                    fieldArr2 = fieldArr;
                                    fieldArr2 = fieldArr2;
                                    enumC6649 = enumC6646;
                                    i7 = i7;
                                    declaredFields = fieldArr2;
                                    annotationArr5 = annotationArr2;
                                    sArr5 = sArr2;
                                    declaredConstructors = constructorArr;
                                    strArr4 = strArr;
                                    cls2 = cls3;
                                } else {
                                    iM49980 = 0;
                                    iOrdinal = 0;
                                }
                                if (name.startsWith("get")) {
                                    if (name.length() >= 4) {
                                        if (name.equals("getClass")) {
                                            fieldArr2 = fieldArr;
                                        } else {
                                            cCharAt = name.charAt(3);
                                            if (Character.isUpperCase(cCharAt)) {
                                                strM47030 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                                            } else if (cCharAt == '_') {
                                                strM47030 = name.substring(4);
                                            } else if (cCharAt == 'f') {
                                                strM47030 = name.substring(3);
                                            } else if (name.length() < 5) {
                                            }
                                            if (m47037(cls, interfaceC14021, strM47030)) {
                                                fieldArr2 = fieldArr;
                                            } else {
                                                fieldArr2 = fieldArr;
                                                fieldM47031 = m47031(cls, strM47030, fieldArr2, map);
                                                if (fieldM47031 != null) {
                                                    interfaceC14693 = (InterfaceC14691) fieldM47031.getAnnotation(InterfaceC14691.class);
                                                    if (interfaceC14693 != null) {
                                                        if (interfaceC14693.serialize()) {
                                                            iOrdinal = interfaceC14693.ordinal();
                                                            iM49980 = EnumC22172.m49980(interfaceC14693.serialzeFeatures());
                                                            if (interfaceC14693.name().length() != 0) {
                                                                strM47030 = interfaceC14693.name();
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
                                                    InterfaceC14691 interfaceC14699 = interfaceC14693;
                                                    int i19 = iOrdinal;
                                                    int i110 = iM49980;
                                                    enumC6648 = enumC6646;
                                                    if (enumC6648 != null) {
                                                        strM47030 = enumC6648.m15135(strM47030);
                                                    }
                                                    String str6 = strM47030;
                                                    m47036(cls, method2, i7);
                                                    iOrdinal = i19;
                                                    linkedHashMap.put(str6, new C17476(str6, method2, fieldM47031, cls, null, iOrdinal, i110, interfaceC14691, interfaceC14699));
                                                    iM49980 = i110;
                                                } else {
                                                    interfaceC14693 = null;
                                                }
                                                z4 = false;
                                                InterfaceC14691 interfaceC146910 = interfaceC14693;
                                                int i111 = iOrdinal;
                                                int i112 = iM49980;
                                                enumC6648 = enumC6646;
                                                if (enumC6648 != null) {
                                                    strM47030 = enumC6648.m15135(strM47030);
                                                }
                                                String str7 = strM47030;
                                                m47036(cls, method2, i7);
                                                iOrdinal = i111;
                                                linkedHashMap.put(str7, new C17476(str7, method2, fieldM47031, cls, null, iOrdinal, i112, interfaceC14691, interfaceC146910));
                                                iM49980 = i112;
                                            }
                                        }
                                        fieldArr2 = fieldArr2;
                                        enumC6649 = enumC6646;
                                        i7 = i7;
                                        declaredFields = fieldArr2;
                                        annotationArr5 = annotationArr2;
                                        sArr5 = sArr2;
                                        declaredConstructors = constructorArr;
                                        strArr4 = strArr;
                                        cls2 = cls3;
                                    }
                                    enumC6647 = enumC6645;
                                    fieldArr2 = fieldArr;
                                    i7 = i;
                                    enumC6649 = enumC6647;
                                    declaredFields = fieldArr2;
                                    annotationArr5 = annotationArr2;
                                    sArr5 = sArr2;
                                    declaredConstructors = constructorArr;
                                    strArr4 = strArr;
                                    cls2 = cls3;
                                } else {
                                    fieldArr2 = fieldArr;
                                }
                                if (name.startsWith(C0655am.f2303ae)) {
                                    fieldArr2 = fieldArr2;
                                    enumC6647 = enumC6645;
                                } else {
                                    fieldArr2 = fieldArr2;
                                    enumC6647 = enumC6645;
                                }
                                i7 = i;
                                enumC6649 = enumC6647;
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
                    strArr = strArrM47046;
                    sArr = sArr4;
                    declaredConstructors = constructorArr;
                }
                sArr3 = sArr6;
                strArrM47046 = strArr;
                parameterAnnotations = annotationArr;
                if (strArrM47046 == null) {
                    sArr4 = sArr3;
                    constructorArr = declaredConstructors;
                    strArr = strArrM47046;
                    sArr = sArr4;
                    declaredConstructors = constructorArr;
                } else {
                    sArr4 = sArr3;
                    constructorArr = declaredConstructors;
                    strArr = strArrM47046;
                    sArr = sArr4;
                    declaredConstructors = constructorArr;
                }
                if (interfaceC14691 != null) {
                    if (interfaceC14691.serialize()) {
                        i7 = i7;
                        enumC6646 = enumC6646;
                        cls3 = cls3;
                    } else {
                        iOrdinal = interfaceC14691.ordinal();
                        iM49980 = EnumC22172.m49980(interfaceC14691.serialzeFeatures());
                        if (interfaceC14691.name().length() != 0) {
                            String strName4 = interfaceC14691.name();
                            m47036(cls, method2, i7);
                            enumC6646 = enumC6646;
                            i7 = i7;
                            cls3 = cls3;
                            linkedHashMap.put(strName4, new C17476(strName4, method2, null, cls, null, iOrdinal, iM49980, interfaceC14691, null));
                        }
                    }
                    fieldArr2 = fieldArr;
                    fieldArr2 = fieldArr2;
                    enumC6649 = enumC6646;
                    i7 = i7;
                    declaredFields = fieldArr2;
                    annotationArr5 = annotationArr2;
                    sArr5 = sArr2;
                    declaredConstructors = constructorArr;
                    strArr4 = strArr;
                    cls2 = cls3;
                } else {
                    iM49980 = 0;
                    iOrdinal = 0;
                }
                if (name.startsWith("get")) {
                    if (name.length() >= 4) {
                        if (name.equals("getClass")) {
                            fieldArr2 = fieldArr;
                        } else {
                            cCharAt = name.charAt(3);
                            if (Character.isUpperCase(cCharAt)) {
                                strM47030 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                            } else if (cCharAt == '_') {
                                strM47030 = name.substring(4);
                            } else if (cCharAt == 'f') {
                                strM47030 = name.substring(3);
                            } else if (name.length() < 5) {
                            }
                            if (m47037(cls, interfaceC14021, strM47030)) {
                                fieldArr2 = fieldArr;
                            } else {
                                fieldArr2 = fieldArr;
                                fieldM47031 = m47031(cls, strM47030, fieldArr2, map);
                                if (fieldM47031 != null) {
                                    interfaceC14693 = (InterfaceC14691) fieldM47031.getAnnotation(InterfaceC14691.class);
                                    if (interfaceC14693 != null) {
                                        if (interfaceC14693.serialize()) {
                                            iOrdinal = interfaceC14693.ordinal();
                                            iM49980 = EnumC22172.m49980(interfaceC14693.serialzeFeatures());
                                            if (interfaceC14693.name().length() != 0) {
                                                strM47030 = interfaceC14693.name();
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
                                    InterfaceC14691 interfaceC146911 = interfaceC14693;
                                    int i113 = iOrdinal;
                                    int i114 = iM49980;
                                    enumC6648 = enumC6646;
                                    if (enumC6648 != null) {
                                        strM47030 = enumC6648.m15135(strM47030);
                                    }
                                    String str8 = strM47030;
                                    m47036(cls, method2, i7);
                                    iOrdinal = i113;
                                    linkedHashMap.put(str8, new C17476(str8, method2, fieldM47031, cls, null, iOrdinal, i114, interfaceC14691, interfaceC146911));
                                    iM49980 = i114;
                                } else {
                                    interfaceC14693 = null;
                                }
                                z4 = false;
                                InterfaceC14691 interfaceC146912 = interfaceC14693;
                                int i115 = iOrdinal;
                                int i116 = iM49980;
                                enumC6648 = enumC6646;
                                if (enumC6648 != null) {
                                    strM47030 = enumC6648.m15135(strM47030);
                                }
                                String str9 = strM47030;
                                m47036(cls, method2, i7);
                                iOrdinal = i115;
                                linkedHashMap.put(str9, new C17476(str9, method2, fieldM47031, cls, null, iOrdinal, i116, interfaceC14691, interfaceC146912));
                                iM49980 = i116;
                            }
                        }
                        fieldArr2 = fieldArr2;
                        enumC6649 = enumC6646;
                        i7 = i7;
                        declaredFields = fieldArr2;
                        annotationArr5 = annotationArr2;
                        sArr5 = sArr2;
                        declaredConstructors = constructorArr;
                        strArr4 = strArr;
                        cls2 = cls3;
                    }
                    enumC6647 = enumC6645;
                    fieldArr2 = fieldArr;
                    i7 = i;
                    enumC6649 = enumC6647;
                    declaredFields = fieldArr2;
                    annotationArr5 = annotationArr2;
                    sArr5 = sArr2;
                    declaredConstructors = constructorArr;
                    strArr4 = strArr;
                    cls2 = cls3;
                } else {
                    fieldArr2 = fieldArr;
                }
                if (name.startsWith(C0655am.f2303ae)) {
                    fieldArr2 = fieldArr2;
                    enumC6647 = enumC6645;
                } else {
                    fieldArr2 = fieldArr2;
                    enumC6647 = enumC6645;
                }
                i7 = i;
                enumC6649 = enumC6647;
                declaredFields = fieldArr2;
                annotationArr5 = annotationArr2;
                sArr5 = sArr2;
                declaredConstructors = constructorArr;
                strArr4 = strArr;
                cls2 = cls3;
            }
            sArr2 = sArr;
            constructorArr = declaredConstructors;
            interfaceC14691 = interfaceC14691M47034;
            annotationArr2 = parameterAnnotations;
            if (interfaceC14691 != null) {
                if (interfaceC14691.serialize()) {
                    i7 = i7;
                    enumC6646 = enumC6646;
                    cls3 = cls3;
                } else {
                    iOrdinal = interfaceC14691.ordinal();
                    iM49980 = EnumC22172.m49980(interfaceC14691.serialzeFeatures());
                    if (interfaceC14691.name().length() != 0) {
                        String strName5 = interfaceC14691.name();
                        m47036(cls, method2, i7);
                        enumC6646 = enumC6646;
                        i7 = i7;
                        cls3 = cls3;
                        linkedHashMap.put(strName5, new C17476(strName5, method2, null, cls, null, iOrdinal, iM49980, interfaceC14691, null));
                    }
                }
                fieldArr2 = fieldArr;
                fieldArr2 = fieldArr2;
                enumC6649 = enumC6646;
                i7 = i7;
                declaredFields = fieldArr2;
                annotationArr5 = annotationArr2;
                sArr5 = sArr2;
                declaredConstructors = constructorArr;
                strArr4 = strArr;
                cls2 = cls3;
            } else {
                iM49980 = 0;
                iOrdinal = 0;
            }
            if (name.startsWith("get")) {
                if (name.length() >= 4) {
                    if (name.equals("getClass")) {
                        fieldArr2 = fieldArr;
                    } else {
                        cCharAt = name.charAt(3);
                        if (Character.isUpperCase(cCharAt)) {
                            strM47030 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                        } else if (cCharAt == '_') {
                            strM47030 = name.substring(4);
                        } else if (cCharAt == 'f') {
                            strM47030 = name.substring(3);
                        } else if (name.length() < 5) {
                        }
                        if (m47037(cls, interfaceC14021, strM47030)) {
                            fieldArr2 = fieldArr;
                        } else {
                            fieldArr2 = fieldArr;
                            fieldM47031 = m47031(cls, strM47030, fieldArr2, map);
                            if (fieldM47031 != null) {
                                interfaceC14693 = (InterfaceC14691) fieldM47031.getAnnotation(InterfaceC14691.class);
                                if (interfaceC14693 != null) {
                                    if (interfaceC14693.serialize()) {
                                        iOrdinal = interfaceC14693.ordinal();
                                        iM49980 = EnumC22172.m49980(interfaceC14693.serialzeFeatures());
                                        if (interfaceC14693.name().length() != 0) {
                                            strM47030 = interfaceC14693.name();
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
                                InterfaceC14691 interfaceC146913 = interfaceC14693;
                                int i117 = iOrdinal;
                                int i118 = iM49980;
                                enumC6648 = enumC6646;
                                if (enumC6648 != null) {
                                    strM47030 = enumC6648.m15135(strM47030);
                                }
                                String str10 = strM47030;
                                m47036(cls, method2, i7);
                                iOrdinal = i117;
                                linkedHashMap.put(str10, new C17476(str10, method2, fieldM47031, cls, null, iOrdinal, i118, interfaceC14691, interfaceC146913));
                                iM49980 = i118;
                            } else {
                                interfaceC14693 = null;
                            }
                            z4 = false;
                            InterfaceC14691 interfaceC146914 = interfaceC14693;
                            int i119 = iOrdinal;
                            int i1110 = iM49980;
                            enumC6648 = enumC6646;
                            if (enumC6648 != null) {
                                strM47030 = enumC6648.m15135(strM47030);
                            }
                            String str11 = strM47030;
                            m47036(cls, method2, i7);
                            iOrdinal = i119;
                            linkedHashMap.put(str11, new C17476(str11, method2, fieldM47031, cls, null, iOrdinal, i1110, interfaceC14691, interfaceC146914));
                            iM49980 = i1110;
                        }
                    }
                    fieldArr2 = fieldArr2;
                    enumC6649 = enumC6646;
                    i7 = i7;
                    declaredFields = fieldArr2;
                    annotationArr5 = annotationArr2;
                    sArr5 = sArr2;
                    declaredConstructors = constructorArr;
                    strArr4 = strArr;
                    cls2 = cls3;
                }
                enumC6647 = enumC6645;
                fieldArr2 = fieldArr;
                i7 = i;
                enumC6649 = enumC6647;
                declaredFields = fieldArr2;
                annotationArr5 = annotationArr2;
                sArr5 = sArr2;
                declaredConstructors = constructorArr;
                strArr4 = strArr;
                cls2 = cls3;
            } else {
                fieldArr2 = fieldArr;
            }
            if (name.startsWith(C0655am.f2303ae)) {
                fieldArr2 = fieldArr2;
                enumC6647 = enumC6645;
            } else {
                fieldArr2 = fieldArr2;
                enumC6647 = enumC6645;
            }
            i7 = i;
            enumC6649 = enumC6647;
            declaredFields = fieldArr2;
            annotationArr5 = annotationArr2;
            sArr5 = sArr2;
            declaredConstructors = constructorArr;
            strArr4 = strArr;
            cls2 = cls3;
        }
        Class<? super Object> cls4 = cls2;
        Field[] fieldArr3 = declaredFields;
        EnumC6645 enumC66410 = enumC6649;
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
            InterfaceC14691 interfaceC146915 = (InterfaceC14691) field4.getAnnotation(InterfaceC14691.class);
            String name2 = field4.getName();
            if (interfaceC146915 == null) {
                i2 = 0;
                i3 = 0;
            } else if (interfaceC146915.serialize()) {
                int iOrdinal2 = interfaceC146915.ordinal();
                int iM49981 = EnumC22172.m49980(interfaceC146915.serialzeFeatures());
                if (interfaceC146915.name().length() != 0) {
                    name2 = interfaceC146915.name();
                }
                i2 = iOrdinal2;
                i3 = iM49981;
            }
            if (enumC66410 != null) {
                name2 = enumC66410.m15135(name2);
            }
            String str12 = name2;
            if (!linkedHashMap.containsKey(str12)) {
                m47036(cls, field4, i7);
                linkedHashMap.put(str12, new C17476(str12, null, field4, cls, null, i2, i3, null, interfaceC146915));
            }
            i7 = i;
            enumC66410 = enumC66410;
        }
        ArrayList arrayList3 = new ArrayList();
        if (interfaceC14021 == null) {
            z2 = false;
            strArrOrders = strArr3;
        } else {
            strArrOrders = interfaceC14021.orders();
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
                arrayList3.add((C17476) linkedHashMap.get(str13));
            }
        } else {
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                arrayList3.add((C17476) it.next());
            }
            if (z) {
                Collections.sort(arrayList3);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC14691 m47034(Method method, Class cls) {
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
                                InterfaceC14691 interfaceC14691 = (InterfaceC14691) method2.getAnnotation(InterfaceC14691.class);
                                if (interfaceC14691 == null) {
                                    break;
                                }
                                return interfaceC14691;
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
                        InterfaceC14691 interfaceC14692 = (InterfaceC14691) method3.getAnnotation(InterfaceC14691.class);
                        if (interfaceC14692 == null) {
                            break;
                        }
                        return interfaceC14692;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m47037(Class cls, InterfaceC14021 interfaceC14021, String str) {
        if (interfaceC14021 != null && interfaceC14021.ignores() != null) {
            for (String str2 : interfaceC14021.ignores()) {
                if (str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        Class superclass = cls.getSuperclass();
        return (superclass == Object.class || superclass == null || !m47037(superclass, (InterfaceC14021) superclass.getAnnotation(InterfaceC14021.class), str)) ? false : true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m47055(Type type) {
        Type genericSuperclass;
        if (type instanceof ParameterizedType) {
            return true;
        }
        return (type instanceof Class) && (genericSuperclass = ((Class) type).getGenericSuperclass()) != Object.class && m47055(genericSuperclass);
    }

    /* JADX INFO: renamed from: ܽ */
    public static Type m47050(Type type) {
        return type instanceof Class ? m47050(((Class) type).getGenericSuperclass()) : type;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Class m47024(Type type) {
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m47024(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            return (Class) ((TypeVariable) type).getBounds()[0];
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return m47024(upperBounds[0]);
            }
            return Object.class;
        }
        return Object.class;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m47030(String str) {
        if (str == null || str.length() == 0 || (str.length() > 1 && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(0)))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static void m47036(Class cls, Member member, int i) {
        if (member == 0 || !f65448) {
            return;
        }
        Class superclass = cls.getSuperclass();
        if ((superclass != null && superclass != Object.class) || (member.getModifiers() & 1) == 0 || (i & 1) == 0) {
            try {
                ((AccessibleObject) member).setAccessible(true);
            } catch (AccessControlException unused) {
                f65448 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Field m47031(Class cls, String str, Field[] fieldArr, HashMap map) {
        Field fieldM47043 = m47043(cls, str, fieldArr, map);
        if (fieldM47043 == null) {
            fieldM47043 = m47043(cls, C21466.m48631("_", str), fieldArr, map);
        }
        if (fieldM47043 == null) {
            fieldM47043 = m47043(cls, C21466.m48631("m_", str), fieldArr, map);
        }
        if (fieldM47043 != null) {
            return fieldM47043;
        }
        return m47043(cls, "m" + str.substring(0, 1).toUpperCase() + str.substring(1), fieldArr, map);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Field m47043(Class cls, String str, Field[] fieldArr, HashMap map) {
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
        return m47031(superclass, str, declaredFields, map);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX INFO: renamed from: ۧ */
    public static Type m47044(Type type) {
        Type typeM47044;
        if (type instanceof ParameterizedType) {
            typeM47044 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (typeM47044 instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) typeM47044).getUpperBounds();
                if (upperBounds.length == 1) {
                    typeM47044 = upperBounds[0];
                }
            }
        } else if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.getName().startsWith("java.")) {
                typeM47044 = null;
            } else {
                typeM47044 = m47044(cls.getGenericSuperclass());
            }
        } else {
            typeM47044 = null;
        }
        return typeM47044 == null ? Object.class : typeM47044;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m47025(Class cls) {
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m47038(Type[] typeArr, TypeVariable[] typeVariableArr, Type[] typeArr2) {
        if (typeArr2 == null || typeVariableArr.length == 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < typeArr.length; i++) {
            Type type = typeArr[i];
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (m47038(actualTypeArguments, typeVariableArr, typeArr2)) {
                    typeArr[i] = new C20160(actualTypeArguments, parameterizedType.getOwnerType(), parameterizedType.getRawType());
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

    /* JADX INFO: renamed from: ۧ */
    public static long m47041(String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public static void m47035(Class cls, String str) {
        f65454.put(str, cls);
    }
}
