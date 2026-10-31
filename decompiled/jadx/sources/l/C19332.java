package l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19332 implements BinaryOperator {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C17167.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        C5425 c5425 = (C5425) obj;
        c5425.f16916 = c5425.f16919.m17480(c5425.f16916, ((C5425) obj2).f16916, c5425.f16918);
        return c5425;
    }
}
