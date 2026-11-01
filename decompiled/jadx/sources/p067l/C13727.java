package p067l;

import android.widget.TextView;

/* JADX INFO: renamed from: l.ۨ᩷ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SC */
/* JADX INFO: loaded from: classes4.dex */
public final class C13727 implements InterfaceC18755 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C4024 f38726;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ TextView f38727;

    @Override // p067l.InterfaceC18755
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo6353(String str) {
    }

    public C13727(C4024 c4024, TextView textView) {
        this.f38726 = c4024;
        this.f38727 = textView;
    }

    @Override // p067l.InterfaceC18755
    /* JADX INFO: renamed from: ֫ */
    public final void mo6351(String str) {
        this.f38726.f8799.m53960(str);
    }

    @Override // p067l.InterfaceC18755
    /* JADX INFO: renamed from: ֫ */
    public final void mo6352(EnumC16072 enumC16072) {
        this.f38727.setVisibility(enumC16072.m36584() ? 4 : 0);
    }
}
