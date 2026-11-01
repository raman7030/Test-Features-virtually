package p067l;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23673 implements BinaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f75368a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BiConsumer f75369b;

    public /* synthetic */ C23673(BiConsumer biConsumer, int i) {
        this.f75368a = i;
        this.f75369b = biConsumer;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.f75368a) {
            case 0:
                break;
            case 1:
                break;
        }
        return C18684.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f75368a) {
            case 0:
                this.f75369b.accept(obj, obj2);
                break;
            case 1:
                this.f75369b.accept(obj, obj2);
                break;
            default:
                this.f75369b.accept(obj, obj2);
                break;
        }
        return obj;
    }
}
