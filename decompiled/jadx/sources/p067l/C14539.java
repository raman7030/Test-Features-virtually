package p067l;

import java.lang.reflect.Member;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

/* JADX INFO: renamed from: l.۬֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AWK */
/* JADX INFO: loaded from: classes3.dex */
public final class C14539 implements Comparable {

    /* JADX INFO: renamed from: ۗ */
    public C5152 f41480;

    /* JADX INFO: renamed from: ۙ */
    public char[] f41481;

    /* JADX INFO: renamed from: ۬ */
    public final boolean f41482;

    /* JADX INFO: renamed from: ᩶ */
    public final String f41483;

    /* JADX INFO: renamed from: ᩸ */
    public final int f41484;

    /* JADX INFO: renamed from: ᩹ */
    public final C17476 f41485;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f41485.compareTo(((C14539) obj).f41485);
    }

    public C14539(C17476 c17476) {
        boolean z;
        this.f41485 = c17476;
        InterfaceC14691 interfaceC14691M39845 = c17476.m39845();
        String str = null;
        if (interfaceC14691M39845 != null) {
            z = false;
            for (EnumC22172 enumC22172 : interfaceC14691M39845.serialzeFeatures()) {
                if (enumC22172 == EnumC22172.WriteMapNullValue) {
                    z = true;
                }
            }
            String strTrim = interfaceC14691M39845.format().trim();
            str = strTrim.length() != 0 ? strTrim : null;
            this.f41484 = EnumC22172.m49980(interfaceC14691M39845.serialzeFeatures());
        } else {
            this.f41484 = 0;
            z = false;
        }
        this.f41482 = z;
        this.f41483 = str;
        String str2 = c17476.f52263;
        int length = str2.length();
        char[] cArr = new char[length + 3];
        this.f41481 = cArr;
        str2.getChars(0, str2.length(), cArr, 1);
        cArr[0] = '\"';
        cArr[length + 1] = '\"';
        cArr[length + 2] = ':';
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33200(C7834 c7834) {
        C8760 c8760 = c7834.f20541;
        int i = c8760.f23752;
        int i2 = EnumC22172.QuoteFieldNames.f70155 & i;
        C17476 c17476 = this.f41485;
        if (i2 != 0) {
            if ((i & EnumC22172.UseSingleQuotes.f70155) != 0) {
                c8760.m20247(c17476.f52263, true);
                return;
            } else {
                char[] cArr = this.f41481;
                c8760.write(cArr, 0, cArr.length);
                return;
            }
        }
        c8760.m20247(c17476.f52263, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m33199(Object obj) {
        C17476 c17476 = this.f41485;
        try {
            return c17476.f52255 ? c17476.f52264.get(obj) : c17476.f52267.invoke(obj, null);
        } catch (Exception e) {
            Member member = c17476.f52267;
            if (member == null) {
                member = c17476.f52264;
            }
            throw new C16702(C21466.m48631("get property error。 ", member.getDeclaringClass().getName() + "." + member.getName()), (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m33201(C7834 c7834, Object obj) {
        Class<?> cls;
        C24853 c24853 = c7834.f20547;
        C8760 c8760 = c7834.f20541;
        String str = this.f41483;
        if (str == null) {
            C5152 c5152 = this.f41480;
            C17476 c17476 = this.f41485;
            if (c5152 == null) {
                if (obj == null) {
                    cls = c17476.f52254;
                } else {
                    cls = obj.getClass();
                }
                InterfaceC18147 interfaceC18147M54590 = c24853.m54590(cls);
                C5152 c5153 = new C5152();
                c5153.f12111 = interfaceC18147M54590;
                c5153.f12112 = cls;
                this.f41480 = c5153;
            }
            C5152 c5154 = this.f41480;
            if (obj == null) {
                int i = EnumC22172.WriteNullNumberAsZero.f70155;
                int i2 = this.f41484;
                if ((i & i2) != 0 && Number.class.isAssignableFrom(c5154.f12112)) {
                    c8760.write(48);
                    return;
                }
                if ((EnumC22172.WriteNullBooleanAsFalse.f70155 & i2) != 0 && Boolean.class == c5154.f12112) {
                    c8760.write("false");
                    return;
                } else if ((EnumC22172.WriteNullListAsEmpty.f70155 & i2) != 0 && Collection.class.isAssignableFrom(c5154.f12112)) {
                    c8760.write("[]");
                    return;
                } else {
                    c5154.f12111.mo5359(c7834, null, c17476.f52263, c5154.f12112);
                    return;
                }
            }
            Class<?> cls2 = obj.getClass();
            if (cls2 == c5154.f12112) {
                c5154.f12111.mo5359(c7834, obj, c17476.f52263, c17476.f52261);
                return;
            } else {
                c24853.m54590(cls2).mo5359(c7834, obj, c17476.f52263, c17476.f52261);
                return;
            }
        }
        if (obj instanceof Date) {
            DateFormat dateFormatM18110 = c7834.m18110();
            if (dateFormatM18110 == null) {
                dateFormatM18110 = new SimpleDateFormat(str, c7834.f20545);
                dateFormatM18110.setTimeZone(c7834.f20546);
            }
            c8760.m20245(dateFormatM18110.format((Date) obj));
            return;
        }
        c7834.m18107(obj);
    }
}
