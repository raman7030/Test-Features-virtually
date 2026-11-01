package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۙܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 98AW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6931 implements InterfaceC3343 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14977 f18034;

    public C6931(C14977 c14977) {
        this.f18034 = c14977;
    }

    @Override // p067l.InterfaceC3343
    public final void setTitle(int i) {
        this.f18034.m13472(R.string.MT_Protector);
    }

    @Override // p067l.InterfaceC3343
    public final void setName(String str) {
        this.f18034.mo25203(str);
    }

    @Override // p067l.InterfaceC3343
    /* JADX INFO: renamed from: ֫ */
    public final void mo5837(C22209 c22209) {
        this.f18034.mo25204(c22209);
    }

    @Override // p067l.InterfaceC3343
    /* JADX INFO: renamed from: ۖ֫ */
    public final void mo5838() {
        this.f18034.m48822(true);
    }

    @Override // p067l.InterfaceC3343
    /* JADX INFO: renamed from: ۧ */
    public final void mo5839(long j) {
        this.f18034.mo25202(j);
    }

    @Override // p067l.InterfaceC3343
    public final void setProgress(int i) {
        this.f18034.mo13474(i);
    }

    @Override // p067l.InterfaceC3343
    /* JADX INFO: renamed from: ֫ */
    public final void mo5836() {
        this.f18034.cancel();
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f18034.mo3924();
    }
}
