package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ܽ۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes4.dex */
public final class C18070 implements InterfaceC18755 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C8683 f53969;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ View f53970;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ View f53971;

    @Override // p067l.InterfaceC18755
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo6353(String str) {
    }

    public C18070(C8683 c8683, View view, View view2) {
        this.f53969 = c8683;
        this.f53970 = view;
        this.f53971 = view2;
    }

    @Override // p067l.InterfaceC18755
    /* JADX INFO: renamed from: ֫ */
    public final void mo6351(String str) {
        this.f53969.m20114(str);
    }

    @Override // p067l.InterfaceC18755
    /* JADX INFO: renamed from: ֫ */
    public final void mo6352(EnumC16072 enumC16072) {
        boolean zM36584 = enumC16072.m36584();
        View view = this.f53971;
        View view2 = this.f53970;
        if (zM36584) {
            view2.setVisibility(8);
            view.setVisibility(4);
        } else {
            view2.setVisibility(0);
            view.setVisibility(0);
        }
    }
}
