package l;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22416 implements BinaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ BiConsumer b;

    public /* synthetic */ C22416(BiConsumer biConsumer, int i) {
        this.a = i;
        this.b = biConsumer;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return C17167.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                this.b.accept(obj, obj2);
                break;
            case 1:
                this.b.accept(obj, obj2);
                break;
            default:
                this.b.accept(obj, obj2);
                break;
        }
        return obj;
    }
}
