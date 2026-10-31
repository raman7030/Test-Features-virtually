package l;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6083 {
    public static /* synthetic */ void sort(List list, Comparator comparator) {
        if (list instanceof InterfaceC11728) {
            ((InterfaceC11728) list).sort(comparator);
        } else {
            C10317.$default$sort(list, comparator);
        }
    }

    public static /* synthetic */ InterfaceC15234 spliterator(List list) {
        return list instanceof InterfaceC11728 ? ((InterfaceC11728) list).spliterator() : C10317.$default$spliterator(list);
    }
}
