package p067l;

import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۢۜ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AHS */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11332 implements BiFunction {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C18684.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        C4626 c4626 = (C4626) obj2;
        if (c4626 == null || System.currentTimeMillis() - c4626.f10374 > 10000) {
            return new C4626();
        }
        c4626.f10374 = System.currentTimeMillis();
        return c4626;
    }
}
