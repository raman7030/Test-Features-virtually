package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes3.dex */
public final class C9588 extends AbstractC21315 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29106;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f29107;

    public C9588(Iterable iterable, int i) {
        this.f29107 = iterable;
        this.f29106 = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f29107.iterator();
        it.getClass();
        int i = this.f29106;
        C4025.m12109("limit is negative", i >= 0);
        return new C19466(i, it);
    }
}
