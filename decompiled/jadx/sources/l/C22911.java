package l;

import com.alipay.sdk.m.y.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩺ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBH9 */
/* JADX INFO: loaded from: classes.dex */
public final class C22911 extends C18947 implements Comparable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C22911 f73848;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TreeMap f73849 = new TreeMap();

    static {
        C22911 c22911 = new C22911();
        f73848 = c22911;
        c22911.mo20349();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22911 m50994(C22911 c22911, C5978 c5978) {
        C22911 c22912 = new C22911();
        c22912.m50996(c22911);
        c22912.m50995(c5978);
        c22912.mo20349();
        return c22912;
    }

    public final int hashCode() {
        return this.f73849.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22911) {
            return this.f73849.equals(((C22911) obj).f73849);
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C22911 c22911) {
        Iterator it = this.f73849.values().iterator();
        Iterator it2 = c22911.f73849.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iM16775 = ((C5978) it.next()).compareTo((C5978) it2.next());
            if (iM16775 != 0) {
                return iM16775;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("annotations{");
        boolean z = true;
        for (C5978 c5978 : this.f73849.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c5978.mo2463());
        }
        sb.append(l.d);
        return sb.toString();
    }

    public final int size() {
        return this.f73849.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50995(C5978 c5978) {
        m43734();
        if (c5978 == null) {
            throw new NullPointerException("annotation == null");
        }
        C12512 type = c5978.getType();
        TreeMap treeMap = this.f73849;
        if (treeMap.containsKey(type)) {
            throw new IllegalArgumentException("duplicate type: " + type.mo2463());
        }
        treeMap.put(type, c5978);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50996(C22911 c22911) {
        m43734();
        if (c22911 == null) {
            throw new NullPointerException("toAdd == null");
        }
        Iterator it = c22911.f73849.values().iterator();
        while (it.hasNext()) {
            m50995((C5978) it.next());
        }
    }

    public final Collection getAnnotations() {
        return C20195.unmodifiableCollection(this.f73849.values());
    }
}
