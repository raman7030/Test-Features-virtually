package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.֡۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2634 implements Function {
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
        C7524 c7524 = (C7524) obj;
        return c7524.f19758 ? c7524.f19760.m19405(c7524.f19757) : c7524.f19757;
    }
}
