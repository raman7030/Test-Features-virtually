package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.᩻᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: VASI */
/* JADX INFO: loaded from: classes.dex */
public final class C25117 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f80367;

    /* JADX INFO: renamed from: ۧ */
    public boolean f80368;

    public C25117(C25117 c25117) {
        this(new int[0]);
        m55127(c25117);
    }

    public C25117(int... iArr) {
        this.f80367 = new ArrayList(iArr.length);
        for (int i : iArr) {
            m55125(i);
        }
    }

    static {
        C25117 c25117 = new C25117(new int[0]);
        c25117.m55126(0, 1114111);
        c25117.f80368 = true;
        new C25117(new int[0]).f80368 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55125(int i) {
        if (this.f80368) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        m55126(i, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55126(int i, int i2) {
        C16399 c16399;
        int i3;
        C16399 c16399M37214 = C16399.m37214(i, i2);
        if (this.f80368) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        if (c16399M37214.f48196 < c16399M37214.f48195) {
            return;
        }
        ArrayList arrayList = this.f80367;
        ListIterator listIterator = arrayList.listIterator();
        while (true) {
            if (listIterator.hasNext()) {
                c16399 = (C16399) listIterator.next();
                if (!c16399M37214.equals(c16399)) {
                    i3 = c16399M37214.f48195;
                    int i4 = c16399.f48196;
                    if (i3 == i4 + 1) {
                        break;
                    }
                    int i5 = c16399M37214.f48196;
                    int i6 = c16399.f48195;
                    if (i5 == i6 - 1 || ((i3 >= i6 || i5 >= i6) && i3 <= i4)) {
                        break;
                    }
                    if (i3 < i6 && i5 < i6) {
                        listIterator.previous();
                        listIterator.add(c16399M37214);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                arrayList.add(c16399M37214);
                return;
            }
        }
        C16399 c16399M37215 = C16399.m37214(Math.min(i3, c16399.f48195), Math.max(c16399M37214.f48196, c16399.f48196));
        listIterator.set(c16399M37215);
        while (listIterator.hasNext()) {
            C16399 c163910 = (C16399) listIterator.next();
            int i7 = c16399M37215.f48195;
            int i8 = c163910.f48196;
            if (i7 != i8 + 1) {
                int i9 = c16399M37215.f48196;
                int i10 = c163910.f48195;
                if (i9 != i10 - 1 && ((i7 < i10 && i9 < i10) || i7 > i8)) {
                    return;
                }
            }
            listIterator.remove();
            listIterator.previous();
            listIterator.set(C16399.m37214(Math.min(c16399M37215.f48195, c163910.f48195), Math.max(c16399M37215.f48196, c163910.f48196)));
            listIterator.next();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55127(C25117 c25117) {
        if (c25117 == null) {
            return;
        }
        ArrayList arrayList = c25117.f80367;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C16399 c16399 = (C16399) arrayList.get(i);
            m55126(c16399.f48195, c16399.f48196);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C25117 m55122(C25117 c25117, C25117 c25118) {
        int i = 0;
        if (c25117.m55128()) {
            return new C25117(new int[0]);
        }
        C25117 c25119 = new C25117(c25117);
        ArrayList arrayList = c25118.f80367;
        if (!c25118.m55128()) {
            int i2 = 0;
            while (i < c25119.f80367.size() && i2 < arrayList.size()) {
                C16399 c16399 = (C16399) c25119.f80367.get(i);
                C16399 c163910 = (C16399) arrayList.get(i2);
                int i3 = c163910.f48196;
                int i4 = c16399.f48195;
                if (i3 >= i4) {
                    int i5 = c163910.f48195;
                    int i6 = c16399.f48196;
                    if (i5 <= i6) {
                        C16399 c163911 = i5 > i4 ? new C16399(i4, i5 - 1) : null;
                        C16399 c163912 = i3 < i6 ? new C16399(i3 + 1, i6) : null;
                        if (c163911 != null) {
                            if (c163912 != null) {
                                c25119.f80367.set(i, c163911);
                                i++;
                                c25119.f80367.add(i, c163912);
                            } else {
                                c25119.f80367.set(i, c163911);
                            }
                        } else if (c163912 != null) {
                            c25119.f80367.set(i, c163912);
                        } else {
                            c25119.f80367.remove(i);
                        }
                    }
                    i++;
                }
                i2++;
            }
        }
        return c25119;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m55129(int i) {
        ArrayList arrayList = this.f80367;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            C16399 c16399 = (C16399) arrayList.get(i3);
            int i4 = c16399.f48195;
            if (c16399.f48196 < i) {
                i2 = i3 + 1;
            } else {
                if (i4 <= i) {
                    return true;
                }
                size = i3 - 1;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m55128() {
        ArrayList arrayList = this.f80367;
        return arrayList == null || arrayList.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m55123() {
        if (m55128()) {
            throw new RuntimeException("set is empty");
        }
        return ((C16399) this.f80367.get(0)).f48195;
    }

    public final int hashCode() {
        ArrayList<C16399> arrayList = this.f80367;
        int iM9002 = 0;
        for (C16399 c16399 : arrayList) {
            iM9002 = C4358.m9002(C4358.m9002(iM9002, c16399.f48195), c16399.f48196);
        }
        return C4358.m8999(iM9002, arrayList.size() * 2);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C25117)) {
            return false;
        }
        return this.f80367.equals(((C25117) obj).f80367);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f80367;
        if (arrayList == null || arrayList.isEmpty()) {
            return "{}";
        }
        if (m55131() > 1) {
            sb.append("{");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C16399 c16399 = (C16399) it.next();
            int i = c16399.f48195;
            int i2 = c16399.f48196;
            if (i != i2) {
                sb.append(i);
                sb.append("..");
                sb.append(i2);
            } else if (i == -1) {
                sb.append("<EOF>");
            } else {
                sb.append(i);
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (m55131() > 1) {
            sb.append(C0249l.f1198d);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m55124(InterfaceC10185 interfaceC10185) {
        String strM38444;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f80367;
        if (arrayList == null || arrayList.isEmpty()) {
            return "{}";
        }
        if (m55131() > 1) {
            sb.append("{");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C16399 c16399 = (C16399) it.next();
            int i = c16399.f48195;
            int i2 = c16399.f48196;
            String strM38445 = "<EPSILON>";
            if (i == i2) {
                if (i == -1) {
                    strM38445 = "<EOF>";
                } else if (i != -2) {
                    strM38445 = ((C16889) interfaceC10185).m38444(i);
                }
                sb.append(strM38445);
            } else {
                int i3 = i;
                while (i3 <= i2) {
                    if (i3 > i) {
                        sb.append(", ");
                    }
                    if (i3 == -1) {
                        strM38444 = "<EOF>";
                    } else {
                        strM38444 = i3 == -2 ? "<EPSILON>" : ((C16889) interfaceC10185).m38444(i3);
                    }
                    sb.append(strM38444);
                    i3++;
                }
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (m55131() > 1) {
            sb.append(C0249l.f1198d);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m55131() {
        ArrayList arrayList = this.f80367;
        int size = arrayList.size();
        if (size == 1) {
            C16399 c16399 = (C16399) arrayList.get(0);
            return (c16399.f48196 - c16399.f48195) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C16399 c163910 = (C16399) arrayList.get(i2);
            i += (c163910.f48196 - c163910.f48195) + 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m55130() {
        if (this.f80368) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        ArrayList arrayList = this.f80367;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C16399 c16399 = (C16399) arrayList.get(i);
            int i2 = c16399.f48195;
            int i3 = c16399.f48196;
            if (-2 < i2) {
                return;
            }
            if (-2 == i2 && -2 == i3) {
                arrayList.remove(i);
                return;
            }
            if (-2 == i2) {
                c16399.f48195 = i2 + 1;
                return;
            }
            if (-2 == i3) {
                c16399.f48196 = i3 - 1;
                return;
            }
            if (-2 > i2 && -2 < i3) {
                c16399.f48196 = -3;
                m55126(-1, i3);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m55132() {
        this.f80368 = true;
    }
}
