package p067l;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8150 {
    public static /* synthetic */ void sort(List list, Comparator comparator) {
        if (list instanceof InterfaceC13515) {
            ((InterfaceC13515) list).sort(comparator);
        } else {
            C12174.$default$sort(list, comparator);
        }
    }

    public static /* synthetic */ InterfaceC16847 spliterator(List list) {
        return list instanceof InterfaceC13515 ? ((InterfaceC13515) list).spliterator() : C12174.$default$spliterator(list);
    }
}
