package l;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: l.۬۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12996 extends AbstractC12291 implements RandomAccess {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC12291 f38921;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f38922;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f38923;

    public C12996(AbstractC12291 abstractC12291, int i, int i2) {
        this.f38921 = abstractC12291;
        this.f38923 = i;
        C20053.m46240(i, i2, abstractC12291.mo14300());
        this.f38922 = i2 - i;
    }

    @Override // l.AbstractC22169
    /* JADX INFO: renamed from: ۧ */
    public final int mo14300() {
        return this.f38922;
    }

    @Override // l.AbstractC12291, java.util.List
    public final List subList(int i, int i2) {
        C20053.m46240(i, i2, this.f38922);
        int i3 = this.f38923;
        return new C12996(this.f38921, i + i3, i3 + i2);
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f38922;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C18307.m42646("index: ", i, i2, ", size: "));
        }
        return this.f38921.get(this.f38923 + i);
    }
}
