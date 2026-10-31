package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶܳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: O8BF */
/* JADX INFO: loaded from: classes5.dex */
public final class C15298 implements InterfaceC1025 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20239 f46937;

    public C15298(C20239 c20239) {
        this.f46937 = c20239;
    }

    @Override // l.InterfaceC1025
    public final void setTitle(int i) {
        this.f46937.m11536(R.string.MT_Protector);
    }

    @Override // l.InterfaceC1025
    public final void setName(String str) {
        this.f46937.mo23259(str);
    }

    @Override // l.InterfaceC1025
    /* JADX INFO: renamed from: ֫ */
    public final void mo3550(C20876 c20876) {
        this.f46937.mo23260(c20876);
    }

    @Override // l.InterfaceC1025
    /* JADX INFO: renamed from: ۖ֫ */
    public final void mo3551() {
        this.f46937.m46501(true);
    }

    @Override // l.InterfaceC1025
    /* JADX INFO: renamed from: ۧ */
    public final void mo3552(long j) {
        this.f46937.mo23258(j);
    }

    @Override // l.InterfaceC1025
    public final void setProgress(int i) {
        this.f46937.mo11538(i);
    }

    @Override // l.InterfaceC1025
    /* JADX INFO: renamed from: ֫ */
    public final void mo3549() {
        this.f46937.cancel();
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f46937.mo1526();
    }
}
