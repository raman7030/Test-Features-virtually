package p067l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܰۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15473 implements BinaryOperator {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C18684.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        AbstractC7783 abstractC7783 = (AbstractC7783) obj;
        AbstractC7783 abstractC7784 = (AbstractC7783) obj2;
        C15828 c15828 = (C15828) abstractC7784;
        abstractC7783.getClass();
        for (AbstractC7783 abstractC7785 = abstractC7783; abstractC7785.f20405 != EnumC3600.f7351; abstractC7785 = abstractC7785.f20407) {
            if (abstractC7785 == c15828) {
                return abstractC7783;
            }
        }
        return abstractC7784;
    }
}
