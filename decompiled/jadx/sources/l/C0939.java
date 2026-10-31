package l;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֨ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0939 implements BinaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparator b;

    public /* synthetic */ C0939(Comparator comparator, int i) {
        this.a = i;
        this.b = comparator;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 0:
                break;
        }
        return C17167.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return this.b.compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return this.b.compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }
}
