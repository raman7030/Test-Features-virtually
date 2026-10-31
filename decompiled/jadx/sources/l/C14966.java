package l;

import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.ܶۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14966 implements InterfaceC12846, InterfaceC8017 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f45622;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f45623;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f45624;

    public /* synthetic */ C14966(Object obj, Object obj2, Object obj3) {
        this.f45623 = obj;
        this.f45624 = obj2;
        this.f45622 = obj3;
    }

    @Override // l.InterfaceC12846
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC12846
    /* JADX INFO: renamed from: ֫ */
    public void mo3776(C11667 c11667, boolean z) {
        C18781.m43439((C18781) this.f45623, (C13876) this.f45624, (Main) this.f45622, c11667, z);
    }

    @Override // l.InterfaceC12846
    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ boolean mo3777(Exception exc) {
        return false;
    }

    @Override // l.InterfaceC8017
    /* JADX INFO: renamed from: ۧ */
    public void mo4663(Object obj, Throwable th) {
        ((C23721) this.f45623).f76806.m25281((RunnableC21318) new Runnable() { // from class: l.᩸ۗᩳ
            @Override // java.lang.Runnable
            public final void run() {
                c7247.m19388(c1143);
            }
        });
    }
}
