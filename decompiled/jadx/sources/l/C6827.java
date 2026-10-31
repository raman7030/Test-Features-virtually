package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.ۜܳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1ES */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6827 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C21916 c21916 = (C21916) obj;
        C21916 c21917 = (C21916) obj2;
        int iCompare = Integer.compare(c21916.f70168, c21917.f70168);
        return iCompare != 0 ? iCompare : Integer.compare(c21917.f70167, c21916.f70167);
    }
}
