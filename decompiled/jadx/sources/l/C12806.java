package l;

import java.lang.reflect.Member;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

/* JADX INFO: renamed from: l.۬֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AWK */
/* JADX INFO: loaded from: classes3.dex */
public final class C12806 implements Comparable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C2929 f38438;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public char[] f38439;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f38440;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f38441;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f38442;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15896 f38443;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f38443.compareTo(((C12806) obj).f38443);
    }

    public C12806(C15896 c15896) {
        boolean z;
        this.f38443 = c15896;
        InterfaceC12966 interfaceC12966M37672 = c15896.m37672();
        String str = null;
        if (interfaceC12966M37672 != null) {
            z = false;
            for (EnumC20837 enumC20837 : interfaceC12966M37672.serialzeFeatures()) {
                if (enumC20837 == EnumC20837.WriteMapNullValue) {
                    z = true;
                }
            }
            String strTrim = interfaceC12966M37672.format().trim();
            str = strTrim.length() != 0 ? strTrim : null;
            this.f38442 = EnumC20837.m47652(interfaceC12966M37672.serialzeFeatures());
        } else {
            this.f38442 = 0;
            z = false;
        }
        this.f38440 = z;
        this.f38441 = str;
        String str2 = c15896.f49123;
        int length = str2.length();
        char[] cArr = new char[length + 3];
        this.f38439 = cArr;
        str2.getChars(0, str2.length(), cArr, 1);
        cArr[0] = '\"';
        cArr[length + 1] = '\"';
        cArr[length + 2] = ':';
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31115(C5751 c5751) {
        C6725 c6725 = c5751.f17696;
        int i = c6725.f20878;
        int i2 = EnumC20837.QuoteFieldNames.f67472 & i;
        C15896 c15896 = this.f38443;
        if (i2 != 0) {
            if ((i & EnumC20837.UseSingleQuotes.f67472) != 0) {
                c6725.m18299(c15896.f49123, true);
                return;
            } else {
                char[] cArr = this.f38439;
                c6725.write(cArr, 0, cArr.length);
                return;
            }
        }
        c6725.m18299(c15896.f49123, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m31114(Object obj) {
        C15896 c15896 = this.f38443;
        try {
            return c15896.f49115 ? c15896.f49124.get(obj) : c15896.f49127.invoke(obj, null);
        } catch (Exception e) {
            Member member = c15896.f49127;
            if (member == null) {
                member = c15896.f49124;
            }
            throw new C15082(C20094.m46315("get property error。 ", member.getDeclaringClass().getName() + "." + member.getName()), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31116(C5751 c5751, Object obj) {
        Class<?> cls;
        C23658 c23658 = c5751.f17702;
        C6725 c6725 = c5751.f17696;
        String str = this.f38441;
        if (str == null) {
            C2929 c2929 = this.f38438;
            C15896 c15896 = this.f38443;
            if (c2929 == null) {
                if (obj == null) {
                    cls = c15896.f49114;
                } else {
                    cls = obj.getClass();
                }
                InterfaceC16602 interfaceC16602M52187 = c23658.m52187(cls);
                C2929 c29210 = new C2929();
                c29210.f9312 = interfaceC16602M52187;
                c29210.f9313 = cls;
                this.f38438 = c29210;
            }
            C2929 c29211 = this.f38438;
            if (obj == null) {
                int i = EnumC20837.WriteNullNumberAsZero.f67472;
                int i2 = this.f38442;
                if ((i & i2) != 0 && Number.class.isAssignableFrom(c29211.f9313)) {
                    c6725.write(48);
                    return;
                }
                if ((EnumC20837.WriteNullBooleanAsFalse.f67472 & i2) != 0 && Boolean.class == c29211.f9313) {
                    c6725.write("false");
                    return;
                } else if ((EnumC20837.WriteNullListAsEmpty.f67472 & i2) != 0 && Collection.class.isAssignableFrom(c29211.f9313)) {
                    c6725.write("[]");
                    return;
                } else {
                    c29211.f9312.mo3046(c5751, null, c15896.f49123, c29211.f9313);
                    return;
                }
            }
            Class<?> cls2 = obj.getClass();
            if (cls2 == c29211.f9313) {
                c29211.f9312.mo3046(c5751, obj, c15896.f49123, c15896.f49121);
                return;
            } else {
                c23658.m52187(cls2).mo3046(c5751, obj, c15896.f49123, c15896.f49121);
                return;
            }
        }
        if (obj instanceof Date) {
            DateFormat dateFormatM16191 = c5751.m16191();
            if (dateFormatM16191 == null) {
                dateFormatM16191 = new SimpleDateFormat(str, c5751.f17700);
                dateFormatM16191.setTimeZone(c5751.f17701);
            }
            c6725.m18297(dateFormatM16191.format((Date) obj));
            return;
        }
        c5751.m16188(obj);
    }
}
