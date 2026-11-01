package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۗۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5XL */
/* JADX INFO: loaded from: classes2.dex */
public final class C5222 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C14609 c14609 = (C14609) obj;
        C14609 c146010 = (C14609) obj2;
        int size = c146010.f41700.size() - c14609.f41700.size();
        return size == 0 ? c146010.f41699.size() - c14609.f41699.size() : size;
    }
}
