package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9MW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14908 implements InterfaceC8559 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f45475 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21260 f45476;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f45477;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f45478;

    public C14908(C21260 c21260, C13621 c13621) {
        this.f45476 = c21260;
        this.f45477 = c13621.m32741();
    }

    @Override // l.InterfaceC8559
    /* JADX INFO: renamed from: ֫ */
    public final void mo17795(int i) {
        long j = this.f45475 + ((long) i);
        this.f45475 = j;
        long j2 = this.f45477;
        if (j2 > 0) {
            this.f45476.f68589.m49549(j, j2);
        }
    }

    @Override // l.InterfaceC8559
    /* JADX INFO: renamed from: ۧ */
    public final void mo17796(int i) {
        boolean z = this.f45478;
        C21260 c21260 = this.f45476;
        if (!z) {
            this.f45478 = true;
            c21260.f68589.m49558(R.string.MT_Protector);
        }
        c21260.f68589.m49553(i);
    }

    @Override // l.InterfaceC8559
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo17797() {
        return this.f45476.f68589.m51053();
    }
}
