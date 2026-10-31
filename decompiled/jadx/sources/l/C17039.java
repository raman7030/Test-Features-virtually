package l;

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
public final class C17039 implements InterfaceC19157 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17039 f52222 = new C17039();

    @Override // l.InterfaceC19157
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5204(C11556 c11556, Type type, Object obj) {
        C7322 c7322 = c11556.f34488;
        if (type != C21434.class) {
            if (c7322.f22491 == 8) {
                c7322.m19641(16);
                return null;
            }
            Map mapM40001 = m40001(type);
            C14216 c14216 = c11556.f34496;
            try {
                c11556.m28437(c14216, mapM40001, obj);
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    Type type2 = parameterizedType.getActualTypeArguments()[0];
                    Type type3 = parameterizedType.getActualTypeArguments()[1];
                    if (String.class == type2) {
                        return m40002(c11556, obj, type3, mapM40001);
                    }
                    return m40000(c11556, mapM40001, type2, type3);
                }
                return c11556.m28446(mapM40001, obj);
            } finally {
                c11556.m28444(c14216);
            }
        }
        return (C21434) c11556.m28446((c7322.f22495 & EnumC13671.OrderedField.f40811) != 0 ? new C21434(new LinkedHashMap()) : new C21434(), null);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Map m40002(C11556 c11556, Object obj, Type type, Map map) {
        String strM19639;
        C7322 c7322 = c11556.f34488;
        C23389 c23389 = c11556.f34495;
        C9279 c9279 = c11556.f34493;
        if (c7322.f22491 != 12) {
            throw new C15082("syntax error, expect {, actual " + c7322.f22491);
        }
        C14216 c14216 = c11556.f34496;
        while (true) {
            try {
                c7322.m19615();
                char c = c7322.f22497;
                while (c == ',') {
                    c7322.m19657();
                    c7322.m19615();
                    c = c7322.f22497;
                }
                if (c == '\"') {
                    strM19639 = c7322.m19619(c9279, '\"');
                    c7322.m19615();
                    if (c7322.f22497 != ':') {
                        throw new C15082("syntax error, " + c7322.m19654());
                    }
                } else {
                    if (c == '}') {
                        c7322.m19657();
                        c7322.f22501 = 0;
                        c7322.m19641(16);
                        c11556.m28444(c14216);
                        return map;
                    }
                    if (c == '\'') {
                        strM19639 = c7322.m19619(c9279, '\'');
                        c7322.m19615();
                        if (c7322.f22497 != ':') {
                            throw new C15082("syntax error, " + c7322.m19654());
                        }
                    } else {
                        strM19639 = c7322.m19639(c9279);
                        c7322.m19615();
                        char c2 = c7322.f22497;
                        if (c2 != ':') {
                            throw new C15082("expect ':' at " + c7322.f22488 + ", actual " + c2);
                        }
                    }
                }
                c7322.m19657();
                c7322.m19615();
                c7322.f22501 = 0;
                Object objM28435 = null;
                if (strM19639 != "@type" || c7322.m19624(EnumC13671.DisableSpecialKeyDetect)) {
                    c7322.m19638();
                    c11556.m28444(c14216);
                    if (c7322.f22491 == 8) {
                        c7322.m19638();
                    } else {
                        objM28435 = c11556.m28435(strM19639, type);
                    }
                    map.put(strM19639, objM28435);
                    if (c11556.f34490 == 1) {
                        c11556.m28442(map, strM19639);
                    }
                    c11556.m28437(c14216, objM28435, strM19639);
                    int i = c7322.f22491;
                    if (i != 20 && i != 15) {
                        if (i == 13) {
                            c7322.m19638();
                            c11556.m28444(c14216);
                            return map;
                        }
                    }
                    c11556.m28444(c14216);
                    return map;
                }
                Class clsM51836 = c23389.m51836(c7322.m19619(c9279, '\"'), c7322.f22495, null);
                if (clsM51836 != map.getClass()) {
                    InterfaceC19157 interfaceC19157M51838 = c23389.m51838((Type) clsM51836);
                    c7322.m19641(16);
                    c11556.f34490 = 2;
                    if (c14216 != null && !(obj instanceof Integer)) {
                        c11556.m28445();
                    }
                    Map map2 = (Map) interfaceC19157M51838.mo5204(c11556, clsM51836, obj);
                    c11556.m28444(c14216);
                    return map2;
                }
                c7322.m19641(16);
                if (c7322.f22491 == 13) {
                    c7322.m19641(16);
                    c11556.m28444(c14216);
                    return map;
                }
            } catch (Throwable th) {
                c11556.m28444(c14216);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m40000(C11556 c11556, Map map, Type type, Type type2) {
        Object obj;
        C7322 c7322 = c11556.f34488;
        C23389 c23389 = c11556.f34495;
        int i = c7322.f22491;
        if (i != 12 && i != 16) {
            throw new C15082("syntax error, expect {, actual ".concat(C19993.m46101(i)));
        }
        InterfaceC19157 interfaceC19157M51838 = c23389.m51838(type);
        InterfaceC19157 interfaceC19157M51839 = c23389.m51838(type2);
        c7322.m19638();
        C14216 c14216 = c11556.f34496;
        while (true) {
            try {
                int i2 = c7322.f22491;
                if (i2 == 13) {
                    c7322.m19641(16);
                    c11556.m28444(c14216);
                    return map;
                }
                if (i2 == 4 && c7322.f22501 == 4 && c7322.f22489.startsWith("$ref", c7322.f22487 + 1) && !c7322.m19624(EnumC13671.DisableSpecialKeyDetect)) {
                    c7322.m19635();
                    if (c7322.f22491 != 4) {
                        throw new C15082("illegal ref, " + C19993.m46101(i2));
                    }
                    String strM19634 = c7322.m19634();
                    if ("..".equals(strM19634)) {
                        obj = c14216.f42886.f42885;
                    } else if ("$".equals(strM19634)) {
                        C14216 c14217 = c14216;
                        while (true) {
                            C14216 c14218 = c14217.f42886;
                            if (c14218 == null) {
                                break;
                            }
                            c14217 = c14218;
                        }
                        obj = c14217.f42885;
                    } else {
                        c11556.m28443(new C5911(c14216, strM19634));
                        c11556.f34490 = 1;
                        obj = null;
                    }
                    c7322.m19641(13);
                    if (c7322.f22491 != 13) {
                        throw new C15082("illegal ref");
                    }
                    c7322.m19641(16);
                    c11556.m28444(c14216);
                    return obj;
                }
                if (map.size() == 0 && i2 == 4 && "@type".equals(c7322.m19634()) && !c7322.m19624(EnumC13671.DisableSpecialKeyDetect)) {
                    c7322.m19635();
                    c7322.m19641(16);
                    if (c7322.f22491 == 13) {
                        c7322.m19638();
                        c11556.m28444(c14216);
                        return map;
                    }
                    c7322.m19638();
                }
                Object objMo5204 = interfaceC19157M51838.mo5204(c11556, type, null);
                if (c7322.f22491 != 17) {
                    throw new C15082("syntax error, expect :, actual " + c7322.f22491);
                }
                c7322.m19638();
                Object objMo5205 = interfaceC19157M51839.mo5204(c11556, type2, objMo5204);
                if (c11556.f34490 == 1) {
                    c11556.m28442(map, objMo5204);
                }
                map.put(objMo5204, objMo5205);
                if (c7322.f22491 == 16) {
                    c7322.m19638();
                }
            } catch (Throwable th) {
                c11556.m28444(c14216);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Map m40001(Type type) {
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
        if (type == ConcurrentMap.class || type == ConcurrentMapC10942.class) {
            return new ConcurrentMapC10942();
        }
        if (type == Map.class || type == HashMap.class) {
            return new HashMap();
        }
        if (type == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (type == C21434.class) {
            return new C21434();
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            if (EnumMap.class.equals(rawType)) {
                return new EnumMap((Class) parameterizedType.getActualTypeArguments()[0]);
            }
            return m40001(rawType);
        }
        Class cls = (Class) type;
        if (cls.isInterface()) {
            throw new C15082("unsupport type " + type);
        }
        try {
            return (Map) cls.newInstance();
        } catch (Exception e) {
            throw new C15082("unsupport type " + type, (Throwable) e);
        }
    }
}
