package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܽ۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes4.dex */
public final class C16521 implements InterfaceC17242 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6644 f50791;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f50792;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f50793;

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo4109(String str) {
    }

    public C16521(C6644 c6644, View view, View view2) {
        this.f50791 = c6644;
        this.f50792 = view;
        this.f50793 = view2;
    }

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ֫ */
    public final void mo4107(String str) {
        this.f50791.m18162(str);
    }

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ֫ */
    public final void mo4108(EnumC14419 enumC14419) {
        boolean zM34451 = enumC14419.m34451();
        View view = this.f50793;
        View view2 = this.f50792;
        if (zM34451) {
            view2.setVisibility(8);
            view.setVisibility(4);
        } else {
            view2.setVisibility(0);
            view.setVisibility(0);
        }
    }
}
