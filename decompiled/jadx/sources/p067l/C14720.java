package p067l;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.۬۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14720 extends AbstractC14050 implements RandomAccess {

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC14050 f41968;

    /* JADX INFO: renamed from: ᩸ */
    public int f41969;

    /* JADX INFO: renamed from: ᩹ */
    public final int f41970;

    public C14720(AbstractC14050 abstractC14050, int i, int i2) {
        this.f41968 = abstractC14050;
        this.f41970 = i;
        C21427.m48556(i, i2, abstractC14050.mo16197());
        this.f41969 = i2 - i;
    }

    @Override // p067l.AbstractC23438
    /* JADX INFO: renamed from: ۧ */
    public final int mo16197() {
        return this.f41969;
    }

    @Override // p067l.AbstractC14050, java.util.List
    public final List subList(int i, int i2) {
        C21427.m48556(i, i2, this.f41969);
        int i3 = this.f41970;
        return new C14720(this.f41968, i + i3, i3 + i2);
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f41969;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C19768.m44907("index: ", i, i2, ", size: "));
        }
        return this.f41968.get(this.f41970 + i);
    }
}
