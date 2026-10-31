package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۟ۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: ZARU */
/* JADX INFO: loaded from: classes2.dex */
public final class C7294 implements Iterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2064 f22395;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object[] f22397;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f22398 = 0;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f22396 = true;

    public C7294(C2064 c2064, Object[] objArr) {
        this.f22395 = c2064;
        this.f22397 = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22398 < this.f22397.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f22396 = false;
        int i = this.f22398;
        this.f22398 = i + 1;
        return this.f22397[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f22396) {
            throw new IllegalStateException();
        }
        this.f22395.remove(this.f22397[this.f22398 - 1]);
        this.f22396 = true;
    }
}
