package l;

import java.util.Vector;

/* JADX INFO: renamed from: l.۠᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87YT */
/* JADX INFO: loaded from: classes3.dex */
public final class C8418 implements InterfaceC1362 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Vector f25791 = new Vector();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC1362 f25792;

    public C8418(InterfaceC1362 interfaceC1362) {
        this.f25792 = interfaceC1362;
    }

    @Override // l.InterfaceC1362
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1741(byte[] bArr) {
        return this.f25792.mo1741(bArr);
    }

    @Override // l.InterfaceC1362
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo1743(byte[] bArr) {
        return this.f25792.mo1743(bArr);
    }

    @Override // l.InterfaceC1362
    /* JADX INFO: renamed from: ۧ */
    public final void mo1742() {
        this.f25791.removeAllElements();
        this.f25792.mo1742();
    }

    @Override // l.InterfaceC1362
    /* JADX INFO: renamed from: ֫ */
    public final Vector mo1739() {
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            Vector vector2 = this.f25791;
            if (i >= vector2.size()) {
                break;
            }
            vector.add((InterfaceC0656) vector2.elementAt(i));
            i++;
        }
        Vector vectorMo1739 = this.f25792.mo1739();
        for (int i2 = 0; i2 < vectorMo1739.size(); i2++) {
            vector.add((InterfaceC0656) vectorMo1739.elementAt(i2));
        }
        return vector;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22037(InterfaceC0656 interfaceC0656) {
        if (!interfaceC0656.mo2692() && (interfaceC0656 instanceof C5596)) {
            try {
                this.f25792.mo1741(((C5596) interfaceC0656).m15881().mo7883());
            } catch (C12651 unused) {
            }
        } else {
            this.f25791.addElement(interfaceC0656);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22038() {
        Vector vector = this.f25791;
        if (vector.size() > 0) {
            for (Object obj : vector.toArray()) {
                InterfaceC0656 interfaceC0656 = (InterfaceC0656) obj;
                vector.removeElement(interfaceC0656);
                m22037(interfaceC0656);
            }
        }
    }
}
