package p067l;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: l.ܿ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAVD */
/* JADX INFO: loaded from: classes4.dex */
public final class C18562 implements InterfaceC20575 {

    /* JADX INFO: renamed from: ֫ */
    public static C18562 f55404 = new C18562();

    @Override // p067l.InterfaceC20575
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7431(C13351 c13351, Type type, Object obj) {
        C9327 c9327 = c13351.f37485;
        if (type != C22739.class) {
            if (c9327.f25382 == 8) {
                c9327.m21609(16);
                return null;
            }
            Map mapM42246 = m42246(type);
            C15879 c15879 = c13351.f37493;
            try {
                c13351.m30483(c15879, mapM42246, obj);
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    Type type2 = parameterizedType.getActualTypeArguments()[0];
                    Type type3 = parameterizedType.getActualTypeArguments()[1];
                    if (String.class == type2) {
                        return m42247(c13351, obj, type3, mapM42246);
                    }
                    return m42245(c13351, mapM42246, type2, type3);
                }
                return c13351.m30492(mapM42246, obj);
            } finally {
                c13351.m30490(c15879);
            }
        }
        return (C22739) c13351.m30492((c9327.f25386 & EnumC15361.OrderedField.f43892) != 0 ? new C22739(new LinkedHashMap()) : new C22739(), null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    public static Map m42247(C13351 c13351, Object obj, Type type, Map map) {
        String strM21607;
        C9327 c9327 = c13351.f37485;
        C24597 c24597 = c13351.f37492;
        C11187 c11187 = c13351.f37490;
        if (c9327.f25382 != 12) {
            throw new C16702("syntax error, expect {, actual " + c9327.f25382);
        }
        C15879 c15879 = c13351.f37493;
        while (true) {
            try {
                c9327.m21583();
                char c = c9327.f25388;
                while (c == ',') {
                    c9327.m21625();
                    c9327.m21583();
                    c = c9327.f25388;
                }
                if (c == '\"') {
                    strM21607 = c9327.m21587(c11187, '\"');
                    c9327.m21583();
                    if (c9327.f25388 != ':') {
                        throw new C16702("syntax error, " + c9327.m21622());
                    }
                } else {
                    if (c == '}') {
                        c9327.m21625();
                        c9327.f25392 = 0;
                        c9327.m21609(16);
                        c13351.m30490(c15879);
                        return map;
                    }
                    if (c == '\'') {
                        strM21607 = c9327.m21587(c11187, '\'');
                        c9327.m21583();
                        if (c9327.f25388 != ':') {
                            throw new C16702("syntax error, " + c9327.m21622());
                        }
                    } else {
                        strM21607 = c9327.m21607(c11187);
                        c9327.m21583();
                        char c2 = c9327.f25388;
                        if (c2 != ':') {
                            throw new C16702("expect ':' at " + c9327.f25379 + ", actual " + c2);
                        }
                    }
                }
                c9327.m21625();
                c9327.m21583();
                c9327.f25392 = 0;
                Object objM30481 = null;
                if (strM21607 != "@type" || c9327.m21592(EnumC15361.DisableSpecialKeyDetect)) {
                    c9327.m21606();
                    c13351.m30490(c15879);
                    if (c9327.f25382 == 8) {
                        c9327.m21606();
                    } else {
                        objM30481 = c13351.m30481(strM21607, type);
                    }
                    map.put(strM21607, objM30481);
                    if (c13351.f37487 == 1) {
                        c13351.m30488(map, strM21607);
                    }
                    c13351.m30483(c15879, objM30481, strM21607);
                    int i = c9327.f25382;
                    if (i != 20 && i != 15) {
                        if (i == 13) {
                            c9327.m21606();
                            c13351.m30490(c15879);
                            return map;
                        }
                    }
                    c13351.m30490(c15879);
                    return map;
                }
                Class clsM54233 = c24597.m54233(c9327.m21587(c11187, '\"'), c9327.f25386, null);
                if (clsM54233 != map.getClass()) {
                    InterfaceC20575 interfaceC20575M54235 = c24597.m54235((Type) clsM54233);
                    c9327.m21609(16);
                    c13351.f37487 = 2;
                    if (c15879 != null && !(obj instanceof Integer)) {
                        c13351.m30491();
                    }
                    Map map2 = (Map) interfaceC20575M54235.mo7431(c13351, clsM54233, obj);
                    c13351.m30490(c15879);
                    return map2;
                }
                c9327.m21609(16);
                if (c9327.f25382 == 13) {
                    c9327.m21609(16);
                    c13351.m30490(c15879);
                    return map;
                }
            } catch (Throwable th) {
                c13351.m30490(c15879);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m42245(C13351 c13351, Map map, Type type, Type type2) {
        Object obj;
        C9327 c9327 = c13351.f37485;
        C24597 c24597 = c13351.f37492;
        int i = c9327.f25382;
        if (i != 12 && i != 16) {
            throw new C16702("syntax error, expect {, actual ".concat(C21370.m48416(i)));
        }
        InterfaceC20575 interfaceC20575M54235 = c24597.m54235(type);
        InterfaceC20575 interfaceC20575M54236 = c24597.m54235(type2);
        c9327.m21606();
        C15879 c15879 = c13351.f37493;
        while (true) {
            try {
                int i2 = c9327.f25382;
                if (i2 == 13) {
                    c9327.m21609(16);
                    c13351.m30490(c15879);
                    return map;
                }
                if (i2 == 4 && c9327.f25392 == 4 && c9327.f25380.startsWith("$ref", c9327.f25378 + 1) && !c9327.m21592(EnumC15361.DisableSpecialKeyDetect)) {
                    c9327.m21603();
                    if (c9327.f25382 != 4) {
                        throw new C16702("illegal ref, " + C21370.m48416(i2));
                    }
                    String strM21602 = c9327.m21602();
                    if ("..".equals(strM21602)) {
                        obj = c15879.f45976.f45975;
                    } else if ("$".equals(strM21602)) {
                        C15879 c158710 = c15879;
                        while (true) {
                            C15879 c158711 = c158710.f45976;
                            if (c158711 == null) {
                                break;
                            }
                            c158710 = c158711;
                        }
                        obj = c158710.f45975;
                    } else {
                        c13351.m30489(new C7986(c15879, strM21602));
                        c13351.f37487 = 1;
                        obj = null;
                    }
                    c9327.m21609(13);
                    if (c9327.f25382 != 13) {
                        throw new C16702("illegal ref");
                    }
                    c9327.m21609(16);
                    c13351.m30490(c15879);
                    return obj;
                }
                if (map.size() == 0 && i2 == 4 && "@type".equals(c9327.m21602()) && !c9327.m21592(EnumC15361.DisableSpecialKeyDetect)) {
                    c9327.m21603();
                    c9327.m21609(16);
                    if (c9327.f25382 == 13) {
                        c9327.m21606();
                        c13351.m30490(c15879);
                        return map;
                    }
                    c9327.m21606();
                }
                Object objMo7431 = interfaceC20575M54235.mo7431(c13351, type, null);
                if (c9327.f25382 != 17) {
                    throw new C16702("syntax error, expect :, actual " + c9327.f25382);
                }
                c9327.m21606();
                Object objMo7432 = interfaceC20575M54236.mo7431(c13351, type2, objMo7431);
                if (c13351.f37487 == 1) {
                    c13351.m30488(map, objMo7431);
                }
                map.put(objMo7431, objMo7432);
                if (c9327.f25382 == 16) {
                    c9327.m21606();
                }
            } catch (Throwable th) {
                c13351.m30490(c15879);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Map m42246(Type type) {
        if (type == Properties.class) {
            return new Properties();
        }
        if (type == Hashtable.class) {
            return new Hashtable();
        }
        if (type == IdentityHashMap.class) {
            return new IdentityHashMap();
        }
        if (type == SortedMap.class || type == TreeMap.class) {
            return new TreeMap();
        }
        if (type == ConcurrentMap.class || type == ConcurrentMapC12768.class) {
            return new ConcurrentMapC12768();
        }
        if (type == Map.class || type == HashMap.class) {
            return new HashMap();
        }
        if (type == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (type == C22739.class) {
            return new C22739();
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            if (EnumMap.class.equals(rawType)) {
                return new EnumMap((Class) parameterizedType.getActualTypeArguments()[0]);
            }
            return m42246(rawType);
        }
        Class cls = (Class) type;
        if (cls.isInterface()) {
            throw new C16702("unsupport type " + type);
        }
        try {
            return (Map) cls.newInstance();
        } catch (Exception e) {
            throw new C16702("unsupport type " + type, (Throwable) e);
        }
    }
}
