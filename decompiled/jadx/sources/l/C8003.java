package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۠ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8003 extends AbstractC15057 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5886 f24709;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f24710;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f24711 = 0;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24711 < this.f24710;
    }

    @Override // l.InterfaceC4475
    public final byte nextByte() {
        int i = this.f24711;
        if (i >= this.f24710) {
            throw new NoSuchElementException();
        }
        this.f24711 = i + 1;
        return this.f24709.mo16498(i);
    }

    public C8003(AbstractC5886 abstractC5886) {
        this.f24709 = abstractC5886;
        this.f24710 = abstractC5886.size();
    }
}
