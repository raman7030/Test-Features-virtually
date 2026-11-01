package p067l;

/* JADX INFO: renamed from: l.ᩳ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19396 extends AbstractC18877 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C20738 f57909;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19396(C20738 c20738, AbstractActivityC5549 abstractActivityC5549, boolean z, String str) {
        super(abstractActivityC5549, z, str, "dex_search_match_case", "dex_search_regex", "dex_search_exactly_match");
        this.f57909 = c20738;
    }

    @Override // p067l.AbstractC18877
    /* JADX INFO: renamed from: ֫ */
    public final void mo7881() {
        C20738 c20738 = this.f57909;
        c20738.f63992 = false;
        C20738.m46823(c20738);
        c20738.f63997.notifyDataSetChanged();
    }

    @Override // p067l.AbstractC18877
    /* JADX INFO: renamed from: ֫ */
    public final void mo7882(C19548 c19548, String str) {
        new C18725(this.f57909, str, c19548).m22250();
    }
}
