package p067l;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۛۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13983 {
    /* JADX INFO: renamed from: ֫ */
    public static void m31778(CharSequence charSequence, C5660 c5660, C20438 c20438) throws InterruptedException {
        try {
            C6607 c6607 = new C6607();
            c6607.m15087();
            if (charSequence.length() > 1048576) {
                throw m31774(EnumC20808.LIMIT, "Source length limit exceeded");
            }
            if (c20438.length() != 0) {
                throw new IllegalArgumentException("Output must be empty");
            }
            String strM30389 = C13313.m30389(charSequence, c6607);
            C20438 c20438M46121 = c20438.m46121();
            int i = 0;
            try {
                try {
                    m31777(charSequence, c5660, strM30389, c6607, c20438M46121);
                } catch (Throwable th) {
                    try {
                        c20438M46121.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (C2701 e) {
                if (e.f4535 != EnumC20808.SYNTAX) {
                    throw e;
                }
                c20438M46121.m46123(0);
                C16664.m37740(charSequence, c5660, strM30389, c6607, c20438M46121);
            }
            while (i < c20438M46121.length()) {
                c6607.m15087();
                int i2 = i + 4096;
                c20438.m46122(i, Math.min(c20438M46121.length(), i2), c20438M46121);
                i = i2;
            }
            c6607.m15087();
            c20438M46121.close();
        } catch (StackOverflowError unused) {
            throw m31774(EnumC20808.LIMIT, "Parser stack limit exceeded");
        } catch (C8737 unused2) {
            throw new InterruptedException("Code formatting cancelled");
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072  */
    /* JADX WARN: Code duplicated, block: B:23:0x0080 A[LOOP:1: B:21:0x007c->B:23:0x0080, LOOP_END] */
    /* JADX INFO: renamed from: ֫ */
    public static void m31777(CharSequence charSequence, C5660 c5660, String str, C6607 c6607, C20438 c20438) {
        int childCount;
        C14653 c14653M31779 = m31779(charSequence, c6607);
        new C13313(charSequence, c14653M31779.f41836, c14653M31779.f41835, c5660, str, c6607).m30392(c20438);
        try {
            C14653 c14653M317710 = m31779(c20438, c6607);
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque.push(c14653M31779.f41835);
            arrayDeque2.push(c14653M317710.f41835);
            while (!arrayDeque.isEmpty() && !arrayDeque2.isEmpty()) {
                c6607.m15087();
                InterfaceC17740 interfaceC17740 = (InterfaceC17740) arrayDeque.pop();
                InterfaceC17740 interfaceC17741 = (InterfaceC17740) arrayDeque2.pop();
                if (interfaceC17740.getChildCount() == interfaceC17741.getChildCount()) {
                    boolean z = interfaceC17740 instanceof C10856;
                    if (z) {
                        C10856 c10856 = (C10856) interfaceC17740;
                        if ((interfaceC17741 instanceof C10856) && c10856.mo3481() == ((C10856) interfaceC17741).mo3481()) {
                            if (!z || !(interfaceC17741 instanceof C10856)) {
                                childCount = interfaceC17740.getChildCount();
                                while (true) {
                                    childCount--;
                                    if (childCount >= 0) {
                                        arrayDeque.push(interfaceC17740.mo25014(childCount));
                                        arrayDeque2.push(interfaceC17741.mo25014(childCount));
                                    }
                                }
                            }
                        }
                    } else {
                        if (!z) {
                        }
                        childCount = interfaceC17740.getChildCount();
                        while (true) {
                            childCount--;
                            if (childCount >= 0) {
                                arrayDeque.push(interfaceC17740.mo25014(childCount));
                                arrayDeque2.push(interfaceC17741.mo25014(childCount));
                            }
                        }
                    }
                }
                throw m31774(EnumC20808.CHANGED, "Syntax structure changed during formatting");
            }
            if (!arrayDeque.isEmpty() || !arrayDeque2.isEmpty()) {
                throw m31774(EnumC20808.CHANGED, "Syntax length changed");
            }
            m31776(charSequence, c14653M31779.f41836, c20438, c14653M317710.f41836, c6607);
        } catch (C2701 e) {
            if (e.f4535 == EnumC20808.SYNTAX) {
                throw m31774(EnumC20808.CHANGED, "Formatted output could not be parsed");
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4150 m31775(CharSequence charSequence, C6607 c6607) {
        C3372 c3372 = new C3372(new C22149(new C5266(charSequence, c6607)));
        c3372.m45727();
        c3372.m45725(new C22701());
        C23371 c23371 = new C23371(c3372, c6607);
        c23371.m8408();
        if (c23371.m8415(c23371.size() - 1).getType() == -1) {
            return c23371;
        }
        throw m31774(EnumC20808.LIMIT, "Token count limit exceeded");
    }

    /* JADX INFO: renamed from: ۧ */
    public static C14653 m31779(CharSequence charSequence, C6607 c6607) {
        C4150 c4150M31775 = m31775(charSequence, c6607);
        C21360 c21360 = new C21360(c4150M31775, c6607);
        c21360.m45727();
        c21360.m45725(new C22701());
        return new C14653(c4150M31775.m8412(), c21360.m16726());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31776(CharSequence charSequence, List list, C20438 c20438, List list2, C6607 c6607) {
        Iterator it = list.iterator();
        InterfaceC2808 interfaceC2808 = null;
        InterfaceC2808 interfaceC2809 = null;
        int i = 0;
        while (it.hasNext()) {
            InterfaceC2808 interfaceC28010 = (InterfaceC2808) it.next();
            c6607.m15087();
            if (interfaceC28010.getType() != 65) {
                while (i < list2.size() && ((InterfaceC2808) list2.get(i)).getType() == 65) {
                    i++;
                }
                if (i == list2.size()) {
                    throw m31774(EnumC20808.CHANGED, "Token count changed");
                }
                int i2 = i + 1;
                InterfaceC2808 interfaceC28011 = (InterfaceC2808) list2.get(i);
                int iMo4433 = (interfaceC28010.mo4433() - interfaceC28010.mo4434()) + 1;
                if (interfaceC28010.getType() != interfaceC28011.getType() || iMo4433 != (interfaceC28011.mo4433() - interfaceC28011.mo4434()) + 1) {
                    throw m31774(EnumC20808.CHANGED, "Token content changed");
                }
                for (int i3 = 0; i3 < iMo4433; i3++) {
                    if ((i3 & 1023) == 0) {
                        c6607.m15087();
                    }
                    if (charSequence.charAt(interfaceC28010.mo4434() + i3) != c20438.charAt(interfaceC28011.mo4434() + i3)) {
                        throw m31774(EnumC20808.CHANGED, "Token content changed");
                    }
                }
                if (interfaceC2808 != null && ((C13313.m30391(interfaceC28010) || C13313.m30391(interfaceC2808)) && C13313.m30390(interfaceC2808.mo4433() + 1, interfaceC28010.mo4434(), charSequence) != C13313.m30390(interfaceC2809.mo4433() + 1, interfaceC28011.mo4434(), c20438))) {
                    throw m31774(EnumC20808.CHANGED, "Comment ownership changed");
                }
                interfaceC2809 = interfaceC28011;
                interfaceC2808 = interfaceC28010;
                i = i2;
            }
        }
        if (i != list2.size()) {
            throw m31774(EnumC20808.CHANGED, "Token count changed");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2701 m31774(EnumC20808 enumC20808, String str) {
        return new C2701(enumC20808, 1, 0, str);
    }
}
