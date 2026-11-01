package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۠ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9974 extends AbstractC16678 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AbstractC7962 f27623;

    /* JADX INFO: renamed from: ᩸ */
    public final int f27624;

    /* JADX INFO: renamed from: ᩹ */
    public int f27625 = 0;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27625 < this.f27624;
    }

    @Override // p067l.InterfaceC6621
    public final byte nextByte() {
        int i = this.f27625;
        if (i >= this.f27624) {
            throw new NoSuchElementException();
        }
        this.f27625 = i + 1;
        return this.f27623.mo18424(i);
    }

    public C9974(AbstractC7962 abstractC7962) {
        this.f27623 = abstractC7962;
        this.f27624 = abstractC7962.size();
    }
}
