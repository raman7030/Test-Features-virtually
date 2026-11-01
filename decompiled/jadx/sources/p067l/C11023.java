package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۡ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 07KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C11023 implements Iterator {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f30536;

    /* JADX INFO: renamed from: ᩸ */
    public int f30537 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC17727 f30538;

    public C11023(AbstractC17727 abstractC17727, int i) {
        this.f30538 = abstractC17727;
        this.f30536 = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30537 < this.f30536;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f30537;
        this.f30537 = i + 1;
        return this.f30538.getName(i);
    }
}
