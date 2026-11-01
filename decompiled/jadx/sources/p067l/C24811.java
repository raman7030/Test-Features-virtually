package p067l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩻ۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24811 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return (int) ((((C19447) obj2).f59242.lastUpdateTime / 1000) - (((C19447) obj).f59242.lastUpdateTime / 1000));
    }
}
