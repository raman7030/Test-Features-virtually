package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.᩺ۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBH9 */
/* JADX INFO: loaded from: classes.dex */
public final class C24143 extends C20376 implements Comparable {

    /* JADX INFO: renamed from: ᩶ */
    public static final C24143 f76578;

    /* JADX INFO: renamed from: ᩹ */
    public final TreeMap f76579 = new TreeMap();

    static {
        C24143 c24143 = new C24143();
        f76578 = c24143;
        c24143.mo22326();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24143 m53385(C24143 c24143, C8050 c8050) {
        C24143 c24144 = new C24143();
        c24144.m53387(c24143);
        c24144.m53386(c8050);
        c24144.mo22326();
        return c24144;
    }

    public final int hashCode() {
        return this.f76579.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C24143) {
            return this.f76579.equals(((C24143) obj).f76579);
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۧ, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C24143 c24143) {
        Iterator it = this.f76579.values().iterator();
        Iterator it2 = c24143.f76579.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iM18701 = ((C8050) it.next()).compareTo((C8050) it2.next());
            if (iM18701 != 0) {
                return iM18701;
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
        for (C8050 c8050 : this.f76579.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c8050.mo4819());
        }
        sb.append(C0249l.f1198d);
        return sb.toString();
    }

    public final int size() {
        return this.f76579.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53386(C8050 c8050) {
        m46001();
        if (c8050 == null) {
            throw new NullPointerException("annotation == null");
        }
        C14260 type = c8050.getType();
        TreeMap treeMap = this.f76579;
        if (treeMap.containsKey(type)) {
            throw new IllegalArgumentException("duplicate type: " + type.mo4819());
        }
        treeMap.put(type, c8050);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53387(C24143 c24143) {
        m46001();
        if (c24143 == null) {
            throw new NullPointerException("toAdd == null");
        }
        Iterator it = c24143.f76579.values().iterator();
        while (it.hasNext()) {
            m53386((C8050) it.next());
        }
    }

    public final Collection getAnnotations() {
        return C21562.unmodifiableCollection(this.f76579.values());
    }
}
