package l;

import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21401 implements Function, BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function b;
    public final /* synthetic */ Function c;

    public /* synthetic */ C21401(Function function, Function function2, int i) {
        this.a = i;
        this.b = function;
        this.c = function2;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C17873.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        switch (this.a) {
            case 0:
                break;
        }
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 0:
                break;
        }
        return C20696.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return this.c.apply(this.b.apply(obj));
            default:
                return this.b.apply(this.c.apply(obj));
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        Set set = C22976.a;
        Object objApply = this.b.apply(obj2);
        Object objRequireNonNull = C11003.requireNonNull(this.c.apply(obj2));
        Object objPutIfAbsent = C13843.putIfAbsent((Map) obj, objApply, objRequireNonNull);
        if (objPutIfAbsent != null) {
            throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", objApply, objPutIfAbsent, objRequireNonNull));
        }
    }
}
