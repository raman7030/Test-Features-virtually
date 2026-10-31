package l;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7SQ */
/* JADX INFO: loaded from: classes2.dex */
public class C1878 extends AbstractC8333 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C1878 f6387 = new C1878();

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ void mo2845(C23525 c23525, Object obj) throws IOException {
        m6216((AbstractC23107) obj, c23525);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC23107 m6217(C17175 c17175, EnumC14352 enumC14352) throws IOException {
        int i = C7606.f23543[enumC14352.ordinal()];
        if (i == 1) {
            c17175.m40391();
            return new C6174();
        }
        if (i != 2) {
            return null;
        }
        c17175.m40402();
        return new C1983();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC23107 m6215(C17175 c17175, EnumC14352 enumC14352) {
        int i = C7606.f23543[enumC14352.ordinal()];
        if (i == 3) {
            return new C18211(c17175.m40399());
        }
        if (i == 4) {
            return new C18211(new C13976(c17175.m40399()));
        }
        if (i == 5) {
            return new C18211(Boolean.valueOf(c17175.m40401()));
        }
        if (i == 6) {
            c17175.m40394();
            return C7585.f23459;
        }
        throw new IllegalStateException("Unexpected token: " + enumC14352);
    }

    @Override // l.AbstractC8333
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2844(C17175 c17175) throws IOException {
        if (c17175 instanceof C11051) {
            ((C11051) c17175).getClass();
            throw null;
        }
        EnumC14352 enumC14352M40398 = c17175.m40398();
        AbstractC23107 abstractC23107M6217 = m6217(c17175, enumC14352M40398);
        if (abstractC23107M6217 == null) {
            return m6215(c17175, enumC14352M40398);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c17175.m40404()) {
                String strM40396 = abstractC23107M6217 instanceof C1983 ? c17175.m40396() : null;
                EnumC14352 enumC14352M40399 = c17175.m40398();
                AbstractC23107 abstractC23107M6218 = m6217(c17175, enumC14352M40399);
                boolean z = abstractC23107M6218 != null;
                AbstractC23107 abstractC23107M6215 = abstractC23107M6218 == null ? m6215(c17175, enumC14352M40399) : abstractC23107M6218;
                if (abstractC23107M6217 instanceof C6174) {
                    ((C6174) abstractC23107M6217).m17080(abstractC23107M6215);
                } else {
                    ((C1983) abstractC23107M6217).m6497(strM40396, abstractC23107M6215);
                }
                if (z) {
                    arrayDeque.addLast(abstractC23107M6217);
                    abstractC23107M6217 = abstractC23107M6215;
                }
            } else {
                if (abstractC23107M6217 instanceof C6174) {
                    c17175.m40400();
                } else {
                    c17175.m40410();
                }
                if (arrayDeque.isEmpty()) {
                    return abstractC23107M6217;
                }
                abstractC23107M6217 = (AbstractC23107) arrayDeque.removeLast();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6216(AbstractC23107 abstractC23107, C23525 c23525) throws IOException {
        if (abstractC23107 != null && !(abstractC23107 instanceof C7585)) {
            if (!(abstractC23107 instanceof C18211)) {
                boolean z = abstractC23107 instanceof C6174;
                if (!z) {
                    boolean z2 = abstractC23107 instanceof C1983;
                    if (z2) {
                        c23525.m51987();
                        if (z2) {
                            for (Map.Entry entry : ((C1983) abstractC23107).m6498()) {
                                c23525.m51976((String) entry.getKey());
                                m6216((AbstractC23107) entry.getValue(), c23525);
                            }
                            c23525.m51986();
                            return;
                        }
                        throw new IllegalStateException("Not a JSON Object: " + abstractC23107);
                    }
                    throw new IllegalArgumentException("Couldn't write " + abstractC23107.getClass());
                }
                c23525.m51972();
                if (z) {
                    Iterator it = ((C6174) abstractC23107).iterator();
                    while (it.hasNext()) {
                        m6216((AbstractC23107) it.next(), c23525);
                    }
                    c23525.m51989();
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + abstractC23107);
            }
            C18211 c18211M51295 = abstractC23107.m51295();
            if (c18211M51295.m42433()) {
                c23525.m51975(c18211M51295.m42434());
                return;
            } else if (c18211M51295.m42428()) {
                c23525.m51988(c18211M51295.m42431());
                return;
            } else {
                c23525.m51984(c18211M51295.mo17081());
                return;
            }
        }
        c23525.m51981();
    }
}
