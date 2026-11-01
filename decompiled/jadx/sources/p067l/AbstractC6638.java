package p067l;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E63W */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6638 extends AbstractSet {

    /* JADX INFO: renamed from: ᩶ */
    public final int f17126;

    /* JADX INFO: renamed from: ᩸ */
    public final C14645 f17127;

    /* JADX INFO: renamed from: ᩹ */
    public final int f17128;

    /* JADX INFO: renamed from: ֫ */
    public abstract C17998 mo7738(C20168 c20168);

    public AbstractC6638(C14645 c14645, int i, int i2) {
        this.f17127 = c14645;
        this.f17128 = i;
        this.f17126 = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C21391(this, this.f17127, this.f17128, this.f17126);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f17126;
    }
}
