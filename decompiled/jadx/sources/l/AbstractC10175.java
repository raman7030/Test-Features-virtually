package l;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 19M0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10175 extends AbstractList implements List {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract Object mo25533(int i);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract int mo25534();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo25533(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo25534();
    }
}
