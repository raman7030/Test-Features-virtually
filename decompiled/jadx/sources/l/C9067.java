package l;

import android.util.SparseArray;

/* JADX INFO: renamed from: l.ۡᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9067 implements InterfaceC21830 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f27491 = new SparseArray();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC6950 f27492;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC21830 f27493;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f27494;

    public C9067(InterfaceC21830 interfaceC21830, InterfaceC6950 interfaceC6950) {
        this.f27493 = interfaceC21830;
        this.f27492 = interfaceC6950;
    }

    @Override // l.InterfaceC21830
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19383 mo3429(int i, int i2) {
        InterfaceC21830 interfaceC21830 = this.f27493;
        if (i2 != 3) {
            this.f27494 = true;
            return interfaceC21830.mo3429(i, i2);
        }
        SparseArray sparseArray = this.f27491;
        C2717 c2717 = (C2717) sparseArray.get(i);
        if (c2717 != null) {
            return c2717;
        }
        C2717 c2718 = new C2717(interfaceC21830.mo3429(i, i2), this.f27492);
        sparseArray.put(i, c2718);
        return c2718;
    }

    @Override // l.InterfaceC21830
    /* JADX INFO: renamed from: ܳ */
    public final void mo3431() {
        this.f27493.mo3431();
        if (!this.f27494) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f27491;
            if (i >= sparseArray.size()) {
                return;
            }
            ((C2717) sparseArray.valueAt(i)).m8452();
            i++;
        }
    }

    @Override // l.InterfaceC21830
    /* JADX INFO: renamed from: ֫ */
    public final void mo3430(InterfaceC9505 interfaceC9505) {
        this.f27493.mo3430(interfaceC9505);
    }
}
