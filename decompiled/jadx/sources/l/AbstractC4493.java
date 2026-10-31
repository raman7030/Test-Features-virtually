package l;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E63W */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4493 extends AbstractSet {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f14299;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12918 f14300;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f14301;

    /* JADX INFO: renamed from: ֫ */
    public abstract C16446 mo5508(C18729 c18729);

    public AbstractC4493(C12918 c12918, int i, int i2) {
        this.f14300 = c12918;
        this.f14301 = i;
        this.f14299 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C20016(this, this.f14300, this.f14301, this.f14299);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14299;
    }
}
