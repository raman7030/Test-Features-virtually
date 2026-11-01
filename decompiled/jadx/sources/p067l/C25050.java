package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 65Y3 */
/* JADX INFO: loaded from: classes.dex */
public final class C25050 implements Iterable, Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public int f79938 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC8957 f79939;

    public C25050(AbstractC8957 abstractC8957) {
        this.f79939 = abstractC8957;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        this.f79938 = 0;
        return this;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f79938;
            AbstractC8957 abstractC8957 = this.f79939;
            if (i > abstractC8957.mo4715()) {
                return false;
            }
            if (abstractC8957.mo4718(this.f79938)) {
                return true;
            }
            this.f79938++;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f79938;
        this.f79938 = i + 1;
        InterfaceC22528 interfaceC22528Mo4717 = this.f79939.mo4717(i);
        C12826.requireNonNull(interfaceC22528Mo4717);
        return interfaceC22528Mo4717;
    }
}
