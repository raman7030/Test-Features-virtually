package l;

import android.animation.ObjectAnimator;

/* JADX INFO: renamed from: l.᩶ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes5.dex */
public final class C20357 implements InterfaceC17242 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5561 f65728;

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ void mo4109(String str) {
    }

    public C20357(C5561 c5561) {
        this.f65728 = c5561;
    }

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ֫ */
    public final void mo4107(String str) {
        C5561.m15768(this.f65728, str);
    }

    @Override // l.InterfaceC17242
    /* JADX INFO: renamed from: ֫ */
    public final void mo4108(EnumC14419 enumC14419) {
        boolean zM34450 = enumC14419.m34450();
        C5561 c5561 = this.f65728;
        if (zM34450 && c5561.f17226.m35121() == 1.0f) {
            C0621 c0621 = new C0621(c5561.f17220, c5561.f17238, c5561.f17234);
            c0621.setAlpha(0.0f);
            ObjectAnimator.ofFloat(c0621, "alpha", 0.0f, 1.0f).setDuration(200L).start();
        }
        c5561.m15773(enumC14419.m34451());
    }
}
