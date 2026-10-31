package l;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷ۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes5.dex */
public final class C20816 extends AbstractC6704 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC9527 f67386;

    public C20816(AbstractC9527 abstractC9527) {
        this.f67386 = abstractC9527;
    }

    @Override // l.AbstractC6704
    /* JADX INFO: renamed from: ۧ */
    public final Map mo18265() {
        return this.f67386;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f67386.mo15281();
    }
}
