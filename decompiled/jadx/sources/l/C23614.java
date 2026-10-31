package l;

import java.util.Comparator;

/* JADX INFO: renamed from: l.᩻ۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23614 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return (int) ((((C17970) obj2).f56045.lastUpdateTime / 1000) - (((C17970) obj).f56045.lastUpdateTime / 1000));
    }
}
