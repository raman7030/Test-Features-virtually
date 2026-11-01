package p067l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.᩹ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B5S9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23363 extends AbstractList {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14645 f74463;

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0) {
            C14645 c14645 = this.f74463;
            if (i < c14645.f41812) {
                if (c14645.f41824) {
                    return c14645.f41811.m44080(c14645, i);
                }
                return new C5472(c14645, i);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public C23363(C14645 c14645) {
        this.f74463 = c14645;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f74463.f41812;
    }
}
