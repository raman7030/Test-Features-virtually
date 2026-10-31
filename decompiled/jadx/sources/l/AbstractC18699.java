package l;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18699 extends AbstractMap {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient Set f59130;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient Collection f59131;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f59130;
        if (set != null) {
            return set;
        }
        C21811 c21811 = new C21811((C20400) this);
        this.f59130 = c21811;
        return c21811;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f59131;
        if (collection != null) {
            return collection;
        }
        C3882 c3882 = new C3882(this);
        this.f59131 = c3882;
        return c3882;
    }
}
