package l;

import java.util.Comparator;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: l.ۨ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC11728 extends InterfaceC1144 {
    void replaceAll(UnaryOperator unaryOperator);

    void sort(Comparator comparator);

    @Override // java.lang.Iterable, java.util.List, l.InterfaceC11728, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    InterfaceC15234 spliterator();
}
