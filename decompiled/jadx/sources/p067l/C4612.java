package p067l;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5VZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4612 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Map.Entry) obj).getKey().toString().compareTo(((Map.Entry) obj2).getKey().toString());
    }
}
