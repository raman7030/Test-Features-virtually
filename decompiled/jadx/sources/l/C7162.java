package l;

import com.alipay.sdk.m.y.q;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.۟֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TAVX */
/* JADX INFO: loaded from: classes3.dex */
public final class C7162 implements InterfaceC16602, InterfaceC19157 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C7162 f21961 = new C7162();

    @Override // l.InterfaceC16602
    /* JADX INFO: renamed from: ֫ */
    public final void mo3046(C5751 c5751, Object obj, Object obj2, Type type) {
        C6725 c6725 = c5751.f17696;
        if (obj == null) {
            if (type == Character.TYPE || type == Character.class) {
                c5751.m16189("");
                return;
            } else if ((c6725.f20878 & EnumC20837.WriteNullListAsEmpty.f67472) != 0 && Enumeration.class.isAssignableFrom(C19426.m44730(type))) {
                c6725.write("[]");
                return;
            } else {
                c6725.m18296();
                return;
            }
        }
        if (obj instanceof Pattern) {
            c5751.m16189(((Pattern) obj).pattern());
            return;
        }
        if (obj instanceof TimeZone) {
            c5751.m16189(((TimeZone) obj).getID());
            return;
        }
        if (obj instanceof Currency) {
            c5751.m16189(((Currency) obj).getCurrencyCode());
            return;
        }
        if (obj instanceof Class) {
            c5751.m16189(((Class) obj).getName());
            return;
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            if (ch.charValue() == 0) {
                c5751.m16189(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                return;
            } else {
                c5751.m16189(ch.toString());
                return;
            }
        }
        int i = 0;
        if (obj instanceof SimpleDateFormat) {
            String pattern = ((SimpleDateFormat) obj).toPattern();
            if ((c6725.f20878 & EnumC20837.WriteClassName.f67472) != 0 && obj.getClass() != type) {
                c6725.write(123);
                c6725.m18299("@type", false);
                c5751.m16189(obj.getClass().getName());
                c6725.write(44);
                c6725.m18299("val", false);
                c6725.m18297(pattern);
                c6725.write(q.h);
                return;
            }
            c6725.m18297(pattern);
            return;
        }
        if (obj instanceof InterfaceC22139) {
            ((InterfaceC22139) obj).mo14986(c6725);
            return;
        }
        if (obj instanceof InterfaceC8028) {
            c6725.write(((InterfaceC8028) obj).mo14987());
            return;
        }
        if (obj instanceof InterfaceC9985) {
            ((InterfaceC9985) obj).m25148();
            return;
        }
        if (obj instanceof Enumeration) {
            Type type2 = ((c6725.f20878 & EnumC20837.WriteClassName.f67472) == 0 || !(type instanceof ParameterizedType)) ? null : ((ParameterizedType) type).getActualTypeArguments()[0];
            Enumeration enumeration = (Enumeration) obj;
            C14485 c14485 = c5751.f17704;
            c5751.m16190(c14485, obj, obj2);
            try {
                c6725.write(91);
                while (enumeration.hasMoreElements()) {
                    Object objNextElement = enumeration.nextElement();
                    int i2 = i + 1;
                    if (i != 0) {
                        c6725.write(44);
                    }
                    if (objNextElement == null) {
                        c6725.m18296();
                    } else {
                        c5751.f17702.m52187(objNextElement.getClass()).mo3046(c5751, objNextElement, Integer.valueOf(i), type2);
                    }
                    i = i2;
                }
                c6725.write(93);
                return;
            } finally {
                c5751.f17704 = c14485;
            }
        }
        c5751.m16189(obj.toString());
    }

    @Override // l.InterfaceC19157
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5204(C11556 c11556, Type type, Object obj) {
        Object objM28434;
        C7322 c7322 = c11556.f34488;
        String strM19634 = null;
        if (type == StackTraceElement.class) {
            if (c7322.m19646() == 8) {
                c7322.m19638();
                return null;
            }
            if (c7322.m19646() != 12 && c7322.m19646() != 16) {
                throw new C15082("syntax error: ".concat(C19993.m46101(c7322.m19646())));
            }
            int iM19651 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                String strM19618 = c7322.m19618(c11556.f34493);
                if (strM19618 == null) {
                    if (c7322.m19646() == 13) {
                        c7322.m19641(16);
                        break;
                    }
                    if (c7322.m19646() == 16) {
                        continue;
                    }
                }
                c7322.m19635();
                if ("className".equals(strM19618)) {
                    if (c7322.m19646() != 8) {
                        if (c7322.m19646() != 4) {
                            throw new C15082("syntax error");
                        }
                        strM19634 = c7322.m19634();
                    }
                    str = strM19634;
                } else if ("methodName".equals(strM19618)) {
                    if (c7322.m19646() != 8) {
                        if (c7322.m19646() != 4) {
                            throw new C15082("syntax error");
                        }
                        strM19634 = c7322.m19634();
                    }
                    str2 = strM19634;
                } else if ("fileName".equals(strM19618)) {
                    if (c7322.m19646() != 8) {
                        if (c7322.m19646() != 4) {
                            throw new C15082("syntax error");
                        }
                        strM19634 = c7322.m19634();
                    }
                    str3 = strM19634;
                } else if ("lineNumber".equals(strM19618)) {
                    if (c7322.m19646() == 8) {
                        iM19651 = 0;
                    } else {
                        if (c7322.m19646() != 2) {
                            throw new C15082("syntax error");
                        }
                        iM19651 = c7322.m19651();
                    }
                } else if ("nativeMethod".equals(strM19618)) {
                    if (c7322.m19646() != 8 && c7322.m19646() != 6 && c7322.m19646() != 7) {
                        throw new C15082("syntax error");
                    }
                    c7322.m19641(16);
                } else {
                    if (strM19618 != "@type") {
                        throw new C15082(C20094.m46315("syntax error : ", strM19618));
                    }
                    if (c7322.m19646() == 4) {
                        String strM19635 = c7322.m19634();
                        if (!strM19635.equals("java.lang.StackTraceElement")) {
                            throw new C15082("syntax error : ".concat(strM19635));
                        }
                    } else if (c7322.m19646() != 8) {
                        throw new C15082("syntax error");
                    }
                }
                if (c7322.m19646() == 13) {
                    c7322.m19641(16);
                    break;
                }
                strM19634 = null;
            }
            return new StackTraceElement(str, str2, str3, iM19651);
        }
        if (c11556.f34490 == 2) {
            c11556.f34490 = 0;
            c11556.m28438(16);
            if (c7322.m19646() != 4) {
                throw new C15082("syntax error");
            }
            if (!"val".equals(c7322.m19634())) {
                throw new C15082("syntax error");
            }
            c7322.m19638();
            c11556.m28438(17);
            objM28434 = c11556.m28434((Object) null);
            c11556.m28438(13);
        } else {
            objM28434 = c11556.m28434((Object) null);
        }
        if (objM28434 == null) {
            return null;
        }
        if (!(objM28434 instanceof String)) {
            if (objM28434 instanceof C21434) {
                C21434 c21434 = (C21434) objM28434;
                if (type == Currency.class) {
                    String strM48553 = c21434.m48553("currency");
                    if (strM48553 != null) {
                        return Currency.getInstance(strM48553);
                    }
                    String strM48554 = c21434.m48553("currencyCode");
                    if (strM48554 != null) {
                        return Currency.getInstance(strM48554);
                    }
                }
                if (type == Map.Entry.class) {
                    return c21434.entrySet().iterator().next();
                }
            }
            throw new C15082("except string value");
        }
        String str4 = (String) objM28434;
        if (str4.length() == 0) {
            return null;
        }
        if (type == UUID.class) {
            return UUID.fromString(str4);
        }
        if (type == Class.class) {
            c11556.f34495.getClass();
            return C19426.m44760(str4);
        }
        if (type == Locale.class) {
            String[] strArrSplit = str4.split("_");
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
            return strArrSplit.length == 2 ? new Locale(strArrSplit[0], strArrSplit[1]) : new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        }
        if (type == URI.class) {
            return URI.create(str4);
        }
        if (type == URL.class) {
            try {
                return new URL(str4);
            } catch (MalformedURLException e) {
                throw new C15082("create url error", (Throwable) e);
            }
        }
        if (type == Pattern.class) {
            return Pattern.compile(str4);
        }
        if (type == Charset.class) {
            return Charset.forName(str4);
        }
        if (type == Currency.class) {
            return Currency.getInstance(str4);
        }
        if (type == SimpleDateFormat.class) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str4, c7322.f22492);
            simpleDateFormat.setTimeZone(c7322.f22485);
            return simpleDateFormat;
        }
        if (type != Character.TYPE && type != Character.class) {
            if (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName())) {
                return C3261.getTimeZone(str4);
            }
            try {
                return Class.forName("android.net.Uri").getMethod("parse", String.class).invoke(null, str4);
            } catch (Exception e2) {
                throw new C15082("parse android.net.Uri error.", (Throwable) e2);
            }
        }
        int i = C19426.f62834;
        if (str4.length() == 0) {
            return null;
        }
        if (str4.length() == 1) {
            return Character.valueOf(str4.charAt(0));
        }
        throw new C15082("can not cast to byte, value : " + ((Object) str4));
    }
}
