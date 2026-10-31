package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.᩻᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: VASI */
/* JADX INFO: loaded from: classes.dex */
public final class C23936 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f77615;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f77616;

    public C23936(C23936 c23936) {
        this(new int[0]);
        m52721(c23936);
    }

    public C23936(int... iArr) {
        this.f77615 = new ArrayList(iArr.length);
        for (int i : iArr) {
            m52719(i);
        }
    }

    static {
        C23936 c23936 = new C23936(new int[0]);
        c23936.m52720(0, 1114111);
        c23936.f77616 = true;
        new C23936(new int[0]).f77616 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52719(int i) {
        if (this.f77616) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        m52720(i, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52720(int i, int i2) {
        C14763 c14763;
        int i3;
        C14763 c14763M35067 = C14763.m35067(i, i2);
        if (this.f77616) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        if (c14763M35067.f45082 < c14763M35067.f45081) {
            return;
        }
        ArrayList arrayList = this.f77615;
        ListIterator listIterator = arrayList.listIterator();
        while (true) {
            if (listIterator.hasNext()) {
                c14763 = (C14763) listIterator.next();
                if (!c14763M35067.equals(c14763)) {
                    i3 = c14763M35067.f45081;
                    int i4 = c14763.f45082;
                    if (i3 == i4 + 1) {
                        break;
                    }
                    int i5 = c14763M35067.f45082;
                    int i6 = c14763.f45081;
                    if (i5 == i6 - 1 || ((i3 >= i6 || i5 >= i6) && i3 <= i4)) {
                        break;
                    }
                    if (i3 < i6 && i5 < i6) {
                        listIterator.previous();
                        listIterator.add(c14763M35067);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                arrayList.add(c14763M35067);
                return;
            }
        }
        C14763 c14763M35068 = C14763.m35067(Math.min(i3, c14763.f45081), Math.max(c14763M35067.f45082, c14763.f45082));
        listIterator.set(c14763M35068);
        while (listIterator.hasNext()) {
            C14763 c14764 = (C14763) listIterator.next();
            int i7 = c14763M35068.f45081;
            int i8 = c14764.f45082;
            if (i7 != i8 + 1) {
                int i9 = c14763M35068.f45082;
                int i10 = c14764.f45081;
                if (i9 != i10 - 1 && ((i7 < i10 && i9 < i10) || i7 > i8)) {
                    return;
                }
            }
            listIterator.remove();
            listIterator.previous();
            listIterator.set(C14763.m35067(Math.min(c14763M35068.f45081, c14764.f45081), Math.max(c14763M35068.f45082, c14764.f45082)));
            listIterator.next();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52721(C23936 c23936) {
        if (c23936 == null) {
            return;
        }
        ArrayList arrayList = c23936.f77615;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C14763 c14763 = (C14763) arrayList.get(i);
            m52720(c14763.f45081, c14763.f45082);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23936 m52716(C23936 c23936, C23936 c23937) {
        int i = 0;
        if (c23936.m52722()) {
            return new C23936(new int[0]);
        }
        C23936 c23938 = new C23936(c23936);
        ArrayList arrayList = c23937.f77615;
        if (!c23937.m52722()) {
            int i2 = 0;
            while (i < c23938.f77615.size() && i2 < arrayList.size()) {
                C14763 c14763 = (C14763) c23938.f77615.get(i);
                C14763 c14764 = (C14763) arrayList.get(i2);
                int i3 = c14764.f45082;
                int i4 = c14763.f45081;
                if (i3 >= i4) {
                    int i5 = c14764.f45081;
                    int i6 = c14763.f45082;
                    if (i5 <= i6) {
                        C14763 c14765 = i5 > i4 ? new C14763(i4, i5 - 1) : null;
                        C14763 c14766 = i3 < i6 ? new C14763(i3 + 1, i6) : null;
                        if (c14765 != null) {
                            if (c14766 != null) {
                                c23938.f77615.set(i, c14765);
                                i++;
                                c23938.f77615.add(i, c14766);
                            } else {
                                c23938.f77615.set(i, c14765);
                            }
                        } else if (c14766 != null) {
                            c23938.f77615.set(i, c14766);
                        } else {
                            c23938.f77615.remove(i);
                        }
                    }
                    i++;
                }
                i2++;
            }
        }
        return c23938;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m52723(int i) {
        ArrayList arrayList = this.f77615;
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            C14763 c14763 = (C14763) arrayList.get(i3);
            int i4 = c14763.f45081;
            if (c14763.f45082 < i) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m52722() {
        ArrayList arrayList = this.f77615;
        return arrayList == null || arrayList.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m52717() {
        if (m52722()) {
            throw new RuntimeException("set is empty");
        }
        return ((C14763) this.f77615.get(0)).f45081;
    }

    public final int hashCode() {
        ArrayList<C14763> arrayList = this.f77615;
        int iM6876 = 0;
        for (C14763 c14763 : arrayList) {
            iM6876 = C2093.m6876(C2093.m6876(iM6876, c14763.f45081), c14763.f45082);
        }
        return C2093.m6873(iM6876, arrayList.size() * 2);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C23936)) {
            return false;
        }
        return this.f77615.equals(((C23936) obj).f77615);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f77615;
        if (arrayList == null || arrayList.isEmpty()) {
            return "{}";
        }
        if (m52725() > 1) {
            sb.append("{");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14763 c14763 = (C14763) it.next();
            int i = c14763.f45081;
            int i2 = c14763.f45082;
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
        if (m52725() > 1) {
            sb.append(l.d);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m52718(InterfaceC8225 interfaceC8225) {
        String strM36283;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f77615;
        if (arrayList == null || arrayList.isEmpty()) {
            return "{}";
        }
        if (m52725() > 1) {
            sb.append("{");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14763 c14763 = (C14763) it.next();
            int i = c14763.f45081;
            int i2 = c14763.f45082;
            String strM36284 = "<EPSILON>";
            if (i == i2) {
                if (i == -1) {
                    strM36284 = "<EOF>";
                } else if (i != -2) {
                    strM36284 = ((C15279) interfaceC8225).m36283(i);
                }
                sb.append(strM36284);
            } else {
                int i3 = i;
                while (i3 <= i2) {
                    if (i3 > i) {
                        sb.append(", ");
                    }
                    if (i3 == -1) {
                        strM36283 = "<EOF>";
                    } else {
                        strM36283 = i3 == -2 ? "<EPSILON>" : ((C15279) interfaceC8225).m36283(i3);
                    }
                    sb.append(strM36283);
                    i3++;
                }
            }
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        if (m52725() > 1) {
            sb.append(l.d);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m52725() {
        ArrayList arrayList = this.f77615;
        int size = arrayList.size();
        if (size == 1) {
            C14763 c14763 = (C14763) arrayList.get(0);
            return (c14763.f45082 - c14763.f45081) + 1;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C14763 c14764 = (C14763) arrayList.get(i2);
            i += (c14764.f45082 - c14764.f45081) + 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m52724() {
        if (this.f77616) {
            throw new IllegalStateException("can't alter readonly IntervalSet");
        }
        ArrayList arrayList = this.f77615;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C14763 c14763 = (C14763) arrayList.get(i);
            int i2 = c14763.f45081;
            int i3 = c14763.f45082;
            if (-2 < i2) {
                return;
            }
            if (-2 == i2 && -2 == i3) {
                arrayList.remove(i);
                return;
            }
            if (-2 == i2) {
                c14763.f45081 = i2 + 1;
                return;
            }
            if (-2 == i3) {
                c14763.f45082 = i3 - 1;
                return;
            }
            if (-2 > i2 && -2 < i3) {
                c14763.f45082 = -3;
                m52720(-1, i3);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m52726() {
        this.f77616 = true;
    }
}
