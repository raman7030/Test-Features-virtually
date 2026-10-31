package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܰܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C13885 implements Comparator, Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) ((Map.Entry) obj).getKey()).compareTo(((Map.Entry) obj2).getKey());
    }
}
