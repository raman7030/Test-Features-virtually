package p067l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩷ܶ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: L42O */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22283 implements BinaryOperator {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f70408;

    public /* synthetic */ C22283(int i) {
        this.f70408 = i;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return C18684.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f70408) {
            case 0:
                C20271 c20271 = (C20271) obj;
                c20271.addAll((C20271) obj2);
                return c20271;
            default:
                C20539 c20539 = (C20539) obj;
                c20539.m46360(c20539.size(), (C20539) obj2);
                return c20539;
        }
    }
}
