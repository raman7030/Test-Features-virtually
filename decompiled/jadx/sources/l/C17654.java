package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17654 implements Function {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13813 f54020;

    public /* synthetic */ C17654(C13813 c13813) {
        this.f54020 = c13813;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        C3046 c3046 = this.f54020.f37150;
        c3046.getClass();
        return c3046.m9315(EnumC10932.f32946, (C22442) obj);
    }
}
