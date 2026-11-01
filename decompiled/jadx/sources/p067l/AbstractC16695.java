package p067l;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ܶ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 365W */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16695 extends AbstractSequentialList {

    /* JADX INFO: renamed from: ᩶ */
    public final int f49171;

    /* JADX INFO: renamed from: ᩸ */
    public final C14645 f49172;

    /* JADX INFO: renamed from: ᩹ */
    public final int f49173;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo24840(C20168 c20168, int i);

    public AbstractC16695(C14645 c14645, int i, int i2) {
        this.f49172 = c14645;
        this.f49173 = i;
        this.f49171 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49171;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C9991(this, this.f49172, this.f49173, this.f49171);
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C9991 c9991 = new C9991(this, this.f49172, this.f49173, this.f49171);
        for (int i2 = 0; i2 < i; i2++) {
            c9991.next();
        }
        return c9991;
    }
}
