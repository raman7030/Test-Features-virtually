package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۡᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes3.dex */
public final class C9064 implements Iterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16118 f27481;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C16118 f27482;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterator f27483;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f27484 = false;

    public C9064(C16118 c16118, C16118 c16119) {
        this.f27481 = c16118;
        this.f27482 = c16119;
        this.f27483 = c16119.f49661.iterator();
    }

    @Override // java.util.Iterator
    public final C19648 next() {
        if (!this.f27484) {
            Iterator it = this.f27483;
            if (it.hasNext()) {
                return (C19648) it.next();
            }
            this.f27484 = true;
        }
        C16118 c16118 = this.f27482;
        if (c16118.f49662.hasNext()) {
            InterfaceC21848 interfaceC21848 = (InterfaceC21848) c16118.f49662.next();
            C16118 c16119 = this.f27481;
            C1302 c1302 = c16119.f49660;
            C1302 c1303 = c16119.f49660;
            C19648 c19648 = new C19648(interfaceC21848, c1302.f4637, c1302.f4638, c1302.f4639, EnumC10637.f32009.m26686(c1303.f4638), c1303, c1303.f4645);
            c16118.f49661.add(c19648);
            return c19648;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z = this.f27484;
        C16118 c16118 = this.f27482;
        if (z) {
            return c16118.f49662.hasNext();
        }
        return this.f27483.hasNext() || c16118.f49662.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
