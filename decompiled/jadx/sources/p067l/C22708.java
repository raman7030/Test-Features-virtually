package p067l;

import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22708 implements Function, BiConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71597a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function f71598b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function f71599c;

    public /* synthetic */ C22708(Function function, Function function2, int i) {
        this.f71597a = i;
        this.f71598b = function;
        this.f71599c = function2;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return C19355.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        switch (this.f71597a) {
            case 0:
                break;
        }
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        switch (this.f71597a) {
            case 0:
                break;
        }
        return C22038.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.f71597a) {
            case 0:
                return this.f71599c.apply(this.f71598b.apply(obj));
            default:
                return this.f71598b.apply(this.f71599c.apply(obj));
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        Set set = C24205.f76714a;
        Object objApply = this.f71598b.apply(obj2);
        Object objRequireNonNull = C12826.requireNonNull(this.f71599c.apply(obj2));
        Object objPutIfAbsent = C15525.putIfAbsent((Map) obj, objApply, objRequireNonNull);
        if (objPutIfAbsent != null) {
            throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", objApply, objPutIfAbsent, objRequireNonNull));
        }
    }
}
