package p067l;

import com.alipay.sdk.p010m.p058y.C0254q;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: l.᩶֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EAUD */
/* JADX INFO: loaded from: classes5.dex */
public final class C21246 implements InterfaceC18147, InterfaceC20575 {

    /* JADX INFO: renamed from: ֫ */
    public static final C21246 f66779 = new C21246();

    @Override // p067l.InterfaceC18147
    /* JADX INFO: renamed from: ֫ */
    public final void mo5359(C7834 c7834, Object obj, Object obj2, Type type) throws IOException {
        Date time;
        char[] charArray;
        C8760 c8760 = c7834.f20541;
        TimeZone timeZone = c7834.f20546;
        Locale locale = c7834.f20545;
        if (obj == null) {
            c8760.m20244();
            return;
        }
        if ((c8760.f23752 & EnumC22172.WriteClassName.f70155) != 0 && obj.getClass() != type) {
            if (obj.getClass() == Date.class) {
                c8760.write("new Date(");
                c8760.m20249(((Date) obj).getTime());
                c8760.write(41);
                return;
            }
            c8760.write(123);
            c8760.m20247("@type", false);
            c7834.m18108(obj.getClass().getName());
            c8760.write(44);
            c8760.m20247("val", false);
            c8760.m20249(((Date) obj).getTime());
            c8760.write(C0254q.f1218h);
            return;
        }
        if (obj instanceof Calendar) {
            time = ((Calendar) obj).getTime();
        } else {
            time = (Date) obj;
        }
        if ((c8760.f23752 & EnumC22172.WriteDateUseDateFormat.f70155) != 0) {
            DateFormat dateFormatM18110 = c7834.m18110();
            if (dateFormatM18110 == null) {
                dateFormatM18110 = new SimpleDateFormat(AbstractC7316.f19151, locale);
                dateFormatM18110.setTimeZone(timeZone);
            }
            c8760.m20245(dateFormatM18110.format(time));
            return;
        }
        long time2 = time.getTime();
        int i = c8760.f23752;
        if ((EnumC22172.UseISO8601DateFormat.f70155 & i) != 0) {
            EnumC22172 enumC22172 = EnumC22172.UseSingleQuotes;
            if ((i & enumC22172.f70155) != 0) {
                c8760.write(39);
            } else {
                c8760.write(34);
            }
            Calendar calendar = Calendar.getInstance(timeZone, locale);
            calendar.setTimeInMillis(time2);
            int i2 = calendar.get(1);
            int i3 = calendar.get(2) + 1;
            int i4 = calendar.get(5);
            int i5 = calendar.get(11);
            int i6 = calendar.get(12);
            int i7 = calendar.get(13);
            int i8 = calendar.get(14);
            if (i8 != 0) {
                charArray = "0000-00-00T00:00:00.000".toCharArray();
                C8760.m20243(i8, 23, charArray);
                C8760.m20243(i7, 19, charArray);
                C8760.m20243(i6, 16, charArray);
                C8760.m20243(i5, 13, charArray);
                C8760.m20243(i4, 10, charArray);
                C8760.m20243(i3, 7, charArray);
                C8760.m20243(i2, 4, charArray);
            } else if (i7 == 0 && i6 == 0 && i5 == 0) {
                charArray = "0000-00-00".toCharArray();
                C8760.m20243(i4, 10, charArray);
                C8760.m20243(i3, 7, charArray);
                C8760.m20243(i2, 4, charArray);
            } else {
                charArray = "0000-00-00T00:00:00".toCharArray();
                C8760.m20243(i7, 19, charArray);
                C8760.m20243(i6, 16, charArray);
                C8760.m20243(i5, 13, charArray);
                C8760.m20243(i4, 10, charArray);
                C8760.m20243(i3, 7, charArray);
                C8760.m20243(i2, 4, charArray);
            }
            c8760.write(charArray);
            if ((c8760.f23752 & enumC22172.f70155) != 0) {
                c8760.write(39);
                return;
            } else {
                c8760.write(34);
                return;
            }
        }
        c8760.m20249(time2);
    }

    @Override // p067l.InterfaceC20575
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7431(C13351 c13351, Type type, Object obj) {
        return m47997(c13351, type, (String) null);
    }

    /* JADX WARN: Code duplicated, block: B:88:0x017f  */
    /* JADX INFO: renamed from: ֫ */
    public static Object m47997(C13351 c13351, Type type, String str) {
        Object objM30480;
        String strM21602;
        Object time;
        Object obj;
        Date date;
        Calendar time2;
        Long lValueOf;
        C9327 c9327 = c13351.f37485;
        int iM21614 = c9327.m21614();
        int i = c9327.f25386;
        if (iM21614 == 2) {
            lValueOf = Long.valueOf(c9327.m21600());
            c9327.m21609(16);
        } else if (iM21614 == 4) {
            strM21602 = c9327.m21602();
            c9327.m21609(16);
            if ((i & EnumC15361.AllowISO8601DateFormat.f43892) != 0) {
                C9327 c9328 = new C9327(strM21602);
                if (c9328.m21611(true)) {
                    Calendar calendar = c9328.f25385;
                    if (type == Calendar.class) {
                        objM30480 = strM21602;
                        time = strM21602;
                        c9328.m21608();
                        return calendar;
                    }
                    objM30480 = strM21602;
                    time = strM21602;
                    time = calendar.getTime();
                }
                objM30480 = strM21602;
                time = strM21602;
                c9328.m21608();
                objM30480 = time;
            }
        } else if (iM21614 == 8) {
            c9327.m21606();
            objM30480 = null;
        } else if (iM21614 == 12) {
            c9327.m21606();
            if (c9327.m21614() != 4) {
                throw new C16702("syntax error");
            }
            if ("@type".equals(c9327.m21602())) {
                c9327.m21606();
                c13351.m30484(17);
                Class clsM54233 = c13351.f37492.m54233(c9327.m21602(), i, null);
                if (clsM54233 != null) {
                    type = clsM54233;
                }
                c13351.m30484(4);
                c13351.m30484(16);
            }
            c9327.m21603();
            int iM21615 = c9327.m21614();
            if (iM21615 != 2) {
                throw new C16702("syntax error : ".concat(C21370.m48416(iM21615)));
            }
            long jM21600 = c9327.m21600();
            c9327.m21606();
            Long lValueOf2 = Long.valueOf(jM21600);
            c13351.m30484(13);
            objM30480 = lValueOf2;
        } else if (c13351.f37487 == 2) {
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
            Object objM30481 = c13351.m30480((Object) null);
            c13351.m30484(13);
            objM30480 = objM30481;
        } else {
            objM30480 = c13351.m30480((Object) null);
        }
        if (objM30480 == null) {
            objM30480 = lValueOf;
            obj = objM30480;
            objM30480 = lValueOf;
            obj = null;
        } else if (!(objM30480 instanceof Date)) {
            if (objM30480 instanceof BigDecimal) {
                objM30480 = lValueOf;
                obj = objM30480;
                date = new Date(((BigDecimal) objM30480).longValueExact());
            } else if (objM30480 instanceof Number) {
                objM30480 = lValueOf;
                obj = objM30480;
                date = new Date(((Number) objM30480).longValue());
            } else {
                if (!(objM30480 instanceof String)) {
                    objM30480 = lValueOf;
                    obj = objM30480;
                    throw new C16702("parse error");
                }
                String str2 = (String) objM30480;
                if (str2.length() == 0) {
                    objM30480 = lValueOf;
                    obj = objM30480;
                    objM30480 = lValueOf;
                    obj = null;
                } else {
                    objM30480 = lValueOf;
                    obj = objM30480;
                    C9327 c9329 = new C9327(str2);
                    try {
                        if (c9329.m21611(false)) {
                            Calendar calendar2 = c9329.f25385;
                            if (type != Calendar.class) {
                                time2 = calendar2;
                                time2 = calendar2.getTime();
                            }
                            time2 = calendar2;
                            obj = time2;
                            c9329.m21608();
                        } else {
                            c9329.m21608();
                            if ("0000-00-00".equals(str2) || "0000-00-00T00:00:00".equalsIgnoreCase(str2) || "0001-01-01T00:00:00+08:00".equalsIgnoreCase(str2)) {
                                objM30480 = lValueOf;
                                obj = objM30480;
                                objM30480 = lValueOf;
                                obj = null;
                            } else {
                                try {
                                    obj = (str != null ? new SimpleDateFormat(str) : c13351.m30482()).parse(str2);
                                } catch (ParseException unused) {
                                    date = new Date(Long.parseLong(str2));
                                    obj = date;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        c9329.m21608();
                        throw th;
                    }
                }
            }
            obj = date;
        }
        if (type != Calendar.class || (obj instanceof Calendar)) {
            return obj;
        }
        Date date2 = (Date) obj;
        if (date2 == null) {
            return null;
        }
        Calendar calendar3 = Calendar.getInstance(c9327.f25376, c9327.f25383);
        calendar3.setTime(date2);
        return calendar3;
    }
}
