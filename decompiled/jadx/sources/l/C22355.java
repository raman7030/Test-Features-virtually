package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹ܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: O8BF */
/* JADX INFO: loaded from: classes2.dex */
public final class C22355 implements InterfaceC22192 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20239 f72423;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f72424;

    public C22355(C20239 c20239, boolean z) {
        this.f72423 = c20239;
        this.f72424 = z;
    }

    @Override // l.InterfaceC1025
    public final void setTitle(int i) {
        if (this.f72424 && i == R.string.MT_Protector) {
            i = R.string.MT_Protector;
        }
        this.f72423.m11536(i);
    }

    @Override // l.InterfaceC1025
    public final void setName(String str) {
        this.f72423.mo23259(str);
    }

    @Override // l.InterfaceC22192
    /* JADX INFO: renamed from: ۧ */
    public final void mo10101(boolean z) {
        this.f72423.m46500(z);
    }

    @Override // l.InterfaceC22192
    /* JADX INFO: renamed from: ۡ */
    public final void mo10100(String str) {
        this.f72423.mo11520(str);
    }

    @Override // l.InterfaceC1025
    /* JADX INFO: renamed from: ֫ */
    public final void mo3550(C20876 c20876) {
        this.f72423.mo23260(c20876);
    }

    @Override // l.InterfaceC1025
    /* JADX INFO: renamed from: ۖ֫ */
    public final void mo3551() {
        this.f72423.m46501(true);
    }

    @Override // l.InterfaceC1025
    /* JADX INFO: renamed from: ۧ */
    public final void mo3552(long j) {
        this.f72423.mo23258(j);
    }

    @Override // l.InterfaceC1025
    public final void setProgress(int i) {
        this.f72423.mo11538(i);
    }

    @Override // l.InterfaceC1025
    /* JADX INFO: renamed from: ֫ */
    public final void mo3549() {
        this.f72423.cancel();
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f72423.mo1526();
    }
}
