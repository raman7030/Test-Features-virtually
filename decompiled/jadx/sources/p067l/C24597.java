package p067l;

import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩻֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAUU */
/* JADX INFO: loaded from: classes.dex */
public final class C24597 {

    /* JADX INFO: renamed from: ܽ */
    public static long[] f77882 = {-9164606388214699518L, -8720046426850100497L, -8649961213709896794L, -8165637398350707645L, -8109300701639721088L, -7966123100503199569L, -7921218830998286408L, -7775351613326101303L, -7768608037458185275L, -7766605818834748097L, -6835437086156813536L, -6316154655839304624L, -6179589609550493385L, -6025144546313590215L, -5939269048541779808L, -5885964883385605994L, -5764804792063216819L, -5472097725414717105L, -5194641081268104286L, -5076846148177416215L, -4837536971810737970L, -4703320437989596122L, -4608341446948126581L, -4537258998789938600L, -4438775680185074100L, -4314457471973557243L, -4150995715611818742L, -4082057040235125754L, -3975378478825053783L, -3935185854875733362L, -3319207949486691020L, -3077205613010077203L, -3053747177772160511L, -2995060141064716555L, -2825378362173150292L, -2533039401923731906L, -2439930098895578154L, -2378990704010641148L, -2364987994247679115L, -2262244760619952081L, -2192804397019347313L, -2095516571388852610L, -1872417015366588117L, -1650485814983027158L, -1589194880214235129L, -965955008570215305L, -905177026366752536L, -831789045734283466L, -582813228520337988L, -254670111376247151L, -219577392946377768L, -190281065685395680L, -26639035867733124L, -9822483067882491L, 4750336058574309L, 33238344207745342L, 156405680656087946L, 218512992947536312L, 313864100207897507L, 386461436234701831L, 823641066473609950L, 1073634739308289776L, 1153291637701043748L, 1203232727967308606L, 1214780596910349029L, 1459860845934817624L, 1502845958873959152L, 1534439610567445754L, 1698504441317515818L, 1818089308493370394L, 2078113382421334967L, 2164696723069287854L, 2622551729063269307L, 2653453629929770569L, 2660670623866180977L, 2731823439467737506L, 2836431254737891113L, 2930861374593775110L, 3085473968517218653L, 3089451460101527857L, 3114862868117605599L, 3129395579983849527L, 3256258368248066264L, 3452379460455804429L, 3547627781654598988L, 3637939656440441093L, 3688179072722109200L, 3718352661124136681L, 3730752432285826863L, 3794316665763266033L, 4000049462512838776L, 4046190361520671643L, 4147696707147271408L, 4193204392725694463L, 4241163808635564644L, 4254584350247334433L, 4814658433570175913L, 4841947709850912914L, 4904007817188630457L, 5100336081510080343L, 5274044858141538265L, 5347909877633654828L, 5450448828334921485L, 5474268165959054640L, 5545425291794704408L, 5596129856135573697L, 5688200883751798389L, 5751393439502795295L, 5944107969236155580L, 6007332606592876737L, 6280357960959217660L, 6456855723474196908L, 6511035576063254270L, 6534946468240507089L, 6584624952928234050L, 6734240326434096246L, 6742705432718011780L, 6854854816081053523L, 7045245923763966215L, 7123326897294507060L, 7179336928365889465L, 7240293012336844478L, 7347653049056829645L, 7375862386996623731L, 7442624256860549330L, 7617522210483516279L, 7658177784286215602L, 8055461369741094911L, 8389032537095247355L, 8409640769019589119L, 8488266005336625107L, 8537233257283452655L, 8838294710098435315L, 9140390920032557669L, 9140416208800006522L};

    /* JADX INFO: renamed from: ᩳ */
    public static C24597 f77883 = new C24597();

    /* JADX INFO: renamed from: ֫ */
    public final C6078 f77884;

    /* JADX INFO: renamed from: ۧ */
    public final C11187 f77885;

    public C24597() {
        C6078 c6078 = new C6078();
        this.f77884 = c6078;
        this.f77885 = new C11187();
        C9175 c9175 = C9175.f24840;
        c6078.m13837(c9175, SimpleDateFormat.class);
        C21246 c21246 = C21246.f66779;
        c6078.m13837(c21246, Date.class);
        c6078.m13837(c21246, Calendar.class);
        C18562 c18562 = C18562.f55404;
        c6078.m13837(c18562, Map.class);
        c6078.m13837(c18562, HashMap.class);
        c6078.m13837(c18562, LinkedHashMap.class);
        c6078.m13837(c18562, TreeMap.class);
        c6078.m13837(c18562, ConcurrentMap.class);
        c6078.m13837(c18562, ConcurrentMapC12768.class);
        C23257 c23257 = C23257.f73094;
        c6078.m13837(c23257, Collection.class);
        c6078.m13837(c23257, List.class);
        c6078.m13837(c23257, ArrayList.class);
        C17891 c17891 = C17891.f53462;
        c6078.m13837(c17891, Object.class);
        c6078.m13837(C11443.f31910, String.class);
        c6078.m13837(c9175, Character.TYPE);
        c6078.m13837(c9175, Character.class);
        C12784 c12784 = C12784.f35984;
        c6078.m13837(c12784, Byte.TYPE);
        c6078.m13837(c12784, Byte.class);
        c6078.m13837(c12784, Short.TYPE);
        c6078.m13837(c12784, Short.class);
        C13869 c13869 = C13869.f39184;
        c6078.m13837(c13869, Integer.TYPE);
        c6078.m13837(c13869, Integer.class);
        c6078.m13837(c13869, Long.TYPE);
        c6078.m13837(c13869, Long.class);
        C16550 c16550 = C16550.f48614;
        c6078.m13837(c16550, BigInteger.class);
        c6078.m13837(c16550, BigDecimal.class);
        c6078.m13837(c12784, Float.TYPE);
        c6078.m13837(c12784, Float.class);
        c6078.m13837(c12784, Double.TYPE);
        c6078.m13837(c12784, Double.class);
        C22587 c22587 = C22587.f71304;
        c6078.m13837(c22587, Boolean.TYPE);
        c6078.m13837(c22587, Boolean.class);
        c6078.m13837(c9175, Class.class);
        C7163 c7163 = C7163.f18703;
        c6078.m13837(c7163, char[].class);
        c6078.m13837(c7163, Object[].class);
        c6078.m13837(c9175, UUID.class);
        c6078.m13837(c9175, TimeZone.class);
        c6078.m13837(c9175, Locale.class);
        c6078.m13837(c9175, Currency.class);
        c6078.m13837(c9175, URI.class);
        c6078.m13837(c9175, URL.class);
        c6078.m13837(c9175, Pattern.class);
        c6078.m13837(c9175, Charset.class);
        c6078.m13837(c12784, Number.class);
        c6078.m13837(c9175, StackTraceElement.class);
        c6078.m13837(c17891, Serializable.class);
        c6078.m13837(c17891, Cloneable.class);
        c6078.m13837(c17891, Comparable.class);
        c6078.m13837(c17891, Closeable.class);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20575 m54235(Type type) {
        InterfaceC20575 interfaceC20575 = (InterfaceC20575) this.f77884.m13836(type);
        if (interfaceC20575 != null) {
            return interfaceC20575;
        }
        if (type instanceof Class) {
            return m54234((Class) type, type);
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return m54234((Class) rawType, type);
            }
            return m54235(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return m54235(upperBounds[0]);
            }
        }
        return C17891.f53462;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20575 m54234(Class cls, Type type) {
        InterfaceC20575 c3810;
        InterfaceC14021 interfaceC14021;
        Class clsMappingTo;
        C6078 c6078 = this.f77884;
        InterfaceC20575 interfaceC20575 = (InterfaceC20575) c6078.m13836(type);
        if (interfaceC20575 != null) {
            return interfaceC20575;
        }
        if (type == null) {
            type = cls;
        }
        InterfaceC20575 interfaceC20576 = (InterfaceC20575) c6078.m13836(type);
        if (interfaceC20576 != null) {
            return interfaceC20576;
        }
        if (!m54232(cls) && (interfaceC14021 = (InterfaceC14021) cls.getAnnotation(InterfaceC14021.class)) != null && (clsMappingTo = interfaceC14021.mappingTo()) != Void.class) {
            return m54234(clsMappingTo, clsMappingTo);
        }
        if ((type instanceof WildcardType) || (type instanceof TypeVariable) || (type instanceof ParameterizedType)) {
            interfaceC20576 = (InterfaceC20575) c6078.m13836(cls);
        }
        if (interfaceC20576 != null) {
            return interfaceC20576;
        }
        InterfaceC20575 interfaceC20577 = (InterfaceC20575) c6078.m13836(type);
        if (interfaceC20577 != null) {
            return interfaceC20577;
        }
        if (cls.isEnum()) {
            c3810 = new C24079(cls);
        } else if (cls.isArray()) {
            c3810 = C7163.f18703;
        } else {
            C23257 c23257 = C23257.f73094;
            if (cls == Set.class || cls == HashSet.class || cls == Collection.class || cls == List.class || cls == ArrayList.class || Collection.class.isAssignableFrom(cls)) {
                c3810 = c23257;
            } else if (Map.class.isAssignableFrom(cls)) {
                c3810 = C18562.f55404;
            } else if (Throwable.class.isAssignableFrom(cls)) {
                c3810 = new C10516(this, cls, cls);
            } else if (cls.getName().equals("android.net.Uri")) {
                c3810 = C9175.f24840;
            } else {
                c3810 = new C3810(this, cls, type);
            }
        }
        c6078.m13837(c3810, type);
        return c3810;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m54232(Class cls) {
        return cls.isPrimitive() || cls == Boolean.class || cls == Character.class || cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == String.class || cls == Date.class || cls == java.sql.Date.class || cls == Time.class || cls == Timestamp.class;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Class m54233(String str, int i, Class cls) {
        if (str == null) {
            return null;
        }
        if (str.length() < 128) {
            if (str.length() >= 3) {
                long jCharAt = (((long) str.charAt(0)) ^ (-3750763034362895579L)) * 1099511628211L;
                if (jCharAt == -5808493101479473382L) {
                    throw new C16702("autoType is not support. ".concat(str));
                }
                if ((jCharAt ^ ((long) C9417.m21911(1, str))) * 1099511628211L == 655701488918567152L) {
                    throw new C16702("autoType is not support. ".concat(str));
                }
                long jCharAt2 = (((((((long) str.charAt(0)) ^ (-3750763034362895579L)) * 1099511628211L) ^ ((long) str.charAt(1))) * 1099511628211L) ^ ((long) str.charAt(2))) * 1099511628211L;
                for (int i2 = 3; i2 < str.length(); i2++) {
                    jCharAt2 = (jCharAt2 ^ ((long) str.charAt(i2))) * 1099511628211L;
                    if (Arrays.binarySearch(f77882, jCharAt2) >= 0 && C20831.m47049(str) == null) {
                        throw new C16702("autoType is not support. ".concat(str));
                    }
                }
                Class clsM47049 = C20831.m47049(str);
                if (clsM47049 != null) {
                    return clsM47049;
                }
                Class clsM13835 = this.f77884.m13835(str);
                if (clsM13835 != null) {
                    return clsM13835;
                }
                Class<?> clsM47054 = C20831.m47054(str);
                if (clsM47054 != null && cls != null && clsM47054 != HashMap.class) {
                    if (cls.isAssignableFrom(clsM47054)) {
                        C20831.m47035(clsM47054, str);
                        return clsM47054;
                    }
                    StringBuilder sbM11879 = C5410.m11879("type not match. ", str, " -> ");
                    sbM11879.append(cls.getName());
                    throw new C16702(sbM11879.toString());
                }
                if (clsM47054.isAnnotationPresent(InterfaceC14021.class)) {
                    C20831.m47035(clsM47054, str);
                    return clsM47054;
                }
                int i3 = EnumC15361.SupportAutoType.f43892;
                if ((i & i3) == 0 && (i3 & AbstractC7316.f19153) == 0) {
                    throw new C16702("autoType is not support : ".concat(str));
                }
                C20831.m47035(clsM47054, str);
                return clsM47054;
            }
        }
        throw new C16702("autoType is not support. ".concat(str));
    }
}
