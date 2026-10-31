package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0806 implements Iterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f2942;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC19810 f2944;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2609 f2943 = C2609.m8239();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC19810 f2945 = null;

    public C0806(C22406 c22406, AbstractC4308 abstractC4308) {
        this.f2942 = c22406;
        this.f2944 = m3041(abstractC4308);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC19810 abstractC19810 = this.f2944;
        C22406 c22406 = this.f2942;
        if (abstractC19810 == c22406.f72605.f66475) {
            this.f2944 = m3041(c22406.f72597.m17562(this.f2945.f17560));
        }
        return this.f2944 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC19810 abstractC19810 = this.f2944;
        this.f2945 = abstractC19810;
        AbstractC19810 abstractC19811 = this.f2942.f72605.f66475;
        this.f2944 = abstractC19811;
        C12171.m29642((abstractC19810 == null && abstractC19810 == abstractC19811) ? false : true);
        return this.f2945;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC19810 m3041(AbstractC4308 abstractC4308) {
        if (!abstractC4308.m12913(EnumC9454.CLASS) && !abstractC4308.m12913(EnumC9454.TYPEVAR)) {
            return null;
        }
        AbstractC4308 abstractC4308M17526 = this.f2942.f72597.m17526(abstractC4308, false);
        if (this.f2943.contains(abstractC4308M17526.f13890)) {
            return null;
        }
        this.f2943 = this.f2943.m8246(abstractC4308M17526.f13890);
        return abstractC4308M17526.f13890;
    }
}
