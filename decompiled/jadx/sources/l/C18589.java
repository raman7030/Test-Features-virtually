package l;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18589 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) ((Map.Entry) obj).getKey()).compareTo(((Map.Entry) obj2).getKey());
    }
}
