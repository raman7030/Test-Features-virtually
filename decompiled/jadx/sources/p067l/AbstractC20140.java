package p067l;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20140 extends AbstractMap {

    /* JADX INFO: renamed from: ᩸ */
    public transient Set f62353;

    /* JADX INFO: renamed from: ᩹ */
    public transient Collection f62354;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f62353;
        if (set != null) {
            return set;
        }
        C23098 c23098 = new C23098((C21757) this);
        this.f62353 = c23098;
        return c23098;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f62354;
        if (collection != null) {
            return collection;
        }
        C6058 c6058 = new C6058(this);
        this.f62354 = c6058;
        return c6058;
    }
}
