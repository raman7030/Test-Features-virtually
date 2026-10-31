package l;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12221 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29716(CharSequence charSequence, C3463 c3463, C19012 c19012) throws InterruptedException {
        try {
            C4460 c4460 = new C4460();
            c4460.m13206();
            if (charSequence.length() > 1048576) {
                throw m29712(EnumC19402.LIMIT, "Source length limit exceeded");
            }
            if (c19012.length() != 0) {
                throw new IllegalArgumentException("Output must be empty");
            }
            String strM28343 = C11516.m28343(charSequence, c4460);
            C19012 c19012M43853 = c19012.m43853();
            int i = 0;
            try {
                try {
                    m29715(charSequence, c3463, strM28343, c4460, c19012M43853);
                } catch (Throwable th) {
                    try {
                        c19012M43853.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (C0350 e) {
                if (e.f1759 != EnumC19402.SYNTAX) {
                    throw e;
                }
                c19012M43853.m43855(0);
                C15042.m35583(charSequence, c3463, strM28343, c4460, c19012M43853);
            }
            while (i < c19012M43853.length()) {
                c4460.m13206();
                int i2 = i + 4096;
                c19012.m43854(i, Math.min(c19012M43853.length(), i2), c19012M43853);
                i = i2;
            }
            c4460.m13206();
            c19012M43853.close();
        } catch (StackOverflowError unused) {
            throw m29712(EnumC19402.LIMIT, "Parser stack limit exceeded");
        } catch (C6701 unused2) {
            throw new InterruptedException("Code formatting cancelled");
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX WARN: Code duplicated, block: B:23:0x0080 A[LOOP:1: B:21:0x007c->B:23:0x0080, LOOP_END] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29715(CharSequence charSequence, C3463 c3463, String str, C4460 c4460, C19012 c19012) {
        int childCount;
        C12926 c12926M29717 = m29717(charSequence, c4460);
        new C11516(charSequence, c12926M29717.f38795, c12926M29717.f38794, c3463, str, c4460).m28346(c19012);
        try {
            C12926 c12926M29718 = m29717(c19012, c4460);
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque.push(c12926M29717.f38794);
            arrayDeque2.push(c12926M29718.f38794);
            while (!arrayDeque.isEmpty() && !arrayDeque2.isEmpty()) {
                c4460.m13206();
                InterfaceC16174 interfaceC16174 = (InterfaceC16174) arrayDeque.pop();
                InterfaceC16174 interfaceC16175 = (InterfaceC16174) arrayDeque2.pop();
                if (interfaceC16174.getChildCount() == interfaceC16175.getChildCount()) {
                    boolean z = interfaceC16174 instanceof C8931;
                    if (z) {
                        C8931 c8931 = (C8931) interfaceC16174;
                        if ((interfaceC16175 instanceof C8931) && c8931.mo1085() == ((C8931) interfaceC16175).mo1085()) {
                            if (!z || !(interfaceC16175 instanceof C8931)) {
                                childCount = interfaceC16174.getChildCount();
                                while (true) {
                                    childCount--;
                                    if (childCount >= 0) {
                                        arrayDeque.push(interfaceC16174.mo23040(childCount));
                                        arrayDeque2.push(interfaceC16175.mo23040(childCount));
                                    }
                                }
                            }
                        }
                    } else {
                        if (!z) {
                        }
                        childCount = interfaceC16174.getChildCount();
                        while (true) {
                            childCount--;
                            if (childCount >= 0) {
                                arrayDeque.push(interfaceC16174.mo23040(childCount));
                                arrayDeque2.push(interfaceC16175.mo23040(childCount));
                            }
                        }
                    }
                }
                throw m29712(EnumC19402.CHANGED, "Syntax structure changed during formatting");
            }
            if (!arrayDeque.isEmpty() || !arrayDeque2.isEmpty()) {
                throw m29712(EnumC19402.CHANGED, "Syntax length changed");
            }
            m29714(charSequence, c12926M29717.f38795, c19012, c12926M29718.f38795, c4460);
        } catch (C0350 e) {
            if (e.f1759 == EnumC19402.SYNTAX) {
                throw m29712(EnumC19402.CHANGED, "Formatted output could not be parsed");
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1875 m29713(CharSequence charSequence, C4460 c4460) {
        C1056 c1056 = new C1056(new C20813(new C3049(charSequence, c4460)));
        c1056.m43458();
        c1056.m43456(new C21394());
        C22099 c22099 = new C22099(c1056, c4460);
        c22099.m6206();
        if (c22099.m6213(c22099.size() - 1).getType() == -1) {
            return c22099;
        }
        throw m29712(EnumC19402.LIMIT, "Token count limit exceeded");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12926 m29717(CharSequence charSequence, C4460 c4460) {
        C1875 c1875M29713 = m29713(charSequence, c4460);
        C19983 c19983 = new C19983(c1875M29713, c4460);
        c19983.m43458();
        c19983.m43456(new C21394());
        return new C12926(c1875M29713.m6210(), c19983.m14818());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29714(CharSequence charSequence, List list, C19012 c19012, List list2, C4460 c4460) {
        Iterator it = list.iterator();
        InterfaceC0463 interfaceC0463 = null;
        InterfaceC0463 interfaceC0464 = null;
        int i = 0;
        while (it.hasNext()) {
            InterfaceC0463 interfaceC0465 = (InterfaceC0463) it.next();
            c4460.m13206();
            if (interfaceC0465.getType() != 65) {
                while (i < list2.size() && ((InterfaceC0463) list2.get(i)).getType() == 65) {
                    i++;
                }
                if (i == list2.size()) {
                    throw m29712(EnumC19402.CHANGED, "Token count changed");
                }
                int i2 = i + 1;
                InterfaceC0463 interfaceC0466 = (InterfaceC0463) list2.get(i);
                int iMo2053 = (interfaceC0465.mo2053() - interfaceC0465.mo2054()) + 1;
                if (interfaceC0465.getType() != interfaceC0466.getType() || iMo2053 != (interfaceC0466.mo2053() - interfaceC0466.mo2054()) + 1) {
                    throw m29712(EnumC19402.CHANGED, "Token content changed");
                }
                for (int i3 = 0; i3 < iMo2053; i3++) {
                    if ((i3 & 1023) == 0) {
                        c4460.m13206();
                    }
                    if (charSequence.charAt(interfaceC0465.mo2054() + i3) != c19012.charAt(interfaceC0466.mo2054() + i3)) {
                        throw m29712(EnumC19402.CHANGED, "Token content changed");
                    }
                }
                if (interfaceC0463 != null && ((C11516.m28345(interfaceC0465) || C11516.m28345(interfaceC0463)) && C11516.m28344(interfaceC0463.mo2053() + 1, interfaceC0465.mo2054(), charSequence) != C11516.m28344(interfaceC0464.mo2053() + 1, interfaceC0466.mo2054(), c19012))) {
                    throw m29712(EnumC19402.CHANGED, "Comment ownership changed");
                }
                interfaceC0464 = interfaceC0466;
                interfaceC0463 = interfaceC0465;
                i = i2;
            }
        }
        if (i != list2.size()) {
            throw m29712(EnumC19402.CHANGED, "Token count changed");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0350 m29712(EnumC19402 enumC19402, String str) {
        return new C0350(enumC19402, 1, 0, str);
    }
}
