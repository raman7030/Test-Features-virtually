package l;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۖۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes3.dex */
public class C2471 extends C8821 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((NavigableMap) ((C15875) this).f26890).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return ((NavigableMap) ((C15875) this).f26890).firstKey();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return ((NavigableMap) ((C15875) this).f26890).lastKey();
    }
}
