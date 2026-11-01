package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19147 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C15496 f57213;

    public /* synthetic */ C19147(C15496 c15496) {
        this.f57213 = c15496;
    }

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
        C5263 c5263 = this.f57213.f40167;
        c5263.getClass();
        return c5263.m11357(EnumC12758.f35924, (C23697) obj);
    }
}
