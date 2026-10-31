package l;

import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 36B9 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17317 implements Iterable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BitSet f53026;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53027;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20846 f53028;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53029;

    public /* synthetic */ C17317(C20846 c20846, int i, int i2, BitSet bitSet) {
        this.f53028 = c20846;
        this.f53029 = i;
        this.f53027 = i2;
        this.f53026 = bitSet;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C20846 c20846 = this.f53028;
        C12918 c12918 = c20846.f67489;
        int i = this.f53029;
        return new C14494(c20846, c12918, i, this.f53027, this.f53026, i);
    }
}
