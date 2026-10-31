package l;

import com.alipay.sdk.m.y.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۛۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5A8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5978 extends C18947 implements Comparable, InterfaceC0601 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC11623 f18362;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12512 f18363;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TreeMap f18364;

    public C5978(C12512 c12512, EnumC11623 enumC11623) {
        if (c12512 == null) {
            throw new NullPointerException("type == null");
        }
        if (enumC11623 == null) {
            throw new NullPointerException("visibility == null");
        }
        this.f18363 = c12512;
        this.f18362 = enumC11623;
        this.f18364 = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5978)) {
            return false;
        }
        C5978 c5978 = (C5978) obj;
        if (this.f18363.equals(c5978.f18363) && this.f18362 == c5978.f18362) {
            return this.f18364.equals(c5978.f18364);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18362.hashCode() + ((this.f18364.hashCode() + (this.f18363.hashCode() * 31)) * 31);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C5978 c5978) {
        int iCompareTo = this.f18363.compareTo((AbstractC13717) c5978.f18363);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f18362.compareTo(c5978.f18362);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        Iterator it = this.f18364.values().iterator();
        Iterator it2 = c5978.f18364.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo3 = ((C7389) it.next()).compareTo((C7389) it2.next());
            if (iCompareTo3 != 0) {
                return iCompareTo3;
            }
        }
        if (it.hasNext()) {
            return 1;
        }
        return it2.hasNext() ? -1 : 0;
    }

    public final String toString() {
        return mo2463();
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18362.mo2463());
        sb.append("-annotation ");
        sb.append(this.f18363.mo2463());
        sb.append(" {");
        boolean z = true;
        for (C7389 c7389 : this.f18364.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c7389.getName().mo2463());
            sb.append(": ");
            sb.append(c7389.getValue().mo2463());
        }
        sb.append(l.d);
        return sb.toString();
    }

    public final C12512 getType() {
        return this.f18363;
    }

    public final EnumC11623 getVisibility() {
        return this.f18362;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16778(C7389 c7389) {
        m43734();
        this.f18364.put(c7389.getName(), c7389);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16776(C7389 c7389) {
        m43734();
        C13217 name = c7389.getName();
        TreeMap treeMap = this.f18364;
        if (treeMap.get(name) != null) {
            throw new IllegalArgumentException("name already added: " + name);
        }
        treeMap.put(name, c7389);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Collection m16777() {
        return C20195.unmodifiableCollection(this.f18364.values());
    }
}
