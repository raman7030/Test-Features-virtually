package p067l;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֨ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3261 implements BinaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6340a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Comparator f6341b;

    public /* synthetic */ C3261(Comparator comparator, int i) {
        this.f6340a = i;
        this.f6341b = comparator;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f6340a) {
            case 0:
                break;
        }
        return C18684.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f6340a) {
            case 0:
                return this.f6341b.compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return this.f6341b.compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }
}
