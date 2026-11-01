package p067l;

import java.util.Vector;

/* JADX INFO: renamed from: l.۠᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87YT */
/* JADX INFO: loaded from: classes3.dex */
public final class C10369 implements InterfaceC3663 {

    /* JADX INFO: renamed from: ֫ */
    public Vector f28705 = new Vector();

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC3663 f28706;

    public C10369(InterfaceC3663 interfaceC3663) {
        this.f28706 = interfaceC3663;
    }

    @Override // p067l.InterfaceC3663
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4139(byte[] bArr) {
        return this.f28706.mo4139(bArr);
    }

    @Override // p067l.InterfaceC3663
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4141(byte[] bArr) {
        return this.f28706.mo4141(bArr);
    }

    @Override // p067l.InterfaceC3663
    /* JADX INFO: renamed from: ۧ */
    public final void mo4140() {
        this.f28705.removeAllElements();
        this.f28706.mo4140();
    }

    @Override // p067l.InterfaceC3663
    /* JADX INFO: renamed from: ֫ */
    public final Vector mo4137() {
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            Vector vector2 = this.f28705;
            if (i >= vector2.size()) {
                break;
            }
            vector.add((InterfaceC2992) vector2.elementAt(i));
            i++;
        }
        Vector vectorMo4137 = this.f28706.mo4137();
        for (int i2 = 0; i2 < vectorMo4137.size(); i2++) {
            vector.add((InterfaceC2992) vectorMo4137.elementAt(i2));
        }
        return vector;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24007(InterfaceC2992 interfaceC2992) {
        if (!interfaceC2992.mo5031() && (interfaceC2992 instanceof C7687)) {
            try {
                this.f28706.mo4139(((C7687) interfaceC2992).m17802().mo9931());
            } catch (C14392 unused) {
            }
        } else {
            this.f28705.addElement(interfaceC2992);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m24008() {
        Vector vector = this.f28705;
        if (vector.size() > 0) {
            for (Object obj : vector.toArray()) {
                InterfaceC2992 interfaceC2992 = (InterfaceC2992) obj;
                vector.removeElement(interfaceC2992);
                m24007(interfaceC2992);
            }
        }
    }
}
