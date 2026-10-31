package l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 05J4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8185 implements InterfaceC20288 {
    @Override // l.InterfaceC10410
    /* JADX INFO: renamed from: ۖ */
    public final int mo2302() {
        return 28;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        int iCompare = Integer.compare(28, interfaceC10410.mo2302());
        if (iCompare != 0) {
            return iCompare;
        }
        List value = getValue();
        List value2 = ((InterfaceC20288) interfaceC10410).getValue();
        int iCompare2 = Integer.compare(value.size(), value2.size());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        Iterator it = value2.iterator();
        Iterator it2 = value.iterator();
        while (it2.hasNext()) {
            int iCompareTo = ((Comparable) it2.next()).compareTo(it.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final int hashCode() {
        return getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC20288) {
            return getValue().equals(((InterfaceC20288) obj).getValue());
        }
        return false;
    }
}
