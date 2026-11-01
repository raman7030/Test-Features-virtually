package p067l;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩴ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R4U5 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20050 extends AbstractSet {
    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo18930(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C5968(this);
    }
}
