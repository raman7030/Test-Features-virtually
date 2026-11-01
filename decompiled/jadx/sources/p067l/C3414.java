package p067l;

/* JADX INFO: renamed from: l.֨ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5F3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3414 extends C23531 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C23531 f6771;

    /* JADX INFO: renamed from: ᩶ */
    public final C15444 f6772;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.AbstractMap, java.util.NavigableMap] */
    public C3414(C23531 c23531, C15444 c15444) {
        super(new C22861(C15444.m35185(), c15444, c23531.f74966, 0), 0);
        this.f6771 = c23531;
        this.f6772 = c15444;
    }

    @Override // p067l.C23531, p067l.InterfaceC3928
    /* JADX INFO: renamed from: ֫ */
    public final C15444 mo6045(Integer num) {
        C15444 c15444Mo6045;
        C15444 c15444 = this.f6772;
        if (c15444.m35188(num) && (c15444Mo6045 = this.f6771.mo6045(num)) != null) {
            return c15444Mo6045.m35191(c15444);
        }
        return null;
    }

    @Override // p067l.C23531
    /* JADX INFO: renamed from: ֫ */
    public final void mo6046(C15444 c15444) {
        C15444 c15445 = this.f6772;
        C6194.m14031(c15445.m35189(c15444), "Cannot add range %s to subRangeSet(%s)", c15444, c15445);
        this.f6771.mo6046(c15444);
    }

    @Override // p067l.C23531
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6048(Integer num) {
        return this.f6772.m35188(num) && this.f6771.mo6048(num);
    }

    @Override // p067l.C23531
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC3928 mo6047(C15444 c15444) {
        C15444 c15445 = this.f6772;
        if (c15444.m35189(c15445)) {
            return this;
        }
        if (c15444.m35193(c15445)) {
            return new C3414(this, c15445.m35191(c15444));
        }
        return C14851.m33945();
    }
}
