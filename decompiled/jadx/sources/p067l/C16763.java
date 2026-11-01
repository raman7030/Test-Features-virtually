package p067l;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܶۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB82 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16763 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
    }
}
