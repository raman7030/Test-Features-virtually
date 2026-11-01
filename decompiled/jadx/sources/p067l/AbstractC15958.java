package p067l;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܳۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: M3XQ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15958 implements InterfaceC2704 {

    /* JADX INFO: renamed from: ᩶ */
    public transient Collection f46209;

    /* JADX INFO: renamed from: ᩸ */
    public transient Map f46210;

    /* JADX INFO: renamed from: ᩹ */
    public transient Set f46211;

    /* JADX INFO: renamed from: ۧ */
    public abstract Map mo4366();

    /* JADX INFO: renamed from: ܽ */
    public abstract Set mo4367();

    /* JADX INFO: renamed from: ᩳ */
    public abstract Collection mo4368();

    /* JADX INFO: renamed from: ֫ */
    public boolean mo4365(Object obj) {
        Iterator it = mo3628().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ */
    public Set m36253() {
        Set set = this.f46211;
        if (set != null) {
            return set;
        }
        Set setMo4367 = mo4367();
        this.f46211 = setMo4367;
        return setMo4367;
    }

    @Override // p067l.InterfaceC2704
    public Collection values() {
        Collection collection = this.f46209;
        if (collection != null) {
            return collection;
        }
        Collection collectionMo4368 = mo4368();
        this.f46209 = collectionMo4368;
        return collectionMo4368;
    }

    @Override // p067l.InterfaceC2704
    /* JADX INFO: renamed from: ֫ */
    public Map mo3628() {
        Map map = this.f46210;
        if (map != null) {
            return map;
        }
        Map mapMo4366 = mo4366();
        this.f46210 = mapMo4366;
        return mapMo4366;
    }

    public int hashCode() {
        return mo3628().hashCode();
    }

    public String toString() {
        return mo3628().toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC2704) {
            return mo3628().equals(((InterfaceC2704) obj).mo3628());
        }
        return false;
    }
}
