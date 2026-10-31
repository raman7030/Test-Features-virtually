package l;

/* JADX INFO: renamed from: l.᩷ۜۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M1KQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20710 extends AbstractC17370 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15063 f66696;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20710(C15063 c15063, AbstractActivityC3346 abstractActivityC3346, boolean z, String str) {
        super(abstractActivityC3346, z, str, "dex_search_match_case", "dex_search_regex", "dex_search_exactly_match");
        this.f66696 = c15063;
    }

    @Override // l.AbstractC17370
    /* JADX INFO: renamed from: ֫ */
    public final void mo5651() {
        C15063 c15063 = this.f66696;
        c15063.f45994 = false;
        C15063.m35612(c15063);
        c15063.f45999.notifyDataSetChanged();
    }

    @Override // l.AbstractC17370
    /* JADX INFO: renamed from: ֫ */
    public final void mo5652(C18076 c18076, String str) {
        new C9421(this.f66696, str, c18076).m20274();
    }
}
