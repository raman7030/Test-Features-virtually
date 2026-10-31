package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۖ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5ZF */
/* JADX INFO: loaded from: classes2.dex */
public final class C2532 extends AbstractC20151 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f8037 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator[] f8038;

    public C2532(Iterator[] itArr) {
        this.f8038 = itArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8037 < this.f8038.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f8037;
        Iterator[] itArr = this.f8038;
        Iterator it = itArr[i];
        C11003.requireNonNull(it);
        int i2 = this.f8037;
        itArr[i2] = null;
        this.f8037 = i2 + 1;
        return it;
    }
}
