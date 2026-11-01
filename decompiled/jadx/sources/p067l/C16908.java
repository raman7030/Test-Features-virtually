package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܶܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: O8BF */
/* JADX INFO: loaded from: classes5.dex */
public final class C16908 implements InterfaceC3343 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C21604 f50063;

    public C16908(C21604 c21604) {
        this.f50063 = c21604;
    }

    @Override // p067l.InterfaceC3343
    public final void setTitle(int i) {
        this.f50063.m13472(R.string.MT_Protector);
    }

    @Override // p067l.InterfaceC3343
    public final void setName(String str) {
        this.f50063.mo25203(str);
    }

    @Override // p067l.InterfaceC3343
    /* JADX INFO: renamed from: ֫ */
    public final void mo5837(C22209 c22209) {
        this.f50063.mo25204(c22209);
    }

    @Override // p067l.InterfaceC3343
    /* JADX INFO: renamed from: ۖ֫ */
    public final void mo5838() {
        this.f50063.m48822(true);
    }

    @Override // p067l.InterfaceC3343
    /* JADX INFO: renamed from: ۧ */
    public final void mo5839(long j) {
        this.f50063.mo25202(j);
    }

    @Override // p067l.InterfaceC3343
    public final void setProgress(int i) {
        this.f50063.mo13474(i);
    }

    @Override // p067l.InterfaceC3343
    /* JADX INFO: renamed from: ֫ */
    public final void mo5836() {
        this.f50063.cancel();
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f50063.mo3924();
    }
}
