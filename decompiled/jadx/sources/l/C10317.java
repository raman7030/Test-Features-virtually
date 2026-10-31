package l;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ۤ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10317 {
    public static void $default$replaceAll(List list, UnaryOperator unaryOperator) {
        C11003.requireNonNull(unaryOperator);
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            listIterator.set(unaryOperator.apply(listIterator.next()));
        }
    }

    public static void $default$sort(List list, Comparator comparator) {
        Object[] array = list.toArray();
        Arrays.sort(array, comparator);
        ListIterator listIterator = list.listIterator();
        for (Object obj : array) {
            listIterator.next();
            listIterator.set(obj);
        }
    }

    public static InterfaceC15234 $default$spliterator(List list) {
        if (list instanceof RandomAccess) {
            return new C13118(list);
        }
        return C22291.spliterator(list, 16);
    }
}
