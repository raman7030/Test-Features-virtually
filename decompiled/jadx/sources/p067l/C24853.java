package p067l;

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
public final class C24853 {

    /* JADX INFO: renamed from: ۧ */
    public static final C24853 f79394 = new C24853();

    /* JADX INFO: renamed from: ֫ */
    public final C6078 f79395;

    public C24853() {
        C6078 c6078 = new C6078();
        this.f79395 = c6078;
        c6078.m13837(C22587.f71304, Boolean.class);
        C9175 c9175 = C9175.f24840;
        c6078.m13837(c9175, Character.class);
        C13869 c13869 = C13869.f39184;
        c6078.m13837(c13869, Byte.class);
        c6078.m13837(c13869, Short.class);
        c6078.m13837(c13869, Integer.class);
        c6078.m13837(c13869, Long.class);
        C12784 c12784 = C12784.f35984;
        c6078.m13837(c12784, Float.class);
        c6078.m13837(c12784, Double.class);
        c6078.m13837(c12784, Number.class);
        C16550 c16550 = C16550.f48614;
        c6078.m13837(c16550, BigDecimal.class);
        c6078.m13837(c16550, BigInteger.class);
        c6078.m13837(C11443.f31910, String.class);
        c6078.m13837(C7163.f18703, Object[].class);
        c6078.m13837(c9175, Class.class);
        c6078.m13837(c9175, SimpleDateFormat.class);
        c6078.m13837(c9175, Locale.class);
        c6078.m13837(c9175, Currency.class);
        c6078.m13837(c9175, TimeZone.class);
        c6078.m13837(c9175, UUID.class);
        c6078.m13837(c9175, URI.class);
        c6078.m13837(c9175, URL.class);
        c6078.m13837(c9175, Pattern.class);
        c6078.m13837(c9175, Charset.class);
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
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18147 m54590(Class cls) {
        Class superclass;
        boolean z;
        C21246 c21246;
        C13199 c13199;
        C21246 c21247;
        C23927 c23927;
        C15209 c15209;
        C6078 c6078 = this.f79395;
        InterfaceC18147 interfaceC18147 = (InterfaceC18147) c6078.m13836(cls);
        if (interfaceC18147 == null) {
            if (Map.class.isAssignableFrom(cls)) {
                c15209 = new C15209();
                c6078.m13837(c15209, cls);
            } else {
                boolean zIsAssignableFrom = AbstractSequentialList.class.isAssignableFrom(cls);
                InterfaceC18147 c131910 = C23257.f73094;
                if (zIsAssignableFrom) {
                    c6078.m13837(c131910, cls);
                } else if (List.class.isAssignableFrom(cls)) {
                    c23927 = new C23927();
                    c6078.m13837(c23927, cls);
                } else if (Collection.class.isAssignableFrom(cls)) {
                    c6078.m13837(c131910, cls);
                } else if (Date.class.isAssignableFrom(cls)) {
                    c21247 = C21246.f66779;
                    c6078.m13837(c21247, cls);
                } else {
                    boolean zIsAssignableFrom2 = InterfaceC9998.class.isAssignableFrom(cls);
                    c131910 = C9175.f24840;
                    if (zIsAssignableFrom2 || InterfaceC11858.class.isAssignableFrom(cls) || InterfaceC23409.class.isAssignableFrom(cls)) {
                        c6078.m13837(c131910, cls);
                    } else if (cls.isEnum() || ((superclass = cls.getSuperclass()) != null && superclass != Object.class && superclass.isEnum())) {
                        C6493 c6493 = new C6493();
                        c6078.m13837(c6493, cls);
                        interfaceC18147 = c6493;
                    } else if (cls.isArray()) {
                        Class<?> componentType = cls.getComponentType();
                        C3139 c3139 = new C3139(componentType, m54590(componentType));
                        c6078.m13837(c3139, cls);
                        interfaceC18147 = c3139;
                    } else if (Throwable.class.isAssignableFrom(cls)) {
                        c13199 = new C13199(cls);
                        c13199.f37090 |= EnumC22172.WriteClassName.f70155;
                        c6078.m13837(c13199, cls);
                    } else if (TimeZone.class.isAssignableFrom(cls) || Charset.class.isAssignableFrom(cls) || Enumeration.class.isAssignableFrom(cls)) {
                        c6078.m13837(c131910, cls);
                    } else if (Calendar.class.isAssignableFrom(cls)) {
                        c21246 = C21246.f66779;
                        c6078.m13837(c21246, cls);
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
                            InterfaceC18147 interfaceC18147M54590 = m54590(cls.getSuperclass());
                            c6078.m13837(interfaceC18147M54590, cls);
                            return interfaceC18147M54590;
                        }
                        if (!cls.getName().startsWith("android.net.Uri$")) {
                            c131910 = new C13199(cls);
                        }
                        c6078.m13837(c131910, cls);
                    }
                }
                interfaceC18147 = c131910;
            }
            if (interfaceC18147 == null) {
                interfaceC18147 = c21246;
                interfaceC18147 = c13199;
                interfaceC18147 = c21247;
                interfaceC18147 = c23927;
                interfaceC18147 = c15209;
                return (InterfaceC18147) c6078.m13836(cls);
            }
        }
        interfaceC18147 = c21246;
        interfaceC18147 = c13199;
        interfaceC18147 = c21247;
        interfaceC18147 = c23927;
        interfaceC18147 = c15209;
        return interfaceC18147;
    }
}
