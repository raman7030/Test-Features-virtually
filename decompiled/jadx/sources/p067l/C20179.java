package p067l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20179 extends AbstractC23296 implements Set {

    /* JADX INFO: renamed from: ᩸ */
    public final Collection f62446;

    public C20179(Collection collection) {
        this.f62446 = collection;
    }

    @Override // p067l.AbstractC6532
    /* JADX INFO: renamed from: ܿ */
    public final Object mo14984() {
        return this.f62446;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C16667.m37742(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return C16667.m37747(this, obj);
    }
}
