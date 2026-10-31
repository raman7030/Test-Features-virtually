package l;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩴۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18740 extends AbstractC22020 implements Set {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Collection f59223;

    public C18740(Collection collection) {
        this.f59223 = collection;
    }

    @Override // l.AbstractC4381
    /* JADX INFO: renamed from: ܿ */
    public final Object mo13120() {
        return this.f59223;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C15045.m35584(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return C15045.m35589(this, obj);
    }
}
