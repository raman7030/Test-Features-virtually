package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚۚ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q18Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5137 implements Iterable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC0197 f16075;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC0197 f16076;

    public C5137(AbstractC0197 abstractC0197, AbstractC0197 abstractC0198) {
        this.f16076 = abstractC0197;
        this.f16075 = abstractC0198;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0903(this.f16076, this.f16075);
    }
}
