package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۛۢܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5A8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8050 extends C20376 implements Comparable, InterfaceC2940 {

    /* JADX INFO: renamed from: ۙ */
    public final EnumC13415 f21214;

    /* JADX INFO: renamed from: ᩶ */
    public final C14260 f21215;

    /* JADX INFO: renamed from: ᩹ */
    public final TreeMap f21216;

    public C8050(C14260 c14260, EnumC13415 enumC13415) {
        if (c14260 == null) {
            throw new NullPointerException("type == null");
        }
        if (enumC13415 == null) {
            throw new NullPointerException("visibility == null");
        }
        this.f21215 = c14260;
        this.f21214 = enumC13415;
        this.f21216 = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8050)) {
            return false;
        }
        C8050 c8050 = (C8050) obj;
        if (this.f21215.equals(c8050.f21215) && this.f21214 == c8050.f21214) {
            return this.f21216.equals(c8050.f21216);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21214.hashCode() + ((this.f21216.hashCode() + (this.f21215.hashCode() * 31)) * 31);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C8050 c8050) {
        int iCompareTo = this.f21215.compareTo((AbstractC15405) c8050.f21215);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f21214.compareTo(c8050.f21214);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        Iterator it = this.f21216.values().iterator();
        Iterator it2 = c8050.f21216.values().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo3 = ((C9391) it.next()).compareTo((C9391) it2.next());
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
        return mo4819();
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21214.mo4819());
        sb.append("-annotation ");
        sb.append(this.f21215.mo4819());
        sb.append(" {");
        boolean z = true;
        for (C9391 c9391 : this.f21216.values()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c9391.getName().mo4819());
            sb.append(": ");
            sb.append(c9391.getValue().mo4819());
        }
        sb.append(C0249l.f1198d);
        return sb.toString();
    }

    public final C14260 getType() {
        return this.f21215;
    }

    public final EnumC13415 getVisibility() {
        return this.f21214;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18704(C9391 c9391) {
        m46001();
        this.f21216.put(c9391.getName(), c9391);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18702(C9391 c9391) {
        m46001();
        C14930 name = c9391.getName();
        TreeMap treeMap = this.f21216;
        if (treeMap.get(name) != null) {
            throw new IllegalArgumentException("name already added: " + name);
        }
        treeMap.put(name, c9391);
    }

    /* JADX INFO: renamed from: ۚ */
    public final Collection m18703() {
        return C21562.unmodifiableCollection(this.f21216.values());
    }
}
