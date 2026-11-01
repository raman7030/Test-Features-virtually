package p067l;

import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩹ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C23339 implements InterfaceC15962 {

    /* JADX INFO: renamed from: c */
    public static volatile Map.Entry f73426c;

    /* JADX INFO: renamed from: d */
    public static volatile Map.Entry f73427d;

    /* JADX INFO: renamed from: a */
    public final C10500 f73428a;

    /* JADX INFO: renamed from: b */
    public final String f73429b;

    /* JADX INFO: renamed from: a */
    public C2551 mo48335a(C5234 c5234) {
        Map.Entry simpleImmutableEntry;
        Set<String> set = C6139.f15402d;
        int size = set.size();
        Map.Entry entry = c5234.f12335b ? f73426c : f73427d;
        if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
            synchronized (this) {
                simpleImmutableEntry = c5234.f12335b ? f73426c : f73427d;
                if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                    Integer numValueOf = Integer.valueOf(size);
                    C2551 c2551 = c5234.f12335b ? new C2551("", null, null) : new C20658("", null, null);
                    for (String str : set) {
                        c2551.m3742a(str, str);
                    }
                    simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, c2551);
                    if (c5234.f12335b) {
                        f73426c = simpleImmutableEntry;
                    } else {
                        f73427d = simpleImmutableEntry;
                    }
                }
            }
            entry = simpleImmutableEntry;
        }
        return (C2551) entry.getValue();
    }

    public C23339(C10500 c10500, String str) {
        this.f73428a = c10500;
        this.f73429b = str;
    }

    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: l */
    public boolean mo9636l(C11940 c11940, StringBuilder sb) {
        AbstractC7739 abstractC7739 = (AbstractC7739) c11940.m27303b(this.f73428a);
        if (abstractC7739 == null) {
            return false;
        }
        sb.append(abstractC7739.mo17866k());
        return true;
    }

    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: m */
    public final int mo9637m(C5234 c5234, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            return m51982b(c5234, charSequence, i, i, C5905.f14561e);
        }
        int i3 = i + 2;
        if (length >= i3) {
            char cCharAt2 = charSequence.charAt(i + 1);
            if (c5234.m11287a(cCharAt, 'U') && c5234.m11287a(cCharAt2, 'T')) {
                int i4 = i + 3;
                if (length >= i4 && c5234.m11287a(charSequence.charAt(i3), 'C')) {
                    return m51982b(c5234, charSequence, i, i4, C5905.f14562f);
                }
                return m51982b(c5234, charSequence, i, i3, C5905.f14562f);
            }
            if (c5234.m11287a(cCharAt, 'G') && length >= (i2 = i + 3) && c5234.m11287a(cCharAt2, 'M') && c5234.m11287a(charSequence.charAt(i3), 'T')) {
                int i5 = i + 4;
                if (length >= i5 && c5234.m11287a(charSequence.charAt(i2), '0')) {
                    c5234.m11290e(AbstractC7739.m17861X("GMT0", true));
                    return i5;
                }
                return m51982b(c5234, charSequence, i, i2, C5905.f14562f);
            }
        }
        C2551 c2551Mo48335a = mo48335a(c5234);
        ParsePosition parsePosition = new ParsePosition(i);
        String strM3744c = c2551Mo48335a.m3744c(charSequence, parsePosition);
        if (strM3744c == null) {
            if (!c5234.m11287a(cCharAt, 'Z')) {
                return ~i;
            }
            c5234.m11290e(C19550.f59517f);
            return i + 1;
        }
        c5234.m11290e(AbstractC7739.m17861X(strM3744c, true));
        return parsePosition.getIndex();
    }

    /* JADX INFO: renamed from: b */
    public static int m51982b(C5234 c5234, CharSequence charSequence, int i, int i2, C5905 c5905) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            c5234.m11290e(AbstractC7739.m17861X(upperCase, true));
            return i2;
        }
        if (charSequence.charAt(i2) != '0' && !c5234.m11287a(charSequence.charAt(i2), 'Z')) {
            C5234 c5235 = new C5234(c5234.f12334a);
            c5235.f12335b = c5234.f12335b;
            c5235.f12336c = c5234.f12336c;
            int iMo9637m = c5905.mo9637m(c5235, charSequence, i2);
            try {
                if (iMo9637m < 0) {
                    if (c5905 == C5905.f14561e) {
                        return ~i;
                    }
                    c5234.m11290e(AbstractC7739.m17861X(upperCase, true));
                    return i2;
                }
                c5234.m11290e(AbstractC7739.m17862Y(upperCase, C19550.m44395e0((int) c5235.m11289d(EnumC19947.OFFSET_SECONDS).longValue())));
                return iMo9637m;
            } catch (C17796 unused) {
                return ~i;
            }
        }
        c5234.m11290e(AbstractC7739.m17861X(upperCase, true));
        return i2;
    }

    public final String toString() {
        return this.f73429b;
    }
}
