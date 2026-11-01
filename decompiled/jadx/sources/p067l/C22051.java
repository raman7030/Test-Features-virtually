package p067l;

/* JADX INFO: renamed from: l.᩷ۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C22051 extends AbstractC18877 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C16684 f69377;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22051(C16684 c16684, AbstractActivityC5549 abstractActivityC5549, boolean z, String str) {
        super(abstractActivityC5549, z, str, "dex_search_match_case", "dex_search_regex", "dex_search_exactly_match");
        this.f69377 = c16684;
    }

    @Override // p067l.AbstractC18877
    /* JADX INFO: renamed from: ֫ */
    public final void mo7881() {
        C16684 c16684 = this.f69377;
        c16684.f49112 = false;
        C16684.m37770(c16684);
        c16684.f49117.notifyDataSetChanged();
    }

    @Override // p067l.AbstractC18877
    /* JADX INFO: renamed from: ֫ */
    public final void mo7882(C19548 c19548, String str) {
        new C11322(this.f69377, str, c19548).m22250();
    }
}
