package l;

/* JADX INFO: renamed from: l.֨ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1100 extends C22267 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22267 f4000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13758 f4001;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.AbstractMap, java.util.NavigableMap] */
    public C1100(C22267 c22267, C13758 c13758) {
        super(new C21562(C13758.m33070(), c13758, c22267.f72242, 0), 0);
        this.f4000 = c22267;
        this.f4001 = c13758;
    }

    @Override // l.C22267, l.InterfaceC1641
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13758 mo3772(Integer num) {
        C13758 c13758Mo3772;
        C13758 c13758 = this.f4001;
        if (c13758.m33073(num) && (c13758Mo3772 = this.f4000.mo3772(num)) != null) {
            return c13758Mo3772.m33076(c13758);
        }
        return null;
    }

    @Override // l.C22267
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3773(C13758 c13758) {
        C13758 c13759 = this.f4001;
        C4025.m12111(c13759.m33074(c13758), "Cannot add range %s to subRangeSet(%s)", c13758, c13759);
        this.f4000.mo3773(c13758);
    }

    @Override // l.C22267
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo3775(Integer num) {
        return this.f4001.m33073(num) && this.f4000.mo3775(num);
    }

    @Override // l.C22267
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1641 mo3774(C13758 c13758) {
        C13758 c13759 = this.f4001;
        if (c13758.m33074(c13759)) {
            return this;
        }
        if (c13758.m33078(c13759)) {
            return new C1100(this, c13759.m33076(c13758));
        }
        return C13134.m31853();
    }
}
