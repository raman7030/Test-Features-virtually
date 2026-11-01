package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۠᩵ */
/* JADX INFO: compiled from: G58P */
/* JADX INFO: loaded from: classes3.dex */
public final class C1257 implements Iterator {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ AbstractC1082 f28596;

    /* JADX INFO: renamed from: ۙ */
    public int f28597;

    /* JADX INFO: renamed from: ᩶ */
    public final int f28598;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f28599 = false;

    /* JADX INFO: renamed from: ᩹ */
    public int f28600;

    public C1257(AbstractC1082 abstractC1082, int i) {
        this.f28596 = abstractC1082;
        this.f28598 = i;
        this.f28597 = abstractC1082.mo14309();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f28600 < this.f28597;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objMo14302 = this.f28596.mo14302(this.f28600, this.f28598);
        this.f28600++;
        this.f28599 = true;
        return objMo14302;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f28599) {
            throw new IllegalStateException();
        }
        int i = this.f28600 - 1;
        this.f28600 = i;
        this.f28597--;
        this.f28599 = false;
        this.f28596.mo14305(i);
    }
}
