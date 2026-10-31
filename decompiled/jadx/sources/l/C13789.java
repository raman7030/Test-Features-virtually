package l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13789 implements BinaryOperator {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C17167.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        AbstractC5698 abstractC5698 = (AbstractC5698) obj;
        AbstractC5698 abstractC5699 = (AbstractC5698) obj2;
        C14163 c14163 = (C14163) abstractC5699;
        abstractC5698.getClass();
        for (AbstractC5698 abstractC56910 = abstractC5698; abstractC56910.f17559 != EnumC1296.f4579; abstractC56910 = abstractC56910.f17561) {
            if (abstractC56910 == c14163) {
                return abstractC5698;
            }
        }
        return abstractC5699;
    }
}
