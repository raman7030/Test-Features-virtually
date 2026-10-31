package l;

import java.util.Vector;

/* JADX INFO: renamed from: l.֡ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7ZU */
/* JADX INFO: loaded from: classes2.dex */
public final class C0325 implements InterfaceC1362 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Vector f1714 = new Vector();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22529 f1715;

    @Override // l.InterfaceC1362
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized Vector mo1739() {
        Vector vector;
        m1738();
        vector = new Vector();
        for (int i = 0; i < this.f1714.size(); i++) {
            vector.addElement((InterfaceC0656) this.f1714.elementAt(i));
        }
        return vector;
    }

    @Override // l.InterfaceC1362
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo1742() {
        for (int i = 0; i < this.f1714.size(); i++) {
            ((InterfaceC0656) this.f1714.elementAt(i)).clear();
        }
        this.f1714.removeAllElements();
    }

    @Override // l.InterfaceC1362
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean mo1743(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (int i = 0; i < this.f1714.size(); i++) {
            InterfaceC0656 interfaceC0656 = (InterfaceC0656) this.f1714.elementAt(i);
            byte[] bArrMo2690 = interfaceC0656.mo2690();
            if (bArrMo2690 != null && C19356.m44591(bArr, bArrMo2690)) {
                this.f1714.removeElement(interfaceC0656);
                interfaceC0656.clear();
                return true;
            }
        }
        return false;
    }

    public C0325(C22529 c22529) {
        this.f1715 = c22529;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m1740(InterfaceC0656 interfaceC0656) {
        if (!this.f1714.contains(interfaceC0656)) {
            C5596 c5596 = (C5596) interfaceC0656;
            byte[] bArrMo2690 = c5596.mo2690();
            if (bArrMo2690 == null) {
                this.f1714.addElement(interfaceC0656);
                return;
            }
            for (int i = 0; i < this.f1714.size(); i++) {
                byte[] bArrMo2691 = ((InterfaceC0656) this.f1714.elementAt(i)).mo2690();
                if (bArrMo2691 != null && C19356.m44591(bArrMo2690, bArrMo2691)) {
                    if (c5596.mo2692() || !((InterfaceC0656) this.f1714.elementAt(i)).mo2692()) {
                        return;
                    } else {
                        mo1743(bArrMo2691);
                    }
                }
            }
            this.f1714.addElement(interfaceC0656);
        }
    }

    @Override // l.InterfaceC1362
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean mo1741(byte[] bArr) {
        try {
            m1740(C5596.m15880(this.f1715, "from remote:", bArr));
        } catch (C12651 unused) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m1738() {
        Vector vector = new Vector();
        Vector vector2 = this.f1714;
        int size = vector2.size();
        if (size == 0) {
            return;
        }
        for (int i = 0; i < size; i++) {
            InterfaceC0656 interfaceC0656 = (InterfaceC0656) vector2.elementAt(i);
            byte[] bArrMo2690 = interfaceC0656.mo2690();
            if (bArrMo2690 != null) {
                for (int i2 = i + 1; i2 < size; i2++) {
                    InterfaceC0656 interfaceC0657 = (InterfaceC0656) vector2.elementAt(i2);
                    byte[] bArrMo2691 = interfaceC0657.mo2690();
                    if (bArrMo2691 != null && C19356.m44591(bArrMo2690, bArrMo2691) && interfaceC0656.mo2692() == interfaceC0657.mo2692()) {
                        vector.addElement(bArrMo2690);
                        break;
                    }
                }
            }
        }
        for (int i3 = 0; i3 < vector.size(); i3++) {
            mo1743((byte[]) vector.elementAt(i3));
        }
    }
}
