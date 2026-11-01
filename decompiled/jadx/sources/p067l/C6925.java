package p067l;

/* JADX INFO: renamed from: l.ۙܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4TR */
/* JADX INFO: loaded from: classes3.dex */
public final class C6925 extends AbstractC8286 {

    /* JADX INFO: renamed from: ۗ */
    public C5584 f18027;

    public C6925(C20337 c20337, int i, int i2, int i3) {
        super(c20337);
        this.f21938 = i;
        this.f21935 = i2;
        this.f21936 = i3;
    }

    public C6925(C20337 c20337, String str, C23198[] c23198Arr, int i) {
        super(c20337);
        this.f18027 = ((C10949) super.mo3907()).mo16869().m34278(str, c23198Arr);
        this.f21935 = 3;
        this.f21936 = i;
    }

    @Override // p067l.AbstractC8286, p067l.InterfaceC3751
    public final int getValue() {
        C5584 c5584;
        if (mo7247() == 3 && (c5584 = this.f18027) != null) {
            return c5584.m12359();
        }
        return super.getValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15875(int i) {
        this.f21938 = i;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m15878(int i) {
        if (i != 3 && this.f18027 != null) {
            this.f18027 = null;
        }
        this.f21935 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m15877(int i) {
        this.f21936 = i;
    }

    @Override // p067l.AbstractC8286, p067l.InterfaceC3751
    /* JADX INFO: renamed from: ܿۧ */
    public final C5584 mo7251() {
        C5584 c5584 = this.f18027;
        if (c5584 != null) {
            return c5584;
        }
        throw new RuntimeException("stringItem == null");
    }

    @Override // p067l.AbstractC8286
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11799 mo3907() {
        return (C10949) super.mo3907();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15876(String str, C23198[] c23198Arr) {
        this.f18027 = ((C10949) super.mo3907()).mo16869().m34278(str, c23198Arr);
        this.f21935 = 3;
    }

    @Override // p067l.AbstractC8286, p067l.InterfaceC3751
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC6434 mo3908() {
        return (C10278) super.mo3908();
    }

    @Override // p067l.AbstractC8286, p067l.InterfaceC3751
    public final C20337 getEntry() {
        return (C20337) super.getEntry();
    }

    @Override // p067l.AbstractC8286, p067l.InterfaceC3751
    public final InterfaceC22528 getEntry() {
        return (C20337) super.getEntry();
    }

    @Override // p067l.InterfaceC3751
    /* JADX INFO: renamed from: ᩷֫ */
    public final int mo3909() {
        C20337 c20337 = (C20337) super.getEntry();
        int iMo31471 = c20337.mo31471();
        for (int i = 0; i < iMo31471; i++) {
            if (c20337.getValue(i) == this) {
                return i;
            }
        }
        return -1;
    }
}
