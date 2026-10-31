package l;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.AbstractSequentialList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩻ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAVS */
/* JADX INFO: loaded from: classes.dex */
public final class C23658 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C23658 f76648 = new C23658();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3903 f76649;

    public C23658() {
        C3903 c3903 = new C3903();
        this.f76649 = c3903;
        c3903.m11901(C21274.f68621, Boolean.class);
        C7162 c7162 = C7162.f21961;
        c3903.m11901(c7162, Character.class);
        C12101 c12101 = C12101.f36173;
        c3903.m11901(c12101, Byte.class);
        c3903.m11901(c12101, Short.class);
        c3903.m11901(c12101, Integer.class);
        c3903.m11901(c12101, Long.class);
        C10959 c10959 = C10959.f32992;
        c3903.m11901(c10959, Float.class);
        c3903.m11901(c10959, Double.class);
        c3903.m11901(c10959, Number.class);
        C14922 c14922 = C14922.f45499;
        c3903.m11901(c14922, BigDecimal.class);
        c3903.m11901(c14922, BigInteger.class);
        c3903.m11901(C9548.f28964, String.class);
        c3903.m11901(C5045.f15871, Object[].class);
        c3903.m11901(c7162, Class.class);
        c3903.m11901(c7162, SimpleDateFormat.class);
        c3903.m11901(c7162, Locale.class);
        c3903.m11901(c7162, Currency.class);
        c3903.m11901(c7162, TimeZone.class);
        c3903.m11901(c7162, UUID.class);
        c3903.m11901(c7162, URI.class);
        c3903.m11901(c7162, URL.class);
        c3903.m11901(c7162, Pattern.class);
        c3903.m11901(c7162, Charset.class);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC16602 m52187(Class cls) {
        Class superclass;
        boolean z;
        C19863 c19863;
        C11396 c11396;
        C19863 c19864;
        C22684 c22684;
        C13511 c13511;
        C3903 c3903 = this.f76649;
        InterfaceC16602 interfaceC16602 = (InterfaceC16602) c3903.m11900(cls);
        if (interfaceC16602 == null) {
            if (Map.class.isAssignableFrom(cls)) {
                c13511 = new C13511();
                c3903.m11901(c13511, cls);
            } else {
                boolean zIsAssignableFrom = AbstractSequentialList.class.isAssignableFrom(cls);
                InterfaceC16602 c11397 = C21979.f70383;
                if (zIsAssignableFrom) {
                    c3903.m11901(c11397, cls);
                } else if (List.class.isAssignableFrom(cls)) {
                    c22684 = new C22684();
                    c3903.m11901(c22684, cls);
                } else if (Collection.class.isAssignableFrom(cls)) {
                    c3903.m11901(c11397, cls);
                } else if (Date.class.isAssignableFrom(cls)) {
                    c19864 = C19863.f64142;
                    c3903.m11901(c19864, cls);
                } else {
                    boolean zIsAssignableFrom2 = InterfaceC8028.class.isAssignableFrom(cls);
                    c11397 = C7162.f21961;
                    if (zIsAssignableFrom2 || InterfaceC9985.class.isAssignableFrom(cls) || InterfaceC22139.class.isAssignableFrom(cls)) {
                        c3903.m11901(c11397, cls);
                    } else if (cls.isEnum() || ((superclass = cls.getSuperclass()) != null && superclass != Object.class && superclass.isEnum())) {
                        C4340 c4340 = new C4340();
                        c3903.m11901(c4340, cls);
                        interfaceC16602 = c4340;
                    } else if (cls.isArray()) {
                        Class<?> componentType = cls.getComponentType();
                        C0811 c0811 = new C0811(componentType, m52187(componentType));
                        c3903.m11901(c0811, cls);
                        interfaceC16602 = c0811;
                    } else if (Throwable.class.isAssignableFrom(cls)) {
                        c11396 = new C11396(cls);
                        c11396.f34092 |= EnumC20837.WriteClassName.f67472;
                        c3903.m11901(c11396, cls);
                    } else if (TimeZone.class.isAssignableFrom(cls) || Charset.class.isAssignableFrom(cls) || Enumeration.class.isAssignableFrom(cls)) {
                        c3903.m11901(c11397, cls);
                    } else if (Calendar.class.isAssignableFrom(cls)) {
                        c19863 = C19863.f64142;
                        c3903.m11901(c19863, cls);
                    } else {
                        Class<?>[] interfaces = cls.getInterfaces();
                        int length = interfaces.length;
                        boolean z2 = false;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                Class<?> cls2 = interfaces[i];
                                z = true;
                                if (cls2.getName().equals("net.sf.cglib.proxy.Factory") || cls2.getName().equals("org.springframework.cglib.proxy.Factory")) {
                                    z2 = true;
                                } else {
                                    if (cls2.getName().equals("javassist.util.proxy.ProxyObject")) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                            z = false;
                            break;
                        }
                        if (z2 || z) {
                            InterfaceC16602 interfaceC16602M52187 = m52187(cls.getSuperclass());
                            c3903.m11901(interfaceC16602M52187, cls);
                            return interfaceC16602M52187;
                        }
                        if (!cls.getName().startsWith("android.net.Uri$")) {
                            c11397 = new C11396(cls);
                        }
                        c3903.m11901(c11397, cls);
                    }
                }
                interfaceC16602 = c11397;
            }
            if (interfaceC16602 == null) {
                interfaceC16602 = c19863;
                interfaceC16602 = c11396;
                interfaceC16602 = c19864;
                interfaceC16602 = c22684;
                interfaceC16602 = c13511;
                return (InterfaceC16602) c3903.m11900(cls);
            }
        }
        interfaceC16602 = c19863;
        interfaceC16602 = c11396;
        interfaceC16602 = c19864;
        interfaceC16602 = c22684;
        interfaceC16602 = c13511;
        return interfaceC16602;
    }
}
