package p067l;

/* JADX INFO: renamed from: l.ۙۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AJ5 */
/* JADX INFO: loaded from: classes3.dex */
public class C6727 implements InterfaceC22898 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f17457;

    /* JADX INFO: renamed from: ۙ */
    public boolean f17458;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f17459;

    /* JADX INFO: renamed from: ᩸ */
    public int f17460;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f17461 = false;

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public C6727(boolean z) {
        boolean z2;
        if (C23219.m51754()) {
            z2 = C7050.f18355.getBoolean("def_mov_recycle_bin", true);
        }
        this.f17457 = z2;
        this.f17460 = 0;
        this.f17458 = z;
    }

    @Override // p067l.InterfaceC22898
    /* JADX INFO: renamed from: ܿ֫ */
    public void mo15384() {
        this.f17458 = true;
    }

    @Override // p067l.InterfaceC22898
    /* JADX INFO: renamed from: ᩵ */
    public boolean mo15385() {
        return !this.f17461;
    }

    @Override // p067l.InterfaceC22898
    /* JADX INFO: renamed from: ֫ */
    public boolean mo15381(boolean z) {
        return z || mo15385();
    }

    @Override // p067l.InterfaceC22898
    /* JADX INFO: renamed from: ܶ */
    public boolean mo15383() {
        return this.f17457;
    }

    @Override // p067l.InterfaceC22898
    /* JADX INFO: renamed from: ֫ */
    public void mo15380(String str, C23568 c23568, C23568 c23569, boolean z) {
        this.f17459 = !new C22821(this, str, c23568, c23569, z).m23820(new C17589());
    }

    @Override // p067l.InterfaceC22898
    /* JADX INFO: renamed from: ֫ */
    public int mo15379(String str, C23568 c23568, C23568 c23569, boolean z, boolean z2) {
        if (!z2) {
            return C6406.m14668(this, str, c23568, c23569, z, false);
        }
        int[] iArr = {1};
        boolean zM23820 = new C21480(this, str, c23568, c23569, this.f17460, iArr).m23820(new C17589());
        this.f17459 = !zM23820;
        if (zM23820) {
            return iArr[0];
        }
        return 1;
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public boolean mo3924() {
        return this.f17459;
    }

    @Override // p067l.InterfaceC22898
    /* JADX INFO: renamed from: ۬ */
    public int mo15382() {
        return this.f17460;
    }
}
