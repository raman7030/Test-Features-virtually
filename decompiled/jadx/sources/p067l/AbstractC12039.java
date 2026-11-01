package p067l;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 19M0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12039 extends AbstractList implements List {
    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo27553(int i);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo27554();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo27553(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo27554();
    }
}
