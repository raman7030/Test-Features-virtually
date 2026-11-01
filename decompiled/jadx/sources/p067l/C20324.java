package p067l;

/* JADX INFO: renamed from: l.ᩴܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F62O */
/* JADX INFO: loaded from: classes5.dex */
public class C20324 extends AbstractC4901 {

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC8924 f62784;

    /* JADX INFO: renamed from: ܽ */
    public C20324 f62785;

    /* JADX INFO: renamed from: ᩳ */
    public int f62787 = -1;

    /* JADX INFO: renamed from: ܿ */
    public int f62786 = -1;

    /* JADX INFO: renamed from: ۧ */
    public int f62783 = -1;

    public C20324() {
    }

    public C20324(InterfaceC8924 interfaceC8924) {
        this.f62784 = interfaceC8924;
    }

    @Override // p067l.InterfaceC23676
    /* JADX INFO: renamed from: ܿ */
    public final C20324 mo45888() {
        C20324 c20324 = new C20324();
        c20324.f62787 = -1;
        c20324.f62786 = -1;
        c20324.f62783 = -1;
        c20324.f62784 = this.f62784;
        c20324.f62787 = this.f62787;
        c20324.f62786 = this.f62786;
        return c20324;
    }

    @Override // p067l.AbstractC4901, p067l.InterfaceC23676
    /* JADX INFO: renamed from: ᩳ */
    public boolean mo10401() {
        return this.f62784 == null;
    }

    @Override // p067l.InterfaceC23676
    public int getType() {
        InterfaceC8924 interfaceC8924 = this.f62784;
        if (interfaceC8924 == null) {
            return 0;
        }
        return interfaceC8924.getType();
    }

    @Override // p067l.InterfaceC23676
    public String getText() {
        InterfaceC8924 interfaceC8924 = this.f62784;
        if (interfaceC8924 == null) {
            return null;
        }
        return interfaceC8924.getText();
    }

    @Override // p067l.AbstractC4901, p067l.InterfaceC23676
    public final int getLine() {
        InterfaceC8924 interfaceC8924 = this.f62784;
        if (interfaceC8924 == null || interfaceC8924.getLine() == 0) {
            if (getChildCount() > 0) {
                return mo10396(0).getLine();
            }
            return 0;
        }
        return interfaceC8924.getLine();
    }

    @Override // p067l.AbstractC4901, p067l.InterfaceC23676
    /* JADX INFO: renamed from: ֫ */
    public final int mo10395() {
        InterfaceC8924 interfaceC8924 = this.f62784;
        if (interfaceC8924 == null || interfaceC8924.mo12370() == -1) {
            if (getChildCount() > 0) {
                return mo10396(0).mo10395();
            }
            return 0;
        }
        return interfaceC8924.mo12370();
    }

    @Override // p067l.InterfaceC23676
    /* JADX INFO: renamed from: ܳ */
    public final int mo45885() {
        InterfaceC8924 interfaceC8924;
        int i = this.f62787;
        return (i != -1 || (interfaceC8924 = this.f62784) == null) ? i : interfaceC8924.mo12375();
    }

    @Override // p067l.InterfaceC23676
    /* JADX INFO: renamed from: ܽ */
    public final void mo45887(int i) {
        this.f62787 = i;
    }

    @Override // p067l.InterfaceC23676
    /* JADX INFO: renamed from: ܽ */
    public final int mo45886() {
        InterfaceC8924 interfaceC8924;
        int i = this.f62786;
        return (i != -1 || (interfaceC8924 = this.f62784) == null) ? i : interfaceC8924.mo12375();
    }

    @Override // p067l.InterfaceC23676
    /* JADX INFO: renamed from: ۧ */
    public final void mo45884(int i) {
        this.f62786 = i;
    }

    @Override // p067l.AbstractC4901, p067l.InterfaceC23676
    /* JADX INFO: renamed from: ۧ */
    public final int mo10398() {
        return this.f62783;
    }

    @Override // p067l.AbstractC4901, p067l.InterfaceC23676
    public final InterfaceC23676 getParent() {
        return this.f62785;
    }

    @Override // p067l.AbstractC4901, p067l.InterfaceC23676
    /* JADX INFO: renamed from: ۧ */
    public final void mo10399(InterfaceC23676 interfaceC23676) {
        this.f62785 = (C20324) interfaceC23676;
    }

    @Override // p067l.AbstractC4901, p067l.InterfaceC23676
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10400(int i) {
        this.f62783 = i;
    }

    public String toString() {
        if (mo10401()) {
            return "nil";
        }
        if (getType() == 0) {
            return "<errornode>";
        }
        InterfaceC8924 interfaceC8924 = this.f62784;
        if (interfaceC8924 == null) {
            return null;
        }
        return interfaceC8924.getText();
    }
}
