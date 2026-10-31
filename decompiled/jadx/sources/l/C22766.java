package l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22766 extends AbstractSet {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16374 f73516;

    public C22766(C16374 c16374) {
        this.f73516 = c16374;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f73516.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f73516.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C16374 c16374 = this.f73516;
        Map mapM38562 = c16374.m38562();
        if (mapM38562 != null) {
            return mapM38562.entrySet().contains(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int iM38541 = c16374.m38541(entry.getKey());
        return iM38541 != -1 && C11003.equals(C16374.m38551(c16374, iM38541), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C16374 c16374 = this.f73516;
        Map mapM38562 = c16374.m38562();
        if (mapM38562 != null) {
            return mapM38562.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (c16374.m38567()) {
            return false;
        }
        int iM38559 = c16374.m38559();
        int iM41666 = C17786.m41666(entry.getKey(), entry.getValue(), iM38559, C16374.m38550(c16374), c16374.m38547(), c16374.m38553(), c16374.m38546());
        if (iM41666 == -1) {
            return false;
        }
        c16374.m38563(iM41666, iM38559);
        C16374.m38552(c16374);
        c16374.m38565();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C16374 c16374 = this.f73516;
        Map mapM38562 = c16374.m38562();
        if (mapM38562 != null) {
            return mapM38562.entrySet().iterator();
        }
        return new C5833(c16374);
    }
}
