package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۘܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: V7EY */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6223 implements Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo56417andThen(Function function) {
        return C22038.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C22038.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return Short.toString(((C22987) obj).f50138);
    }
}
