package p067l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20741 implements BinaryOperator {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C18684.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        C7524 c7524 = (C7524) obj;
        c7524.f19757 = c7524.f19760.m19420(c7524.f19757, ((C7524) obj2).f19757, c7524.f19759);
        return c7524;
    }
}
