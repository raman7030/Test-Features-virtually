package p067l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ۚܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes2.dex */
public final class C7492 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m17272(int i) {
        return i == 102 || i == 2 || i == 3 || i == -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17271(CharSequence charSequence, boolean z, int i, C20438 c20438) throws InterruptedException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
        if (charSequence.length() > 1048576) {
            throw m17268(EnumC2797.LIMIT, "Source length limit exceeded");
        }
        C4810 c4810 = new C4810();
        try {
            try {
                m17270(charSequence, z, i, c4810, c20438);
            } catch (StackOverflowError unused) {
                throw m17268(EnumC2797.LIMIT, "Parser stack limit exceeded");
            }
        } catch (C20233 e) {
            try {
                if (e.f62552 != EnumC2797.SYNTAX) {
                    throw e;
                }
                C16977.m38567(charSequence, z, i, c4810, c20438);
            } catch (C20233 e2) {
                if (!Thread.currentThread().isInterrupted()) {
                    throw e2;
                }
                throw new InterruptedException();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17270(CharSequence charSequence, boolean z, int i, C4810 c4810, C20438 c20438) {
        C20904 c20904M17269 = m17269(charSequence, c4810);
        new C14966(charSequence, c20904M17269.f65651, c20904M17269.f65650, c4810).m34264(z, Math.max(1, Math.min(16, i)), c20438);
        if (c20438.length() > 1048576) {
            throw m17268(EnumC2797.LIMIT, "Formatted source length limit exceeded");
        }
        c4810.m10153();
        boolean z2 = c20438.length() == charSequence.length();
        for (int i2 = 0; z2 && i2 < charSequence.length(); i2++) {
            if ((i2 & 1023) == 0) {
                c4810.m10153();
            }
            z2 = c20438.charAt(i2) == charSequence.charAt(i2);
        }
        if (z2) {
            return;
        }
        try {
            C20904 c20904M172610 = m17269(c20438, c4810);
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque.push(c20904M17269.f65650);
            arrayDeque2.push(c20904M172610.f65650);
            while (!arrayDeque.isEmpty() && !arrayDeque2.isEmpty()) {
                c4810.m10153();
                InterfaceC17740 interfaceC17740 = (InterfaceC17740) arrayDeque.pop();
                InterfaceC17740 interfaceC17741 = (InterfaceC17740) arrayDeque2.pop();
                if (interfaceC17740 instanceof C10856) {
                    C10856 c10856 = (C10856) interfaceC17740;
                    if (interfaceC17741 instanceof C10856) {
                        C10856 c10857 = (C10856) interfaceC17741;
                        if (c10856.mo3481() != c10857.mo3481() || c10856.getChildCount() != c10857.getChildCount()) {
                            throw m17268(EnumC2797.CHANGED, "Syntax structure changed during formatting");
                        }
                        for (int childCount = c10856.getChildCount() - 1; childCount >= 0; childCount--) {
                            arrayDeque.push(c10856.mo25014(childCount));
                            arrayDeque2.push(c10857.mo25014(childCount));
                        }
                    }
                }
                if (interfaceC17740 instanceof InterfaceC6342) {
                    InterfaceC6342 interfaceC6342 = (InterfaceC6342) interfaceC17740;
                    if (interfaceC17741 instanceof InterfaceC6342) {
                        InterfaceC2808 interfaceC2808Mo14503 = interfaceC6342.mo14503();
                        InterfaceC2808 interfaceC2808Mo14504 = ((InterfaceC6342) interfaceC17741).mo14503();
                        if (interfaceC2808Mo14503.getType() != interfaceC2808Mo14504.getType() || (!m17272(interfaceC2808Mo14503.getType()) && !interfaceC2808Mo14503.getText().equals(interfaceC2808Mo14504.getText()))) {
                            throw m17268(EnumC2797.CHANGED, "Token content changed during formatting");
                        }
                    }
                }
                throw m17268(EnumC2797.CHANGED, "Syntax node changed during formatting");
            }
            if (arrayDeque.isEmpty() && arrayDeque2.isEmpty()) {
                c4810.m10153();
                return;
            }
            throw m17268(EnumC2797.CHANGED, "Syntax length changed");
        } catch (C20233 e) {
            if (e.f62552 != EnumC2797.SYNTAX) {
                throw e;
            }
            throw m17268(EnumC2797.CHANGED, "Formatted output could not be parsed: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20904 m17269(CharSequence charSequence, C4810 c4810) {
        C22245 c22245 = new C22245();
        C11516 c11516 = new C11516(new C6151(new C13618(charSequence, new RunnableC8833(c4810)), c4810), c4810);
        c11516.m45727();
        c11516.m45725(c22245);
        C10845 c10845 = new C10845(c11516, c4810);
        c10845.m8408();
        C17549 c17549 = new C17549(c10845, c4810);
        c17549.m45727();
        c17549.m45725(c22245);
        return new C20904(c10845.m8412(), c17549.m6383());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20233 m17268(EnumC2797 enumC2797, String str) {
        return new C20233(enumC2797, 1, 0, str);
    }
}
