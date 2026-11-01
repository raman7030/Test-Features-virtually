package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩹ܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: O8BF */
/* JADX INFO: loaded from: classes2.dex */
public final class C23615 implements InterfaceC23460 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C21604 f75149;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean f75150;

    public C23615(C21604 c21604, boolean z) {
        this.f75149 = c21604;
        this.f75150 = z;
    }

    @Override // p067l.InterfaceC3343
    public final void setTitle(int i) {
        if (this.f75150 && i == R.string.MT_Protector) {
            i = R.string.MT_Protector;
        }
        this.f75149.m13472(i);
    }

    @Override // p067l.InterfaceC3343
    public final void setName(String str) {
        this.f75149.mo25203(str);
    }

    @Override // p067l.InterfaceC23460
    /* JADX INFO: renamed from: ۧ */
    public final void mo12137(boolean z) {
        this.f75149.m48821(z);
    }

    @Override // p067l.InterfaceC23460
    /* JADX INFO: renamed from: ۡ */
    public final void mo12136(String str) {
        this.f75149.mo13456(str);
    }

    @Override // p067l.InterfaceC3343
    /* JADX INFO: renamed from: ֫ */
    public final void mo5837(C22209 c22209) {
        this.f75149.mo25204(c22209);
    }

    @Override // p067l.InterfaceC3343
    /* JADX INFO: renamed from: ۖ֫ */
    public final void mo5838() {
        this.f75149.m48822(true);
    }

    @Override // p067l.InterfaceC3343
    /* JADX INFO: renamed from: ۧ */
    public final void mo5839(long j) {
        this.f75149.mo25202(j);
    }

    @Override // p067l.InterfaceC3343
    public final void setProgress(int i) {
        this.f75149.mo13474(i);
    }

    @Override // p067l.InterfaceC3343
    /* JADX INFO: renamed from: ֫ */
    public final void mo5836() {
        this.f75149.cancel();
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f75149.mo3924();
    }
}
