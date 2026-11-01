package p067l;

/* JADX INFO: renamed from: l.ܺۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes4.dex */
public final class C17463 implements InterfaceC24424 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C16792 f52205;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean f52206;

    public C17463(C16792 c16792, boolean z) {
        this.f52205 = c16792;
        this.f52206 = z;
    }

    @Override // p067l.InterfaceC24424
    /* JADX INFO: renamed from: ֫ */
    public final void mo10533(String str) {
        C16792 c16792 = this.f52205;
        c16792.m38051();
        if (c16792.m38057()) {
            C16792.m38042(c16792, str, this.f52206);
        }
    }

    @Override // p067l.InterfaceC24424
    public final void onCanceled() {
        this.f52205.m38051();
    }
}
