package l;

import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۢۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AHS */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9431 implements BiFunction {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C17167.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        C2375 c2375 = (C2375) obj2;
        if (c2375 == null || System.currentTimeMillis() - c2375.f7583 > 10000) {
            return new C2375();
        }
        c2375.f7583 = System.currentTimeMillis();
        return c2375;
    }
}
