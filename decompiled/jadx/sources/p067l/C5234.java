package p067l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۗۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5234 {

    /* JADX INFO: renamed from: a */
    public final C8349 f12334a;

    /* JADX INFO: renamed from: b */
    public boolean f12335b = true;

    /* JADX INFO: renamed from: c */
    public boolean f12336c = true;

    /* JADX INFO: renamed from: d */
    public final ArrayList f12337d;

    /* JADX INFO: renamed from: e */
    public ArrayList f12338e;

    public C5234(C8349 c8349) {
        ArrayList arrayList = new ArrayList();
        this.f12337d = arrayList;
        this.f12338e = null;
        this.f12334a = c8349;
        arrayList.add(new C17974());
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11287a(char c, char c2) {
        if (this.f12335b) {
            return c == c2;
        }
        return m11286b(c, c2);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11292g(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 <= charSequence.length() && i2 + i3 <= charSequence2.length()) {
            if (this.f12335b) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (charSequence.charAt(i + i4) == charSequence2.charAt(i2 + i4)) {
                    }
                }
                return true;
            }
            for (int i5 = 0; i5 < i3; i5++) {
                char cCharAt = charSequence.charAt(i + i5);
                char cCharAt2 = charSequence2.charAt(i2 + i5);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11286b(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    /* JADX INFO: renamed from: c */
    public final C17974 m11288c() {
        ArrayList arrayList = this.f12337d;
        return (C17974) arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: d */
    public final Long m11289d(EnumC19947 enumC19947) {
        return (Long) ((HashMap) m11288c().f53681a).get(enumC19947);
    }

    /* JADX INFO: renamed from: f */
    public final int m11291f(InterfaceC11901 interfaceC11901, long j, int i, int i2) {
        C12826.requireNonNull(interfaceC11901, "field");
        Long l2 = (Long) ((HashMap) m11288c().f53681a).put(interfaceC11901, Long.valueOf(j));
        return (l2 == null || l2.longValue() == j) ? i2 : ~i;
    }

    /* JADX INFO: renamed from: e */
    public final void m11290e(AbstractC7739 abstractC7739) {
        C12826.requireNonNull(abstractC7739, "zone");
        m11288c().f53682b = abstractC7739;
    }

    public final String toString() {
        return m11288c().toString();
    }
}
