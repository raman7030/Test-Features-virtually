package l;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ܶ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 365W */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15075 extends AbstractSequentialList {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f46053;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12918 f46054;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f46055;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo22869(C18729 c18729, int i);

    public AbstractC15075(C12918 c12918, int i, int i2) {
        this.f46054 = c12918;
        this.f46055 = i;
        this.f46053 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46053;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C8021(this, this.f46054, this.f46055, this.f46053);
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        C8021 c8021 = new C8021(this, this.f46054, this.f46055, this.f46053);
        for (int i2 = 0; i2 < i; i2++) {
            c8021.next();
        }
        return c8021;
    }
}
