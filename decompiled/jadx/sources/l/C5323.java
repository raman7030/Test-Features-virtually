package l;

import java.util.AbstractList;

/* JADX INFO: renamed from: l.ۚۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes2.dex */
public final class C5323 extends AbstractList {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16603;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16604;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13788 f16605;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f16606;

    public C5323(C13788 c13788, int i, int i2, int i3) {
        this.f16605 = c13788;
        this.f16606 = i;
        this.f16603 = i2;
        this.f16604 = i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i < 0 || i >= this.f16606) {
            throw new IndexOutOfBoundsException();
        }
        C13788 c13788 = this.f16605;
        boolean z = c13788.f41106;
        int i2 = this.f16604;
        int i3 = this.f16603;
        if (z) {
            return new C4617(c13788, (i * i2) + i3);
        }
        return new C20140(c13788, (i * i2) + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16606;
    }
}
