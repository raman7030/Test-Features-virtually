package p067l;

/* JADX INFO: renamed from: l.۫ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81VV */
/* JADX INFO: loaded from: classes4.dex */
public class C14127 implements InterfaceC14797 {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f40118;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC14797 f40119;

    public C14127(InterfaceC14797 interfaceC14797) {
        this.f40119 = interfaceC14797;
    }

    @Override // p067l.InterfaceC14797
    /* JADX INFO: renamed from: ۙ */
    public void mo14983() {
        this.f40118 = false;
        this.f40119.mo14983();
    }

    @Override // p067l.InterfaceC14797
    /* JADX INFO: renamed from: ֫ */
    public final void mo14982(boolean z, boolean z2) {
        this.f40118 = true;
        this.f40119.mo14982(z, z2);
    }

    @Override // p067l.InterfaceC14797
    /* JADX INFO: renamed from: ֫ */
    public final void mo14981(int i, int i2) {
        float f = i2;
        this.f40119.mo14981(i, (int) (this.f40118 ? (f * 0.3f) + 70.0f : f * 0.7f));
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f40119.mo3924();
    }
}
