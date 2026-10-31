package l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M3XQ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14299 implements InterfaceC0353 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient Collection f43117;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient Map f43118;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient Set f43119;

    /* JADX INFO: renamed from: ۧ */
    public abstract Map mo1990();

    /* JADX INFO: renamed from: ܽ */
    public abstract Set mo1991();

    /* JADX INFO: renamed from: ᩳ */
    public abstract Collection mo1992();

    /* JADX INFO: renamed from: ֫ */
    public boolean mo1989(Object obj) {
        Iterator it = mo1226().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Set m34120() {
        Set set = this.f43119;
        if (set != null) {
            return set;
        }
        Set setMo1991 = mo1991();
        this.f43119 = setMo1991;
        return setMo1991;
    }

    @Override // l.InterfaceC0353
    public Collection values() {
        Collection collection = this.f43117;
        if (collection != null) {
            return collection;
        }
        Collection collectionMo1992 = mo1992();
        this.f43117 = collectionMo1992;
        return collectionMo1992;
    }

    @Override // l.InterfaceC0353
    /* JADX INFO: renamed from: ֫ */
    public Map mo1226() {
        Map map = this.f43118;
        if (map != null) {
            return map;
        }
        Map mapMo1990 = mo1990();
        this.f43118 = mapMo1990;
        return mapMo1990;
    }

    public int hashCode() {
        return mo1226().hashCode();
    }

    public String toString() {
        return mo1226().toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC0353) {
            return mo1226().equals(((InterfaceC0353) obj).mo1226());
        }
        return false;
    }
}
