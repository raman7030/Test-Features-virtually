package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes5.dex */
public final class C16581 extends AbstractC6704 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17993 f50977;

    public C16581(AbstractC17993 abstractC17993) {
        this.f50977 = abstractC17993;
    }

    @Override // l.AbstractC6704
    /* JADX INFO: renamed from: ۧ */
    public final Map mo18265() {
        return this.f50977;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return ((C23472) this.f50977).f75319.mo15282();
    }
}
