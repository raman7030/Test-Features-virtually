package l;

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
public final class C23389 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static long[] f75136 = {-9164606388214699518L, -8720046426850100497L, -8649961213709896794L, -8165637398350707645L, -8109300701639721088L, -7966123100503199569L, -7921218830998286408L, -7775351613326101303L, -7768608037458185275L, -7766605818834748097L, -6835437086156813536L, -6316154655839304624L, -6179589609550493385L, -6025144546313590215L, -5939269048541779808L, -5885964883385605994L, -5764804792063216819L, -5472097725414717105L, -5194641081268104286L, -5076846148177416215L, -4837536971810737970L, -4703320437989596122L, -4608341446948126581L, -4537258998789938600L, -4438775680185074100L, -4314457471973557243L, -4150995715611818742L, -4082057040235125754L, -3975378478825053783L, -3935185854875733362L, -3319207949486691020L, -3077205613010077203L, -3053747177772160511L, -2995060141064716555L, -2825378362173150292L, -2533039401923731906L, -2439930098895578154L, -2378990704010641148L, -2364987994247679115L, -2262244760619952081L, -2192804397019347313L, -2095516571388852610L, -1872417015366588117L, -1650485814983027158L, -1589194880214235129L, -965955008570215305L, -905177026366752536L, -831789045734283466L, -582813228520337988L, -254670111376247151L, -219577392946377768L, -190281065685395680L, -26639035867733124L, -9822483067882491L, 4750336058574309L, 33238344207745342L, 156405680656087946L, 218512992947536312L, 313864100207897507L, 386461436234701831L, 823641066473609950L, 1073634739308289776L, 1153291637701043748L, 1203232727967308606L, 1214780596910349029L, 1459860845934817624L, 1502845958873959152L, 1534439610567445754L, 1698504441317515818L, 1818089308493370394L, 2078113382421334967L, 2164696723069287854L, 2622551729063269307L, 2653453629929770569L, 2660670623866180977L, 2731823439467737506L, 2836431254737891113L, 2930861374593775110L, 3085473968517218653L, 3089451460101527857L, 3114862868117605599L, 3129395579983849527L, 3256258368248066264L, 3452379460455804429L, 3547627781654598988L, 3637939656440441093L, 3688179072722109200L, 3718352661124136681L, 3730752432285826863L, 3794316665763266033L, 4000049462512838776L, 4046190361520671643L, 4147696707147271408L, 4193204392725694463L, 4241163808635564644L, 4254584350247334433L, 4814658433570175913L, 4841947709850912914L, 4904007817188630457L, 5100336081510080343L, 5274044858141538265L, 5347909877633654828L, 5450448828334921485L, 5474268165959054640L, 5545425291794704408L, 5596129856135573697L, 5688200883751798389L, 5751393439502795295L, 5944107969236155580L, 6007332606592876737L, 6280357960959217660L, 6456855723474196908L, 6511035576063254270L, 6534946468240507089L, 6584624952928234050L, 6734240326434096246L, 6742705432718011780L, 6854854816081053523L, 7045245923763966215L, 7123326897294507060L, 7179336928365889465L, 7240293012336844478L, 7347653049056829645L, 7375862386996623731L, 7442624256860549330L, 7617522210483516279L, 7658177784286215602L, 8055461369741094911L, 8389032537095247355L, 8409640769019589119L, 8488266005336625107L, 8537233257283452655L, 8838294710098435315L, 9140390920032557669L, 9140416208800006522L};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C23389 f75137 = new C23389();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3903 f75138;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9279 f75139;

    public C23389() {
        C3903 c3903 = new C3903();
        this.f75138 = c3903;
        this.f75139 = new C9279();
        C7162 c7162 = C7162.f21961;
        c3903.m11901(c7162, SimpleDateFormat.class);
        C19863 c19863 = C19863.f64142;
        c3903.m11901(c19863, Date.class);
        c3903.m11901(c19863, Calendar.class);
        C17039 c17039 = C17039.f52222;
        c3903.m11901(c17039, Map.class);
        c3903.m11901(c17039, HashMap.class);
        c3903.m11901(c17039, LinkedHashMap.class);
        c3903.m11901(c17039, TreeMap.class);
        c3903.m11901(c17039, ConcurrentMap.class);
        c3903.m11901(c17039, ConcurrentMapC10942.class);
        C21979 c21979 = C21979.f70383;
        c3903.m11901(c21979, Collection.class);
        c3903.m11901(c21979, List.class);
        c3903.m11901(c21979, ArrayList.class);
        C16333 c16333 = C16333.f50290;
        c3903.m11901(c16333, Object.class);
        c3903.m11901(C9548.f28964, String.class);
        c3903.m11901(c7162, Character.TYPE);
        c3903.m11901(c7162, Character.class);
        C10959 c10959 = C10959.f32992;
        c3903.m11901(c10959, Byte.TYPE);
        c3903.m11901(c10959, Byte.class);
        c3903.m11901(c10959, Short.TYPE);
        c3903.m11901(c10959, Short.class);
        C12101 c12101 = C12101.f36173;
        c3903.m11901(c12101, Integer.TYPE);
        c3903.m11901(c12101, Integer.class);
        c3903.m11901(c12101, Long.TYPE);
        c3903.m11901(c12101, Long.class);
        C14922 c14922 = C14922.f45499;
        c3903.m11901(c14922, BigInteger.class);
        c3903.m11901(c14922, BigDecimal.class);
        c3903.m11901(c10959, Float.TYPE);
        c3903.m11901(c10959, Float.class);
        c3903.m11901(c10959, Double.TYPE);
        c3903.m11901(c10959, Double.class);
        C21274 c21274 = C21274.f68621;
        c3903.m11901(c21274, Boolean.TYPE);
        c3903.m11901(c21274, Boolean.class);
        c3903.m11901(c7162, Class.class);
        C5045 c5045 = C5045.f15871;
        c3903.m11901(c5045, char[].class);
        c3903.m11901(c5045, Object[].class);
        c3903.m11901(c7162, UUID.class);
        c3903.m11901(c7162, TimeZone.class);
        c3903.m11901(c7162, Locale.class);
        c3903.m11901(c7162, Currency.class);
        c3903.m11901(c7162, URI.class);
        c3903.m11901(c7162, URL.class);
        c3903.m11901(c7162, Pattern.class);
        c3903.m11901(c7162, Charset.class);
        c3903.m11901(c10959, Number.class);
        c3903.m11901(c7162, StackTraceElement.class);
        c3903.m11901(c16333, Serializable.class);
        c3903.m11901(c16333, Cloneable.class);
        c3903.m11901(c16333, Comparable.class);
        c3903.m11901(c16333, Closeable.class);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19157 m51838(Type type) {
        InterfaceC19157 interfaceC19157 = (InterfaceC19157) this.f75138.m11900(type);
        if (interfaceC19157 != null) {
            return interfaceC19157;
        }
        if (type instanceof Class) {
            return m51837((Class) type, type);
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return m51837((Class) rawType, type);
            }
            return m51838(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return m51838(upperBounds[0]);
            }
        }
        return C16333.f50290;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19157 m51837(Class cls, Type type) {
        InterfaceC19157 c1517;
        InterfaceC12261 interfaceC12261;
        Class clsMappingTo;
        C3903 c3903 = this.f75138;
        InterfaceC19157 interfaceC19157 = (InterfaceC19157) c3903.m11900(type);
        if (interfaceC19157 != null) {
            return interfaceC19157;
        }
        if (type == null) {
            type = cls;
        }
        InterfaceC19157 interfaceC19158 = (InterfaceC19157) c3903.m11900(type);
        if (interfaceC19158 != null) {
            return interfaceC19158;
        }
        if (!m51835(cls) && (interfaceC12261 = (InterfaceC12261) cls.getAnnotation(InterfaceC12261.class)) != null && (clsMappingTo = interfaceC12261.mappingTo()) != Void.class) {
            return m51837(clsMappingTo, clsMappingTo);
        }
        if ((type instanceof WildcardType) || (type instanceof TypeVariable) || (type instanceof ParameterizedType)) {
            interfaceC19158 = (InterfaceC19157) c3903.m11900(cls);
        }
        if (interfaceC19158 != null) {
            return interfaceC19158;
        }
        InterfaceC19157 interfaceC19159 = (InterfaceC19157) c3903.m11900(type);
        if (interfaceC19159 != null) {
            return interfaceC19159;
        }
        if (cls.isEnum()) {
            c1517 = new C22844(cls);
        } else if (cls.isArray()) {
            c1517 = C5045.f15871;
        } else {
            C21979 c21979 = C21979.f70383;
            if (cls == Set.class || cls == HashSet.class || cls == Collection.class || cls == List.class || cls == ArrayList.class || Collection.class.isAssignableFrom(cls)) {
                c1517 = c21979;
            } else if (Map.class.isAssignableFrom(cls)) {
                c1517 = C17039.f52222;
            } else if (Throwable.class.isAssignableFrom(cls)) {
                c1517 = new C8573(this, cls, cls);
            } else if (cls.getName().equals("android.net.Uri")) {
                c1517 = C7162.f21961;
            } else {
                c1517 = new C1517(this, cls, type);
            }
        }
        c3903.m11901(c1517, type);
        return c1517;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51835(Class cls) {
        return cls.isPrimitive() || cls == Boolean.class || cls == Character.class || cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == String.class || cls == Date.class || cls == java.sql.Date.class || cls == Time.class || cls == Timestamp.class;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Class m51836(String str, int i, Class cls) {
        if (str == null) {
            return null;
        }
        if (str.length() < 128) {
            if (str.length() >= 3) {
                long jCharAt = (((long) str.charAt(0)) ^ (-3750763034362895579L)) * 1099511628211L;
                if (jCharAt == -5808493101479473382L) {
                    throw new C15082("autoType is not support. ".concat(str));
                }
                if ((jCharAt ^ ((long) C7416.m19937(1, str))) * 1099511628211L == 655701488918567152L) {
                    throw new C15082("autoType is not support. ".concat(str));
                }
                long jCharAt2 = (((((((long) str.charAt(0)) ^ (-3750763034362895579L)) * 1099511628211L) ^ ((long) str.charAt(1))) * 1099511628211L) ^ ((long) str.charAt(2))) * 1099511628211L;
                for (int i2 = 3; i2 < str.length(); i2++) {
                    jCharAt2 = (jCharAt2 ^ ((long) str.charAt(i2))) * 1099511628211L;
                    if (Arrays.binarySearch(f75136, jCharAt2) >= 0 && C19426.m44755(str) == null) {
                        throw new C15082("autoType is not support. ".concat(str));
                    }
                }
                Class clsM44755 = C19426.m44755(str);
                if (clsM44755 != null) {
                    return clsM44755;
                }
                Class clsM11899 = this.f75138.m11899(str);
                if (clsM11899 != null) {
                    return clsM11899;
                }
                Class<?> clsM44760 = C19426.m44760(str);
                if (clsM44760 != null && cls != null && clsM44760 != HashMap.class) {
                    if (cls.isAssignableFrom(clsM44760)) {
                        C19426.m44741(clsM44760, str);
                        return clsM44760;
                    }
                    StringBuilder sbM9834 = C3200.m9834("type not match. ", str, " -> ");
                    sbM9834.append(cls.getName());
                    throw new C15082(sbM9834.toString());
                }
                if (clsM44760.isAnnotationPresent(InterfaceC12261.class)) {
                    C19426.m44741(clsM44760, str);
                    return clsM44760;
                }
                int i3 = EnumC13671.SupportAutoType.f40811;
                if ((i & i3) == 0 && (i3 & AbstractC5206.f16312) == 0) {
                    throw new C15082("autoType is not support : ".concat(str));
                }
                C19426.m44741(clsM44760, str);
                return clsM44760;
            }
        }
        throw new C15082("autoType is not support. ".concat(str));
    }
}
