package p067l;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠۬֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 05J4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10147 implements InterfaceC21650 {
    @Override // p067l.InterfaceC12262
    /* JADX INFO: renamed from: ۖ */
    public final int mo4670() {
        return 28;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC12262 interfaceC12262 = (InterfaceC12262) obj;
        int iCompare = Integer.compare(28, interfaceC12262.mo4670());
        if (iCompare != 0) {
            return iCompare;
        }
        List value = getValue();
        List value2 = ((InterfaceC21650) interfaceC12262).getValue();
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
        if (obj instanceof InterfaceC21650) {
            return getValue().equals(((InterfaceC21650) obj).getValue());
        }
        return false;
    }
}
