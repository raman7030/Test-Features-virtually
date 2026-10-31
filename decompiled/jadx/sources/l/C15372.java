package l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ܶܿۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBMC */
/* JADX INFO: loaded from: classes4.dex */
public final class C15372 implements InterfaceC17242 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC20313 f47087;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f47088;

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo4109(String str) {
    }

    public C15372(ViewOnClickListenerC20313 viewOnClickListenerC20313, TextView textView) {
        this.f47087 = viewOnClickListenerC20313;
        this.f47088 = textView;
    }

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ֫ */
    public final void mo4107(String str) {
        this.f47087.f65602.m49051(str);
    }

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ֫ */
    public final void mo4108(EnumC14419 enumC14419) {
        this.f47088.setVisibility(enumC14419.m34451() ? 4 : 0);
    }
}
