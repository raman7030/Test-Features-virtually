package p067l;

import android.util.SparseArray;

/* JADX INFO: renamed from: l.ۡᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K8JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10986 implements InterfaceC23116 {

    /* JADX INFO: renamed from: ۙ */
    public final SparseArray f30428 = new SparseArray();

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC8974 f30429;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC23116 f30430;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f30431;

    public C10986(InterfaceC23116 interfaceC23116, InterfaceC8974 interfaceC8974) {
        this.f30430 = interfaceC23116;
        this.f30429 = interfaceC8974;
    }

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20790 mo5732(int i, int i2) {
        InterfaceC23116 interfaceC23116 = this.f30430;
        if (i2 != 3) {
            this.f30431 = true;
            return interfaceC23116.mo5732(i, i2);
        }
        SparseArray sparseArray = this.f30428;
        C4951 c4951 = (C4951) sparseArray.get(i);
        if (c4951 != null) {
            return c4951;
        }
        C4951 c4952 = new C4951(interfaceC23116.mo5732(i, i2), this.f30429);
        sparseArray.put(i, c4952);
        return c4952;
    }

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ܳ */
    public final void mo5734() {
        this.f30430.mo5734();
        if (!this.f30431) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f30428;
            if (i >= sparseArray.size()) {
                return;
            }
            ((C4951) sparseArray.valueAt(i)).m10499();
            i++;
        }
    }

    @Override // p067l.InterfaceC23116
    /* JADX INFO: renamed from: ֫ */
    public final void mo5733(InterfaceC11402 interfaceC11402) {
        this.f30430.mo5733(interfaceC11402);
    }
}
