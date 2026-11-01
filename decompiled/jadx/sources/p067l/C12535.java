package p067l;

import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧ֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 770P */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12535 implements BiFunction {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C18684.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return Integer.valueOf(((Integer) obj2).intValue() + ((Integer) obj).intValue());
    }
}
