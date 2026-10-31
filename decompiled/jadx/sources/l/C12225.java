package l;

import android.widget.Spinner;

/* JADX INFO: renamed from: l.۫ۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes4.dex */
public final class C12225 implements InterfaceC23679 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f36460;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f36461;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f36462;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2978 f36463;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9569 f36464;

    public C12225(Spinner spinner, Spinner spinner2, C2978 c2978, C2978 c2979, C9569 c9569) {
        this.f36461 = spinner;
        this.f36462 = spinner2;
        this.f36463 = c2978;
        this.f36460 = c2979;
        this.f36464 = c9569;
    }

    @Override // l.InterfaceC23679
    /* JADX INFO: renamed from: ֫ */
    public final C16955 mo28353() {
        String strMo10324 = ((AbstractC13262) C8863.f26982.get(this.f36461.getSelectedItemPosition())).mo10324();
        EnumC8139 enumC8139 = EnumC8139.values()[this.f36462.getSelectedItemPosition()];
        C2978 c2978 = this.f36463;
        String str = c2978.isChecked() ? (String) c2978.getTag() : null;
        String str2 = (str == null || !str.isEmpty()) ? str : null;
        C2978 c2979 = this.f36460;
        return new C16955(strMo10324, enumC8139, str2, c2979 != null && c2979.isChecked());
    }

    @Override // l.InterfaceC23679
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo28355() {
        return C9569.m24446(this.f36464);
    }

    @Override // l.InterfaceC23679
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo28357() {
        return C9569.m24449(this.f36464);
    }

    @Override // l.InterfaceC23679
    /* JADX INFO: renamed from: ܿ */
    public final C21730 mo28356() {
        return C9569.m24448(this.f36464);
    }

    @Override // l.InterfaceC23679
    /* JADX INFO: renamed from: ֫ */
    public final void mo28354(Runnable runnable) {
        C9569.m24445(this.f36464, runnable);
    }
}
