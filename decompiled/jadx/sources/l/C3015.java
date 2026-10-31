package l;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۗۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3015 {
    public final C6292 a;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList d;
    public ArrayList e;

    public C3015(C6292 c6292) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = null;
        this.a = c6292;
        arrayList.add(new C16420());
    }

    public final boolean a(char c, char c2) {
        if (this.b) {
            return c == c2;
        }
        return b(c, c2);
    }

    public final boolean g(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 <= charSequence.length() && i2 + i3 <= charSequence2.length()) {
            if (this.b) {
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

    public static boolean b(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    public final C16420 c() {
        ArrayList arrayList = this.d;
        return (C16420) arrayList.get(arrayList.size() - 1);
    }

    public final Long d(EnumC18496 enumC18496) {
        return (Long) ((HashMap) c().a).get(enumC18496);
    }

    public final int f(InterfaceC10030 interfaceC10030, long j, int i, int i2) {
        C11003.requireNonNull(interfaceC10030, "field");
        Long l2 = (Long) ((HashMap) c().a).put(interfaceC10030, Long.valueOf(j));
        return (l2 == null || l2.longValue() == j) ? i2 : ~i;
    }

    public final void e(AbstractC5650 abstractC5650) {
        C11003.requireNonNull(abstractC5650, "zone");
        c().b = abstractC5650;
    }

    public final String toString() {
        return c().toString();
    }
}
