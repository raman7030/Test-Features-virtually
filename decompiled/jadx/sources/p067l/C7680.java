package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAX7 */
/* JADX INFO: loaded from: classes2.dex */
public class C7680 implements Iterable {

    /* JADX INFO: renamed from: ᩸ */
    public final char f20144 = (char) C24671.m54306(1, 0, 1);

    /* JADX INFO: renamed from: ᩹ */
    public final int f20145 = 1;

    public final char getLast() {
        return this.f20144;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3656(this.f20144, this.f20145);
    }
}
