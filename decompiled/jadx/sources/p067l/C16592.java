package p067l;

import bin.p000mt.plus.Main;

/* JADX INFO: renamed from: l.ܶۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6U1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16592 implements InterfaceC14577, InterfaceC9988 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f48733;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f48734;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f48735;

    public /* synthetic */ C16592(Object obj, Object obj2, Object obj3) {
        this.f48734 = obj;
        this.f48735 = obj2;
        this.f48733 = obj3;
    }

    @Override // p067l.InterfaceC14577
    public /* synthetic */ void onCanceled() {
    }

    @Override // p067l.InterfaceC14577
    /* JADX INFO: renamed from: ֫ */
    public void mo6049(C13457 c13457, boolean z) {
        C20218.m45707((C20218) this.f48734, (C15556) this.f48735, (Main) this.f48733, c13457, z);
    }

    @Override // p067l.InterfaceC14577
    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ boolean mo6050(Exception exc) {
        return false;
    }

    @Override // p067l.InterfaceC9988
    /* JADX INFO: renamed from: ۧ */
    public void mo6895(Object obj, Throwable th) {
        ((C24913) this.f48734).f79555.m27298((RunnableC22629) new Runnable() { // from class: l.᩸ۗᩳ
            @Override // java.lang.Runnable
            public final void run() {
                c9256.m21337(c3455);
            }
        });
    }
}
