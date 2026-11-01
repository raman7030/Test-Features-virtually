package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܿۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19KT */
/* JADX INFO: loaded from: classes4.dex */
public final class C18672 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public int f55742 = 0;

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC22144 f55743 = m42486();

    /* JADX INFO: renamed from: ᩸ */
    public final C14192 f55744;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC20132 f55745;

    public C18672(byte[] bArr, InterfaceC20132 interfaceC20132) {
        this.f55744 = new C14192(bArr);
        this.f55745 = interfaceC20132;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f55743 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC22144 abstractC22144 = this.f55743;
        if (abstractC22144 == null) {
            throw new NoSuchElementException();
        }
        this.f55743 = m42486();
        return abstractC22144;
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC22144 m42486() {
        C14192 c14192 = this.f55744;
        AbstractC22144 abstractC22144 = null;
        while (abstractC22144 == null) {
            try {
                int i = this.f55742;
                if (i == -1) {
                    break;
                }
                c14192.m28122(i);
                abstractC22144 = (AbstractC22144) this.f55745.mo5891(c14192);
                int iM49953 = (int) abstractC22144.m49953();
                if (iM49953 == 0) {
                    this.f55742 = -1;
                } else {
                    this.f55742 += iM49953;
                }
            } catch (C14862 e) {
                throw new C12776(e);
            }
        }
        return abstractC22144;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
