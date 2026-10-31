package l;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N5Q6 */
/* JADX INFO: loaded from: classes3.dex */
public class C11194 implements Iterable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23166 f33600;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23166 f33602;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final WeakHashMap f33603 = new WeakHashMap();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f33601 = 0;

    public C23166 get(Object obj) {
        C23166 c23166 = this.f33600;
        while (c23166 != null && !c23166.f74453.equals(obj)) {
            c23166 = c23166.f74454;
        }
        return c23166;
    }

    /* JADX INFO: renamed from: ۧ */
    public Object mo26347(Object obj, Object obj2) {
        C23166 c23166 = get(obj);
        if (c23166 != null) {
            return c23166.f74451;
        }
        m27762(obj, obj2);
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23166 m27762(Object obj, Object obj2) {
        C23166 c23166 = new C23166(obj, obj2);
        this.f33601++;
        C23166 c23167 = this.f33602;
        if (c23167 == null) {
            this.f33600 = c23166;
            this.f33602 = c23166;
            return c23166;
        }
        c23167.f74454 = c23166;
        c23166.f74452 = c23167;
        this.f33602 = c23166;
        return c23166;
    }

    public Object remove(Object obj) {
        C23166 c23166 = get(obj);
        if (c23166 == null) {
            return null;
        }
        this.f33601--;
        WeakHashMap weakHashMap = this.f33603;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC2021) it.next()).mo6575(c23166);
            }
        }
        C23166 c23167 = c23166.f74452;
        if (c23167 != null) {
            c23167.f74454 = c23166.f74454;
        } else {
            this.f33600 = c23166.f74454;
        }
        C23166 c23168 = c23166.f74454;
        if (c23168 != null) {
            c23168.f74452 = c23167;
        } else {
            this.f33602 = c23167;
        }
        c23166.f74454 = null;
        c23166.f74452 = null;
        return c23166.f74451;
    }

    public final int size() {
        return this.f33601;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C6233 c6233 = new C6233(this.f33600, this.f33602);
        this.f33603.put(c6233, Boolean.FALSE);
        return c6233;
    }

    public final Iterator descendingIterator() {
        C11878 c11878 = new C11878(this.f33602, this.f33600);
        this.f33603.put(c11878, Boolean.FALSE);
        return c11878;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13993 m27764() {
        C13993 c13993 = new C13993(this);
        this.f33603.put(c13993, Boolean.FALSE);
        return c13993;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map.Entry m27763() {
        return this.f33600;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map.Entry m27765() {
        return this.f33602;
    }

    public final boolean equals(Object obj) {
        AbstractC7644 abstractC7644;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11194)) {
            return false;
        }
        C11194 c11194 = (C11194) obj;
        if (this.f33601 != c11194.f33601) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c11194.iterator();
        while (true) {
            abstractC7644 = (AbstractC7644) it;
            if (!abstractC7644.hasNext()) {
                break;
            }
            AbstractC7644 abstractC7645 = (AbstractC7644) it2;
            if (!abstractC7645.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) abstractC7644.next();
            Object next = abstractC7645.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (abstractC7644.hasNext() || ((AbstractC7644) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            AbstractC7644 abstractC7644 = (AbstractC7644) it;
            if (!abstractC7644.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) abstractC7644.next()).hashCode();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            AbstractC7644 abstractC7644 = (AbstractC7644) it;
            if (abstractC7644.hasNext()) {
                sb.append(((Map.Entry) abstractC7644.next()).toString());
                if (abstractC7644.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
