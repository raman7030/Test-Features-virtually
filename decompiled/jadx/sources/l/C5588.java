package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NAX7 */
/* JADX INFO: loaded from: classes2.dex */
public class C5588 implements Iterable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final char f17300 = (char) C23467.m51904(1, 0, 1);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f17301 = 1;

    public final char getLast() {
        return this.f17300;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1354(this.f17300, this.f17301);
    }
}
