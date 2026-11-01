package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۡᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes3.dex */
public final class C10983 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C17687 f30419;

    /* JADX INFO: renamed from: ᩶ */
    public C17687 f30420;

    /* JADX INFO: renamed from: ᩸ */
    public Iterator f30421;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f30422 = false;

    public C10983(C17687 c17687, C17687 c17688) {
        this.f30419 = c17687;
        this.f30420 = c17688;
        this.f30421 = c17688.f52827.iterator();
    }

    @Override // java.util.Iterator
    public final C21042 next() {
        if (!this.f30422) {
            Iterator it = this.f30421;
            if (it.hasNext()) {
                return (C21042) it.next();
            }
            this.f30422 = true;
        }
        C17687 c17687 = this.f30420;
        if (c17687.f52828.hasNext()) {
            InterfaceC23133 interfaceC23133 = (InterfaceC23133) c17687.f52828.next();
            C17687 c17688 = this.f30419;
            C3606 c3606 = c17688.f52826;
            C3606 c3607 = c17688.f52826;
            C21042 c21042 = new C21042(interfaceC23133, c3606.f7409, c3606.f7410, c3606.f7411, EnumC12477.f34980.m28726(c3607.f7410), c3607, c3607.f7417);
            c17687.f52827.add(c21042);
            return c21042;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z = this.f30422;
        C17687 c17687 = this.f30420;
        if (z) {
            return c17687.f52828.hasNext();
        }
        return this.f30421.hasNext() || c17687.f52828.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
