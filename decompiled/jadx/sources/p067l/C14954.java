package p067l;

/* JADX INFO: renamed from: l.۬ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBSC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14954 extends AbstractC25033 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C14284 f42699;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14954(C14284 c14284) {
        super(c14284.f7212);
        this.f42699 = c14284;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14954(C14284 c14284, int i, int i2) {
        super(i, i2);
        this.f42699 = c14284;
    }

    @Override // p067l.AbstractC25033
    /* JADX INFO: renamed from: ۧ */
    public final int mo23876() {
        return this.f42699.f7211;
    }

    @Override // p067l.AbstractC19669
    /* JADX INFO: renamed from: ֫ */
    public final float mo23874(int i) {
        return this.f42699.f40688.f34289[i];
    }

    @Override // p067l.AbstractC19669
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC18327 mo23875(int i, int i2) {
        return new C14954(this.f42699, i, i2);
    }

    @Override // p067l.AbstractC19669, p067l.InterfaceC3437
    /* JADX INFO: renamed from: ۧ */
    public final boolean tryAdvance(InterfaceC6278 interfaceC6278) {
        if (this.f59802 >= mo44679()) {
            return false;
        }
        float[] fArr = this.f42699.f40688.f34289;
        int i = this.f59802;
        this.f59802 = i + 1;
        interfaceC6278.mo14251(fArr[i]);
        return true;
    }

    @Override // p067l.AbstractC19669, p067l.AbstractC23672, p067l.InterfaceC3437
    /* JADX INFO: renamed from: ֫ */
    public final void forEachRemaining(InterfaceC6278 interfaceC6278) {
        float[] fArr = this.f42699.f40688.f34289;
        int iMo44679 = mo44679();
        while (true) {
            int i = this.f59802;
            if (i >= iMo44679) {
                return;
            }
            this.f59802 = i + 1;
            interfaceC6278.mo14251(fArr[i]);
        }
    }
}
