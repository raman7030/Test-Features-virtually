package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۨ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SC */
/* JADX INFO: loaded from: classes4.dex */
public final class C11951 implements InterfaceC17242 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1742 f35715;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f35716;

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo4109(String str) {
    }

    public C11951(C1742 c1742, TextView textView) {
        this.f35715 = c1742;
        this.f35716 = textView;
    }

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ֫ */
    public final void mo4107(String str) {
        this.f35715.f6022.m51563(str);
    }

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ֫ */
    public final void mo4108(EnumC14419 enumC14419) {
        this.f35716.setVisibility(enumC14419.m34451() ? 4 : 0);
    }
}
