package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟ۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: ZARU */
/* JADX INFO: loaded from: classes2.dex */
public final class C9300 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C4330 f25286;

    /* JADX INFO: renamed from: ᩸ */
    public final Object[] f25288;

    /* JADX INFO: renamed from: ᩹ */
    public int f25289 = 0;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f25287 = true;

    public C9300(C4330 c4330, Object[] objArr) {
        this.f25286 = c4330;
        this.f25288 = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25289 < this.f25288.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f25287 = false;
        int i = this.f25289;
        this.f25289 = i + 1;
        return this.f25288[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f25287) {
            throw new IllegalStateException();
        }
        this.f25286.remove(this.f25288[this.f25289 - 1]);
        this.f25287 = true;
    }
}
