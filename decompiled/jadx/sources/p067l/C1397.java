package p067l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۧ᩵ */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1397 implements Iterable {

    /* JADX INFO: renamed from: ۙ */
    public C1991 f36599;

    /* JADX INFO: renamed from: ᩸ */
    public C1991 f36601;

    /* JADX INFO: renamed from: ᩹ */
    public final WeakHashMap f36602 = new WeakHashMap();

    /* JADX INFO: renamed from: ᩶ */
    public int f36600 = 0;

    public C1991 get(Object obj) {
        C1991 c1991 = this.f36599;
        while (c1991 != null && !c1991.f77198.equals(obj)) {
            c1991 = c1991.f77199;
        }
        return c1991;
    }

    /* JADX INFO: renamed from: ۧ */
    public Object mo28379(Object obj, Object obj2) {
        C1991 c1991 = get(obj);
        if (c1991 != null) {
            return c1991.f77196;
        }
        m29824(obj, obj2);
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1991 m29824(Object obj, Object obj2) {
        C1991 c1991 = new C1991(obj, obj2);
        this.f36600++;
        C1991 c1992 = this.f36601;
        if (c1992 == null) {
            this.f36599 = c1991;
            this.f36601 = c1991;
            return c1991;
        }
        c1992.f77199 = c1991;
        c1991.f77197 = c1992;
        this.f36601 = c1991;
        return c1991;
    }

    public Object remove(Object obj) {
        C1991 c1991 = get(obj);
        if (c1991 == null) {
            return null;
        }
        this.f36600--;
        WeakHashMap weakHashMap = this.f36602;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0942) it.next()).mo8701(c1991);
            }
        }
        C1991 c1992 = c1991.f77197;
        if (c1992 != null) {
            c1992.f77199 = c1991.f77199;
        } else {
            this.f36599 = c1991.f77199;
        }
        C1991 c1993 = c1991.f77199;
        if (c1993 != null) {
            c1993.f77197 = c1992;
        } else {
            this.f36601 = c1992;
        }
        c1991.f77199 = null;
        c1991.f77197 = null;
        return c1991.f77196;
    }

    public final int size() {
        return this.f36600;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1151 c1151 = new C1151(this.f36599, this.f36601);
        this.f36602.put(c1151, Boolean.FALSE);
        return c1151;
    }

    public final Iterator descendingIterator() {
        C1431 c1431 = new C1431(this.f36601, this.f36599);
        this.f36602.put(c1431, Boolean.FALSE);
        return c1431;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C1536 m29826() {
        C1536 c1536 = new C1536(this);
        this.f36602.put(c1536, Boolean.FALSE);
        return c1536;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Map.Entry m29825() {
        return this.f36599;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Map.Entry m29827() {
        return this.f36601;
    }

    public final boolean equals(Object obj) {
        AbstractC1221 abstractC1221;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1397)) {
            return false;
        }
        C1397 c1397 = (C1397) obj;
        if (this.f36600 != c1397.f36600) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c1397.iterator();
        while (true) {
            abstractC1221 = (AbstractC1221) it;
            if (!abstractC1221.hasNext()) {
                break;
            }
            AbstractC1221 abstractC1222 = (AbstractC1221) it2;
            if (!abstractC1222.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) abstractC1221.next();
            Object next = abstractC1222.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (abstractC1221.hasNext() || ((AbstractC1221) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            AbstractC1221 abstractC1221 = (AbstractC1221) it;
            if (!abstractC1221.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) abstractC1221.next()).hashCode();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            AbstractC1221 abstractC1221 = (AbstractC1221) it;
            if (abstractC1221.hasNext()) {
                sb.append(((Map.Entry) abstractC1221.next()).toString());
                if (abstractC1221.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
