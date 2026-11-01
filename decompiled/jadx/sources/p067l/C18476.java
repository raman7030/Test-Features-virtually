package p067l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܽ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18476 implements Function {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C15496 f55207;

    public /* synthetic */ C18476(C15496 c15496) {
        this.f55207 = c15496;
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
        return this.f55207.f40167.m11354((String) obj);
    }
}
