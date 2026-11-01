package p067l;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۖۤܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes3.dex */
public class C4717 extends C10752 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((NavigableMap) ((C17456) this).f29815).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return ((NavigableMap) ((C17456) this).f29815).firstKey();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return ((NavigableMap) ((C17456) this).f29815).lastKey();
    }
}
