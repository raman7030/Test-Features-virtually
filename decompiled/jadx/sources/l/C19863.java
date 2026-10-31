package l;

import com.alipay.sdk.m.y.q;
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
public final class C19863 implements InterfaceC16602, InterfaceC19157 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C19863 f64142 = new C19863();

    @Override // l.InterfaceC16602
    /* JADX INFO: renamed from: ֫ */
    public final void mo3046(C5751 c5751, Object obj, Object obj2, Type type) throws IOException {
        Date time;
        char[] charArray;
        C6725 c6725 = c5751.f17696;
        TimeZone timeZone = c5751.f17701;
        Locale locale = c5751.f17700;
        if (obj == null) {
            c6725.m18296();
            return;
        }
        if ((c6725.f20878 & EnumC20837.WriteClassName.f67472) != 0 && obj.getClass() != type) {
            if (obj.getClass() == Date.class) {
                c6725.write("new Date(");
                c6725.m18301(((Date) obj).getTime());
                c6725.write(41);
                return;
            }
            c6725.write(123);
            c6725.m18299("@type", false);
            c5751.m16189(obj.getClass().getName());
            c6725.write(44);
            c6725.m18299("val", false);
            c6725.m18301(((Date) obj).getTime());
            c6725.write(q.h);
            return;
        }
        if (obj instanceof Calendar) {
            time = ((Calendar) obj).getTime();
        } else {
            time = (Date) obj;
        }
        if ((c6725.f20878 & EnumC20837.WriteDateUseDateFormat.f67472) != 0) {
            DateFormat dateFormatM16191 = c5751.m16191();
            if (dateFormatM16191 == null) {
                dateFormatM16191 = new SimpleDateFormat(AbstractC5206.f16310, locale);
                dateFormatM16191.setTimeZone(timeZone);
            }
            c6725.m18297(dateFormatM16191.format(time));
            return;
        }
        long time2 = time.getTime();
        int i = c6725.f20878;
        if ((EnumC20837.UseISO8601DateFormat.f67472 & i) != 0) {
            EnumC20837 enumC20837 = EnumC20837.UseSingleQuotes;
            if ((i & enumC20837.f67472) != 0) {
                c6725.write(39);
            } else {
                c6725.write(34);
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
                C6725.m18295(i8, 23, charArray);
                C6725.m18295(i7, 19, charArray);
                C6725.m18295(i6, 16, charArray);
                C6725.m18295(i5, 13, charArray);
                C6725.m18295(i4, 10, charArray);
                C6725.m18295(i3, 7, charArray);
                C6725.m18295(i2, 4, charArray);
            } else if (i7 == 0 && i6 == 0 && i5 == 0) {
                charArray = "0000-00-00".toCharArray();
                C6725.m18295(i4, 10, charArray);
                C6725.m18295(i3, 7, charArray);
                C6725.m18295(i2, 4, charArray);
            } else {
                charArray = "0000-00-00T00:00:00".toCharArray();
                C6725.m18295(i7, 19, charArray);
                C6725.m18295(i6, 16, charArray);
                C6725.m18295(i5, 13, charArray);
                C6725.m18295(i4, 10, charArray);
                C6725.m18295(i3, 7, charArray);
                C6725.m18295(i2, 4, charArray);
            }
            c6725.write(charArray);
            if ((c6725.f20878 & enumC20837.f67472) != 0) {
                c6725.write(39);
                return;
            } else {
                c6725.write(34);
                return;
            }
        }
        c6725.m18301(time2);
    }

    @Override // l.InterfaceC19157
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5204(C11556 c11556, Type type, Object obj) {
        return m45686(c11556, type, (String) null);
    }

    /* JADX WARN: Code duplicated, block: B:88:0x017f  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m45686(C11556 c11556, Type type, String str) {
        Object objM28434;
        String strM19634;
        Object time;
        Object obj;
        Date date;
        Calendar time2;
        Long lValueOf;
        C7322 c7322 = c11556.f34488;
        int iM19646 = c7322.m19646();
        int i = c7322.f22495;
        if (iM19646 == 2) {
            lValueOf = Long.valueOf(c7322.m19632());
            c7322.m19641(16);
        } else if (iM19646 == 4) {
            strM19634 = c7322.m19634();
            c7322.m19641(16);
            if ((i & EnumC13671.AllowISO8601DateFormat.f40811) != 0) {
                C7322 c7323 = new C7322(strM19634);
                if (c7323.m19643(true)) {
                    Calendar calendar = c7323.f22494;
                    if (type == Calendar.class) {
                        objM28434 = strM19634;
                        time = strM19634;
                        c7323.m19640();
                        return calendar;
                    }
                    objM28434 = strM19634;
                    time = strM19634;
                    time = calendar.getTime();
                }
                objM28434 = strM19634;
                time = strM19634;
                c7323.m19640();
                objM28434 = time;
            }
        } else if (iM19646 == 8) {
            c7322.m19638();
            objM28434 = null;
        } else if (iM19646 == 12) {
            c7322.m19638();
            if (c7322.m19646() != 4) {
                throw new C15082("syntax error");
            }
            if ("@type".equals(c7322.m19634())) {
                c7322.m19638();
                c11556.m28438(17);
                Class clsM51836 = c11556.f34495.m51836(c7322.m19634(), i, null);
                if (clsM51836 != null) {
                    type = clsM51836;
                }
                c11556.m28438(4);
                c11556.m28438(16);
            }
            c7322.m19635();
            int iM19647 = c7322.m19646();
            if (iM19647 != 2) {
                throw new C15082("syntax error : ".concat(C19993.m46101(iM19647)));
            }
            long jM19632 = c7322.m19632();
            c7322.m19638();
            Long lValueOf2 = Long.valueOf(jM19632);
            c11556.m28438(13);
            objM28434 = lValueOf2;
        } else if (c11556.f34490 == 2) {
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
            Object objM28435 = c11556.m28434((Object) null);
            c11556.m28438(13);
            objM28434 = objM28435;
        } else {
            objM28434 = c11556.m28434((Object) null);
        }
        if (objM28434 == null) {
            objM28434 = lValueOf;
            obj = objM28434;
            objM28434 = lValueOf;
            obj = null;
        } else if (!(objM28434 instanceof Date)) {
            if (objM28434 instanceof BigDecimal) {
                objM28434 = lValueOf;
                obj = objM28434;
                date = new Date(((BigDecimal) objM28434).longValueExact());
            } else if (objM28434 instanceof Number) {
                objM28434 = lValueOf;
                obj = objM28434;
                date = new Date(((Number) objM28434).longValue());
            } else {
                if (!(objM28434 instanceof String)) {
                    objM28434 = lValueOf;
                    obj = objM28434;
                    throw new C15082("parse error");
                }
                String str2 = (String) objM28434;
                if (str2.length() == 0) {
                    objM28434 = lValueOf;
                    obj = objM28434;
                    objM28434 = lValueOf;
                    obj = null;
                } else {
                    objM28434 = lValueOf;
                    obj = objM28434;
                    C7322 c7324 = new C7322(str2);
                    try {
                        if (c7324.m19643(false)) {
                            Calendar calendar2 = c7324.f22494;
                            if (type != Calendar.class) {
                                time2 = calendar2;
                                time2 = calendar2.getTime();
                            }
                            time2 = calendar2;
                            obj = time2;
                            c7324.m19640();
                        } else {
                            c7324.m19640();
                            if ("0000-00-00".equals(str2) || "0000-00-00T00:00:00".equalsIgnoreCase(str2) || "0001-01-01T00:00:00+08:00".equalsIgnoreCase(str2)) {
                                objM28434 = lValueOf;
                                obj = objM28434;
                                objM28434 = lValueOf;
                                obj = null;
                            } else {
                                try {
                                    obj = (str != null ? new SimpleDateFormat(str) : c11556.m28436()).parse(str2);
                                } catch (ParseException unused) {
                                    date = new Date(Long.parseLong(str2));
                                    obj = date;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        c7324.m19640();
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
        Calendar calendar3 = Calendar.getInstance(c7322.f22485, c7322.f22492);
        calendar3.setTime(date2);
        return calendar3;
    }
}
