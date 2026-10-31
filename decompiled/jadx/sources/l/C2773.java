package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: renamed from: l.ۖ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9PM */
/* JADX INFO: loaded from: classes2.dex */
public final class C2773 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f8643 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f8641 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Stack f8644 = new Stack();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f8642 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m8570(C17757 c17757) {
        Boolean bool = (Boolean) this.f8643.get(c17757);
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (this) {
            Boolean bool2 = (Boolean) this.f8643.get(c17757);
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            return m8569(c17757).f27637.f49830;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C9123 m8569(C17757 c17757) {
        C9123 c9123;
        ArrayList arrayList;
        boolean z;
        C16177 c16177;
        int i = this.f8641;
        this.f8641 = i + 1;
        C9123 c9124 = new C9123(c17757, i);
        Stack stack = this.f8644;
        stack.push(c9124);
        HashMap map = this.f8642;
        map.put(c17757, c9124);
        for (C0117 c0117 : c17757.getFields()) {
            if (c0117.m1138() == EnumC18463.MESSAGE) {
                C9123 c9125 = (C9123) map.get(c0117.m1147());
                if (c9125 == null) {
                    c9124.f27640 = Math.min(c9124.f27640, m8569(c0117.m1147()).f27640);
                } else if (c9125.f27637 == null) {
                    c9124.f27640 = Math.min(c9124.f27640, c9125.f27640);
                }
            }
        }
        if (c9124.f27639 == c9124.f27640) {
            C16177 c16178 = new C16177();
            do {
                c9123 = (C9123) stack.pop();
                c9123.f27637 = c16178;
                C17757 c17758 = c9123.f27638;
                arrayList = c16178.f49829;
                arrayList.add(c17758);
            } while (c9123 != c9124);
            Iterator it = arrayList.iterator();
            loop2: while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                C17757 c17759 = (C17757) it.next();
                z = true;
                if (c17759.m41598()) {
                    break;
                }
                for (C0117 c0118 : c17759.getFields()) {
                    if (c0118.m1128() || (c0118.m1138() == EnumC18463.MESSAGE && (c16177 = ((C9123) map.get(c0118.m1147())).f27637) != c16178 && c16177.f49830)) {
                        break loop2;
                    }
                }
            }
            c16178.f49830 = z;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.f8643.put((C17757) it2.next(), Boolean.valueOf(c16178.f49830));
            }
        }
        return c9124;
    }
}
