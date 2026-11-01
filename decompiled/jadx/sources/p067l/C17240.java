package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܺۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBDM */
/* JADX INFO: loaded from: classes4.dex */
public final class C17240 implements InterfaceC12587 {

    /* JADX INFO: renamed from: ֫ */
    public int f51306 = 0;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C4501 f51307;

    public C17240(C4501 c4501) {
        this.f51307 = c4501;
    }

    @Override // p067l.InterfaceC12587
    /* JADX INFO: renamed from: ֫ */
    public final void mo26104(C17950 c17950, C17950 c17951) {
        C10536 c10536 = new C10536();
        c10536.f29158 = new ArrayList();
        int i = this.f51306 + 1;
        this.f51306 = i;
        c10536.f29160 = i;
        c10536.f29161 = c17950;
        c10536.f29159 = c17951;
        C4501 c4501 = this.f51307;
        c4501.f10104.add(c17950);
        c4501.f10103[c17950.m40826()] = c10536;
    }
}
