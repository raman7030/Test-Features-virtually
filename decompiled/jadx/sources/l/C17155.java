package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܿۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19KT */
/* JADX INFO: loaded from: classes4.dex */
public final class C17155 implements Iterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52559 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC20808 f52560 = m40241();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12441 f52561;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC18691 f52562;

    public C17155(byte[] bArr, InterfaceC18691 interfaceC18691) {
        this.f52561 = new C12441(bArr);
        this.f52562 = interfaceC18691;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f52560 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC20808 abstractC20808 = this.f52560;
        if (abstractC20808 == null) {
            throw new NoSuchElementException();
        }
        this.f52560 = m40241();
        return abstractC20808;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC20808 m40241() {
        C12441 c12441 = this.f52561;
        AbstractC20808 abstractC20808 = null;
        while (abstractC20808 == null) {
            try {
                int i = this.f52559;
                if (i == -1) {
                    break;
                }
                c12441.m26097(i);
                abstractC20808 = (AbstractC20808) this.f52562.mo3620(c12441);
                int iM47625 = (int) abstractC20808.m47625();
                if (iM47625 == 0) {
                    this.f52559 = -1;
                } else {
                    this.f52559 += iM47625;
                }
            } catch (C13146 e) {
                throw new C10951(e);
            }
        }
        return abstractC20808;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
