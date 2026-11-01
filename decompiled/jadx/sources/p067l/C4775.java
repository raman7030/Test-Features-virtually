package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۖ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes2.dex */
public final class C4775 extends AbstractC21520 {

    /* JADX INFO: renamed from: ᩸ */
    public int f10828 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Iterator[] f10829;

    public C4775(Iterator[] itArr) {
        this.f10829 = itArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10828 < this.f10829.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f10828;
        Iterator[] itArr = this.f10829;
        Iterator it = itArr[i];
        C12826.requireNonNull(it);
        int i2 = this.f10828;
        itArr[i2] = null;
        this.f10828 = i2 + 1;
        return it;
    }
}
