package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۗۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3003 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C12880 c12880 = (C12880) obj;
        C12880 c12881 = (C12880) obj2;
        int size = c12881.f38657.size() - c12880.f38657.size();
        return size == 0 ? c12881.f38656.size() - c12880.f38656.size() : size;
    }
}
