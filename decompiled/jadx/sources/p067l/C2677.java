package p067l;

import java.util.Vector;

/* JADX INFO: renamed from: l.֡ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7ZU */
/* JADX INFO: loaded from: classes2.dex */
public final class C2677 implements InterfaceC3663 {

    /* JADX INFO: renamed from: ֫ */
    public Vector f4490 = new Vector();

    /* JADX INFO: renamed from: ۧ */
    public C23780 f4491;

    @Override // p067l.InterfaceC3663
    /* JADX INFO: renamed from: ֫ */
    public final synchronized Vector mo4137() {
        Vector vector;
        m4136();
        vector = new Vector();
        for (int i = 0; i < this.f4490.size(); i++) {
            vector.addElement((InterfaceC2992) this.f4490.elementAt(i));
        }
        return vector;
    }

    @Override // p067l.InterfaceC3663
    /* JADX INFO: renamed from: ۧ */
    public final synchronized void mo4140() {
        for (int i = 0; i < this.f4490.size(); i++) {
            ((InterfaceC2992) this.f4490.elementAt(i)).clear();
        }
        this.f4490.removeAllElements();
    }

    @Override // p067l.InterfaceC3663
    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean mo4141(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (int i = 0; i < this.f4490.size(); i++) {
            InterfaceC2992 interfaceC2992 = (InterfaceC2992) this.f4490.elementAt(i);
            byte[] bArrMo5029 = interfaceC2992.mo5029();
            if (bArrMo5029 != null && C20764.m46885(bArr, bArrMo5029)) {
                this.f4490.removeElement(interfaceC2992);
                interfaceC2992.clear();
                return true;
            }
        }
        return false;
    }

    public C2677(C23780 c23780) {
        this.f4491 = c23780;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m4138(InterfaceC2992 interfaceC2992) {
        if (!this.f4490.contains(interfaceC2992)) {
            C7687 c7687 = (C7687) interfaceC2992;
            byte[] bArrMo5029 = c7687.mo5029();
            if (bArrMo5029 == null) {
                this.f4490.addElement(interfaceC2992);
                return;
            }
            for (int i = 0; i < this.f4490.size(); i++) {
                byte[] bArrMo50210 = ((InterfaceC2992) this.f4490.elementAt(i)).mo5029();
                if (bArrMo50210 != null && C20764.m46885(bArrMo5029, bArrMo50210)) {
                    if (c7687.mo5031() || !((InterfaceC2992) this.f4490.elementAt(i)).mo5031()) {
                        return;
                    } else {
                        mo4141(bArrMo50210);
                    }
                }
            }
            this.f4490.addElement(interfaceC2992);
        }
    }

    @Override // p067l.InterfaceC3663
    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean mo4139(byte[] bArr) {
        try {
            m4138(C7687.m17801(this.f4491, "from remote:", bArr));
        } catch (C14392 unused) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m4136() {
        Vector vector = new Vector();
        Vector vector2 = this.f4490;
        int size = vector2.size();
        if (size == 0) {
            return;
        }
        for (int i = 0; i < size; i++) {
            InterfaceC2992 interfaceC2992 = (InterfaceC2992) vector2.elementAt(i);
            byte[] bArrMo5029 = interfaceC2992.mo5029();
            if (bArrMo5029 != null) {
                for (int i2 = i + 1; i2 < size; i2++) {
                    InterfaceC2992 interfaceC2993 = (InterfaceC2992) vector2.elementAt(i2);
                    byte[] bArrMo50210 = interfaceC2993.mo5029();
                    if (bArrMo50210 != null && C20764.m46885(bArrMo5029, bArrMo50210) && interfaceC2992.mo5031() == interfaceC2993.mo5031()) {
                        vector.addElement(bArrMo5029);
                        break;
                    }
                }
            }
        }
        for (int i3 = 0; i3 < vector.size(); i3++) {
            mo4141((byte[]) vector.elementAt(i3));
        }
    }
}
