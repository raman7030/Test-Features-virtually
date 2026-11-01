package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
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
public final class C9175 implements InterfaceC18147, InterfaceC20575 {

    /* JADX INFO: renamed from: ֫ */
    public static final C9175 f24840 = new C9175();

    @Override // p067l.InterfaceC18147
    /* JADX INFO: renamed from: ֫ */
    public final void mo5359(C7834 c7834, Object obj, Object obj2, Type type) {
        C8760 c8760 = c7834.f20541;
        if (obj == null) {
            if (type == Character.TYPE || type == Character.class) {
                c7834.m18108("");
                return;
            } else if ((c8760.f23752 & EnumC22172.WriteNullListAsEmpty.f70155) != 0 && Enumeration.class.isAssignableFrom(C20831.m47024(type))) {
                c8760.write("[]");
                return;
            } else {
                c8760.m20244();
                return;
            }
        }
        if (obj instanceof Pattern) {
            c7834.m18108(((Pattern) obj).pattern());
            return;
        }
        if (obj instanceof TimeZone) {
            c7834.m18108(((TimeZone) obj).getID());
            return;
        }
        if (obj instanceof Currency) {
            c7834.m18108(((Currency) obj).getCurrencyCode());
            return;
        }
        if (obj instanceof Class) {
            c7834.m18108(((Class) obj).getName());
            return;
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            if (ch.charValue() == 0) {
                c7834.m18108(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                return;
            } else {
                c7834.m18108(ch.toString());
                return;
            }
        }
        int i = 0;
        if (obj instanceof SimpleDateFormat) {
            String pattern = ((SimpleDateFormat) obj).toPattern();
            if ((c8760.f23752 & EnumC22172.WriteClassName.f70155) != 0 && obj.getClass() != type) {
                c8760.write(123);
                c8760.m20247("@type", false);
                c7834.m18108(obj.getClass().getName());
                c8760.write(44);
                c8760.m20247("val", false);
                c8760.m20245(pattern);
                c8760.write(C0254q.f1218h);
                return;
            }
            c8760.m20245(pattern);
            return;
        }
        if (obj instanceof InterfaceC23409) {
            ((InterfaceC23409) obj).mo16896(c8760);
            return;
        }
        if (obj instanceof InterfaceC9998) {
            c8760.write(((InterfaceC9998) obj).mo16897());
            return;
        }
        if (obj instanceof InterfaceC11858) {
            ((InterfaceC11858) obj).m27165();
            return;
        }
        if (obj instanceof Enumeration) {
            Type type2 = ((c8760.f23752 & EnumC22172.WriteClassName.f70155) == 0 || !(type instanceof ParameterizedType)) ? null : ((ParameterizedType) type).getActualTypeArguments()[0];
            Enumeration enumeration = (Enumeration) obj;
            C16135 c16135 = c7834.f20549;
            c7834.m18109(c16135, obj, obj2);
            try {
                c8760.write(91);
                while (enumeration.hasMoreElements()) {
                    Object objNextElement = enumeration.nextElement();
                    int i2 = i + 1;
                    if (i != 0) {
                        c8760.write(44);
                    }
                    if (objNextElement == null) {
                        c8760.m20244();
                    } else {
                        c7834.f20547.m54590(objNextElement.getClass()).mo5359(c7834, objNextElement, Integer.valueOf(i), type2);
                    }
                    i = i2;
                }
                c8760.write(93);
                return;
            } finally {
                c7834.f20549 = c16135;
            }
        }
        c7834.m18108(obj.toString());
    }

    @Override // p067l.InterfaceC20575
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7431(C13351 c13351, Type type, Object obj) {
        Object objM30480;
        C9327 c9327 = c13351.f37485;
        String strM21602 = null;
        if (type == StackTraceElement.class) {
            if (c9327.m21614() == 8) {
                c9327.m21606();
                return null;
            }
            if (c9327.m21614() != 12 && c9327.m21614() != 16) {
                throw new C16702("syntax error: ".concat(C21370.m48416(c9327.m21614())));
            }
            int iM21619 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                String strM21586 = c9327.m21586(c13351.f37490);
                if (strM21586 == null) {
                    if (c9327.m21614() == 13) {
                        c9327.m21609(16);
                        break;
                    }
                    if (c9327.m21614() == 16) {
                        continue;
                    }
                }
                c9327.m21603();
                if ("className".equals(strM21586)) {
                    if (c9327.m21614() != 8) {
                        if (c9327.m21614() != 4) {
                            throw new C16702("syntax error");
                        }
                        strM21602 = c9327.m21602();
                    }
                    str = strM21602;
                } else if ("methodName".equals(strM21586)) {
                    if (c9327.m21614() != 8) {
                        if (c9327.m21614() != 4) {
                            throw new C16702("syntax error");
                        }
                        strM21602 = c9327.m21602();
                    }
                    str2 = strM21602;
                } else if ("fileName".equals(strM21586)) {
                    if (c9327.m21614() != 8) {
                        if (c9327.m21614() != 4) {
                            throw new C16702("syntax error");
                        }
                        strM21602 = c9327.m21602();
                    }
                    str3 = strM21602;
                } else if ("lineNumber".equals(strM21586)) {
                    if (c9327.m21614() == 8) {
                        iM21619 = 0;
                    } else {
                        if (c9327.m21614() != 2) {
                            throw new C16702("syntax error");
                        }
                        iM21619 = c9327.m21619();
                    }
                } else if ("nativeMethod".equals(strM21586)) {
                    if (c9327.m21614() != 8 && c9327.m21614() != 6 && c9327.m21614() != 7) {
                        throw new C16702("syntax error");
                    }
                    c9327.m21609(16);
                } else {
                    if (strM21586 != "@type") {
                        throw new C16702(C21466.m48631("syntax error : ", strM21586));
                    }
                    if (c9327.m21614() == 4) {
                        String strM21603 = c9327.m21602();
                        if (!strM21603.equals("java.lang.StackTraceElement")) {
                            throw new C16702("syntax error : ".concat(strM21603));
                        }
                    } else if (c9327.m21614() != 8) {
                        throw new C16702("syntax error");
                    }
                }
                if (c9327.m21614() == 13) {
                    c9327.m21609(16);
                    break;
                }
                strM21602 = null;
            }
            return new StackTraceElement(str, str2, str3, iM21619);
        }
        if (c13351.f37487 == 2) {
            c13351.f37487 = 0;
            c13351.m30484(16);
            if (c9327.m21614() != 4) {
                throw new C16702("syntax error");
            }
            if (!"val".equals(c9327.m21602())) {
                throw new C16702("syntax error");
            }
            c9327.m21606();
            c13351.m30484(17);
            objM30480 = c13351.m30480((Object) null);
            c13351.m30484(13);
        } else {
            objM30480 = c13351.m30480((Object) null);
        }
        if (objM30480 == null) {
            return null;
        }
        if (!(objM30480 instanceof String)) {
            if (objM30480 instanceof C22739) {
                C22739 c22739 = (C22739) objM30480;
                if (type == Currency.class) {
                    String strM50890 = c22739.m50890("currency");
                    if (strM50890 != null) {
                        return Currency.getInstance(strM50890);
                    }
                    String strM50891 = c22739.m50890("currencyCode");
                    if (strM50891 != null) {
                        return Currency.getInstance(strM50891);
                    }
                }
                if (type == Map.Entry.class) {
                    return c22739.entrySet().iterator().next();
                }
            }
            throw new C16702("except string value");
        }
        String str4 = (String) objM30480;
        if (str4.length() == 0) {
            return null;
        }
        if (type == UUID.class) {
            return UUID.fromString(str4);
        }
        if (type == Class.class) {
            c13351.f37492.getClass();
            return C20831.m47054(str4);
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
                throw new C16702("create url error", (Throwable) e);
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
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str4, c9327.f25383);
            simpleDateFormat.setTimeZone(c9327.f25376);
            return simpleDateFormat;
        }
        if (type != Character.TYPE && type != Character.class) {
            if (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName())) {
                return C5468.getTimeZone(str4);
            }
            try {
                return Class.forName("android.net.Uri").getMethod("parse", String.class).invoke(null, str4);
            } catch (Exception e2) {
                throw new C16702("parse android.net.Uri error.", (Throwable) e2);
            }
        }
        int i = C20831.f65447;
        if (str4.length() == 0) {
            return null;
        }
        if (str4.length() == 1) {
            return Character.valueOf(str4.charAt(0));
        }
        throw new C16702("can not cast to byte, value : " + ((Object) str4));
    }
}
