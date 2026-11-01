package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܶ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9MW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16537 implements InterfaceC10503 {

    /* JADX INFO: renamed from: ֫ */
    public long f48590 = 0;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C22574 f48591;

    /* JADX INFO: renamed from: ܽ */
    public long f48592;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f48593;

    public C16537(C22574 c22574, C15314 c15314) {
        this.f48591 = c22574;
        this.f48592 = c15314.m34855();
    }

    @Override // p067l.InterfaceC10503
    /* JADX INFO: renamed from: ֫ */
    public final void mo19742(int i) {
        long j = this.f48590 + ((long) i);
        this.f48590 = j;
        long j2 = this.f48592;
        if (j2 > 0) {
            this.f48591.f71272.m51885(j, j2);
        }
    }

    @Override // p067l.InterfaceC10503
    /* JADX INFO: renamed from: ۧ */
    public final void mo19743(int i) {
        boolean z = this.f48593;
        C22574 c22574 = this.f48591;
        if (!z) {
            this.f48593 = true;
            c22574.f71272.m51894(R.string.MT_Protector);
        }
        c22574.f71272.m51889(i);
    }

    @Override // p067l.InterfaceC10503
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo19744() {
        return this.f48591.f71272.m53444();
    }
}
