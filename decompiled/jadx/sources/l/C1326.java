package l;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֨᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8H5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1326 implements InterfaceC13571 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C16142 f4776;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f4777;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashMap f4778;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long[] f4779;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Map f4780;

    public C1326(C16142 c16142, HashMap map, HashMap map2, HashMap map3) {
        this.f4776 = c16142;
        this.f4777 = map2;
        this.f4778 = map3;
        this.f4780 = C20195.unmodifiableMap(map);
        this.f4779 = c16142.m38066();
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo4659(long j) {
        long[] jArr = this.f4779;
        int iM11012 = C3603.m11012(jArr, j, false);
        if (iM11012 < jArr.length) {
            return iM11012;
        }
        return -1;
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo4658() {
        return this.f4779.length;
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo4660(int i) {
        return this.f4779[i];
    }

    @Override // l.InterfaceC13571
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List mo4661(long j) {
        return this.f4776.m38062(j, this.f4780, this.f4777, this.f4778);
    }
}
