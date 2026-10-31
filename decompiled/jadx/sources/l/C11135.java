package l;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AZL */
/* JADX INFO: loaded from: classes3.dex */
public final class C11135 extends AbstractSet {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23834 f33416;

    public C11135(C23834 c23834) {
        this.f33416 = c23834;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33416.f77120;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1962(this.f33416);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C14661 c14661M52529;
        if (obj instanceof Map.Entry) {
            C23834 c23834 = this.f33416;
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            C14661 c14661 = null;
            if (key != null) {
                try {
                    c14661M52529 = c23834.m52529(key, false);
                } catch (ClassCastException unused) {
                    c14661M52529 = null;
                }
            } else {
                c14661M52529 = null;
            }
            if (c14661M52529 != null && C11003.equals(c14661M52529.f44806, entry.getValue())) {
                c14661 = c14661M52529;
            }
            if (c14661 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C14661 c14661M52529;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            C23834 c23834 = this.f33416;
            C14661 c14661 = null;
            if (key != null) {
                try {
                    c14661M52529 = c23834.m52529(key, false);
                } catch (ClassCastException unused) {
                    c14661M52529 = null;
                }
            } else {
                c14661M52529 = null;
            }
            if (c14661M52529 != null && C11003.equals(c14661M52529.f44806, entry.getValue())) {
                c14661 = c14661M52529;
            }
            if (c14661 != null) {
                c23834.m52530(c14661, true);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f33416.clear();
    }
}
