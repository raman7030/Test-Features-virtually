package l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C59 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8681 implements BinaryOperator {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C17167.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        C3742 c3742 = (C3742) obj;
        c3742.addAll((C3742) obj2);
        return c3742;
    }
}
