package l;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܰۙܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2OZ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13593 implements Iterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16374 f40535;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f40536;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f40537;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f40538;

    /* JADX INFO: renamed from: ۧ */
    public abstract Object mo16340(int i);

    public AbstractC13593(C16374 c16374) {
        this.f40535 = c16374;
        this.f40538 = c16374.f50371;
        this.f40537 = c16374.isEmpty() ? -1 : 0;
        this.f40536 = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40537 >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C16374 c16374 = this.f40535;
        if (c16374.f50371 == this.f40538) {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f40537;
            this.f40536 = i;
            Object objMo16340 = mo16340(i);
            this.f40537 = c16374.m38564(this.f40537);
            return objMo16340;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C16374 c16374 = this.f40535;
        if (c16374.f50371 == this.f40538) {
            C4025.m12115("no calls to next() since the last call to remove()", this.f40536 >= 0);
            this.f40538 += 32;
            c16374.remove(C16374.m38543(c16374, this.f40536));
            this.f40537--;
            this.f40536 = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
