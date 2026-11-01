package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5XG */
/* JADX INFO: loaded from: classes3.dex */
public final class C14931 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C14261 f42633;

    /* JADX INFO: renamed from: ᩸ */
    public final int f42634;

    /* JADX INFO: renamed from: ᩹ */
    public int f42635;

    public C14931(C14261 c14261) {
        this.f42633 = c14261;
        long j = c14261.f34241;
        this.f42634 = j == 0 ? 0 : (int) (c14261.f34239 / j);
        this.f42635 = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f42635 < this.f42634;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f42635;
        this.f42635 = i + 1;
        C14261 c14261 = this.f42633;
        return new C5544(c14261.f34237, c14261, (int) ((((long) i) * c14261.f34241) + c14261.f34238));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
