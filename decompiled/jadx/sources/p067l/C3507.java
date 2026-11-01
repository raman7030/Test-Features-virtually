package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.֨ܶۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7EO */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3507 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C10213 c10213 = (C10213) obj;
        C10213 c10214 = (C10213) obj2;
        if (c10213.m23809() != c10214.m23809()) {
            return c10213.m23809() ? -1 : 1;
        }
        return c10213.m23810().compareTo(c10214.m23810());
    }
}
